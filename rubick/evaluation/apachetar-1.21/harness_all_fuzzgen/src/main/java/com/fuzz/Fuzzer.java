package com.fuzz;

import org.apache.commons.compress.archivers.tar.TarFile;
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
		// consume 12 bytes for perms
		byte G2INT = data.consumeByte();
		byte G3INT = data.consumeByte();
		byte G4INT = data.consumeByte();
		byte G5INT = data.consumeByte();
		byte G6INT = data.consumeByte();
		byte G7INT = data.consumeByte();
		byte G8INT = data.consumeByte();
		byte G9INT = data.consumeByte();
		byte G10INT = data.consumeByte();
		byte G11INT = data.consumeByte();
		byte G12INT = data.consumeByte();
		byte G13INT = data.consumeByte();

		java.io.InputStream inputStream = new java.io.ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

		org.apache.commons.compress.archivers.tar.TarArchiveInputStream v1 = null;
		org.apache.commons.compress.archivers.tar.TarArchiveEntry v2 = null; 
		org.apache.commons.compress.archivers.ArchiveEntry v3 = null;
		byte[] v4 = new byte[4096];
		java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> v5 = null;
		org.apache.commons.compress.archivers.tar.TarArchiveStructSparse v6 = null;

		int[] perm = null;

		// group 1
		v1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream);

		// group 2
		perm = calcKPerm(3, G2INT);
		for (int i=0; i < 3; i++) {
			if (perm[i] == 0)
				v2 = v1.getNextTarEntry();
			else if (perm[i] == 1)
				v3 = v1.getNextEntry();
			else if (perm[i] == 2)
				v1.getRecordSize();
		}

		// group 3
		perm = calcKPerm(4, G3INT);
		for (int i=0; i < 4; i++) {
			if (perm[i] == 0)
				v2 = v1.getNextTarEntry();
			else if (perm[i] == 1)
				v2.getName();
			else if (perm[i] == 2)
				v1.close();
			else if (perm[i] == 3)
				v1.canReadEntryData(v3);
		}

		// group 4
		perm = calcKPerm(4, G4INT);
		for (int i=0; i < 4; i++) {
			if (perm[i] == 0)
				v2.isDirectory();
			else if (perm[i] == 1)
				v2.getName();
			else if (perm[i] == 2)
				v5 = v2.getOrderedSparseHeaders();
			else if (perm[i] == 3)
				v6 = v5.get(0);
		}

		// group 5
		perm = calcKPerm(6, G5INT);
		for (int i=0; i < 6; i++) {
			if (perm[i] == 0)
				v2.isLink();
			else if (perm[i] == 1)
				v2.isDirectory();
			else if (perm[i] == 2)
				v2.getMode();
			else if (perm[i] == 3)
				v2.getName();
			else if (perm[i] == 4)
				v1.read(v4, 0, 4096);
			else if (perm[i] == 5)
				v6.getNumbytes();
		}

		// group 6
		perm = calcKPerm(5, G6INT);
		for (int i=0; i < 5; i++) {
			if (perm[i] == 0)
				v3 = v1.getNextEntry();
			else if (perm[i] == 1)
				v2.getMode();
			else if (perm[i] == 2)
				v2.getLinkName();
			else if (perm[i] == 3)
				v2.isSymbolicLink();
			else if (perm[i] == 4)
				v2.isPaxGNU1XSparse();
		}

		// group 7
		perm = calcKPerm(4, G7INT);
		for (int i=0; i < 4; i++) {
			if (perm[i] == 0)
				v2.isDirectory();
			else if (perm[i] == 1)
				v2.getName();
			else if (perm[i] == 2)
				v2.getLinkName();
			else if (perm[i] == 3)
				v2.isStreamContiguous();
		}

		// group 8
		perm = calcKPerm(4, G8INT);
		for (int i=0; i < 4; i++) {
			if (perm[i] == 0)
				v2.getSize();
			else if (perm[i] == 1)
				v2.getLinkName();
			else if (perm[i] == 2)
				v2.isSymbolicLink();
			else if (perm[i] == 3)
				v2.getLastModifiedDate();
		}

		// group 9
		perm = calcKPerm(4, G9INT);
		for (int i=0; i < 4; i++) {
			if (perm[i] == 0)
				v2.getMode();
			else if (perm[i] == 1)
				v2.getLinkName();
			else if (perm[i] == 2)
				v2 = v1.getNextTarEntry();
			else if (perm[i] == 3)
				v1.read(v4, 0, 4096);
		}

		// group 10
		perm = calcKPerm(3, G10INT);
		for (int i=0; i < 3; i++) {
			if (perm[i] == 0)
				v2.getMode();
			else if (perm[i] == 1)
				v2.isSymbolicLink();
			else if (perm[i] == 2)
				v2.getDataOffset();
		}

		// group 11
		perm = calcKPerm(3, G11INT);
		for (int i=0; i < 3; i++) {
			if (perm[i] == 0)
				v2.isDirectory();
			else if (perm[i] == 1)
				v2.getMode();
			else if (perm[i] == 2)
				v2.getDirectoryEntries();
		}

		// group 12
		perm = calcKPerm(2, G12INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v2.getExtraPaxHeaders();
			else if (perm[i] == 1)
				v2.getMode();
		}

		// group 13
		perm = calcKPerm(2, G13INT);
		for (int i=0; i < 2; i++) {
			if (perm[i] == 0)
				v2.getModTime();
			else if (perm[i] == 1)
				v2 = v1.getNextTarEntry();
		}

		// group 14
		v2.getName();

        } catch (Exception | java.lang.AssertionError  ex) {
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
        }
    }
}
