package com.fuzz;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfAConformanceLevel;
import com.itextpdf.pdfa.PdfADocument;
import com.itextpdf.kernel.pdf.PdfObject;
import com.itextpdf.kernel.pdf.PdfCatalog;
import com.itextpdf.kernel.pdf.PdfPage;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {
	public static void fuzzerTestOneInput(FuzzedDataProvider data) {

		try {
			InputStream inputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

			PdfReader reader = null;
			PdfDocument sourcePdf = null;
			int numofpages = 0;
			PdfPage pg = null;
			boolean tagged = false;

			reader = new PdfReader(inputStream);

			if (reader != null) {

			    sourcePdf = new PdfDocument(reader);

				if (sourcePdf != null) {

					tagged = sourcePdf.isTagged();

					numofpages = sourcePdf.getNumberOfPages();
					//System.out.println("numofpages " + numofpages);
					for (int i = 1; i <= numofpages; i++) {
						pg = sourcePdf.getPage(i);
						if (pg != null) {
							pg.getContentBytes();

							if (tagged) {
								pg.getNextMcid();
							}

						}
					}

					if (tagged) {
						sourcePdf.getTagStructureContext();
					}

					sourcePdf.close();
				}

			}

		} catch (Exception | java.lang.AssertionError  ex) {
			//System.out.println("catched exception " + ignore);
			//ignore.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
		}
	}
}

