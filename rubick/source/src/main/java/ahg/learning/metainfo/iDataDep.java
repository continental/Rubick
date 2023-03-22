package ahg.learning.metainfo;

import java.util.Set;

import org.json.simple.JSONArray;
import ahg.extraction.graph.expr.iExpr;

public class iDataDep {

	public final String frmFuncSig;
	public final String frmTag;

	public final String toFuncSig;
	public final String toTag;

	public final String comment;

	public final boolean isFromRet;

	public iDataDep(String _frm, String _ftag, String _to, String _ttag, String _comment) {
		frmFuncSig = _frm;
		frmTag = _ftag;

		toFuncSig = _to;
		toTag = _ttag;

		comment = _comment;
		isFromRet = frmTag.equals("ret");
	}

	public iDataDep(iExpr expr, String _to, String _ttag) {
		// TODO: this can be refined
		Set<String> tSrcs = expr.getTaintSrcs();
		String chosen = null;
		for (String tSrc : tSrcs) {
			if (tSrc.endsWith(".RET") || tSrc.endsWith(".ITR")) {
				chosen = tSrc;
				break;
			}
		}

		if (chosen != null) {
			if (chosen.endsWith(".RET")) {
				frmFuncSig = chosen.replaceAll("\\.RET$", "");
				frmTag = "ret";
			} else if (chosen.endsWith(".ITR")) {
				frmFuncSig = chosen.replaceAll("\\.ITR$", "");
				frmTag = "itr";
			} else {
				frmFuncSig = "";
				frmTag = "";
				throw new RuntimeException("impossible case");
			}
		} else {
			frmFuncSig = "";
			frmTag = "";
		}

		toFuncSig = _to;
		toTag = _ttag;

		comment = expr.toString();
		isFromRet = frmTag.equals("ret");
	}

	public String toString() {
		return "(" + frmFuncSig + ", " + frmTag + ")=>(" + toFuncSig + ", " + toTag + ") " + comment;
	}

	public JSONArray toJSON() {
		JSONArray arr = new JSONArray();

		arr.add(frmFuncSig);
		arr.add(frmTag);
		arr.add(toFuncSig);
		arr.add(toTag);
		arr.add(comment);

		return arr;
	}

}