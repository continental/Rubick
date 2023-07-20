package com.fuzz;

import java.util.List;
import java.util.HashMap;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

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

			if (nextCall.equals('㰊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfResources: void <init>()> ");
				curEvent = '㰊';
				com.itextpdf.kernel.pdf.PdfResources ret;
				ret = new com.itextpdf.kernel.pdf.PdfResources();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㸊';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䐎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䐎';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> ");
				curEvent = '㐘';
				int ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfPdfObjects();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getLastPage()> ");
				curEvent = '㰛';
				com.itextpdf.kernel.pdf.PdfPage ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLastPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfString getLang()> ");
				curEvent = '䠢';
				com.itextpdf.kernel.pdf.PdfString ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLang();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䨦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: byte[] getXmpMetadata()> ");
				curEvent = '䨦';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getXmpMetadata();
				curEvent = null;

			} else if (nextCall.equals('䰳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䰳';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()> ");
				curEvent = '㨺';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䩁';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑂')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasXrefStm()> ");
				curEvent = '㑂';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasXrefStm();
				curEvent = null;

			} else if (nextCall.equals('K')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfDictionary getTrailer()> ");
				curEvent = 'K';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getTrailer();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹌')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㹌';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.xobject.PdfImageXObject getThumbnailImage()> ");
				curEvent = '䙍';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getThumbnailImage();
				curEvent = null;

			} else if (nextCall.equals('䡎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䡎';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getAnnotsSize()> ");
				curEvent = '㙎';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAnnotsSize();
				curEvent = null;

			} else if (nextCall.equals('㹒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfAConformanceLevel: java.lang.String getConformance()> ");
				curEvent = '㹒';
				com.itextpdf.kernel.pdf.PdfAConformanceLevel cls = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getConformance();
				curEvent = null;

			} else if (nextCall.equals('䙕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(java.io.InputStream)> ");
				curEvent = '䙕';
				com.itextpdf.kernel.pdf.PdfReader ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙗')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: void <init>(int)> ");
				curEvent = '䙗';
				com.itextpdf.kernel.pdf.PdfNumber ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfNumber(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: boolean isTagged()> ");
				curEvent = '䉘';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isTagged();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁙')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfStream newContentStreamBefore()> ");
				curEvent = '䁙';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.newContentStreamBefore();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.tagutils.TagStructureContext getTagStructureContext()> ");
				curEvent = '䩜';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTagStructureContext();
				curEvent = null;

			} else if (nextCall.equals('䩣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfOutline getOutlines(boolean)> ");
				curEvent = '䩣';
				com.itextpdf.kernel.pdf.PdfOutline ret;
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOutlines(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getContentStreamCount()> ");
				curEvent = '㱭';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContentStreamCount();
				curEvent = null;

			} else if (nextCall.equals('䉰')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䉰';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: java.lang.String[] getPageLabels()> ");
				curEvent = '䡲';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPageLabels();
				curEvent = null;

			} else if (nextCall.equals('s')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getPage(int)> ");
				curEvent = 's';
				com.itextpdf.kernel.pdf.PdfPage ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩼')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.StampingProperties: void <init>()> ");
				curEvent = '䩼';
				com.itextpdf.kernel.pdf.StampingProperties ret;
				ret = new com.itextpdf.kernel.pdf.StampingProperties();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()> ");
				curEvent = '㱽';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䙿';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒂')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isCloseStream()> ");
				curEvent = '㒂';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isCloseStream();
				curEvent = null;

			} else if (nextCall.equals('䂄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfWriter getWriter()> ");
				curEvent = '䂄';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getWriter();
				curEvent = null;

			} else if (nextCall.equals('䪆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: byte[] getBytes()> ");
				curEvent = '䪆';
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBytes();
				curEvent = null;

			} else if (nextCall.equals('㢈')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()> ");
				curEvent = '㢈';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()> ");
				curEvent = '㢉';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒌')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䒌';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢏')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.StampingProperties: com.itextpdf.kernel.pdf.StampingProperties preserveEncryption()> ");
				curEvent = '㢏';
				com.itextpdf.kernel.pdf.StampingProperties ret;
				com.itextpdf.kernel.pdf.StampingProperties cls = (com.itextpdf.kernel.pdf.StampingProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.preserveEncryption();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()> ");
				curEvent = '㢑';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪔')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: java.util.List listIndirectReferences()> ");
				curEvent = '㪔';
				java.util.List ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.listIndirectReferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.collection.PdfCollection getCollection()> ");
				curEvent = '䒕';
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCollection();
				curEvent = null;

			} else if (nextCall.equals('㢙')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㢙';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()> ");
				curEvent = '䊚';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䂜';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()> ");
				curEvent = '䂣';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfObject getPdfObject()> ");
				curEvent = '䲦';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getRotation()> ");
				curEvent = '䒩';
				int ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRotation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢯')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfResources getResources()> ");
				curEvent = '䢯';
				com.itextpdf.kernel.pdf.PdfResources ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getResources();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂰')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getFirstPage()> ");
				curEvent = '䂰';
				com.itextpdf.kernel.pdf.PdfPage ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFirstPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfCatalog getCatalog()> ");
				curEvent = '䂳';
				com.itextpdf.kernel.pdf.PdfCatalog ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCatalog();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()> ");
				curEvent = '䲳';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪹')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: byte[] getContentBytes()> ");
				curEvent = '㪹';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContentBytes();
				curEvent = null;

			} else if (nextCall.equals('䢿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: com.itextpdf.kernel.pdf.PdfAConformanceLevel getPdfAConformanceLevel()> ");
				curEvent = '䢿';
				com.itextpdf.kernel.pdf.PdfAConformanceLevel ret;
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfAConformanceLevel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: int getCryptoMode()> ");
				curEvent = '䳀';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCryptoMode();
				curEvent = null;

			} else if (nextCall.equals('㛆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()> ");
				curEvent = '㛆';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfStream getXmpMetadata()> ");
				curEvent = '㻎';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getXmpMetadata();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䋑';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: void <init>()> ");
				curEvent = '㳒';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				ret = new com.itextpdf.kernel.pdf.PdfDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫔')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()> ");
				curEvent = '㫔';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfName getTabOrder()> ");
				curEvent = '䃕';
				com.itextpdf.kernel.pdf.PdfName ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getTabOrder();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓖')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()> ");
				curEvent = '㓖';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: boolean isPageRotationInverseMatrixWritten()> ");
				curEvent = '㫚';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPageRotationInverseMatrixWritten();
				curEvent = null;

			} else if (nextCall.equals('䋯')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()> ");
				curEvent = '䋯';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䓲';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfStream newContentStreamAfter()> ");
				curEvent = '㣳';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.newContentStreamAfter();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> ");
				curEvent = '㳳';
				int ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()> ");
				curEvent = '㣻';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasHybridXref()> ");
				curEvent = '㫽';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasHybridXref();
				curEvent = null;

			} else if (nextCall.equals('䣾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䣾';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㣿';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䴘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: java.util.List getAnnotations()> ");
				curEvent = '䴘';
				java.util.List ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnnotations();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䄚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()> ");
				curEvent = '䄚';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䴛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void <init>(com.itextpdf.kernel.pdf.PdfReader)> ");
				curEvent = '䴛';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfReader arg0 = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfDocument(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()> ");
				curEvent = '㴜';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䌜';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getMediaBox()> ");
				curEvent = '䌟';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMediaBox();
				curEvent = null;

			} else if (nextCall.equals('䜟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: boolean isIgnorePageRotationForContent()> ");
				curEvent = '䜟';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isIgnorePageRotationForContent();
				curEvent = null;

			} else if (nextCall.equals('䴣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䴣';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䄳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䄳';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getArtBox()> ");
				curEvent = '㔴';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getArtBox();
				curEvent = null;

			} else if (nextCall.equals('㬻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()> ");
				curEvent = '㬻';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䜽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()> ");
				curEvent = '䜽';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: long getFileLength()> ");
				curEvent = '䭃';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileLength();
				curEvent = null;

			} else if (nextCall.equals('㽅')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㽅';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()> ");
				curEvent = '㽆';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭌')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isOpenedWithFullPermission()> ");
				curEvent = '㭌';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOpenedWithFullPermission();
				curEvent = null;

			} else if (nextCall.equals('䝎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfString getOriginalDocumentId()> ");
				curEvent = '䝎';
				com.itextpdf.kernel.pdf.PdfString ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOriginalDocumentId();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䍐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䍐';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥓')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfAConformanceLevel: java.lang.String getPart()> ");
				curEvent = '䥓';
				com.itextpdf.kernel.pdf.PdfAConformanceLevel cls = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPart();
				curEvent = null;

			} else if (nextCall.equals('䭛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isEncrypted()> ");
				curEvent = '䭛';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('㽜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfDocumentInfo getDocumentInfo()> ");
				curEvent = '㽜';
				com.itextpdf.kernel.pdf.PdfDocumentInfo ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㵟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfViewerPreferences getViewerPreferences()> ");
				curEvent = '㵟';
				com.itextpdf.kernel.pdf.PdfViewerPreferences ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getViewerPreferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㽢';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isStream()> ");
				curEvent = '䭣';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()> ");
				curEvent = '䅦';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfObject getPdfObject(int)> ");
				curEvent = '㝭';
				com.itextpdf.kernel.pdf.PdfObject ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝱')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㝱';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfArray getAssociatedFiles()> ");
				curEvent = '㽴';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAssociatedFiles();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()> ");
				curEvent = '㕵';
				int ret;
				ret = (9);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()> ");
				curEvent = '㝵';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅷')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()> ");
				curEvent = '䅷';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽷')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()> ");
				curEvent = '㽷';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㕽';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䦀';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎈')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void <init>()> ");
				curEvent = '䎈';
				com.itextpdf.kernel.pdf.PdfStream ret;
				ret = new com.itextpdf.kernel.pdf.PdfStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.tagging.PdfStructTreeRoot getStructTreeRoot()> ");
				curEvent = '䎑';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStructTreeRoot();
				curEvent = null;

			} else if (nextCall.equals('䖒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䖒';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖔')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void close()> ");
				curEvent = '䖔';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䎖')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䎖';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㖜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()> ");
				curEvent = '㖜';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䖜';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㖝')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getStructParentIndex()> ");
				curEvent = '㖝';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStructParentIndex();
				curEvent = null;

			} else if (nextCall.equals('㞝')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: java.util.List getOutlines(boolean)> ");
				curEvent = '㞝';
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOutlines(arg0);
				curEvent = null;

			} else if (nextCall.equals('㶠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: byte[] computeUserPassword()> ");
				curEvent = '㶠';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.computeUserPassword();
				curEvent = null;

			} else if (nextCall.equals('䆢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䆢';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getCropBox()> ");
				curEvent = '䆦';
				com.itextpdf.kernel.geom.Rectangle ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCropBox();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.DocumentProperties: void <init>()> ");
				curEvent = '㶨';
				new com.itextpdf.kernel.pdf.DocumentProperties();
				curEvent = null;

			} else if (nextCall.equals('䮩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfDocument getDocument()> ");
				curEvent = '䮩';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocument();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.font.PdfFont getDefaultFont()> ");
				curEvent = '䦮';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDefaultFont();
				curEvent = null;

			} else if (nextCall.equals('䖳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasRebuiltXref()> ");
				curEvent = '䖳';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasRebuiltXref();
				curEvent = null;

			} else if (nextCall.equals('㮳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()> ");
				curEvent = '㮳';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()> ");
				curEvent = '㶴';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䶼')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getPageSizeWithRotation()> ");
				curEvent = '䶼';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPageSizeWithRotation();
				curEvent = null;

			} else if (nextCall.equals('䦿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.geom.PageSize getDefaultPageSize()> ");
				curEvent = '䦿';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDefaultPageSize();
				curEvent = null;

			} else if (nextCall.equals('㷁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfViewerPreferences: void <init>()> ");
				curEvent = '㷁';
				com.itextpdf.kernel.pdf.PdfViewerPreferences ret;
				ret = new com.itextpdf.kernel.pdf.PdfViewerPreferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()> ");
				curEvent = '㯋';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()> ");
				curEvent = '㧚';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getTrimBox()> ");
				curEvent = '䏛';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTrimBox();
				curEvent = null;

			} else if (nextCall.equals('䇣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfVersion getPdfVersion()> ");
				curEvent = '䇣';
				com.itextpdf.kernel.pdf.PdfVersion ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfVersion();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getPageSize()> ");
				curEvent = '㗨';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPageSize();
				curEvent = null;

			} else if (nextCall.equals('㧫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getBleedBox()> ");
				curEvent = '㧫';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBleedBox();
				curEvent = null;

			} else if (nextCall.equals('㯲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()> ");
				curEvent = '㯲';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㧶';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void close()> ");
				curEvent = '䧾';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('㿾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR__1'()> ");
				curEvent = '㿾';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
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

			if (cond.equals('䨀')) {
				curEvent = '䨀';
				/* <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfViewerPreferences getViewerPreferences()> */
				com.itextpdf.kernel.pdf.PdfViewerPreferences v_130_ = (com.itextpdf.kernel.pdf.PdfViewerPreferences) getVarValue(getOutVar('㵟', "ret"));
				satisfies = (Not(v_130_ == null));
				curEvent = null;

			} else if (cond.equals('䐁')) {
				curEvent = '䐁';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()> */
				int v_0_ = (int) getVarValue(getOutVar('䋯', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_0_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㠂')) {
				curEvent = '㠂';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()> */
				int v_27_ = (int) getVarValue(getOutVar('㓖', "ret"));
				satisfies = (v_27_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䠃')) {
				curEvent = '䠃';
				/* <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getCropBox()> */
				com.itextpdf.kernel.geom.Rectangle v_268_ = (com.itextpdf.kernel.geom.Rectangle) getVarValue(getOutVar('䆦', "ret"));
				satisfies = (Not(v_268_ == null));
				curEvent = null;

			} else if (cond.equals('䠅')) {
				curEvent = '䠅';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isStream()> */
				boolean v_162_ = (boolean) getVarValue(getOutVar('䭣', "ret"));
				satisfies = (v_162_ == false);
				curEvent = null;

			} else if (cond.equals('㘇')) {
				curEvent = '㘇';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfCatalog getCatalog()> */
				com.itextpdf.kernel.pdf.PdfCatalog v_37_ = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(getOutVar('䂳', "ret"));
				satisfies = (Not(v_37_ == null));
				curEvent = null;

			} else if (cond.equals('㨒')) {
				curEvent = '㨒';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()> */
				int v_6_ = (int) getVarValue(getOutVar('㮳', "ret"));
				satisfies = (v_6_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㘝')) {
				curEvent = '㘝';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()> */
				int v_7_ = (int) getVarValue(getOutVar('㖜', "ret"));
				satisfies = (Not(v_7_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㸠')) {
				curEvent = '㸠';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()> */
				int v_250_ = (int) getVarValue(getOutVar('㽷', "ret"));
				satisfies = (Not(v_250_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㸩')) {
				curEvent = '㸩';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()> */
				int v_194_ = (int) getVarValue(getOutVar('䅷', "ret"));
				satisfies = (Not(v_194_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䰰')) {
				curEvent = '䰰';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()> */
				int v_182_ = (int) getVarValue(getOutVar('㬻', "ret"));
				satisfies = (Not(v_182_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㨰')) {
				curEvent = '㨰';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()> */
				int v_100_ = (int) getVarValue(getOutVar('䜽', "ret"));
				satisfies = (v_100_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䨴')) {
				curEvent = '䨴';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()> */
				int v_283_ = (int) getVarValue(getOutVar('㢈', "ret"));
				satisfies = (v_283_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䐶')) {
				curEvent = '䐶';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()> */
				int v_0_ = (int) getVarValue(getOutVar('䋯', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_0_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䘶')) {
				curEvent = '䘶';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR__1'()> */
				int v_101_ = (int) getVarValue(getOutVar('㿾', "ret"));
				satisfies = (v_101_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㸸')) {
				curEvent = '㸸';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()> */
				int v_47_ = (int) getVarValue(getOutVar('㣻', "ret"));
				satisfies = (Not(v_47_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('D')) {
				curEvent = 'D';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()> */
				int v_283_ = (int) getVarValue(getOutVar('㢈', "ret"));
				satisfies = (Not(v_283_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䱅')) {
				curEvent = '䱅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()> */
				int v_28_ = (int) getVarValue(getOutVar('䄚', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_29_ = (int) getVarValue(getOutVar('㐘', "ret"));
				satisfies = (Not(v_28_ <= v_29_));
				curEvent = null;

			} else if (cond.equals('㙅')) {
				curEvent = '㙅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()> */
				int v_15_ = (int) getVarValue(getOutVar('䂣', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_15_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䙅')) {
				curEvent = '䙅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()> */
				int v_141_ = (int) getVarValue(getOutVar('㢉', "ret"));
				satisfies = (v_141_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㙊')) {
				curEvent = '㙊';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()> */
				int v_2_ = (int) getVarValue(getOutVar('㽆', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_2_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㱌')) {
				curEvent = '㱌';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()> */
				int v_165_ = (int) getVarValue(getOutVar('㨺', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_165_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䙘')) {
				curEvent = '䙘';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()> */
				int v_119_ = (int) getVarValue(getOutVar('㱽', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_119_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('e')) {
				curEvent = 'e';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()> */
				int v_103_ = (int) getVarValue(getOutVar('㢑', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_103_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䱭')) {
				curEvent = '䱭';
				/* <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfViewerPreferences getViewerPreferences()> */
				com.itextpdf.kernel.pdf.PdfViewerPreferences v_130_ = (com.itextpdf.kernel.pdf.PdfViewerPreferences) getVarValue(getOutVar('㵟', "ret"));
				satisfies = (v_130_ == null);
				curEvent = null;

			} else if (cond.equals('㡯')) {
				curEvent = '㡯';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getPage(int)> */
				com.itextpdf.kernel.pdf.PdfPage v_155_ = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(getOutVar('s', "ret"));
				satisfies = (v_155_ == null);
				curEvent = null;

			} else if (cond.equals('㹯')) {
				curEvent = '㹯';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()> */
				int v_27_ = (int) getVarValue(getOutVar('㓖', "ret"));
				satisfies = (Not(v_27_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䁿')) {
				curEvent = '䁿';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()> */
				int v_174_ = (int) getVarValue(getOutVar('㯋', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_174_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䚀')) {
				curEvent = '䚀';
				/* <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getCropBox()> */
				com.itextpdf.kernel.geom.Rectangle v_268_ = (com.itextpdf.kernel.geom.Rectangle) getVarValue(getOutVar('䆦', "ret"));
				satisfies = (v_268_ == null);
				curEvent = null;

			} else if (cond.equals('䂁')) {
				curEvent = '䂁';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()> */
				int v_194_ = (int) getVarValue(getOutVar('䅷', "ret"));
				satisfies = (v_194_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㪄')) {
				curEvent = '㪄';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()> */
				int v_217_ = (int) getVarValue(getOutVar('䲳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_217_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㚋')) {
				curEvent = '㚋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR__1'()> */
				int v_101_ = (int) getVarValue(getOutVar('㿾', "ret"));
				satisfies = (Not(v_101_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㺜')) {
				curEvent = '㺜';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()> */
				int v_141_ = (int) getVarValue(getOutVar('㢉', "ret"));
				satisfies = (Not(v_141_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䚝')) {
				curEvent = '䚝';
				/* <com.itextpdf.kernel.pdf.PdfReader: com.itextpdf.kernel.pdf.PdfAConformanceLevel getPdfAConformanceLevel()> */
				com.itextpdf.kernel.pdf.PdfAConformanceLevel v_20_ = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(getOutVar('䢿', "ret"));
				satisfies = (Not(v_20_ == null));
				curEvent = null;

			} else if (cond.equals('㒡')) {
				curEvent = '㒡';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()> */
				int v_100_ = (int) getVarValue(getOutVar('䜽', "ret"));
				satisfies = (Not(v_100_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㲦')) {
				curEvent = '㲦';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()> */
				int v_186_ = (int) getVarValue(getOutVar('㧚', "ret"));
				satisfies = (v_186_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㲪')) {
				curEvent = '㲪';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()> */
				int v_186_ = (int) getVarValue(getOutVar('㧚', "ret"));
				satisfies = (Not(v_186_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䚰')) {
				curEvent = '䚰';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()> */
				int v_103_ = (int) getVarValue(getOutVar('㢑', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_103_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㚲')) {
				curEvent = '㚲';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()> */
				int v_154_ = (int) getVarValue(getOutVar('㫔', "ret"));
				satisfies = (v_154_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䛆')) {
				curEvent = '䛆';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfObject getPdfObject(int)> */
				com.itextpdf.kernel.pdf.PdfObject v_121_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('㝭', "ret"));
				satisfies = (Not(v_121_ == null));
				curEvent = null;

			} else if (cond.equals('䃓')) {
				curEvent = '䃓';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()> */
				int v_272_ = (int) getVarValue(getOutVar('䅦', "ret"));
				satisfies = (Not(v_272_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䓖')) {
				curEvent = '䓖';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()> */
				int v_217_ = (int) getVarValue(getOutVar('䲳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_217_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㳫')) {
				curEvent = '㳫';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getPage(int)> */
				com.itextpdf.kernel.pdf.PdfPage v_155_ = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(getOutVar('s', "ret"));
				satisfies = (Not(v_155_ == null));
				curEvent = null;

			} else if (cond.equals('㓱')) {
				curEvent = '㓱';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()> */
				int v_62_ = (int) getVarValue(getOutVar('㴜', "ret"));
				satisfies = (Not(v_62_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㳸')) {
				curEvent = '㳸';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()> */
				int v_6_ = (int) getVarValue(getOutVar('㮳', "ret"));
				satisfies = (Not(v_6_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㼅')) {
				curEvent = '㼅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()> */
				int v_250_ = (int) getVarValue(getOutVar('㽷', "ret"));
				satisfies = (v_250_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㤏')) {
				curEvent = '㤏';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()> */
				int v_149_ = (int) getVarValue(getOutVar('㶴', "ret"));
				satisfies = (v_149_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䴔')) {
				curEvent = '䴔';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_288_ <= 2));
				curEvent = null;

			} else if (cond.equals('䄗')) {
				curEvent = '䄗';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfObject getPdfObject(int)> */
				com.itextpdf.kernel.pdf.PdfObject v_121_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('㝭', "ret"));
				satisfies = (v_121_ == null);
				curEvent = null;

			} else if (cond.equals('䜦')) {
				curEvent = '䜦';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()> */
				int v_7_ = (int) getVarValue(getOutVar('㖜', "ret"));
				satisfies = (v_7_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㤮')) {
				curEvent = '㤮';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()> */
				int v_62_ = (int) getVarValue(getOutVar('㴜', "ret"));
				satisfies = (v_62_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䤺')) {
				curEvent = '䤺';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfCatalog getCatalog()> */
				com.itextpdf.kernel.pdf.PdfCatalog v_37_ = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(getOutVar('䂳', "ret"));
				satisfies = (v_37_ == null);
				curEvent = null;

			} else if (cond.equals('㼼')) {
				curEvent = '㼼';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()> */
				int v_182_ = (int) getVarValue(getOutVar('㬻', "ret"));
				satisfies = (v_182_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䍂')) {
				curEvent = '䍂';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()> */
				int v_9_ = (int) getVarValue(getOutVar('㛆', "ret"));
				satisfies = (Not(v_9_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㝅')) {
				curEvent = '㝅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()> */
				int v_154_ = (int) getVarValue(getOutVar('㫔', "ret"));
				satisfies = (Not(v_154_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㕉')) {
				curEvent = '㕉';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()> */
				int v_15_ = (int) getVarValue(getOutVar('䂣', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_15_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䵧')) {
				curEvent = '䵧';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isStream()> */
				boolean v_162_ = (boolean) getVarValue(getOutVar('䭣', "ret"));
				satisfies = (Not(v_162_ == false));
				curEvent = null;

			} else if (cond.equals('䕺')) {
				curEvent = '䕺';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()> */
				int v_28_ = (int) getVarValue(getOutVar('䄚', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_29_ = (int) getVarValue(getOutVar('㐘', "ret"));
				satisfies = (v_28_ <= v_29_);
				curEvent = null;

			} else if (cond.equals('䖊')) {
				curEvent = '䖊';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()> */
				int v_24_ = (int) getVarValue(getOutVar('䊚', "ret"));
				satisfies = (Not(v_24_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('䦋')) {
				curEvent = '䦋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()> */
				int v_90_ = (int) getVarValue(getOutVar('㕵', "ret"));
				satisfies = (v_90_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䦚')) {
				curEvent = '䦚';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()> */
				int v_9_ = (int) getVarValue(getOutVar('㛆', "ret"));
				satisfies = (v_9_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䦟')) {
				curEvent = '䦟';
				/* <com.itextpdf.kernel.pdf.PdfDocument: boolean isTagged()> */
				boolean v_282_ = (boolean) getVarValue(getOutVar('䉘', "ret"));
				satisfies = (Not(v_282_ == false));
				curEvent = null;

			} else if (cond.equals('䶩')) {
				curEvent = '䶩';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()> */
				int v_165_ = (int) getVarValue(getOutVar('㨺', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_165_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㾪')) {
				curEvent = '㾪';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()> */
				int v_80_ = (int) getVarValue(getOutVar('㝵', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_80_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㖰')) {
				curEvent = '㖰';
				/* <com.itextpdf.kernel.pdf.PdfReader: com.itextpdf.kernel.pdf.PdfAConformanceLevel getPdfAConformanceLevel()> */
				com.itextpdf.kernel.pdf.PdfAConformanceLevel v_20_ = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(getOutVar('䢿', "ret"));
				satisfies = (v_20_ == null);
				curEvent = null;

			} else if (cond.equals('㶳')) {
				curEvent = '㶳';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()> */
				int v_90_ = (int) getVarValue(getOutVar('㕵', "ret"));
				satisfies = (Not(v_90_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㦿')) {
				curEvent = '㦿';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()> */
				int v_47_ = (int) getVarValue(getOutVar('㣻', "ret"));
				satisfies = (v_47_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䧄')) {
				curEvent = '䧄';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()> */
				int v_149_ = (int) getVarValue(getOutVar('㶴', "ret"));
				satisfies = (Not(v_149_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㿇')) {
				curEvent = '㿇';
				/* <com.itextpdf.kernel.pdf.PdfDocument: boolean isTagged()> */
				boolean v_282_ = (boolean) getVarValue(getOutVar('䉘', "ret"));
				satisfies = (v_282_ == false);
				curEvent = null;

			} else if (cond.equals('㷑')) {
				curEvent = '㷑';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()> */
				int v_80_ = (int) getVarValue(getOutVar('㝵', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_80_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㯧')) {
				curEvent = '㯧';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()> */
				int v_2_ = (int) getVarValue(getOutVar('㽆', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_2_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㧨')) {
				curEvent = '㧨';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()> */
				int v_167_ = (int) getVarValue(getOutVar('㯲', "ret"));
				satisfies = (Not(v_167_ <= v_288_));
				curEvent = null;

			} else if (cond.equals('㿨')) {
				curEvent = '㿨';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()> */
				int v_174_ = (int) getVarValue(getOutVar('㯋', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_174_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䗪')) {
				curEvent = '䗪';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()> */
				int v_272_ = (int) getVarValue(getOutVar('䅦', "ret"));
				satisfies = (v_272_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䯪')) {
				curEvent = '䯪';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (v_288_ <= 2);
				curEvent = null;

			} else if (cond.equals('䏮')) {
				curEvent = '䏮';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()> */
				int v_24_ = (int) getVarValue(getOutVar('䊚', "ret"));
				satisfies = (v_24_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('䧯')) {
				curEvent = '䧯';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()> */
				int v_167_ = (int) getVarValue(getOutVar('㯲', "ret"));
				satisfies = (v_167_ <= v_288_);
				curEvent = null;

			} else if (cond.equals('㗰')) {
				curEvent = '㗰';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()> */
				int v_119_ = (int) getVarValue(getOutVar('㱽', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_288_ = (int) getVarValue(getOutVar('㳳', "ret"));
				satisfies = (Not(v_119_ <= v_288_));
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
    private static long fixedCf = 0;

	public static void fuzzerInitialize() {
		String alphabetFile = "alphabet.json";
		String nfaFile = "nfa.txt";
		String apiFile = "apifuncs.json";
		String cfPickJsonFile = "cfPicks.json";
        String fixedCFFile = "fixCfNO.txt";

        try {
            List<Long> ints = Files.lines(Paths.get(fixedCFFile))
                                      .map(Long::parseLong)
                                      .collect(Collectors.toList());
            fixedCf = (long)ints.get(0);
        } catch (Exception | java.lang.AssertionError  t) {
            t.printStackTrace();
            throw new RuntimeException(t);
        }

		Fuzzer.debug = true;
		harness = new Fuzzer();
		harness.initialize(alphabetFile, nfaFile, apiFile, cfPickJsonFile);
	}


	public static void fuzzerTestOneInput(com.code_intelligence.jazzer.api.FuzzedDataProvider data) {
		long cfNO = fixedCf;
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
