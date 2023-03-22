package ahg.extraction.graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import ahg.extraction.graph.constraint.iConstraint;
import ahg.extraction.graph.constraint.iPaths;
import ahg.extraction.graph.iAttr;
import ahg.extraction.graph.iEdge;
import ahg.extraction.graph.iVertex;
import ahg.extraction.util.Demangle;

import soot.SootMethod;
import soot.util.dot.DotGraph;
import soot.util.dot.DotGraphEdge;
import soot.util.dot.DotGraphNode;
// TODO: change to lock version if needed
// import java.util.concurrent.locks.ReentrantReadWriteLock;

import static soot.util.dot.DotGraph.DOT_EXTENSION;


public class iGraph {

    private static final Logger logger = LogManager.getLogger(iGraph.class.getName());

    private Set<iVertex> vertices;
    private Set<iEdge> edges;
    private HashMap<iVertex, Set<iVertex>> preds;
    private HashMap<iVertex, Set<iVertex>> succs;
    private HashMap<iEdge, iPaths> edge2iPaths;

    public iGraph() {
        vertices = new HashSet<iVertex>();
        edges = new HashSet<iEdge>();
        preds = new HashMap<iVertex, Set<iVertex>>();
        succs = new HashMap<iVertex, Set<iVertex>>();
        edge2iPaths = new HashMap<iEdge, iPaths>();
    }

    public boolean contains(iVertex v) {
        return vertices.contains(v);
    }

    public boolean contains(iEdge e) {
        return edges.contains(e);
    }

    // this returns read only vertex set
    public Set<iVertex> getVertices() {
        return Collections.unmodifiableSet(vertices);
    }

    public void addVertex(iVertex v) {
        vertices.add(v);
        if ( !preds.containsKey(v) ) 
            preds.put(v, new HashSet<iVertex>());
        if ( !succs.containsKey(v) )
            succs.put(v, new HashSet<iVertex>());

        //logger.debug("[-] add Vertex " + v.toString());
    }

    // public void dumpiPaths() {
    //     logger.debug("There are " + edge2iPaths.size() + " iPaths:");
    //     edge2iPaths.forEach((edge, ipaths) -> {
    //         logger.debug("  -> edge " + edge + " has iPaths " + ipaths.toString());
    //     });
    // }

    // will return null if no condition for e
    public iPaths getiPaths(iEdge e) {
        // this will return null if key not found (java HashMap)
        // which is exactly what we expected
        return edge2iPaths.get(e);
    }

    // will return null if no condition for e
    public iPaths getiPaths(iVertex from, iVertex to) {
        return edge2iPaths.get(new iEdge(from, to));
    }

    private void addiPaths(iEdge e, iPaths paths) {
        iPaths existing = edge2iPaths.get(e);
        if (existing == null) 
            existing = new iPaths();

        existing.addPaths(paths);

        edge2iPaths.put(e, existing);
    }

    private void addConstraintToiPaths(iEdge e, iConstraint cond) {
        iPaths existing = edge2iPaths.get(e);
        if (existing == null) 
            existing = new iPaths();

        existing.addConstraintToPaths(cond);

        edge2iPaths.put(e, existing);
    }

    // this returns read only edges set
    public Set<iEdge> getEdges() {
        return Collections.unmodifiableSet(edges);
    }

    private void addEdge(iEdge e, iPaths paths) {
        addEdge(e.getSrc(), e.getDst(), paths);
    }

    // will add the vertices if not in
    private void addEdge(iVertex src, iVertex dst, iPaths paths) {
        iEdge e;

        addVertex(src);
        addVertex(dst);
        e = new iEdge(src, dst);
        edges.add(e);

        if ( !preds.containsKey(dst) ) {
            preds.put(dst, new HashSet<iVertex>());
        }
        preds.get(dst).add(src);

        if ( !succs.containsKey(src) ) {
            succs.put(src, new HashSet<iVertex>());
        }
        succs.get(src).add(dst);

        if (paths != null)
            addiPaths(e, paths);

        logger.debug("[-] add Edge " + e.toString() + " with paths: " + paths);
    }

    public void addEdge(iEdge e, iConstraint cond) {
        addEdge(e.getSrc(), e.getDst(), cond);
    }

    public void addEdge(iVertex src, iVertex dst, iConstraint cond) {
        iEdge e;

        addVertex(src);
        addVertex(dst);
        e = new iEdge(src, dst);
        edges.add(e);

        if ( !preds.containsKey(dst) ) {
            preds.put(dst, new HashSet<iVertex>());
        }
        preds.get(dst).add(src);

        if ( !succs.containsKey(src) ) {
            succs.put(src, new HashSet<iVertex>());
        }
        succs.get(src).add(dst);

        if (cond != null)
            addConstraintToiPaths(e, cond);

        logger.debug("[-] add Edge " + e.toString() + " with cond: " + cond);
    }

    public Set<iVertex> getPreds(iVertex v) {
        return preds.get(v);
    }

    public boolean hasPreds(iVertex v) {
        Set<iVertex> pVs = preds.get(v);
        if ( (pVs == null) || (pVs.size() == 0) )
            return false;
        return true;
    }

    public Set<iVertex> getSuccs(iVertex v) {
        return succs.get(v);
    }

    public boolean hasSuccs(iVertex v) {
        Set<iVertex> sVs = succs.get(v);
        if ( (sVs == null) || (sVs.size() == 0) )
            return false;
        return true;
    }

    private void delEdge(iVertex src, iVertex dst, boolean alsoVertex) {
        delEdge(new iEdge(src, dst), alsoVertex);
    }

    private void delEdge(iEdge e, boolean alsoVertex) {
        _realDelEdge(e, alsoVertex);
    }

    private void _realDelEdge(iEdge e, boolean alsoVertex) {
        iVertex src = e.getSrc();
        iVertex dst = e.getDst();

        edges.remove(e);
        edge2iPaths.remove(e);
        preds.get(dst).remove(src);
        succs.get(src).remove(dst);

        if (alsoVertex) {
            if ( (!hasPreds(src)) && (!hasSuccs(src)) ) {
                vertices.remove(src);
            }

            if ( (!hasPreds(dst)) && (!hasSuccs(dst)) ) {
                vertices.remove(dst);
            }
        }
    }

    private void delVertex(iVertex v) {
        Set<iEdge> es = new HashSet<iEdge>();

        for (iVertex pred : preds.get(v))
            es.add(new iEdge(pred, v));

        for (iVertex succ : succs.get(v))
            es.add(new iEdge(v, succ));

        // remove all related edges
        for (iEdge e : es)
            _realDelEdge(e, false);

        // remove the vertex
        vertices.remove(v);
    }

    private void weedOutVertex(iVertex v, boolean debug) {
        if (debug) {
            // if ((preds.get(v).size() > 100) || (succs.get(v).size() > 100)) {
            if ((preds.get(v).size() > 0) && (succs.get(v).size() > 0)) {
                logger.debug("For v: " + v + ", # of pred " + preds.get(v).size() + ", # of succ " + succs.get(v).size() + " in total: " + ( succs.get(v).size() * succs.get(v).size() ) );
                logger.debug("preds:");
                for (iVertex pred : preds.get(v)) {
                    logger.debug("    " + pred);
                }
                logger.debug("succs:");
                for (iVertex succ : succs.get(v)) {
                    logger.debug("    " + succ);
                }
            }
        }

        for (iVertex pred : preds.get(v)) {
            for (iVertex succ : succs.get(v)) {
                // cross link all ipaths of pred -> v and v -> succ

                iPaths pred2v = getiPaths(pred, v);
                iPaths v2succ = getiPaths(v, succ);

                addEdge(pred, succ, iPaths.crossLinkiPaths(pred2v, v2succ));
            }
        }

        delVertex(v);
    }

    public iGraph basicGraph(boolean debug) {

        iGraph basicG = this;

        // iGraph basicG = new iGraph();
        // basicG.merge(this);

        Set<iVertex> weedOutVs = new HashSet<iVertex>();

        for (iVertex v : basicG.getVertices()) {
            switch (v.getAttr().getAttr()) {
                case iAttr._START:
                    if (basicG.hasPreds(v))
                        weedOutVs.add(v);
                    break;
                case iAttr._END:
                    if (basicG.hasSuccs(v))
                        weedOutVs.add(v);
                    break;
                case iAttr._API_CALL:
                    break;
                case iAttr._BRANCH_KEPT:
                    break;
                case iAttr._KEPT:
                    break;
                default:
                    weedOutVs.add(v);
                    break;
            }
        }

        // logger.debug("[-] # of weedOutVs : " + weedOutVs.size());

        // int i = 0;
        // int step = weedOutVs.size() / 100;
        for (iVertex v : weedOutVs) {
            // if (i % step == 0)
                // logger.debug("[-] Progress : " + (i / step) + "%, G has " + basicG.getEdges().size() + " edges");

            // int before = getConstraintNum();
            // dumpConstraints();
            // dotize("./before-weed" + DOT_EXTENSION);

            basicG.weedOutVertex(v, debug);

            // int after = getConstraintNum();
            // dumpConstraints();
            // dotize("./after-weed" + DOT_EXTENSION);

            // if (before != after)
                // logger.debug("WARN: Constraints has changed from " + before + " to " + after + " after weeding out vertex " + v);

            if (debug) {
                logger.debug("After v: basicG is " + basicG.breakDown());
            }
            // i = i + 1;
        }

        // logger.debug("[-] Our basic usage graph: " + basicG.breakDown());

        return basicG;
    }

    // this merge simply treats all vertices and edges as NEW
    public HashMap<Integer,iVertex> merge(iGraph g) {
        // old id -> new vertex
        HashMap<Integer,iVertex> maps = new HashMap<Integer, iVertex>();

        // this also can add the vertices which has no edge
        for (iVertex v : g.getVertices()) {
            iVertex newV = new iVertex(v);
            maps.put(v.getId(), newV);
        }

        for (iEdge e : g.getEdges()) {
            iVertex src;
            iVertex dst;

            iVertex _src = e.getSrc();
            iVertex _dst = e.getDst();

            if ( ! maps.containsKey( _src.getId() ) ) {
                logger.error("this is impossible, we created this vertex before");
                System.exit(1);
            }

            if ( ! maps.containsKey( _dst.getId() ) ) {
                logger.error("this is impossible, we created this vertex before");
                System.exit(1);
            }

            src = maps.get(_src.getId());
            dst = maps.get(_dst.getId());

            addEdge(src, dst, g.getiPaths(_src, _dst));
        }

        return maps;
    }

    public Set<iVertex> getRoots() {
        return get0Ins();
    }

    public Set<iVertex> getLeaves() {
        return get0Outs();
    }

    private Set<iVertex> get0Ins() {
        Set<iVertex> roots = new HashSet<iVertex>();
        for (iVertex v : vertices) {
            if ( !preds.containsKey(v) )
                roots.add(v);
            else if ( preds.get(v).size() == 0 )
                roots.add(v);
        }
        return roots;
    }

    private Set<iVertex> get0Outs() {
        Set<iVertex> leaves = new HashSet<iVertex>();
        for (iVertex v : vertices) {
            if ( !succs.containsKey(v) )
                leaves.add(v);
            else if ( succs.get(v).size() == 0 )
                leaves.add(v);
        }
        return leaves;
    }

    public void fixPlaceHolders(HashMap<SootMethod,iGraph> touchedFuncs) {
        Set<iVertex> plVs = new HashSet<iVertex>();

        for (iVertex v : vertices) {
            if (v.getAttr() == iAttr.PLACEHOLDER) {
                plVs.add(v);
            }
        }

        // TODO: this should be fixed later

        for (iVertex plV : plVs) {
            SootMethod sm = plV.getCallee();
            iGraph fgraph = touchedFuncs.get(sm);

            // add preds to sm roots
            for (iVertex predV : preds.get(plV))
                for (iVertex rootV : fgraph.getRoots())
                    addEdge(predV, rootV, getiPaths(predV, plV));

            // add succs to sm leaves
            for (iVertex succV : succs.get(plV))
                for (iVertex leafV : fgraph.getLeaves()) 
                    addEdge(leafV, succV, getiPaths(plV, succV));
        }

        for (iVertex plV : plVs) {
            // remove plV and its related edges
            delVertex(plV);
        }
    }

    public boolean isEmpty() {

        int notStartOrEnd = 0;

        for (iVertex v : vertices) {
            switch (v.getAttr().getAttr()) {
                case iAttr._START:
                    break;
                case iAttr._END:
                    break;
                default:
                    notStartOrEnd += 1;
            }
        }

        return notStartOrEnd == 0;
    }

    public void dotize(String dotfile) {
        DotGraph dot = new DotGraph(dotfile);

        // subgraph tricks to put the startNodes at top
        DotGraph startNodes = dot.createSubGraph("startNodes");
        startNodes.setGraphAttribute("rank", "source");
        getRoots().forEach(ele -> {
            startNodes.drawNode(ele.getDotId());
        });

        vertices.forEach(ele -> {
            DotGraphNode node = dot.drawNode(ele.getDotId());
            ele.getDotAttr().entrySet().forEach(entry -> {
                node.setAttribute(entry.getKey(), entry.getValue());
            });
        });
        edges.forEach(ele -> {
            iVertex srcv = ele.getSrc();
            iVertex dstv = ele.getDst();
            String src = srcv.getDotId();
            String dst = dstv.getDotId();
            DotGraphEdge edge = dot.drawEdge(src, dst);
            // dump constraint
            iPaths paths = getiPaths(ele);
            if (paths != null)
			    edge.setAttribute("label", "\"" + paths.toString() + "\"");
        });

        try {

            if (dotfile.equals("-"))
                dot.render(System.out, 2);
            else
                dot.plot(dotfile);

        } catch (Exception ex) {

            throw new RuntimeException("ERROR: dotize " + ex.getMessage());

        }
    }

    public JSONObject toA2DGJson(String name) {
        JSONObject obj = new JSONObject();

        JSONObject info = new JSONObject();
        JSONArray _nodes = new JSONArray();
        for (iVertex iv : vertices) {
            JSONObject oneNodeInfo = new JSONObject();

            String id = Integer.toString(iv.getId());

            iAttr attr = iv.getAttr();
            if (attr.equals(iAttr.API_CALL)) {
                oneNodeInfo.put("type", "API");
                oneNodeInfo.put("sig", iv.getCallee().getSignature());

            } else if (attr.equals(iAttr.START)) {
                oneNodeInfo.put("type", "START");

            } else if (attr.equals(iAttr.END)) {
                oneNodeInfo.put("type", "END");

            } else {
                logger.error("Meet unsupprted vertices in generation a2dg json" + iv);
                System.exit(1);

            }

            info.put(id, oneNodeInfo);
            _nodes.add(id);
        }

        JSONArray _edges = new JSONArray();
        for (iEdge e : edges) {
            String frmId = Integer.toString(e.getSrc().getId());
            String toId = Integer.toString(e.getDst().getId());

            JSONObject _edge = new JSONObject();
            _edge.put("from", frmId);
            _edge.put("to", toId);
            _edges.add(_edge);
        }

        obj.put("name", name);
        obj.put("nodes", _nodes);
        obj.put("edges", _edges);
        obj.put("info", info);

        return obj;
    }

    @Override
    public String toString() {
        return "iG " + vertices.size() + " Vs " + edges.size() + " Es";
    }

    public String breakDown() {
        String detail =  "iG " + vertices.size() + " Vs " + edges.size() + " Es";

        Set<String> uniqApicalls = new HashSet<String>();

        int none = 0;
        int kept = 0;
        int apicall = 0;
        int branchNone = 0;
        int branchKept = 0;
        int fakecall = 0;
        int placeholder = 0;
        int emptycallee = 0;
        int emptyFunc = 0;
        int multiCallee = 0;
        int start = 0;
        int end = 0;

        for (iVertex v : vertices) {
            switch (v.getAttr().getAttr()) {
                case iAttr._NONE: 
                    none = none + 1;
                    break;
                case iAttr._KEPT: 
                    kept = kept + 1;
                    break;
                case iAttr._API_CALL:
                    apicall = apicall + 1;
                    uniqApicalls.add( Demangle.getDemangleName(v.getCallee()) );
                    break;
                case iAttr._BRANCH_NONE: 
                    branchNone = branchNone + 1;
                    break;
                case iAttr._BRANCH_KEPT: 
                    branchKept = branchKept + 1;
                    break;
                case iAttr._FAKE_CALL:
                    fakecall = fakecall + 1;
                    break;
                case iAttr._PLACEHOLDER:
                    placeholder = placeholder + 1;
                    break;
                case iAttr._EMPTY_CALLEE:
                    emptycallee = emptycallee + 1;
                    break;
                case iAttr._EMPTY_FUNC:
                    emptyFunc = emptyFunc + 1;
                    break;
                case iAttr._MULTI_CALLEE:
                    multiCallee = multiCallee + 1;
                    break;
                case iAttr._START:
                    start = start + 1;
                    break;
                case iAttr._END:
                    end = end + 1;
                    break;
            }
        }

        detail = detail + ", NN: " + none + ", KT: " + ", API: " + uniqApicalls.size() + "/" + apicall + ", BRN: " + branchNone + ", BRK: " + branchKept + ", FK: " + fakecall + ", PL: " + placeholder + ", EC: " + emptycallee + ", EF: " + emptyFunc + ", MC: " + multiCallee + ", S: " + start + ", E: " + end;

        return detail;
    }
}
