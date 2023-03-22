package ahg.harness;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.AbstractMap.SimpleEntry;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

import net.automatalib.automata.fsa.impl.compact.CompactNFA;
import soot.jimple.toolkits.pointer.DependenceGraph;
import ahg.harness.cfg.api.iFuncIn;
import ahg.harness.cfg.api.iFuncOut;
import ahg.harness.cfg.api.iAPIFunc;

import ahg.harness.cfg.alphabet.iAlphabet;
import ahg.harness.cfg.alphabet.letter.iLetter;
import ahg.harness.cfg.alphabet.letter.iAPILetter;
import ahg.harness.cfg.alphabet.letter.iConstraintLetter;

import ahg.harness.cfg.nfa.iNFA;

import ahg.learning.metainfo.iFuncMeta;
import ahg.learning.metainfo.iMetaInfo;
import ahg.learning.metainfo.iFuncInMeta;
import ahg.learning.metainfo.iFuncOutMeta;

public class Generator {

	//public static String main(String metaInfoFile, String alphabetFile, String outApiJSONFile, String outHarnessFile) {
	//	iMetaInfo meta = iMetaInfo.loadMetaInfoFromFile(metaInfoFile);
	//	iAlphabet al = iAlphabet.createFromFile(alphabetFile);
	//	return generate(meta, al, ???, outApiJSONFile, outHarnessFile);
	//}

	public static String generateMetaAndCode(iMetaInfo meta, iAlphabet al, HashMap<Character, iAPIFunc> outApiFuncs, String outHarnessFile) {
		HashMap<Map.Entry<String, String>, String> outVars = new HashMap<>();

		String unsatisfiedDataDep = genHarnessMeta(meta, al, outVars, outApiFuncs);
		if (unsatisfiedDataDep != null)
			/* we need to fix this data dep break before continuing learning */
			throw new RuntimeException("Failed to generate harness: " + unsatisfiedDataDep);

		try {

			String codeTemplate = Files.readString(Paths.get("HarnessTemplate.txt"));
			String harnessCode = genHarnessCode(meta, al, outVars, codeTemplate);
			/* write it to file for debugging, this is one-time efforts */
			Files.writeString(Paths.get(outHarnessFile), harnessCode);

			return harnessCode;

		} catch (IOException ex) {
			throw new RuntimeException("meet IOexception when trying to dump the generated harness to the file: " + ex);

		}

	}

	public static void generateMetaOnly(iMetaInfo meta, iAlphabet al, HashMap<Character, iAPIFunc> outApiFuncs) {
		String unsatisfiedDataDep = genHarnessMeta(meta, al, new HashMap<Map.Entry<String, String>, String>(), outApiFuncs);
		if (unsatisfiedDataDep != null)
			/* we need to fix this data dep break before continuing learning */
			throw new RuntimeException("Failed to generate harness: " + unsatisfiedDataDep);

	}

	/* returns character whose data deps cannot be satisfied in this global knowledge */
	private static String genHarnessMeta(iMetaInfo meta, iAlphabet al, HashMap<Map.Entry<String, String>, String> outVars, HashMap<Character, iAPIFunc> outApiFuncs) {
		Set<Map.Entry<String, String>> fullAccepts = new HashSet<Map.Entry<String, String>>();
		HashMap<Map.Entry<String, String>, Set<String>> accepts = new HashMap<Map.Entry<String, String>, Set<String>>();

		// System.out.println("shrinked def2var is " + al.getDef2Var());

		// collect vars & outApifuncs info from constraint letter
		al.getAlias2Letter().forEach((c, l) -> {
			if (l instanceof iConstraintLetter) {
				HashMap<String, Set<String>> related = ((iConstraintLetter) l).getRelated();
				System.out.println("letter " + Character.toString(c) + ", cnt: " + l.getContent() + ", related: " + related);
				for (String fSig : related.keySet()) {
					for (String tag : related.get(fSig)) {
						String var = al.getVar(fSig, tag);
						Map.Entry<String, String> frmEntry = new SimpleEntry<String, String>(fSig, tag);
						outVars.put(frmEntry, var);

						System.out.println("Cond deps: func " + fSig + ", tag " + tag + ", var: " + var);
					}
				}

			} else if (l instanceof iAPILetter) {
				// all loop var mock api funcs have to update its ret (aka add to out vars)
				String funcSig = l.getContent();
				if (funcSig.contains("_LOOPVAR_")) {
					// loop var api funcs only has ret out
					String var = al.getVar(funcSig, "ret");
					Map.Entry<String, String> entry = new SimpleEntry<String, String>(funcSig, "ret");
					outVars.put(entry, var);
				}
				
			}
		});

		// collect vars & outApifuncs info from datadeps
		meta.getDataDeps().forEach((dep) -> {
			Map.Entry<String, String> frmEntry = new SimpleEntry<String, String>(dep.frmFuncSig, dep.frmTag);
			Map.Entry<String, String> toEntry = new SimpleEntry<String, String>(dep.toFuncSig, dep.toTag);

			String var;

			if (dep.frmFuncSig.equals("input"))
				var = dep.frmFuncSig + "-" + dep.frmTag;
			else if (dep.frmFuncSig.equals("constant"))
				var = dep.frmFuncSig + "-" + dep.frmTag;
			else if (dep.frmFuncSig.equals("fake"))
				/* this is a trick used for making this generation process happy when some data deps we currently don't have time to collect */
				/* fake var will never be initialized, therefore it will cause data-dep exception during the runtime */
				var = "fake";
			else
				/* var might be null here, since data deps covers a superset of characters comparing with shrinked alphabet */
				var = al.getVar(dep.frmFuncSig, dep.frmTag);

			if (var != null) {
				// only keep the ret var when it has been used in the data deps
				outVars.put(frmEntry, var);
				if (dep.frmTag.equals("itr")) {
					// itr data depends on ret
					String depVar = al.getVar(dep.frmFuncSig, "ret");
					Map.Entry<String, String> depEntry = new SimpleEntry<>(dep.frmFuncSig, "ret");
					outVars.put(depEntry, depVar);

					fullAccepts.add(depEntry);
				}

				Set<String> _acc = accepts.get(toEntry);
				if (_acc == null)
					_acc = new HashSet<String>();
				_acc.add(var);
				// System.out.println("[1] put to accepts, frmEntry: " + frmEntry + ", var: " + var);
				// System.out.println("[2] put to accepts, toEntry: " + toEntry + ", _acc: " + _acc);
				accepts.put(toEntry, _acc);

			}

			{
				// fullAccepts is collected for debug use
				fullAccepts.add(toEntry);
			}
		});

		// generate apifuncs 
		for (Map.Entry<Character, iLetter> entry : al.getAlias2Letter().entrySet()) {
			Character c = entry.getKey();
			iLetter l = entry.getValue();

			if (l instanceof iAPILetter) {
				// only the nfa related characters is checked & dumpped
				HashMap<String, iFuncIn> ins = new HashMap<>();
				HashMap<String, iFuncOut> outs = new HashMap<>();

				String fSig = ((iAPILetter) l).getContent();
				iFuncMeta fm = meta.getIFuncMeta(fSig);
				System.out.println("meta of " + fSig + " is " + fm);
				System.out.println("fm.getIns() is " + fm.getIns());

				for (Map.Entry<String, iFuncInMeta> inEntry : fm.getIns().entrySet()) {
					String tag = inEntry.getKey();
					iFuncInMeta inMeta = inEntry.getValue();

					if (tag.equals("cls") && fm.isStatic)
						continue;

					Set<String> _acc = accepts.get(new SimpleEntry<String, String>(fSig, tag));
					// System.out.println("acc is " + _acc);
					if ((_acc == null) || (_acc.size() == 0) || (_acc.contains(null))) {
						if ( fullAccepts.contains(new SimpleEntry<String, String>(fSig, tag)) ) {
							// the data dep misses only in this nfa
							return "Locally: data deps cannot be satisfied in this nfa: func: " + fSig + ", tag: " + tag;
						} else {
							// the data dep misses globally
							return "Globally: data deps cannot be satisfied: func: " + fSig + ", tag: " + tag;
						}
					}

					iFuncIn in = new iFuncIn(c, tag, inMeta.ty, _acc);
					ins.put(tag, in);

				}

				for (Map.Entry<String, iFuncOutMeta> outEntry : fm.getOuts().entrySet()) {
					String tag = outEntry.getKey();
					iFuncOutMeta outMeta = outEntry.getValue();

					String var = outVars.get(new SimpleEntry<String, String>(fSig, tag));
					if (var != null) {
						// not null => the out var has been used
						iFuncOut out = new iFuncOut(c, var, tag, outMeta.ty);
						outs.put(tag, out);
					}
				}

				iAPIFunc af = new iAPIFunc(c, fm.getFuncName(), ins, outs);
				outApiFuncs.put(c, af);
			}
		}

		System.out.println("genMeta alphabet alias2letter " + al.getAlias2Letter());
		return null;
	}

	private static String genHarnessCode(iMetaInfo meta, iAlphabet al, HashMap<Map.Entry<String, String>, String> vars, String codeTemplate) {
		String allVarCodes = null;
		String allFuncCodes = null;
		String allCondCodes = null;

		///////////
		// var code
		///////////
		List<String> varCodes = new ArrayList<String>();
		String VI = "\t\t";

		vars.forEach((entry, var) -> {
			String code = "";
			String funcSig = entry.getKey();
			String fTag = entry.getValue();
			if (funcSig.equals("input"))
				code = code + VI + "vars.put(\"" + var + "\", " + fTag + ");\n";
			else if (funcSig.equals("constant")) 
				code = code + VI + "vars.put(\"" + var + "\", " + fTag +");\n";
			//else
			//	code = code + VI + "vars.put(\"" + var + "\", null);\n";

			varCodes.add(code);
			// System.out.println("func " + funcSig + ", tag " + fTag + ", var: " + var);
		});

		allVarCodes = String.join("", varCodes);
		// System.out.println(String.join("", varCodes));

		/*
		outApiFuncs.forEach((c, af) -> {
			System.out.println(af);
			System.out.println("");
		});
		*/

		///////////
		// func & cond code
		///////////

		List<String> funcCodes = new ArrayList<String>();
		List<String> condCodes = new ArrayList<String>();

		String FI = "\t\t\t";
		String FII = FI + "\t";
		String CI = "\t\t\t";
		String CII = CI + "\t";

		System.out.println("genCode alphabet alias2letter " + al.getAlias2Letter());
		al.getAlias2Letter().forEach((c, l) -> {
			if (l instanceof iAPILetter) {
				System.out.println(">>> Letter " + c);

				// output the code
				// ret = cls.funcName(arg0, arg1, arg2, ...);
				// OR
				// ret = funcName(arg0, arg1, arg2, ...);
				String fSig = ((iAPILetter) l).getContent();
				iFuncMeta fm = meta.getIFuncMeta(fSig);

				String nm = fm.getFuncName();

				String code = "if (nextCall.equals('" + Character.toString(c) + "')) {\n";
				// code = code + FII + "/* " + fSig + " */\n";
				code = code + FII + "if (debug) System.out.println(\"Calling " + fSig + " \");\n";
				code = code + FII + "curEvent = '" + Character.toString(c) + "';\n";

				boolean hasRet = fm.hasRet() && (vars.containsKey(new SimpleEntry<String, String>(fSig, "ret")));
				boolean hasItrRet = fm.hasItrRet() && (vars.containsKey(new SimpleEntry<String, String>(fSig, "itr")));
				// define local variables first
				if (hasRet) {
					// has ret & ret value has been used
					String ty = fm.getOut("ret").ty;
					code = code + FII + ty + " ret;\n";
				}
				if (hasItrRet) {
					// has ret & ret value has been used
					String ty = fm.getOut("itr").ty;
					code = code + FII + ty + " itr;\n";
				}

				List<String> args = fm.getArgs();
				for (String arg: args) {
					String ty = fm.getIn(arg).ty;
					code = code + FII + ty + " " + arg + " = (" + ty +") getVarValue(pickInVar(nextCall, \"" + arg + "\"));\n";
					// debug use
					code = code + FII + "if (debug) System.out.println(nextCall + \": getVarValue(\" + pickInVar(nextCall, \"" + arg + "\") + \") => \" + " + arg + ");\n";
				}

				// the call statement
				if (fm.hasCls()) {
					if (fm.isStatic) {
						// System.out.println("nm is " + nm + ", contains ITERATOR: " + nm.contains("_ITERATOR_"));
						if (nm.contains("_ITERATOR_")) {
							// mock apis for iterating logic
							if (args.size() != 1)
								throw new RuntimeException("iterable mock api should have 1 and only 1 argument: " + args);

							String [] parts = nm.split("_ITERATOR_");
							if (parts.length != 2)
								throw new RuntimeException("invalid iterator mock api name: " + nm);
							String real_nm = parts[1];

							if (hasRet) {
								// has ret & ret value has been used
								code = code + FII + "ret = " + args.get(0) + "." + real_nm + "();\n";
								code = code + FII + "vars.put(getOutVar(nextCall, \"ret\"), ret);\n";
								if (hasItrRet)
									throw new RuntimeException("we don't support iterator of iterator currently" + nm);

								// debug use
								code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"ret\") + \", \" + ret + \");\");\n";
							} else 
								code = code + FII + args.get(0) + "." + real_nm + "();\n";

						} else if (nm.contains("_ITERABLE_")) {
							// mock apis for iterating logic
							if (args.size() != 1)
								throw new RuntimeException("iterator mock api should have 1 and only 1 argument: " + args);
							
							String [] parts = nm.split("_ITERABLE_");
							if (parts.length != 2)
								throw new RuntimeException("invalid iterator mock api name: " + nm);
							String real_nm = parts[1];

							if (hasRet) {
								// has ret & ret value has been used
								code = code + FII + "ret = " + args.get(0) + "." + real_nm + "();\n";
								code = code + FII + "vars.put(getOutVar(nextCall, \"ret\"), ret);\n";
								if (hasItrRet)
									throw new RuntimeException("we don't support iterator of iterator currently" + nm);

								// debug use
								code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"ret\") + \", \" + ret + \");\");\n";
							} else 
								code = code + FII + args.get(0) + "." + real_nm + "();\n";

						} else if (nm.contains("_LOOPVAR_")) {
							// mock apis for loop related variables
							String funcCode = fm.getCode();

							// System.out.println("fm is " + fm);
							if (!hasRet) 
								throw new RuntimeException("loopvar mock api must have return value: " + nm);
							if (hasItrRet)
								throw new RuntimeException("loopvar mock api cannot have iterator return value: " + nm);

							// has ret & ret value has been used
							code = code + FII + "ret = (" + funcCode + ");\n";
							code = code + FII + "vars.put(getOutVar(nextCall, \"ret\"), ret);\n";
							// debug use
							code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"ret\") + \", \" + ret + \");\");\n";

						} else {
							// normal apis
							String ty = fm.getIn("cls").ty;
							if (hasRet) {
								// has ret & ret value has been used
								code = code + FII + "ret = " + ty + "." + nm + "(" + String.join(",", args) + ");\n";
								code = code + FII + "vars.put(getOutVar(nextCall, \"ret\"), ret);\n";
								if (hasItrRet) {
									code = code + FII + "itr = ret.iterator();\n";
									code = code + FII + "vars.put(getOutVar(nextCall, \"itr\"), itr);\n";

								}

								// debug use
								code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"ret\") + \", \" + ret + \");\");\n";
								if (hasItrRet) 
									code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"itr\") + \", \" + itr + \");\");\n";

							} else
								code = code + FII + ty + "." + nm + "(" + String.join(",", args) + ");\n";

						}

					} else {
						String ty = fm.getIn("cls").ty;
						code = code + FII + ty + " cls = (" + ty +") getVarValue(pickInVar(nextCall, \"cls\"));\n";
						// debug use
						code = code + FII + "if (debug) System.out.println(nextCall + \": getVarValue(\" + pickInVar(nextCall, \"cls\") + \") => \" + cls);\n";

						if (hasRet) {
							// has ret & ret value has been used
							code = code + FII + "ret = cls." + nm + "(" + String.join(",", args) + ");\n";
							code = code + FII + "vars.put(getOutVar(nextCall, \"ret\"), ret);\n";
							if (hasItrRet) {
								code = code + FII + "itr = ret.iterator();\n";
								code = code + FII + "vars.put(getOutVar(nextCall, \"itr\"), itr);\n";

							}

							// debug use
							code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"ret\") + \", \" + ret + \");\");\n";
							if (hasItrRet) 
								code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"itr\") + \", \" + itr + \");\");\n";

						} else
							code = code + FII + "cls." + nm + "(" + String.join(",", args) + ");\n";

					}

				} else {
					if (hasRet) {
						// has ret & ret value has been used
						code = code + FII + "ret = " + nm + "(" + String.join(",", args) + ");\n";
						code = code + FII + "vars.put(getOutVar(nextCall, \"ret\"), ret);\n";
						if (hasItrRet) {
							code = code + FII + "itr = ret.iterator();\n";
							code = code + FII + "vars.put(getOutVar(nextCall, \"itr\"), itr);\n";

						}

						// debug use
						code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"ret\") + \", \" + ret + \");\");\n";
						if (hasItrRet) 
							code = code + FII + "if (debug) System.out.println(nextCall + \": vars.put(\" + getOutVar(nextCall, \"itr\") + \", \" + itr + \");\");\n";

					} else
						code = code + FII + nm + "(" + String.join(",", args) + ");\n";

				}

				code = code + FII + "curEvent = null;\n";
				code = code + "\n" + FI + "}";
				/* System.out.println(code); */

				funcCodes.add(code);

			} else if (l instanceof iConstraintLetter) {
				System.out.println(">>> Letter " + c); 

				String expr = ((iConstraintLetter) l).getContent();
				HashMap<String, Set<String>> related = ((iConstraintLetter) l).getRelated();

				String code = "if (cond.equals('" + Character.toString(c) + "')) {\n";
				code = code + CII + "curEvent = '" + Character.toString(c) + "';\n";

				// TODO: dirty hack for 0 or null in java code synthesis, fix this later
				boolean isInt = false;
				boolean isBool = false;

				for (String sig : related.keySet()) {
					for (String tag : related.get(sig)) {
						Character fc = al.getFuncAlias(sig);
						String var = al.getVar(sig, tag);

						System.out.println("sig: " + sig + ", tag: " + tag + ", var: " + var);

						iFuncMeta fm = meta.getIFuncMeta(sig);
						String ty = fm.getOut(tag).ty;

						if (ty.equals("int"))
							isInt = true;
						else if (ty.equals("boolean"))
							isBool = true;

						code = code + CII + "/* " + sig + " */\n";
						System.out.println("ty: " + ty);
						System.out.println("var: " + var);
						System.out.println("fc: " + fc);
						code = code + CII + ty + " " + var + " = (" + ty + ") getVarValue(getOutVar('" + Character.toString(fc) + "', \"ret\"));\n";
					}
				}

				if (expr.contains("== 0")) {
					if (isBool) {
						expr = expr.replace("== 0", "== false");
					} else if (!isInt) {
						expr = expr.replace("== 0", "== null");
					}
				}

				code = code + CII + "satisfies = (" + expr + ");\n";
				code = code + CII + "curEvent = null;\n";
				code = code + "\n" + CI + "}";
				/* System.out.println(code); */

				condCodes.add(code);

			} else {
				throw new RuntimeException("meet a letter that is not func or cond, impossible case");
			}
		});

		String funcElse = "{\n" + FII + "if (1 == 0) throw new IOException(\"This makes compiler happy\");\n";
		funcElse = funcElse + "\n" + FII + "throw new RuntimeException(\"this should not happen, an unknown func letter '\" + nextCall + \"'\");\n";
		funcElse = funcElse + FI + "}\n";
		funcCodes.add(funcElse);

		String condElse = "{\n" + CII + "/* this 1 == 1 branch makes compiler happy */\n";
		condElse = condElse + "\n" + CII + "if (1 == 1) throw new RuntimeException(\"this should not happen, an unknown cond letter '\" + cond + \"'\");\n";
		condElse = condElse + CI + "}\n";
		condCodes.add(condElse);

		allFuncCodes = FI + String.join(" else ", funcCodes);
		allCondCodes = CI + String.join(" else ", condCodes);

		// System.out.println(FI + String.join(" else ", funcCodes));
		// System.out.println("\n");
		// System.out.println(CI + String.join(" else ", condCodes));

		///////////
		// merge all
		///////////
		String allCodes = codeTemplate.replace("GENERATED_VARCODES", allVarCodes)
						.replace("GENERATED_FUNCCODES", allFuncCodes)
						.replace("GENERATED_CONDCODES", allCondCodes);

		return allCodes;
	}

}
