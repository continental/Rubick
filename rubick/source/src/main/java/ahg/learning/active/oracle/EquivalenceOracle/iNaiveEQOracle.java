package ahg.learning.active.oracle.EquivalenceOracle;

import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

import de.learnlib.algorithms.lstar.dfa.ClassicLStarDFA;
import de.learnlib.datastructure.observationtable.writer.ObservationTableASCIIWriter;

import de.learnlib.api.oracle.MembershipOracle.DFAMembershipOracle;
import de.learnlib.api.oracle.EquivalenceOracle.DFAEquivalenceOracle;
import de.learnlib.api.query.DefaultQuery;

import org.checkerframework.checker.nullness.qual.Nullable;

import net.automatalib.words.Word;
import net.automatalib.automata.fsa.DFA;
import net.automatalib.graphs.UniversalGraph;
import net.automatalib.automata.graphs.TransitionEdge;
import net.automatalib.automata.fsa.impl.compact.CompactDFA;
import net.automatalib.automata.fsa.impl.compact.CompactNFA;

import ahg.harness.cfg.alphabet.iAlphabet;
import ahg.harness.cfg.alphabet.letter.iConstraintLetter;

import ahg.learning.active.learning.NaiveActiveLearning;
import ahg.learning.active.oracle.MembershipOracle.iAbstractMMOracle;

public class iNaiveEQOracle implements DFAEquivalenceOracle<Character> {

	private iAlphabet alphabet = null;

	public iNaiveEQOracle(iAlphabet _al) {
		alphabet = _al;
		createFuncCondMap();
	}

	protected String getStringRepresentation(List<Character> list) {    
		StringBuilder builder = new StringBuilder(list.size());
		for(Character ch: list)
			builder.append(ch);

		return builder.toString();
	}

	private HashMap<Character, Set<Character>> func2Conds;
	private HashMap<Character, Set<Character>> cond2Funcs;

	public void createFuncCondMap() {
		func2Conds = new HashMap<>();
		cond2Funcs = new HashMap<>();

		alphabet.getAlias2Letter().forEach((condC, l) -> {
			if (l instanceof iConstraintLetter) {
				Set<String> relatedFuncSigs = ((iConstraintLetter) l).getRelatedFuncSigs();
				for (String fSig : relatedFuncSigs) {
					Character funcC = alphabet.getFuncAlias(fSig);

					Set<Character> set1 = cond2Funcs.get(condC);
					if (set1 == null)
						set1 = new HashSet<>();
					set1.add(funcC);
					cond2Funcs.put(condC, set1);
					
					Set<Character> set2 = func2Conds.get(funcC);
					if (set2 == null)
						set2 = new HashSet<>();
					set2.add(condC);
					func2Conds.put(funcC, set2);
					
				}
			}
		});
	}

	public Set<Character> getRelatedConds(Character funcC) {
		return func2Conds.get(funcC);
	}

	public String traverselyCheck(UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g, Integer nowNode, Set<Integer> visited, List<Character> prefixes) {
		if (visited.contains(nowNode)) {
			/* meets loop */
			return null;
		}

		/* visit this node */
		visited.add(nowNode);

		if (prefixes.size() > 0) {
			Character lastEvent = prefixes.get(prefixes.size() - 1);
			Set<Character> relatedConds = getRelatedConds(lastEvent);

			if ((relatedConds != null) && (relatedConds.size() != 0)) {
				Set<Character> possibleTrans = new HashSet<>();

				for (TransitionEdge<Character,Integer> e : g.getOutgoingEdges(nowNode)) {
					Character event = e.getInput();

					possibleTrans.add(event);
				}

				for (Character event : relatedConds) {
					if (!possibleTrans.contains(event)) {
						prefixes.add(event);
						return getStringRepresentation(prefixes);
					}
				}

			}

		}

		for (TransitionEdge<Character,Integer> e : g.getOutgoingEdges(nowNode)) {
				Character event = e.getInput();
				Integer nextNode = e.getTransition();

				List<Character> nextPrefixes = new ArrayList<Character>(prefixes);
				nextPrefixes.add(event);
				String ret = traverselyCheck(g, nextNode, visited, nextPrefixes);
				if (ret != null)
					return ret;
		}

		return null;
	}

	@Override
	public @Nullable DefaultQuery<Character, Boolean> findCounterExample(DFA<?, Character> hypothesis, Collection<? extends Character> inputs) {
		// System.out.println("inputs: " + inputs);

		// CompactDFA<Character> dfa = (CompactDFA<Character>) hypothesis;
		// CompactNFA<Character> nfaNoTrapState = NaiveActiveLearning.removeTrapStates(alphabet.getAlphabet(), dfa);

		// UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = nfaNoTrapState.transitionGraphView();

		// String errorString;

		// for (Integer initialS : nfaNoTrapState.getInitialStates()) {
		// 	errorString = traverselyCheck(g, initialS, new HashSet<Integer>(), new ArrayList<Character>());
		// 	if (errorString != null) {
		// 		System.out.println("EQOracle found a counterexample: " + errorString + " should be valid: " + hypothesis.accepts(Word.fromString(errorString)));
		// 		DefaultQuery<Character, Boolean> query = new DefaultQuery<>(Word.fromString(errorString), true);
		// 		return query;
		// 	}
		// }
		
		return null;
	}

}
