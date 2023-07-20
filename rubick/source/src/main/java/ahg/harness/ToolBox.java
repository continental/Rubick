package ahg.harness;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

import net.automatalib.graphs.UniversalGraph;
import net.automatalib.automata.graphs.TransitionEdge;
import net.automatalib.automata.fsa.impl.compact.CompactNFA;

import ahg.harness.cfg.alphabet.iAlphabet;
import ahg.harness.cfg.alphabet.letter.iLetter;
import ahg.harness.cfg.alphabet.letter.iConstraintLetter;
//import ahg.harness.characterrelation.iRelation;

public class ToolBox {

//	// nfa
//	private CompactNFA<Character> nfa;
//
//	// character relations:
//	//   - from ctrl deps
//	//   - from data deps
//	//   - from common rules of being a desired harness
//	private Set<iRelation> relations;
//
//	//
//	// for generating harness:
//	//
//
//	// 1.
//	// alphabet
//	// alias2event
//	// def2var
//	private iAlphabet ialphabet;
//
//	// 2.
//	// conversion related
//	// TODO
//
//	public ToolBox(CompactNFA<Character> _nfa, Set<iRelation> _relations, iAlphabet _ial) {
//		nfa = _nfa;
//		relations = _relations;
//		ialphabet = _ial;
//	}
//
//	private Set<Integer> deepCopyHashSet(Set<Integer> set) {
//		Set<Integer> copiedSet = new HashSet<Integer>(); 
//
//		set.forEach((e) -> {
//			Integer newe = new Integer(e);
//			copiedSet.add(newe);
//		});
//
//		return copiedSet;
//	}
//
//	private List<Character> deepCopyArrayList(List<Character> list) {
//		List<Character> copiedList = new ArrayList<Character>(); 
//
//		list.forEach((e) -> {
//			Character newe = new Character(e);
//			copiedList.add(newe);
//		});
//
//		return copiedList;
//	}
//
//	private HashMap<Integer, Integer> deepCopyHashMap(HashMap<Integer, Integer> map) {
//		HashMap<Integer, Integer> copiedMap = new HashMap<Integer, Integer>();
//
//		map.forEach((k, v) -> {
//			Integer newk = new Integer(k);
//			Integer newv = new Integer(v);
//			copiedMap.put(newk, newv);
//		});
//
//		return copiedMap;
//	}
//
//	private List<List<Character>> _traverse(UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g, Character nowInput, Integer nowNode, HashMap<Integer, Integer> visitedCount, List<Character> path, int reentryLimit) {
//		List<List<Character>> paths = new ArrayList<List<Character>>();
//		
//		// visit this node
//		if ( ! visitedCount.containsKey(nowNode) )
//			visitedCount.put(nowNode, 0);
//
//		if (nowInput != null)
//			// just from initial
//			path.add(nowInput);
//
//		int reentryCount = visitedCount.get(nowNode);
//		visitedCount.put(nowNode, reentryCount + 1);
//
//		if (reentryCount >= reentryLimit) {
//			// should end looping now
//			// System.out.println("loop end: " + path);
//			if (path.size() != 0)
//				paths.add(path);
//
//			return paths;
//		}
//
//		// visit next nodes
//		Collection<TransitionEdge<Character,Integer>> es = g.getOutgoingEdges(nowNode);
//		
//		if (es.size() == 0) {
//			// reaches the end
//			// System.out.println("path end: " + path);
//			if (path.size() != 0)
//				paths.add(path);
//
//			return paths;
//		}
//
//		for (TransitionEdge<Character,Integer> e : es) {
//			Character nextInput = e.getInput();
//			Integer nextNode = e.getTransition();
//
//			// System.out.println("from " + nowNode + " input " + nextInput + " to " + nextNode);
//			HashMap<Integer, Integer> copiedVisited = deepCopyHashMap(visitedCount);
//			List<Character> copiedPath = deepCopyArrayList(path);
//
//			List<List<Character>> _paths = _traverse(g, nextInput, nextNode, copiedVisited, copiedPath, reentryLimit);
//			paths.addAll(_paths);
//		}
//
//		return paths;
//	}
//
//	private void traverseNFA(int reentryLimit) {
//		UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = nfa.transitionGraphView();
//
//		Set<Integer> initials = nfa.getInitialStates();
//		System.out.println("initial states: " + initials);
//
//		List<List<Character>> paths = new ArrayList<List<Character>>();
//
//		initials.forEach((n) -> {
//			System.out.println("initial node: " + n);
//			// System.out.println("outgoing edges: " + g.getOutgoingEdges(n));
//			List<List<Character>> _paths = _traverse(g, null, n, new HashMap<Integer, Integer>(), new ArrayList<Character>(), reentryLimit);
//			paths.addAll(_paths);
//		});
//
//		paths.forEach((p) -> {
//			System.out.println("path " + p);
//		});
//	}
//
//	private List<String> branchJoin(String id, List<List<String>> codelist) {
//		List<String> codes = new ArrayList<String>();
//
//		int num = codelist.size();
//
//		if (num > 1) {
//			int count = 0;
//
//			for (List<String> _codes: codelist) {
//				int _num = _codes.size();
//				if (_num == 0)
//					throw new RuntimeException("this is impossible");
//
//				String cond = _codes.get(0);
//
//				if (count == 0)
//					codes.add("if (" + cond + ") {");
//				else
//					codes.add("} else if (" + cond + ") {");
//
//				for (int i = 1; i < _num; i++)
//					codes.add("    " + _codes.get(i));
//
//				count++;
//			}
//			codes.add("}");
//
//		} else if (num == 1) {
//			List<String> _codes = codelist.get(0);
//			int _num = _codes.size();
//			if (_num == 0)
//				throw new RuntimeException("this is impossible");
//
//			String cond = _codes.get(0);
//
//			codes.add("if (" + cond + ") {");
//			for (int i = 1; i < _num; i++)
//				codes.add("    " + _codes.get(i));
//			codes.add("}");
//
//		} else {
//			// num == 0
//			// do nothing
//		}
//
//		return codes;
//	}
//
//	private List<String> parallelJoin(String id, List<List<String>> codelist) {
//		List<String> codes = new ArrayList<String>();
//
//		int num = codelist.size();
//
//		if (num > 1) {
//			int count = 0;
//
//			codes.add("pick = consumeParallel(xxx);");
//			for (List<String> _codes: codelist) {
//				if (count == 0)
//					codes.add("if (pick == " + count + ") {");
//				else
//					codes.add("} else if (pick == " + count + ") {");
//
//				_codes.forEach((l) -> {
//					codes.add("    " + l);
//				});
//
//				count++;
//			}
//			codes.add("}");
//
//		} else if (num == 1) {
//			codes.addAll(codelist.get(0));
//
//		} else {
//			// num == 0
//			// do nothing
//		}
//
//		return codes;
//	}
//
//	private List<String> _generate(UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g, Character nowInput, Integer nowNode, Set<Integer> visited) {
//		List<String> codes = new ArrayList<String>();
//
//		// System.out.println("nowInput " + nowInput + ", nowNode: " + nowNode);
//
//		// visit this node
//		if (nowInput != null) {
//			codes.add(ialphabet.getLetter(nowInput).getContent());
//		}
//
//		if (visited.contains(nowNode)) {
//			// meets loop
//			// handle the jump back logic
//			codes.add("// ADD JUMP HERE");
//			return codes;
//		}
//
//		visited.add(nowNode);
//
//		// visit next nodes
//		Collection<TransitionEdge<Character,Integer>> es = g.getOutgoingEdges(nowNode);
//
//		HashMap<Character,List<List<String>>> map = new HashMap<Character,List<List<String>>>();
//
//		if (es.size() == 0) {
//			// reaches the end
//			codes.add("end();");
//			return codes;
//		}
//
//		for (TransitionEdge<Character,Integer> e : es) {
//			Character nextInput = e.getInput();
//			Integer nextNode = e.getTransition();
//
//			// System.out.println("from " + nowNode + " input " + nextInput + " to " + nextNode);
//			Set<Integer> copiedVisited = deepCopyHashSet(visited);
//
//			List<String> _codes = _generate(g, nextInput, nextNode, copiedVisited);
//
//			List<List<String>> codelist = null;
//			if (map.containsKey(nextInput))
//				codelist = map.get(nextInput);
//			else
//				codelist = new ArrayList<List<String>>();
//			
//			codelist.add(_codes);
//			map.put(nextInput, codelist);
//		}
//
//		List<List<Character>> groups = new ArrayList<List<Character>>();
//
//		map.keySet().forEach((c) -> {
//			boolean added = false;
//			for (List<Character> group : groups) {
//				if (ialphabet.isInThisLetterGroup(group, c)) {
//					group.add(c);
//					added = true;
//					break;
//				}
//			}
//			if (!added) {
//				List<Character> group = new ArrayList<Character>();
//				group.add(c);
//				groups.add(group);
//			}
//		});
//
//		List<List<String>> groupsCodes = new ArrayList<List<String>>();
//
//		for (List<Character> group : groups) {
//			List<List<String>> groupCodes = new ArrayList<List<String>>();
//
//			if (group.size() > 1) {
//				// WARN: this must be a condition group
//				for (Character c : group) {
//					if ( ! (ialphabet.getLetter(c) instanceof iConstraintLetter) ) {
//						throw new RuntimeException("only constraint letter can be gathered: " + group);
//					}
//				}
//			}
//
//			for (Character c : group) {
//
//				List<List<String>> codelist = map.get(c);
//				List<String> _codes = parallelJoin(Character.toString(c), codelist);
//				groupCodes.add(_codes);
//				
//			}
//			
//			List<String> _codes;
//
//			if (group.size() > 1)
//				_codes = branchJoin(group.toString(), groupCodes);
//			else
//				_codes = groupCodes.get(0);
//
//			groupsCodes.add(_codes);
//		}
//
//		List<String> _codes = parallelJoin(groups.toString(), groupsCodes);
//		codes.addAll(_codes);
//
//		return codes;
//	}
//
//	// private List<String> markLoopStates(UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g, Character nowInput, Integer nowNode, Set<Integer> visited) {
//	// }
//
//	private void generateHarness() {
//		UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = nfa.transitionGraphView();
//
//		Set<Integer> initials = nfa.getInitialStates();
//		System.out.println("initial states: " + initials);
//
//		List<String> codes = new ArrayList<String>();
//
//		initials.forEach((n) -> {
//			System.out.println("initial node: " + n);
//			codes.add("///// START " + n +  " /////");
//			// System.out.println("outgoing edges: " + g.getOutgoingEdges(n));
//			List<String> _codes = _generate(g, null, n, new HashSet<Integer>());
//			codes.addAll(_codes);
//			codes.add("///// END " + n +  " /////");
//		});
//
//		codes.forEach((line) -> {
//			System.out.println(line);
//		});
//	}

	private void generateNFAHarness() {
	}

	public String toHarness() {

		// 1.
		// traverse the nfa 
		//    group the strings by t/f branches (split by A/B, refuse the A/t)/ or by one input multiple states
		// traverseNFA(2);

		// - it should have all constraints for a given api in the graph structure

		// 2.
		// check all relations for each string
		// - it should not have no data dependency solution for a given api
		// - it should not violate constraint relation / other control dependency for a given api

		// 3.
		// convert the nfa to harness
		// generateHarness();
		generateNFAHarness();

		return "";
	}

	public void execHarness() {
		// exec harness

	}

}
