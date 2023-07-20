package ahg.harness.cfg.nfa;


import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.AbstractMap.SimpleEntry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import ahg.harness.cfg.alphabet.iAlphabet;
import ahg.harness.cfg.alphabet.letter.iLetter;
import ahg.harness.cfg.alphabet.letter.iAPILetter;

import net.automatalib.words.Alphabet;
import net.automatalib.words.impl.Alphabets;
import net.automatalib.graphs.UniversalGraph;
import net.automatalib.automata.graphs.TransitionEdge;
import net.automatalib.util.automata.builders.FSABuilder;
import net.automatalib.automata.concepts.StateLocalInput;
import net.automatalib.automata.fsa.impl.compact.CompactNFA;
import net.automatalib.util.automata.builders.AutomatonBuilders;

public class iNFA {

	public static Map.Entry<Alphabet<String>, CompactNFA<String>> translate2ReadableNFA(iAlphabet ial, CompactNFA<Character> rawNfa) {
		// 1. build alphabet
		List<String> events = new ArrayList<>();
		ial.getAlias2Letter().forEach((c, l) -> {
			String event = l.getContent();
			if (l instanceof iAPILetter) {
				event = ial.getAllVarsInString(event) + " <- " + event;
			}

			events.add(event);
		});
		Alphabet<String> alphabet = Alphabets.fromList(events);
		// 2. build nfa
		FSABuilder<Integer, String, CompactNFA<String>> nfaBuilder = AutomatonBuilders.newNFA(alphabet);

		// initials
		Set<Integer> initials = rawNfa.getInitialStates();
		initials.forEach((s) -> {
			nfaBuilder.withInitial(Integer.toString(s));
		});

		// finals
		Collection<Integer> states = rawNfa.getStates();
		states.forEach((s) -> {
			if (rawNfa.isAccepting(s))
				nfaBuilder.withAccepting(Integer.toString(s));
		});

		// maps
		UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = rawNfa.transitionGraphView();
		states.forEach((inS) -> {
			Collection<TransitionEdge<Character,Integer>> outStates = g.getOutgoingEdges(inS);
			outStates.forEach((outT) -> {
				Character e = outT.getInput();
				Integer outS = outT.getTransition();

				String frm = Integer.toString(inS);
				String to = Integer.toString(outS);
				iLetter l = ial.getLetter(e);
				String event = l.getContent();
				if (l instanceof iAPILetter) {
					event = ial.getAllVarsInString(event) + " <- " + event;
				}

				nfaBuilder.from(frm).on(event).to(to);
			});
		});

		CompactNFA<String> nfa = nfaBuilder.create();
		return new SimpleEntry<Alphabet<String>, CompactNFA<String>>(alphabet, nfa);
	}

	public static boolean traverselyMatch(UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g, Integer nowNode, Set<Character> noiseEvents, List<Character> beingMatched, int curIndex) {
		if (curIndex == beingMatched.size())
			/* all matched */
			return true;

		for (TransitionEdge<Character,Integer> e : g.getOutgoingEdges(nowNode)) {
			Character event = e.getInput();
			Integer nextNode = e.getTransition();

			boolean matched;
			if (noiseEvents.contains(event)) {
				matched = traverselyMatch(g, nextNode, noiseEvents, beingMatched, curIndex);

			} else if (event.equals(beingMatched.get(curIndex))) {
				matched = traverselyMatch(g, nextNode, noiseEvents, beingMatched, curIndex + 1);

			} else {
				matched = false;

			}

			if (matched)
				return true;

		}

		return false;
	}

	// treat noise events as epsilon during the match
	public static boolean customizedMatch(CompactNFA<Character> nfa, Set<Character> noiseEvents, List<Character> beingMatched) {
		UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = nfa.transitionGraphView();
		for (Integer initialS : nfa.getInitialStates()) {
			boolean matched = traverselyMatch(g, initialS, noiseEvents, beingMatched, 0);
			if (matched)
				return true;
		}

		return false;
	}

	/* find the path which finally reaches to target node */
	public static String traverselySearch(UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g, Integer nowNode, Character target, Set<Integer> visited, List<Character> prefixes) {
		if (visited.contains(nowNode)) {
			/* meets loop */
			return null;
		}

		/* visit this node */
		visited.add(nowNode);

		for (TransitionEdge<Character,Integer> e : g.getOutgoingEdges(nowNode)) {
			Character event = e.getInput();
			Integer nextNode = e.getTransition();

			if (event.equals(target)) {
				String path = "";
				for (Character c : prefixes)
					path = path + Character.toString(c);

				path = path + Character.toString(event);

				return path;
			}

			List<Character> nextPrefixes = new ArrayList<Character>(prefixes);
			nextPrefixes.add(event);
			String ret = traverselySearch(g, nextNode, target, visited, nextPrefixes);
			if (ret != null)
				return ret;

		}

		return null;
	}

	// the func will return null if no prefix to this event has been found
	public static String searchAPrefixOfEvent(CompactNFA<Character> nfa, Integer startState, Character event) {
		UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = nfa.transitionGraphView();
		return traverselySearch(g, startState, event, new HashSet<Integer>(), new ArrayList<Character>());
	}

	public static Set<Character> getAppearedEvents(CompactNFA<Character> ... nfas) {
		Set<Character> events = new HashSet<>();

		for (CompactNFA<Character> nfa : nfas)
			for (Integer s : nfa.getStates())
				events.addAll(nfa.getLocalInputs(s));

		return events;
	}

	public static Set<Character> getAppearedEvents(List<CompactNFA<Character>> nfas) {
		Set<Character> events = new HashSet<>();

		for (CompactNFA<Character> nfa : nfas)
			for (Integer s : nfa.getStates())
				events.addAll(nfa.getLocalInputs(s));

		return events;
	}

	public static void dumpNFAToFile(CompactNFA<Character> nfa, String outNfaFile) {
		String nfaCtnt = "# name\n temporary nfa\n";

		// the initial
		List<String> initSs = new ArrayList<String>();
		Set<Integer> initials = nfa.getInitialStates();
		initials.forEach((s) -> {
			initSs.add(Integer.toString(s));
		});
		nfaCtnt = nfaCtnt + "# initial\n" + String.join(",", initSs) + "\n";

		// the finals
		List<String> finalSs = new ArrayList<String>();
		Collection<Integer> states = nfa.getStates();
		states.forEach((s) -> {
			if (nfa.isAccepting(s))
				finalSs.add(Integer.toString(s));
		});
		nfaCtnt = nfaCtnt + "# finals\n" + String.join(",", finalSs) + "\n";

		// maps
		List<String> maps = new ArrayList<String>();
		UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = nfa.transitionGraphView();
		states.forEach((inS) -> {
			Collection<TransitionEdge<Character,Integer>> outStates = g.getOutgoingEdges(inS);
			outStates.forEach((outT) -> {
				Character e = outT.getInput();
				Integer outS = outT.getTransition();
				maps.add(Integer.toString(inS) + "," + Character.toString(e) + "," + Integer.toString(outS));
			});
		});
		nfaCtnt = nfaCtnt + "# map\n" + String.join("\n", maps) + "\n";
		nfaCtnt = nfaCtnt + "$$$\n";

		try {
			Files.writeString( Paths.get(outNfaFile), nfaCtnt);
		} catch (IOException ex) {
			throw new RuntimeException("catched ioexception: " + ex);
		}

	}

	/* stateIDMap is out parameter */
	public static CompactNFA<Character> createNFAOfAString(Alphabet<Character> alphabet, String aString, HashMap<Integer, String> stateIDMap) {
		FSABuilder<Integer, Character, CompactNFA<Character>> nfaBuilder = AutomatonBuilders.newNFA(alphabet);

		int count = aString.length();

		// initials
		nfaBuilder.withInitial("0");

		if (count > 0) {
			// finals
			for (int i = 1; i <= count; i++) 
				nfaBuilder.withAccepting(Integer.toString(i));

			// transitions
			for (int i = 0; i < count; i++) {
				String frm = Integer.toString(i);
				String to = Integer.toString(i + 1);
				Character event = aString.charAt(i);

				nfaBuilder.from(frm).on(event).to(to);
			}

		}

		CompactNFA<Character> nfa = nfaBuilder.create();

		// System.out.println("nfa is " + nfa);
		// System.out.println("nfa output " + nfa.computeOutput(Arrays.asList(new Character[]{'a', 'b'})));

		// nfa.forEach( (s) -> {
		// 	System.out.println("for each s is " + s);
		// });

		if (stateIDMap != null) {
			for (int i = 0; i <= count; i++) 
				stateIDMap.put(i, Integer.toString(i));

		}

		return nfa;
	}

	/* stateIDMap is out parameter */
	public static CompactNFA<Character> loadOneNFAFromFile(Alphabet<Character> alphabet, String nfaFile, HashMap<Integer, String> stateIDMap) {
		List<HashMap<Integer, String>> stateIDMapList = new ArrayList<HashMap<Integer, String>>();

		List<CompactNFA<Character>> nfas = loadNFAsFromFile(alphabet, nfaFile, stateIDMapList);
		if (nfas.size() > 1) {
			throw new RuntimeException("there is more than one (" + nfas.size() + ") nfa configuration in " + nfaFile);
		} else if (nfas.size() == 0) {
			return null;
		}

		/* System.out.println("stateIDMapList is " + stateIDMapList); */
		if (stateIDMap != null)
			stateIDMap.putAll(stateIDMapList.get(0));
		/* System.out.println("stateIDMap is " + stateIDMap); */

		return nfas.get(0);
	}

	/* stateIDMapList is out parameter */
	public static List<CompactNFA<Character>> loadNFAsFromFile(Alphabet<Character> alphabet, String nfaFile, List<HashMap<Integer, String>> stateIDMapList) {
		List<CompactNFA<Character>> nfas = new ArrayList<CompactNFA<Character>>();

		String cnt = "";

		try {
			cnt = new String ( Files.readAllBytes( Paths.get(nfaFile) ) );
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");
		}

		for ( String part : cnt.split("\\$\\$\\$") ) {
			HashMap<Integer, String> stateIDMap = new HashMap<Integer, String>();
			CompactNFA<Character> nfa = null;

			try {
				nfa = loadNFAFromString(alphabet, part.trim(), stateIDMap);

				if (nfa == null)
					System.out.println("Loading nfa from " + nfaFile + " is an empty file, skip this");

			} catch (Exception e) {
				System.out.println("Loading nfa from " + nfaFile + " failed due to " + e + ", skip this");
				nfa = null;

			}

			if (nfa != null) {
				nfas.add(nfa);

				if (stateIDMapList != null)
					stateIDMapList.add(stateIDMap);
			}
		}

		return nfas;
	}

	// returns null if the NFA is empty
	// throws if the NFA is wrongly configured
	/* stateIDMap is out parameter */
	public static CompactNFA<Character> loadNFAFromString(Alphabet<Character> alphabet, String cnt, HashMap<Integer, String> stateIDMap) {
		/* records already added states */
		Set<String> states = new HashSet<String>();

		List<String> lines = new ArrayList<String>();
		for ( String line : cnt.trim().split("\n") ) {
			String _line = line.trim();
			if ( (!_line.isEmpty()) && (!_line.startsWith("#")) ) {
				// if line is not empty line or comment line
				lines.add(_line);
			}
		}

		int size = lines.size();
		if (size == 0) {
			// skip empty nfa configuration
			return null;
		} else if (size <= 3) {
			throw new RuntimeException("wrong nfa configuration");
		}

		FSABuilder<Integer, Character, CompactNFA<Character>> nfaBuilder = AutomatonBuilders.newNFA(alphabet);
		// line 1: name
		// line 2: initials
		for (String s : lines.get(1).split(",")) {
			String id = s.trim();
			nfaBuilder.withInitial(id);

			if (!states.contains(id)) {
				stateIDMap.put(states.size(), id);
				states.add(id);
			}
		}
		// line 3: finals
		for (String s : lines.get(2).split(",")) {
			String id = s.trim();
			if (id.equals(""))
				return null;

			nfaBuilder.withAccepting(id);

			if (!states.contains(id)) {
				stateIDMap.put(states.size(), id);
				states.add(id);
			}
		}
		// line 3+: transitions
		for (String tran : lines.subList(3, size)) {
			if (tran.trim().equals(""))
				return null;

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

			if (!states.contains(frm)) {
				stateIDMap.put(states.size(), frm);
				states.add(frm);
			}
			if (!states.contains(to)) {
				stateIDMap.put(states.size(), to);
				states.add(to);
			}
		}

		CompactNFA<Character> nfa = nfaBuilder.create();

		/* System.out.println("states is " + states);
		System.out.println("stateIDMap is " + stateIDMap); */

		// System.out.println("nfa is " + nfa);
		// System.out.println("nfa output " + nfa.computeOutput(Arrays.asList(new Character[]{'a', 'b'})));

		// nfa.forEach( (s) -> {
		// 	System.out.println("for each s is " + s);
		// });

		return nfa;
	}

	public static CompactNFA<Character> createEmptyNFA(Alphabet<Character> alphabet) {
		FSABuilder<Integer, Character, CompactNFA<Character>> nfaBuilder = AutomatonBuilders.newNFA(alphabet);
		CompactNFA<Character> nfa = nfaBuilder.create();
		return nfa;
	}

}
