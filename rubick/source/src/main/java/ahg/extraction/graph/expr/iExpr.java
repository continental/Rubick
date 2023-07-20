package ahg.extraction.graph.expr;

import java.util.Set;
import java.util.HashMap;
import org.json.simple.JSONObject;

public interface iExpr {

	JSONObject toJSON();

	@Override
	String toString();

	boolean isTainted();

	boolean hasUntrackedLocal();

	Set<String> getTaintSrcs();

	String isJustTheTaintValue();

	String toCode(HashMap<String, String> argTable);

}
