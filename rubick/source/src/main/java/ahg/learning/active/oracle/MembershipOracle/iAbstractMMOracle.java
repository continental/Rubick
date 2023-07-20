package ahg.learning.active.oracle.MembershipOracle;

import java.util.Set;
import java.util.List;
import java.util.Collection;

import de.learnlib.api.query.Query;
import de.learnlib.api.oracle.MembershipOracle.DFAMembershipOracle;
import net.automatalib.words.Word;

public abstract class iAbstractMMOracle implements DFAMembershipOracle<Character> {

	protected boolean isTinkerStage;
	protected boolean isMergeStage;

	/* cache for dynamic validation results */
	public static Set<String> negativeCache = null;

	protected String getStringRepresentation(List<Character> list) {    
		StringBuilder builder = new StringBuilder(list.size());
		for(Character ch: list)
			builder.append(ch);

		return builder.toString();
	}

	protected boolean processOne(Word<Character> word, String str) {
		// only learn from pe (filter error cases of pe by dynamic testing)
		// if (matchPENFAs(word, str)) {
		// 	if (checkNegativePattern(word, str)) {
		// 		if (doDynamicValidation(word, str)) {
		// 			return true;
		// 		}
		// 	}
		// }
		// return false;

		// purely learn from dynamic testing
		// if (doDynamicValidation(word, str))
		// 	return true;
		// else 
		// 	return false;

		// learn from pe & dynamic testing
		if (isTinkerStage) {
			if (matchPENFAs(word, str)) {
				if (checkNegativePattern(word, str)) {
					if (doDynamicValidation(word, str)) {
						return true;
					}
				} else {
					System.out.println("Failed as negative patterns are matched");
				}
			}
			return false;

		} else if (isMergeStage) {
			if (matchPENFAs(word, str))
				return true;

		} else {
			throw new RuntimeException("impossible case");
		}

		// // learn under a scope related pe (filter error cases of pe by dynamic testing)
		// // if ( (matchPENFAs(word, str)) || (str.startsWith("yR$SR$D"))) {
		// if (matchPENFAs(word, str)) {
		// 	if (checkNegativePattern(word, str)) {
		// 		if (doDynamicValidation(word, str)) {
		//			return true;
		// 		}
		// 	}
		// }
		// return false;

		return false;
	}

	@Override
	public void processQueries(Collection<? extends Query<Character, Boolean>> queries) {
		for (Query<Character, Boolean> query : queries) {

			Word<Character> word = query.getInput();

			if (word.isEmpty()) {
				// empty string is always not acceptable
				query.answer(Boolean.FALSE);
				continue;
			}

			String str = getStringRepresentation(word.asList());

			System.out.println("MMQuery : \"" + str + "\"");

			/* try to match cache */
			boolean matchCache = false;
			Integer len = str.length();
			for (int i = 1; i <= len; i++) {
				String prefix = str.substring(0, i);
				if (negativeCache.contains(prefix)) {
					System.out.println("Failed: cached negative prefix: " + prefix);
					matchCache = true;
					break;
				}
			}
			if (matchCache) {
				System.out.println("Refuse " + str);
				query.answer(Boolean.FALSE);
				continue;
			}

			boolean accept = processOne(word, str);
			if (accept) {
				System.out.println("Accept : \"" + str + "\"");
				query.answer(Boolean.TRUE);
			} else {
				System.out.println("Reject : \"" + str + "\"");
				query.answer(Boolean.FALSE);
			}

		}
	}

	/* returns false when this word is finally NOT accepted */
	public abstract boolean checkNegativePattern(Word<Character> word, String str);

	public abstract boolean matchPENFAs(Word<Character> word, String str);

	public abstract boolean doDynamicValidation(Word<Character> word, String str);

}
