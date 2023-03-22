package com.fuzz;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfDocument;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {

	static final long FACTORIAL[] = {
	    1,                  // 0!
	    1,                  // 1!
	    2,                  // 2!
	    6,                  // 3!
	    24,                 // 4!
	    120,                // 5!
	    720,                // 6!
	    5040,               // 7!
	    40320,              // 8!
	    362880,             // 9!
	    3628800,            // 10!
	    39916800,           // 11!
	    479001600           // 12!
	};

	public static int[] calcKPerm(int n, long k) {
		int d = 0;
		long factorial = FACTORIAL[n];
		int c = 0;
		int pool[] = new int[n];
		int perm[] = new int[n];

		for (int i = 0; i < n; i++) pool[i] = i;

		k = (k % factorial) + 1;
		factorial /= n;

		for (int i = 0; i < n - 1; factorial/=(n-1 - i++)) {
			for (d = 0; k > (d+1)*factorial; ++d);
			k -= d * factorial;

			perm[c++] = pool[d];

			for (int j=d; j<n-1; ++j) {
				pool[j] = pool[j+1];
			}
			pool[n-1] = 0;
		}

		perm[c++] = pool[0];

		return perm;
	}

	public static void fuzzerTestOneInput(FuzzedDataProvider data) {
		try {

			// consume 15 bytes for perms
			byte G3INT = data.consumeByte();
			byte G4INT = data.consumeByte();
			byte G5INT = data.consumeByte();
			byte G7INT = data.consumeByte();
			byte G8INT = data.consumeByte();
			byte G9INT = data.consumeByte();
			byte G10INT = data.consumeByte();
			byte G11INT = data.consumeByte();
			byte G12INT = data.consumeByte();
			byte G13INT = data.consumeByte();
			byte G14INT = data.consumeByte();
			byte G15INT = data.consumeByte();
			byte G16INT = data.consumeByte();
			byte G20INT = data.consumeByte();
			byte G21INT = data.consumeByte();

			int[] perm = null;

			InputStream inputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

			com.itextpdf.kernel.pdf.PdfReader v1 = null;
			com.itextpdf.kernel.pdf.PdfDocument v2 = null;
			com.itextpdf.kernel.pdf.PdfPage v3 = null;

			// group 1
			v1 = new com.itextpdf.kernel.pdf.PdfReader(inputStream);
			v2 = new com.itextpdf.kernel.pdf.PdfDocument(v1);

			// group 2
			v2.getOutlines(true);

			// group 3
			perm = calcKPerm(2, G3INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					new com.itextpdf.kernel.pdf.PdfString("DUMBSTRING");
				else if (perm[i] == 0)
					v2.getNumberOfPages();
			}

			// group 4
			perm = calcKPerm(4, G4INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v2.close();
				else if (perm[i] == 1)
					v3 = v2.getPage(0);
				else if (perm[i] == 2)
					new com.itextpdf.kernel.pdf.PdfString("DUMBSTRING");
				else if (perm[i] == 3)
					v2.getNumberOfPages();
			}

			// group 5
			perm = calcKPerm(5, G5INT);
			for (int i=0; i < 5; i++) {
				if (perm[i] == 0)
					v3.getPageSizeWithRotation();
				else if (perm[i] == 1)
					new com.itextpdf.kernel.pdf.ReaderProperties();
				else if (perm[i] == 2)
					new com.itextpdf.kernel.pdf.PdfString("DUMBSTRING");
				else if (perm[i] == 3)
					v2.getNumberOfPages();
				else if (perm[i] == 4)
					v3.getPdfObject();
			}

			// group 6
			v3 = v2.getPage(0);

			// group 7
			perm = calcKPerm(2, G7INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v2 = new com.itextpdf.kernel.pdf.PdfDocument(v1);
				else if (perm[i] == 0)
					v2.getDefaultPageSize();
			}

			// group 8
			perm = calcKPerm(3, G8INT);
			for (int i=0; i < 3; i++) {
				if (perm[i] == 0)
					v2.getDefaultPageSize();
				else if (perm[i] == 1)
					v1.computeUserPassword();
				else if (perm[i] == 2)
					v2.getNumberOfPages();
			}

			// group 9
			perm = calcKPerm(2, G9INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v1.getCryptoMode();
				else if (perm[i] == 1)
					v2.getNumberOfPages();
			}

			// group 10
			perm = calcKPerm(3, G10INT);
			for (int i=0; i < 3; i++) {
				if (perm[i] == 0)
					v3 = v2.getPage(0);
				else if (perm[i] == 1)
					v2.initializeOutlines();
				else if (perm[i] == 2)
					v1.getFileLength();
			}

			// group 11
			perm = calcKPerm(3, G11INT);
			for (int i=0; i < 3; i++) {
				if (perm[i] == 0)
					v1.hasHybridXref();
				else if (perm[i] == 0)
					v2.getOutlines(true);
				else if (perm[i] == 0)
					v2.getNumberOfPages();
			}

			// group 12
			perm = calcKPerm(2, G12INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v1.hasRebuiltXref();
				else if (perm[i] == 1)
					v3 = v2.getPage(0);
			}

			// group 13
			perm = calcKPerm(2, G13INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v1.hasXrefStm();
				else if (perm[i] == 1)
					v2.getDefaultPageSize();
			}

			// group 14
			perm = calcKPerm(2, G14INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v1.isCloseStream();
				else if (perm[i] == 1)
					v2.getDefaultPageSize();
			}

			// group 15
			perm = calcKPerm(2, G15INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v1.isEncrypted();
				else if (perm[i] == 1)
					v2.getNumberOfPages();
			}

			// group 16
			perm = calcKPerm(2, G16INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v3 = v2.getPage(0);
				else if (perm[i] == 1)
					v1.isOpenedWithFullPermission();
			}

			// group 17
			v2.getNumberOfPages();
			// group 18
			v3 = v2.getPage(0);
			// group 19
			v2.getNumberOfPages();

			// group 20
			perm = calcKPerm(3, G20INT);
			for (int i=0; i < 3; i++) {
				if (perm[i] == 0)
					v3 = v2.getPage(0);
				else if (perm[i] == 1)
					v2.getDefaultPageSize();
				else if (perm[i] == 2)
					v2.close();
			}

			// group 21
			perm = calcKPerm(2, G21INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v2.getDefaultPageSize();
				else if (perm[i] == 1)
					v2.close();
			}

			// group 22
			v2.getNumberOfPages();

		} catch (Exception | java.lang.AssertionError  ex) {
			//System.out.println("catched exception " + ignore);
			//ignore.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
		}

	}
}
