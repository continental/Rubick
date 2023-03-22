package ahg.extraction.automata.event;

import org.json.simple.JSONObject;

public interface iEvent {

	JSONObject toJSON();

	@Override
	String toString();

}
