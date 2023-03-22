package ahg.learning.metainfo;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

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

public class iMetaInfo {

	private List<iDataDep> dataDeps;
	private HashMap<String, iFuncMeta> funcMetas;

	public iMetaInfo(List<iDataDep> _dataDeps, HashMap<String, iFuncMeta> _funcMetas) {
		dataDeps = _dataDeps;
		funcMetas = _funcMetas;
	}

	public List<iDataDep> getDataDeps() {
		return dataDeps;
	}

	public iFuncMeta getIFuncMeta(String sig) {
		return funcMetas.get(sig);
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();

		JSONObject jFuncMetas = new JSONObject();
		funcMetas.forEach((sig, fm) -> {
			jFuncMetas.put(sig, fm.toJSON());
		});
		obj.put("funcMeta", jFuncMetas);

		JSONArray jDataDeps = new JSONArray(); 
		dataDeps.forEach((dd) -> {
			jDataDeps.add(dd.toJSON());
		});
		obj.put("dataDeps", jDataDeps);

		return obj;
	}

	static public iMetaInfo loadMetaInfoFromFile(String metaInfoFile) {
		List<iDataDep> _dataDeps = new ArrayList<iDataDep>();
		HashMap<String, iFuncMeta> _funcMetas = new HashMap<String, iFuncMeta>();

		JSONParser parser = new JSONParser();

		try (Reader reader = new FileReader(metaInfoFile)) {

			JSONObject obj = (JSONObject) parser.parse(reader);

			JSONObject _fms = (JSONObject) obj.get("funcMeta");
			_fms.forEach((k, v) -> {
				iFuncMeta _fm = null;

				String _sig = (String)k;
				JSONObject _meta = (JSONObject)v;

				String _nm = (String) _meta.get("name");
				boolean _isStatic = (boolean) _meta.get("isStatic");

				JSONObject _raw_ins = (JSONObject) _meta.get("ins");
				HashMap<String, iFuncInMeta> _ins = new HashMap<String, iFuncInMeta>();
				_raw_ins.forEach((ik, iv) -> {
					String _tag = (String)ik;
					JSONObject _inmeta = (JSONObject)iv;
					String _ty = (String) _inmeta.get("type");

					_ins.put(_tag, new iFuncInMeta(_tag, _ty));
				});

				JSONObject _raw_outs = (JSONObject) _meta.get("outs");
				HashMap<String, iFuncOutMeta> _outs = new HashMap<String, iFuncOutMeta>();
				_raw_outs.forEach((ik, iv) -> {
					String _tag = (String)ik;
					JSONObject _outmeta = (JSONObject)iv;
					String _ty = (String) _outmeta.get("type");

					_outs.put(_tag, new iFuncOutMeta(_tag, _ty));
				});

				if (_nm.contains("_LOOPVAR_")) {
					String _code = (String) _meta.get("code");
					_fm = new iFuncMeta(_sig, _nm, _ins, _outs, _isStatic, _code);
				} else 
					_fm = new iFuncMeta(_sig, _nm, _ins, _outs, _isStatic);

				_funcMetas.put(_sig, _fm);
			});

			JSONArray _dds = (JSONArray) obj.get("dataDeps");
			_dds.forEach((e) -> {
				JSONArray _raw_dd = (JSONArray)e;
				String _frm = (String) _raw_dd.get(0);
				String _ftag = (String) _raw_dd.get(1);
				String _to = (String) _raw_dd.get(2);
				String _ttag = (String) _raw_dd.get(3);
				String _cmmt = (String) _raw_dd.get(4);

				iDataDep _dd = new iDataDep(_frm, _ftag, _to, _ttag, _cmmt);
				_dataDeps.add(_dd);
			});

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");

		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("meet json ParseException");

		}

		return new iMetaInfo(_dataDeps, _funcMetas);
	}

	static public void dumpMetaInfoToJSON(iMetaInfo meta, String metaFile) {
		JSONObject obj = meta.toJSON();

		if (metaFile == null) {
			System.out.println(obj);

		} else {
			try {
				File fout = new File(metaFile);
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
