package ahg.extraction;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import java.math.BigInteger;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

import java.util.regex.Matcher;

import org.json.simple.JSONObject;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import ahg.learning.metainfo.iDataDep;
import ahg.extraction.automata.event.iCallAPIEvent;
import ahg.extraction.automata.event.iCondEvent;
import ahg.extraction.automata.event.iEpsilonEvent;
import ahg.extraction.automata.event.iEvent;
import ahg.extraction.automata.iAutomata;
import ahg.extraction.graph.constraint.iConstraint;
import ahg.extraction.graph.expr.PropagateLocalValueSwitch;
import ahg.extraction.graph.expr.iExpr;
import ahg.extraction.graph.expr.iValueExpr;
import ahg.extraction.graph.expr.iBinExpr;
import ahg.extraction.graph.expr.iBinOp;
import ahg.extraction.graph.expr.iUnExpr;
import ahg.extraction.graph.expr.iUnOp;
import ahg.extraction.graph.iAttr;
import ahg.extraction.graph.iGraph;
import ahg.extraction.graph.iVertex;

import soot.*;
import soot.jimple.CaughtExceptionRef;
import soot.jimple.AssignStmt;
import soot.jimple.GotoStmt;
import soot.jimple.IfStmt;
import soot.jimple.IdentityStmt;
import soot.jimple.TableSwitchStmt;
import soot.jimple.LookupSwitchStmt;
import soot.jimple.RetStmt;
import soot.jimple.ReturnStmt;
import soot.jimple.ReturnVoidStmt;
import soot.jimple.InvokeExpr;
import soot.jimple.StaticInvokeExpr;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InterfaceInvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.ThrowStmt;
import soot.jimple.toolkits.ide.icfg.JimpleBasedInterproceduralCFG;
import static soot.util.dot.DotGraph.DOT_EXTENSION;

import soot.jimple.toolkits.annotation.logic.Loop;
import soot.jimple.toolkits.annotation.logic.LoopFinder;

import soot.jimple.JimpleBody;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.pdg.EnhancedUnitGraph;
import soot.util.cfgcmd.CFGToDotGraph;
import soot.util.dot.DotGraph;


public class UsageGraph {

	private static final Logger logger = LogManager.getLogger(UsageGraph.class.getName());

    static BigInteger execCount = BigInteger.ZERO;

    static File workdir;

    static void setWorkDir(File _workdir)
    {
        workdir = _workdir;
    }

    // this set should be gotten by static analysis (flow analysis, etc)
    static private Set<Unit> keptUnits = null;
    static private HashMap<Unit, iExpr> taintSources = null;
    static private List<Pattern> apiwlps = null;
    static private List<Pattern> apiblps = null;
    static private HashMap<String, Boolean> matchCache = null;
    static public HashMap<String, SootMethod> mockMethods = new HashMap<>();
    static public HashMap<String, String> methodItrOutTyMap = new HashMap<>();
    static public HashMap<String, iExpr> mockLoopVarMethodsInfo = new HashMap<>();
    static public HashMap<String, HashMap<String, String>> mockLoopVarMethodsArgTable = new HashMap<>();
    static public HashMap<Stmt, Integer> loopVarNaming = new HashMap<>();

    static public void setAPIPattern(List<Pattern> _apiwlps, List<Pattern> _apiblps) {
        matchCache = new HashMap<String, Boolean>();
        apiwlps = _apiwlps;
        apiblps = _apiblps;
    }

    static private boolean matchTargetAPI(String className) {
		boolean inWhiteList = false;
		boolean inBlackList = false;

		for (Pattern wp : apiwlps) {
			Matcher matcher = wp.matcher(className);
			if (matcher.matches()) {
				inWhiteList = true;
				break;
			}
		}

		if (inWhiteList) {
			for (Pattern bp : apiblps) {
				Matcher matcher = bp.matcher(className);
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

    static public boolean isTargetAPI(SootMethod sm)
    {
        String fullSMNamePlusSig = sm.getDeclaringClass().getName() + "__FUNC__" + sm.getName() + "__SIG__" + sm.getSignature();

        boolean match;

        if (matchCache.containsKey(fullSMNamePlusSig)) {
            match = matchCache.get(fullSMNamePlusSig);
        } else {
            match = matchTargetAPI(fullSMNamePlusSig);
            matchCache.put(fullSMNamePlusSig, match);
        }

        logger.debug("isTargetAPI sm: " + fullSMNamePlusSig + " : " + match);

        return match;
    }

    //static public boolean isTargetAPIType(Type ty)
    //{
    //    // logger.debug("isTargetAPI sm: " + sm.getDeclaringClass().getName());

    //    return matchTargetAPI( ty.toString() );
    //}

    // static public boolean isTargetAPI(SootMethodRef smf)
    // {
    //     logger.debug("isTargetAPI smf: " + smf.getDeclaringClass().getName());

    //     if (smf.getDeclaringClass().getName().contains("org.apache.commons.compress.archivers.sevenz"))
    //         return true;

    //     return false;
    // }

    // deprecated
    // static public void setKeptUnits(Set<Unit> set)
    // {
    //     keptUnits = set;
    // }

    // half deprecated
    // N.B. this is currently not used and will return false anyway
    static public boolean shouldKept(Unit ut)
    {
        if (keptUnits == null)
            return false;

        return keptUnits.contains(ut);
    }

    // deprecated
    // static public void setTaintSources(HashMap<Unit, iExpr> taints) {
    //     taintSources = taints;
    // }
    
    // deprecated
    // static public boolean isTaintSource(Unit taint) {
    //     return taintSources.containsKey(taint);
    // }

    // (a,b) -> c
    static private <A,B,C> Map.Entry<Map.Entry<A, B>, C> getTriple(A a, B b, C c) {
        return new SimpleEntry<Map.Entry<A, B>, C>(new SimpleEntry<A, B>(a, b), c);
    }

    // a -> b -> c -> d
    static private <A,B,C,D> Map.Entry<A, Map.Entry<B, Map.Entry<C, D>>> getQuadraple(A a, B b, C c, D d) {
        return new SimpleEntry<A, Map.Entry<B, Map.Entry<C, D>>>(a, new SimpleEntry<B, Map.Entry<C, D>>(b, new SimpleEntry<C, D>(c, d)));
    }

    static private HashMap<SootMethod, Set<Stmt>> allCondExitStmts = new HashMap<>();

    static private Set<Stmt> getCondExitStmts(SootMethod sm) {
        Set<Stmt> condExitStmts = allCondExitStmts.get(sm);
        logger.debug("Func " + sm.getName() + " in allCondExitStmts? : " + (condExitStmts != null));

        if (condExitStmts == null) {
            condExitStmts = new HashSet<>();

            JimpleBody body = (JimpleBody) sm.retrieveActiveBody();

            // logger.debug("Func " + sm.getName() + " Body: " + body);

            LoopFinder loopFinder = new LoopFinder();
            Collection<Loop> loops = loopFinder.getLoops(body);
            logger.debug("catched loops: ");
            for (Loop loop : loops) {
                logger.debug("loop: " + loop);
                logger.debug("  head: " + loop.getHead());
                logger.debug("  singleexit: " + loop.hasSingleExit());
                logger.debug("  loopforever: " + loop.loopsForever());
                logger.debug("  backjump: " + loop.getBackJumpStmt());
                for (Stmt exit: loop.getLoopExits()) {

                    boolean hasNonExceptionExit = false;
                    for (Stmt stmt: loop.targetsOfLoopExit(exit)) {

                        // logger.debug("    target: " + stmt + ", class: " + stmt.getClass() + ", is: " + (stmt instanceof IdentityStmt));
                        if (stmt instanceof IdentityStmt) {
                            if (((IdentityStmt)stmt).getRightOp() instanceof CaughtExceptionRef) {
                                continue;
                            }
                        }
                        hasNonExceptionExit = true;
                        logger.debug("    target: " + stmt);
                    }

                    if (hasNonExceptionExit) {
                        logger.debug("  exit: " + exit);
                        if (exit.branches()) {
                            condExitStmts.add(exit);
                            if (! (exit instanceof IfStmt)) 
                                throw new RuntimeException("meet cond exit stmt which is not ifstmt, fix this (" + exit + ")");
                        }
                    }

                }

                for (Stmt stmt: loop.getLoopStatements())
                    logger.debug("  statement: " + stmt);
            }

            allCondExitStmts.put(sm, condExitStmts);
        }

        return condExitStmts;
    }

    static private iGraph buildOneFuncUsageGraph(HashMap<SootMethod,iGraph> touchedFuncs, JimpleBasedInterproceduralCFG icfg, SootMethod sm, Stack<SootMethod> st, HashMap<SootMethod, HashMap<String, Set<String>>> taintedLoopVars, HashMap<SootMethod, HashMap<String, Set<String>>> untrackedLoopVars, Set<iDataDep> seenDataDeps, boolean isA2DG) 
    {
        // TODO: currently we only do intra-procedure data flow taint
        boolean taint;
        if (isA2DG) {
            taint = false;
        } else {
            // usage graph requires taint to record constraints
            taint = true;
        }

        boolean debug = true;
        // boolean debug = false;
	    // boolean debug = sm.getSignature().equals("<org.ebookdroid.droids.mupdf.codec.MuPdfDocument: void free(long)>");
        // boolean debug = sm.getSignature().equals("<com.foobnix.drive.GFile: void sync(java.lang.String,java.io.File)>");

        Set<Stmt> condExitStmts = null;
        HashMap<Local, Set<String>> taintLocals = null;
        if (taint) {
            condExitStmts = getCondExitStmts(sm);
            taintLocals = new HashMap<>();

            HashMap<String, Set<String>> varsNeedTaint = taintedLoopVars.get(sm);
            if (varsNeedTaint != null) {
                logger.debug("varsNeedTaint " + varsNeedTaint);
                for (Stmt stmt : condExitStmts) {
                    if (stmt instanceof IfStmt) {
                        // logger.debug("condexit stmt " + stmt);
                        Value cond = ((IfStmt) stmt).getCondition();
                        for (ValueBox vb : cond.getUseBoxes()) {
                            // logger.debug("condexit valuebox " + vb);
                            // logger.debug("condexit value " + vb.getValue());
                            // logger.debug("condexit value class " + vb.getValue().getClass());
                            // logger.debug("condexit value is local " + (vb.getValue() instanceof Local));
                            Value v = vb.getValue();
                            if (v instanceof Local) {
                                String nm = ((Local) v).toString();
                                if (varsNeedTaint.containsKey(nm))
                                    taintLocals.put((Local) v, varsNeedTaint.get(nm));
                            }
                        }
                    } else {
                        throw new RuntimeException("meet non-if conditional exit stmt, fix this");
                    }
                }
            }
        }

        iGraph fgraph = new iGraph();

        if (debug)
            logger.debug("Func " + sm.getSignature());
            // logger.debug("Func " + sm.getSignature() + " Body: " + sm.retrieveActiveBody());

        // add start point if this is the start of UsageGraph
        iVertex startV = new iVertex(null, iAttr.START);
        iVertex endV = new iVertex(null, iAttr.END);
        fgraph.addVertex(startV);
        fgraph.addVertex(endV);

        st.push(sm);

        // unit2Vertex is used for recording touched units
        HashMap<Unit, iVertex> unit2Vertex = new HashMap<Unit, iVertex>();

        for (Unit ut : icfg.getStartPointsOf(sm)) {
            // iterate every start point that is not caughtexception (now seems only is the first stmt)
            if (ut instanceof IdentityUnit) {
                if (((IdentityUnit)ut).getRightOp() instanceof CaughtExceptionRef) {
                    continue;
                }
            }

            // Queue<Map.Entry<iVertex, Unit>> q = new LinkedList<Map.Entry<iVertex, Unit>>();
            // from vertex, to unit, condition
            Set<Map.Entry<iVertex, Map.Entry<Unit, Map.Entry<iConstraint, PropagateLocalValueSwitch>>>> q = new HashSet<Map.Entry<iVertex, Map.Entry<Unit, Map.Entry<iConstraint, PropagateLocalValueSwitch>>>>();
            q.add(getQuadraple(startV, ut, null, new PropagateLocalValueSwitch()));

            while (q.size() > 0) {
                // get the first one from set
                // Map.Entry<iVertex, Unit> entry = q.poll();
                Iterator<Map.Entry<iVertex, Map.Entry<Unit, Map.Entry<iConstraint, PropagateLocalValueSwitch>>>> it = q.iterator();
                Map.Entry<iVertex, Map.Entry<Unit, Map.Entry<iConstraint, PropagateLocalValueSwitch>>> quadratry = it.next();
                it.remove();

                iVertex curV = quadratry.getKey();
                Unit u = quadratry.getValue().getKey();
                iConstraint cond = quadratry.getValue().getValue().getKey();
                // copy a Local set rather than reuse
                PropagateLocalValueSwitch localsw = new PropagateLocalValueSwitch(quadratry.getValue().getValue().getValue());

                if (unit2Vertex.containsKey(u)) {
                    // we don't execute again for already executed stmts
                    if (curV == null) {
                        logger.error("this is impossible since func start point cannot be re-touched (recursive has been prevented");
                        System.exit(-1);
                    } else {
                        // handle inner function loop case
                        if (debug) {
                            logger.debug("  >> Already been Touched: < " + sm.getName() + " >, [" + u.toString() + "]");
                            // logger.debug("  >> Queue are:" + q);
                        }
                        fgraph.addEdge(curV, unit2Vertex.get(u), cond);
                        continue;
                    }
                }

                // if (debug)
                // if (u instanceof IdentityUnit)
                //    logger.debug("[-] Unit is " + u + ", class type: " + ((IdentityUnit)u).getRightOp().getClass() + ", is " + (((IdentityUnit)u).getRightOp() instanceof CaughtExceptionRef) );
                    // logger.debug("[-] fgraph of " + sm.getSignature() + " is : " + fgraph.breakDown());

                // counting unique stmts we explored
                execCount = execCount.add(BigInteger.ONE);

                List<Unit> succs = icfg.getSuccsOf(u);
                // loadedVs are used for adding edges to END node
                List<iVertex> loadedVs = new ArrayList<iVertex>();

                // logger.debug("[-] " + sm.getName() + (sm.getName().equals("onHandleIntent")));
                if (debug) {
                    logger.debug(">>  " + sm.getName() + " , [" + u.toString() + "]");
                    // logger.debug("Is callstmt: " + icfg.isCallStmt(u));
                    // if (icfg.isCallStmt(u))
                    //     logger.debug("Callees: " + icfg.getCalleesOfCallAt(u).toString());
                    logger.debug(" succs:" + succs);
                    // logger.debug(" Q in:" + q);
                }

                if (u.branches()) {
                    // branch stmt
                    if (debug)
                        logger.debug(" -> branch place");

                    iVertex branchV;
                    boolean isTainted;

                    Stmt tgt = null;
                    Value condV = null;
                    iExpr condE = null;

                    if (!taint) {
                        isTainted = false;

                    } else if (u instanceof IfStmt) {
                        tgt = ((IfStmt) u).getTarget();
                        if (! succs.contains(tgt)) 
                            throw new RuntimeException("ERROR: we should find another way to identify target unit inside succs list");

                        // calculate condition expression
                        condV = ((IfStmt) u).getCondition();
                        condE = localsw.propagate(condV);

                        logger.debug("IfStmt for " + u + ", replace from " + condV + " to " + condE);

                        isTainted = condE.isTainted();

                        if (isTainted && condExitStmts.contains(u) && condE.hasUntrackedLocal()) {
                            // TODO: now we only handle this for IfStmt, add more branch stmt support when we meet them
                            HashMap<String, Set<String>> untracked = untrackedLoopVars.get(sm);
                            if (untracked == null) 
                                untracked = new HashMap<>();
                            
                            for (ValueBox vb : condV.getUseBoxes()) {
                                Value tmpV = vb.getValue();
                                iExpr tmpE = localsw.propagate(tmpV);
                                if (tmpE.hasUntrackedLocal()) {
                                    if (tmpV.getType() instanceof IntegerType) {
                                        Set<String> srcs = new HashSet<>();
                                        for (String raw : condE.getTaintSrcs())
                                            // taint locals only cares the funcs rather than its .itr or .ret?
                                            srcs.add(raw.substring(0, raw.length() - 4));

                                        logger.debug("condE " + condE + ", taint srcs " + srcs);
                                        untracked.put(tmpV.toString(), srcs);
                                    }
                                }
                            }

                            if (untracked.size() != 0)
                                untrackedLoopVars.put(sm, untracked);
                        }

                    } else if (u instanceof TableSwitchStmt) {
                        condV = ((TableSwitchStmt) u).getKey();
                        condE = localsw.propagate(condV);

                        logger.debug("TableSwitchStmt for " + u + ", replace from " + condV + " to " + condE);
                        isTainted = condE.isTainted();

                    } else if (u instanceof LookupSwitchStmt) {
                        condV = ((LookupSwitchStmt) u).getKey();
                        condE = localsw.propagate(condV);

                        logger.debug("LookupSwitchStmt for " + u + ", replace from " + condV + " to " + condE);
                        isTainted = condE.isTainted();

                    } else if (u instanceof GotoStmt) {
                        isTainted = false;

                    } else {
                        throw new RuntimeException("ERROR: Found an new type of Stmt which has branches: " + u);

                    }

                    if (isTainted)
                        branchV = new iVertex(u, iAttr.BRANCH_KEPT);
                    else
                        branchV = new iVertex(u, iAttr.BRANCH_NONE);
                    if (curV == null) 
                        fgraph.addVertex(branchV);
                    else
                        fgraph.addEdge(curV, branchV, cond);

                    if (! isTainted) {
                        // we don't care about plain insn's constraint
                        for (Unit succ : succs)
                            q.add(getQuadraple(branchV, succ, null, localsw));
                    
                    } else if (u instanceof IfStmt) {
                        // logger.debug("branch IfStmt " + u);
                        for (Unit succ : succs) {
                            if (succ.equals(tgt)) {
                                // true branch
                                iConstraint nextCond = new iConstraint(condE);
                                logger.debug("Add true branch of " + u + " : " + nextCond);
                                q.add(getQuadraple(branchV, succ, nextCond, localsw));

                            } else {
                                // false branch
                                iExpr NOTcondE = new iUnExpr(new iUnOp("!"), condE);
                                iConstraint nextCond = new iConstraint(NOTcondE);
                                logger.debug("Add false branch of " + u + " : " + nextCond);
                                q.add(getQuadraple(branchV, succ, nextCond, localsw));

                            }
                        }

                    } else if (u instanceof TableSwitchStmt) {
                        List<Unit> tgts = ((TableSwitchStmt)u).getTargets();
                        Unit defaultU = ((TableSwitchStmt)u).getDefaultTarget();
                        iExpr defaultE = null;

                        for (int i = 0; i < tgts.size(); i++) {
                            tgt = (Stmt)(tgts.get(i));
                            if (tgt.equals(defaultU))
                                break;

                            for (Unit succ : succs) {
                                if (succ.equals(tgt)) {
                                    iExpr eqCondE = new iBinExpr(new iBinOp("=="), condE, new iValueExpr(Integer.toString(i), false));
                                    iConstraint nextCond = new iConstraint(eqCondE);
                                    logger.debug("Add " + i + "-th branch of " + u + " : " + nextCond);
                                    q.add(getQuadraple(branchV, succ, nextCond, localsw));

                                    if (defaultE == null) {
                                        defaultE = eqCondE;
                                    } else {
                                        defaultE = new iBinExpr(new iBinOp("||"), defaultE, eqCondE);
                                    }

                                    break;
                                }
                            }
                        }

                        if (defaultE != null) {
                            defaultE = new iUnExpr(new iUnOp("!"), defaultE);
                            iConstraint nextCond = new iConstraint(defaultE);
                            logger.debug("Add default branch of " + u + " : " + nextCond);
                            q.add(getQuadraple(branchV, defaultU, nextCond, localsw));
                        }

                    } else if (u instanceof LookupSwitchStmt) {
                        List<Unit> tgts = ((LookupSwitchStmt)u).getTargets();
                        Unit defaultU = ((LookupSwitchStmt)u).getDefaultTarget();
                        iExpr defaultE = null;

                        for (int i = 0; i < tgts.size(); i++) {
                            tgt = (Stmt)(tgts.get(i));
                            if (tgt.equals(defaultU))
                                break;
                            
                            int idx = ((LookupSwitchStmt)u).getLookupValue(i);

                            for (Unit succ : succs) {
                                if (succ.equals(tgt)) {
                                    iExpr eqCondE = new iBinExpr(new iBinOp("=="), condE, new iValueExpr(Integer.toString(idx), false));
                                    iConstraint nextCond = new iConstraint(eqCondE);
                                    logger.debug("Add " + i + "-th branch of " + u + " : " + nextCond);
                                    q.add(getQuadraple(branchV, succ, nextCond, localsw));

                                    if (defaultE == null) {
                                        defaultE = eqCondE;
                                    } else {
                                        defaultE = new iBinExpr(new iBinOp("||"), defaultE, eqCondE);
                                    }

                                    break;
                                }
                            }
                        }

                        if (defaultE != null) {
                            defaultE = new iUnExpr(new iUnOp("!"), defaultE);
                            iConstraint nextCond = new iConstraint(defaultE);
                            logger.debug("Add default branch of " + u + " : " + nextCond);
                            q.add(getQuadraple(branchV, defaultU, nextCond, localsw));
                        }

                    } else {
                        // add more code support for LookupSwitchStmt/TableSwitchStmt later
                        throw new RuntimeException("ERROR: it is impossible to come here now " + u);

                    }

                    unit2Vertex.put(u, branchV);
                    loadedVs.add(branchV);

				} else if (icfg.isCallStmt(u)) {
                    // call stmt

                    Collection<SootMethod> callees = icfg.getCalleesOfCallAt(u);
                    if (callees.size() == 0) {
                        if (debug)
                            logger.debug(" -> empty call place");

                        SootMethod callee = ((Stmt) u).getInvokeExpr().getMethod();
                        if (callee == null) {
                            SootMethodRef smf = ((Stmt) u).getInvokeExpr().getMethodRef();
                            throw new RuntimeException("ERROR: empty call target has a null callee, smf: " + smf + ", sm: " + callee);
                        }

                        if (isTargetAPI(callee)) {
                            if (debug)
                                logger.debug(" @@ target call place for unit " + u);

                            if (taint) {
                                if (u instanceof AssignStmt) {
                                    // mark taint source 

                                    //String taintSource = callee.getDeclaringClass().getShortJavaStyleName() + "." + callee.getName() + ".RET";
                                    String taintSource = callee.getSignature() + ".RET";

                                    logger.debug("Taint Source :: " + (Local) ((AssignStmt) u).getLeftOp() + " " + taintSource);
                                    
                                    localsw.addLocal( (Local) ((AssignStmt) u).getLeftOp(), new iValueExpr(taintSource, true) );
                                }

                                InvokeExpr invoE = ((Stmt) u).getInvokeExpr();
                                // logger.error("invoE: " + invoE);
                                if (invoE instanceof InstanceInvokeExpr) {
                                    Value clsV = ((InstanceInvokeExpr) invoE).getBase();
                                    iExpr clsE = localsw.propagate(clsV);
                                    if (clsE.isTainted()) {
                                        seenDataDeps.add(new iDataDep(clsE, callee.getSignature(), "cls"));
                                    }

                                    for (int j = 0; j < invoE.getArgCount(); j++) {
                                        Value argV = invoE.getArg(j);
                                        iExpr argE = localsw.propagate(argV);
                                        if (argE.isTainted()) {
                                            seenDataDeps.add(new iDataDep(argE, callee.getSignature(), "arg" + Integer.toString(j)));
                                        }
                                    }

                                } else if (invoE instanceof StaticInvokeExpr) {
                                    for (int j = 0; j < invoE.getArgCount(); j++) {
                                        Value argV = invoE.getArg(j);
                                        iExpr argE = localsw.propagate(argV);
                                        if (argE.isTainted()) {
                                            seenDataDeps.add(new iDataDep(argE, callee.getSignature(), "arg" + Integer.toString(j)));
                                        }
                                    }

                                } else {
                                    throw new RuntimeException("ERROR: need handle more kinds of invokeexpr (now only InstanceInvokeExpr): " + invoE);
                                }

                            }

                            iVertex fakeCallV = new iVertex(u, iAttr.FAKE_CALL);
                            if (curV == null)
                                fgraph.addVertex(fakeCallV);
                            else
                                fgraph.addEdge(curV, fakeCallV, cond);
                            curV = fakeCallV;

                            iVertex callV = new iVertex(u, iAttr.API_CALL, callee);
                            fgraph.addEdge(curV, callV, null);

                            for (Unit succ : succs)
                                q.add(getQuadraple(callV, succ, null, localsw));

                            unit2Vertex.put(u, fakeCallV);
                            loadedVs.add(callV);

                        } else {

                            iVertex otherCalleeV = null;

                            if (taint) {

                                // if is interface invoke
                                // if base is tainted
                                // if base class implements java.lang.Iterable and calling iterator()
                                //   just directly check the function name is iterator()
                                //   warn error for spliterator()
                                //   then, mark the result as tainted (with iterator operator)
                                // if is directly iterator interface and calling next() | hasNext()
                                //   directly check the interface name and the method name
                                //   then, simulate a fake api call for each method (our self-created SootMethod)
                                if (((Stmt) u).getInvokeExpr() instanceof InterfaceInvokeExpr) {
                                    // we are analyzing iterator mode, which is only meaning in taint scenario
                                    InvokeExpr invoE = ((Stmt) u).getInvokeExpr();
                                    Value baseV = ((InterfaceInvokeExpr) invoE).getBase();
                                    // Type bty = baseV.getType();
                                    // SootClass bcls = Scene.v().getSootClass(bty.toString());
                                    // System.out.println("the invokeExpr is " + invoE + ", and its base is " + base + ", base type is " + bty + ", base class is " + bcls + ", its interfaces are: " + bcls.getInterfaces() + ", implements Iterable: " + bcls.implementsInterface("java.lang.Iterable"));
                                    // logger.debug("the invokeExpr is " + invoE + ", and its callee sig is " + callee.getName() + ", bty is " + bty);

                                    iExpr baseE = localsw.propagate(baseV);
                                    String theOnlyTaintSrc = baseE.isJustTheTaintValue();
                                    if ( (u instanceof AssignStmt) && (theOnlyTaintSrc != null) ) {
                                        if (theOnlyTaintSrc.endsWith(".RET") && callee.getName().equals("iterator")) {
                                            // TODO: here is a simplified check for tainting iterator() call
                                            //       if needed, add recursively check for whether base class has implemented the java.lang.Iterable 

                                            // TODO: currently we also don't support nested .RET .ITR
                                            String taintSource = theOnlyTaintSrc.substring(0, theOnlyTaintSrc.length() - 4) + ".ITR";
                                            logger.debug("Taint Source :: " + (Local) ((AssignStmt) u).getLeftOp() + " " + taintSource);
                                            localsw.addLocal( (Local) ((AssignStmt) u).getLeftOp(), new iValueExpr(taintSource, true) );

                                        } else if (theOnlyTaintSrc.endsWith(".RET") && callee.getName().equals("spliterator")) {
                                            // TODO: this is the iterator used in stream, fix this when meet later
                                            throw new RuntimeException("we met spliterator during the tainting, fix this");

                                        } else if (theOnlyTaintSrc.endsWith(".RET") && baseV.getType().toString().equals("java.util.Iterator")) {
                                            // the ret directly be used as iterator
                                            String name = callee.getName();
                                            if (name.equals("next") || name.equals("hasNext")) {
                                                String funcSig = theOnlyTaintSrc.substring(0, theOnlyTaintSrc.length() - 4);
                                                String mockFuncName = funcSig + "_ITERATOR_" + name;
                                                SootMethod mockAPI = null;

                                                if (!mockMethods.containsKey(mockFuncName)) {
                                                    if (name.equals("next")) {
                                                        List<Type> argTyList = new ArrayList<>();
                                                        // iterator type
                                                        argTyList.add(baseV.getType());
                                                        Type retTy = Scene.v().getObjectType();
                                                        mockAPI = new SootMethod(mockFuncName, argTyList, retTy, soot.Modifier.STATIC | soot.Modifier.PUBLIC);
                                                    } else if (name.equals("hasNext")) {
                                                        List<Type> argTyList = new ArrayList<>();
                                                        // iterator type
                                                        argTyList.add(baseV.getType());
                                                        Type retTy = soot.BooleanType.v();
                                                        mockAPI = new SootMethod(mockFuncName, argTyList, retTy, soot.Modifier.STATIC | soot.Modifier.PUBLIC);
                                                    }
                                                    SootClass sc = Scene.v().getMethod(funcSig).getDeclaringClass();
                                                    sc.addMethod(mockAPI);
                                                    // mockAPI.setDeclaringClass(sc);
                                                    mockMethods.put(mockFuncName, mockAPI);
                                                } else {
                                                    mockAPI = mockMethods.get(mockFuncName);
                                                }

                                                seenDataDeps.add(new iDataDep(funcSig, "ret", mockAPI.getSignature(), "arg0", "iterator analysis during extraction"));

                                                String taintSource = mockAPI.getSignature() + ".RET";
                                                logger.debug("Taint Source :: " + (Local) ((AssignStmt) u).getLeftOp() + " " + taintSource);
                                                localsw.addLocal( (Local) ((AssignStmt) u).getLeftOp(), new iValueExpr(taintSource, true) );

                                                otherCalleeV = new iVertex(u, iAttr.API_CALL, mockAPI);

                                            } else {
                                                logger.debug("WARN: the tainted iterator call " + name + " is ignored");

                                            }

                                        } else if (theOnlyTaintSrc.endsWith(".ITR") && baseV.getType().toString().equals("java.util.Iterator")) {
                                            // get an iterator from the ret and used it
                                            String name = callee.getName();
                                            if (name.equals("next") || name.equals("hasNext")) {
                                                String funcSig = theOnlyTaintSrc.substring(0, theOnlyTaintSrc.length() - 4);
                                                String mockFuncName = funcSig + "_ITERABLE_" + name;
                                                SootMethod mockAPI = null;

                                                if (!mockMethods.containsKey(mockFuncName)) {
                                                    if (name.equals("next")) {
                                                        List<Type> argTyList = new ArrayList<>();
                                                        // iterator type
                                                        argTyList.add(baseV.getType());
                                                        Type retTy = Scene.v().getObjectType();
                                                        mockAPI = new SootMethod(mockFuncName, argTyList, retTy, soot.Modifier.STATIC | soot.Modifier.PUBLIC);
                                                    } else if (name.equals("hasNext")) {
                                                        List<Type> argTyList = new ArrayList<>();
                                                        // iterator type
                                                        argTyList.add(baseV.getType());
                                                        Type retTy = soot.BooleanType.v();
                                                        mockAPI = new SootMethod(mockFuncName, argTyList, retTy, soot.Modifier.STATIC | soot.Modifier.PUBLIC);
                                                    }
                                                    SootClass sc = Scene.v().getMethod(funcSig).getDeclaringClass();
                                                    sc.addMethod(mockAPI);
                                                    mockMethods.put(mockFuncName, mockAPI);

                                                    methodItrOutTyMap.put(funcSig, "java.util.Iterator");
                                                } else {
                                                    mockAPI = mockMethods.get(mockFuncName);
                                                }

                                                seenDataDeps.add(new iDataDep(funcSig, "itr", mockAPI.getSignature(), "arg0", "iterable analysis during extraction"));

                                                String taintSource = mockAPI.getSignature() + ".RET";
                                                logger.debug("Taint Source :: " + (Local) ((AssignStmt) u).getLeftOp() + " " + taintSource);
                                                localsw.addLocal( (Local) ((AssignStmt) u).getLeftOp(), new iValueExpr(taintSource, true) );

                                                otherCalleeV = new iVertex(u, iAttr.API_CALL, mockAPI);

                                            } else {
                                                logger.debug("WARN: the tainted iterable call " + name + " is ignored");

                                            }
                                        }

                                    }
                                    
                                }

                            }

                            if (otherCalleeV == null)
                                otherCalleeV = new iVertex(u, iAttr.EMPTY_CALLEE);
                            if (curV == null)
                                fgraph.addVertex(otherCalleeV);
                            else
                                fgraph.addEdge(curV, otherCalleeV, cond);

                            for (Unit succ : succs) 
                                q.add(getQuadraple(otherCalleeV, succ, null, localsw));

                            unit2Vertex.put(u, otherCalleeV);
                            loadedVs.add(otherCalleeV);

                        }

                    // } else if ( callees.size() > 1 ) {
                    //     // fuzzgen's strategy is ignoring indirect call
                    //     if (debug)
                    //         logger.debug(" -> multiple callee place, " + callees.toString());

                    //     iVertex multiCalleeV = new iVertex(u, iAttr.MULTI_CALLEE);
                    //     if (curV == null)
                    //         fgraph.addVertex(multiCalleeV);
                    //     else
                    //         fgraph.addEdge(curV, multiCalleeV, cond);

                    //     for (Unit succ : succs)
                    //         q.add(getQuadraple(multiCalleeV, succ, null, localsw));

                    //     unit2Vertex.put(u, multiCalleeV);
                    //     loadedVs.add(multiCalleeV);

                    } else {

                        iVertex fakeCallV = new iVertex(u, iAttr.FAKE_CALL);
                        if (curV == null)
                            fgraph.addVertex(fakeCallV);
                        else
                            fgraph.addEdge(curV, fakeCallV, cond);
                        curV = fakeCallV;

                        unit2Vertex.put(u, fakeCallV);

                        // if ( callees.size() > 1 )
                        //     logger.debug(" -> multiple callee place, " + callees.toString());
                        int i = 0;

                        for (SootMethod callee : callees) {
                            i = i + 1;

                            if ( isTargetAPI(callee) ) {
                                // the target library apis
                                if (debug)
                                    logger.debug(" -> target call place");

                                if (taint) {
                                    if (u instanceof AssignStmt) {
                                        // mark taint source 

                                        //String taintSource = callee.getDeclaringClass().getShortJavaStyleName() + "." + callee.getName() + ".RET";
                                        String taintSource = callee.getSignature() + ".RET";

                                        logger.debug("Taint Source :: " + (Local) ((AssignStmt) u).getLeftOp() + " " + taintSource);
                                        localsw.addLocal( (Local) ((AssignStmt) u).getLeftOp(), new iValueExpr(taintSource, true) );
                                    }

                                    InvokeExpr invoE = ((Stmt) u).getInvokeExpr();
                                    // logger.error("invoE: " + invoE);
                                    if (invoE instanceof InstanceInvokeExpr) {
                                        Value clsV = ((InstanceInvokeExpr) invoE).getBase();
                                        iExpr clsE = localsw.propagate(clsV);
                                        if (clsE.isTainted()) {
                                            seenDataDeps.add(new iDataDep(clsE, callee.getSignature(), "cls"));
                                        }

                                        for (int j = 0; j < invoE.getArgCount(); j++) {
                                            Value argV = invoE.getArg(j);
                                            iExpr argE = localsw.propagate(argV);
                                            if (argE.isTainted()) {
                                                seenDataDeps.add(new iDataDep(argE, callee.getSignature(), "arg" + Integer.toString(j)));
                                            }
                                        }

                                    } else if (invoE instanceof StaticInvokeExpr) {
                                        for (int j = 0; j < invoE.getArgCount(); j++) {
                                            Value argV = invoE.getArg(j);
                                            iExpr argE = localsw.propagate(argV);
                                            if (argE.isTainted()) {
                                                seenDataDeps.add(new iDataDep(argE, callee.getSignature(), "arg" + Integer.toString(j)));
                                            }
                                        }

                                    } else {
                                        throw new RuntimeException("ERROR: need handle more kinds of invokeexpr (now only InstanceInvokeExpr): " + invoE);
                                    }
                                }

                                logger.debug(" @@ target call place for unit " + u);
                                iVertex callV = new iVertex(u, iAttr.API_CALL, callee);
                                fgraph.addEdge(curV, callV, null);

                                for (Unit succ : succs)
                                    q.add(getQuadraple(callV, succ, null, localsw));

                                loadedVs.add(callV);

                            } else {

                                // TODO: check whether there are iterator related cases needs handle in this branch
                                if (taint && (((Stmt) u).getInvokeExpr() instanceof InterfaceInvokeExpr)) {
                                    boolean isTheCase = false;

                                    InvokeExpr invoE = ((Stmt) u).getInvokeExpr();
                                    Value baseV = ((InterfaceInvokeExpr) invoE).getBase();
                                    iExpr baseE = localsw.propagate(baseV);
                                    String theOnlyTaintSrc = baseE.isJustTheTaintValue();
                                    if ( (u instanceof AssignStmt) && (theOnlyTaintSrc != null) ) {
                                        if (theOnlyTaintSrc.endsWith(".RET") && callee.getName().equals("iterator")) 
                                            isTheCase = true;
                                        else if (theOnlyTaintSrc.endsWith(".RET") && callee.getName().equals("spliterator"))
                                            isTheCase = true;
                                        else if (theOnlyTaintSrc.endsWith(".RET") && baseV.getType().toString().equals("java.util.Iterator"))
                                            isTheCase = true;
                                        else if (theOnlyTaintSrc.endsWith(".ITR") && baseV.getType().toString().equals("java.util.Iterator"))
                                            isTheCase = true;
                                    }

                                    if (isTheCase)
                                        throw new RuntimeException("meets the iterator taint in non-empty callee case, fix this");
                                }

                                // other apis
                                boolean inRecursive = false;
                                boolean isTouched = false;
                                iGraph subFgraph = null;

                                subFgraph = touchedFuncs.get(callee);

                                if (st.search(callee) != -1)
                                    inRecursive = true;
                                if (subFgraph != null)
                                    isTouched = true;

                                if (inRecursive && (! isTouched)) {
                                    if (debug)
                                        logger.debug(" -> 1st place, subFgraph " + subFgraph);

                                    iVertex phV = new iVertex(null, iAttr.PLACEHOLDER, callee);
                                    fgraph.addEdge(curV, phV, null);

                                    for (Unit succ : succs) {
                                        // add a placeholder edge which will be fixed later
                                        // skip one step since the leaves are unknown
                                        q.add(getQuadraple(phV, succ, null, localsw));
                                    }

                                    loadedVs.add(phV);

                                    continue;
                                }

                                if (inRecursive && isTouched) {
                                    // i don't think this can really happen
                                    logger.debug("A function cannot be recursively called if its graph has already be built");
                                    System.exit(1);
                                }

                                // not in recursive cases

                                if (! isTouched) {
                                    subFgraph = buildOneFuncUsageGraph(touchedFuncs, icfg, callee, st, taintedLoopVars, untrackedLoopVars, seenDataDeps, isA2DG);
                                    // if (subFgraph.getEdges().size() == 0) {
                                    //     logger.debug("!!! Empty graph func " + callee.getName() + " called by unit " + u);
                                    // }
                                    if (debug)
                                        logger.debug(" -> extra place 1, on-the-fly builting graph" + subFgraph);
                                }

                                // if ( (callees.size() > 1) && (i > 1) )
                                //     logger.debug("func " + u + " has multiple callee " + subFgraph.breakDown());

                                if (subFgraph.getVertices().size() == 0) {
                                    if (debug)
                                        logger.debug(" -> 2nd place, callee " + callee + " subFgraph is empty");

                                    iVertex emptyFuncV = new iVertex(u, iAttr.EMPTY_FUNC, callee);
                                    fgraph.addEdge(curV, emptyFuncV, null);

                                    for (Unit succ : succs) 
                                        q.add(getQuadraple(emptyFuncV, succ, null, localsw));

                                    loadedVs.add(emptyFuncV);

                                } else {
                                    if (debug)
                                        logger.debug(" -> 3rd place, callee " + callee + " subFgraph is " + subFgraph.breakDown());

                                    HashMap<Integer,iVertex> maps = fgraph.merge(subFgraph);

                                    for (iVertex rootV : subFgraph.getRoots())
                                        fgraph.addEdge(curV, maps.get(rootV.getId()), null);

                                    for (iVertex leafV : subFgraph.getLeaves()) {
                                        for (Unit succ : succs)
                                            q.add(getQuadraple(maps.get(leafV.getId()), succ, null, localsw));
                                        
                                        loadedVs.add(maps.get(leafV.getId()));
                                    }

                                }

                            }

                            // only choose the first callee
                            break;
                        }

                    }

				} else {
                    // for other stmts
                    if (debug)
                        logger.debug(" -> other place");

                    iVertex otherV = null;

                    if (taint) {
                        // track the expression from taint source

                        if (u instanceof AssignStmt) {
                            // currently I think only assignstmt is deserved to track the data flow
                            if ( ! ((Stmt) u).containsInvokeExpr() ) {
                                // we don't want to taint function call data flow till now
                                boolean needPropogate = false;

                                // logger.debug("propagate 2: " + ((AssignStmt) u).getUseBoxes());
                                for (ValueBox vb : ((AssignStmt) u).getUseBoxes()) {
                                    Value v = vb.getValue();
                                    if ( (v instanceof Local) && (localsw.containsLocal((Local) v)) ) {
                                        needPropogate = true;
                                        break;
                                    }
                                }

                                Value lop = ((AssignStmt) u).getLeftOp();
                                Value rop = ((AssignStmt) u).getRightOp();
                                iExpr ropE = localsw.propagate(rop);

                                if (lop instanceof Local) {
                                    if (taintLocals.containsKey((Local)lop)) {
                                        // generate an update event using a mock API

                                        HashMap<String, String> argTable = new HashMap<>();
                                        List<String> raws = new ArrayList<>(ropE.getTaintSrcs());
                                        Collections.sort(raws);
                                        for (int i = 0; i < raws.size(); i++) {
                                            String raw = raws.get(i);
                                            if (raw.endsWith(".ITR"))
                                                throw new RuntimeException("this is not possible, the loop var is integer related type only");
                                            argTable.put(raw, "arg" + Integer.toString(i));
                                        }

                                        List<String> srcs = new ArrayList<>(taintLocals.get((Local) lop));
                                        Collections.sort(srcs);

                                        SootMethod mockAPI = null;
                                        String mockFuncName = Integer.toString(sm.getSignature().hashCode()) + "_" + lop + "_LOOPVAR_" + String.join(",", raws) + "_" + ropE.toCode(argTable);

                                        if (!mockMethods.containsKey(mockFuncName)) {
                                            List<Type> argTyList = new ArrayList<>();
                                            for (String raw : raws) {
                                                String fsig = raw.substring(0, raw.length() - 4);
                                                Type ty = Scene.v().getMethod(fsig).getReturnType();
                                                argTyList.add(ty);
                                            }

                                            Type retTy = lop.getType();
                                            mockAPI = new SootMethod(mockFuncName, argTyList, retTy, soot.Modifier.STATIC | soot.Modifier.PUBLIC);
                                            // just pick the first func sig
                                            logger.debug("srcs are " + srcs);
                                            SootClass sc = Scene.v().getMethod(srcs.get(0)).getDeclaringClass();
                                            sc.addMethod(mockAPI);
                                            mockMethods.put(mockFuncName, mockAPI);

                                        } else {
                                            mockAPI = mockMethods.get(mockFuncName);

                                        }

                                        // add seen data deps
                                        for (int i = 0; i < raws.size(); i++) {
                                            String raw = raws.get(i);
                                            String fsig = raw.substring(0, raw.length() - 4);
                                            // we filtered .itr in the above
                                            seenDataDeps.add(new iDataDep(fsig, "ret", mockAPI.getSignature(), "arg" + Integer.toString(i), "loopvar analysis during extraction"));
                                        }

                                        // introduce a taintsource
                                        String taintSource = mockAPI.getSignature() + ".RET";
                                        logger.debug("Taint Source :: " + lop + " " + taintSource);
                                        localsw.addLocal((Local)lop, new iValueExpr(taintSource, true));

                                        // create an API CALL event
                                        otherV = new iVertex(u, iAttr.API_CALL, mockAPI);

                                        // TODO: store the event expr information for mockAPI
                                        if (! mockLoopVarMethodsInfo.containsKey(mockFuncName)) {
                                            mockLoopVarMethodsInfo.put(mockFuncName, ropE);
                                        }
                                        if (! mockLoopVarMethodsArgTable.containsKey(mockFuncName)) {
                                            mockLoopVarMethodsArgTable.put(mockFuncName, argTable);
                                        }

                                    } else if (needPropogate) {
                                        logger.debug("for " + u + ", propagate from " + rop + " to " + ropE);
                                        if (lop instanceof Local)
                                            localsw.addLocal((Local)lop, ropE);

                                    } else
                                        logger.debug("for " + u + ", not propagate");
                                }
                            }
                        }
                    }

                    if (otherV == null) {
                        if (shouldKept(u))
                            otherV = new iVertex(u, iAttr.KEPT);
                        else
                            otherV = new iVertex(u, iAttr.NONE);
                    }
                    if (curV == null) 
                        fgraph.addVertex(otherV);
                    else
                        fgraph.addEdge(curV, otherV, cond);
                    
                    for (Unit succ : icfg.getSuccsOf(u))
                        q.add(getQuadraple(otherV, succ, null, localsw));
                    
                    unit2Vertex.put(u, otherV);
                    loadedVs.add(otherV);
                }

                if (icfg.getSuccsOf(u).size() == 0) {
                    // this is the return stmt
                    if  ( (u instanceof RetStmt) || (u instanceof ReturnStmt) || (u instanceof ReturnVoidStmt) || (u instanceof ThrowStmt) ) {
                        for (iVertex loadedV : loadedVs)
                            fgraph.addEdge(loadedV, endV, null);

                    // } else if (u instanceof ThrowStmt) {
                    //     // TODO
                    //     logger.debug("Eat throwstmt now: " + u);

                    } else {
                        // Check to see whether there are non-return stmt that has no succ
                        throw new RuntimeException("ERROR: " + u + " is not any return stmt but has NO SUCC units");

                    }

                }

                if (debug) {
                    // logger.debug(" Q out:" + q);
                }
            }
        }

        st.pop();


        // refine the graph, remove the useless vertices, get a smaller one
        // if (debug) {
        //     logger.debug("[-] fgraph of " + sm.getSignature() + " is : " + fgraph.breakDown());
        //     // fgraph.dotize(workdir.getPath() + "/" + "fgraph" + DOT_EXTENSION);
        // }

        // iGraph basicG = fgraph.basicGraph(debug);
        iGraph basicG = fgraph.basicGraph(false);

        // touchedFuncs.put(sm, fgraph);
        touchedFuncs.put(sm, basicG);

        if (debug) {
        // if (basicG.getVertices().size() > 100) {
        // if (basicG.getVertices().size() > 0) {
            logger.debug("[-] basicG of " + sm.getSignature() + " is : " + basicG.breakDown());
            // basicG.dotize(workdir.getPath() + "/" + "basicG" + DOT_EXTENSION);
            // System.exit(1);
        }

        // if (debug2) {
        //     for (Unit ut : sm.retrieveActiveBody().getUnits()) {
        //         if (fgraph.contains(ut))
        //             // logger.debug("   " + ut + ", Succs: " + icfg.getSuccsOf(ut).toString());
        //             // logger.debug(" ✅ " + ut);
        //             logger.debug("   " + ut);
        //         else
        //             logger.debug(" ❎ " + ut);
        //     }
        // }

        // return fgraph;
        return basicG;
    }

    public static iGraph extractUsageGraph(JimpleBasedInterproceduralCFG icfg, SootMethod sm, Set<iDataDep> seenDataDeps, boolean isA2DG)
    {
        execCount = BigInteger.ZERO;

        // for (SootMethod sm : Scene.v().getEntryPoints()) {
            // iterate every entry point (now only dummy main)

            // output function jimple code
    
		    JimpleBody body = (JimpleBody) sm.retrieveActiveBody();
            logger.debug("Func " + sm.getName() + " Body: " + body);

		    // // ExceptionalUnitGraph eug = new ExceptionalUnitGraph(body);
		    // BriefUnitGraph eug = new BriefUnitGraph(body);
      //       // EnhancedUnitGraph eug = new EnhancedUnitGraph(body);
		    // // ClassicCompleteUnitGraph eug = new ClassicCompleteUnitGraph(body);
		    // //logger.debug("CFG is : " + eug);
		    // CFGToDotGraph ctdg = new CFGToDotGraph();
		    // // DotGraph dg = ctdg.drawCFG(eug);
		    // DotGraph dg = ctdg.drawCFG(eug, null);
		    // dg.plot("thebbbbbbbbgraph.dot");

            HashMap<SootMethod, HashMap<String, Set<String>>> _1stUntrackedLoopVars = new HashMap<>();
            iGraph ugraph = buildOneFuncUsageGraph(new HashMap<>(), icfg, sm, new Stack<SootMethod>(), new HashMap<>(), _1stUntrackedLoopVars, seenDataDeps, isA2DG);

            logger.debug("[-] After 1st time exploring from " + sm.getName() + ", our usage graph: " + ugraph.breakDown() + ", exec count is " + execCount.toString(10) + ", untrackedLoopVars: " + _1stUntrackedLoopVars);

            if (!isA2DG) {
                if (_1stUntrackedLoopVars.size() != 0) {
                    HashMap<SootMethod, HashMap<String, Set<String>>> _2ndUntrackedLoopVars = new HashMap<>();
                    iGraph _2ndUgraph = buildOneFuncUsageGraph(new HashMap<>(), icfg, sm, new Stack<SootMethod>(), _1stUntrackedLoopVars, _2ndUntrackedLoopVars, seenDataDeps, isA2DG);
                    logger.debug("[-] After 2nd time exploring from " + sm.getName() + ", our usage graph: " + _2ndUgraph.breakDown() + ", exec count is " + execCount.toString(10));
                    return _2ndUgraph;
                }
            }

        // }

        // for (Map.Entry<SootMethod, iGraph> entry : touchedFuncs.entrySet()) {
        //     // SootMethod sm = entry.getKey();
        //     iGraph smgraph = entry.getValue();
        //     smgraph.fixPlaceHolders(touchedFuncs);
        // }

        // ugraph.fixPlaceHolders(touchedFuncs);
        // logger.debug("[-] After fix placeholders, our usage graph: " + ugraph.breakDown());

        return ugraph;

        // iGraph selectedGraph = null;

        // for (Map.Entry<SootMethod, iGraph> entry : touchedFuncs.entrySet()) {
        //     SootMethod sm = entry.getKey();
        //     iGraph smgraph = entry.getValue();

        //     if (sm.getSignature().equals("<com.foobnix.ext.DjvuExtract: com.foobnix.ext.EbookMeta getBookMetaInformation(java.lang.String)>")) {
        //         logger.debug("sm sig is " + sm.getSignature() + " graph is " + smgraph.breakDown());
        //         selectedGraph = smgraph;
        //     }
        // }

        // return selectedGraph;
    }

    public static iAutomata convertUsageGraph2Automata(iGraph ig, String name)
    {
        //
        // this func only accepts basicgraph, which only contains START, END, KEPT, BRANCH_KEPT, API_CALL
        //

        boolean debug = false;
        // boolean debug = true;

        // create mapping of iVertex & String
        HashMap<iVertex, String> v2s = new HashMap<iVertex, String>();
        // HashMap<String, iVertex> s2v = new HashMap<String, iVertex>();

        int idx = 0;
        for (iVertex iv : ig.getVertices()) {
            String s = String.valueOf(idx);
            v2s.put(iv, s);
            // s2v.put(s, iv);
            idx++;
        }

        iAutomata ia = new iAutomata(name);

        // triple of < curState, event, nextVertex >
        Set<Map.Entry<Map.Entry<String, iEvent>, iVertex>> q = new HashSet<Map.Entry<Map.Entry<String, iEvent>, iVertex>>();

        for (iVertex iv : ig.getRoots())
            q.add(getTriple((String) null, (iEvent) null, iv));

        while (q.size() > 0) {
            // get the first one from set
            // Map.Entry<iVertex, Unit> entry = q.poll();
            Iterator<Map.Entry<Map.Entry<String, iEvent>, iVertex>> it = q.iterator();
            Map.Entry<Map.Entry<String, iEvent>, iVertex> tritry = it.next();
            it.remove();

            String curS = tritry.getKey().getKey();
            iEvent event = tritry.getKey().getValue();
            iVertex iv = tritry.getValue();

            String nextS = v2s.get(iv);

            if (ia.containState(nextS)) {
                if (curS == null) {
                    logger.error("this is impossible");
                    System.exit(-1);

                } else {
                    if (debug) {
                        logger.debug("  >> Already been Touched: " + nextS + "]");
                        // logger.debug("  >> Queue are:" + q);
                    }

                    ia.addTransition(curS, nextS, event);
                    continue;

                }
            }

            if (debug)
                logger.debug("[-] Vertex is " + iv + ", attr: " + iv.getAttr());
            
            Set<iVertex> succs = ig.getSuccs(iv);
            iAttr attr = iv.getAttr();

            if (debug)
                logger.debug("[-] attr is " + attr + ", cond : " + (attr.equals(iAttr.API_CALL) || attr.equals(iAttr.KEPT)));

            if (attr.equals(iAttr.API_CALL)) {

                if (debug)
                    logger.debug("  -> API_CALL");

                ia.addTransition(curS, nextS, event);

                for (iVertex nextV : succs) {
                    // q.add(getTriple(nextS, new iCallAPIEvent(iv.getCallee().getDeclaringClass().getShortJavaStyleName() +  "." + iv.getCallee().getName())) , nextV));
                    q.add(getTriple(nextS, new iCallAPIEvent(iv.getCallee().getSignature()), nextV));
                }

            } else if (attr.equals(iAttr.KEPT)) {

                if (debug)
                    logger.debug("  -> KEPT");

                ia.addTransition(curS, nextS, event);

                throw new RuntimeException("KEPT has not been supported");

                // for (iVertex nextV : succs) {
                //     q.add(getTriple(nextS, new iSomeEvent(someInfo), nextV));
                // }

            } else if (attr.equals(iAttr.BRANCH_KEPT)) {

                if (debug)
                    logger.debug("  -> BRANCH_KEPT");

                ia.addTransition(curS, nextS, event);

                for (iVertex nextV : succs) {
                    q.add(getTriple(nextS, new iCondEvent(ig.getiPaths(iv, nextV)), nextV));
                }

            } else if (attr.equals(iAttr.START)) {

                if (debug)
                    logger.debug("  -> START");

                if (curS != null) 
                    throw new RuntimeException("ERROR: initial state not start from beginning, curS: " + curS + " , iv: " + iv);

                ia.addInitialState(nextS);

                for (iVertex nextV : succs) {
                    q.add(getTriple(nextS, new iEpsilonEvent(ia.addOneEpsilon()), nextV));
                }

            } else if (attr.equals(iAttr.END)) {

                if (debug)
                    logger.debug("  -> END");

                ia.addTransition(curS, nextS, event);

                if (succs.size() > 0) {
                    // error
                    logger.error("There are vertexs after END, succs: " + succs);
                    System.exit(1);
                }

            } else {
                logger.error("This iGraph contains not accepted iVertex: " + iv);
                System.exit(1);

            }

        }

        return ia;
    }

    public static void dumpA2DGGraph2Json(String name, iGraph a2dg, String a2dgJsonFile) {
        JSONObject obj = a2dg.toA2DGJson(name);

		try {
			File fout = new File(a2dgJsonFile);
			FileOutputStream fos = new FileOutputStream(fout);
		 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

			obj.writeJSONString(bw);
		 
			bw.close();

		} catch (Exception ex) {
			throw new RuntimeException("ERROR: output json: " + ex.getMessage());

		}
    }

}