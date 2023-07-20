package ahg.extraction.graph.expr;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

import org.json.simple.JSONObject;

public class iBinExpr implements iExpr {
	private iBinOp opr;
	private iExpr lop;
	private iExpr rop;

	public iBinExpr(iBinOp _opr, iExpr _lop, iExpr _rop) {
		opr = _opr;
		lop = _lop;
		rop = _rop;
	}

	public boolean isTainted() {
		return lop.isTainted() || rop.isTainted();
	}

	public boolean hasUntrackedLocal() {
		return lop.hasUntrackedLocal() || rop.hasUntrackedLocal();
	}

	public Set<String> getTaintSrcs() {
		Set<String> tSrcs = lop.getTaintSrcs();
		tSrcs.addAll(rop.getTaintSrcs());
		return tSrcs;
	}

	public String isJustTheTaintValue() {
		return null;
	}

	public String toCode(HashMap<String, String> argTable) {
		return "(" + lop.toCode(argTable) + opr.toCode() + rop.toCode(argTable) + ")";
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "binexpr");
		obj.put("opr", opr.toJSON());
		obj.put("lop", lop.toJSON());
		obj.put("rop", rop.toJSON());

		return obj;
	}

	@Override
	public String toString() {
		// System.out.println("lop: " + lop);
		// System.out.println("opr: " + opr);
		// System.out.println("rop: " + rop);
		return lop.toString() + opr.toString() + rop.toString();
	}
}
