package ahg.harness.cfg.api;

import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class iFuncIn implements Comparable<iFuncIn> {

	final public String id;

	final public Character event;
	final public String tag;

	// the var names that are accepted
	final public Set<String> accepted;

	final public String ty;

	public iFuncIn(Character _event, String _tag, String _ty, Set<String> _accepted) {
		event = _event;
		tag = _tag;
		ty = _ty;
		accepted = _accepted;

		id = Character.toString(event) + tag;
	}

	public String getId() {
		return id;
	}

	public Set<String> getAcceptedVars() {
		return accepted;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return id == ((iFuncIn) obj).getId();
	}

	@Override
	public int compareTo(iFuncIn i) {
		return id.compareTo(i.getId());
	}

	@Override
	public String toString() {
		return id;
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("tag", tag);
		obj.put("type", ty);

		JSONArray _acc = new JSONArray();
		accepted.forEach((e) -> {
			_acc.add(e);
		});
		obj.put("accepted", _acc);

		return obj;
	}

}