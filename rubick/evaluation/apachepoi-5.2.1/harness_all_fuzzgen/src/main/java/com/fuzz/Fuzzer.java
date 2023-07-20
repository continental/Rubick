package com.fuzz;

import java.io.File;
import java.io.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.ByteArrayInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
			// consume 14 bytes for perms
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
			byte G14INT = data.consumeByte();
			byte G15INT = data.consumeByte();

			InputStream myInputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));
			org.apache.poi.hssf.usermodel.HSSFWorkbook v1 = null;
			org.apache.poi.hssf.usermodel.HSSFRichTextString v2 = null;
			org.apache.poi.hssf.usermodel.HSSFFont v3 = null;
			org.apache.poi.hssf.usermodel.HSSFSheet v4 = null;
			org.apache.poi.hssf.usermodel.HSSFRow v5 = null;
			org.apache.poi.hssf.usermodel.HSSFCell v6 = null;

			int[] perm = null;

			// group 1
			v1 = new org.apache.poi.hssf.usermodel.HSSFWorkbook(myInputStream);

			// group 2
			perm = calcKPerm(5, G2INT);
			for (int i=0; i < 5; i++) {
				if (perm[i] == 0)
					v1.getAllEmbeddedObjects();
				else if (perm[i] == 1)
					v1.getSelectedTabs();
				else if (perm[i] == 2)
					v1.getAllPictures();
				else if (perm[i] == 3)
					v1.getNumberOfFonts();
				else if (perm[i] == 4)
					v1.dumpDrawingGroupRecords(true);
			}

			// group 3
			perm = calcKPerm(4, G3INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v2 = new org.apache.poi.hssf.usermodel.HSSFRichTextString("DUMBSTRING");
				else if (perm[i] == 1)
					v1.getNumberOfNames();
				else if (perm[i] == 2)
					v3 = v1.getFontAt(0);
				else if (perm[i] == 3)
					v1.getActiveSheetIndex();
			}

			// group 4
			perm = calcKPerm(4, G4INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v3.getBold();
				else if (perm[i] == 1)
					v2 = new org.apache.poi.hssf.usermodel.HSSFRichTextString("DUMBSTRING");
				else if (perm[i] == 2)
					v1.getBackupFlag();
				else if (perm[i] == 3)
					v1.getNumberOfSheets();
			}

			// group 5
			perm = calcKPerm(4, G5INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v3.getCharSet();
				else if (perm[i] == 1)
					v2 = new org.apache.poi.hssf.usermodel.HSSFRichTextString("DUMBSTRING");
				else if (perm[i] == 2)
					v1.getBytes();
				else if (perm[i] == 3)
					v4 = v1.getSheetAt(0);
			}

			// group 6
			perm = calcKPerm(4, G6INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v2 = new org.apache.poi.hssf.usermodel.HSSFRichTextString("DUMBSTRING");
				else if (perm[i] == 1)
					v4.getActiveCell();
				else if (perm[i] == 2)
					v1.getCreationHelper();
				else if (perm[i] == 3)
					v3.getColor();
			}

			// group 7
			perm = calcKPerm(4, G7INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v2 = new org.apache.poi.hssf.usermodel.HSSFRichTextString("DUMBSTRING");
				else if (perm[i] == 1)
					v4.getAlternateExpression();
				else if (perm[i] == 2)
					v3.getFontHeight();
				else if (perm[i] == 3)
					v1.getCustomPalette();
			}

			// group 8
			perm = calcKPerm(4, G8INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v3.getFontHeightInPoints();
				else if (perm[i] == 1)
					v1.getEncryptionInfo();
				else if (perm[i] == 2)
					v2 = new org.apache.poi.hssf.usermodel.HSSFRichTextString("DUMBSTRING");
				else if (perm[i] == 3)
					v4.getAlternateFormula();
			}

			// group 9
			perm = calcKPerm(5, G9INT);
			for (int i=0; i < 5; i++) {
				if (perm[i] == 0)
					v2 = new org.apache.poi.hssf.usermodel.HSSFRichTextString("DUMBSTRING");
				else if (perm[i] == 1)
					v3.getFontName();
				else if (perm[i] == 2)
					v1.close();
				else if (perm[i] == 3)
					v1.getEncryptionMode();
				else if (perm[i] == 4)
					v4.getAutobreaks();
			}

			// group 10
			perm = calcKPerm(4, G10INT);
			for (int i=0; i < 4; i++) {
				if (perm[i] == 0)
					v1.close();
				else if (perm[i] == 1)
					v3.getIndex();
				else if (perm[i] == 2)
					v4.getCellComments();
				else if (perm[i] == 3)
					v1.getFirstVisibleTab();
			}

			// group 11
			perm = calcKPerm(3, G11INT);
			for (int i=0; i < 3; i++) {
				if (perm[i] == 0)
					v4.getDialog();
				else if (perm[i] == 1)
					v1.getForceFormulaRecalculation();
				else if (perm[i] == 2)
					v3.getIndexAsInt();
			}

			// group 12
			perm = calcKPerm(3, G12INT);
			for (int i=0; i < 3; i++) {
				if (perm[i] == 0)
					v4.getDrawingEscherAggregate();
				else if (perm[i] == 1)
					v3.getItalic();
				else if (perm[i] == 2)
					v1.getInternalWorkbook();
			}

			// group 13
			perm = calcKPerm(3, G13INT);
			for (int i=0; i < 3; i++) {
				if (perm[i] == 0)
					v3.getStrikeout();
				else if (perm[i] == 1)
					v4.isSelected();
				else if (perm[i] == 2)
					v1.getMissingCellPolicy();
			}

			// group 14
			perm = calcKPerm(2, G14INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v3.getTypeOffset();
				else if (perm[i] == 1)
					v5 = (org.apache.poi.hssf.usermodel.HSSFRow) v4.iterator().next();
			}

			// group 15
			perm = calcKPerm(2, G15INT);
			for (int i=0; i < 2; i++) {
				if (perm[i] == 0)
					v3.getUnderline();
				else if (perm[i] == 1)
					v5.getHeight();
			}

			// group 16
			v5.getHeightInPoints();
			// group 17
			v5.getLastCellNum();
			// group 18
			v5.getOutlineLevel();
			// group 19
			v5.getPhysicalNumberOfCells();
			// group 20
			v5.getRowNum();
			// group 21
			v6 = (org.apache.poi.hssf.usermodel.HSSFCell)v5.iterator().next();
			// group 22
			v6.getCellComment();
			// group 23
			v6.getCellStyle();
			// group 24
			v6.getCellType();

		} catch (Exception | java.lang.AssertionError  ex) {
			//System.out.println("catched throwable " + ignore);
			//ignore.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
		}

	}

}
