package cmdline.subcommand;

import java.io.IOException;

import java.lang.reflect.Method;

import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import net.openhft.compiler.CompilerUtils;

import ahg.learning.metainfo.iMetaInfo;

import ahg.harness.Result;
import ahg.harness.Generator;

import ahg.harness.cfg.nfa.iNFA;
import ahg.harness.cfg.api.iAPIFunc;
import ahg.harness.cfg.alphabet.iAlphabet;

import net.automatalib.automata.fsa.impl.compact.CompactNFA;

@Parameters(separators = "=", commandDescription = "Command for only generating the harness code")
public class CommandCodeGen {

	@Parameter(names={"-m", "--apimeta"}, description="File name of api meta info", required = true)
   	private String apiMetaFile;

	@Parameter(names={"-a", "--alphabet"}, description="File name of input alphabet", required = true)
   	private String alphabetFile;

	@Parameter(names={"-n", "--nfa-file"}, description="The nfa it wants to try run once", required = true)
   	private String nfaFile;

	@Parameter(names={"-i", "--input-seeds-dir"}, description="The input seeds directory", required = true)
   	private String inputDir;

	@Parameter(names={"-p", "--ctrl-flow-picks"}, description="Control flow picks json file of the nfa", required = true)
   	private String cfPicksJson;

	@Parameter(names={"-o", "--out-dir"}, description="Output directory", required = true)
   	private String outDir;

	@Parameter(names={"-f", "--overwrite-existings"}, description="Overwrite the contents inside the out-dir instead of warning and exiting", required = false)
   	private boolean overwrite = true;

	@Parameter(names={"-F", "--not-shrink-alphabet"}, description="NOT shrink alphabet to only the letters appeared in given nfas", required = false)
   	private boolean shrinkAlphabet = true;

	public void setupOutDir() {
		Path wd = Paths.get(outDir);
		if (Files.exists(wd)) {

			try (Stream<Path> pstream = Files.walk(wd)) {
				List<String> filesInFolder = pstream.filter(Files::isRegularFile)
								.map(Path::toAbsolutePath)
								.map(Path::toString)
								.collect(Collectors.toList());
				
				for (String file : filesInFolder) {
					if (! file.endsWith("log.txt")) {
						if (! overwrite) {
							System.out.println("Outdir " + wd + " is not clean (e.g., " + file + " ), clean or move them first");
							System.exit(1);
						} else {
							System.out.println("Outdir " + wd + " is not clean (e.g., " + file + " ), we might overwrite the contents inside it, use -f to avoid overwritten");
						}
					}
				}

			} catch (Throwable t) {
				throw new RuntimeException("catched new throwable: " + t);
			}

		}

		try {
			Files.createDirectories(wd.toAbsolutePath());
		} catch (IOException ex) {
			System.out.println("catched IOException: " + ex);
			System.exit(1);
		}

	}

	public String[] searchInputFiles(String inputSeedsDir) {
		String [] inputFiles = null;

		// search input seed files
		try (Stream<Path> pstream = Files.walk(Paths.get(inputSeedsDir))) {
			List<String> filesInFolder = pstream.filter(Files::isRegularFile)
							.map(Path::toAbsolutePath)
							.map(Path::toString)
							.collect(Collectors.toList());
			
			int numOfInputs = filesInFolder.size();
			if (numOfInputs == 0) {
				System.out.println("found " + numOfInputs + " input seed files in " + inputSeedsDir);
				System.exit(1);
			}

			inputFiles = new String[numOfInputs];
			filesInFolder.toArray(inputFiles);

			System.out.println("inputFiles are " + filesInFolder);

		} catch (Throwable t) {
			throw new RuntimeException("catched new throwable: " + t);

		}

		return inputFiles;
	}

	public void process() {
		setupOutDir();

		try {
			String[] inputFiles = searchInputFiles(inputDir);

			if (! Files.isRegularFile(Paths.get(cfPicksJson)))
				throw new RuntimeException("the cfPicksJson " + cfPicksJson + " is not a valid file");

			String outApiFuncs = Paths.get(outDir, "apifuncs.json").toAbsolutePath().toString();
			String outHarness = Paths.get(outDir, "Fuzzer.java").toAbsolutePath().toString();

			HashMap<Character, iAPIFunc> apiFuncs = new HashMap<>();
			iMetaInfo apiMeta = iMetaInfo.loadMetaInfoFromFile(apiMetaFile);

			// load nfa early to shrink alphabet
			HashMap<Integer, String> stateIDMap = new HashMap<>();
			iAlphabet alphabet = iAlphabet.createFromFile(alphabetFile);
			CompactNFA<Character> nfa = iNFA.loadOneNFAFromFile(alphabet.getAlphabet(), nfaFile, stateIDMap);
			if (shrinkAlphabet) {
				Set<Character> appearedEvents = iNFA.getAppearedEvents(nfa);
				alphabet = alphabet.createSubIAlphabet(appearedEvents);
			}

			String harnessCode = Generator.generateMetaAndCode(apiMeta, alphabet, apiFuncs, outHarness);
			iAPIFunc.dumpAPIFuncsToJSON(apiFuncs, outApiFuncs);

			// compile
			Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava("com.fuzz.Fuzzer", harnessCode);

			// try load & run once
			Method funcToRunAutomata = aClass.getMethod("inMemoryRunAutomata", alphabet.getClass(), nfa.getClass(), apiFuncs.getClass(), stateIDMap.getClass(), cfPicksJson.getClass(), inputFiles.getClass());

			/* execute the harness */
			Result rslt = (Result) funcToRunAutomata.invoke(null, alphabet, nfa, apiFuncs, stateIDMap, cfPicksJson, inputFiles);
			if (rslt != null) {
				System.out.println("Running this automata meets the following problem: " + rslt);
			}

		} catch (Throwable t) {
			t.printStackTrace();
			// System.out.println("On-the-fly compilation & load error:" + t);
			throw new RuntimeException(t.toString());

		}
	}

}
