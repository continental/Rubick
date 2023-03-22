package com.fuzz;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;

import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;
import com.github.junrar.exception.RarException;;

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

		// consume 9 bytes for perms
		byte G2INT = data.consumeByte();
		byte G6INT = data.consumeByte();
		byte G7INT = data.consumeByte();
		byte G8INT = data.consumeByte();
		byte G9INT = data.consumeByte();
		byte G10INT = data.consumeByte();
		byte G11INT = data.consumeByte();
		byte G12INT = data.consumeByte();
		byte G13INT = data.consumeByte();

		int[] perm = null;
        	InputStream inputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

		com.github.junrar.Archive v1 = null;
		com.github.junrar.rarfile.FileHeader v2 = null;
		java.util.List<com.github.junrar.rarfile.FileHeader> v3 = null;
		java.io.InputStream v4 = null;

		// group 1
		v1 = new com.github.junrar.Archive(inputStream);

		// group 2
		perm = calcKPerm(2, G2INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v2 = v1.nextFileHeader();
			else if (perm[i] == 1)
				v3 = v1.getFileHeaders();
		}

		// group 3
		v2.isDirectory();

		// group 4
		v2.getFileNameW();

		// group 5
		v2.getFileNameString();

		// group 6
		perm = calcKPerm(2, G6INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v1.extractFile(v2, java.io.OutputStream.nullOutputStream());
			else if (perm[i] == 1)
				v4 = v1.getInputStream(v2);
		}

		// group 7
		perm = calcKPerm(2, G7INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v2.isDirectory();
			else if (perm[i] == 1)
				v1.close();
		}

		// group 8
		perm = calcKPerm(2, G8INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v1.nextFileHeader();
			else if (perm[i] == 1)
				v1.extractFile(v2, java.io.OutputStream.nullOutputStream());
		}

		// group 9
		perm = calcKPerm(3, G9INT);
		for (int i=0; i < 3; i++) {
			if (perm[i] == 0)
				v1.nextFileHeader();
			else if (perm[i] == 1)
				v2.getFileNameString();
			else if (perm[i] == 2)
				v2.getArcTime();
		}

		// group 10
		perm = calcKPerm(5, G10INT);
		for (int i=0; i < 5; i++) {
			if (perm[i] == 0)
				v1.nextFileHeader();
			else if (perm[i] == 1)
				v2.isDirectory();
			else if (perm[i] == 2)
				v2.getATime();
			else if (perm[i] == 3)
				v2.getFileNameString();
			else if (perm[i] == 4)
				v1.close();
		}

		// group 11
		perm = calcKPerm(3, G11INT);
		for (int i=0; i < 3; i++) {
			if (perm[i] == 0)
				v2.getCTime();
			else if (perm[i] == 1)
				v1.extractFile(v2, java.io.OutputStream.nullOutputStream());
			else if (perm[i] == 2)
				v1.close();
		}

		// group 12
		perm = calcKPerm(2, G12INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v1.nextFileHeader();
			else if (perm[i] == 1)
				v2.print();
		}

		// group 13
		perm = calcKPerm(2, G13INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v2.getDataSize();
			else if (perm[i] == 1)
				v1.close();
		}

		// group 14
		v2.getPackSize();

		// group 15
		v2.getHeaderType();

		// group 16
		v2.hasEncryptVersion();

		// group 17
		v2.isSubBlock();

		// group 18
		v1.extractFile(v2, java.io.OutputStream.nullOutputStream());

        } catch (Exception | java.lang.AssertionError  ex) {
            //System.out.println("catched throwable " + ignore);
            //ignore.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
        }
    }
}
