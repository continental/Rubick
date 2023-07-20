package ahg.harness.cfg.alphabet.letter;

import java.util.Set;
import java.util.HashMap;

import ahg.harness.cfg.alphabet.letter.iLetter;

public class iConstraintLetter extends iLetter {

	private String cond;
	private HashMap<String, Set<String>> related;
	private HashMap<String, Set<String>> refreshConDefs;

	public iConstraintLetter(String _cond, HashMap<String, Set<String>> _related, HashMap<String, Set<String>> _refreshConDefs) {
		cond = _cond;
		related = _related;
		refreshConDefs = _refreshConDefs;
	}

	public Set<String> getRelatedFuncSigs() {
		return related.keySet();
	}

	public HashMap<String, Set<String>> getRelated() {
		return related;
	}

	public Set<String> getRefreshCondDefsSigs() {
		return refreshConDefs.keySet();
	}

	public HashMap<String, Set<String>> getRefreshCondDefs() {
		return refreshConDefs;
	}

	@Override
	public String getContent() {
		return cond;
	}

	@Override
	public String toString() {
		return "<CLetter " + cond + " >";
	}

}
