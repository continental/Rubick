package cmdline.subcommand;

import java.io.IOException;

import java.util.Set;
import java.util.List;
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
import ahg.learning.active.learning.ExampleActiveLearning;

@Parameters(separators = "=", commandDescription = "Learn automata using active learning algorithm (Lstar)")
public class CommandActiveLearn {

	@Parameter(names={"-m", "--apimeta"}, description="File name of api meta info", required = true)
   	private String apiMetaFile;

	@Parameter(names={"-a", "--alphabet"}, description="File name of input alphabet", required = true)
   	private String alphabet;

	@Parameter(names={"-i", "--input-seeds"}, description="Directory of input seeds used in learning (for dynamic validation)", required = true)
   	private String inputSeeds;

	@Parameter(names={"-p", "--positive"}, description="File/Directory name containing positive patterns", required = true)
	private List<String> positivePatterns = new ArrayList<>();

	@Parameter(names={"-n", "--negative"}, description="File name of negative patterns", required = false)
   	private String negativeFile = null;

	@Parameter(names={"-l", "--learner"}, description="Algorithm of the learner (lstar, ttt)", required = false)
   	private String learnerName = "lstar";

	// @Parameter(names={"-eq", "--eqoracle"}, description="EqOracle of the learner (w, wp, randomw, randomwp)", required = false)
	@Parameter(names={"-eq", "--eqoracle"}, description="EqOracle of the learner (w, wp, iwp)", required = false)
   	private String eqOracleName = "wp";

	@Parameter(names={"-d", "--depth"}, description="Depth of equivalence oracle", required = false)
   	private int depth = 2;

	@Parameter(names = { "-o", "--output-automata-dot" }, description = "dot file path of the learned automata, output to stdout if not specified", required = true)
	private String outAutomataDot;

	@Parameter(names = { "-wd", "--workdir" }, description = "the working directory which holds the temporary files during learning", required = true)
	private String workDir;

	@Parameter(names={"-F", "--not-shrink-alphabet"}, description="NOT shrink alphabet to only the letters appeared in positive patterns", required = false)
   	private boolean shrinkAlphabet = true;

	@Parameter(names={"-N", "--remove-noise-events"}, description="Remove noise events (only effective in tinker mode)", required = false)
   	private boolean removeNoiseEvents = false;

	@Parameter(names={"-s", "--stage"}, description="Possible stages (tinker, merge)", required = true)
   	private String goal = null;

	public void setupWorkDir() {
		Path wd = Paths.get(workDir);
		if (Files.exists(wd)) {

			try (Stream<Path> pstream = Files.walk(wd)) {
				List<String> filesInFolder = pstream.filter(Files::isRegularFile)
								.map(Path::toAbsolutePath)
								.map(Path::toString)
								.collect(Collectors.toList());
				
				for (String file : filesInFolder) {
					if (! file.endsWith("log.txt")) {
						System.out.println("Workdir " + wd + " is not clean (e.g., " + file + " ), clean or move them first");
						System.exit(1);
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

	public Set<String> searchFiles(List<String> patterns) {
		Set<String> files = new HashSet<>();

		for (String pattern : patterns) {
			Path ph = Paths.get(pattern);
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
		setupWorkDir();

		Set<String> positiveFiles = searchFiles(positivePatterns);

        	NaiveActiveLearning.main(workDir, apiMetaFile, alphabet, positiveFiles, negativeFile, outAutomataDot, learnerName, eqOracleName, depth, shrinkAlphabet, removeNoiseEvents, goal, inputSeeds);
	}
}
