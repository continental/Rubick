package ahg.execution.jshellrepl;

import java.util.HashMap;

import javax.script.*;

public class JShellExecutor {

	private static String[] jars = {};

	public static boolean hasInitialized = false;
	private static ScriptEngine engine = null;
	private static ScriptEngineManager manager = null;

	public static boolean hasCompiled = false;
	private static CompiledScript compiledScript = null;

	public static void initialize(String[] _jars) {
		// register engine
		JShellScriptEngineFactory fac = new JShellScriptEngineFactory();
		manager = new ScriptEngineManager();
		/* System.out.println("factories: " + manager.getEngineFactories()); */
		manager.registerEngineName("jshell", fac);
		/* System.out.println("factories: " + manager.getEngineFactories()); */

		// set additional jar class path (for testing target)
		if (_jars != null)
			jars = _jars;

		JShellCompiledScript.setJars(jars);

		engine = manager.getEngineByName("jshell");

		hasInitialized = true;
	}

	public static String directEval(String code) {
		String errorString = null;

		try {
			Object result = engine.eval(code);
			// System.out.println("eval result is " + result);
			errorString = (String) result;

		//} catch (ScriptException e) {
		} catch (Throwable e) {
			e.printStackTrace();
			throw new RuntimeException("catched throwable during eval: " + e);

		}

		return errorString;
	}

	public static void compile(String code) {
		Compilable compiler = (Compilable) engine;

		try {
			compiledScript = compiler.compile(code);

		} catch (ScriptException ex) {
			ex.printStackTrace();
			throw new RuntimeException("failed to compile: " + ex);

		}

		hasCompiled = true;
	}

	public static String eval(HashMap<String, Object> varMap) {

        	String errorString = null;

        	Bindings bindings = engine.createBindings();
		bindings.putAll(varMap);

		try {
        		compiledScript.eval(bindings);
			errorString = (String) bindings.get("errorString");

		} catch (Throwable e) {
			e.printStackTrace();
			throw new RuntimeException("catched throwable during eval: " + e);

		}

		System.out.println("evaluation result is " + errorString);
		return errorString;
	}

	public static void main(String[] jars, String code) {

		// // harness execution stage
		// HashMap<String, Object> varMap = new HashMap<String, Object>();
		// varMap.put("errorString", null);
		// varMap.put("PARAMETER_CFNO", 0);
		// varMap.put("PARAMETER_DFNO", 0);
		// varMap.put("PARAMETER_ALPHABET", fullAlphabetFile);
		// varMap.put("PARAMETER_NFA", outNfa);
		// varMap.put("PARAMETER_APIFUNC", outApiFuncs);
		// varMap.put("PARAMETER_INPUT", inputFiles);

		// if (!JShellExecutor.hasInitialized)
		// 	JShellExecutor.initialize(null);

		// if (!JShellExecutor.hasCompiled) 
		// 	// the generated code is same, however the tempnfa & tempApiFuncs are different for each time
		// 	JShellExecutor.compile(harnessCode);

		// errorString = JShellExecutor.eval(varMap);

		// ex for direct eval
		if (!hasInitialized)
			initialize(jars);
		directEval(code);

		// ex for compile & eval
		//if (!hasInitialized)
		//	initialize(jars);
		//if (!hasCompiled)
		//	compile(code);
		//eval(null);
	}

}
