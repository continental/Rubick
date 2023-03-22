package ahg.extraction.graph.expr;

import java.util.Set;

import javax.lang.model.util.ElementScanner6;

import java.util.HashSet;
import java.util.HashMap;

import org.json.simple.JSONObject;

public class iUnExpr implements iExpr {
	private iUnOp opr;
	private iExpr op;

	public iUnExpr(iUnOp _opr, iExpr _op) {
		opr = _opr;
		op = _op;
	}

	public boolean isTainted() {
		return op.isTainted();
	}

	public boolean hasUntrackedLocal() {
		return op.hasUntrackedLocal();
	}

	public Set<String> getTaintSrcs() {
		return op.getTaintSrcs();
	}

	public String isJustTheTaintValue() {
		if (opr.isCast())
			return op.isJustTheTaintValue();
		else
			return null;
	}

	public String toCode(HashMap<String, String> argTable) {
		return "(" + opr.toCode() + op.toCode(argTable) + ")";
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "unexpr");
		obj.put("opr", opr.toJSON());
		obj.put("op", op.toJSON());

		return obj;
	}

	@Override
	public String toString() {
		return opr.toString() + op.toString();
	}	
}
