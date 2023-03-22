package ahg.extraction.graph;

import java.lang.System;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class iAttr {

    private static final Logger logger = LogManager.getLogger(iAttr.class.getName());

    public static final int _NONE = 0;
    public static final int _KEPT = 1;
    public static final int _API_CALL = 2;
    public static final int _BRANCH_NONE = 3;
    public static final int _BRANCH_KEPT = 4;
    public static final int _FAKE_CALL = 5;
    public static final int _PLACEHOLDER = 6;
    public static final int _EMPTY_CALLEE = 7;
    public static final int _EMPTY_FUNC = 9;
    public static final int _MULTI_CALLEE = 10;
    public static final int _START = 11;
    public static final int _END = 12;
    public static final int _ATTR_MAX = 13;

    public static final iAttr NONE = new iAttr(_NONE);
    public static final iAttr KEPT = new iAttr(_KEPT);
    public static final iAttr API_CALL = new iAttr(_API_CALL);
    public static final iAttr BRANCH_NONE = new iAttr(_BRANCH_NONE);
    public static final iAttr BRANCH_KEPT = new iAttr(_BRANCH_KEPT);
    public static final iAttr FAKE_CALL = new iAttr(_FAKE_CALL);
    public static final iAttr PLACEHOLDER = new iAttr(_PLACEHOLDER);
    public static final iAttr EMPTY_CALLEE = new iAttr(_EMPTY_CALLEE);
    public static final iAttr EMPTY_FUNC = new iAttr(_EMPTY_FUNC);
    public static final iAttr MULTI_CALLEE = new iAttr(_MULTI_CALLEE);
    public static final iAttr START = new iAttr(_START);
    public static final iAttr END = new iAttr(_END);

    private int attr;

    public iAttr(int _attr) {
        if (_attr < _NONE || _attr >= _ATTR_MAX) {
            logger.error("invalid attr " + _attr);
            System.exit(-1);
        }

        attr = _attr;
    }

    public int getAttr() {
        return attr;
    }

    public String toString() {
        switch (attr) {
            case _NONE: return "NONE";
            case _KEPT: return "KEPT";
            case _API_CALL: return "API_CALL";
            case _BRANCH_NONE: return "BRANCH_NONE";
            case _BRANCH_KEPT: return "BRANCH_KEPT";
            case _FAKE_CALL: return "FAKE_CALL";
            case _PLACEHOLDER: return "PLACEHOLDER";
            case _EMPTY_CALLEE: return "EMPTY_CALLEE";
            case _EMPTY_FUNC: return "EMPTY_FUNC";
            case _MULTI_CALLEE: return "MULTI_CALLEE";
            case _START: return "START";
            case _END: return "END";
        }
    
        logger.error("invalid attr number" + attr);
        System.exit(-1);
        return "";
    }

    @Override
    public int hashCode() {
        return attr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        iAttr other = (iAttr) obj;
        return attr == other.attr;
    }
}
