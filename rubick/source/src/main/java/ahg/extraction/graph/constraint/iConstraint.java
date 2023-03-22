package ahg.extraction.graph.constraint;

import ahg.extraction.graph.expr.iExpr;
import org.json.simple.JSONObject;

public class iConstraint {

	// descrption of this constraint
	private iExpr expr;

	public iConstraint(iExpr _expr) {
		expr = _expr;
	}
	
	public JSONObject toJSON() {
		return expr.toJSON();
	}

	@Override
	public String toString() {
		return expr.toString();
	}

	// TODO: maybe add id for constraint later
}
