package com.fuzz;

import org.apache.pdfbox.pdmodel.PDDocument;
import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {
	
   public static void fuzzerTestOneInput(FuzzedDataProvider data) {

      try {
           PDDocument document = PDDocument.load(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));
           document.close();

      } catch (Exception | java.lang.AssertionError  ex) {
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);

      }

    }

}
