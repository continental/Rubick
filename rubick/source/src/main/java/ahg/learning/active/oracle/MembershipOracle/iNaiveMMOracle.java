package ahg.learning.active.oracle.MembershipOracle;

import java.io.File;
import java.io.IOException;

import java.lang.reflect.Method;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import net.openhft.compiler.CompilerUtils;

import net.automatalib.words.Word;
import net.automatalib.automata.fsa.impl.compact.CompactNFA;

import de.learnlib.api.oracle.MembershipOracle.DFAMembershipOracle;

import ahg.learning.metainfo.iMetaInfo;

import ahg.harness.Result;
import ahg.harness.Generator;

import ahg.harness.cfg.nfa.iNFA;
import ahg.harness.cfg.api.iAPIFunc;
import ahg.harness.cfg.alphabet.iAlphabet;
import ahg.harness.cfg.alphabet.letter.iConstraintLetter;

public class iNaiveMMOracle extends iAbstractMMOracle implements DFAMembershipOracle<Character> {

	/* this is the full or shrinked alphabet, used in harness generation */
	private iAlphabet alphabet = null;
	private List<CompactNFA<Character>> peNFAs = null;
	private List<Pattern> nePatterns = null;
	private HashMap<Character, String> condMinPrefixes = null;
	private boolean removeNoiseEvents = false;

	private String workDir = null;
	private String outNfa = null;

	public iNaiveMMOracle(String _wd, iAlphabet _al, List<CompactNFA<Character>> nfas, List<Pattern> patterns, boolean _removeNoiseEvents, String _stage) {
		if (_stage.equals("tinker")) {
			isTinkerStage = true;
			isMergeStage = false;
		} else if (_stage.equals("merge")) {
			isTinkerStage = false;
			isMergeStage = true;
		} else {
			throw new RuntimeException("not any know stage: " + _stage);
		}

		alphabet = _al;
		peNFAs = nfas;
		nePatterns = patterns;
		condMinPrefixes = new HashMap<>();
		removeNoiseEvents = _removeNoiseEvents;

		workDir = _wd;
		outNfa = Paths.get(workDir, ".tempNfa.txt").toAbsolutePath().toString();
	}

	public boolean checkNegativePattern(Word<Character> word, String str) {
		// // in naive mm oracle, we use regexes to represents negative example string patterns
		// for (Pattern p : nePatterns) {
		// 	Matcher m = p.matcher(str);
		// 	if (m.matches()) {
		// 		return Boolean.FALSE;
		// 	}
		// }

		/* check the string doesn't break any assumption for being a trace of a satisfing harness */
		int dataflowStartCount = 0;
		String prefix = "";

		Set<Character> satisfied = new HashSet<>();
		List<Character> eventList = word.asList();
		for (int i = 0; i < eventList.size(); i++) {
			Character e = eventList.get(i);
			prefix = prefix + Character.toString(e);

			if (dataflowStartEvents.contains(e)) {
				dataflowStartCount += 1;
				if (dataflowStartCount > 1) {
					/* add errorString to cache */
					negativeCache.add(prefix);
					return false;
				}
			}

			if (requiredPairs.containsKey(e)) {
				if (satisfied.contains(e)) {
					satisfied.remove(e);
				} else {
					negativeCache.add(prefix);
					return false;
				}
			}

			if (satisfyTable.containsKey(e)) {
				satisfied.addAll(satisfyTable.get(e));
			}
			
		}

		return true;
	}

	public boolean matchPENFAs(Word<Character> word, String str) {
		// the pe nfas are extracted from example programs
		List<Character> wd = word.asList();
		for (CompactNFA<Character> peNFA : peNFAs) {

			if (isTinkerStage) {
				if (removeNoiseEvents) {
					boolean matched = iNFA.customizedMatch(peNFA, noiseEvents, wd);
					if (matched) {
					 	return true;
					}
				} else {
					if (peNFA.accepts(word)) {
			 			return true;
					}
				}

			} else if (isMergeStage) {
				if (peNFA.accepts(word)) {
			 		return true;
				}

			} else {
				throw new RuntimeException("impossible case");

			}
		}

		return false;
	}

	public void addCondTriggerredPrefix(String executedSeq) {
		for (int i = 1; i < executedSeq.length(); i++) {
			Character c = executedSeq.charAt(i);
			if (alphabet.getLetter(c) instanceof iConstraintLetter) {
				String oldPrefix = condMinPrefixes.get(c);
				String prefix = executedSeq.substring(0, i);

				if ((oldPrefix == null) || (oldPrefix.length() > prefix.length())) {
					System.out.println("Char '" + c + "' has prefix: " + prefix);
					condMinPrefixes.put(c, prefix);
				}
			}
		}
	}

	public boolean canReplaceCondPrefix(Character condC) {
		// return condMinPrefixes.containsKey(condC);
		return false;
	}

	public String replaceCondPrefix(String oriStr, Character condC, String partialSeq) {
		String prefix = condMinPrefixes.get(condC);
		int wholeLen = oriStr.length();
		int partLen = partialSeq.length();
		return prefix + oriStr.substring(partLen - 1, wholeLen);
	}

	public boolean doDynamicValidation(Word<Character> word, String str) {
		/* dynamic validation (this also checks data dependency dynamically) */
		try {

			HashMap<Integer, String> sIDMap = new HashMap<>();
			CompactNFA<Character> nfa = iNFA.createNFAOfAString(alphabet.getAlphabet(), str, sIDMap);
			// for debug use
			// iNFA.dumpNFAToFile(nfa, outNfa);

			/* execute the harness */
			Result rslt = (Result) funcToRunString.invoke(null, alphabet, nfa, apiFuncs, sIDMap, inputFiles);

			System.out.println("dynamic validating " + str);
			if (rslt.failed) {
				System.out.println("Failed dynamic validation: \"" + str + "\" : " + rslt.eventSeq);

				if (rslt.eventSeq.length() > 1) {
					/* record the prefix which can trigger a specific cond event */
					addCondTriggerredPrefix(rslt.eventSeq.substring(0, rslt.eventSeq.length() - 1));
				}
				/* add errorString to cache */
				negativeCache.add(rslt.eventSeq);
				return false;

			} else if (rslt.partial) {
				// not failed but partial => cond not triggered
				if (rslt.eventSeq.length() > 1) {
					/* record the prefix which can trigger a specific cond event */
					addCondTriggerredPrefix(rslt.eventSeq.substring(0, rslt.eventSeq.length() - 1));
				}

				Character notTriggeredC = rslt.eventSeq.charAt(rslt.eventSeq.length() - 1);
				if (canReplaceCondPrefix(notTriggeredC)) {
					String newStr = replaceCondPrefix(str, notTriggeredC, rslt.eventSeq);
					Word<Character> newWord = Word.fromString(newStr);

					System.out.println("Partial: replace the \"" + str + "\" as " + "\"" + newStr + "\" to verify again");
					return processOne(newWord, newStr);

				} else {
					// TODO: this can be improved by only matching the sequence after notTriggeredC
					//       , but N.B. we don't add purely guessed result into cache
					//       , they may be truely verified by dynamic validation later
					boolean matched = matchPENFAs(word, str);
					if (matched)
						System.out.println("Partial: no replacable prefix but successfully match PENFAs");
					else
						System.out.println("Partial: no replacable prefix and failed to match PENFAs");

					return matched;

				}

			} else {
				System.out.println("Passed dynamic validation: \"" + str + "\"");
				return true;

			}

		} catch (Throwable t) {
			t.printStackTrace();
			System.out.println("catched throwable t:" + t);
			throw new RuntimeException(t.toString());

		}

	}

	private static String[] inputFiles = null;
	private static Method funcToRunString = null;
	private static HashMap<Character, iAPIFunc> apiFuncs = null;
	private static HashMap<Character, Set<Character>> requiredPairs = null;
	private static HashMap<Character, Set<Character>> satisfyTable = null;
	private static Set<Character> dataflowStartEvents = null;
	public static Set<Character> noiseEvents = null;

	/* this function only needs to be executed once */
	public static void initMqOracleCommons(String _wd, iMetaInfo _apiMeta, iAlphabet _al, boolean removeNoiseEvents, String stage, String inputSeedsDir) {
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

		// init harness related (generate & compile & load code, meta etc)
		apiFuncs = new HashMap<>();

		try {
			String outApiFuncs = Paths.get(_wd, "apifuncs.json").toAbsolutePath().toString();
			String outHarness = Paths.get(_wd, "Harness.java").toAbsolutePath().toString();

			String harnessCode = Generator.generateMetaAndCode(_apiMeta, _al, apiFuncs, outHarness);
			iAPIFunc.dumpAPIFuncsToJSON(apiFuncs, outApiFuncs);

			// compile
			Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava("com.fuzz.Fuzzer", harnessCode);

			// load
			CompactNFA<Character> fakeNfa = iNFA.createEmptyNFA(_al.getAlphabet());
			HashMap<Integer, String> fakesIDMap = new HashMap<>();
			funcToRunString = aClass.getMethod("inMemoryRunAString", _al.getClass(), fakeNfa.getClass(), apiFuncs.getClass(), fakesIDMap.getClass(), inputFiles.getClass());

		} catch (Throwable t) {
			t.printStackTrace();
			System.out.println("On-the-fly compilation & load error:" + t);
			throw new RuntimeException(t.toString());

		}

		// init cache
		negativeCache = new HashSet<>();

		// init required pairs of cond events
		requiredPairs = new HashMap<>();

		_al.getAlias2Letter().forEach((c, l) -> {
			if (l instanceof iConstraintLetter) {
				// System.out.println("cond letter: " + c);
				Set<String> refreshConDefFuncSigs = ((iConstraintLetter) l).getRefreshCondDefsSigs();
				for (String fSig : refreshConDefFuncSigs) {
					Character fc = _al.getFuncAlias(fSig);

					Set<Character> pairing = requiredPairs.get(c);
					if (pairing == null)
						pairing = new HashSet<>();
					
					pairing.add(fc);
					requiredPairs.put(c, pairing);
				}
			}
		});

		satisfyTable = new HashMap<>();
		requiredPairs.forEach((k, vs) -> {
			for (Character v : vs) {
				Set<Character> set = satisfyTable.get(v);
				if (set == null)
					set = new HashSet<>();

				set.add(k);
				satisfyTable.put(v, set);
			}
		});
		// System.out.println("satisfyTable " + satisfyTable);

		// init dataflow starting events
		dataflowStartEvents = new HashSet<>();
		_apiMeta.getDataDeps().forEach((dep) -> {
			if (dep.frmFuncSig.equals("input")) {
				Character oneStartEvent = _al.getFuncAlias(dep.toFuncSig);
				dataflowStartEvents.add(oneStartEvent);
			}
		});

		// init epsilon events
		noiseEvents = new HashSet<>();
		if (removeNoiseEvents && stage.equals("tinker")) {
			apiFuncs.forEach((c, af) -> {
				Set<String> vars = af.getAPIOutVars();
				if ((vars == null) || (vars.size() == 0))
					noiseEvents.add(c);
			});
		}

	}

}
