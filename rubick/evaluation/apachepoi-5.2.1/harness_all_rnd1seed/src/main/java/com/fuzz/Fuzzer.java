package com.fuzz;

import java.util.List;
import java.util.HashMap;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

import ahg.harness.Template;
import ahg.harness.cfg.nfa.iNFA;
import ahg.harness.cfg.api.iAPIFunc;
import ahg.harness.cfg.alphabet.iAlphabet;

import ahg.harness.Result;

import ahg.harness.exception.SoftException;
import ahg.harness.exception.HarnessException;
import ahg.harness.exception.NoCondTriggerredException;

import net.automatalib.automata.fsa.impl.compact.CompactNFA;

public class Fuzzer extends Template {

	@Override
	protected void resetVars() {

		vars = new HashMap<String, Object>();

		vars.put("input-input", input);
		vars.put("constant-true", true);


	}

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	@Override
	protected void runNextCall(Character nextCall) throws HarnessException {
		try {

			if (nextCall.equals('䢁')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean isSelected()> ");
				curEvent = '䢁';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSelected();
				curEvent = null;

			} else if (nextCall.equals('䖃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.record.EscherAggregate getDrawingEscherAggregate()> ");
				curEvent = '䖃';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDrawingEscherAggregate();
				curEvent = null;

			} else if (nextCall.equals('䐊')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: float getHeightInPoints()> ");
				curEvent = '䐊';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeightInPoints();
				curEvent = null;

			} else if (nextCall.equals('䮋')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getBottomBorderColor()> ");
				curEvent = '䮋';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBottomBorderColor();
				curEvent = null;

			} else if (nextCall.equals('㸌')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR_<org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㸌';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸍')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFClientAnchor: void <init>()> ");
				curEvent = '㸍';
				org.apache.poi.hssf.usermodel.HSSFClientAnchor ret;
				ret = new org.apache.poi.hssf.usermodel.HSSFClientAnchor();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶍')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: int getCharSet()> ");
				curEvent = '㶍';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCharSet();
				curEvent = null;

			} else if (nextCall.equals('䨏')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int getRowNum()> ");
				curEvent = '䨏';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRowNum();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠐')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderLeft()> ");
				curEvent = '䠐';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderLeft();
				curEvent = null;

			} else if (nextCall.equals('䰒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: short getLastCellNum()> ");
				curEvent = '䰒';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLastCellNum();
				curEvent = null;

			} else if (nextCall.equals('㚒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumCellStyles()> ");
				curEvent = '㚒';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumCellStyles();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㖒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFCreationHelper getCreationHelper()> ");
				curEvent = '㖒';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCreationHelper();
				curEvent = null;

			} else if (nextCall.equals('㜓')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllPictures()> ");
				curEvent = '㜓';
				java.util.List ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAllPictures();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢔')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFSheet getSheetAt(int)> ");
				curEvent = '䢔';
				org.apache.poi.hssf.usermodel.HSSFSheet ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSheetAt(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚕')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: int getIndexAsInt()> ");
				curEvent = '䚕';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getIndexAsInt();
				curEvent = null;

			} else if (nextCall.equals('䪙')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfFonts()> ");
				curEvent = '䪙';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfFonts();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸚')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.HorizontalAlignment getAlignment()> ");
				curEvent = '㸚';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAlignment();
				curEvent = null;

			} else if (nextCall.equals('㢛')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getColor()> ");
				curEvent = '㢛';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getColor();
				curEvent = null;

			} else if (nextCall.equals('䴜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.poifs.crypt.EncryptionMode getEncryptionMode()> ");
				curEvent = '䴜';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getEncryptionMode();
				curEvent = null;

			} else if (nextCall.equals('㰞')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Map getCellComments()> ");
				curEvent = '㰞';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCellComments();
				curEvent = null;

			} else if (nextCall.equals('㜟')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void close()> ");
				curEvent = '㜟';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䶡')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderRight()> ");
				curEvent = '䶡';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderRight();
				curEvent = null;

			} else if (nextCall.equals('䪢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getFontHeight()> ");
				curEvent = '䪢';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFontHeight();
				curEvent = null;

			} else if (nextCall.equals('䞣')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllEmbeddedObjects()> ");
				curEvent = '䞣';
				java.util.List ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAllEmbeddedObjects();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䀤')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: boolean getBold()> ");
				curEvent = '䀤';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBold();
				curEvent = null;

			} else if (nextCall.equals('䎧')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getFontHeightInPoints()> ");
				curEvent = '䎧';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFontHeightInPoints();
				curEvent = null;

			} else if (nextCall.equals('㲨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()> ");
				curEvent = '㲨';
				java.util.Iterator ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()> ");
				curEvent = '㲮';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getAlternateFormula()> ");
				curEvent = '䌮';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAlternateFormula();
				curEvent = null;

			} else if (nextCall.equals('䈰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: boolean getItalic()> ");
				curEvent = '䈰';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getItalic();
				curEvent = null;

			} else if (nextCall.equals('䪰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䪰';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFCellStyle getCellStyleAt(int)> ");
				curEvent = '䤱';
				org.apache.poi.hssf.usermodel.HSSFCellStyle ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCellStyleAt(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢲')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getDataFormat()> ");
				curEvent = '㢲';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataFormat();
				curEvent = null;

			} else if (nextCall.equals('㪶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> ");
				curEvent = '㪶';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfSheets();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤷')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.hssf.usermodel.HSSFCellStyle getCellStyle()> ");
				curEvent = '㤷';
				org.apache.poi.hssf.usermodel.HSSFCellStyle ret;
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCellStyle();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㦷')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.ss.usermodel.CellType getCellType()> ");
				curEvent = '㦷';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCellType();
				curEvent = null;

			} else if (nextCall.equals('䈸')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '䈸';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘹')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()> ");
				curEvent = '䘹';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰹')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int getPhysicalNumberOfCells()> ");
				curEvent = '䰹';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPhysicalNumberOfCells();
				curEvent = null;

			} else if (nextCall.equals('䪻')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getAutobreaks()> ");
				curEvent = '䪻';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAutobreaks();
				curEvent = null;

			} else if (nextCall.equals('䲼')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '䲼';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲾')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()> ");
				curEvent = '䲾';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭁')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: java.lang.String getDataFormatString()> ");
				curEvent = '㭁';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataFormatString();
				curEvent = null;

			} else if (nextCall.equals('㹃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFPalette getCustomPalette()> ");
				curEvent = '㹃';
				org.apache.poi.hssf.usermodel.HSSFPalette ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCustomPalette();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䇅')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.ss.util.CellAddress getActiveCell()> ");
				curEvent = '䇅';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getActiveCell();
				curEvent = null;

			} else if (nextCall.equals('㳆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfNames()> ");
				curEvent = '㳆';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNumberOfNames();
				curEvent = null;

			} else if (nextCall.equals('䛆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void <init>(java.io.InputStream)> ");
				curEvent = '䛆';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.poi.hssf.usermodel.HSSFWorkbook(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧕')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getDialog()> ");
				curEvent = '㧕';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDialog();
				curEvent = null;

			} else if (nextCall.equals('䏕')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int getOutlineLevel()> ");
				curEvent = '䏕';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOutlineLevel();
				curEvent = null;

			} else if (nextCall.equals('䫙')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()> ");
				curEvent = '䫙';
				java.util.Iterator ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳚')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: byte getUnderline()> ");
				curEvent = '䳚';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUnderline();
				curEvent = null;

			} else if (nextCall.equals('䵛')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.hssf.usermodel.HSSFComment getCellComment()> ");
				curEvent = '䵛';
				org.apache.poi.hssf.usermodel.HSSFComment ret;
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCellComment();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯞')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '㯞';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱡')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllNames()> ");
				curEvent = '㱡';
				java.util.List ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAllNames();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭡')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getActiveSheetIndex()> ");
				curEvent = '㭡';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getActiveSheetIndex();
				curEvent = null;

			} else if (nextCall.equals('䩣')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: short getHeight()> ");
				curEvent = '䩣';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeight();
				curEvent = null;

			} else if (nextCall.equals('㳣')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean getBackupFlag()> ");
				curEvent = '㳣';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBackupFlag();
				curEvent = null;

			} else if (nextCall.equals('㱧')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getTypeOffset()> ");
				curEvent = '㱧';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTypeOffset();
				curEvent = null;

			} else if (nextCall.equals('䕧')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getAlternateExpression()> ");
				curEvent = '䕧';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAlternateExpression();
				curEvent = null;

			} else if (nextCall.equals('䙨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '䙨';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.poifs.crypt.EncryptionInfo getEncryptionInfo()> ");
				curEvent = '䫨';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getEncryptionInfo();
				curEvent = null;

			} else if (nextCall.equals('㑩')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderTop()> ");
				curEvent = '㑩';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderTop();
				curEvent = null;

			} else if (nextCall.equals('㝩')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㝩';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䛰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.model.InternalWorkbook getInternalWorkbook()> ");
				curEvent = '䛰';
				org.apache.poi.hssf.model.InternalWorkbook ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getInternalWorkbook();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: byte[] getBytes()> ");
				curEvent = '䟰';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBytes();
				curEvent = null;

			} else if (nextCall.equals('䛲')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.Collection getSelectedTabs()> ");
				curEvent = '䛲';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSelectedTabs();
				curEvent = null;

			} else if (nextCall.equals('㫳')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderBottom()> ");
				curEvent = '㫳';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderBottom();
				curEvent = null;

			} else if (nextCall.equals('㟵')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getFirstVisibleTab()> ");
				curEvent = '㟵';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFirstVisibleTab();
				curEvent = null;

			} else if (nextCall.equals('v')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void dumpDrawingGroupRecords(boolean)> ");
				curEvent = 'v';
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.dumpDrawingGroupRecords(arg0);
				curEvent = null;

			} else if (nextCall.equals('x')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: int getIndex()> ");
				curEvent = 'x';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getIndex();
				curEvent = null;

			} else if (nextCall.equals('䇸')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFFont getFontAt(int)> ");
				curEvent = '䇸';
				org.apache.poi.hssf.usermodel.HSSFFont ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFontAt(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㿺')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㿺';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫼')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()> ");
				curEvent = '䫼';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳼')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: boolean getStrikeout()> ");
				curEvent = '䳼';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStrikeout();
				curEvent = null;

			} else if (nextCall.equals('㡽')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.ss.usermodel.Row$MissingCellPolicy getMissingCellPolicy()> ");
				curEvent = '㡽';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMissingCellPolicy();
				curEvent = null;

			} else if (nextCall.equals('䯾')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: java.lang.String getFontName()> ");
				curEvent = '䯾';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFontName();
				curEvent = null;

			} else if (nextCall.equals('䓿')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean getForceFormulaRecalculation()> ");
				curEvent = '䓿';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getForceFormulaRecalculation();
				curEvent = null;

			} else {
				if (1 == 0) throw new IOException("This makes compiler happy");

				throw new RuntimeException("this should not happen, an unknown func letter '" + nextCall + "'");
			}


		} catch (Exception | java.lang.AssertionError  ex) {
			/* catch all kinds of exceptions (some APIs throw exceptions, we need to make the compiler happy) */
			/* System.out.println("catched IOException: " + ex); */
			//ex.printStackTrace();
			//throw new RuntimeException("Exception | java.lang.AssertionError : " + ex);
            com.fuzz.ExpCollector.addNewCrash(ex);
                  throw new ahg.harness.exception.UnknownException("Handled a caught exception");
		}

	}

	@SuppressWarnings("IdentityBinaryExpression")
	@Override
	protected Character checkCondTriggers(List<Character> conds) throws HarnessException {
		Character happenedEvent = null;

		for (Character cond : conds) {

			boolean satisfies = false;

			if (cond.equals('䦓')) {
				curEvent = '䦓';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()> */
				int v_22_ = (int) getVarValue(getOutVar('㲮', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfFonts()> */
				int v_10_ = (int) getVarValue(getOutVar('䪙', "ret"));
				satisfies = (v_10_ <= v_22_);
				curEvent = null;

			} else if (cond.equals('䒔')) {
				curEvent = '䒔';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()> */
				int v_140_ = (int) getVarValue(getOutVar('䘹', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_158_ = (int) getVarValue(getOutVar('㪶', "ret"));
				satisfies = (v_158_ <= v_140_);
				curEvent = null;

			} else if (cond.equals('㺱')) {
				curEvent = '㺱';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_176_ = (boolean) getVarValue(getOutVar('䲼', "ret"));
				satisfies = (Not(v_176_ == false));
				curEvent = null;

			} else if (cond.equals('㸳')) {
				curEvent = '㸳';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()> */
				int v_22_ = (int) getVarValue(getOutVar('㲮', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfFonts()> */
				int v_10_ = (int) getVarValue(getOutVar('䪙', "ret"));
				satisfies = (Not(v_10_ <= v_22_));
				curEvent = null;

			} else if (cond.equals('䪵')) {
				curEvent = '䪵';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumCellStyles()> */
				int v_237_ = (int) getVarValue(getOutVar('㚒', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()> */
				int v_207_ = (int) getVarValue(getOutVar('䲾', "ret"));
				satisfies = (Not(v_237_ <= v_207_));
				curEvent = null;

			} else if (cond.equals('䚸')) {
				curEvent = '䚸';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()> */
				int v_140_ = (int) getVarValue(getOutVar('䘹', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_158_ = (int) getVarValue(getOutVar('㪶', "ret"));
				satisfies = (Not(v_158_ <= v_140_));
				curEvent = null;

			} else if (cond.equals('䬾')) {
				curEvent = '䬾';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_109_ = (boolean) getVarValue(getOutVar('㯞', "ret"));
				satisfies = (v_109_ == false);
				curEvent = null;

			} else if (cond.equals('㫃')) {
				curEvent = '㫃';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()> */
				int v_88_ = (int) getVarValue(getOutVar('䫼', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_158_ = (int) getVarValue(getOutVar('㪶', "ret"));
				satisfies = (Not(v_158_ <= v_88_));
				curEvent = null;

			} else if (cond.equals('䃤')) {
				curEvent = '䃤';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_176_ = (boolean) getVarValue(getOutVar('䲼', "ret"));
				satisfies = (v_176_ == false);
				curEvent = null;

			} else if (cond.equals('䣤')) {
				curEvent = '䣤';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()> */
				int v_88_ = (int) getVarValue(getOutVar('䫼', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_158_ = (int) getVarValue(getOutVar('㪶', "ret"));
				satisfies = (v_158_ <= v_88_);
				curEvent = null;

			} else if (cond.equals('㡳')) {
				curEvent = '㡳';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_109_ = (boolean) getVarValue(getOutVar('㯞', "ret"));
				satisfies = (Not(v_109_ == false));
				curEvent = null;

			} else if (cond.equals('㩹')) {
				curEvent = '㩹';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumCellStyles()> */
				int v_237_ = (int) getVarValue(getOutVar('㚒', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()> */
				int v_207_ = (int) getVarValue(getOutVar('䲾', "ret"));
				satisfies = (v_237_ <= v_207_);
				curEvent = null;

			} else {
				/* this 1 == 1 branch makes compiler happy */

				if (1 == 1) throw new RuntimeException("this should not happen, an unknown cond letter '" + cond + "'");
			}


			if (satisfies) {
				happenedEvent = cond;
				if (debug)
					System.out.println("cond event '" + happenedEvent + "' happened");
					
				break;
			}
		}

		if (happenedEvent == null) {
			StringBuilder sb = new StringBuilder();
			for (Character cond : conds)
				sb.append(cond);

			/* NOTE: just pick the first conds as the eventseq */
			throw new NoCondTriggerredException(
					"this should not happen, no any constraint \"" + sb.toString() + "\" is satisfied", pastEventsStr + Character.toString(conds.get(0)));
		}

		return happenedEvent;
	}

	public void initialize(String alphabetFile, String nfaFile, String apiFile, String cfPickJsonFile) {
		iAlphabet _al = iAlphabet.createFromFile(alphabetFile);
		HashMap<Integer, String> _sIDMap = new HashMap<Integer, String>();
		CompactNFA<Character> _nfa = iNFA.loadOneNFAFromFile(_al.getAlphabet(), nfaFile, _sIDMap);
		HashMap<Character, iAPIFunc> _apiFuncs = iAPIFunc.loadAPIFuncsFromFile(apiFile);

		oneTimeInit(_al, _nfa, _apiFuncs, cfPickJsonFile, _sIDMap);
	}

	public static Result inMemoryRunAString(iAlphabet alphabet, CompactNFA<Character> nfa, HashMap<Character, iAPIFunc> apiFuncs, HashMap<Integer, String> sIDMap, String[] tarFiles) {

		// Fuzzer.debug = false;
		Fuzzer.debug = true;

		Fuzzer har = new Fuzzer();
		har.oneTimeInit(alphabet, nfa, apiFuncs, null, sIDMap);

		if (har.cfChoiceNum != 1)
		 	throw new RuntimeException("cfChoiceNum of the string is not 1");
			 
		long cfNO = 0;

		String errorString = har.resetAllPicks(cfNO, 0);
		if (errorString != null) {
			System.out.println("Run stopped since \"" + errorString + "\" failed caused by unsatisfied data dep");
			return new Result(errorString, true, true);
		}

		String eventSeq = null;
		boolean failed = true;
		boolean partial = true;

		/* try to fully test the tgarget by combining all data flow choices X input files */
		for (long dfNO = 0; dfNO < har.dfChoiceNum; dfNO++) {
			har.resetDataFlowPicks(dfNO);

			for (int i = 0; i < tarFiles.length; i++) {
				try {
					System.out.println("run cfNO: " + cfNO + ", dfNO: " + dfNO + ", input: " + tarFiles[i]);
					File file = new File(tarFiles[i]);
					har.run(file, new FileInputStream(file));

					eventSeq = har.pastEventsStr;
					failed = false;
					partial = false;

				} catch (NoCondTriggerredException nce) {
					System.out.println("Eat \"" + har.pastEventsStr + ".*\" failure caused by " + nce);
					if (debug) 
						nce.printStackTrace();

					eventSeq = nce.eventSeq;
					failed = false;
					partial = true;

				} catch (Exception | java.lang.AssertionError  t) {
					if (t instanceof HarnessException)
						System.out.println("Catched a HarnessException: " + t);
					else
						System.out.println("Catched a Exception | java.lang.AssertionError : " + t);

					if (debug)
						t.printStackTrace();
					String str = har.getFailedString();
					System.out.println("Run stopped since \"" + str + "\" failed caused by the above t");
					
					eventSeq = str;
					failed = true;
					partial = true;

				}

				if (!partial)
					/* if fully validated, just stop and return */
					break;

			}

			if (!partial)
				/* if fully validated, just stop and return */
				break;
		}

		
		return new Result(eventSeq, failed, partial);
				
	}

	public static Result inMemoryRunAutomata(iAlphabet alphabet, CompactNFA<Character> nfa, HashMap<Character, iAPIFunc> apiFuncs, HashMap<Integer, String> sIDMap, String cfPickJsonFile, String[] tarFiles) {

		Fuzzer.debug = false;
		// Fuzzer.debug = true;

		Fuzzer har = new Fuzzer();
		har.oneTimeInit(alphabet, nfa, apiFuncs, cfPickJsonFile, sIDMap);

		long allNum = har.cfPicks.getAllChoiceNum();
		System.out.println("In total, there are " + allNum + " ctrl flow choices");

		for (long cfNO = 0; cfNO < allNum; cfNO++) {
			String errorString = har.resetAllPicks(cfNO, 0);
			if (errorString != null) {
				System.out.println("Run stopped since \"" + errorString + "\" failed caused by unsatisfied data dep");
				return new Result(errorString, true, true);
			}

			String eventSeq = null;
			boolean failed = true;
			boolean partial = true;
			boolean allFailed = true;
			boolean hasPartial = false;

			/* try to fully test the tgarget by combining all data flow choices X input files */
			System.out.println("For cfNO " + cfNO + ", there are " + har.dfChoiceNum + " data flow choices");
			for (long dfNO = 0; dfNO < har.dfChoiceNum; dfNO++) {
				har.resetDataFlowPicks(dfNO);

				for (int i = 0; i < tarFiles.length; i++) {
					try {
						System.out.println("run cfNO: " + cfNO + ", dfNO: " + dfNO + ", input: " + tarFiles[i]);
						File file = new File(tarFiles[i]);
						har.run(file, new FileInputStream(file));

						eventSeq = har.pastEventsStr;
						failed = false;
						partial = false;

						allFailed = false;

					} catch (NoCondTriggerredException nce) {
						System.out.println("Eat \"" + har.pastEventsStr + ".*\" failure caused by " + nce);
						if (debug) 
							nce.printStackTrace();

						eventSeq = nce.eventSeq;
						failed = false;
						partial = true;

					} catch (Exception | java.lang.AssertionError  t) {
						if (t instanceof HarnessException)
							System.out.println("Catched a HarnessException: " + t);
						else
							System.out.println("Catched a Exception | java.lang.AssertionError : " + t);

						if (debug)
							t.printStackTrace();
						String str = har.getFailedString();
						System.out.println("Run stopped since \"" + str + "\" failed caused by the above t");

						eventSeq = str;
						failed = true;
						partial = true;

					}
				}
			}

			if (allFailed)
				System.out.println("All possible choices have failed for cfNO " + cfNO);

			// if (failed || partial) 
			// 	/* we are testing an automata, partial means there are some cases that the automata has no choices at all */
			// 	return new Result(eventSeq, failed, partial);
		}
				
		return null;
	}

	private static Fuzzer harness = null;

	public static void fuzzerInitialize() {
		String alphabetFile = "alphabet.json";
		String nfaFile = "nfa.txt";
		String apiFile = "apifuncs.json";
		String cfPickJsonFile = "cfPicks.json";

		Fuzzer.debug = true;
		harness = new Fuzzer();
		harness.initialize(alphabetFile, nfaFile, apiFile, cfPickJsonFile);
	}


	public static void fuzzerTestOneInput(com.code_intelligence.jazzer.api.FuzzedDataProvider data) {
		long cfNO = (long) data.consumeInt();
		long dfNO = (long) data.consumeInt();

		System.out.println("run cfNO: " + cfNO + ", dfNO: " + dfNO);
		//System.out.flush();

		InputStream inStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputs(cfNO, dfNO, data));

		String errorString = harness.resetAllPicks(cfNO, dfNO);
		if (errorString != null) {
			System.out.println("Run stopped since \"" + errorString + "\" failed caused by unsatisfied data dep");
			return;
		}

		try {
			// fix the first argument, it should be a file but that is not suitable for fuzzing
			harness.run(null, inStream);

		} catch (NoCondTriggerredException nce) {
			System.out.println("Eat \"" + harness.pastEventsStr + ".*\" failure caused by " + nce);
			if (debug) 
				nce.printStackTrace();

		} catch (HarnessException hex) {
			String str = harness.getFailedString();
			System.out.println("Eat \"" + str + "\" failure caused by " + hex);
			if (debug) 
				hex.printStackTrace();

		} catch (Exception | java.lang.AssertionError  t) {
			String str = harness.getFailedString();
			//System.out.println("Run stopped since \"" + str + "\" failed caused by " + t);
			//if (debug)
			//	t.printStackTrace();
            com.fuzz.ExpCollector.addNewCrash(t);
			
		}

	}


}

/*
printf "\x00\x00\x00\x00\x00\x00\x00\x00" | cat simple.tar - > own-seeds/new.tar
*/

/* Fuzzer.runOne(0, 0, "./input/active/tar/tar-alphabet.json", "./input/active/tar/tar-penfas.txt", "./input/active/tar/apiFuncs.json", new String []{ "./test-tar.tar" }); */
/* Fuzzer.runAll("./input/active/tar/tar-alphabet.json", "./input/active/tar/tar-penfas.txt", "./input/active/tar/apiFuncs.json", new String []{ "./test-tar.tar" }); */

/* Fuzzer.runOne(PARAMETER_CFNO, PARAMETER_DFNO, PARAMETER_ALPHABET, PARAMETER_NFA, PARAMETER_APIFUNC, PARAMETER_INPUT); */

/*
try {

	String errorString = null;
	String PARAMETER_ALPHABET = "test/alphabet.json";
	String PARAMETER_NFA = "input/active/tar/.tempNfa.txt";
	String PARAMETER_APIFUNC = "input/active/tar/.tempApiFuncs.json";
	String [] PARAMETER_INPUT = new String[] {"./test-tar.tar"};

	Fuzzer.debug = false;
	errorString = Fuzzer.runAll(PARAMETER_ALPHABET, PARAMETER_NFA, PARAMETER_APIFUNC, PARAMETER_INPUT);
} catch (Exception | java.lang.AssertionError  t) {
	t.printStackTrace();
	throw new RuntimeException("catched throwable " + t + " during the execution");
}
*/
