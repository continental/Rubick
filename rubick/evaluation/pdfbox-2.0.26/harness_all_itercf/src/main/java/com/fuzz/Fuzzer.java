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
		vars.put("constant-new byte[1024]", new byte[1024]);


	}

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	@Override
	protected void runNextCall(Character nextCall) throws HarnessException {
		try {

			if (nextCall.equals('䴄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript: void <init>()> ");
				curEvent = '䴄';
				org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘌')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: boolean isEncryptMetaData()> ");
				curEvent = '䘌';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncryptMetaData();
				curEvent = null;

			} else if (nextCall.equals('䠕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm()> ");
				curEvent = '䠕';
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAcroForm();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌙')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '䌙';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䨜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDMetadata: java.io.InputStream exportXMPMetadata()> ");
				curEvent = '䨜';
				org.apache.pdfbox.pdmodel.common.PDMetadata cls = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.exportXMPMetadata();
				curEvent = null;

			} else if (nextCall.equals('䨟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo getMarkInfo()> ");
				curEvent = '䨟';
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMarkInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDPageLabels getPageLabels()> ");
				curEvent = '䤦';
				org.apache.pdfbox.pdmodel.common.PDPageLabels ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageLabels();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()> ");
				curEvent = '㠨';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.PDEncryption getEncryption()> ");
				curEvent = '䠭';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEncryption();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠮')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentInformation getDocumentInformation()> ");
				curEvent = '䠮';
				org.apache.pdfbox.pdmodel.PDDocumentInformation ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentInformation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤯')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getCreator()> ");
				curEvent = '䤯';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCreator();
				curEvent = null;

			} else if (nextCall.equals('㨲')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: org.apache.pdfbox.pdmodel.encryption.PDCryptFilterDictionary getDefaultCryptFilterDictionary()> ");
				curEvent = '㨲';
				org.apache.pdfbox.pdmodel.encryption.PDCryptFilterDictionary ret;
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDefaultCryptFilterDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()> ");
				curEvent = '㨵';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR__0()> ");
				curEvent = '䰷';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤼')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: boolean hasSecurityHandler()> ");
				curEvent = '㤼';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasSecurityHandler();
				curEvent = null;

			} else if (nextCall.equals('㸾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.lang.String getLanguage()> ");
				curEvent = '㸾';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLanguage();
				curEvent = null;

			} else if (nextCall.equals('䀿')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPageTree getPages()> ");
				curEvent = '䀿';
				org.apache.pdfbox.pdmodel.PDPageTree ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTrapped()> ");
				curEvent = '㡄';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTrapped();
				curEvent = null;

			} else if (nextCall.equals('䡋')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: void <init>()> ");
				curEvent = '䡋';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥌')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDMetadata getMetadata()> ");
				curEvent = '䥌';
				org.apache.pdfbox.pdmodel.common.PDMetadata ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMetadata();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.AccessPermission getCurrentAccessPermission()> ");
				curEvent = '䅎';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCurrentAccessPermission();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int getCount()> ");
				curEvent = '䉎';
				int ret;
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCount();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䍏')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: java.io.InputStream getContents()> ");
				curEvent = '䍏';
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContents();
				curEvent = null;

			} else if (nextCall.equals('䱚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDMetadata: byte[] toByteArray()> ");
				curEvent = '䱚';
				org.apache.pdfbox.pdmodel.common.PDMetadata cls = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toByteArray();
				curEvent = null;

			} else if (nextCall.equals('㩣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractContent()> ");
				curEvent = '㩣';
				boolean ret;
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.canExtractContent();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canModify()> ");
				curEvent = '䝨';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canModify();
				curEvent = null;

			} else if (nextCall.equals('㭯')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()> ");
				curEvent = '㭯';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.PageLayout getPageLayout()> ");
				curEvent = '㥷';
				org.apache.pdfbox.pdmodel.PageLayout ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageLayout();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㵼')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractForAccessibility()> ");
				curEvent = '㵼';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canExtractForAccessibility();
				curEvent = null;

			} else if (nextCall.equals('䑿')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: boolean isEncrypted()> ");
				curEvent = '䑿';
				boolean ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEncrypted();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊂')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void <init>()> ");
				curEvent = '䊂';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				ret = new org.apache.pdfbox.pdmodel.PDDocument();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚆')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canPrintDegraded()> ");
				curEvent = '㚆';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canPrintDegraded();
				curEvent = null;

			} else if (nextCall.equals('㢉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTitle()> ");
				curEvent = '㢉';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTitle();
				curEvent = null;

			} else if (nextCall.equals('㺉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentCatalog getDocumentCatalog()> ");
				curEvent = '㺉';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentCatalog();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖐')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPage getPage(int)> ");
				curEvent = '䖐';
				org.apache.pdfbox.pdmodel.PDPage ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䶗')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䶗';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline getDocumentOutline()> ");
				curEvent = '䖘';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentOutline();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: void <init>()> ");
				curEvent = '䊚';
				org.apache.pdfbox.pdmodel.PDPage ret;
				ret = new org.apache.pdfbox.pdmodel.PDPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪝')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: java.lang.String getFilter()> ");
				curEvent = '㪝';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFilter();
				curEvent = null;

			} else if (nextCall.equals('㪞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()> ");
				curEvent = '㪞';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䞣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getProducer()> ");
				curEvent = '䞣';
				java.lang.String ret;
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getProducer();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶤')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean isReadOnly()> ");
				curEvent = '㶤';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isReadOnly();
				curEvent = null;

			} else if (nextCall.equals('䞩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()> ");
				curEvent = '䞩';
				java.util.Iterator ret;
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㮬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.PageMode getPageMode()> ");
				curEvent = '㮬';
				org.apache.pdfbox.pdmodel.PageMode ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageMode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㞰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getKeywords()> ");
				curEvent = '㞰';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getKeywords();
				curEvent = null;

			} else if (nextCall.equals('䒴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getAuthor()> ");
				curEvent = '䒴';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAuthor();
				curEvent = null;

			} else if (nextCall.equals('㦵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: void <init>()> ");
				curEvent = '㦵';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canAssembleDocument()> ");
				curEvent = '䢶';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canAssembleDocument();
				curEvent = null;

			} else if (nextCall.equals('㪺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: org.apache.pdfbox.cos.COSName getStreamFilterName()> ");
				curEvent = '㪺';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStreamFilterName();
				curEvent = null;

			} else if (nextCall.equals('䃁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.SecurityProvider: java.security.Provider getProvider()> ");
				curEvent = '䃁';
				org.apache.pdfbox.pdmodel.encryption.SecurityProvider.getProvider();
				curEvent = null;

			} else if (nextCall.equals('㧈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㧈';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟓')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR_<org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䟓';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧔')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean isOwnerPermission()> ");
				curEvent = '䧔';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOwnerPermission();
				curEvent = null;

			} else if (nextCall.equals('䟗')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: boolean <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '䟗';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getSubject()> ");
				curEvent = '㻛';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSubject();
				curEvent = null;

			} else if (nextCall.equals('㻝')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㻝';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void close()> ");
				curEvent = '䣞';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('㗟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: java.lang.Object <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '㗟';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗢')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream)> ");
				curEvent = '䗢';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getModificationDate()> ");
				curEvent = '㣦';
				java.util.Calendar ret;
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getModificationDate();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()> ");
				curEvent = '㗬';
				java.util.List ret;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnnotations();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䯬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> ");
				curEvent = '䯬';
				int ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canFillInForm()> ");
				curEvent = '䃵';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canFillInForm();
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

			if (cond.equals('㰈')) {
				curEvent = '㰈';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()> */
				int v_92_ = (int) getVarValue(getOutVar('㪞', "ret"));
				satisfies = (v_92_ <= v_170_);
				curEvent = null;

			} else if (cond.equals('䰉')) {
				curEvent = '䰉';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()> */
				int v_14_ = (int) getVarValue(getOutVar('㭯', "ret"));
				satisfies = (v_170_ <= v_14_);
				curEvent = null;

			} else if (cond.equals('䴉')) {
				curEvent = '䴉';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.AccessPermission getCurrentAccessPermission()> */
				org.apache.pdfbox.pdmodel.encryption.AccessPermission v_169_ = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(getOutVar('䅎', "ret"));
				satisfies = (v_169_ == null);
				curEvent = null;

			} else if (cond.equals('䘉')) {
				curEvent = '䘉';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int getCount()> */
				int v_162_ = (int) getVarValue(getOutVar('䉎', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()> */
				int v_13_ = (int) getVarValue(getOutVar('㨵', "ret"));
				satisfies = (Not(v_13_ <= v_162_));
				curEvent = null;

			} else if (cond.equals('㬉')) {
				curEvent = '㬉';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.PDEncryption getEncryption()> */
				org.apache.pdfbox.pdmodel.encryption.PDEncryption v_231_ = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(getOutVar('䠭', "ret"));
				satisfies = (Not(v_231_ == null));
				curEvent = null;

			} else if (cond.equals('䘜')) {
				curEvent = '䘜';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: boolean <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_43_ = (boolean) getVarValue(getOutVar('䟗', "ret"));
				satisfies = (v_43_ == false);
				curEvent = null;

			} else if (cond.equals('㜦')) {
				curEvent = '㜦';
				/* <org.apache.pdfbox.pdmodel.PDDocument: boolean isEncrypted()> */
				boolean v_73_ = (boolean) getVarValue(getOutVar('䑿', "ret"));
				satisfies = (Not(v_73_ == false));
				curEvent = null;

			} else if (cond.equals('㜪')) {
				curEvent = '㜪';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.AccessPermission getCurrentAccessPermission()> */
				org.apache.pdfbox.pdmodel.encryption.AccessPermission v_169_ = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(getOutVar('䅎', "ret"));
				satisfies = (Not(v_169_ == null));
				curEvent = null;

			} else if (cond.equals('䍇')) {
				curEvent = '䍇';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream)> */
				org.apache.pdfbox.pdmodel.PDDocument v_190_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䗢', "ret"));
				satisfies = (Not(v_190_ == null));
				curEvent = null;

			} else if (cond.equals('㽑')) {
				curEvent = '㽑';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream)> */
				org.apache.pdfbox.pdmodel.PDDocument v_190_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䗢', "ret"));
				satisfies = (v_190_ == null);
				curEvent = null;

			} else if (cond.equals('䩓')) {
				curEvent = '䩓';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentInformation getDocumentInformation()> */
				org.apache.pdfbox.pdmodel.PDDocumentInformation v_115_ = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(getOutVar('䠮', "ret"));
				satisfies = (v_115_ == null);
				curEvent = null;

			} else if (cond.equals('㵔')) {
				curEvent = '㵔';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getProducer()> */
				java.lang.String v_130_ = (java.lang.String) getVarValue(getOutVar('䞣', "ret"));
				satisfies = (Not(v_130_ == null));
				curEvent = null;

			} else if (cond.equals('㡝')) {
				curEvent = '㡝';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getProducer()> */
				java.lang.String v_130_ = (java.lang.String) getVarValue(getOutVar('䞣', "ret"));
				satisfies = (v_130_ == null);
				curEvent = null;

			} else if (cond.equals('䥲')) {
				curEvent = '䥲';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()> */
				int v_75_ = (int) getVarValue(getOutVar('㠨', "ret"));
				satisfies = (Not(v_170_ <= v_75_));
				curEvent = null;

			} else if (cond.equals('䍳')) {
				curEvent = '䍳';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentCatalog getDocumentCatalog()> */
				org.apache.pdfbox.pdmodel.PDDocumentCatalog v_286_ = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(getOutVar('㺉', "ret"));
				satisfies = (Not(v_286_ == null));
				curEvent = null;

			} else if (cond.equals('䦇')) {
				curEvent = '䦇';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int getCount()> */
				int v_162_ = (int) getVarValue(getOutVar('䉎', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()> */
				int v_13_ = (int) getVarValue(getOutVar('㨵', "ret"));
				satisfies = (v_13_ <= v_162_);
				curEvent = null;

			} else if (cond.equals('䶒')) {
				curEvent = '䶒';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentCatalog getDocumentCatalog()> */
				org.apache.pdfbox.pdmodel.PDDocumentCatalog v_286_ = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(getOutVar('㺉', "ret"));
				satisfies = (v_286_ == null);
				curEvent = null;

			} else if (cond.equals('䎗')) {
				curEvent = '䎗';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getModificationDate()> */
				java.util.Calendar v_226_ = (java.util.Calendar) getVarValue(getOutVar('㣦', "ret"));
				satisfies = (Not(v_226_ == null));
				curEvent = null;

			} else if (cond.equals('䒜')) {
				curEvent = '䒜';
				/* <org.apache.pdfbox.pdmodel.PDDocument: boolean isEncrypted()> */
				boolean v_73_ = (boolean) getVarValue(getOutVar('䑿', "ret"));
				satisfies = (v_73_ == false);
				curEvent = null;

			} else if (cond.equals('㾤')) {
				curEvent = '㾤';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDMetadata getMetadata()> */
				org.apache.pdfbox.pdmodel.common.PDMetadata v_251_ = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(getOutVar('䥌', "ret"));
				satisfies = (Not(v_251_ == null));
				curEvent = null;

			} else if (cond.equals('䪱')) {
				curEvent = '䪱';
				/* <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()> */
				java.util.List v_210_ = (java.util.List) getVarValue(getOutVar('㗬', "ret"));
				satisfies = (Not(v_210_ == null));
				curEvent = null;

			} else if (cond.equals('㲼')) {
				curEvent = '㲼';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()> */
				int v_75_ = (int) getVarValue(getOutVar('㠨', "ret"));
				satisfies = (v_170_ <= v_75_);
				curEvent = null;

			} else if (cond.equals('㓄')) {
				curEvent = '㓄';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()> */
				int v_92_ = (int) getVarValue(getOutVar('㪞', "ret"));
				satisfies = (Not(v_92_ <= v_170_));
				curEvent = null;

			} else if (cond.equals('䯆')) {
				curEvent = '䯆';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR__0()> */
				int v_288_ = (int) getVarValue(getOutVar('䰷', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				satisfies = (v_170_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䓐')) {
				curEvent = '䓐';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getModificationDate()> */
				java.util.Calendar v_226_ = (java.util.Calendar) getVarValue(getOutVar('㣦', "ret"));
				satisfies = (v_226_ == null);
				curEvent = null;

			} else if (cond.equals('㿔')) {
				curEvent = '㿔';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()> */
				int v_14_ = (int) getVarValue(getOutVar('㭯', "ret"));
				satisfies = (Not(v_170_ <= v_14_));
				curEvent = null;

			} else if (cond.equals('䛕')) {
				curEvent = '䛕';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: boolean <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_43_ = (boolean) getVarValue(getOutVar('䟗', "ret"));
				satisfies = (Not(v_43_ == false));
				curEvent = null;

			} else if (cond.equals('㗘')) {
				curEvent = '㗘';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDMetadata getMetadata()> */
				org.apache.pdfbox.pdmodel.common.PDMetadata v_251_ = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(getOutVar('䥌', "ret"));
				satisfies = (v_251_ == null);
				curEvent = null;

			} else if (cond.equals('䓙')) {
				curEvent = '䓙';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentInformation getDocumentInformation()> */
				org.apache.pdfbox.pdmodel.PDDocumentInformation v_115_ = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(getOutVar('䠮', "ret"));
				satisfies = (Not(v_115_ == null));
				curEvent = null;

			} else if (cond.equals('䛞')) {
				curEvent = '䛞';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR__0()> */
				int v_288_ = (int) getVarValue(getOutVar('䰷', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_170_ = (int) getVarValue(getOutVar('䯬', "ret"));
				satisfies = (Not(v_170_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㛡')) {
				curEvent = '㛡';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPage getPage(int)> */
				org.apache.pdfbox.pdmodel.PDPage v_121_ = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(getOutVar('䖐', "ret"));
				satisfies = (v_121_ == null);
				curEvent = null;

			} else if (cond.equals('䏡')) {
				curEvent = '䏡';
				/* <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractContent()> */
				boolean v_323_ = (boolean) getVarValue(getOutVar('㩣', "ret"));
				satisfies = (v_323_ == false);
				curEvent = null;

			} else if (cond.equals('䣦')) {
				curEvent = '䣦';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.PDEncryption getEncryption()> */
				org.apache.pdfbox.pdmodel.encryption.PDEncryption v_231_ = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(getOutVar('䠭', "ret"));
				satisfies = (v_231_ == null);
				curEvent = null;

			} else if (cond.equals('㫫')) {
				curEvent = '㫫';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPage getPage(int)> */
				org.apache.pdfbox.pdmodel.PDPage v_121_ = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(getOutVar('䖐', "ret"));
				satisfies = (Not(v_121_ == null));
				curEvent = null;

			} else if (cond.equals('䣲')) {
				curEvent = '䣲';
				/* <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()> */
				java.util.List v_210_ = (java.util.List) getVarValue(getOutVar('㗬', "ret"));
				satisfies = (v_210_ == null);
				curEvent = null;

			} else if (cond.equals('䗵')) {
				curEvent = '䗵';
				/* <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractContent()> */
				boolean v_323_ = (boolean) getVarValue(getOutVar('㩣', "ret"));
				satisfies = (Not(v_323_ == false));
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
        // used for chaining and iterating every cfpick per fuzzing iteration

        long allNum = harness.cfPicks.getAllChoiceNum();

        long dfNO = (long) data.consumeInt();

        InputStream inStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputs(0, dfNO, data));
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

                com.fuzz.ExpCollector.setCFNO(cfNO);

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
                //    t.printStackTrace();
                com.fuzz.ExpCollector.addNewCrash(t);

            }
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
