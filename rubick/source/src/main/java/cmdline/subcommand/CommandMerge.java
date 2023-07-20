package cmdline.subcommand;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import ahg.learning.active.learning.NaiveActiveLearning;

import ahg.harness.cfg.nfa.iNFA;
import ahg.harness.cfg.alphabet.iAlphabet;

import net.automatalib.automata.fsa.impl.compact.CompactNFA;
import net.automatalib.automata.fsa.impl.compact.CompactDFA;
import net.automatalib.util.automata.fsa.DFAs;
import net.automatalib.util.automata.fsa.NFAs;
import net.automatalib.util.ts.acceptors.AcceptanceCombiner;
import net.automatalib.words.Alphabet;
import net.automatalib.serialization.dot.GraphDOT;


@Parameters(separators = "=", commandDescription = "Command for merging DFAs")
public class CommandMerge {

	@Parameter(names={"-a", "--alphabet"}, description="File name of input alphabet", required = true)
   	private String alphabetFile;

	@Parameter(names={"-d", "--dfafile"}, description="DFA file name", required = true)
	private List<String> _dfaPaths = new ArrayList<>();

	@Parameter(names = { "-o", "--output-dot" }, description = "dot file path of the merged automata, output to stdout if not specified", required = true)
	private String outDotFile;

	public Set<String> searchFiles(List<String> paths) {
		Set<String> files = new HashSet<>();

		for (String path : paths) {
			Path ph = Paths.get(path);
			if (Files.isRegularFile(ph)) {
				files.add(ph.toAbsolutePath().toString());

			} else if (Files.isDirectory(ph)) {

				try (Stream<Path> pstream = Files.walk(ph)) {
					List<String> filesInFolder = pstream.filter(Files::isRegularFile)
									.map(Path::toAbsolutePath)
									.map(Path::toString)
									.collect(Collectors.toList());

					files.addAll(filesInFolder);
				} catch (Throwable t) {
					throw new RuntimeException("catched new throwable: " + t);
				}

			}
		}

		System.out.println("Found files: " + files);
		return files;
	}

	public void process() {
		Set<String> dfaFiles = searchFiles(_dfaPaths);

		try {
			// load nfa early to shrink alphabet
			HashMap<Integer, String> stateIDMap = new HashMap<>();
			iAlphabet alphabet = iAlphabet.createFromFile(alphabetFile);

			CompactDFA<Character> mergedDfa = null;
			Alphabet al = alphabet.getAlphabet();

			// merge

			for (String dfaFile : dfaFiles) {
				CompactNFA<Character> nfa = iNFA.loadOneNFAFromFile(al, dfaFile, stateIDMap);
				if (nfa == null)
					continue;

				CompactDFA<Character> dfa = NFAs.determinize(nfa, al, false, true);

				if (mergedDfa == null) {
					mergedDfa = dfa;

				} else {
					mergedDfa = DFAs.combine(mergedDfa, dfa, al, AcceptanceCombiner.OR);

				}

			}

			// remove trap states
			CompactNFA<Character> resultNoTrapStates = NaiveActiveLearning.removeTrapStates(al, mergedDfa);

			// dump to readable dfa
			Map.Entry<Alphabet<String>, CompactNFA<String>> pair = iNFA.translate2ReadableNFA(alphabet, resultNoTrapStates);
			Alphabet<String> readableAlphabet = pair.getKey();
			CompactNFA<String> readableResult = pair.getValue();

			String outNFATXT = outDotFile + "-nfa.txt";
			iNFA.dumpNFAToFile(resultNoTrapStates, outNFATXT);

			String outFile = outDotFile;
			File fout = new File(outFile);
			FileOutputStream fos = new FileOutputStream(fout);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

			GraphDOT.write(readableResult, readableAlphabet, bw); // may throw IOException!

			bw.close();


		} catch (Throwable t) {
			t.printStackTrace();
			// System.out.println("On-the-fly compilation & load error:" + t);
			throw new RuntimeException(t.toString());

		}
	}

}
