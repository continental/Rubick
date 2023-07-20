package ahg.learning.metainfo;

import org.json.simple.JSONObject;

public class iFuncOutMeta {

	public final String tag;
	public final String ty;

	public iFuncOutMeta(String _tag, String _ty) {
		tag = _tag;
		ty = _ty;
	}

	public String toString() {
		return "OUT(" + tag + ", " + ty + ")";
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("tag", tag);
		obj.put("type", ty);

		return obj;
	}

}
