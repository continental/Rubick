package com.fuzz;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;

import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;
import com.github.junrar.exception.RarException;;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {
    public static void fuzzerTestOneInput(FuzzedDataProvider data) {
        InputStream inputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

        try {

            final Archive archive = new Archive(inputStream);
            while (true) {
                FileHeader fileHeader = archive.nextFileHeader();
                if (fileHeader == null) {
                    break;
                }
                archive.extractFile(fileHeader, OutputStream.nullOutputStream()); 
            }
        } catch (Exception | java.lang.AssertionError  ex) {
            //System.out.println("catched throwable " + ignore);
            //ignore.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
        }
    }
}
