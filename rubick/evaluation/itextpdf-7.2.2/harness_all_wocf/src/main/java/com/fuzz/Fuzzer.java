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

			if (nextCall.equals('㸁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: byte[] computeUserPassword()> ");
				curEvent = '㸁';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.computeUserPassword();
				curEvent = null;

			} else if (nextCall.equals('㲁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isOpenedWithFullPermission()> ");
				curEvent = '㲁';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOpenedWithFullPermission();
				curEvent = null;

			} else if (nextCall.equals('㯃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfString getLang()> ");
				curEvent = '㯃';
				com.itextpdf.kernel.pdf.PdfString ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLang();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.font.PdfFont getDefaultFont()> ");
				curEvent = '㙄';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDefaultFont();
				curEvent = null;

			} else if (nextCall.equals('䙄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfOutline getOutlines(boolean)> ");
				curEvent = '䙄';
				com.itextpdf.kernel.pdf.PdfOutline ret;
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOutlines(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasHybridXref()> ");
				curEvent = '㲆';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasHybridXref();
				curEvent = null;

			} else if (nextCall.equals('䳇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfCatalog getCatalog()> ");
				curEvent = '䳇';
				com.itextpdf.kernel.pdf.PdfCatalog ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCatalog();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟈')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfString getOriginalDocumentId()> ");
				curEvent = '䟈';
				com.itextpdf.kernel.pdf.PdfString ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOriginalDocumentId();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: com.itextpdf.kernel.pdf.PdfAConformanceLevel getPdfAConformanceLevel()> ");
				curEvent = '㺉';
				com.itextpdf.kernel.pdf.PdfAConformanceLevel ret;
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfAConformanceLevel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isEncrypted()> ");
				curEvent = '䌉';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('䯉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfDictionary getTrailer()> ");
				curEvent = '䯉';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getTrailer();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfDocument getDocument()> ");
				curEvent = '䁋';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocument();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getPageSizeWithRotation()> ");
				curEvent = '㜐';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPageSizeWithRotation();
				curEvent = null;

			} else if (nextCall.equals('㶐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: long getFileLength()> ");
				curEvent = '㶐';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileLength();
				curEvent = null;

			} else if (nextCall.equals('䧐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.geom.PageSize getDefaultPageSize()> ");
				curEvent = '䧐';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDefaultPageSize();
				curEvent = null;

			} else if (nextCall.equals('䓕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> ");
				curEvent = '䓕';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNumberOfPages();
				curEvent = null;

			} else if (nextCall.equals('䢗')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getFirstPage()> ");
				curEvent = '䢗';
				com.itextpdf.kernel.pdf.PdfPage ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFirstPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.tagging.PdfStructTreeRoot getStructTreeRoot()> ");
				curEvent = '㹘';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStructTreeRoot();
				curEvent = null;

			} else if (nextCall.equals('䱙')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void <init>()> ");
				curEvent = '䱙';
				com.itextpdf.kernel.pdf.PdfStream ret;
				ret = new com.itextpdf.kernel.pdf.PdfStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲙')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: boolean isTagged()> ");
				curEvent = '䲙';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isTagged();
				curEvent = null;

			} else if (nextCall.equals('䘚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void close()> ");
				curEvent = '䘚';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('㥛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: java.util.List listIndirectReferences()> ");
				curEvent = '㥛';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.listIndirectReferences();
				curEvent = null;

			} else if (nextCall.equals('䯛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void close()> ");
				curEvent = '䯛';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䝜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.collection.PdfCollection getCollection()> ");
				curEvent = '䝜';
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCollection();
				curEvent = null;

			} else if (nextCall.equals('㪟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: int getCryptoMode()> ");
				curEvent = '㪟';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCryptoMode();
				curEvent = null;

			} else if (nextCall.equals('䗟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: java.lang.String[] getPageLabels()> ");
				curEvent = '䗟';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPageLabels();
				curEvent = null;

			} else if (nextCall.equals('㽠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.DocumentProperties: void <init>()> ");
				curEvent = '㽠';
				new com.itextpdf.kernel.pdf.DocumentProperties();
				curEvent = null;

			} else if (nextCall.equals('㴡')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.StampingProperties: void <init>()> ");
				curEvent = '㴡';
				com.itextpdf.kernel.pdf.StampingProperties ret;
				ret = new com.itextpdf.kernel.pdf.StampingProperties();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: byte[] getXmpMetadata()> ");
				curEvent = '㫣';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getXmpMetadata();
				curEvent = null;

			} else if (nextCall.equals('䧣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfDocumentInfo getDocumentInfo()> ");
				curEvent = '䧣';
				com.itextpdf.kernel.pdf.PdfDocumentInfo ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡤')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfViewerPreferences: void <init>()> ");
				curEvent = '㡤';
				com.itextpdf.kernel.pdf.PdfViewerPreferences ret;
				ret = new com.itextpdf.kernel.pdf.PdfViewerPreferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasXrefStm()> ");
				curEvent = '䅦';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasXrefStm();
				curEvent = null;

			} else if (nextCall.equals('㮧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.StampingProperties: com.itextpdf.kernel.pdf.StampingProperties preserveEncryption()> ");
				curEvent = '㮧';
				com.itextpdf.kernel.pdf.StampingProperties ret;
				com.itextpdf.kernel.pdf.StampingProperties cls = (com.itextpdf.kernel.pdf.StampingProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.preserveEncryption();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䮨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: void <init>()> ");
				curEvent = '䮨';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				ret = new com.itextpdf.kernel.pdf.PdfDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㿪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfWriter getWriter()> ");
				curEvent = '㿪';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getWriter();
				curEvent = null;

			} else if (nextCall.equals('㽫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isCloseStream()> ");
				curEvent = '㽫';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isCloseStream();
				curEvent = null;

			} else if (nextCall.equals('䳭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfVersion getPdfVersion()> ");
				curEvent = '䳭';
				com.itextpdf.kernel.pdf.PdfVersion ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfVersion();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲯')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasRebuiltXref()> ");
				curEvent = '䲯';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasRebuiltXref();
				curEvent = null;

			} else if (nextCall.equals('㛯')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfResources: void <init>()> ");
				curEvent = '㛯';
				com.itextpdf.kernel.pdf.PdfResources ret;
				ret = new com.itextpdf.kernel.pdf.PdfResources();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䛱')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfViewerPreferences getViewerPreferences()> ");
				curEvent = '䛱';
				com.itextpdf.kernel.pdf.PdfViewerPreferences ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getViewerPreferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getRotation()> ");
				curEvent = '㒵';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getRotation();
				curEvent = null;

			} else if (nextCall.equals('䍶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: byte[] getContentBytes()> ");
				curEvent = '䍶';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContentBytes();
				curEvent = null;

			} else if (nextCall.equals('㖷')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void <init>(com.itextpdf.kernel.pdf.PdfReader)> ");
				curEvent = '㖷';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfReader arg0 = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfDocument(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(java.io.InputStream)> ");
				curEvent = '䋺';
				com.itextpdf.kernel.pdf.PdfReader ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓼')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfArray getAssociatedFiles()> ");
				curEvent = '䓼';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAssociatedFiles();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㘽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> ");
				curEvent = '㘽';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNumberOfPdfObjects();
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

			{
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

			} catch (Exception | java.lang.AssertionError  t) {
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
} catch (Exception | java.lang.AssertionError  t) {
	t.printStackTrace();
	throw new RuntimeException("catched throwable " + t + " during the execution");
}
*/
