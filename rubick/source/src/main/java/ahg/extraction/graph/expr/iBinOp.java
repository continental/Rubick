package ahg.extraction.graph.expr;
import org.json.simple.JSONObject;

public class iBinOp implements iOp {

	private String op = null;

	public iBinOp(String _op) {
		op = _op;
	}

	public String toCode() {
		return op;
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "binop");
		obj.put("op", op);

		return obj;
	}

	@Override
	public String toString() {
		return op;
	}
}
