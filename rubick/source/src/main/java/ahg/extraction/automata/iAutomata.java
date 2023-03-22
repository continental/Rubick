package ahg.extraction.automata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import soot.util.dot.DotGraph;
import soot.util.dot.DotGraphEdge;

import ahg.extraction.automata.event.iEvent;

public class iAutomata {

	public String name;

	private int epsilonCount;

	private Set<String> initialStates;

	private Set<String> states;

	private Set<iEvent> alphabets;

	// from_state : to_state : event
	private HashMap<String, HashMap<String, iEvent>> trans;

	public iAutomata(String _name) {
		name = _name;
		epsilonCount = 0;
		initialStates = new HashSet<String>();
		states = new HashSet<String>();
		alphabets = new HashSet<iEvent>();
		trans = new HashMap<String, HashMap<String, iEvent>> ();
	}

	// return the next epsilon index
	public int addOneEpsilon() {
		epsilonCount += 1;
		return epsilonCount;
	}

	public void addInitialState(String i) {
		// if (initialState != null) 
		// 	throw new RuntimeException("ERROR: initial state already exists, existing: " + initialState + " , want to set: " + i);

		// states.add(i);
		// initialState = i;

		// UPDATED: we are extracting nfa, it is okay to have multiple initial states
		states.add(i);
		initialStates.add(i);
	}

	public boolean isInitialState(String i) {
		return initialStates.contains(i);
	}

	public void addState(String state) {
		states.add(state);
	}

	public void addTransition(String from, String to, iEvent event) {
		// if ( (! states.contains(from)) || (! states.contains(to)) )
		// 	throw new RuntimeException("ERROR: state " + from + " or state " + to + " doesn't exist!");

		states.add(from);
		states.add(to);
		alphabets.add(event);

		if (! trans.containsKey(from)) {
			HashMap<String, iEvent> val = new HashMap<String, iEvent>();
			trans.put(from, val);
		}

		if (trans.get(from).containsKey(to)) 
			throw new RuntimeException("the transtion from: " + from + " to: " + to + " already exists: " + trans.get(from).get(to));

		// logger.debug("add transtion from: " + from + " to: " + to + " event: " + event);
		trans.get(from).put(to, event);
	}

	public boolean containState(String state) {
		return states.contains(state);
	}

	public Set<iEvent> getAlphabets() {
		return new HashSet<iEvent>(alphabets);
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		JSONArray jinitialstates = new JSONArray();
		for (String state : initialStates) 
			jinitialstates.add(state);

		JSONArray jstates = new JSONArray();
		for (String state : states) 
			jstates.add(state);

		JSONArray jalphabets = new JSONArray();
		for (iEvent letter : alphabets) 
			jalphabets.add(letter.toJSON());

		JSONObject jtrans = new JSONObject();
		trans.forEach( (from, info) -> {
			JSONObject jinfo = new JSONObject();
			info.forEach( (to, event) -> {
				jinfo.put(to, event.toJSON());
				});
			jtrans.put(from, jinfo);
		});


		obj.put("name", name);
		obj.put("initial", jinitialstates);
		obj.put("states", jstates);
		obj.put("alphabets", jalphabets);
		obj.put("map", jtrans);

		return obj;
	}

	public void dotize(String dotfile) {
		DotGraph dot = new DotGraph(dotfile);
	
		// states.forEach(ele -> {
		// 	logger.debug("ele : " + ele);
		// });

        	// subgraph tricks to put the startNodes at top
        	DotGraph startNodes = dot.createSubGraph("startNodes");
        	startNodes.setGraphAttribute("rank", "source");
		initialStates.forEach(ele -> {
        		startNodes.drawNode(ele);
		});

		states.forEach(ele -> {
		    dot.drawNode(ele);
		});

		trans.forEach((from, d) -> {
			d.forEach((to, event) -> {
				DotGraphEdge edge = dot.drawEdge(from, to);
				edge.setAttribute("label", "\"" + event + "\"");
			});
		});

		try {

            		if (dotfile.equals("-"))
			    dot.render(System.out, 2);
			else
			    dot.plot(dotfile);
	    
		} catch (Exception ex) {
	    
			throw new RuntimeException("ERROR: dotize " + ex.getMessage());
	    
		}
	}
}
