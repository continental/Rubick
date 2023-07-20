package ahg.extraction.graph;

import java.util.Map;
import java.util.HashMap;
import static java.util.Map.entry;    
import java.util.concurrent.atomic.AtomicInteger;
import javax.lang.model.util.ElementScanner6;
import java.lang.System;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import soot.Unit;
import soot.SootMethod;

import ahg.extraction.graph.iAttr;
import ahg.extraction.util.Demangle;

public class iVertex {

	private static final Logger logger = LogManager.getLogger(iVertex.class.getName());

    private Unit stmt;
    private iAttr attr;
    private SootMethod callee;
    private int _id;

    static final AtomicInteger NEXT_ID = new AtomicInteger(1);

    public iVertex(Unit _stmt, iAttr _attr) {
        stmt = _stmt;
        attr = _attr;
        callee = null;

        if (attr == iAttr.PLACEHOLDER) {
            logger.error("placeholder need specify callee");
            System.exit(-1);
        }

        _id = NEXT_ID.getAndIncrement();
    }

    public iVertex(Unit _stmt, iAttr _attr, SootMethod _callee) {
        stmt = _stmt;
        attr = _attr;
        // NOTE: callee can be null but current code assumes that API_CALL always has a non-null callee
        callee = _callee;

        if ( (attr == iAttr.PLACEHOLDER) && (stmt != null) ) {
            logger.error("placeholder cannot have stmt");
            System.exit(-1);
        }

        _id = NEXT_ID.getAndIncrement();
    }

    public iVertex(iVertex v2) {
        stmt = v2.getUnit();
        attr = v2.getAttr();
        callee = v2.getCallee();

        _id = NEXT_ID.getAndIncrement();
    }

    public boolean hasUnit() {
        return stmt != null;
    }

    public Unit getUnit() {
        return stmt;
    }

    public SootMethod getCallee() {
        return callee;
    }

    public iAttr getAttr() {
        return attr;
    }

    public int getId() {
        return _id;
    }

    public String getDotId() {
        switch (attr.getAttr()) {
            case iAttr._NONE: 
                return "<NN " + stmt.toString() + " " + _id + ">";
            case iAttr._KEPT: 
                return "<KT " + stmt.toString() + " " + _id + ">";
            case iAttr._API_CALL:
                return "<API " + Demangle.getSimplifiedDemangleName(callee) + _id + ">";
                // return "<API " + callee.getName() + " " + _id + ">";
                // return "<API " + Demangle.getDemangleName(callee) + _id + ">";
            case iAttr._BRANCH_NONE:
                return "<BN " + stmt.toString() + " " + _id + ">";
            case iAttr._BRANCH_KEPT:
                return "<BK " + stmt.toString() + " " + _id + ">";
            case iAttr._FAKE_CALL:
                return "<FK " + stmt.toString() + " " + _id + ">";
            case iAttr._PLACEHOLDER:
                return "<PL " + callee.getName() + " " + _id + ">";
            case iAttr._EMPTY_CALLEE:
                return "<EC " + stmt.toString() + " " + _id + ">";
            case iAttr._EMPTY_FUNC:
                return "<EF " + Demangle.getDemangleName(callee) + " " + _id + ">";
            case iAttr._MULTI_CALLEE:
                return "<MC " + stmt.toString() + " " + _id + ">";
            case iAttr._START:
                return "<S " + _id + ">";
            case iAttr._END:
                return "<E " + _id + ">";
        }
        logger.error("invalid attr");
        System.exit(-1);
        return "";
    }

    private static HashMap<String, String> none = new HashMap<String, String>(Map.ofEntries(
            entry("style", "solid")
        ));
    private static HashMap<String, String> kept = new HashMap<String, String>(Map.ofEntries(
            entry("style", "solid")
        ));
    private static HashMap<String, String> apiCall = new HashMap<String, String> (Map.ofEntries(
            entry("style", "\"filled, solid\""),
            entry("fillColor", "red")
        ));
    private static HashMap<String, String> branchNone = new HashMap<String, String> (Map.ofEntries(
            entry("style", "solid")
        ));
    private static HashMap<String, String> branchKept = new HashMap<String, String> (Map.ofEntries(
            entry("style", "solid")
        ));
    private static HashMap<String, String> fakeCall = new HashMap<String, String> (Map.ofEntries(
            entry("style", "dotted")
        ));
    private static HashMap<String, String> placeholder = new HashMap<String, String> (Map.ofEntries(
            entry("style", "dotted")
        ));
    private static HashMap<String, String> emptyCallee = new HashMap<String, String> (Map.ofEntries(
            entry("style", "solid")
        ));
    private static HashMap<String, String> emptyFunc = new HashMap<String, String> (Map.ofEntries(
            entry("style", "solid")
        ));
    private static HashMap<String, String> multiCallee = new HashMap<String, String> (Map.ofEntries(
            entry("style", "solid")
        ));
    private static HashMap<String, String> start = new HashMap<String, String> (Map.ofEntries(
            entry("style", "dotted")
        ));
    private static HashMap<String, String> end = new HashMap<String, String> (Map.ofEntries(
            entry("style", "dotted")
        ));

    public HashMap<String, String> getDotAttr() {
        switch (attr.getAttr()) {
            case iAttr._NONE: return none;
            case iAttr._KEPT: return kept;
            case iAttr._API_CALL: return apiCall;
            case iAttr._BRANCH_NONE: return branchNone;
            case iAttr._BRANCH_KEPT: return branchKept;
            case iAttr._FAKE_CALL: return fakeCall;
            case iAttr._PLACEHOLDER: return placeholder;
            case iAttr._EMPTY_CALLEE: return emptyCallee;
            case iAttr._EMPTY_FUNC: return emptyFunc;
            case iAttr._MULTI_CALLEE: return multiCallee;
            case iAttr._START: return start;
            case iAttr._END: return end;
        }
        logger.error("invalid attr");
        System.exit(-1);
        return none;
    }

    public String toString() {
        return "(V " + ( stmt != null ? stmt.toString() : "null" ) + " " + attr.toString() + " )";
    }

    @Override
    public int hashCode() {
        return _id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        iVertex other = (iVertex) obj;

        //if (attr != other.getAttr())
        //    return false;
        //return ( stmt == other.stmt ) && ( callee == other.callee );
        return _id == other.getId();
    }
}
