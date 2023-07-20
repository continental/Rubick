package cmdline.subcommand;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import org.json.simple.JSONObject;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.nio.file.Files;
import java.nio.file.Paths;

import ahg.extraction.UsageGraph;
import ahg.extraction.automata.event.iEvent;
import ahg.extraction.automata.iAutomata;
import ahg.extraction.graph.expr.iExpr;
import ahg.extraction.graph.expr.iValueExpr;
import ahg.extraction.graph.iGraph;

import ahg.learning.metainfo.iDataDep;
import ahg.learning.metainfo.iFuncMeta;
import ahg.learning.metainfo.iMetaInfo;
import ahg.learning.metainfo.iFuncInMeta;
import ahg.learning.metainfo.iFuncOutMeta;

import soot.*;
import soot.jimple.AssignStmt;
import soot.jimple.InvokeExpr;
import soot.jimple.JimpleBody;
import soot.jimple.NewExpr;
import soot.jimple.Stmt;
import soot.jimple.toolkits.ide.icfg.JimpleBasedInterproceduralCFG;
import soot.options.Options;
import soot.toolkits.scalar.UnitValueBoxPair;
import static soot.util.dot.DotGraph.DOT_EXTENSION;

/*

Examples:

bash run.sh ex \
	-j '' \
	-p '' \
	-e '' \
	-t '' \
	-o ''

bash run.sh ex \
	-j './jars' \
	-p 'org\.jgl\.io\.compress\.archivers.*' \
	-e '.*' \
	-t 'org\.apache\.commons\.compress\.archivers\.sevenz.*' \
	-o 'extracted/Java_Generic_Libraries_4.3.0.jar'

	-j './jars/Java_Generic_Libraries_4.3.0.jar' \
	// -e '.*SevenZipUtils\.unpack' \

bash run.sh ex \
	-j './jars/ACCManager-3.0.3/BOOT-INF' \
	-p 'ACC\.sharedmemory.*' \
	-e '.*' \
	-t 'org\.apache\.commons\.compress\.archivers\.sevenz.*' \
	-o 'extracted/ACCManager-3.0.3'

	// -j './jars/ACCManager-3.0.3/BOOT-INF/classes' \
	// -e '.*ACCSharedMemory\.decompress' \

bash run.sh ex \
	-j './jars/LightSolution_WebSocket-0.0.1/BOOT-INF/classes' \
	-p 'com\.posmania\.kr\.Handler.*' \
	-e '.*' \
	-t 'org\.apache\.commons\.compress\.archivers\.sevenz.*' \
	-o 'extracted/LightSolution_WebSocket-0.0.1'

	// -e '.*WebSocketFileHandlerV3\.un7Zip' \

*/

@Parameters(separators = "=", commandDescription = "Extract Automata (NFA) from the specified function of jar/classes")
public class CommandExtract {

	private static final Logger logger = LogManager.getLogger(CommandExtract.class.getName());

	@Parameter(names = { "--dry-run" }, description = "only finds and outputs the entry funcs, not extracting", required = false)
	private boolean _dryRun = false;

	@Parameter(names = { "-F", "--full-cg" }, description = "use full callgraph for more accurate analysis, may be slow", required = false)
	private boolean _fullCG = false;

	@Parameter(names = { "-j", "--source" }, description = "path/dir of the jar/classes extracted from", required = true)
	private String _sourceDir = null;

	@Parameter(names = { "-e", "--entry" }, description = "regex pattern of the entry funcs (matched with func full name: package.class.func)", required = true)
	private String _entryPattern = null;

	// TODO: this can be improved by pairing with --entry 1 by 1
	@Parameter(names = { "-s", "--entry-sig" }, description = "regex pattern for the signatures of entry funcs (matched with func signature, this is used for advanced refined match)", required = false)
	private String _entrySigPattern = ".*";

	@Parameter(names = { "-p", "--pkg" }, description = "regex pattern of target package path (matched with class full name)", required = true)
	private String _pkgPattern = null;

	@Parameter(names = { "-t", "-twl", "--target-api-whitelist" }, description = "regex patterns of API funcs whitelist whose usage need to be extracted (matched with API func full name plus signature: pkg.cls__FUNC__func__SIG__funcsig)", required = true)
	private List<String> _apiWhitelist = new ArrayList<>();

	@Parameter(names = { "-tbl", "--target-api-blacklist" }, description = "regex patterns of API funcs blacklist whose usage need to be extracted (matched with API func full name plus signature: pkg.cls__FUNC__func__SIG__funcsig)", required = false)
	private List<String> _apiBlacklist = new ArrayList<>();

	@Parameter(names = { "-o", "--output-path" }, description = "output path of the extracted dot & json files of usage graph, automata", required = true)
	private String _outPath = null;

	// @Parameter(names = { "-oA", "--output-alphabets" }, description = "output alphabets of the extracted automata, output to stdout if not specified", required = false)
	// private String outAlphabets = null;

	private File _ugDir = null;
	private File _aDir = null;
	private File _ajsonDir = null;
	private File _libMetaDir = null;
	private File _a2dgDir = null;

	private List<Pattern> _apiwlps = null;
	private List<Pattern> _apiblps = null;

	private void buildAPIMatchers(List<String> _apiWhitelist, List<String> _apiBlacklist) {
		_apiwlps = new ArrayList<Pattern>();
		_apiWhitelist.forEach((wp) -> {
			_apiwlps.add(Pattern.compile(wp));
		});

		_apiblps = new ArrayList<Pattern>();
		_apiBlacklist.forEach((bp) -> {
			_apiblps.add(Pattern.compile(bp));
		});

	}

	private boolean matchesAPIScope(String funcFullName) {
		boolean inWhiteList = false;
		boolean inBlackList = false;

		for (Pattern wp : _apiwlps) {
			Matcher matcher = wp.matcher(funcFullName);
			if (matcher.matches()) {
				inWhiteList = true;
				break;
			}
		}

		if (inWhiteList) {
			for (Pattern bp : _apiblps) {
				Matcher matcher = bp.matcher(funcFullName);
				if (matcher.matches()) {
					inBlackList = true;
					break;
				}

			}

			if (!inBlackList)
				return true;
		}

		return false;
	}

	private List<SootMethod> setupSoot(String sourcePath, String pkgPattern, String entryPattern, List<String> apiWhitelist, List<String> apiBlacklist, String entrySigPattern, boolean fullCG) {
		logger.warn("pkgPattern:\t" + pkgPattern);
		logger.warn("entryPattern:\t" + entryPattern);
		logger.warn("apiWhitelist:\t" + apiWhitelist);
		logger.warn("apiBlacklist:\t" + apiBlacklist);
		logger.warn("entrySigPattern:\t" + entrySigPattern);

		Pattern pkgRegex = Pattern.compile(pkgPattern);
		Pattern entryRegex = Pattern.compile(entryPattern);
		Pattern entrySigRegex = Pattern.compile(entrySigPattern);

		buildAPIMatchers(_apiWhitelist, _apiBlacklist);

		G.reset();
		Options.v().set_prepend_classpath(true);
		Options.v().set_allow_phantom_refs(true);
		Options.v().set_soot_classpath(sourcePath);
		Options.v().set_process_dir(Arrays.asList(sourcePath));
		Options.v().set_whole_program(true);
		// Options.v().set_app(true);
		Options.v().setPhaseOption("cg.spark", "enabled:true");
		Options.v().setPhaseOption("cg.spark", "verbose:true");
		Options.v().setPhaseOption("cg.spark", "on-fly-cg:true");
		// Options.v().set_src_prec(Options.src_prec_java);
		Options.v().set_ignore_resolving_levels(true);

		Scene.v().loadNecessaryClasses();

		List<SootMethod> entryPoints = new ArrayList<SootMethod>();
		for (SootClass sc : Scene.v().getClasses()) {
			// logger.debug(sc);
			String fullSCName = sc.getName();
			Matcher pkgMatcher = pkgRegex.matcher(fullSCName);

			// logger.debug("Class name: " + fullSCName);
			// logger.debug("pkgMatcher: " + pkgMatcher.matches());

			if (pkgMatcher.matches()) {
				// set them as entry point funcs for soot callgraph construction
				if (sc.isPhantom())
					continue;

				for (SootMethod sm : sc.getMethods()) {
					if (!sm.isConcrete())
						continue;

					String fullSMName = fullSCName + "." + sm.getName();
					String smSig = sm.getSignature();
					Matcher entryMatcher = entryRegex.matcher(fullSMName);
					Matcher entrySigMatcher = entrySigRegex.matcher(smSig);

					// logger.debug("SootMethod name: " + sm.getName());
					// logger.debug("SootMethod signature: " + sm.getSignature());
					// logger.debug("entryMatcher: " + entryMatcher.matches());

					if (entryMatcher.matches() && entrySigMatcher.matches())
						entryPoints.add(sm);
				}
			}
		}
		Scene.v().setEntryPoints(entryPoints);
		logger.warn("Found " + Scene.v().getEntryPoints().size() + " EntryPoints");
		Scene.v().getEntryPoints().forEach((f) -> {
			logger.info("\t" + f.getSignature());
		});

		//
		// OLD analysis setup code for single entry func
		//
		// SootMethod entryPoint = mainsc.getMethod(entryFuncSig);
		// // SootMethod entryPoint = mainsc.getMethodByName(methodName);
		// List<SootMethod> entryPoints = new ArrayList<SootMethod>();
		// entryPoints.add(entryPoint);
		// Scene.v().setEntryPoints(entryPoints);

		// logger.debug("Scene EntryPoints : " + Scene.v().getEntryPoints());


		//
		// print entry point func body with dot graph
		//
		// for (SootMethod sm : entryPoints) {
		// JimpleBody body = (JimpleBody) sm.retrieveActiveBody();
		// logger.debug("Body: " + body);

		// // // ExceptionalUnitGraph eug = new ExceptionalUnitGraph(body);
		// // BriefUnitGraph eug = new BriefUnitGraph(body);
		// // // ClassicCompleteUnitGraph eug = new ClassicCompleteUnitGraph(body);
		// // logger.debug("CFG is : " + eug);
		// // CFGToDotGraph ctdg = new CFGToDotGraph();
		// // // DotGraph dg = ctdg.drawCFG(eug);
		// // DotGraph dg = ctdg.drawCFG(eug, null);
		// // dg.plot("test.dot");
		// }

		//
		// naive run all packs, slow & might run unwanted packs
		// 
		// PackManager.v().runPacks();

		//
		// run selected packs, learn from flowdroid
		//
		PackManager.v().getPack("wjpp").apply();

		// cut most unnecessary parts, speed up the analysis
		if (!fullCG) {
			for (SootClass sc : Scene.v().getClasses()) {
				String fullSCName = sc.getName();
				Matcher pkgMatcher = pkgRegex.matcher(fullSCName);

				if (pkgMatcher.matches())
					continue;

				boolean smMatches = false;
				// logger.debug("class " + sc + " has methods: " + sc.getMethods());
				for (SootMethod sm : sc.getMethods()) {
					String fullSMNamePlusSig = fullSCName + "__FUNC__" + sm.getName() + "__SIG__" + sm.getSignature();

					if(matchesAPIScope(fullSMNamePlusSig)) {
						logger.debug("api " + fullSMNamePlusSig + " matches");
						smMatches = true;
					}
					//} else 
					//	logger.debug(fullSMNamePlusSig + " not match");
				}

				if (!smMatches) {
					logger.debug("Disabling " + sc);
					sc.setPhantomClass();
					for (SootMethod sm : sc.getMethods())
						sm.setPhantom(true);
				}

			}
		}

		PackManager.v().getPack("wjtp").remove("wjtp.lfp");
		PackManager.v().getPack("wjtp").remove("wjtp.ajc");
		PackManager.v().getPack("cg").apply();
		PackManager.v().getPack("wjtp").apply();

		return entryPoints;
	}

//	private void beforeExtraction(SootClass mainClass, Set<Unit> keptUts, HashMap<Unit, iExpr> taintSources) {
//		for (SootMethod sm : mainClass.getMethods()) {
//			logger.debug("Scanning SootMethod: " + sm);
//
//			JimpleBody body;
//			try {
//				body = (JimpleBody) sm.retrieveActiveBody();
//
//			} catch (Exception ex) {
//				logger.warn("catch exception when sm.retrieveActiveBody() of " + sm.getSignature() + ", skipped...");
//				continue;
//
//			}
//
//			// logger.debug("Body.locals: " + body.getLocals());
//			logger.debug("Body: " + body);
//
//			for (Unit un : body.getUnits()) {
//				// if (un.toString().contains("new ")) {
//				// logger.debug("New expr is IdentityStmt: " + (un instanceof
//				// IdentityStmt) + ", is DefinitionStmt: " + (un instanceof DefinitionStmt) + ",
//				// is AssignStmt: " + (un instanceof AssignStmt) + " " + un);
//				// }
//
//				// if (un instanceof IfStmt) {
//				// logger.debug("IfStmt: " + un);
//				// Value v = ((IfStmt) un).getCondition();
//				// logger.debug(" cond: " + v);
//				// logger.debug(" target: " + ((IfStmt) un).getTarget());
//				// }
//
//				String taintItsRet = null;
//
//				// if ( un instanceof DefinitionStmt ) {
//				if (un instanceof AssignStmt) {
//					Value lop = ((AssignStmt) un).getLeftOp();
//					Value rop = ((AssignStmt) un).getRightOp();
//
//					if (rop instanceof InvokeExpr) {
//						SootMethod _sm = ((Stmt) un).getInvokeExpr().getMethod();
//						logger.debug("_sm is " + _sm + ", it is of targetAPI " + UsageGraph.isTargetAPI(_sm));
//						if (UsageGraph.isTargetAPI(_sm)) {
//							// logger.debug("InvokeStmt: " + un + ", is assign: " +
//							// (un instanceof AssignStmt));
//							logger.debug("Taint Source :: InvokeStmt: " + un);
//							taintItsRet = _sm.getDeclaringClass().getShortJavaStyleName()
//									+ "." + _sm.getName() + ".RET";
//						}
//
//					} else if (rop instanceof NewExpr) {
//						if (UsageGraph.isTargetAPIType(rop.getType())) {
//							// logger.debug("AssignStmt right op type: " +
//							// op.getType());
//							logger.debug("Taint Source :: New Expr: " + un);
//							taintItsRet = "New " + rop.getType();
//						}
//					}
//
//					if (taintItsRet != null) {
//
//						// add taint mark for ret of api functions
//						taintSources.put(un, new iValueExpr(taintItsRet, true));
//
//						List<UnitValueBoxPair> _pairs = InterProcedureVariableAnalysis
//								.findUsesForward(body, (Stmt) un, (Local) lop);
//
//						logger.debug("  Tainted Branches:");
//						for (UnitValueBoxPair pair : _pairs) {
//							logger.debug("pair is " + pair);
//							Unit _ut = pair.getUnit();
//							if (_ut.branches()) {
//
//								keptUts.add(_ut);
//
//								logger.debug("    -> " + pair);
//							}
//
//						}
//
//					}
//				}
//			}
//
//			logger.debug("");
//		}
//
//		logger.info("In " + mainClass.getName() + ", tainted " + taintSources.size() + " sources, kept " + keptUts.size() + " units (including branches, etc)");
//	}

	private String extractProcess(JimpleBasedInterproceduralCFG icfg, SootMethod entryFunc, String shrinkedName, Set<iDataDep> seenDataDeps, String ugDotFile, String aDotFile, String aJsonFile, String a2dgGraphFile, String a2dgJsonFile) {
		// generate a2dg
		iGraph a2dg = UsageGraph.extractUsageGraph(icfg, entryFunc, seenDataDeps, true);
		if (a2dg.isEmpty()) {
			logger.info("the usage graph (a2dg) of " + entryFunc + " is empty, skip its output");
			return "Usage graph (a2dg) empty";
		}
		if (a2dgGraphFile != null)
			a2dg.dotize(a2dgGraphFile);
		if (a2dgJsonFile != null)
			UsageGraph.dumpA2DGGraph2Json(shrinkedName, a2dg, a2dgJsonFile);

		// generate UsageGraph
		iGraph ig = UsageGraph.extractUsageGraph(icfg, entryFunc, seenDataDeps, false);

		if (ig.isEmpty()) {
			logger.info("the usage graph of " + entryFunc + " is empty, skip its output");
			return "Usage graph empty";
		}

		if (ugDotFile != null) 
			ig.dotize(ugDotFile);

		// generate Automata
		iAutomata ia;
		try {
			ia = UsageGraph.convertUsageGraph2Automata(ig, shrinkedName);

		} catch (Exception ex) {
			logger.error("Extracting " + entryFunc + " meets exception: " + ex);
			logger.catching(Level.ERROR, ex);
			return ex.toString();

		}

		if (aDotFile != null)
			ia.dotize(aDotFile);
		if (aJsonFile != null) {
			JSONObject obj = ia.toJSON();
			if (aJsonFile.equals("-"))
				logger.info(obj);
			else {
				try {
					File fout = new File(aJsonFile);
					FileOutputStream fos = new FileOutputStream(fout);
				 
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

					obj.writeJSONString(bw);
				 
					bw.close();

				} catch (Exception ex) {
					throw new RuntimeException("ERROR: output alphabets: " + ex.getMessage());

				}
			}
		}

		// // output alphabets
		// if (outAlphabets != null) {
		// 	if (outAlphabets.equals("-")) {
		// 		for (iEvent letter : ia.getAlphabets())
		// 			logger.debug("LETTER: " + letter.toString());

		// 	} else {
		// 		try {
		// 			File fout = new File(outAlphabets);
		// 			FileOutputStream fos = new FileOutputStream(fout);
				 
		// 			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
				 
		// 			for (iEvent letter : ia.getAlphabets())
		// 				bw.write("LETTER: " + letter.toString() + "\n");
				 
		// 			bw.close();

		// 		} catch (Exception ex) {
		// 			throw new RuntimeException("ERROR: output alphabets: " + ex.getMessage());

		// 		}
		// 	}
		// }

		return "Succ";
	}

	private List<SootMethod> filterEntryFuncs(List<SootMethod> entryFuncs) {
		// TODO:
		return entryFuncs;
	}

//	private void doTaint(List<SootMethod> entryFuncs) {
//		// prepare taints & kept branch units
//
//		Set<SootClass> scs = new HashSet<SootClass>();
//
//		for (SootMethod sm : entryFuncs)
//			scs.add(sm.getDeclaringClass());
//
//		// collect branch units that are controlled by ret values of API funcs
//		Set<Unit> keptUts = new HashSet<Unit>();
//		HashMap<Unit, iExpr> taintSources = new HashMap<Unit, iExpr>();
//
//		for (SootClass sc: scs)
//			beforeExtraction(sc, keptUts, taintSources);
//
//		// UsageGraph.setKeptUnits(keptUts);
//		// the usagegraph analysis is enough for taint expression collection
//		// UsageGraph.setKeptUnits(null);
//		// UsageGraph.setTaintSources(taintSources);
//
//		logger.warn("Taint Summary: tainted " + taintSources.size() + " sources, kept " + keptUts.size() + " units (including branches, etc)");
//	}

	private void createOutPath(String outputPath) {
		_ugDir = new File(outputPath, "usage-graph");
		_aDir = new File(outputPath, "automata");
		_ajsonDir = new File(outputPath, "json-automata");
		_libMetaDir = new File(outputPath, "lib-meta");
		_a2dgDir = new File(outputPath, "a2dg");

		if (! _ugDir.mkdirs()) {
			logger.error("dir " + _ugDir + " cannot be created, rename or delete the existing directory first");
			System.exit(1);
		}

		if (! _aDir.mkdirs()) {
			logger.error("dir " + _aDir + " cannot be created, rename or delete the existing directory first");
			System.exit(1);
		}

		if (! _ajsonDir.mkdirs()) {
			logger.error("dir " + _ajsonDir + " cannot be created, rename or delete the existing directory first");
			System.exit(1);
		}

		if (! _libMetaDir.mkdirs()) {
			logger.error("dir " + _libMetaDir + " cannot be created, rename or delete the existing directory first");
			System.exit(1);
		}

		if (! _a2dgDir.mkdirs()) {
			logger.error("dir " + _a2dgDir + " cannot be created, rename or delete the existing directory first");
			System.exit(1);
		}
	}

	private HashMap<String, iFuncMeta> collectFuncMeta() {
		HashMap<String, iFuncMeta> funcMetas = new HashMap<>();

		for (SootClass sc : Scene.v().getClasses()) {
			String fullSCName = sc.getName();
			logger.debug("!!! Class: " + fullSCName);

			for (SootMethod sm : sc.getMethods()) {

				String fullSMNamePlusSig = fullSCName + "__FUNC__" + sm.getName() + "__SIG__" + sm.getSignature();

				// logger.debug("!!! before Method: " + fullSMNamePlusSig + ", isPublic: " + sm.isPublic() + ", matchesAPIScope: " + matchesAPIScope(fullSMNamePlusSig) + ", contains: " + fullSMNamePlusSig.contains("_ITERATOR_"));
				// seems broken func are by default not public... 
				// if (! sm.isPublic())
				//	continue;
				
				if(! matchesAPIScope(fullSMNamePlusSig)) {
					if (! fullSMNamePlusSig.contains("_ITERATOR_"))
						if (! fullSMNamePlusSig.contains("_ITERABLE_"))
							if (! fullSMNamePlusSig.contains("_LOOPVAR_"))
								continue;
				}

				logger.debug("!!! after Method: " + fullSMNamePlusSig);

				String sig = sm.getSignature();
				String nm = sm.getName();
				boolean isConstructor = nm.equals("<init>");

				// name (used in generator)
				if (isConstructor) {
					nm = "new " + fullSCName;
				}

				// ins
				HashMap<String, iFuncInMeta> ins = new HashMap<>();
				for (int i = 0; i < sm.getParameterCount(); i++) {
					String tag = "arg" + Integer.toString(i);
					String ty = sm.getParameterType(i).toString();
					ins.put(tag, new iFuncInMeta(tag, ty));
				}

				if (!isConstructor)
					ins.put("cls", new iFuncInMeta("cls", sc.getType().toString()));

				// outs
				HashMap<String, iFuncOutMeta> outs = new HashMap<>();
				Type retTy = sm.getReturnType();
				if (! (retTy instanceof VoidType))
					outs.put("ret", new iFuncOutMeta("ret", retTy.toString()));
				else if (isConstructor) {
					// oh, shit, constructor has void ret type = =.
					outs.put("ret", new iFuncOutMeta("ret", sc.getType().toString()));
				}
				if (UsageGraph.methodItrOutTyMap.containsKey(sig)) {
					logger.debug("add itr out for sig " + sig);
					outs.put("itr", new iFuncOutMeta("itr", UsageGraph.methodItrOutTyMap.get(sig)));
				}

				iFuncMeta fm = null;
				if (fullSMNamePlusSig.contains("_LOOPVAR_"))
					fm = new iFuncMeta(sig, nm, ins, outs, sm.isStatic(), UsageGraph.mockLoopVarMethodsInfo.get(sm.getName()), UsageGraph.mockLoopVarMethodsArgTable.get(sm.getName()));
				else 
					fm = new iFuncMeta(sig, nm, ins, outs, sm.isStatic());

				// logger.debug(fm);

				funcMetas.put(sig, fm);
			}
		}

		return funcMetas;
	}

	public void process() {
		// 1. setup soot
		//    only analyze necessary functions & build callgraph
		List<SootMethod> entryFuncs = setupSoot(_sourceDir, _pkgPattern, _entryPattern, _apiWhitelist, _apiBlacklist, _entrySigPattern, _fullCG);

		// 2. filter unnecessary entry funcs
		List<SootMethod> filteredEntryFuncs = filterEntryFuncs(entryFuncs);

		if (_dryRun) 
			System.exit(0);

		HashMap<String, Set<String>> results = new HashMap<String, Set<String>>();
		results.put("Succ", new HashSet<String>());

		Set<iDataDep> seenDataDeps = new HashSet<>();

		if (filteredEntryFuncs.size() > 0) {
			JimpleBasedInterproceduralCFG icfg = new JimpleBasedInterproceduralCFG(false);

			// 3. taint sources
			UsageGraph.setAPIPattern(_apiwlps, _apiblps);
			// doTaint(filteredEntryFuncs);

			// 4. extract usage graphs
			// disable the exceptional edges
			createOutPath(_outPath);

			for (SootMethod entryFunc : filteredEntryFuncs) {
				int pcount = entryFunc.getParameterCount();
				String hash = Integer.toString(entryFunc.getSignature().hashCode());
				String shrinkedName = entryFunc.getDeclaringClass().getName().replace('$', '_') + "." + entryFunc.getName().replace('$', '_') + "." + Integer.toString(pcount) + "P" + "." + hash;

				File ugFile = new File(_ugDir, shrinkedName + ".dot");
				File aFile = new File(_aDir, shrinkedName + ".dot");
				File ajsonFile = new File(_ajsonDir, shrinkedName + ".json");

				File a2dgGraphFile = new File(_a2dgDir, shrinkedName + "-a2dg.dot");
				File a2dgJsonFile = new File(_a2dgDir, shrinkedName + "-a2dg.json");

				String result = extractProcess(icfg, entryFunc, shrinkedName, seenDataDeps, ugFile.getAbsolutePath(), aFile.getAbsolutePath(), ajsonFile.getAbsolutePath(), a2dgGraphFile.getAbsolutePath(), a2dgJsonFile.getAbsolutePath());

				if (! results.containsKey(result))
					results.put(result, new HashSet<String>());
				
				results.get(result).add(entryFunc.getSignature());
			}
		}

		UsageGraph.mockMethods.forEach((fname, fsm) -> {
			logger.debug("MockMethod: " + fname + ", SootMethod: " + fsm);
		});

		HashMap<String, iFuncMeta> funcMetas = collectFuncMeta();
		File metaFile = new File(_libMetaDir, "meta.json");
		iMetaInfo im = new iMetaInfo(new ArrayList<iDataDep>(seenDataDeps), funcMetas);
		iMetaInfo.dumpMetaInfoToJSON(im, metaFile.getAbsolutePath());

		logger.warn("Extraction Summary: " + results.get("Succ").size() + "/" + filteredEntryFuncs.size() + " succeed");
		results.forEach((k, s) -> {
			logger.warn(k + " " + s.size());
			s.forEach((v) -> {
				logger.info("\t" + v);
			});
		});
	}

}
