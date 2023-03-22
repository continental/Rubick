package ahg.extraction.graph.expr;
import org.json.simple.JSONObject;

public class iUnOp implements iOp {
	
	private String op = null;

	public iUnOp(String _op) {
		op = _op;
	}

	public boolean isCast() {
		return op.startsWith("CAST ");
	}

	public String toCode() {
		if (isCast()) {
			String _op = op.substring(5);
			return "(" + _op + ")";
		} else 
			return op;
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "unop");
		obj.put("op", op);

		return obj;
	}

	@Override
	public String toString() {
		return op;
	}
}
