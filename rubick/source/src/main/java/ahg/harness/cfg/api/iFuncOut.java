package ahg.harness.cfg.api;

import org.json.simple.JSONObject;

public class iFuncOut implements Comparable<iFuncOut> {

	final public String id;

	final public Character event;
	// the var name this func out represents
	final public String tag;
	final public String ty;

	final public String var;

	public iFuncOut(Character _event, String _var, String _tag, String _ty) {
		event = _event;
		var = _var;
		tag = _tag;
		ty = _ty;

		id = Character.toString(event) + tag;
	}

	public String getId() {
		return id;
	}

	public String getVar() {
		return var;
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
		return id == ((iFuncOut) obj).getId();
	}

	@Override
	public int compareTo(iFuncOut i) {
		return id.compareTo(i.getId());
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("tag", tag);
		obj.put("type", ty);
		obj.put("var", var);

		return obj;
	}

}
