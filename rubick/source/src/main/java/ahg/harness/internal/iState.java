package ahg.harness.internal;

import java.util.HashMap;

public class iState implements Comparable<iState> {

	protected static HashMap<Integer, String> stateIDMap = null;
	protected static HashMap<String, Integer> iDStateMap = null;

	public static void setStateIDMap(HashMap<Integer, String> _stateIDMap) {
		stateIDMap = _stateIDMap;

		iDStateMap = new HashMap<>();
		stateIDMap.forEach((st, id) -> {
			iDStateMap.put(id, st);
		});
	}
	
	public static Integer getStateFromId(String id) {
		return iDStateMap.get(id);
	}

	public static String getStateId(Integer i) {
		return stateIDMap.get(i);
	}

	// number of the state when loaded
	private Integer no;

	// state id marked by configuration
	// every state should have an unique id
	private String id;

	public iState(Integer _no) {
		no = _no;
		id = getStateId(_no);

		if (id == null)
			throw new RuntimeException("id for state " + no + " is null");
	}

	public Integer getNO() {
		return no;
	}

	@Override
	public int compareTo(iState s) {
		return id.compareTo(id);
	}

	@Override
	public int hashCode() {
		return no;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return no == ((iState) obj).no;
	}

	@Override
	public String toString() {
		return id;
	}
}
