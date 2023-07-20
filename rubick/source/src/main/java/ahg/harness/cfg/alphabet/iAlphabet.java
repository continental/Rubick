package ahg.harness.cfg.alphabet;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.AbstractMap.SimpleEntry;

import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import net.automatalib.words.Alphabet;
import net.automatalib.words.impl.Alphabets;

import ahg.harness.cfg.alphabet.letter.iLetter;
import ahg.harness.cfg.alphabet.letter.iAPILetter;

public class iAlphabet {

	private Alphabet<Character> alphabet;
	private HashMap<Character, iLetter> alias2letter;
	private HashMap<Map.Entry<String,String>, String> def2var;
	private HashMap<String, Character> funcSig2Alias;

	public iAlphabet(Alphabet<Character> _al, HashMap<Character, iLetter> _a2l, HashMap<Map.Entry<String, String>, String> _d2v, HashMap<String, Character> _fs2a) {
		alphabet = _al;
		alias2letter = _a2l;
		def2var = _d2v;
		funcSig2Alias = _fs2a;
	}

	public Alphabet<Character> getAlphabet() {
		return alphabet;
	}

	public HashMap<Character, iLetter> getAlias2Letter() {
		return alias2letter;
	}

	public iLetter getLetter(Character alias) {
		return alias2letter.get(alias);
	}

	public Character getFuncAlias(String funcSig) {
		return funcSig2Alias.get(funcSig);
	}

	// the input events must be guaranteed that in the original alphabet
	public iAlphabet createSubIAlphabet(Set<Character> events) {
		Alphabet<Character> _al = Alphabets.fromList(new ArrayList<Character>(events));
		HashMap<Character, iLetter> _a2l = new HashMap<>();
		HashMap<Map.Entry<String, String>, String> _d2v = new HashMap<>();
		HashMap<String, Character> _f2a = new HashMap<>();

		// System.out.println("events: " + events);

		alias2letter.forEach((a, l) -> {
			if (events.contains(a))
				_a2l.put(a, l);
		});

		// System.out.println("a2l: " + _a2l);

		funcSig2Alias.forEach((f, a) -> {
			if (events.contains(a))
				_f2a.put(f, a);
		});

		// System.out.println("f2a: " + _f2a);

		def2var.forEach((d, v) -> {
			if (_f2a.containsKey(d.getKey()))
				_d2v.put(d, v);
		});

		// System.out.println("d2v: " + _d2v);
		return new iAlphabet(_al, _a2l, _d2v, _f2a);
	}

	// TODO: remove this later, not used anymore
	public boolean isInThisLetterGroup(List<Character> group, Character c) {
		if (Character.isLowerCase(c)) {
			for (Character _c : group) {
				if (! Character.isLowerCase(_c))
					return false;
			}

			return true;
		}

		return false;
	}

	public HashMap<Map.Entry<String, String>, String> getDef2Var() {
		return def2var;
	}

	public String getAllVarsInString(String funcSig) {
		List<String> tags = new ArrayList<>();
		List<String> vars = new ArrayList<>();
		List<String> rslts = new ArrayList<>();

		def2var.forEach((d, v) -> {
			if (d.getKey().equals(funcSig))
				tags.add(d.getValue());
		});
		Collections.sort(tags);
		tags.forEach((tag) -> {
			vars.add(def2var.get(new SimpleEntry<String, String>(funcSig, tag)));
		});
		for (int i = 0; i < tags.size(); i++) {
			rslts.add( vars.get(i) + "(" + tags.get(i) + ")" );
		}

		return String.join(", ", rslts);
	}

	public List<Map.Entry<String, String>> getVars(String funcSig) {
		List<Map.Entry<String, String>> tagVars = new ArrayList<>();
		def2var.forEach((d, v) -> {
			if (d.getKey().equals(funcSig))
				tagVars.add(new SimpleEntry<String, String>(d.getValue(), v));

		});

		return tagVars;
	}

	public String getVar(String funcSig, String tag) {
		return def2var.get(new SimpleEntry<String, String>(funcSig, tag));
	}

	public static iAlphabet createFromFile(String alphabetFile) {
		Alphabet<Character> _al = null;
		HashMap<Character, iLetter> _a2l = new HashMap<Character, iLetter>();
		HashMap<Map.Entry<String, String>, String> _d2v = new HashMap<>();
		HashMap<String, Character> _fs2a = new HashMap<String, Character>();

		List<Character> events = new ArrayList<Character>();
		JSONParser parser = new JSONParser();

		try (Reader reader = new FileReader(alphabetFile)) {
	
			JSONObject obj = (JSONObject) parser.parse(reader);
			// System.out.println(obj);
			// obj.forEach((k,v) -> {
			// 	System.out.println("k: " + k + ", v: " + v);
			// });

			JSONObject alias2letter = (JSONObject) obj.get("alias2event");
			alias2letter.forEach((k,v) -> {
				// System.out.println("k: " + k + ", v: " + v);
				String e = (String)k;
				if (e.length() != 1) {
					throw new RuntimeException("event string length is not 1: " + e);
				}
				Character c = e.charAt(0);
				events.add(c);

				String ty = (String) ((JSONArray) v).get(0);
				String detail = (String) ((JSONArray) v).get(1);
				HashMap<String, Set<String>> related = null;
				HashMap<String, Set<String>> refreshCondDefs = null;
				if (((JSONArray) v).size() > 2) {
					related = new HashMap<>();
					JSONArray arr = (JSONArray) ((JSONArray) v).get(2);
					for (int i = 0; i < arr.size(); i++) {
						String rawFuncSig = (String) arr.get(i);
						if (!rawFuncSig.endsWith(".RET"))
							if (!rawFuncSig.endsWith(".ITR"))
								throw new RuntimeException("not a valid func sig ret");

						String realFuncSig = rawFuncSig.substring(0, rawFuncSig.length() - 4);

						Set<String> tags = null;
						if (related.containsKey(realFuncSig))
							tags = related.get(realFuncSig);
						else
							tags = new HashSet<>();

						if (rawFuncSig.endsWith(".RET"))
							tags.add("ret");

						if (rawFuncSig.endsWith(".ITR"))
							tags.add("itr");

						related.put(realFuncSig, tags);

						// System.out.println("When parsing, letter " + c + ", cnt: " + detail + ", related[funcSig]: " + related.get(funcSig));
						// System.out.println("When parsing, letter " + c + ", cnt: " + detail + ", funcSig: " + realFuncSig + ", tags: " + tags);
					}

					refreshCondDefs = new HashMap<>();
					arr = (JSONArray) ((JSONArray) v).get(3);
					for (int i = 0; i < arr.size(); i++) {
						String rawFuncSig = (String) arr.get(i);
						if (!rawFuncSig.endsWith(".RET"))
							if (!rawFuncSig.endsWith(".ITR"))
								throw new RuntimeException("not a valid func sig ret");

						String realFuncSig = rawFuncSig.substring(0, rawFuncSig.length() - 4);

						Set<String> tags = null;
						if (refreshCondDefs.containsKey(realFuncSig))
							tags = refreshCondDefs.get(realFuncSig);
						else
							tags = new HashSet<>();

						if (rawFuncSig.endsWith(".RET"))
							tags.add("ret");

						if (rawFuncSig.endsWith(".ITR"))
							tags.add("itr");

						refreshCondDefs.put(realFuncSig, tags);

						// System.out.println("When parsing, letter " + c + ", cnt: " + detail + ", refreshCondDefs[funcSig]: " + refreshCondDefs.get(funcSig));
						// System.out.println("When parsing, letter " + c + ", cnt: " + detail + ", funcSig: " + realFuncSig + ", tags: " + tags);
					}
				}

				iLetter l = iLetter.createILetter(ty, detail, related, refreshCondDefs);

				_a2l.put(c, l);

				if (l instanceof iAPILetter)
					_fs2a.put(((iAPILetter)l).getContent(), c);

			});
	
			JSONObject def2var = (JSONObject) obj.get("def2var");
			def2var.forEach((_k,v) -> {
				// remove the taint prefix or suffix to get the function signature
				String k = (String)_k;
				String sig;
				String tag;

				if (k.endsWith(".RET")) {
					sig = k.substring(0, k.length() - 4);
					tag = "ret";
				} else if (k.endsWith(".ITR")) {
					sig = k.substring(0, k.length() - 4);
					tag = "itr";
				} else {
					sig = k;
					tag = "";
				}

				// System.out.println("When parsing, sig: " + sig + ", tag: " + tag + ", var: " + v);
				_d2v.put(new SimpleEntry<String, String>(sig, tag), (String)v);

			});

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");

		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("meet json ParseException");

		}

		_al = Alphabets.fromList(events);

		// System.out.println("When parsing, def2var is " + _d2v);
		return new iAlphabet(_al, _a2l, _d2v, _fs2a);
	}

}