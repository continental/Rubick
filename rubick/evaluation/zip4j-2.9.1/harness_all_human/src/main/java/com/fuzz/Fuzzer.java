package com.fuzz;

import net.lingala.zip4j.io.inputstream.ZipInputStream;
import net.lingala.zip4j.model.LocalFileHeader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.ByteArrayInputStream;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {

	public static void fuzzerTestOneInput(FuzzedDataProvider data) {
		LocalFileHeader localFileHeader = null;
		int readLen = 0;
		byte[] readBuffer = new byte[4096];

		InputStream inputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

		try (ZipInputStream zipInputStream = new ZipInputStream(inputStream)) {
			while ((localFileHeader = zipInputStream.getNextEntry()) != null) {
				//File extractedFile = new File(localFileHeader.getFileName());
				//try (OutputStream outputStream = new FileOutputStream(extractedFile)) {
				while ((readLen = zipInputStream.read(readBuffer)) != -1) {
					//outputStream.write(readBuffer, 0, readLen);
				}
				//}
			}

		} catch (Exception | java.lang.AssertionError  ex) {
			//System.out.println("catched exception " + ignored1);
			//ignored1.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
		}

	}

}
