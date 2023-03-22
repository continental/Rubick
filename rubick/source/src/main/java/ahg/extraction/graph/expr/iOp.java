package ahg.extraction.graph.expr;
import org.json.simple.JSONObject;

public interface iOp {
	JSONObject toJSON();

	String toCode();

	@Override
	String toString();
}
