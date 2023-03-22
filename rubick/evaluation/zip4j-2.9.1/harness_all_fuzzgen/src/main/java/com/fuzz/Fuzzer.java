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
        LocalFileHeader localFileHeader = null;
        int readLen = 0;
        byte[] readBuffer = new byte[4096];

        try {
            // consume 6 bytes for perms
            byte G3INT = data.consumeByte();
            byte G4INT = data.consumeByte();
            byte G5INT = data.consumeByte();
            byte G6INT = data.consumeByte();
            byte G7INT = data.consumeByte();
            byte G8INT = data.consumeByte();
            int[] perm = null;

            InputStream inputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

            net.lingala.zip4j.io.inputstream.ZipInputStream v1 = null;
            net.lingala.zip4j.model.LocalFileHeader v2 = null;
            net.lingala.zip4j.model.Zip64ExtendedInfo v3 = null;
            net.lingala.zip4j.model.AESExtraDataRecord v4 = null;
            net.lingala.zip4j.model.enums.CompressionMethod v5 = null;
            java.util.List<net.lingala.zip4j.model.ExtraDataRecord> v6 = null;
            net.lingala.zip4j.model.ExtraDataRecord v7 = null;

            // group 1
            v1 = new net.lingala.zip4j.io.inputstream.ZipInputStream(inputStream);

            // group 2
            v2 = v1.getNextEntry();

            // group 3
            perm = calcKPerm(5, G3INT);
            for (int i=0; i < 5; i++) {
                if (perm[i] == 0)
                    v1.read(readBuffer);
                else if (perm[i] == 1)
                    v1.close();
                else if (perm[i] == 2)
                    v3 = v2.getZip64ExtendedInfo();
                else if (perm[i] == 3)
                    v4 = v2.getAesExtraDataRecord();
                else if (perm[i] == 4)
                    v5 = v2.getCompressionMethod();
            }

            // group 4
            perm = calcKPerm(4, G4INT);
            for (int i=0; i < 4; i++) {
                if (perm[i] == 0)
                    v3.getCompressedSize();
                else if (perm[i] == 1)
                    v4.getAesKeyStrength();
                else if (perm[i] == 2)
                    v5.getCode();
                else if (perm[i] == 3)
                    v1.close();
            }

            // group 5
            perm = calcKPerm(4, G5INT);
            for (int i=0; i < 4; i++) {
                if (perm[i] == 0)
                    v1.close();
                else if (perm[i] == 1)
                    v4.getAesVersion();
                else if (perm[i] == 2)
                    v3.getDiskNumberStart();
                else if (perm[i] == 3)
                    v2.getEncryptionMethod();
            }

            // group 6
            perm = calcKPerm(4, G6INT);
            for (int i=0; i < 4; i++) {
                if (perm[i] == 0)
                    v3.getOffsetLocalHeader();
                else if (perm[i] == 1)
                    v4.getCompressionMethod();
                else if (perm[i] == 2)
                    v6 = v2.getExtraDataRecords();
                else if (perm[i] == 3)
                    v7 = v6.get(0);
            }

            // group 7
            perm = calcKPerm(3, G7INT);
            for (int i=0; i < 3; i++) {
                if (perm[i] == 0)
                    v3.getSize();
                else if (perm[i] == 1)
                    v7.getData();
                else if (perm[i] == 2)
                    v4.getDataSize();
            }

            // group 8
            perm = calcKPerm(3, G8INT);
            for (int i=0; i < 3; i++) {
                if (perm[i] == 0)
                    v7.getHeader();
                else if (perm[i] == 1)
                    v3.getUncompressedSize();
                else if (perm[i] == 2)
                    v4.getVendorID();
            }

            // group 9
            v7.getSizeOfData();

        } catch (Exception | java.lang.AssertionError  ex) {
            //System.out.println("catched exception " + ignored1);
            //ignored1.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
        }

    }

}
