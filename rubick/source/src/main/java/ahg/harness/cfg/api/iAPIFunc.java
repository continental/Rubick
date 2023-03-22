package ahg.harness.cfg.api;

import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class iAPIFunc {
	// letter of this func 
	private Character c;

	private String funcName;
	private HashMap<String, iFuncIn> ins;
	private HashMap<String, iFuncOut> outs;

	public iAPIFunc(Character _c, String _nm, HashMap<String, iFuncIn> _ins, HashMap<String, iFuncOut> _outs) {
		c = _c;
		funcName = _nm;
		ins = _ins;
		outs = _outs;
	}

	public String pickInVar(String tag, HashMap<iFuncIn, String> varPicks) {
		return varPicks.get(ins.get(tag));
	}

	public Set<String> getAPIOutVars() {
		Set<String> outVars = new HashSet<String>();

		outs.forEach((k, v) -> {
			outVars.add(v.getVar());
		});

		return outVars;
	}

	public String getOutVar(String tag) {
		return outs.get(tag).getVar();
	}

	public Collection<iFuncIn> getAPIFuncIns() {
		return ins.values();
	}

	public String toString() {
		List<String> rets = new ArrayList<String>();

		rets.add("Character: '" + Character.toString(c) + "'\n");
		rets.add("FuncName: '" + funcName + "'\n");

		rets.add("Ins:\n");
		ins.forEach((tag, fi) -> {
			rets.add("\t tag:" + fi.tag + "\n");
			rets.add("\t type:" + fi.ty + "\n");
			rets.add("\t accepted:" + fi.accepted + "\n");
			rets.add("\n");
		});

		rets.add("Outs:\n");
		outs.forEach((tag, fo) -> {
			rets.add("\t tag:" + fo.tag + "\n");
			rets.add("\t type:" + fo.ty + "\n");
			rets.add("\t var:" + fo.var + "\n");
			rets.add("\n");
		});

		return String.join("", rets);
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("funcName", funcName);

		JSONObject insObj = new JSONObject();
		ins.forEach((tag, in) -> {
			insObj.put(tag, in.toJSON());
		});
		obj.put("ins", insObj);

		JSONObject outsObj = new JSONObject();
		outs.forEach((tag, out) -> {
			outsObj.put(tag, out.toJSON());
		});
		obj.put("outs", outsObj);

		return obj;
	}

	static public HashMap<Character, iAPIFunc> loadAPIFuncsFromFile(String apiFile) {
		HashMap<Character, iAPIFunc> apiFuncs = new HashMap<Character, iAPIFunc>();

		JSONParser parser = new JSONParser();

		try (Reader reader = new FileReader(apiFile)) {

			JSONObject obj = (JSONObject) parser.parse(reader);
			obj.forEach((k,v) -> {

				HashMap<String, iFuncIn> inMap = new HashMap<String, iFuncIn>();
				HashMap<String, iFuncOut> outMap = new HashMap<String, iFuncOut>();

				String event = (String)k;
				if (event.length() != 1) {
					throw new RuntimeException("event string length is not 1: " + event);
				}
				Character c = event.charAt(0);

				String _funcName = (String) ((JSONObject) (v)).get("funcName");

				JSONObject _ins = (JSONObject) ((JSONObject) (v)).get("ins");
				JSONObject _outs = (JSONObject) ((JSONObject) (v)).get("outs");

				_ins.forEach((ik, iv) -> {
					JSONObject _in = (JSONObject) iv;
					String tag = (String) _in.get("tag");
					String ty = (String) _in.get("type");
					JSONArray _accepted = (JSONArray) _in.get("accepted");
					Set<String> accepted = new HashSet<String>();
					_accepted.forEach((a) -> {
						accepted.add((String) a);
					});

					iFuncIn in = new iFuncIn(c, tag, ty, accepted);
					inMap.put(tag, in);
				});

				_outs.forEach((ok, ov) -> {
					JSONObject _out = (JSONObject) ov;
					String tag = (String) _out.get("tag");
					String var = (String) _out.get("var");
					String ty = (String) _out.get("type");

					iFuncOut out = new iFuncOut(c, var, tag, ty);
					outMap.put(tag, out);
				});

				iAPIFunc f = new iAPIFunc(c, _funcName, inMap, outMap);

				apiFuncs.put(c, f);
			});

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");

		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("meet json ParseException");

		}

		return apiFuncs;
	}

	static public void dumpAPIFuncsToJSON(HashMap<Character, iAPIFunc> apiFuncs, String jsonFile) {
		JSONObject obj = new JSONObject();

		apiFuncs.forEach((k, v) -> {
			obj.put(k, v.toJSON());
		});

		if (jsonFile == null) {
			System.out.println(obj);
		} else {
			try {
				File fout = new File(jsonFile);
				FileOutputStream fos = new FileOutputStream(fout);
			 
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

				obj.writeJSONString(bw);
			 
				bw.close();

			} catch (Exception ex) {
				throw new RuntimeException("ERROR: output json: " + ex.getMessage());

			}
		}
	}

}
