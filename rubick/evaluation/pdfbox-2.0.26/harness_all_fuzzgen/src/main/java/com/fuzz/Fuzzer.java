package com.fuzz;

import org.apache.pdfbox.pdmodel.PDDocument;
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

            // consume 20 bytes for perms
            byte G2INT = data.consumeByte();
            byte G3INT = data.consumeByte();
            byte G4INT = data.consumeByte();
            short G5INT = data.consumeShort();
            byte G6INT = data.consumeByte();
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
            byte G17INT = data.consumeByte();
            byte G18INT = data.consumeByte();
            byte G19INT = data.consumeByte();
            byte G20INT = data.consumeByte();

		    int[] perm = null;

            org.apache.pdfbox.pdmodel.PDDocument v1 = null; 
            org.apache.pdfbox.pdmodel.encryption.PDEncryption v2 = null;
            org.apache.pdfbox.pdmodel.PDDocumentCatalog v3 = null;
            org.apache.pdfbox.pdmodel.PDDocumentInformation v4 = null;
            org.apache.pdfbox.pdmodel.PDPage v5 = null;
            org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm v6 = null;
            org.apache.pdfbox.pdmodel.common.PDRectangle v7 = null;
            org.apache.pdfbox.pdmodel.PDResources v8 = null;
            org.apache.pdfbox.cos.COSDictionary v9 = null;
            java.util.List<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> v10 = null;
            org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation v11 = null;

            // group 1
            v1 = org.apache.pdfbox.pdmodel.PDDocument.load(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));

            // group 2
            perm = calcKPerm(5, G2INT);
            for (int i=0; i < 5; i++) {
                if (perm[i] == 0)
                    v1.isEncrypted();
                else if (perm[i] == 1)
                    v2 = v1.getEncryption();
                else if (perm[i] == 2)
                    v1.getPages();
                else if (perm[i] == 3)
                    v4 = v1.getDocumentInformation();
                else if (perm[i] == 4)
                    v1.getNumberOfPages();
            }

            // group 3
            perm = calcKPerm(3, G3INT);
            for (int i=0; i < 3; i++) {
                if (perm[i] == 0)
                    v4.getAuthor();
                else if (perm[i] == 1)
                    v2.getFilter();
                else if (perm[i] == 2)
                    v1.getNumberOfPages();
            }

            // group 4
            perm = calcKPerm(5, G4INT);
            for (int i=0; i < 5; i++) {
                if (perm[i] == 0)
                    v8 = v5.getResources();
                else if (perm[i] == 1)
                    v9 = v2.getCOSObject();
                else if (perm[i] == 2)
                    v5 = v1.getPage(0);
                else if (perm[i] == 3)
                    v4.getCreationDate();
                else if (perm[i] == 4)
                    v1.close();
            }

            // group 5
            perm = calcKPerm(7, G5INT);
            for (int i=0; i < 7; i++) {
                if (perm[i] == 0) {
                    //v8.getImages();
                } else if (perm[i] == 1)
                    v10 = v5.getAnnotations();
                else if (perm[i] == 2)
                    v11 = v10.get(0);
                else if (perm[i] == 3)
                    v5.getContents();
                else if (perm[i] == 4)
                    v4.getCreator();
                else if (perm[i] == 5)
                    v5.getRotation();
                else if (perm[i] == 6)
                    v2.isEncryptMetaData();
            }

            // group 6
            perm = calcKPerm(6, G6INT);
            for (int i=0; i < 6; i++) {
                if (perm[i] == 0)
                    v4.getKeywords();
                else if (perm[i] == 1)
                    v7 = v5.getCropBox();
                else if (perm[i] == 2)
                    v10 = v5.getAnnotations();
                else if (perm[i] == 3)
                    v11 = v10.get(0);
                else if (perm[i] == 4)
                    new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp();
                else if (perm[i] == 5)
                    v2.hasSecurityHandler();
            }

            // group 7
            perm = calcKPerm(5, G7INT);
            for (int i=0; i < 5; i++) {
                if (perm[i] == 0)
                    v7.getLowerLeftX();
                else if (perm[i] == 1)
                    v7 = new org.apache.pdfbox.pdmodel.common.PDRectangle((float)0.0,(float)0.0);
                else if (perm[i] == 2)
                    v4.getModificationDate();
                else if (perm[i] == 3)
                    v11.getAnnotationFlags();
                else if (perm[i] == 4)
                    v2.getStreamFilterName();
            }

            // group 8
            perm = calcKPerm(5, G8INT);
            for (int i=0; i < 5; i++) {
                if (perm[i] == 0)
                    v4.getProducer();
                else if (perm[i] == 1)
                    v11.getAnnotationName();
                else if (perm[i] == 2)
                    v7 = new org.apache.pdfbox.pdmodel.common.PDRectangle();
                else if (perm[i] == 3)
                    v2.getDefaultCryptFilterDictionary();
                else if (perm[i] == 4)
                    v7.getLowerLeftY();
            }

            // group 9
            perm = calcKPerm(5, G9INT);
            for (int i=0; i < 5; i++) {
                if (perm[i] == 0)
                    v7.getLowerLeftX();
                else if (perm[i] == 1)
                    v8 = new org.apache.pdfbox.pdmodel.PDResources();
                else if (perm[i] == 2)
                    v11.getBorder();
                else if (perm[i] == 3)
                    v1.close();
                else if (perm[i] == 4)
                    v4.getSubject();
            }

            // group 10
            perm = calcKPerm(3, G10INT);
            for (int i=0; i < 3; i++) {
                if (perm[i] == 0)
                    v4.getTitle();
                else if (perm[i] == 1)
                    v7.getLowerLeftY();
                else if (perm[i] == 2)
                    v11.getColor();
            }

            // group 11
            perm = calcKPerm(4, G11INT);
            for (int i=0; i < 4; i++) {
                if (perm[i] == 0)
                    new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(v9);
                else if (perm[i] == 1)
                    v11.getContents();
                else if (perm[i] == 2)
                    v4.getTrapped();
                else if (perm[i] == 3)
                    v7 = v5.getCropBox();
            }

            // group 12
            perm = calcKPerm(2, G12INT);
            for (int i=0; i < 2; i++) {
                if (perm[i] == 0)
                    v11.getModifiedDate();
                else if (perm[i] == 1)
                    v7 = v5.getBBox();
            }

            // group 13
            perm = calcKPerm(2, G13INT);
            for (int i=0; i < 2; i++) {
                if (perm[i] == 0)
                    v7.getHeight();
                else if (perm[i] == 1)
                    v7 = v11.getRectangle();
            }

            // group 14
            perm = calcKPerm(2, G14INT);
            for (int i=0; i < 2; i++) {
                if (perm[i] == 0)
                    v5.getRotation();
                else if (perm[i] == 1)
                    v11.isNoRotate();
            }

            // group 15
            perm = calcKPerm(2, G15INT);
            for (int i=0; i < 2; i++) {
                if (perm[i] == 0)
                    v7 = v5.getMediaBox();
                else if (perm[i] == 1)
                    v11.isHidden();
            }

            // group 16
            perm = calcKPerm(3, G16INT);
            for (int i=0; i < 3; i++) {
                if (perm[i] == 0)
                    v7.getHeight();
                else if (perm[i] == 1)
                    v7.getWidth();
                else if (perm[i] == 2)
                    v11.isLocked();
            }

            // group 17
            perm = calcKPerm(4, G17INT);
            for (int i=0; i < 4; i++) {
                if (perm[i] == 0)
                    v7.getHeight();
                else if (perm[i] == 1)
                    v5 = v1.getPage(0);
                else if (perm[i] == 2)
                    v1.close();
                else if (perm[i] == 3)
                    v11.isNoZoom();
            }

            // group 18
            perm = calcKPerm(2, G18INT);
            for (int i=0; i < 2; i++) {
                if (perm[i] == 0)
                    v7.getLowerLeftX();
                else if (perm[i] == 1)
                    v11.isPrinted();
            }

            // group 19
            perm = calcKPerm(2, G19INT);
            for (int i=0; i < 2; i++) {
                if (perm[i] == 0)
                    v8 = v5.getResources();
                else if (perm[i] == 1)
                    v7.getLowerLeftY();
            }

            // group 20
            perm = calcKPerm(2, G20INT);
            for (int i=0; i < 2; i++) {
                if (perm[i] == 0)
                    v5 = v1.getPage(0);
                else if (perm[i] == 1)
                    v8.getColorSpaceNames();
            }

            // group 21
            v8.getXObjectNames();
            // group 22
            v1.close();

        } catch (Exception | java.lang.AssertionError  ex) {
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);

        }

    }

}
