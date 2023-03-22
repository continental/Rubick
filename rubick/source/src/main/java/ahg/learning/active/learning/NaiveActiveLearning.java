package ahg.learning.active.learning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import de.learnlib.algorithms.lstar.dfa.ClassicLStarDFA;
import de.learnlib.algorithms.lstar.dfa.ClassicLStarDFABuilder;
import de.learnlib.algorithms.ttt.dfa.TTTLearnerDFA;
import de.learnlib.algorithms.ttt.dfa.TTTLearnerDFABuilder;
import de.learnlib.api.algorithm.LearningAlgorithm;

import de.learnlib.api.oracle.EquivalenceOracle;
import de.learnlib.oracle.equivalence.DFAEQOracleChain;
import de.learnlib.api.oracle.MembershipOracle.DFAMembershipOracle;
import de.learnlib.api.oracle.EquivalenceOracle.DFAEquivalenceOracle;
import de.learnlib.datastructure.observationtable.writer.ObservationTableASCIIWriter;
import de.learnlib.filter.statistic.oracle.DFACounterOracle;

import de.learnlib.oracle.equivalence.DFAWMethodEQOracle;
import de.learnlib.oracle.equivalence.DFAWpMethodEQOracle;
import de.learnlib.oracle.equivalence.DFARandomWMethodEQOracle;
import de.learnlib.oracle.equivalence.DFARandomWpMethodEQOracle;

import de.learnlib.oracle.membership.SimulatorOracle.DFASimulatorOracle;
import de.learnlib.util.Experiment.DFAExperiment;
import de.learnlib.util.statistics.SimpleProfiler;

import net.automatalib.automata.fsa.DFA;
import net.automatalib.automata.fsa.impl.compact.CompactDFA;
import net.automatalib.automata.fsa.impl.compact.CompactNFA;
import net.automatalib.serialization.dot.GraphDOT;
import net.automatalib.util.automata.builders.AutomatonBuilders;
import net.automatalib.words.Alphabet;
import net.automatalib.words.impl.Alphabets;
import net.automatalib.util.automata.builders.FSABuilder;
import net.automatalib.util.automata.builders.DFABuilder;
import net.automatalib.util.automata.Automata;

import ahg.learning.metainfo.iMetaInfo;
import ahg.learning.active.oracle.MembershipOracle.iNaiveMMOracle;
import ahg.learning.active.oracle.EquivalenceOracle.iNaiveEQOracle;

import ahg.harness.cfg.nfa.iNFA;
import ahg.harness.cfg.alphabet.iAlphabet;

public class NaiveActiveLearning {

	private static List<CompactNFA<Character>> loadNFAs(Alphabet<Character> alphabet, String nfaFile) {
		List<CompactNFA<Character>> nfas = new ArrayList<CompactNFA<Character>>();

		String cnt = "";

		try {
			cnt = new String ( Files.readAllBytes( Paths.get(nfaFile) ) );
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");
		}

		for ( String part : cnt.split("\\$\\$\\$") ) {
			List<String> lines = new ArrayList<String>();
			for ( String line : part.trim().split("\n") ) {
				String _line = line.trim();
				if ( (!_line.isEmpty()) && (!_line.startsWith("#")) ) {
					// if line is not empty line or comment line
					lines.add(_line);
				}
			}

			int size = lines.size();
			if (size == 0) {
				// skip empty nfa configuration
				continue;
			} else if (size <= 3) {
				throw new RuntimeException("wrong nfa configuration");
			}

			FSABuilder<Integer, Character, CompactNFA<Character>> nfaBuilder = AutomatonBuilders.newNFA(alphabet);
			// line 1: name
			// line 2: initials
			for (String s : lines.get(1).split(",")) {
				nfaBuilder.withInitial(s.trim());
			}
			// line 3: finals
			for (String s : lines.get(2).split(",")) {
				nfaBuilder.withAccepting(s.trim());
			}
			// line 3+: transitions
			for (String tran : lines.subList(3, size)) {
				String[] parts = tran.trim().split(",");
				if (parts.length != 3)
					throw new RuntimeException("wrong nfa configuration in transition: " + tran);

				// tran: frm,event,to
				String frm = parts[0].trim();
				String _event = parts[1].trim();
				if (_event.length() != 1)
					throw new RuntimeException("event part length is not 1: " + _event);

				Character event = _event.charAt(0);
				String to = parts[2].trim();

				nfaBuilder.from(frm).on(event).to(to);
			}

			CompactNFA<Character> nfa = nfaBuilder.create();
			nfas.add(nfa);

			// System.out.println("nfa is " + nfa);
			// System.out.println("nfa output " + nfa.computeOutput(Arrays.asList(new Character[]{'a', 'b'})));

			// nfa.forEach( (s) -> {
			// 	System.out.println("for each s is " + s);
			// });
		}

		return nfas;
	}
	
	private static List<Pattern> loadRegexes(String regexFile) {
		List<Pattern> regexes = new ArrayList<Pattern>();

		String cnt = "";

		try {
			cnt = new String ( Files.readAllBytes( Paths.get(regexFile) ) );
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");
		}

		for ( String part : cnt.split("\\$\\$\\$") ) {
			List<String> lines = new ArrayList<String>();
			for ( String line : part.trim().split("\n") ) {
				String _line = line.trim();
				if ( (!_line.isEmpty()) && (!_line.startsWith("#")) ) {
					// if line is not empty line or comment line
					lines.add(_line);
				}
			}

			int size = lines.size();
			if (size == 0) {
				// skip empty regex configuration
				continue;
			} else if (size != 3) {
				throw new RuntimeException("wrong regex configuration");
			}

			// line 1: name
			// line 2: alphabets (ignored currently)
			// line 3: regex
			String ptrnString = lines.get(2);
			regexes.add(Pattern.compile(ptrnString));

			// System.out.println("dfa is " + dfa);
			// System.out.println("dfa output " + dfa.computeOutput(Arrays.asList(new Character[]{'a', 'b'})));

			// dfa.forEach( (s) -> {
			// 	System.out.println("for each s is " + s);
			// });
		}

		return regexes;
	}
	
	public static void test(String negativeFile) {
		String word = "abfd";

		List<Pattern> regexes = loadRegexes(negativeFile);

		for (Pattern p : regexes) {
			Matcher m = p.matcher(word);
			if (m.matches()) {
				System.out.println("word " + word + " matched by " + p);
			}
		}
	}

	public static CompactNFA<Character> removeTrapStates(Alphabet<Character> alphabet, CompactDFA<Character> dfa) {
		// identify trap states
		Set<Integer> trapStates = new HashSet<>();

		for (Integer s : dfa.getStates()) {
			if (! dfa.isAccepting(s)) {
				// not final states & no transitions to other states
				boolean canTran2OtherStates = false;
				for (Character e : dfa.getLocalInputs(s)) {
					for (Integer succ : dfa.getSuccessors(s, e)) {
						if (succ != s)
							canTran2OtherStates = true;
					}
				}

				if (! canTran2OtherStates)
					trapStates.add(s);
			}
		}

		// build dfa without trap states & related transitions
		// wierdly I cannot find dfaBuilder.create, instead I use nfaBuild, it is okay since nfa includes dfa
		FSABuilder<Integer, Character, CompactNFA<Character>> nfaBuilder = AutomatonBuilders.newNFA(alphabet);

		for (Integer s: dfa.getInitialStates()) {
			nfaBuilder.withInitial(s);
		}

		for (Integer s : dfa.getStates()) {
			if (trapStates.contains(s))
				continue;
			
			if (dfa.isAccepting(s))
				nfaBuilder.withAccepting(s);

			for (Character e : dfa.getLocalInputs(s)) {
				for (Integer succ : dfa.getSuccessors(s, e)) {
					if (trapStates.contains(succ))
						continue;
					
					nfaBuilder.from(s).on(e).to(succ);
				}
			}
		}

		CompactNFA<Character> nfaNoTrapState = nfaBuilder.create();
		return nfaNoTrapState;
	}

	public static LearningAlgorithm<? extends DFA<?, Character>, Character, Boolean> learner = null;

	public static void main(String workDir, String apiMetaFile, String alphabetFile, Set<String> positiveFiles, String negativeFile, String outFile, String learnerName, String eqOracleName, int depth, boolean shrinkAlphabet, boolean removeNoiseEvents, String stage, String inputSeeds) {

		// 1. load Alphabet
		iAlphabet fullAl = iAlphabet.createFromFile(alphabetFile);
		iAlphabet al = null;
		iMetaInfo meta = iMetaInfo.loadMetaInfoFromFile(apiMetaFile);

		// 2. parse pe nfas
		List<CompactNFA<Character>> nfas = new ArrayList<>();
		for (String positiveFile : positiveFiles) {
			nfas.addAll(iNFA.loadNFAsFromFile(fullAl.getAlphabet(), positiveFile, null));
		}

		if (nfas.size() == 0) {
			System.out.println("no usable nfa from the given arguments, exit");
			System.exit(1);
		}

		if (shrinkAlphabet) {
			Set<Character> appearedEvents = iNFA.getAppearedEvents(nfas);
			al = fullAl.createSubIAlphabet(appearedEvents);
		} else {
			al = fullAl;
		}

		// 3. parse ne regexes
		List<Pattern> regexes = null;
		if (negativeFile != null)
			regexes = loadRegexes(negativeFile);
		else
			regexes = new ArrayList<>();
		
		System.out.println("regexes: " + regexes);

		// 4. running lstar
		iNaiveMMOracle.initMqOracleCommons(workDir, meta, al, removeNoiseEvents, stage, inputSeeds);
		if (shrinkAlphabet && removeNoiseEvents && stage.equals("tinker")) {
			Set<Character> appearedEvents = iNFA.getAppearedEvents(nfas);
			appearedEvents.removeAll(iNaiveMMOracle.noiseEvents);
			al = al.createSubIAlphabet(appearedEvents);
		}
		Alphabet<Character> alphabet = al.getAlphabet();

		DFAMembershipOracle<Character> sul = new iNaiveMMOracle(workDir, al, nfas, regexes, removeNoiseEvents, stage);
		DFACounterOracle<Character> mqOracle = new DFACounterOracle<>(sul, "membership queries");

		// LearningAlgorithm<? extends DFA<?, Character>, Character, Boolean> learner = null;

		if (learnerName.equals("lstar")) {
			learner = new ClassicLStarDFABuilder<Character>().withAlphabet(alphabet) // input alphabet
                                                .withOracle(mqOracle) // membership oracle
                                                .create();
			System.out.println("Choose learner: lstar");

		} else if (learnerName.equals("ttt")) {
			learner = new TTTLearnerDFABuilder<Character>().withAlphabet(alphabet)
						.withOracle(mqOracle)
						.create();
			System.out.println("Choose learner: ttt");

		} else {
			throw new RuntimeException("Unknown learner name: " + learnerName);

		}

		EquivalenceOracle<? super DFA<?, Character>, Character, Boolean> eqOracle = null;

		if (eqOracleName.equals("wp")) {
			eqOracle = new DFAWpMethodEQOracle<>(mqOracle, depth);
			System.out.println("Choose eqoracle: wpmethod with depth " + depth);

		} else if (eqOracleName.equals("w")) {
			eqOracle = new DFAWMethodEQOracle<>(mqOracle, depth);
			System.out.println("Choose eqoracle: wmethod with depth " + depth);

		// } else if (eqOracleName.equals("randomwp")) {
		// 	eqOracle = new DFARandomWpMethodEQOracle<>(mqOracle, depth);

		// } else if (eqOracleName.equals("randomw")) {
		// 	eqOracle = new DFARandomWMethodEQOracle<>(mqOracle, depth);

		} else if (eqOracleName.equals("iwp")) {
			eqOracle = new DFAEQOracleChain<>(new iNaiveEQOracle(al), new DFAWpMethodEQOracle<>(mqOracle, depth));
			System.out.println("Choose eqoracle chain: ieqoracle + wmethod with depth " + depth);

		} else {
			throw new RuntimeException("Unknown eqOracle name: " + learnerName);

		}

		DFAExperiment<Character> experiment = new DFAExperiment<>(learner, eqOracle, alphabet);

		// turn on time profiling
		experiment.setProfile(true);

		// enable logging of models
		experiment.setLogModels(true);
		
		// run experiment
		experiment.run();
		
		// get learned model
		DFA<?, Character> result = experiment.getFinalHypothesis();
		
		// report results
		System.out.println("-------------------------------------------------------");
		
		// profiling
		System.out.println(SimpleProfiler.getResults());
		
		// learning statistics
		System.out.println(experiment.getRounds().getSummary());
		System.out.println(mqOracle.getStatisticalData().getSummary());
		
		// model statistics
		System.out.println("States: " + result.size());
		System.out.println("Sigma: " + alphabet.size());
		
		// show model
		// System.out.println();
		// System.out.println("Model: ");

		//Automata.invasiveMinimize(( CompactDFA<Character> )result, alphabet);

		if (!shrinkAlphabet) {
			try {
				System.out.println("Dumping full learned automata to " + outFile);

				File fout = new File(outFile);
				FileOutputStream fos = new FileOutputStream(fout);

				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

				GraphDOT.write(result, alphabet, bw); // may throw IOException!

				bw.close();

			} catch (Exception ex) {
				throw new RuntimeException("ERROR: output alphabets: " + ex.getMessage());

			}

		} else {

			System.out.println("Dumping learned automata without trap states to " + outFile);

			CompactNFA<Character> resultNoTrapStates = removeTrapStates(alphabet, (CompactDFA<Character>) result);
			Map.Entry<Alphabet<String>, CompactNFA<String>> pair = iNFA.translate2ReadableNFA(al, resultNoTrapStates);
			Alphabet<String> readableAlphabet = pair.getKey();
			CompactNFA<String> readableResult = pair.getValue();

			try {
				String outNFATXT = outFile + "-nfa.txt";
				iNFA.dumpNFAToFile(resultNoTrapStates, outNFATXT);

				File fout = new File(outFile);
				FileOutputStream fos = new FileOutputStream(fout);

				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

				GraphDOT.write(readableResult, readableAlphabet, bw); // may throw IOException!

				bw.close();

			} catch (Exception ex) {
				throw new RuntimeException("ERROR: output alphabets: " + ex.getMessage());

			}

		}

		// try {
		// 	GraphDOT.write(result, alphabet, System.out); // may throw IOException!
		// 	// GraphDOT.write(_result, alphabet, System.out); // may throw IOException!

		// } catch (Exception ex) {
		// 	throw new RuntimeException("Caught exception: " + ex.getMessage());

		// }
		
		System.out.println("-------------------------------------------------------");
		
		if (learnerName.equals("lstar")) {
			System.out.println("Final observation table:");
			new ObservationTableASCIIWriter<>().write(((ClassicLStarDFA<Character>)learner).getObservationTable(), System.out);
		}
	}

}
