package ahg.extraction.graph;

import ahg.extraction.graph.iAttr;
import ahg.extraction.graph.iVertex;


public class iEdge {
    private iVertex src;
    private iVertex dst;

    public iEdge(iVertex _src, iVertex _dst) {
        src = _src;
        dst = _dst;
    }

    public iVertex getSrc() {
        return src;
    }

    public iVertex getDst() {
        return dst;
    }

    public String toString() {
        return src.toString() + " => " + dst.toString();
    }

    @Override
    public int hashCode() {
        int a = src.hashCode();
        int b = dst.hashCode();
        return a + b + (a ^ b);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        iEdge other = (iEdge) obj;
        return (src == other.src) && (dst == other.dst);
    }
}
