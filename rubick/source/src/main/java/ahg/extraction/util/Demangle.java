package ahg.extraction.util;

import soot.SootMethod;

public class Demangle {

    static public String getDemangleName(SootMethod sm) 
    {
        // TODO: need to find a complete demangle method

        String funcname = sm.getName();
        String classname = sm.getDeclaringClass().getName();
        String key = "Java_" + classname.replace('.', '_') + "_" + funcname;
        return key;
    }

    static public String getSimplifiedDemangleName(SootMethod sm) 
    {
        // TODO: need to find a complete demangle method

        String funcname = sm.getName();
        String classname = sm.getDeclaringClass().getShortName();
        String key = classname + ":" + funcname;
        return key;
    }

}
