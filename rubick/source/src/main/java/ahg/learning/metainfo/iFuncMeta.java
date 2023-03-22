package ahg.learning.metainfo;

import java.util.Set;

import com.google.gson.JsonObject;

import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

import org.json.simple.JSONObject;

import ahg.extraction.graph.expr.iExpr;
import soot.tagkit.ArtificialEntityTag;

public class iFuncMeta {

	private String sig;
	private String name;

	private HashMap<String, iFuncInMeta> ins;
	private HashMap<String, iFuncOutMeta> outs;

	private Set<String> tags;
	private List<String> args;
	private boolean _hasRet = false;
	private boolean _hasCls = false;
	private boolean _hasItrRet = false;
	public final boolean isStatic;

	// only loopvar mock func uses the following two
	private iExpr expr;
	private HashMap<String, String> argTable;
	private String code;

	public iFuncMeta(String _sig, String _nm, HashMap<String, iFuncInMeta> _ins, HashMap<String, iFuncOutMeta> _outs, boolean _isStatic, iExpr _expr, HashMap<String, String> _argTable) {
		this(_sig, _nm, _ins, _outs, _isStatic);
		expr = _expr;
		argTable = _argTable;
		code = expr.toCode(argTable);
	}

	public iFuncMeta(String _sig, String _nm, HashMap<String, iFuncInMeta> _ins, HashMap<String, iFuncOutMeta> _outs, boolean _isStatic, String _code) {
		this(_sig, _nm, _ins, _outs, _isStatic);
		code = _code;
	}

	public iFuncMeta(String _sig, String _nm, HashMap<String, iFuncInMeta> _ins, HashMap<String, iFuncOutMeta> _outs, boolean _isStatic) {
		sig = _sig;
		name = _nm;
		ins = _ins;
		outs = _outs;

		tags = new HashSet<String>();
		Set<String> _args = new HashSet<String>();

		_ins.forEach((k, v) -> {
			tags.add(k);

			if (k.startsWith("arg"))
				_args.add(k);

			if (k.equals("cls"))
				_hasCls = true;
		});

		_outs.forEach((k, v) -> {
			tags.add(k);

			if (k.equals("ret"))
				_hasRet = true;

			if (k.equals("itr"))
				_hasItrRet = true;
			
			if (_hasItrRet && (!_hasRet))
				throw new RuntimeException("_hasItrRet should implies _hasRet: " + sig);
		});

		args = new ArrayList<String>(_args);
		Collections.sort(args, (argA, argB) -> {
			Integer aIdx = Integer.parseInt(argA.substring(3));
			Integer bIdx = Integer.parseInt(argB.substring(3));
			return aIdx.compareTo(bIdx);
		});

		isStatic = _isStatic;

		expr = null;
		argTable = null;
		code = null;
	}

	public String getFuncName() {
		return name;
	}

	/*
	public List<String> getTags() {
		return tags;
	} 
	*/

	public HashMap<String, iFuncInMeta> getIns() {
		return ins;
	}

	public iFuncInMeta getIn(String tag) {
		return ins.get(tag);
	}

	public HashMap<String, iFuncOutMeta> getOuts() {
		return outs;
	}

	public iFuncOutMeta getOut(String tag) {
		return outs.get(tag);
	}

	public List<String> getArgs() {
		return args;
	}

	public boolean hasItrRet() {
		return _hasItrRet;
	}

	public boolean hasRet() {
		return _hasRet;
	}

	public boolean hasCls() {
		return _hasCls;
	}

	public String getCode() {
		return code;
	}

	public String toString() {
		List<String> strs = new ArrayList<String>();

		strs.add("SIG: " + sig + "\n");
		strs.add("NAME: " + name + "\n");

		ins.forEach((tag, in) -> {
			strs.add(in.toString() + "\n");
		});

		outs.forEach((tag, out) -> {
			strs.add(out.toString() + "\n");
		});

		strs.add("hasRet: " + _hasRet + "\n");
		strs.add("hasCls: " + _hasCls + "\n");
		strs.add("hasItrRet: " + _hasItrRet + "\n");
		strs.add("isStatic: " + isStatic + "\n");
		if (code != null) {
			//strs.add("expr: " + expr.toString() + "\n");
			strs.add("code: " + code + "\n");
			//strs.add("argTable: " + argTable.toString() + "\n");
		}

		return String.join("", strs);
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		obj.put("name", name);

		JSONObject jins = new JSONObject();
		ins.forEach((tag, in) -> {
			jins.put(tag, in.toJSON());
		});
		obj.put("ins", jins);

		JSONObject jouts = new JSONObject();
		outs.forEach((tag, out) -> {
			jouts.put(tag, out.toJSON());
		});
		obj.put("outs", jouts);

		obj.put("isStatic", isStatic);

		if (code != null) {
			// obj.put("expr", expr.toJSON());
			obj.put("code", code);
			// JSONObject jargTable = new JSONObject();
			// argTable.forEach((k, v) -> {
			// 	jargTable.put(k, v);
			// });
			// obj.put("argTable", jargTable);
		}

		return obj;
	}

}
