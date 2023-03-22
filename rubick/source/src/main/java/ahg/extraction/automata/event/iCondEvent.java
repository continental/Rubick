package ahg.extraction.automata.event;

import ahg.extraction.graph.constraint.iPaths;
import org.json.simple.JSONObject;

public class iCondEvent implements iEvent {
	private iPaths ipaths;

	public iCondEvent(iPaths _ipaths) {
		ipaths = _ipaths;
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "cond");
		obj.put("cond", ipaths.toJSON());
		return obj;
	}

	@Override
	public String toString() {
		return "⊤ " + ipaths.toString();
	}
}
