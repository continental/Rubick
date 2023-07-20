package ahg.extraction.automata.event;

import org.json.simple.JSONObject;

public class iCallAPIEvent implements iEvent {
	private String sig;

	public iCallAPIEvent(String _sig) {
		sig = _sig;
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "call");
		obj.put("func", sig);
		return obj;
	}

	@Override
	public String toString() {
		return sig;
	}
}
