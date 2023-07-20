package ahg.extraction.graph.expr;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

import org.json.simple.JSONObject;

public class iValueExpr implements iExpr {
	private String value;
	private boolean tainted = false;

	public iValueExpr(String _value, boolean _tainted) {
		value = _value.strip();
		tainted = _tainted;
	}

	public boolean isTainted() {
		return tainted;
	}

	public boolean hasUntrackedLocal() {
		return value.equals(PropagateLocalValueSwitch.RECT_SIGN);
	}

	public Set<String> getTaintSrcs() {
		Set<String> tSrcs = new HashSet<>();

		if (tainted)
			tSrcs.add(value);

		return tSrcs;
	}

	public String isJustTheTaintValue() {
		if (tainted)
			return value;
		else
			return null;
	}

	public String toCode(HashMap<String, String> argTable) {
		if (tainted) {
			return argTable.get(value);
		} else
			return value;
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "valueexpr");
		obj.put("value", value);

		return obj;
	}

	@Override
	public String toString() {
		return value;
	}
}
