package ahg.harness.cfg.alphabet.letter;

import java.util.Set;
import java.util.List;
import java.util.HashMap;

public abstract class iLetter {

	@Override
	public abstract String toString();

	public abstract String getContent();

	public static iLetter createILetter(String ty, String detail, HashMap<String, Set<String>> related, HashMap<String, Set<String>> refreshConDefs) {
		if (ty.equals("F")) {
			return new iAPILetter(detail);

		} else if (ty.equals("Z")) {
			return new iConstraintLetter(detail, related, refreshConDefs);

		} else {
			throw new RuntimeException("invalid ty " + ty + " for iLetter");

		}
	} 

}
