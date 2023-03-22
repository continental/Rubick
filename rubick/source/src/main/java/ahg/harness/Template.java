package ahg.harness;

import java.io.File;
import java.io.InputStream;

import java.lang.Math;
import java.lang.Exception;

import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import net.automatalib.graphs.UniversalGraph;
import net.automatalib.automata.graphs.TransitionEdge;
import net.automatalib.automata.fsa.impl.compact.CompactNFA;

import ahg.harness.internal.iTran;
import ahg.harness.internal.iState;
import ahg.harness.internal.iMultiTran;
import ahg.harness.internal.iSingleTran;

import ahg.harness.cfg.api.iFuncIn;
import ahg.harness.cfg.api.iAPIFunc;

import ahg.harness.cfg.nfa.iNFA;
import ahg.harness.cfg.picks.CFPicks;

import ahg.harness.cfg.alphabet.iAlphabet;
import ahg.harness.cfg.alphabet.letter.iLetter;
import ahg.harness.cfg.alphabet.letter.iAPILetter;
import ahg.harness.cfg.alphabet.letter.iConstraintLetter;

import ahg.harness.exception.HarnessException;
import ahg.harness.exception.BreakDataDepException;

public abstract class Template {

	public static boolean debug = false;

	private iAlphabet ialphabet = null;
	private CompactNFA<Character> nfa = null;
	private HashMap<Character, iAPIFunc> apiFuncs = null;

	/*
	 * ctrl flow picks related
	 */
	private List<iState> allInitials = null;
	private HashMap<iState, List<iTran>> allStateChoices = null;
	private List<iState> stateList = null;
	private List<Integer> cfChoiceList = null;
	protected long cfChoiceNum;
	/* updated based on cfNO */
	private Integer initialPick = null;
	private HashMap<Integer, iTran> tranPicks = null;

	protected CFPicks cfPicks = null;

	/*
	 * data flow picks related 
	 * for each argument of each api call, the picked var
	 * based on cfNO & dfNO
	 */
	HashMap<iFuncIn, List<String>> varChoices = null;
	List<iFuncIn> funcInList = null;
	private List<Integer> dfChoiceList = null;
	private HashMap<iFuncIn, String> varPicks = null;
	protected long dfChoiceNum;
	/* all variables used in harness */
	protected HashMap<String, Object> vars = null;

	/* executing string */
	protected String pastEventsStr = null;
	protected Character curEvent = null;

	/* the input file stream */
	protected InputStream input = null;
	protected File inputFile = null;

	private void enumerateITran(List<List<TransitionEdge<Character,Integer>>> groups, List<iTran> trans, int nowIdx, List<TransitionEdge<Character,Integer>> nowList) {
		if (nowIdx >= groups.size()) {
			iTran tran = new iMultiTran(nowList);
			trans.add(tran);
			return;
		}

		for (TransitionEdge<Character,Integer> e: groups.get(nowIdx)) {
			List<TransitionEdge<Character,Integer>> nextList = new ArrayList<TransitionEdge<Character,Integer>>();
			nextList.addAll(nowList);
			nextList.add(e);

			enumerateITran(groups, trans, nowIdx + 1, nextList);
		}
	}

	private void traverse(UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g, Integer nowNode, Set<Integer> visited, HashMap<iState, List<iTran>> _picks) {
		if (visited.contains(nowNode)) {
			/* meets loop, the iTran has been collected */
			return;
		}

		/* visit this node */
		visited.add(nowNode);

		Collection<TransitionEdge<Character,Integer>> es = g.getOutgoingEdges(nowNode);
		if (es.size() == 0) {
			/* reaches the end, no iTran can be collected */
			return;
		}

		/*
		 * N.B. all trans of a node are either Call Funcs OR Constraints,
		 *      this can be guaranteed during the active learning.
		 */
		List<iTran> trans = new ArrayList<iTran>();

		boolean hasFuncCall = false;
		boolean hasCons = false;
		for (TransitionEdge<Character,Integer> e : es) {
			Character event = e.getInput();
			iLetter l = ialphabet.getLetter(event);

			if (l instanceof iAPILetter)
				hasFuncCall = true;
			else if (l instanceof iConstraintLetter)
				hasCons = true;
			else
				throw new RuntimeException("This is impossible");
		}

		if (hasFuncCall && hasCons)
			throw new RuntimeException("This is an invalid NFA for harness (conditions & func calls are appeared together in one state's transition): " + iState.getStateId(nowNode));

		else if (hasFuncCall) {
			/* singletran */
			for (TransitionEdge<Character,Integer> e : es)
				trans.add(new iSingleTran(e));

		} else {
			/* multitran */
			HashMap<Character, List<TransitionEdge<Character,Integer>>> tranGroups = new HashMap<Character, List<TransitionEdge<Character,Integer>>>();

			for (TransitionEdge<Character,Integer> e : es) {
				Character k = e.getInput();
				List<TransitionEdge<Character,Integer>> v = tranGroups.get(k);
				if (v == null)
					v = new ArrayList<TransitionEdge<Character,Integer>>();
				
				v.add(e);
				tranGroups.put(k, v);
			}

			List<List<TransitionEdge<Character,Integer>>> groups = new ArrayList<List<TransitionEdge<Character,Integer>>>(tranGroups.values());

			enumerateITran(groups, trans, 0, new ArrayList<TransitionEdge<Character,Integer>>());
		}
		/* add collected iTran (list of singleTran or multipleTran) to _picks */
		_picks.put(new iState(nowNode), trans);

		/* visit next nodes */
		for (TransitionEdge<Character,Integer> e : es) {
			Integer nextNode = e.getTransition();

			traverse(g, nextNode, visited, _picks);
		}

	}

	private long choiceUpperBoundCheck(List<Integer> choiceList) {
		/* check */
		int allCount = 1;
		try {
			for (Integer c : choiceList)
				allCount = Math.multiplyExact(allCount, c);

		} catch (ArithmeticException e) {
			// e.printStackTrace();
			// throw new RuntimeException("The combination of all choices has exceed the 32 bit integer value range: " + e);
			System.out.println("we checked but suppressed the overflow issue");
			allCount = Integer.MAX_VALUE;
		}

		return (long) allCount;
	}

	private void initCtrlFlowPickTable(String cfPickJsonFile) {

		if (cfPickJsonFile != null) {
			cfPicks = CFPicks.loadFromFile(cfPickJsonFile);
			return;
		}

		/* fill up the allInitials & allStateChoices & cfChoiceList */

		allInitials = new ArrayList<iState>();
		allStateChoices = new HashMap<iState, List<iTran>>();

		UniversalGraph<Integer,TransitionEdge<Character,Integer>,Boolean,TransitionEdge.Property<Character,Void>> g = nfa.transitionGraphView();

		Set<Integer> initials = nfa.getInitialStates();

		initials.forEach((n) -> {
			allInitials.add(new iState(n));
			traverse(g, n, new HashSet<Integer>(), allStateChoices);
		});

		/* sort the possible picks */
		Collections.sort(allInitials);
		allStateChoices.forEach((k, v) -> {
			Collections.sort(v);
		});

		stateList = new ArrayList<iState>(allStateChoices.keySet());
		Collections.sort(stateList);

		/* fill up cfChoiceList */
		cfChoiceList = new ArrayList<Integer>();
		for (iState s : stateList) {
			Integer count = allStateChoices.get(s).size();
			cfChoiceList.add(count);
		}
		/* add count of choices of initial */
		cfChoiceList.add(allInitials.size());
		cfChoiceNum = choiceUpperBoundCheck(cfChoiceList);

		if (debug) {
			System.out.print("Ctrl flow: " + cfChoiceNum + " choices, choiceList: [");
			System.out.print("cfChoiceList: [");
			for (int i = 0; i < stateList.size(); i++)
				System.out.print("(" + cfChoiceList.get(i) + ")" + stateList.get(i) + ", ");
			System.out.print("]\n");
			System.out.println("allInitials: " + allInitials);
			System.out.println("allStateChoices: " + allStateChoices);
		}

	}

	private void setCtrlFlowPicks(long cfNO) {
		if (cfPicks != null) {
			cfPicks.setCtrlFlowPicks(cfNO);
			initialPick = cfPicks.getInitialPick();
			tranPicks = cfPicks.getTranPicks();

		} else {
			/* generate ctrl flow pick based on cfNO */
			initialPick = null;
			tranPicks = new HashMap<Integer, iTran>();

			long X = cfNO;
			for (int i = 0; i < cfChoiceList.size(); i++) {
				Integer n = cfChoiceList.get(i);
				Integer r = Math.floorMod(X, n);
				if (r < 0)
					throw new RuntimeException("cfNO (" + cfNO + "): X (" + X + ") % n (" + n + ") = r (" + r + ") < 0");

				X = (X - r) / n;

				if (i < cfChoiceList.size() - 1) {
					/* r is the index of the choice */
					iState s = stateList.get(i);
					iTran chosen = allStateChoices.get(s).get(r);
					tranPicks.put(s.getNO(), chosen);
				} else {
					/* pick for initial */
					initialPick = allInitials.get(r).getNO();
				}
			}

		}

		if (debug) {
			System.out.print("tranPicks: {");
			tranPicks.forEach((k, v) -> {
				System.out.print(iState.getStateId(k) + "=" + v + ", ");
			});
			System.out.print("}\n");
			System.out.println("initialPick: " + iState.getStateId(initialPick));

		}

	}

	/* data flow must be inited after cfNO is fixed */
	private String initDataFlowPickTable() {
		/*
		 * Currently we use a quick & dirty way to 
		 * calculate the possible vars for each state, 
		 * this can be refined using traverse later (if necessary)
		 */
		
		resetVars();

		Set<String> existingVars = new HashSet<String>(vars.keySet());
		tranPicks.forEach((s, t) -> { 
			if ( (t instanceof iSingleTran) ) {
				Character c = ((iSingleTran) t).getTran().getInput();
				// System.out.println("c: " + c + ", apiFuncs.get(c): " + apiFuncs.get(c));
				existingVars.addAll( apiFuncs.get(c).getAPIOutVars() );
			}
		});

		varChoices = new HashMap<iFuncIn, List<String>>();

		tranPicks.forEach((s, t) -> {
			if ( (t instanceof iSingleTran) ) {
				Character c = ((iSingleTran) t).getTran().getInput();
				apiFuncs.get(c).getAPIFuncIns().forEach((i) -> {
					if (! varChoices.containsKey(i)) {
						Set<String> tmp = new HashSet<String>(i.getAcceptedVars());
						tmp.retainAll(existingVars);

						List<String> cl = new ArrayList<String>(tmp);
						Collections.sort(cl);
						varChoices.put(i, cl);
					}
				});
			}
		});

		funcInList = new ArrayList<iFuncIn>(varChoices.keySet());
		Collections.sort(funcInList);

		dfChoiceList = new ArrayList<Integer>();
		for (iFuncIn i : funcInList) {
			Integer count = varChoices.get(i).size();
			dfChoiceList.add(count);
		}
		dfChoiceNum = choiceUpperBoundCheck(dfChoiceList);
		
		if (debug) {
			System.out.print("Data flow: " + dfChoiceNum + " choices, choiceList: [");
			for (int i = 0; i < dfChoiceList.size(); i++)
				System.out.print("(" + dfChoiceList.get(i) + ")" + funcInList.get(i) + ", ");
			System.out.print("]\n");

		}

		for (iFuncIn i : funcInList) {
			Integer count = varChoices.get(i).size();
			if (count == 0) {
				String errorString = iNFA.searchAPrefixOfEvent(nfa, initialPick, i.event);
				if (errorString == null) 
					throw new RuntimeException("this is impossible, cannot find a path to the data dep break state");

				return errorString;
			}

		}

		return null;
	}

	private void setDataFlowPicks(long dfNO) {
		/* generate picks */
		varPicks = new HashMap<iFuncIn, String>();
		long X = dfNO;
		for (int i = 0; i < dfChoiceList.size(); i++) {
			Integer n = dfChoiceList.get(i);
			Integer r = Math.floorMod(X, n);
			if (r < 0)
				throw new RuntimeException("dfNO (" + dfNO + "): X (" + X + ") % n (" + n + ") = r (" + r + ") < 0");

			X = (X - r) / n;

			/* r is the index of the choice */
			iFuncIn in = funcInList.get(i);
			String chosen = varChoices.get(in).get(r);
			varPicks.put(in, chosen);
		}

	}

	public void oneTimeInit(iAlphabet _al, CompactNFA<Character> _nfa, HashMap<Character, iAPIFunc> _apiFuncs, String cfPickJsonFile, HashMap<Integer, String> stateIDMap) {
		/* load alphabet */
		ialphabet = _al;
		/* load nfa */
		nfa = _nfa;
		/* load others a harness need */
		apiFuncs = _apiFuncs;

		/* set the stateIDMap for calculating the pick order */
		iState.setStateIDMap(stateIDMap);

		/* initialization pick tables */
		initCtrlFlowPickTable(cfPickJsonFile);
	}

	/* used for every run which cfNO has been changed  */
	public String resetAllPicks(long cfNO, long dfNO) {
		setCtrlFlowPicks(cfNO);

		String errorString = initDataFlowPickTable();
		if (errorString != null) 
			return errorString;

		setDataFlowPicks(dfNO);

		return null;
	}

	/* used for every run which only dfNO has been changed  */
	public void resetDataFlowPicks(long dfNO) {
		setDataFlowPicks(dfNO);
	}

	/* update happened event to NFA & returns the reaching state */
	private Integer toNextState(Integer nowState, Character event) {
		Integer nextState = null;

		iTran pickedTran = tranPicks.get(nowState);
		if (pickedTran instanceof iSingleTran) {
			TransitionEdge<Character, Integer> t = ((iSingleTran) pickedTran).getTran();
			if (event != t.getInput())
				/* means we are buggy now */
				throw new RuntimeException("this is impossible");

			nextState = t.getTransition();

		} else if (pickedTran instanceof iMultiTran) {
			/* we are in condition cases */
			List<iSingleTran> trans = ((iMultiTran) pickedTran).getTrans();
			for (iSingleTran it: trans) {
				TransitionEdge<Character, Integer> t = it.getTran();
				if (event == t.getInput()) {
					nextState = t.getTransition();
					break;
				}
			}

		}

		if (nextState == null)
			throw new RuntimeException("this is impossible");

		return nextState;
	}

	protected String getFailedString() {
		return pastEventsStr + Character.toString(curEvent);
	}

	protected String pickInVar(Character c, String tag) {
		return apiFuncs.get(c).pickInVar(tag, varPicks);
	}

	protected String getOutVar(Character c, String tag) {
		return apiFuncs.get(c).getOutVar(tag);
	}

	protected int Extract(int high, int low, int v) {
		int ret = v >> low;
		int mask = 0;
		for (int i = 0; i <= (high - low); i++)
			mask = mask | (1 << i);
		return ret & mask;
	}

	protected boolean And(boolean ... args) {
		for (boolean arg : args)
			if (arg == false)
				return false;
		return true;
	}

	protected boolean Not(boolean t) {
		return !t;
	}

	protected Object getVarValue(String key) throws HarnessException {
		if (vars.containsKey(key))
			return vars.get(key);
		
		throw new BreakDataDepException("Use key: \"" + key + "\" before define it");
	}

	//protected Object putVar(String key, Object value) {
	//	vars.put(key, value);
	//}

	protected abstract void resetVars();

	protected abstract void runNextCall(Character nextCall) throws HarnessException;

	protected abstract Character checkCondTriggers(List<Character> conds) throws HarnessException;

	/* run harness once */
	public void run(File _inputFile, InputStream _input) throws HarnessException {

		input = _input;
		inputFile = _inputFile;
		resetVars();
		pastEventsStr = "";

		Integer nowState;

		nowState = initialPick;
		if (debug)
			System.out.println("pick initial state: " + iState.getStateId(nowState));

		do {
			Character happenedEvent = null;

			/* pickNextTransition */
			iTran nextTran = tranPicks.get(nowState);
			if (nextTran == null) {
				/* this means reaches the end of current nfa harness */
				if (debug)
					System.out.println("reaches the end of the nfa harness");
				break;
			}

			/* ///////////////////////////////////////////////
			// execution of nfa harness happens here //
			/////////////////////////////////////////////// */

			/* Where really executes the program and updates the variables */

			if (nextTran instanceof iSingleTran) {
				Character nextCall = ((iSingleTran) nextTran).getTran().getInput();

				if (debug)
					System.out.println("state " + iState.getStateId(nowState) + " picked next transition: " + nextCall + ", "
						+ iState.getStateId(((iSingleTran) nextTran).getTran().getTransition()));
				
				/* GENERATED FUNC EVENT CODE */
				runNextCall(nextCall);

				happenedEvent = nextCall;

			} else if (nextTran instanceof iMultiTran) {
				List<Character> conds = new ArrayList<Character>();

				for (iSingleTran st: ((iMultiTran)nextTran).getTrans())
					conds.add(st.getTran().getInput());

				/* GENERATED COND EVENT CODE */
				happenedEvent = checkCondTriggers(conds);

			} else {
				throw new RuntimeException("this is impossible");

			}

			pastEventsStr = pastEventsStr + Character.toString(happenedEvent);

			/* use happened event to update nfa status */
			Integer newState = toNextState(nowState, happenedEvent);
			if (debug)
				System.out.println("state trans from " + iState.getStateId(nowState) + " under " + happenedEvent + " to "
					+ iState.getStateId(newState));
			nowState = newState;

		} while (true);

	}

}

