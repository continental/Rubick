package com.fuzz;

import org.apache.commons.compress.archivers.tar.TarFile;
import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {

    public static void fuzzerTestOneInput(FuzzedDataProvider data) {
        try {
            new TarFile(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data)).close();
        } catch (Exception | java.lang.AssertionError  ex) {
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
        }
    }
}
