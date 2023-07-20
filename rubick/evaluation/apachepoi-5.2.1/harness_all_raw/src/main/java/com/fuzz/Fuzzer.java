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

			if (nextCall.equals('㘁')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int 1919584218_i8_LOOPVAR__0()> ");
				curEvent = '㘁';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰂')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.hssf.record.CellValueRecordInterface getCellValueRecord()> ");
				curEvent = '䰂';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getCellValueRecord();
				curEvent = null;

			} else if (nextCall.equals('㸄')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFObjectData: boolean hasDirectoryEntry()> ");
				curEvent = '㸄';
				boolean ret;
				org.apache.poi.hssf.usermodel.HSSFObjectData cls = (org.apache.poi.hssf.usermodel.HSSFObjectData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.hasDirectoryEntry();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䀅')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getAlternateExpression()> ");
				curEvent = '䀅';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAlternateExpression();
				curEvent = null;

			} else if (nextCall.equals('㸆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.HorizontalAlignment getAlignmentEnum()> ");
				curEvent = '㸆';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getAlignmentEnum();
				curEvent = null;

			} else if (nextCall.equals('䀎')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFFont getFontAt(int)> ");
				curEvent = '䀎';
				org.apache.poi.hssf.usermodel.HSSFFont ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFontAt(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㘘')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: int 1814324863_i12_LOOPVAR__0()> ");
				curEvent = '㘘';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈛')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-2147104415_i20_LOOPVAR__0'()> ");
				curEvent = '䈛';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨝')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getLeftBorderColor()> ");
				curEvent = '㨝';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLeftBorderColor();
				curEvent = null;

			} else if (nextCall.equals('㘟')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.HSSFFormulaParser: java.lang.String toFormulaString(org.apache.poi.hssf.usermodel.HSSFWorkbook,org.apache.poi.ss.formula.ptg.Ptg[])> ");
				curEvent = '㘟';
				org.apache.poi.hssf.usermodel.HSSFWorkbook arg0 = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.ss.formula.ptg.Ptg[] arg1 = (org.apache.poi.ss.formula.ptg.Ptg[]) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.poi.hssf.model.HSSFFormulaParser.toFormulaString(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㐠')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: void fixTabIdRecord()> ");
				curEvent = '㐠';
				org.apache.poi.hssf.model.InternalWorkbook cls = (org.apache.poi.hssf.model.InternalWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.fixTabIdRecord();
				curEvent = null;

			} else if (nextCall.equals('㠠')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getRightBorderColor()> ");
				curEvent = '㠠';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getRightBorderColor();
				curEvent = null;

			} else if (nextCall.equals('㰡')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: void notifyFormulaChanging()> ");
				curEvent = '㰡';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.notifyFormulaChanging();
				curEvent = null;

			} else if (nextCall.equals('㨪')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFObjectData: byte[] getObjectData()> ");
				curEvent = '㨪';
				org.apache.poi.hssf.usermodel.HSSFObjectData cls = (org.apache.poi.hssf.usermodel.HSSFObjectData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getObjectData();
				curEvent = null;

			} else if (nextCall.equals('㸫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: java.lang.String getComment()> ");
				curEvent = '㸫';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getComment();
				curEvent = null;

			} else if (nextCall.equals('䘫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void <init>(org.apache.poi.poifs.filesystem.DirectoryNode,boolean)> ");
				curEvent = '䘫';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				org.apache.poi.poifs.filesystem.DirectoryNode arg0 = (org.apache.poi.poifs.filesystem.DirectoryNode) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				boolean arg1 = (boolean) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.poi.hssf.usermodel.HSSFWorkbook(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int '-349315241_i17_LOOPVAR__0'()> ");
				curEvent = '㠰';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFPrintSetup getPrintSetup()> ");
				curEvent = '㐱';
				org.apache.poi.hssf.usermodel.HSSFPrintSetup ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPrintSetup();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getTabpos()> ");
				curEvent = '㨱';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTabpos();
				curEvent = null;

			} else if (nextCall.equals('㘲')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfNames()> ");
				curEvent = '㘲';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNumberOfNames();
				curEvent = null;

			} else if (nextCall.equals('䰳')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()> ");
				curEvent = '䰳';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠴')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.hssf.usermodel.HSSFCellStyle getCellStyle()> ");
				curEvent = '㠴';
				org.apache.poi.hssf.usermodel.HSSFCellStyle ret;
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCellStyle();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void <init>(java.io.InputStream)> ");
				curEvent = '㨶';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.poi.hssf.usermodel.HSSFWorkbook(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰷')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '䰷';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䨸')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int 817111887_i3_LOOPVAR_<org.apache.poi.hssf.usermodel.HSSFSheet: int 817111887_i3_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䨸';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䐺')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator rowIterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '䐺';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠻')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1723658275_i3_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFSheet: int '-1723658275_i3_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㠻';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰽')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFCreationHelper getCreationHelper()> ");
				curEvent = '㰽';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCreationHelper();
				curEvent = null;

			} else if (nextCall.equals('䠾')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.hssf.usermodel.HSSFComment getCellComment()> ");
				curEvent = '䠾';
				org.apache.poi.hssf.usermodel.HSSFComment ret;
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCellComment();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁀')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int 1919584218_i8_LOOPVAR_<org.apache.poi.hssf.usermodel.HSSFSheet: int 1919584218_i8_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䁀';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙁')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean getBackupFlag()> ");
				curEvent = '䙁';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBackupFlag();
				curEvent = null;

			} else if (nextCall.equals('㙂')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: boolean isFunctionName()> ");
				curEvent = '㙂';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isFunctionName();
				curEvent = null;

			} else if (nextCall.equals('䱂')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.poifs.crypt.EncryptionInfo getEncryptionInfo()> ");
				curEvent = '䱂';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getEncryptionInfo();
				curEvent = null;

			} else if (nextCall.equals('㙃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPatriarch: boolean <org.apache.poi.hssf.usermodel.HSSFPatriarch: java.util.List getChildren()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㙃';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFClientAnchor: float getAnchorHeightInPoints(org.apache.poi.hssf.usermodel.HSSFSheet)> ");
				curEvent = '㹃';
				float ret;
				org.apache.poi.hssf.usermodel.HSSFSheet arg0 = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFClientAnchor cls = (org.apache.poi.hssf.usermodel.HSSFClientAnchor) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnchorHeightInPoints(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡄')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void close()> ");
				curEvent = '㡄';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('㱆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getBorderLeft()> ");
				curEvent = '㱆';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderLeft();
				curEvent = null;

			} else if (nextCall.equals('H')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFSheet getSheetAt(int)> ");
				curEvent = 'H';
				org.apache.poi.hssf.usermodel.HSSFSheet ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSheetAt(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉍')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRichTextString: org.apache.poi.hssf.record.common.UnicodeString getUnicodeString()> ");
				curEvent = '䉍';
				org.apache.poi.hssf.usermodel.HSSFRichTextString cls = (org.apache.poi.hssf.usermodel.HSSFRichTextString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getUnicodeString();
				curEvent = null;

			} else if (nextCall.equals('㑐')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void validateSheetIndex(int)> ");
				curEvent = '㑐';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.validateSheetIndex(arg0);
				curEvent = null;

			} else if (nextCall.equals('䱐')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> ");
				curEvent = '䱐';
				int ret = 0;
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.getCellType();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡑')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalSheet: org.apache.poi.hssf.record.WindowTwoRecord getWindowTwo()> ");
				curEvent = '㡑';
				org.apache.poi.hssf.model.InternalSheet cls = (org.apache.poi.hssf.model.InternalSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getWindowTwo();
				curEvent = null;

			} else if (nextCall.equals('䡒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.FillPatternType getFillPattern()> ");
				curEvent = '䡒';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFillPattern();
				curEvent = null;

			} else if (nextCall.equals('䱒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: short getDefaultRowHeight()> ");
				curEvent = '䱒';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDefaultRowHeight();
				curEvent = null;

			} else if (nextCall.equals('㱖')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: org.apache.poi.hssf.usermodel.HSSFCell getCell(int)> ");
				curEvent = '㱖';
				org.apache.poi.hssf.usermodel.HSSFCell ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCell(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩖')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.EscherGraphics2d: void drawString(java.lang.String,int,int)> ");
				curEvent = '䩖';
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				org.apache.poi.hssf.usermodel.EscherGraphics2d cls = (org.apache.poi.hssf.usermodel.EscherGraphics2d) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawString(arg0,arg1,arg2);
				curEvent = null;

			} else if (nextCall.equals('㩗')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.VerticalAlignment getVerticalAlignmentEnum()> ");
				curEvent = '㩗';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getVerticalAlignmentEnum();
				curEvent = null;

			} else if (nextCall.equals('䱘')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int getPhysicalNumberOfRows()> ");
				curEvent = '䱘';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPhysicalNumberOfRows();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙞')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: byte[] getBytes()> ");
				curEvent = '䙞';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBytes();
				curEvent = null;

			} else if (nextCall.equals('䙠')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.EscherGraphics2d: void fillPolygon(int[],int[],int)> ");
				curEvent = '䙠';
				int[] arg0 = (int[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int[] arg1 = (int[]) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				org.apache.poi.hssf.usermodel.EscherGraphics2d cls = (org.apache.poi.hssf.usermodel.EscherGraphics2d) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.fillPolygon(arg0,arg1,arg2);
				curEvent = null;

			} else if (nextCall.equals('㙢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void dumpDrawingGroupRecords(boolean)> ");
				curEvent = '㙢';
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.dumpDrawingGroupRecords(arg0);
				curEvent = null;

			} else if (nextCall.equals('㡦')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPictureData: java.lang.String suggestFileExtension()> ");
				curEvent = '㡦';
				org.apache.poi.hssf.usermodel.HSSFPictureData cls = (org.apache.poi.hssf.usermodel.HSSFPictureData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.suggestFileExtension();
				curEvent = null;

			} else if (nextCall.equals('䩦')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFHeader getHeader()> ");
				curEvent = '䩦';
				org.apache.poi.hssf.usermodel.HSSFHeader ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙩')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getExternsheetPos()> ");
				curEvent = '㙩';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getExternsheetPos();
				curEvent = null;

			} else if (nextCall.equals('㱪')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRichTextString: void applyFont(org.apache.poi.ss.usermodel.Font)> ");
				curEvent = '㱪';
				org.apache.poi.ss.usermodel.Font arg0 = (org.apache.poi.ss.usermodel.Font) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFRichTextString cls = (org.apache.poi.hssf.usermodel.HSSFRichTextString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.applyFont(arg0);
				curEvent = null;

			} else if (nextCall.equals('䙫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getBorderTop()> ");
				curEvent = '䙫';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderTop();
				curEvent = null;

			} else if (nextCall.equals('䙬')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFShape: org.apache.poi.hssf.usermodel.HSSFAnchor getAnchor()> ");
				curEvent = '䙬';
				org.apache.poi.hssf.usermodel.HSSFAnchor ret;
				org.apache.poi.hssf.usermodel.HSSFShape cls = (org.apache.poi.hssf.usermodel.HSSFShape) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnchor();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.ss.usermodel.CellType getCellType()> ");
				curEvent = '㡮';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCellType();
				curEvent = null;

			} else if (nextCall.equals('䡯')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.EscherGraphics2d: void <init>(org.apache.poi.hssf.usermodel.EscherGraphics)> ");
				curEvent = '䡯';
				org.apache.poi.hssf.usermodel.EscherGraphics2d ret;
				org.apache.poi.hssf.usermodel.EscherGraphics arg0 = (org.apache.poi.hssf.usermodel.EscherGraphics) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.poi.hssf.usermodel.EscherGraphics2d(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()> ");
				curEvent = '㙰';
				java.util.Iterator ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: boolean getStrikeout()> ");
				curEvent = '䉰';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStrikeout();
				curEvent = null;

			} else if (nextCall.equals('㹱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFShapeGroup: int getY1()> ");
				curEvent = '㹱';
				org.apache.poi.hssf.usermodel.HSSFShapeGroup cls = (org.apache.poi.hssf.usermodel.HSSFShapeGroup) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getY1();
				curEvent = null;

			} else if (nextCall.equals('䱱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()> ");
				curEvent = '䱱';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('s')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: org.apache.poi.hssf.record.common.UnicodeString getSSTString(int)> ");
				curEvent = 's';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.model.InternalWorkbook cls = (org.apache.poi.hssf.model.InternalWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSSTString(arg0);
				curEvent = null;

			} else if (nextCall.equals('䡳')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int 769713174_i3_LOOPVAR__0()> ");
				curEvent = '䡳';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉵')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䉵';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: boolean doesContainsSheetName(java.lang.String,int)> ");
				curEvent = '䩶';
				boolean ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.poi.hssf.model.InternalWorkbook cls = (org.apache.poi.hssf.model.InternalWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.doesContainsSheetName(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡻')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getTypeOffset()> ");
				curEvent = '䡻';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTypeOffset();
				curEvent = null;

			} else if (nextCall.equals('㩽')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: boolean isDeleted()> ");
				curEvent = '㩽';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isDeleted();
				curEvent = null;

			} else if (nextCall.equals('䑿')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-2147104415_i20_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFSheet: int '-2147104415_i20_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䑿';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRichTextString: void <init>()> ");
				curEvent = '䊃';
				org.apache.poi.hssf.usermodel.HSSFRichTextString ret;
				ret = new org.apache.poi.hssf.usermodel.HSSFRichTextString();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒅')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: java.lang.String getCellFormula()> ");
				curEvent = '䒅';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCellFormula();
				curEvent = null;

			} else if (nextCall.equals('䪈')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: boolean getBold()> ");
				curEvent = '䪈';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBold();
				curEvent = null;

			} else if (nextCall.equals('㺌')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: int 1814324863_i12_LOOPVAR_<org.apache.poi.hssf.model.InternalWorkbook: int 1814324863_i12_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㺌';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚍')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPictureData: byte[] getData()> ");
				curEvent = '㚍';
				org.apache.poi.hssf.usermodel.HSSFPictureData cls = (org.apache.poi.hssf.usermodel.HSSFPictureData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getData();
				curEvent = null;

			} else if (nextCall.equals('㚎')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderRightEnum()> ");
				curEvent = '㚎';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getBorderRightEnum();
				curEvent = null;

			} else if (nextCall.equals('㪏')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllPictures()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㪏';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂐')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getPalettepos()> ");
				curEvent = '䂐';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPalettepos();
				curEvent = null;

			} else if (nextCall.equals('㢖')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.ss.usermodel.CellType getCellTypeEnum()> ");
				curEvent = '㢖';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getCellTypeEnum();
				curEvent = null;

			} else if (nextCall.equals('䚚')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFClientAnchor: void <init>(int,int,int,int,short,int,short,int)> ");
				curEvent = '䚚';
				org.apache.poi.hssf.usermodel.HSSFClientAnchor ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				int arg3 = (int) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				short arg4 = (short) getVarValue(pickInVar(nextCall, "arg4"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg4") + ") => " + arg4);
				int arg5 = (int) getVarValue(pickInVar(nextCall, "arg5"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg5") + ") => " + arg5);
				short arg6 = (short) getVarValue(pickInVar(nextCall, "arg6"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg6") + ") => " + arg6);
				int arg7 = (int) getVarValue(pickInVar(nextCall, "arg7"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg7") + ") => " + arg7);
				ret = new org.apache.poi.hssf.usermodel.HSSFClientAnchor(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> ");
				curEvent = '㢜';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfSheets();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂞')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int getLastRowNum()> ");
				curEvent = '䂞';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLastRowNum();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚡')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: int getSheetIndex()> ");
				curEvent = '㚡';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSheetIndex();
				curEvent = null;

			} else if (nextCall.equals('㺡')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: float getHeightInPoints()> ");
				curEvent = '㺡';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeightInPoints();
				curEvent = null;

			} else if (nextCall.equals('䪡')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.lang.String getSheetName(int)> ");
				curEvent = '䪡';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSheetName(arg0);
				curEvent = null;

			} else if (nextCall.equals('㺢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.ss.util.CellAddress getActiveCell()> ");
				curEvent = '㺢';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getActiveCell();
				curEvent = null;

			} else if (nextCall.equals('㚨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: boolean convertCellValueToBoolean()> ");
				curEvent = '㚨';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.convertCellValueToBoolean();
				curEvent = null;

			} else if (nextCall.equals('㚪')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalSheet: void replaceValueRecord(org.apache.poi.hssf.record.CellValueRecordInterface)> ");
				curEvent = '㚪';
				org.apache.poi.hssf.record.CellValueRecordInterface arg0 = (org.apache.poi.hssf.record.CellValueRecordInterface) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.model.InternalSheet cls = (org.apache.poi.hssf.model.InternalSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.replaceValueRecord(arg0);
				curEvent = null;

			} else if (nextCall.equals('㪫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void <init>(org.apache.poi.poifs.filesystem.DirectoryNode,org.apache.poi.poifs.filesystem.POIFSFileSystem,boolean)> ");
				curEvent = '㪫';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				org.apache.poi.poifs.filesystem.DirectoryNode arg0 = (org.apache.poi.poifs.filesystem.DirectoryNode) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.poifs.filesystem.POIFSFileSystem arg1 = (org.apache.poi.poifs.filesystem.POIFSFileSystem) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				boolean arg2 = (boolean) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				ret = new org.apache.poi.hssf.usermodel.HSSFWorkbook(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int '-408173640_i3_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFRow: int '-408173640_i3_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㲮';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator cellIterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '䚮';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hpsf.DocumentSummaryInformation getDocumentSummaryInformation()> ");
				curEvent = '䢰';
				org.apache.poi.hpsf.DocumentSummaryInformation ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentSummaryInformation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䪱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFChildAnchor: void <init>(int,int,int,int)> ");
				curEvent = '䪱';
				org.apache.poi.hssf.usermodel.HSSFChildAnchor ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				int arg3 = (int) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				ret = new org.apache.poi.hssf.usermodel.HSSFChildAnchor(arg0,arg1,arg2,arg3);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚲')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: int hashCode()> ");
				curEvent = '䚲';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hashCode();
				curEvent = null;

			} else if (nextCall.equals('䊵')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-349315241_i16_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFSheet: int '-349315241_i16_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䊵';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int getOutlineLevel()> ");
				curEvent = '㪶';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOutlineLevel();
				curEvent = null;

			} else if (nextCall.equals('䒶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator cellIterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '䒶';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢸')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPalette: org.apache.poi.hssf.util.HSSFColor getColor(short)> ");
				curEvent = '㢸';
				short arg0 = (short) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFPalette cls = (org.apache.poi.hssf.usermodel.HSSFPalette) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getColor(arg0);
				curEvent = null;

			} else if (nextCall.equals('䒸')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int getPhysicalNumberOfCells()> ");
				curEvent = '䒸';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPhysicalNumberOfCells();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲹')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: int getNumNames()> ");
				curEvent = '䲹';
				int ret;
				org.apache.poi.hssf.model.InternalWorkbook cls = (org.apache.poi.hssf.model.InternalWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumNames();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢺')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFClientAnchor: void <init>()> ");
				curEvent = '䢺';
				org.apache.poi.hssf.usermodel.HSSFClientAnchor ret;
				ret = new org.apache.poi.hssf.usermodel.HSSFClientAnchor();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻀')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR_<org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㻀';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓁')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllPictures()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㓁';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋁')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalSheet: org.apache.poi.hssf.record.aggregates.RowRecordsAggregate getRowsAggregate()> ");
				curEvent = '䋁';
				org.apache.poi.hssf.model.InternalSheet cls = (org.apache.poi.hssf.model.InternalSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getRowsAggregate();
				curEvent = null;

			} else if (nextCall.equals('䳂')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: int getIndexAsInt()> ");
				curEvent = '䳂';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getIndexAsInt();
				curEvent = null;

			} else if (nextCall.equals('䃃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: void <init>(org.apache.poi.hssf.usermodel.HSSFWorkbook,org.apache.poi.hssf.usermodel.HSSFSheet,int,short,org.apache.poi.ss.usermodel.CellType)> ");
				curEvent = '䃃';
				org.apache.poi.hssf.usermodel.HSSFCell ret = null;
				org.apache.poi.hssf.usermodel.HSSFWorkbook arg0 = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFSheet arg1 = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				short arg3 = (short) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				org.apache.poi.ss.usermodel.CellType arg4 = (org.apache.poi.ss.usermodel.CellType) getVarValue(pickInVar(nextCall, "arg4"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg4") + ") => " + arg4);
				//ret = new org.apache.poi.hssf.usermodel.HSSFCell(arg0,arg1,arg2,arg3,arg4);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getDialog()> ");
				curEvent = '㻆';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDialog();
				curEvent = null;

			} else if (nextCall.equals('㫈')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int 817111887_i3_LOOPVAR__0()> ");
				curEvent = '㫈';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳉')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: void checkSheets(int)> ");
				curEvent = '㳉';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.model.InternalWorkbook cls = (org.apache.poi.hssf.model.InternalWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.checkSheets(arg0);
				curEvent = null;

			} else if (nextCall.equals('䋊')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-349315241_i16_LOOPVAR__0'()> ");
				curEvent = '䋊';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳌')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getFirstVisibleTab()> ");
				curEvent = '䳌';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFirstVisibleTab();
				curEvent = null;

			} else if (nextCall.equals('䣎')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: int getIndex()> ");
				curEvent = '䣎';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getIndex();
				curEvent = null;

			} else if (nextCall.equals('䓏')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: java.lang.String getFontName()> ");
				curEvent = '䓏';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFontName();
				curEvent = null;

			} else if (nextCall.equals('㫑')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderLeftEnum()> ");
				curEvent = '㫑';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getBorderLeftEnum();
				curEvent = null;

			} else if (nextCall.equals('䓓')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFObjectData: org.apache.poi.poifs.filesystem.DirectoryEntry getDirectory()> ");
				curEvent = '䓓';
				org.apache.poi.poifs.filesystem.DirectoryEntry ret;
				org.apache.poi.hssf.usermodel.HSSFObjectData cls = (org.apache.poi.hssf.usermodel.HSSFObjectData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDirectory();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䛖')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.HorizontalAlignment getAlignment()> ");
				curEvent = '䛖';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAlignment();
				curEvent = null;

			} else if (nextCall.equals('䃙')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getSheetIndex(java.lang.String)> ");
				curEvent = '䃙';
				int ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSheetIndex(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻛')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()> ");
				curEvent = '㻛';
				java.util.Iterator ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-349315241_i15_LOOPVAR__0'()> ");
				curEvent = '㓜';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRichTextString: int length()> ");
				curEvent = '䋜';
				org.apache.poi.hssf.usermodel.HSSFRichTextString cls = (org.apache.poi.hssf.usermodel.HSSFRichTextString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.length();
				curEvent = null;

			} else if (nextCall.equals('䳜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: java.lang.String getSheetName()> ");
				curEvent = '䳜';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSheetName();
				curEvent = null;

			} else if (nextCall.equals('䫢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator cellIterator()> ");
				curEvent = '䫢';
				java.util.Iterator ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.cellIterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣣')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPicture: int getPictureIndex()> ");
				curEvent = '䣣';
				org.apache.poi.hssf.usermodel.HSSFPicture cls = (org.apache.poi.hssf.usermodel.HSSFPicture) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPictureIndex();
				curEvent = null;

			} else if (nextCall.equals('㳦')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getAlternateFormula()> ");
				curEvent = '㳦';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAlternateFormula();
				curEvent = null;

			} else if (nextCall.equals('䋦')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getSupbookpos()> ");
				curEvent = '䋦';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSupbookpos();
				curEvent = null;

			} else if (nextCall.equals('䛦')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.model.InternalWorkbook getWorkbook()> ");
				curEvent = '䛦';
				org.apache.poi.hssf.model.InternalWorkbook ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getWorkbook();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓧')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPictureData: java.lang.String getMimeType()> ");
				curEvent = '䓧';
				org.apache.poi.hssf.usermodel.HSSFPictureData cls = (org.apache.poi.hssf.usermodel.HSSFPictureData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMimeType();
				curEvent = null;

			} else if (nextCall.equals('䫨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()> ");
				curEvent = '䫨';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣪')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Map getCellComments()> ");
				curEvent = '䣪';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCellComments();
				curEvent = null;

			} else if (nextCall.equals('㻫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: byte getUnderline()> ");
				curEvent = '㻫';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUnderline();
				curEvent = null;

			} else if (nextCall.equals('㓬')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRichTextString: void applyFont(int,int,org.apache.poi.ss.usermodel.Font)> ");
				curEvent = '㓬';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.poi.ss.usermodel.Font arg2 = (org.apache.poi.ss.usermodel.Font) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				org.apache.poi.hssf.usermodel.HSSFRichTextString cls = (org.apache.poi.hssf.usermodel.HSSFRichTextString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.applyFont(arg0,arg1,arg2);
				curEvent = null;

			} else if (nextCall.equals('㫮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPictureData: int getPictureType()> ");
				curEvent = '㫮';
				org.apache.poi.hssf.usermodel.HSSFPictureData cls = (org.apache.poi.hssf.usermodel.HSSFPictureData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPictureType();
				curEvent = null;

			} else if (nextCall.equals('䫮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: org.apache.poi.hssf.util.HSSFColor getHSSFColor(org.apache.poi.hssf.usermodel.HSSFWorkbook)> ");
				curEvent = '䫮';
				org.apache.poi.hssf.usermodel.HSSFWorkbook arg0 = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHSSFColor(arg0);
				curEvent = null;

			} else if (nextCall.equals('䳯')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䳯';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㛲')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getTopBorderColor()> ");
				curEvent = '㛲';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTopBorderColor();
				curEvent = null;

			} else if (nextCall.equals('㻲')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFFooter getFooter()> ");
				curEvent = '㻲';
				org.apache.poi.hssf.usermodel.HSSFFooter ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFooter();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋳')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: void <init>(org.apache.poi.hssf.usermodel.HSSFWorkbook,org.apache.poi.hssf.usermodel.HSSFSheet,int,short,int)> ");
				curEvent = '䋳';
				org.apache.poi.hssf.usermodel.HSSFCell ret = null;
				org.apache.poi.hssf.usermodel.HSSFWorkbook arg0 = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFSheet arg1 = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				short arg3 = (short) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				int arg4 = (int) getVarValue(pickInVar(nextCall, "arg4"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg4") + ") => " + arg4);
				//ret = new org.apache.poi.hssf.usermodel.HSSFCell(arg0,arg1,arg2,arg3,arg4);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㛵')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '㛵';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓹')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFObjectData: java.lang.String getOLE2ClassName()> ");
				curEvent = '䓹';
				org.apache.poi.hssf.usermodel.HSSFObjectData cls = (org.apache.poi.hssf.usermodel.HSSFObjectData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOLE2ClassName();
				curEvent = null;

			} else if (nextCall.equals('㓻')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: short getLastCellNum()> ");
				curEvent = '㓻';
				short ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLastCellNum();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫻')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: java.lang.String getNameName()> ");
				curEvent = '䫻';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNameName();
				curEvent = null;

			} else if (nextCall.equals('㓿')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderRight()> ");
				curEvent = '㓿';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderRight();
				curEvent = null;

			} else if (nextCall.equals('㫿')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFWorkbook getWorkbook()> ");
				curEvent = '㫿';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getWorkbook();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳿')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void <init>(org.apache.poi.poifs.filesystem.POIFSFileSystem)> ");
				curEvent = '㳿';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				org.apache.poi.poifs.filesystem.POIFSFileSystem arg0 = (org.apache.poi.poifs.filesystem.POIFSFileSystem) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.poi.hssf.usermodel.HSSFWorkbook(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴁')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.PoiUtils: boolean customHeight(org.apache.poi.ss.usermodel.Row)> ");
				curEvent = '㴁';
				org.apache.poi.ss.usermodel.Row arg0 = (org.apache.poi.ss.usermodel.Row) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//org.apache.poi.hssf.usermodel.PoiUtils.customHeight(arg0);
				curEvent = null;

			} else if (nextCall.equals('㔃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getBspos()> ");
				curEvent = '㔃';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBspos();
				curEvent = null;

			} else if (nextCall.equals('䌄')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderBottomEnum()> ");
				curEvent = '䌄';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getBorderBottomEnum();
				curEvent = null;

			} else if (nextCall.equals('䔆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: void <init>(org.apache.poi.hssf.usermodel.HSSFWorkbook)> ");
				curEvent = '䔆';
				org.apache.poi.hssf.usermodel.HSSFSheet ret = null;
				org.apache.poi.hssf.usermodel.HSSFWorkbook arg0 = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//ret = new org.apache.poi.hssf.usermodel.HSSFSheet(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤊')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getFontHeight()> ");
				curEvent = '㤊';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFontHeight();
				curEvent = null;

			} else if (nextCall.equals('㤌')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFClientAnchor: int getRow1()> ");
				curEvent = '㤌';
				org.apache.poi.hssf.usermodel.HSSFClientAnchor cls = (org.apache.poi.hssf.usermodel.HSSFClientAnchor) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getRow1();
				curEvent = null;

			} else if (nextCall.equals('䌎')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '䌎';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䜒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFPatriarch getDrawingPatriarch()> ");
				curEvent = '䜒';
				org.apache.poi.hssf.usermodel.HSSFPatriarch ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDrawingPatriarch();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬓')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFCellStyle getCellStyleAt(int)> ");
				curEvent = '㬓';
				org.apache.poi.hssf.usermodel.HSSFCellStyle ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCellStyleAt(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜔')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㜔';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜕')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllPictures()> ");
				curEvent = '㜕';
				java.util.List ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAllPictures();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䄘')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.EscherGraphics2d: void fillOval(int,int,int,int)> ");
				curEvent = '䄘';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				int arg3 = (int) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				org.apache.poi.hssf.usermodel.EscherGraphics2d cls = (org.apache.poi.hssf.usermodel.EscherGraphics2d) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.fillOval(arg0,arg1,arg2,arg3);
				curEvent = null;

			} else if (nextCall.equals('䄜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderTopEnum()> ");
				curEvent = '䄜';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getBorderTopEnum();
				curEvent = null;

			} else if (nextCall.equals('㜟')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator rowIterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '㜟';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤠')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: short getFirstCellNum()> ");
				curEvent = '䤠';
				short ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFirstCellNum();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFPalette getCustomPalette()> ");
				curEvent = '䌢';
				org.apache.poi.hssf.usermodel.HSSFPalette ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCustomPalette();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔥')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFRow getRow(int)> ");
				curEvent = '㔥';
				org.apache.poi.hssf.usermodel.HSSFRow ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRow(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼧')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.EscherGraphics: void <init>(org.apache.poi.hssf.usermodel.HSSFShapeGroup,org.apache.poi.hssf.usermodel.HSSFWorkbook,java.awt.Color,float)> ");
				curEvent = '㼧';
				org.apache.poi.hssf.usermodel.EscherGraphics ret;
				org.apache.poi.hssf.usermodel.HSSFShapeGroup arg0 = (org.apache.poi.hssf.usermodel.HSSFShapeGroup) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook arg1 = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				java.awt.Color arg2 = (java.awt.Color) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				float arg3 = (float) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				ret = new org.apache.poi.hssf.usermodel.EscherGraphics(arg0,arg1,arg2,arg3);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.model.InternalWorkbook getInternalWorkbook()> ");
				curEvent = '㼨';
				org.apache.poi.hssf.model.InternalWorkbook ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getInternalWorkbook();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getActiveSheetIndex()> ");
				curEvent = '㼫';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getActiveSheetIndex();
				curEvent = null;

			} else if (nextCall.equals('䤭')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllEmbeddedObjects()> ");
				curEvent = '䤭';
				java.util.List ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAllEmbeddedObjects();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.FillPatternType getFillPatternEnum()> ");
				curEvent = '䌮';
				org.apache.poi.ss.usermodel.FillPatternType ret = null;
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.getFillPatternEnum();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤯')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getBackuppos()> ");
				curEvent = '䤯';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBackuppos();
				curEvent = null;

			} else if (nextCall.equals('㼰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1723658275_i3_LOOPVAR__0'()> ");
				curEvent = '㼰';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䔰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.EscherGraphics2d: void drawPolygon(int[],int[],int)> ");
				curEvent = '䔰';
				int[] arg0 = (int[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int[] arg1 = (int[]) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				org.apache.poi.hssf.usermodel.EscherGraphics2d cls = (org.apache.poi.hssf.usermodel.EscherGraphics2d) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawPolygon(arg0,arg1,arg2);
				curEvent = null;

			} else if (nextCall.equals('㴳')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPatriarch: java.util.List getChildren()> ");
				curEvent = '㴳';
				java.util.List ret;
				org.apache.poi.hssf.usermodel.HSSFPatriarch cls = (org.apache.poi.hssf.usermodel.HSSFPatriarch) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getChildren();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔴')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int size()> ");
				curEvent = '㔴';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.size();
				curEvent = null;

			} else if (nextCall.equals('㜴')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getNamepos()> ");
				curEvent = '㜴';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNamepos();
				curEvent = null;

			} else if (nextCall.equals('㜵')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getDataFormat()> ");
				curEvent = '㜵';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataFormat();
				curEvent = null;

			} else if (nextCall.equals('㜶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPalette: org.apache.poi.hssf.util.HSSFColor findColor(byte,byte,byte)> ");
				curEvent = '㜶';
				org.apache.poi.hssf.util.HSSFColor ret;
				byte arg0 = (byte) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				byte arg1 = (byte) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				byte arg2 = (byte) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				org.apache.poi.hssf.usermodel.HSSFPalette cls = (org.apache.poi.hssf.usermodel.HSSFPalette) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.findColor(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: boolean getBooleanCellValue()> ");
				curEvent = '䤶';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBooleanCellValue();
				curEvent = null;

			} else if (nextCall.equals('㴷')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int getColumnWidth(int)> ");
				curEvent = '㴷';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getColumnWidth(arg0);
				curEvent = null;

			} else if (nextCall.equals('䔷')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getBorderRight()> ");
				curEvent = '䔷';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderRight();
				curEvent = null;

			} else if (nextCall.equals('㤸')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int '-349315241_i17_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFRow: int '-349315241_i17_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㤸';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤸')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderBottom()> ");
				curEvent = '䤸';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderBottom();
				curEvent = null;

			} else if (nextCall.equals('䴹')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFClientAnchor: short getCol1()> ");
				curEvent = '䴹';
				org.apache.poi.hssf.usermodel.HSSFClientAnchor cls = (org.apache.poi.hssf.usermodel.HSSFClientAnchor) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCol1();
				curEvent = null;

			} else if (nextCall.equals('䴻')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllNames()> ");
				curEvent = '䴻';
				java.util.List ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAllNames();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬽')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getBottomBorderColor()> ");
				curEvent = '㬽';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBottomBorderColor();
				curEvent = null;

			} else if (nextCall.equals('䜽')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFDataFormat: short getFormat(java.lang.String)> ");
				curEvent = '䜽';
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFDataFormat cls = (org.apache.poi.hssf.usermodel.HSSFDataFormat) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFormat(arg0);
				curEvent = null;

			} else if (nextCall.equals('䥌')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void <init>()> ");
				curEvent = '䥌';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				ret = new org.apache.poi.hssf.usermodel.HSSFWorkbook();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽎')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: void <init>(java.io.InputStream,boolean)> ");
				curEvent = '㽎';
				org.apache.poi.hssf.usermodel.HSSFWorkbook ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				boolean arg1 = (boolean) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.poi.hssf.usermodel.HSSFWorkbook(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥏')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPicture: void resize()> ");
				curEvent = '㥏';
				org.apache.poi.hssf.usermodel.HSSFPicture cls = (org.apache.poi.hssf.usermodel.HSSFPicture) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.resize();
				curEvent = null;

			} else if (nextCall.equals('䥑')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: void groupColumn(int,int)> ");
				curEvent = '䥑';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.groupColumn(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('䵑')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getFontHeightInPoints()> ");
				curEvent = '䵑';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFontHeightInPoints();
				curEvent = null;

			} else if (nextCall.equals('䅒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getXfpos()> ");
				curEvent = '䅒';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getXfpos();
				curEvent = null;

			} else if (nextCall.equals('䕓')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getFillForegroundColor()> ");
				curEvent = '䕓';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFillForegroundColor();
				curEvent = null;

			} else if (nextCall.equals('䅙')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.EscherGraphics2d: void drawLine(int,int,int,int)> ");
				curEvent = '䅙';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				int arg3 = (int) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				org.apache.poi.hssf.usermodel.EscherGraphics2d cls = (org.apache.poi.hssf.usermodel.EscherGraphics2d) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawLine(arg0,arg1,arg2,arg3);
				curEvent = null;

			} else if (nextCall.equals('䝞')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: boolean getItalic()> ");
				curEvent = '䝞';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getItalic();
				curEvent = null;

			} else if (nextCall.equals('䵞')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFHyperlink: void <init>(int)> ");
				curEvent = '䵞';
				org.apache.poi.hssf.usermodel.HSSFHyperlink ret = null;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//ret = new org.apache.poi.hssf.usermodel.HSSFHyperlink(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭠')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: java.lang.String getRefersToFormula()> ");
				curEvent = '㭠';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getRefersToFormula();
				curEvent = null;

			} else if (nextCall.equals('㕤')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1868684984_i7_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFSheet: int '-1868684984_i7_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㕤';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝤')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllNames()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㝤';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝧')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1868684984_i7_LOOPVAR__0'()> ");
				curEvent = '䝧';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㵨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: org.apache.poi.hssf.usermodel.HSSFSheet getSheet()> ");
				curEvent = '㵨';
				org.apache.poi.hssf.usermodel.HSSFSheet ret;
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSheet();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: org.apache.poi.hssf.record.NameRecord getNameRecord(int)> ");
				curEvent = '䅨';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.model.InternalWorkbook cls = (org.apache.poi.hssf.model.InternalWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNameRecord(arg0);
				curEvent = null;

			} else if (nextCall.equals('䍭')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1759990620_i4_LOOPVAR__╳'()> ");
				curEvent = '䍭';
				int ret = 0;
				//ret = (╳);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥮')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllNames()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㥮';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅯')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: java.lang.String convertCellValueToString()> ");
				curEvent = '䅯';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.convertCellValueToString();
				curEvent = null;

			} else if (nextCall.equals('㭰')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPatriarch: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFPatriarch: java.util.List getChildren()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㭰';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderTop()> ");
				curEvent = '䭱';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderTop();
				curEvent = null;

			} else if (nextCall.equals('䥲')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int '-408173640_i3_LOOPVAR__0'()> ");
				curEvent = '䥲';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥵')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getProtpos()> ");
				curEvent = '㥵';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getProtpos();
				curEvent = null;

			} else if (nextCall.equals('䝺')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfFonts()> ");
				curEvent = '䝺';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfFonts();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝽')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: short getHeight()> ");
				curEvent = '䝽';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeight();
				curEvent = null;

			} else if (nextCall.equals('㮀')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSimpleShape: org.apache.poi.hssf.usermodel.HSSFAnchor getAnchor()> ");
				curEvent = '㮀';
				org.apache.poi.hssf.usermodel.HSSFAnchor ret;
				org.apache.poi.hssf.usermodel.HSSFSimpleShape cls = (org.apache.poi.hssf.usermodel.HSSFSimpleShape) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnchor();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.model.InternalSheet getSheet()> ");
				curEvent = '䎆';
				org.apache.poi.hssf.model.InternalSheet ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSheet();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖈')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int getRowNum()> ");
				curEvent = '䖈';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRowNum();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㮊')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.hssf.util.HSSFColor getFillForegroundColorColor()> ");
				curEvent = '㮊';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFillForegroundColorColor();
				curEvent = null;

			} else if (nextCall.equals('㮍')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFDateUtil: boolean isCellDateFormatted(org.apache.poi.ss.usermodel.Cell)> ");
				curEvent = '㮍';
				org.apache.poi.ss.usermodel.Cell arg0 = (org.apache.poi.ss.usermodel.Cell) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//org.apache.poi.hssf.usermodel.HSSFDateUtil.isCellDateFormatted(arg0);
				curEvent = null;

			} else if (nextCall.equals('䶑')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.InternalWorkbook: org.apache.poi.hssf.record.WindowOneRecord getWindowOne()> ");
				curEvent = '䶑';
				org.apache.poi.hssf.model.InternalWorkbook cls = (org.apache.poi.hssf.model.InternalWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getWindowOne();
				curEvent = null;

			} else if (nextCall.equals('䞗')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: java.util.Date getDateCellValue()> ");
				curEvent = '䞗';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDateCellValue();
				curEvent = null;

			} else if (nextCall.equals('㾜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: int 769713174_i3_LOOPVAR_<org.apache.poi.hssf.usermodel.HSSFRow: int 769713174_i3_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㾜';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㦢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.ss.util.CellRangeAddress getMergedRegion(int)> ");
				curEvent = '㦢';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMergedRegion(arg0);
				curEvent = null;

			} else if (nextCall.equals('䆢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFShapeGroup: int getY2()> ");
				curEvent = '䆢';
				org.apache.poi.hssf.usermodel.HSSFShapeGroup cls = (org.apache.poi.hssf.usermodel.HSSFShapeGroup) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getY2();
				curEvent = null;

			} else if (nextCall.equals('䦥')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: void <init>(org.apache.poi.hssf.usermodel.HSSFWorkbook,org.apache.poi.hssf.usermodel.HSSFSheet,int)> ");
				curEvent = '䦥';
				org.apache.poi.hssf.usermodel.HSSFRow ret = null;
				org.apache.poi.hssf.usermodel.HSSFWorkbook arg0 = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFSheet arg1 = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				//ret = new org.apache.poi.hssf.usermodel.HSSFRow(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆧')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.poifs.crypt.EncryptionMode getEncryptionMode()> ");
				curEvent = '䆧';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getEncryptionMode();
				curEvent = null;

			} else if (nextCall.equals('㖨')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFName: boolean isHidden()> ");
				curEvent = '㖨';
				org.apache.poi.hssf.usermodel.HSSFName cls = (org.apache.poi.hssf.usermodel.HSSFName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isHidden();
				curEvent = null;

			} else if (nextCall.equals('㖩')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: java.lang.String getDataFormatString()> ");
				curEvent = '㖩';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataFormatString();
				curEvent = null;

			} else if (nextCall.equals('䦫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.BorderStyle getBorderLeft()> ");
				curEvent = '䦫';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderLeft();
				curEvent = null;

			} else if (nextCall.equals('䞭')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1759990620_i4_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFSheet: int '-1759990620_i4_LOOPVAR__╳'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䞭';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦺')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hssf.usermodel.HSSFSheet getSheet(java.lang.String)> ");
				curEvent = '䦺';
				org.apache.poi.hssf.usermodel.HSSFSheet ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSheet(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㦼')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean isSelected()> ");
				curEvent = '㦼';
				boolean ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isSelected();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆽')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()> ");
				curEvent = '䆽';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶾')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: void cloneStyleFrom(org.apache.poi.hssf.usermodel.HSSFCellStyle)> ");
				curEvent = '㶾';
				org.apache.poi.hssf.usermodel.HSSFCellStyle arg0 = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.cloneStyleFrom(arg0);
				curEvent = null;

			} else if (nextCall.equals('㿂')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '㿂';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗃')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: short getBorderBottom()> ");
				curEvent = '㗃';
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderBottom();
				curEvent = null;

			} else if (nextCall.equals('㷆')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean getForceFormulaRecalculation()> ");
				curEvent = '㷆';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getForceFormulaRecalculation();
				curEvent = null;

			} else if (nextCall.equals('䯈')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: int getCharSet()> ");
				curEvent = '䯈';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCharSet();
				curEvent = null;

			} else if (nextCall.equals('䟉')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.ss.usermodel.Row$MissingCellPolicy getMissingCellPolicy()> ");
				curEvent = '䟉';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMissingCellPolicy();
				curEvent = null;

			} else if (nextCall.equals('㗊')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.Collection getSelectedTabs()> ");
				curEvent = '㗊';
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSelectedTabs();
				curEvent = null;

			} else if (nextCall.equals('䧐')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRichTextString: java.lang.String getString()> ");
				curEvent = '䧐';
				java.lang.String ret;
				org.apache.poi.hssf.usermodel.HSSFRichTextString cls = (org.apache.poi.hssf.usermodel.HSSFRichTextString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getString();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟒')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRichTextString: void <init>(java.lang.String)> ");
				curEvent = '䟒';
				org.apache.poi.hssf.usermodel.HSSFRichTextString ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.poi.hssf.usermodel.HSSFRichTextString(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷓')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int getFirstRowNum()> ");
				curEvent = '㷓';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFirstRowNum();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗓')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-349315241_i15_LOOPVAR_<org'.apache.poi.hssf.usermodel.HSSFWorkbook: int '-349315241_i15_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䗓';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䯓')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllEmbeddedObjects()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䯓';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟔')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: byte getErrorCellValue()> ");
				curEvent = '㟔';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getErrorCellValue();
				curEvent = null;

			} else if (nextCall.equals('䟔')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: void groupRow(int,int)> ");
				curEvent = '䟔';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.groupRow(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('䗘')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: java.lang.String getStringCellValue()> ");
				curEvent = '䗘';
				java.lang.String ret;
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getStringCellValue();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧙')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: int getColumnIndex()> ");
				curEvent = '䧙';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getColumnIndex();
				curEvent = null;

			} else if (nextCall.equals('䇛')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.lang.Object <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllEmbeddedObjects()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䇛';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.model.WorkbookRecordList: int getFontpos()> ");
				curEvent = '㧜';
				org.apache.poi.hssf.model.WorkbookRecordList cls = (org.apache.poi.hssf.model.WorkbookRecordList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFontpos();
				curEvent = null;

			} else if (nextCall.equals('㯜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hpsf.SummaryInformation getSummaryInformation()> ");
				curEvent = '㯜';
				org.apache.poi.hpsf.SummaryInformation ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSummaryInformation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟜')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.hssf.usermodel.HSSFFont getFont(org.apache.poi.ss.usermodel.Workbook)> ");
				curEvent = '䟜';
				org.apache.poi.hssf.usermodel.HSSFFont ret;
				org.apache.poi.ss.usermodel.Workbook arg0 = (org.apache.poi.ss.usermodel.Workbook) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.poi.hssf.usermodel.HSSFCellStyle cls = (org.apache.poi.hssf.usermodel.HSSFCellStyle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFont(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.lang.String getSheetName()> ");
				curEvent = '㯢';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSheetName();
				curEvent = null;

			} else if (nextCall.equals('䇢')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFCell: double getNumericCellValue()> ");
				curEvent = '䇢';
				org.apache.poi.hssf.usermodel.HSSFCell cls = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNumericCellValue();
				curEvent = null;

			} else if (nextCall.equals('䗪')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFRow: org.apache.poi.hssf.record.RowRecord getRowRecord()> ");
				curEvent = '䗪';
				org.apache.poi.hssf.usermodel.HSSFRow cls = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getRowRecord();
				curEvent = null;

			} else if (nextCall.equals('㷫')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFPictureData: int getFormat()> ");
				curEvent = '㷫';
				org.apache.poi.hssf.usermodel.HSSFPictureData cls = (org.apache.poi.hssf.usermodel.HSSFPictureData) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFormat();
				curEvent = null;

			} else if (nextCall.equals('㟱')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: int getNumMergedRegions()> ");
				curEvent = '㟱';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumMergedRegions();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷳')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFFont: short getColor()> ");
				curEvent = '㷳';
				org.apache.poi.hssf.usermodel.HSSFFont cls = (org.apache.poi.hssf.usermodel.HSSFFont) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getColor();
				curEvent = null;

			} else if (nextCall.equals('䏴')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumCellStyles()> ");
				curEvent = '䏴';
				int ret;
				org.apache.poi.hssf.usermodel.HSSFWorkbook cls = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumCellStyles();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗵')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: boolean getAutobreaks()> ");
				curEvent = '㗵';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAutobreaks();
				curEvent = null;

			} else if (nextCall.equals('䟶')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.record.EscherAggregate getDrawingEscherAggregate()> ");
				curEvent = '䟶';
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDrawingEscherAggregate();
				curEvent = null;

			} else if (nextCall.equals('䗻')) {
				if (debug) System.out.println("Calling <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator rowIterator()> ");
				curEvent = '䗻';
				java.util.Iterator ret;
				org.apache.poi.hssf.usermodel.HSSFSheet cls = (org.apache.poi.hssf.usermodel.HSSFSheet) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.rowIterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else {
				if (1 == 0) throw new IOException("This makes compiler happy");

				throw new RuntimeException("this should not happen, an unknown func letter '" + nextCall + "'");
			}


		} catch (Exception | java.lang.AssertionError ex) {
			/* catch all kinds of exceptions (some APIs throw exceptions, we need to make the compiler happy) */
			/* System.out.println("catched IOException: " + ex); */
			//ex.printStackTrace();
			//throw new RuntimeException("Exception | java.lang.AssertionError: " + ex);
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

			if (cond.equals('㰀')) {
				curEvent = '㰀';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (Not(v_191_ == 4));
				curEvent = null;

			} else if (cond.equals('㠄')) {
				curEvent = '㠄';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFRow getRow(int)> */
				org.apache.poi.hssf.usermodel.HSSFRow v_9_ = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(getOutVar('㔥', "ret"));
				satisfies = (Not(v_9_ == null));
				curEvent = null;

			} else if (cond.equals('㐅')) {
				curEvent = '㐅';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllNames()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_38_ = (boolean) getVarValue(getOutVar('㝤', "ret"));
				satisfies = (v_38_ == false);
				curEvent = null;

			} else if (cond.equals('㸋')) {
				curEvent = '㸋';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hpsf.SummaryInformation getSummaryInformation()> */
				org.apache.poi.hpsf.SummaryInformation v_23_ = (org.apache.poi.hpsf.SummaryInformation) getVarValue(getOutVar('㯜', "ret"));
				satisfies = (v_23_ == null);
				curEvent = null;

			} else if (cond.equals('䈏')) {
				curEvent = '䈏';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: short getLastCellNum()> */
				short v_160_ = (short) getVarValue(getOutVar('㓻', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: short getFirstCellNum()> */
				short v_99_ = (short) getVarValue(getOutVar('䤠', "ret"));
				satisfies = (Not(v_99_ <= v_160_));
				curEvent = null;

			} else if (cond.equals('䐒')) {
				curEvent = '䐒';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getRowNum()> */
				int v_2_ = (int) getVarValue(getOutVar('䖈', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getLastRowNum()> */
				int v_147_ = (int) getVarValue(getOutVar('䂞', "ret"));
				satisfies = (Not(v_2_ <= v_147_));
				curEvent = null;

			} else if (cond.equals('㠝')) {
				curEvent = '㠝';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getPhysicalNumberOfRows()> */
				int v_78_ = (int) getVarValue(getOutVar('䱘', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-349315241_i16_LOOPVAR__0'()> */
				int v_120_ = (int) getVarValue(getOutVar('䋊', "ret"));
				satisfies = (v_78_ <= v_120_);
				curEvent = null;

			} else if (cond.equals('㰝')) {
				curEvent = '㰝';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumCellStyles()> */
				int v_40_ = (int) getVarValue(getOutVar('䏴', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()> */
				int v_145_ = (int) getVarValue(getOutVar('䆽', "ret"));
				satisfies = (Not(v_40_ <= v_145_));
				curEvent = null;

			} else if (cond.equals('㠥')) {
				curEvent = '㠥';
				/* <org.apache.poi.hssf.model.InternalWorkbook: boolean doesContainsSheetName(java.lang.String,int)> */
				boolean v_163_ = (boolean) getVarValue(getOutVar('䩶', "ret"));
				satisfies = (v_163_ == false);
				curEvent = null;

			} else if (cond.equals('䨨')) {
				curEvent = '䨨';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getLastRowNum()> */
				int v_147_ = (int) getVarValue(getOutVar('䂞', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getFirstRowNum()> */
				int v_169_ = (int) getVarValue(getOutVar('㷓', "ret"));
				satisfies = (v_169_ <= v_147_);
				curEvent = null;

			} else if (cond.equals('㠸')) {
				curEvent = '㠸';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean isSelected()> */
				boolean v_101_ = (boolean) getVarValue(getOutVar('㦼', "ret"));
				satisfies = (v_101_ == false);
				curEvent = null;

			} else if (cond.equals('㨺')) {
				curEvent = '㨺';
				/* <org.apache.poi.hssf.model.InternalWorkbook: int getNumNames()> */
				int v_142_ = (int) getVarValue(getOutVar('䲹', "ret"));
				/* <org.apache.poi.hssf.model.InternalWorkbook: int 1814324863_i12_LOOPVAR__0()> */
				int v_51_ = (int) getVarValue(getOutVar('㘘', "ret"));
				satisfies = (Not(v_142_ <= v_51_));
				curEvent = null;

			} else if (cond.equals('䱀')) {
				curEvent = '䱀';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (Not(v_191_ == 3));
				curEvent = null;

			} else if (cond.equals('㹈')) {
				curEvent = '㹈';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()> */
				int v_31_ = (int) getVarValue(getOutVar('䰳', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_181_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (v_181_ <= v_31_);
				curEvent = null;

			} else if (cond.equals('N')) {
				curEvent = 'N';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()> */
				int v_141_ = (int) getVarValue(getOutVar('䫨', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfFonts()> */
				int v_144_ = (int) getVarValue(getOutVar('䝺', "ret"));
				satisfies = (v_144_ <= v_141_);
				curEvent = null;

			} else if (cond.equals('㹑')) {
				curEvent = '㹑';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int 1919584218_i8_LOOPVAR__0()> */
				int v_115_ = (int) getVarValue(getOutVar('㘁', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getNumMergedRegions()> */
				int v_107_ = (int) getVarValue(getOutVar('㟱', "ret"));
				satisfies = (v_107_ <= v_115_);
				curEvent = null;

			} else if (cond.equals('S')) {
				curEvent = 'S';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getPhysicalNumberOfCells()> */
				int v_113_ = (int) getVarValue(getOutVar('䒸', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int '-408173640_i3_LOOPVAR__0'()> */
				int v_150_ = (int) getVarValue(getOutVar('䥲', "ret"));
				satisfies = (v_113_ <= v_150_);
				curEvent = null;

			} else if (cond.equals('㹫')) {
				curEvent = '㹫';
				/* <org.apache.poi.hssf.model.InternalWorkbook: boolean doesContainsSheetName(java.lang.String,int)> */
				boolean v_163_ = (boolean) getVarValue(getOutVar('䩶', "ret"));
				satisfies = (Not(v_163_ == false));
				curEvent = null;

			} else if (cond.equals('l')) {
				curEvent = 'l';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (v_191_ == 4);
				curEvent = null;

			} else if (cond.equals('㙯')) {
				curEvent = '㙯';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int 817111887_i3_LOOPVAR__0()> */
				int v_20_ = (int) getVarValue(getOutVar('㫈', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getNumMergedRegions()> */
				int v_107_ = (int) getVarValue(getOutVar('㟱', "ret"));
				satisfies = (v_107_ <= v_20_);
				curEvent = null;

			} else if (cond.equals('w')) {
				curEvent = 'w';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getPhysicalNumberOfRows()> */
				int v_78_ = (int) getVarValue(getOutVar('䱘', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-349315241_i16_LOOPVAR__0'()> */
				int v_120_ = (int) getVarValue(getOutVar('䋊', "ret"));
				satisfies = (Not(v_78_ <= v_120_));
				curEvent = null;

			} else if (cond.equals('㹿')) {
				curEvent = '㹿';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_241_ = (boolean) getVarValue(getOutVar('㿂', "ret"));
				satisfies = (v_241_ == false);
				curEvent = null;

			} else if (cond.equals('㪈')) {
				curEvent = '㪈';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: short getLastCellNum()> */
				short v_160_ = (short) getVarValue(getOutVar('㓻', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int '-349315241_i17_LOOPVAR__0'()> */
				int v_127_ = (int) getVarValue(getOutVar('㠰', "ret"));
				satisfies = (v_160_ <= v_127_);
				curEvent = null;

			} else if (cond.equals('㺏')) {
				curEvent = '㺏';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1377627789_i1_LOOPVAR__0'()> */
				int v_31_ = (int) getVarValue(getOutVar('䰳', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_181_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (Not(v_181_ <= v_31_));
				curEvent = null;

			} else if (cond.equals('㲐')) {
				curEvent = '㲐';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getSheetIndex(java.lang.String)> */
				int v_36_ = (int) getVarValue(getOutVar('䃙', "ret"));
				satisfies = (0 <= v_36_);
				curEvent = null;

			} else if (cond.equals('㺙')) {
				curEvent = '㺙';
				/* <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.FillPatternType getFillPatternEnum()> */
				org.apache.poi.ss.usermodel.FillPatternType v_129_ = (org.apache.poi.ss.usermodel.FillPatternType) getVarValue(getOutVar('䌮', "ret"));
				satisfies = (Not(v_129_ == null));
				curEvent = null;

			} else if (cond.equals('㒥')) {
				curEvent = '㒥';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-349315241_i15_LOOPVAR__0'()> */
				int v_174_ = (int) getVarValue(getOutVar('㓜', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_181_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (v_181_ <= v_174_);
				curEvent = null;

			} else if (cond.equals('㚩')) {
				curEvent = '㚩';
				/* <org.apache.poi.hssf.usermodel.HSSFObjectData: boolean hasDirectoryEntry()> */
				boolean v_139_ = (boolean) getVarValue(getOutVar('㸄', "ret"));
				satisfies = (v_139_ == false);
				curEvent = null;

			} else if (cond.equals('䂳')) {
				curEvent = '䂳';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getLastRowNum()> */
				int v_147_ = (int) getVarValue(getOutVar('䂞', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getFirstRowNum()> */
				int v_169_ = (int) getVarValue(getOutVar('㷓', "ret"));
				satisfies = (Not(v_169_ <= v_147_));
				curEvent = null;

			} else if (cond.equals('䒿')) {
				curEvent = '䒿';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hpsf.DocumentSummaryInformation getDocumentSummaryInformation()> */
				org.apache.poi.hpsf.DocumentSummaryInformation v_26_ = (org.apache.poi.hpsf.DocumentSummaryInformation) getVarValue(getOutVar('䢰', "ret"));
				satisfies = (Not(v_26_ == null));
				curEvent = null;

			} else if (cond.equals('䫀')) {
				curEvent = '䫀';
				/* <org.apache.poi.hssf.usermodel.HSSFPatriarch: boolean <org.apache.poi.hssf.usermodel.HSSFPatriarch: java.util.List getChildren()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_70_ = (boolean) getVarValue(getOutVar('㙃', "ret"));
				satisfies = (Not(v_70_ == false));
				curEvent = null;

			} else if (cond.equals('䫍')) {
				curEvent = '䫍';
				/* <org.apache.poi.hssf.usermodel.HSSFObjectData: org.apache.poi.poifs.filesystem.DirectoryEntry getDirectory()> */
				org.apache.poi.poifs.filesystem.DirectoryEntry v_11_ = (org.apache.poi.poifs.filesystem.DirectoryEntry) getVarValue(getOutVar('䓓', "ret"));
				satisfies = (v_11_ == null);
				curEvent = null;

			} else if (cond.equals('㛕')) {
				curEvent = '㛕';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFRow getRow(int)> */
				org.apache.poi.hssf.usermodel.HSSFRow v_9_ = (org.apache.poi.hssf.usermodel.HSSFRow) getVarValue(getOutVar('㔥', "ret"));
				satisfies = (v_9_ == null);
				curEvent = null;

			} else if (cond.equals('㓖')) {
				curEvent = '㓖';
				/* <org.apache.poi.hssf.usermodel.HSSFPalette: org.apache.poi.hssf.util.HSSFColor findColor(byte,byte,byte)> */
				org.apache.poi.hssf.util.HSSFColor v_0_ = (org.apache.poi.hssf.util.HSSFColor) getVarValue(getOutVar('㜶', "ret"));
				satisfies = (v_0_ == null);
				curEvent = null;

			} else if (cond.equals('䋛')) {
				curEvent = '䋛';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_6_ = (boolean) getVarValue(getOutVar('㛵', "ret"));
				satisfies = (Not(v_6_ == false));
				curEvent = null;

			} else if (cond.equals('䓜')) {
				curEvent = '䓜';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-2147104415_i20_LOOPVAR__0'()> */
				int v_44_ = (int) getVarValue(getOutVar('䈛', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getPhysicalNumberOfRows()> */
				int v_78_ = (int) getVarValue(getOutVar('䱘', "ret"));
				satisfies = (Not(v_78_ <= v_44_));
				curEvent = null;

			} else if (cond.equals('㣟')) {
				curEvent = '㣟';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: java.lang.String getStringCellValue()> */
				java.lang.String v_237_ = (java.lang.String) getVarValue(getOutVar('䗘', "ret"));
				satisfies = (Not(v_237_ == null));
				curEvent = null;

			} else if (cond.equals('䣟')) {
				curEvent = '䣟';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1723658275_i3_LOOPVAR__0'()> */
				int v_77_ = (int) getVarValue(getOutVar('㼰', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getPhysicalNumberOfRows()> */
				int v_78_ = (int) getVarValue(getOutVar('䱘', "ret"));
				satisfies = (Not(v_78_ <= v_77_));
				curEvent = null;

			} else if (cond.equals('㛧')) {
				curEvent = '㛧';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (v_191_ == 5);
				curEvent = null;

			} else if (cond.equals('䳧')) {
				curEvent = '䳧';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: short getLastCellNum()> */
				short v_160_ = (short) getVarValue(getOutVar('㓻', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int '-349315241_i17_LOOPVAR__0'()> */
				int v_127_ = (int) getVarValue(getOutVar('㠰', "ret"));
				satisfies = (Not(v_160_ <= v_127_));
				curEvent = null;

			} else if (cond.equals('㓭')) {
				curEvent = '㓭';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hpsf.DocumentSummaryInformation getDocumentSummaryInformation()> */
				org.apache.poi.hpsf.DocumentSummaryInformation v_26_ = (org.apache.poi.hpsf.DocumentSummaryInformation) getVarValue(getOutVar('䢰', "ret"));
				satisfies = (v_26_ == null);
				curEvent = null;

			} else if (cond.equals('䛮')) {
				curEvent = '䛮';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getFirstRowNum()> */
				int v_169_ = (int) getVarValue(getOutVar('㷓', "ret"));
				satisfies = (false);
				curEvent = null;

			} else if (cond.equals('䫲')) {
				curEvent = '䫲';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllNames()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_38_ = (boolean) getVarValue(getOutVar('㝤', "ret"));
				satisfies = (Not(v_38_ == false));
				curEvent = null;

			} else if (cond.equals('㻷')) {
				curEvent = '㻷';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean isSelected()> */
				boolean v_101_ = (boolean) getVarValue(getOutVar('㦼', "ret"));
				satisfies = (Not(v_101_ == false));
				curEvent = null;

			} else if (cond.equals('䋸')) {
				curEvent = '䋸';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getPhysicalNumberOfCells()> */
				int v_113_ = (int) getVarValue(getOutVar('䒸', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int 769713174_i3_LOOPVAR__0()> */
				int v_15_ = (int) getVarValue(getOutVar('䡳', "ret"));
				satisfies = (v_113_ <= v_15_);
				curEvent = null;

			} else if (cond.equals('㔀')) {
				curEvent = '㔀';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator cellIterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_17_ = (boolean) getVarValue(getOutVar('䚮', "ret"));
				satisfies = (v_17_ == false);
				curEvent = null;

			} else if (cond.equals('䤁')) {
				curEvent = '䤁';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: short getLastCellNum()> */
				short v_160_ = (short) getVarValue(getOutVar('㓻', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: short getFirstCellNum()> */
				short v_99_ = (short) getVarValue(getOutVar('䤠', "ret"));
				satisfies = (v_99_ <= v_160_);
				curEvent = null;

			} else if (cond.equals('㴂')) {
				curEvent = '㴂';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1723658275_i3_LOOPVAR__0'()> */
				int v_77_ = (int) getVarValue(getOutVar('㼰', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getPhysicalNumberOfRows()> */
				int v_78_ = (int) getVarValue(getOutVar('䱘', "ret"));
				satisfies = (v_78_ <= v_77_);
				curEvent = null;

			} else if (cond.equals('㔄')) {
				curEvent = '㔄';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getPhysicalNumberOfCells()> */
				int v_113_ = (int) getVarValue(getOutVar('䒸', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int '-408173640_i3_LOOPVAR__0'()> */
				int v_150_ = (int) getVarValue(getOutVar('䥲', "ret"));
				satisfies = (Not(v_113_ <= v_150_));
				curEvent = null;

			} else if (cond.equals('㔎')) {
				curEvent = '㔎';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (v_191_ == 0 || v_191_ == 1 || v_191_ == 2 || v_191_ == 3 || v_191_ == 4 || v_191_ == 5);
				curEvent = null;

			} else if (cond.equals('㴑')) {
				curEvent = '㴑';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getFirstRowNum()> */
				int v_169_ = (int) getVarValue(getOutVar('㷓', "ret"));
				satisfies = (true);
				curEvent = null;

			} else if (cond.equals('㤓')) {
				curEvent = '㤓';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: org.apache.poi.hpsf.SummaryInformation getSummaryInformation()> */
				org.apache.poi.hpsf.SummaryInformation v_23_ = (org.apache.poi.hpsf.SummaryInformation) getVarValue(getOutVar('㯜', "ret"));
				satisfies = (Not(v_23_ == null));
				curEvent = null;

			} else if (cond.equals('㴛')) {
				curEvent = '㴛';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getPhysicalNumberOfCells()> */
				int v_113_ = (int) getVarValue(getOutVar('䒸', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int 769713174_i3_LOOPVAR__0()> */
				int v_15_ = (int) getVarValue(getOutVar('䡳', "ret"));
				satisfies = (Not(v_113_ <= v_15_));
				curEvent = null;

			} else if (cond.equals('䴣')) {
				curEvent = '䴣';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int 817111887_i3_LOOPVAR__0()> */
				int v_20_ = (int) getVarValue(getOutVar('㫈', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getNumMergedRegions()> */
				int v_107_ = (int) getVarValue(getOutVar('㟱', "ret"));
				satisfies = (Not(v_107_ <= v_20_));
				curEvent = null;

			} else if (cond.equals('㼲')) {
				curEvent = '㼲';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: org.apache.poi.hssf.usermodel.HSSFCell getCell(int)> */
				org.apache.poi.hssf.usermodel.HSSFCell v_25_ = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(getOutVar('㱖', "ret"));
				satisfies = (v_25_ == null);
				curEvent = null;

			} else if (cond.equals('䜲')) {
				curEvent = '䜲';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getRowNum()> */
				int v_2_ = (int) getVarValue(getOutVar('䖈', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getFirstRowNum()> */
				int v_169_ = (int) getVarValue(getOutVar('㷓', "ret"));
				satisfies = (Not(v_169_ <= v_2_));
				curEvent = null;

			} else if (cond.equals('䬾')) {
				curEvent = '䬾';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumCellStyles()> */
				int v_40_ = (int) getVarValue(getOutVar('䏴', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-132863308_i1_LOOPVAR__0'()> */
				int v_145_ = (int) getVarValue(getOutVar('䆽', "ret"));
				satisfies = (v_40_ <= v_145_);
				curEvent = null;

			} else if (cond.equals('㽆')) {
				curEvent = '㽆';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()> */
				int v_80_ = (int) getVarValue(getOutVar('䱱', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_181_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (Not(v_181_ <= v_80_));
				curEvent = null;

			} else if (cond.equals('㽈')) {
				curEvent = '㽈';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int 1919584218_i8_LOOPVAR__0()> */
				int v_115_ = (int) getVarValue(getOutVar('㘁', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getNumMergedRegions()> */
				int v_107_ = (int) getVarValue(getOutVar('㟱', "ret"));
				satisfies = (Not(v_107_ <= v_115_));
				curEvent = null;

			} else if (cond.equals('䕟')) {
				curEvent = '䕟';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-1068512734_i1_LOOPVAR__0'()> */
				int v_80_ = (int) getVarValue(getOutVar('䱱', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_181_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (v_181_ <= v_80_);
				curEvent = null;

			} else if (cond.equals('䵤')) {
				curEvent = '䵤';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllEmbeddedObjects()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_216_ = (boolean) getVarValue(getOutVar('䯓', "ret"));
				satisfies = (Not(v_216_ == false));
				curEvent = null;

			} else if (cond.equals('㥪')) {
				curEvent = '㥪';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (v_191_ == 2);
				curEvent = null;

			} else if (cond.equals('㥭')) {
				curEvent = '㥭';
				/* <org.apache.poi.hssf.usermodel.HSSFCellStyle: org.apache.poi.ss.usermodel.FillPatternType getFillPatternEnum()> */
				org.apache.poi.ss.usermodel.FillPatternType v_129_ = (org.apache.poi.ss.usermodel.FillPatternType) getVarValue(getOutVar('䌮', "ret"));
				satisfies = (v_129_ == null);
				curEvent = null;

			} else if (cond.equals('㽵')) {
				curEvent = '㽵';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-2147104415_i20_LOOPVAR__0'()> */
				int v_44_ = (int) getVarValue(getOutVar('䈛', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getPhysicalNumberOfRows()> */
				int v_78_ = (int) getVarValue(getOutVar('䱘', "ret"));
				satisfies = (v_78_ <= v_44_);
				curEvent = null;

			} else if (cond.equals('㽻')) {
				curEvent = '㽻';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1868684984_i7_LOOPVAR__0'()> */
				int v_60_ = (int) getVarValue(getOutVar('䝧', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getNumMergedRegions()> */
				int v_107_ = (int) getVarValue(getOutVar('㟱', "ret"));
				satisfies = (Not(v_107_ <= v_60_));
				curEvent = null;

			} else if (cond.equals('䕽')) {
				curEvent = '䕽';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (v_191_ == 3);
				curEvent = null;

			} else if (cond.equals('㝾')) {
				curEvent = '㝾';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int 1672575026_i1_LOOPVAR__0()> */
				int v_141_ = (int) getVarValue(getOutVar('䫨', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfFonts()> */
				int v_144_ = (int) getVarValue(getOutVar('䝺', "ret"));
				satisfies = (Not(v_144_ <= v_141_));
				curEvent = null;

			} else if (cond.equals('䥾')) {
				curEvent = '䥾';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFWorkbook getWorkbook()> */
				org.apache.poi.hssf.usermodel.HSSFWorkbook v_84_ = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(getOutVar('㫿', "ret"));
				satisfies = (true);
				curEvent = null;

			} else if (cond.equals('䶍')) {
				curEvent = '䶍';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_241_ = (boolean) getVarValue(getOutVar('㿂', "ret"));
				satisfies = (Not(v_241_ == false));
				curEvent = null;

			} else if (cond.equals('㾗')) {
				curEvent = '㾗';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllPictures()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_64_ = (boolean) getVarValue(getOutVar('㓁', "ret"));
				satisfies = (v_64_ == false);
				curEvent = null;

			} else if (cond.equals('㖜')) {
				curEvent = '㖜';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (v_191_ == 0);
				curEvent = null;

			} else if (cond.equals('㮜')) {
				curEvent = '㮜';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllPictures()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_64_ = (boolean) getVarValue(getOutVar('㓁', "ret"));
				satisfies = (Not(v_64_ == false));
				curEvent = null;

			} else if (cond.equals('䎜')) {
				curEvent = '䎜';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: boolean <org.apache.poi.hssf.usermodel.HSSFRow: java.util.Iterator cellIterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_17_ = (boolean) getVarValue(getOutVar('䚮', "ret"));
				satisfies = (Not(v_17_ == false));
				curEvent = null;

			} else if (cond.equals('㾝')) {
				curEvent = '㾝';
				/* <org.apache.poi.hssf.usermodel.HSSFObjectData: org.apache.poi.poifs.filesystem.DirectoryEntry getDirectory()> */
				org.apache.poi.poifs.filesystem.DirectoryEntry v_11_ = (org.apache.poi.poifs.filesystem.DirectoryEntry) getVarValue(getOutVar('䓓', "ret"));
				satisfies = (Not(v_11_ == null));
				curEvent = null;

			} else if (cond.equals('㾡')) {
				curEvent = '㾡';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int '-349315241_i15_LOOPVAR__0'()> */
				int v_174_ = (int) getVarValue(getOutVar('㓜', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getNumberOfSheets()> */
				int v_181_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (Not(v_181_ <= v_174_));
				curEvent = null;

			} else if (cond.equals('䦤')) {
				curEvent = '䦤';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: int getSheetIndex(java.lang.String)> */
				int v_36_ = (int) getVarValue(getOutVar('䃙', "ret"));
				satisfies = (Not(0 <= v_36_));
				curEvent = null;

			} else if (cond.equals('㶯')) {
				curEvent = '㶯';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int '-1868684984_i7_LOOPVAR__0'()> */
				int v_60_ = (int) getVarValue(getOutVar('䝧', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getNumMergedRegions()> */
				int v_107_ = (int) getVarValue(getOutVar('㟱', "ret"));
				satisfies = (v_107_ <= v_60_);
				curEvent = null;

			} else if (cond.equals('䶯')) {
				curEvent = '䶯';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: org.apache.poi.hssf.usermodel.HSSFCell getCell(int)> */
				org.apache.poi.hssf.usermodel.HSSFCell v_25_ = (org.apache.poi.hssf.usermodel.HSSFCell) getVarValue(getOutVar('㱖', "ret"));
				satisfies = (Not(v_25_ == null));
				curEvent = null;

			} else if (cond.equals('䞱')) {
				curEvent = '䞱';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator rowIterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_219_ = (boolean) getVarValue(getOutVar('䐺', "ret"));
				satisfies = (v_219_ == false);
				curEvent = null;

			} else if (cond.equals('䎸')) {
				curEvent = '䎸';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (Not(v_191_ == 0));
				curEvent = null;

			} else if (cond.equals('䞻')) {
				curEvent = '䞻';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (Not(v_191_ == 5));
				curEvent = null;

			} else if (cond.equals('䎿')) {
				curEvent = '䎿';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_6_ = (boolean) getVarValue(getOutVar('㛵', "ret"));
				satisfies = (v_6_ == false);
				curEvent = null;

			} else if (cond.equals('䏆')) {
				curEvent = '䏆';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: org.apache.poi.hssf.usermodel.HSSFWorkbook getWorkbook()> */
				org.apache.poi.hssf.usermodel.HSSFWorkbook v_84_ = (org.apache.poi.hssf.usermodel.HSSFWorkbook) getVarValue(getOutVar('㫿', "ret"));
				satisfies = (false);
				curEvent = null;

			} else if (cond.equals('䗌')) {
				curEvent = '䗌';
				/* <org.apache.poi.hssf.model.InternalWorkbook: int getNumNames()> */
				int v_142_ = (int) getVarValue(getOutVar('䲹', "ret"));
				/* <org.apache.poi.hssf.model.InternalWorkbook: int 1814324863_i12_LOOPVAR__0()> */
				int v_51_ = (int) getVarValue(getOutVar('㘘', "ret"));
				satisfies = (v_142_ <= v_51_);
				curEvent = null;

			} else if (cond.equals('䏑')) {
				curEvent = '䏑';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getRowNum()> */
				int v_2_ = (int) getVarValue(getOutVar('䖈', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getFirstRowNum()> */
				int v_169_ = (int) getVarValue(getOutVar('㷓', "ret"));
				satisfies = (v_169_ <= v_2_);
				curEvent = null;

			} else if (cond.equals('䇕')) {
				curEvent = '䇕';
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: boolean <org.apache.poi.hssf.usermodel.HSSFSheet: java.util.Iterator rowIterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_219_ = (boolean) getVarValue(getOutVar('䐺', "ret"));
				satisfies = (Not(v_219_ == false));
				curEvent = null;

			} else if (cond.equals('㧚')) {
				curEvent = '㧚';
				/* <org.apache.poi.hssf.usermodel.HSSFObjectData: boolean hasDirectoryEntry()> */
				boolean v_139_ = (boolean) getVarValue(getOutVar('㸄', "ret"));
				satisfies = (Not(v_139_ == false));
				curEvent = null;

			} else if (cond.equals('㧸')) {
				curEvent = '㧸';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: int getCellType()> */
				int v_191_ = (int) getVarValue(getOutVar('䱐', "ret"));
				satisfies = (v_191_ == 1);
				curEvent = null;

			} else if (cond.equals('䗸')) {
				curEvent = '䗸';
				/* <org.apache.poi.hssf.usermodel.HSSFRow: int getRowNum()> */
				int v_2_ = (int) getVarValue(getOutVar('䖈', "ret"));
				/* <org.apache.poi.hssf.usermodel.HSSFSheet: int getLastRowNum()> */
				int v_147_ = (int) getVarValue(getOutVar('䂞', "ret"));
				satisfies = (v_2_ <= v_147_);
				curEvent = null;

			} else if (cond.equals('㿼')) {
				curEvent = '㿼';
				/* <org.apache.poi.hssf.usermodel.HSSFPalette: org.apache.poi.hssf.util.HSSFColor findColor(byte,byte,byte)> */
				org.apache.poi.hssf.util.HSSFColor v_0_ = (org.apache.poi.hssf.util.HSSFColor) getVarValue(getOutVar('㜶', "ret"));
				satisfies = (Not(v_0_ == null));
				curEvent = null;

			} else if (cond.equals('䯼')) {
				curEvent = '䯼';
				/* <org.apache.poi.hssf.usermodel.HSSFCell: java.lang.String getStringCellValue()> */
				java.lang.String v_237_ = (java.lang.String) getVarValue(getOutVar('䗘', "ret"));
				satisfies = (v_237_ == null);
				curEvent = null;

			} else if (cond.equals('䏽')) {
				curEvent = '䏽';
				/* <org.apache.poi.hssf.usermodel.HSSFPatriarch: boolean <org.apache.poi.hssf.usermodel.HSSFPatriarch: java.util.List getChildren()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_70_ = (boolean) getVarValue(getOutVar('㙃', "ret"));
				satisfies = (v_70_ == false);
				curEvent = null;

			} else if (cond.equals('㟾')) {
				curEvent = '㟾';
				/* <org.apache.poi.hssf.usermodel.HSSFWorkbook: boolean <org.apache.poi.hssf.usermodel.HSSFWorkbook: java.util.List getAllEmbeddedObjects()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_216_ = (boolean) getVarValue(getOutVar('䯓', "ret"));
				satisfies = (v_216_ == false);
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

				} catch (Exception | java.lang.AssertionError t) {
					if (t instanceof HarnessException)
						System.out.println("Catched a HarnessException: " + t);
					else
						System.out.println("Catched a Exception | java.lang.AssertionError: " + t);

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

					} catch (Exception | java.lang.AssertionError t) {
						if (t instanceof HarnessException)
							System.out.println("Catched a HarnessException: " + t);
						else
							System.out.println("Catched a Exception | java.lang.AssertionError: " + t);

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

		} catch (Exception | java.lang.AssertionError t) {
			String str = harness.getFailedString();
			//System.out.println("Run stopped since \"" + str + "\" failed caused by " + t);
			//if (debug)
			//	t.printStackTrace();
            com.fuzz.ExpCollector.addNewCrash(t);
			
		}

	}


	/*
	public static void fuzzerTestOneInput(com.code_intelligence.jazzer.api.FuzzedDataProvider data) {
		// used for chaining and iterating every cfpick per fuzzing iteration

		long allNum = harness.cfPicks.getAllChoiceNum();

		long dfNO = (long) data.consumeInt();

		InputStream inStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputs(cfNO, dfNO, data));
		inStream.mark(0);

		if (! inStream.markSupported()) {
			throw new RuntimeException("mark is not supported");
		}

		for (long cfNO = 0; cfNO < allNum; cfNO++) {
			try {
				System.out.println("run cfNO: " + cfNO + ", dfNO: " + dfNO);

				inStream.reset();

				String errorString = harness.resetAllPicks(cfNO, dfNO);
				if (errorString != null) {
					System.out.println("Run stopped since \"" + errorString + "\" failed caused by unsatisfied data dep");
					continue;
				}

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

			} catch (Throwable t) {
				String str = harness.getFailedString();
				System.out.println("Run stopped since \"" + str + "\" failed caused by " + t);
				if (debug)
					t.printStackTrace();

			}
		}
	}
	*/

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
} catch (Throwable t) {
	t.printStackTrace();
	throw new RuntimeException("catched throwable " + t + " during the execution");
}
*/
