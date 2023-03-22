package ahg.learning.metainfo;

import org.json.simple.JSONObject;

public class iFuncInMeta {

	final public String tag;
	final public String ty;

	public iFuncInMeta(String _tag, String _ty) {
		tag = _tag;
		ty = _ty;
	}

	public String toString() {
		return "IN(" + tag + ", " + ty + ")";
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("tag", tag);
		obj.put("type", ty);

		return obj;
	}

}
