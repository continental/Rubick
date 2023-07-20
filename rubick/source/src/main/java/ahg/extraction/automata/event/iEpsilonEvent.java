package ahg.extraction.automata.event;

import org.json.simple.JSONObject;

public class iEpsilonEvent implements iEvent {
	private int index;

	public iEpsilonEvent(int _index) {
		index = _index;
	}

	@Override
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("type", "epsilon");
		obj.put("idx", String.valueOf(index));
		return obj;
	}

	@Override
	public String toString() {
		return "Ɛ" + index;
	}
}
