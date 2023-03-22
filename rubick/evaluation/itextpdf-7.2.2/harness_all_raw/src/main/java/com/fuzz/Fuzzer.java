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
	protected boolean subrun1(Character nextCall) throws HarnessException {
        try {
			if (nextCall.equals('㐀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfName getAsName(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㐀';
				com.itextpdf.kernel.pdf.PdfName ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsName(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: boolean isEmpty()> ");
				curEvent = '㰀';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEmpty();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isDictionary()> ");
				curEvent = '㐁';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䐁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 399924090_i1_LOOPVAR__1()> ");
				curEvent = '䐁';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.DocumentProperties: void <init>()> ");
				curEvent = '㐃';
				new com.itextpdf.kernel.pdf.DocumentProperties();
				curEvent = null;

			} else if (nextCall.equals('䐇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 727368913_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 727368913_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䐇';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1966201540_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1966201540_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㰎';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-14792416_i1_LOOPVAR__0'()> ");
				curEvent = '䠎';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: boolean <com.itextpdf.kernel.pdf.PdfPage: java.util.List getAnnotations()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㠑';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: void <init>(com.itextpdf.kernel.geom.Rectangle)> ");
				curEvent = '㰑';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.geom.Rectangle arg0 = (com.itextpdf.kernel.geom.Rectangle) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: byte[] getValueBytes()> ");
				curEvent = '䠑';
				com.itextpdf.kernel.pdf.PdfString cls = (com.itextpdf.kernel.pdf.PdfString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getValueBytes();
				curEvent = null;

			} else if (nextCall.equals('䐛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1355875391_i1_LOOPVAR__1()> ");
				curEvent = '䐛';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(com.itextpdf.io.source.IRandomAccessSource,com.itextpdf.kernel.pdf.ReaderProperties)> ");
				curEvent = '䠜';
				com.itextpdf.kernel.pdf.PdfReader ret;
				com.itextpdf.io.source.IRandomAccessSource arg0 = (com.itextpdf.io.source.IRandomAccessSource) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.ReaderProperties arg1 = (com.itextpdf.kernel.pdf.ReaderProperties) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䐝')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDashPattern: void <init>()> ");
				curEvent = '䐝';
				com.itextpdf.kernel.pdf.PdfDashPattern ret;
				ret = new com.itextpdf.kernel.pdf.PdfDashPattern();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐞')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()> ");
				curEvent = '㐞';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 29577090_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 29577090_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䰠';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠡')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 29577090_i1_LOOPVAR__1()> ");
				curEvent = '㠡';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰡')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-8524119_$i1_LOOPVAR__🞮'()> ");
				curEvent = '䰡';
				int ret = 0;
				//ret = (🞮);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䠢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: com.itextpdf.kernel.pdf.PdfObject makeIndirect(com.itextpdf.kernel.pdf.PdfDocument)> ");
				curEvent = '䠢';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfDocument arg0 = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.makeIndirect(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1355875391_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1355875391_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㐦';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䀦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()> ");
				curEvent = '䀦';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䐧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(java.lang.String,com.itextpdf.kernel.pdf.ReaderProperties)> ");
				curEvent = '䐧';
				com.itextpdf.kernel.pdf.PdfReader ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.ReaderProperties arg1 = (com.itextpdf.kernel.pdf.ReaderProperties) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void <init>(com.itextpdf.kernel.pdf.PdfDocument,java.io.InputStream)> ");
				curEvent = '㐭';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfDocument arg0 = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.io.InputStream arg1 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfStream(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䐭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䐭';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfNameTree getNameTree(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㠮';
				com.itextpdf.kernel.pdf.PdfNameTree ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNameTree(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰰')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isEncrypted()> ");
				curEvent = '䰰';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEncrypted();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1228751848_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1228751848_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㰲';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㠵';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䀼')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䀼';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i5_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i5_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䡀';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䑁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '䑁';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.get(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䑃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfName getAsName(int)> ");
				curEvent = '䑃';
				com.itextpdf.kernel.pdf.PdfName ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsName(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()> ");
				curEvent = '㑄';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1479062844_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1479062844_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㱇';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: boolean isTagged()> ");
				curEvent = '䡇';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isTagged();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfArray getAsArray(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㑉';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䱉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfIndirectReference: int getGenNumber()> ");
				curEvent = '䱉';
				com.itextpdf.kernel.pdf.PdfIndirectReference cls = (com.itextpdf.kernel.pdf.PdfIndirectReference) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getGenNumber();
				curEvent = null;

			} else if (nextCall.equals('䑊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: byte[] computeUserPassword()> ");
				curEvent = '䑊';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.computeUserPassword();
				curEvent = null;

			} else if (nextCall.equals('䑋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfArray getAsArray(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '䑋';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁌')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int size()> ");
				curEvent = '䁌';
				int ret;
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.size();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 817036870_i3_LOOPVAR__0()> ");
				curEvent = '㑍';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void close()> ");
				curEvent = '㱍';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䁍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfObject makeIndirect(com.itextpdf.kernel.pdf.PdfDocument)> ");
				curEvent = '䁍';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfDocument arg0 = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.makeIndirect(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('N')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfString getLang()> ");
				curEvent = 'N';
				com.itextpdf.kernel.pdf.PdfString ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLang();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getBleedBox()> ");
				curEvent = '㑎';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBleedBox();
				curEvent = null;

			} else if (nextCall.equals('䑏')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1912957314_i1_LOOPVAR__1'()> ");
				curEvent = '䑏';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('V')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfObject getPdfObject()> ");
				curEvent = 'V';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䑗')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocumentInfo: java.lang.String getAuthor()> ");
				curEvent = '䑗';
				com.itextpdf.kernel.pdf.PdfDocumentInfo cls = (com.itextpdf.kernel.pdf.PdfDocumentInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAuthor();
				curEvent = null;

			} else if (nextCall.equals('Z')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1758565287_i2_LOOPVAR__0'()> ");
				curEvent = 'Z';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void <init>(byte[])> ");
				curEvent = '㡚';
				com.itextpdf.kernel.pdf.PdfStream ret;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡞')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocumentInfo: java.lang.String getTitle()> ");
				curEvent = '㡞';
				com.itextpdf.kernel.pdf.PdfDocumentInfo cls = (com.itextpdf.kernel.pdf.PdfDocumentInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTitle();
				curEvent = null;

			} else if (nextCall.equals('㑟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: boolean isIgnorePageRotationForContent()> ");
				curEvent = '㑟';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isIgnorePageRotationForContent();
				curEvent = null;

			} else if (nextCall.equals('䡠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 118380049_i3_LOOPVAR__0()> ");
				curEvent = '䡠';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䑢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfBoolean: boolean getValue()> ");
				curEvent = '䑢';
				com.itextpdf.kernel.pdf.PdfBoolean cls = (com.itextpdf.kernel.pdf.PdfBoolean) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getValue();
				curEvent = null;

			} else if (nextCall.equals('䡢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: java.lang.Object <com.itextpdf.kernel.pdf.PdfDocument: java.util.List listIndirectReferences()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䡢';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䱢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i3_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i3_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䱢';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('d')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()> ");
				curEvent = 'd';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㡨';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfResources: com.itextpdf.kernel.pdf.PdfObject getPdfObject()> ");
				curEvent = '㡩';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfResources cls = (com.itextpdf.kernel.pdf.PdfResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isNumber()> ");
				curEvent = '䁫';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isNumber();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1758565287_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-1758565287_i2_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䡫';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfObject get(int)> ");
				curEvent = '㑬';
				com.itextpdf.kernel.pdf.PdfObject ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.get(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䱮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䱮';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱸')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDate: void <init>()> ");
				curEvent = '㱸';
				com.itextpdf.kernel.pdf.PdfDate ret;
				ret = new com.itextpdf.kernel.pdf.PdfDate();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('y')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: void <init>()> ");
				curEvent = 'y';
				com.itextpdf.kernel.pdf.PdfArray ret;
				ret = new com.itextpdf.kernel.pdf.PdfArray();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isArray()> ");
				curEvent = '㱺';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isArray();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1662017370_i1_LOOPVAR__1()> ");
				curEvent = '䁻';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()> ");
				curEvent = '㑽';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfName: java.lang.String toString()> ");
				curEvent = '䒁';
				com.itextpdf.kernel.pdf.PdfName cls = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toString();
				curEvent = null;

			} else if (nextCall.equals('䲂')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void <init>(com.itextpdf.kernel.pdf.PdfReader,com.itextpdf.kernel.pdf.PdfWriter,com.itextpdf.kernel.pdf.StampingProperties)> ");
				curEvent = '䲂';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfReader arg0 = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfWriter arg1 = (com.itextpdf.kernel.pdf.PdfWriter) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.itextpdf.kernel.pdf.StampingProperties arg2 = (com.itextpdf.kernel.pdf.StampingProperties) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				ret = new com.itextpdf.kernel.pdf.PdfDocument(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfString getAsString(int)> ");
				curEvent = '䲄';
				com.itextpdf.kernel.pdf.PdfString ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsString(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()> ");
				curEvent = '䒉';
				int ret;
				ret = (9);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfObject getPdfObject()> ");
				curEvent = '䢍';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1722087346_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1722087346_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䢐';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: java.lang.Object <com.itextpdf.kernel.pdf.PdfDictionary: java.util.Set keySet()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㒑';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䂒';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢔')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1081523889_i4_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1081523889_i4_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㢔';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfDocumentInfo getDocumentInfo()> ");
				curEvent = '㲕';
				com.itextpdf.kernel.pdf.PdfDocumentInfo ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void <init>()> ");
				curEvent = '䢘';
				com.itextpdf.kernel.pdf.PdfStream ret;
				ret = new com.itextpdf.kernel.pdf.PdfStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒝')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void putAll(com.itextpdf.kernel.pdf.PdfDictionary)> ");
				curEvent = '㒝';
				com.itextpdf.kernel.pdf.PdfDictionary arg0 = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.putAll(arg0);
				curEvent = null;

			} else if (nextCall.equals('㲟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfLiteral: void <init>(java.lang.String)> ");
				curEvent = '㲟';
				com.itextpdf.kernel.pdf.PdfLiteral ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfLiteral(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-534743232_i1_LOOPVAR__1'()> ");
				curEvent = '䲟';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒡')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䒡';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䲣';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 118380049_i3_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 118380049_i3_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䲦';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfLiteral: java.lang.String toString()> ");
				curEvent = '䲧';
				com.itextpdf.kernel.pdf.PdfLiteral cls = (com.itextpdf.kernel.pdf.PdfLiteral) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toString();
				curEvent = null;

			} else if (nextCall.equals('㒨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1966201540_i1_LOOPVAR__1()> ");
				curEvent = '㒨';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 674329458_i6_LOOPVAR__1()> ");
				curEvent = '䲩';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1228751848_i1_LOOPVAR__1'()> ");
				curEvent = '䂪';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfAConformanceLevel: java.lang.String getConformance()> ");
				curEvent = '䂫';
				com.itextpdf.kernel.pdf.PdfAConformanceLevel cls = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getConformance();
				curEvent = null;

			} else if (nextCall.equals('㢬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: float floatValue()> ");
				curEvent = '㢬';
				float ret;
				com.itextpdf.kernel.pdf.PdfNumber cls = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.floatValue();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNameTree: com.itextpdf.kernel.pdf.PdfDictionary buildTree()> ");
				curEvent = '䲲';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				com.itextpdf.kernel.pdf.PdfNameTree cls = (com.itextpdf.kernel.pdf.PdfNameTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.buildTree();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: com.itextpdf.kernel.pdf.PdfIndirectReference getIndirectReference()> ");
				curEvent = '㢵';
				com.itextpdf.kernel.pdf.PdfIndirectReference ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getIndirectReference();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-2074001042_i1_LOOPVAR__0'()> ");
				curEvent = '䂶';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNull: byte getType()> ");
				curEvent = '䂻';
				byte ret;
				com.itextpdf.kernel.pdf.PdfNull cls = (com.itextpdf.kernel.pdf.PdfNull) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getType();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: void <init>(java.lang.String)> ");
				curEvent = '㒾';
				com.itextpdf.kernel.pdf.PdfString ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfString(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣂')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: boolean containsKey(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '䣂';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.containsKey(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;
            } else {
		        if (1 == 0) throw new IOException("This makes compiler happy");
                return false;
            }

            return true;

		} catch (Exception | java.lang.AssertionError ex) {
			/* catch all kinds of exceptions (some APIs throw exceptions, we need to make the compiler happy) */
			/* System.out.println("catched IOException: " + ex); */
			//ex.printStackTrace();
			//throw new RuntimeException("Exception | java.lang.AssertionError: " + ex);
            com.fuzz.ExpCollector.addNewCrash(ex);
                  throw new ahg.harness.exception.UnknownException("Handled a caught exception");
		}

    }

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	protected boolean subrun2(Character nextCall) throws HarnessException {
        try {
			if (nextCall.equals('㓃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: java.lang.String toString()> ");
				curEvent = '㓃';
				com.itextpdf.kernel.pdf.PdfString cls = (com.itextpdf.kernel.pdf.PdfString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toString();
				curEvent = null;

			} else if (nextCall.equals('䃃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: boolean <com.itextpdf.kernel.pdf.PdfDocument: java.util.List listIndirectReferences()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䃃';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfArray getAssociatedFiles()> ");
				curEvent = '㓄';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAssociatedFiles();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㣄';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: void <init>()> ");
				curEvent = '㳇';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				ret = new com.itextpdf.kernel.pdf.PdfDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getCropBox()> ");
				curEvent = '䃎';
				com.itextpdf.kernel.geom.Rectangle ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCropBox();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: void <init>(java.util.List)> ");
				curEvent = '㓐';
				com.itextpdf.kernel.pdf.PdfArray ret;
				java.util.List arg0 = (java.util.List) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfOutline: java.lang.String getTitle()> ");
				curEvent = '㣐';
				com.itextpdf.kernel.pdf.PdfOutline cls = (com.itextpdf.kernel.pdf.PdfOutline) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTitle();
				curEvent = null;

			} else if (nextCall.equals('䣒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䣒';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣓')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfWriter getWriter()> ");
				curEvent = '䣓';
				com.itextpdf.kernel.pdf.PdfWriter ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getWriter();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1380518653_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-1380518653_i2_LOOPVAR__0'()>.RET_((arg0 + 1) + 1)(int)> ");
				curEvent = '㳕';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = (((arg0 + 1) + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-402781014_i3_LOOPVAR__0'()> ");
				curEvent = '㣚';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()> ");
				curEvent = '㳚';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(java.io.InputStream)> ");
				curEvent = '䳚';
				com.itextpdf.kernel.pdf.PdfReader ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣝')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getTrimBox()> ");
				curEvent = '䣝';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTrimBox();
				curEvent = null;

			} else if (nextCall.equals('㣟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasRebuiltXref()> ");
				curEvent = '㣟';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasRebuiltXref();
				curEvent = null;

			} else if (nextCall.equals('䓠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR__1'()> ");
				curEvent = '䓠';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: java.lang.Object <com.itextpdf.kernel.pdf.PdfArray: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '㓨';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: boolean isHexWriting()> ");
				curEvent = '㣬';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfString cls = (com.itextpdf.kernel.pdf.PdfString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isHexWriting();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfBoolean: void <init>(boolean)> ");
				curEvent = '䓬';
				com.itextpdf.kernel.pdf.PdfBoolean ret;
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfBoolean(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 817036870_i3_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 817036870_i3_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㓭';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣱')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䣱';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()> ");
				curEvent = '㓶';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1591245780_i5_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 1591245780_i5_LOOPVAR__0()>.RET_(arg0 + 8)(int)> ");
				curEvent = '㣶';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 8));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳷')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(java.io.File)> ");
				curEvent = '㳷';
				com.itextpdf.kernel.pdf.PdfReader ret;
				java.io.File arg0 = (java.io.File) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-402781014_i3_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-402781014_i3_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䳻';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfString getOriginalDocumentId()> ");
				curEvent = '䃾';
				com.itextpdf.kernel.pdf.PdfString ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOriginalDocumentId();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1624899003_$i1_LOOPVAR__(🞮 - 1)'()> ");
				curEvent = '㤁';
				int ret = 0;
				//ret = ((🞮 - 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䴄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfObject get(int,boolean)> ");
				curEvent = '䴄';
				com.itextpdf.kernel.pdf.PdfObject ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				boolean arg1 = (boolean) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.get(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getNextMcid()> ");
				curEvent = '㤇';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNextMcid();
				curEvent = null;

			} else if (nextCall.equals('䔋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䔋';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isName()> ");
				curEvent = '㔐';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isName();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()> ");
				curEvent = '㔑';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴓')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-560452335_i4_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-560452335_i4_LOOPVAR__1'()>.RET_(arg0 + 2)(int)> ");
				curEvent = '㴓';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 2));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䔛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䔛';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䄞')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1767161708_i4_LOOPVAR__0()> ");
				curEvent = '䄞';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤞')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1517705716_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-1517705716_i2_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䤞';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䴟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i2_LOOPVAR__1'()> ");
				curEvent = '䴟';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: byte[] readStreamBytesRaw(com.itextpdf.kernel.pdf.PdfStream)> ");
				curEvent = '㤣';
				com.itextpdf.kernel.pdf.PdfStream arg0 = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.readStreamBytesRaw(arg0);
				curEvent = null;

			} else if (nextCall.equals('䔣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2110937280_i14_LOOPVAR__1()> ");
				curEvent = '䔣';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䄥')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1754235817_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 1754235817_i1_LOOPVAR__0()>.RET_((arg0 + 1) + 1)(int)> ");
				curEvent = '䄥';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = (((arg0 + 1) + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䴥')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: java.lang.String toUnicodeString()> ");
				curEvent = '䴥';
				com.itextpdf.kernel.pdf.PdfString cls = (com.itextpdf.kernel.pdf.PdfString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toUnicodeString();
				curEvent = null;

			} else if (nextCall.equals('䴩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfOutline getOutlines(boolean)> ");
				curEvent = '䴩';
				com.itextpdf.kernel.pdf.PdfOutline ret;
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOutlines(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-534743232_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-534743232_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䤪';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴰')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1206117909_i1_LOOPVAR__1'()> ");
				curEvent = '㴰';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㴳';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocumentInfo: java.lang.String getProducer()> ");
				curEvent = '㴴';
				com.itextpdf.kernel.pdf.PdfDocumentInfo cls = (com.itextpdf.kernel.pdf.PdfDocumentInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getProducer();
				curEvent = null;

			} else if (nextCall.equals('㴵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1177218402_i1_LOOPVAR__1()> ");
				curEvent = '㴵';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()> ");
				curEvent = '䤵';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfDictionary getAsDictionary(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '䤶';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsDictionary(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfOutline: boolean <com.itextpdf.kernel.pdf.PdfOutline: java.util.List getAllChildren()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㔺';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䴽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfViewerPreferences: void <init>()> ");
				curEvent = '䴽';
				com.itextpdf.kernel.pdf.PdfViewerPreferences ret;
				ret = new com.itextpdf.kernel.pdf.PdfViewerPreferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getContentStreamCount()> ");
				curEvent = '㤾';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContentStreamCount();
				curEvent = null;

			} else if (nextCall.equals('䤾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(int)> ");
				curEvent = '䤾';
				com.itextpdf.kernel.pdf.PdfNumber ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsNumber(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㵅')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 2001251970_i1_LOOPVAR__0()> ");
				curEvent = '㵅';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥅')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNull: java.lang.String toString()> ");
				curEvent = '䥅';
				com.itextpdf.kernel.pdf.PdfNull cls = (com.itextpdf.kernel.pdf.PdfNull) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toString();
				curEvent = null;

			} else if (nextCall.equals('㕉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-697437535_i1_LOOPVAR__0'()> ");
				curEvent = '㕉';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getStructParentIndex()> ");
				curEvent = '㕊';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStructParentIndex();
				curEvent = null;

			} else if (nextCall.equals('䕊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfStream getXmpMetadata()> ");
				curEvent = '䕊';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getXmpMetadata();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()> ");
				curEvent = '䕋';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2110937280_i14_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 2110937280_i14_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㕍';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕏')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfObject getPdfObject(int)> ");
				curEvent = '䕏';
				com.itextpdf.kernel.pdf.PdfObject ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㵐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: java.util.Set keySet()> ");
				curEvent = '㵐';
				java.util.Set ret;
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.keySet();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: java.util.List listIndirectReferences()> ");
				curEvent = '䥑';
				java.util.List ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.listIndirectReferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfOutline: java.util.List getAllChildren()> ");
				curEvent = '㕒';
				java.util.List ret;
				com.itextpdf.kernel.pdf.PdfOutline cls = (com.itextpdf.kernel.pdf.PdfOutline) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAllChildren();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㵕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-402781014_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-402781014_i2_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㵕';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 817036870_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 817036870_i2_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䥘';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕝')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfStream getAsStream(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㕝';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㥠';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕡')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()> ");
				curEvent = '䕡';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㵢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1335348288_i1_LOOPVAR__1'()> ");
				curEvent = '㵢';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfIndirectReference getIndirectReference()> ");
				curEvent = '䕦';
				com.itextpdf.kernel.pdf.PdfIndirectReference ret;
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getIndirectReference();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()> ");
				curEvent = '㕧';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isStream()> ");
				curEvent = '䕧';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䵨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.tagging.PdfStructTreeRoot getStructTreeRoot()> ");
				curEvent = '䵨';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStructTreeRoot();
				curEvent = null;

			} else if (nextCall.equals('㕫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1754235817_i1_LOOPVAR__0()> ");
				curEvent = '㕫';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()> ");
				curEvent = '䕵';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㖂')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1081523889_i4_LOOPVAR__1()> ");
				curEvent = '㖂';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: boolean containsKey(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '䆃';
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.containsKey(arg0);
				curEvent = null;

			} else if (nextCall.equals('㖄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()> ");
				curEvent = '㖄';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦅')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-419521716_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-419521716_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䦅';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䶅')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void movePage(int,int)> ");
				curEvent = '䶅';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.movePage(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㦆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()> ");
				curEvent = '㦆';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void clear()> ");
				curEvent = '䆉';
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.clear();
				curEvent = null;

			} else if (nextCall.equals('䆍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getArtBox()> ");
				curEvent = '䆍';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getArtBox();
				curEvent = null;

			} else if (nextCall.equals('㶒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNameTree: java.util.Map getNames()> ");
				curEvent = '㶒';
				com.itextpdf.kernel.pdf.PdfNameTree cls = (com.itextpdf.kernel.pdf.PdfNameTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNames();
				curEvent = null;

			} else if (nextCall.equals('㶓')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: void <init>(int)> ");
				curEvent = '㶓';
				com.itextpdf.kernel.pdf.PdfNumber ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfNumber(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i5_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i5_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䆘';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖙')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: byte[] getBytes(boolean)> ");
				curEvent = '䖙';
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBytes(arg0);
				curEvent = null;

			} else if (nextCall.equals('㶛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfObject clone()> ");
				curEvent = '㶛';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.clone();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䶟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䶟';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDate: com.itextpdf.kernel.pdf.PdfObject getPdfObject()> ");
				curEvent = '㶠';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfDate cls = (com.itextpdf.kernel.pdf.PdfDate) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㦤')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()> ");
				curEvent = '㦤';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㦨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfOutline: com.itextpdf.kernel.pdf.PdfDictionary getContent()> ");
				curEvent = '㦨';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				com.itextpdf.kernel.pdf.PdfOutline cls = (com.itextpdf.kernel.pdf.PdfOutline) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getContent();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1505907556_i4_LOOPVAR__1()> ");
				curEvent = '䆩';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getPageSize()> ");
				curEvent = '䆫';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPageSize();
				curEvent = null;

			} else if (nextCall.equals('䦬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.layer.PdfOCProperties getOCProperties(boolean)> ");
				curEvent = '䦬';
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOCProperties(arg0);
				curEvent = null;

			} else if (nextCall.equals('㦱')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfName: java.lang.String getValue()> ");
				curEvent = '㦱';
				com.itextpdf.kernel.pdf.PdfName cls = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getValue();
				curEvent = null;

			} else if (nextCall.equals('㶲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1725199579_i3_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1725199579_i3_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㶲';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void close()> ");
				curEvent = '䦵';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;
            } else  {

		        if (1 == 0) throw new IOException("This makes compiler happy");
                return false;
            }

            return true;

		} catch (Exception | java.lang.AssertionError ex) {
			/* catch all kinds of exceptions (some APIs throw exceptions, we need to make the compiler happy) */
			/* System.out.println("catched IOException: " + ex); */
			//ex.printStackTrace();
			//throw new RuntimeException("Exception | java.lang.AssertionError: " + ex);
            com.fuzz.ExpCollector.addNewCrash(ex);
                  throw new ahg.harness.exception.UnknownException("Handled a caught exception");
		}

    }

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	protected boolean subrun3(Character nextCall) throws HarnessException {
        try {
			if (nextCall.equals('㶸')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㶸';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖹')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.geom.Rectangle toRectangle()> ");
				curEvent = '䖹';
				com.itextpdf.kernel.geom.Rectangle ret;
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.toRectangle();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㖾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void <init>(com.itextpdf.kernel.pdf.PdfReader)> ");
				curEvent = '㖾';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfReader arg0 = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfDocument(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷂')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 674329458_i6_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 674329458_i6_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㷂';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void <init>(com.itextpdf.kernel.pdf.PdfWriter,com.itextpdf.kernel.pdf.DocumentProperties)> ");
				curEvent = '㗄';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfWriter arg0 = (com.itextpdf.kernel.pdf.PdfWriter) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.DocumentProperties arg1 = (com.itextpdf.kernel.pdf.DocumentProperties) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfDocument(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗄')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: void <init>(com.itextpdf.kernel.pdf.PdfArray)> ");
				curEvent = '䗄';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.pdf.PdfArray arg0 = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1171539394_i5_LOOPVAR__1()> ");
				curEvent = '䧆';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1767161708_i4_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1767161708_i4_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䗊';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗓')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 727368913_i1_LOOPVAR__1()> ");
				curEvent = '䗓';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧔')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1591245780_i5_LOOPVAR__0()> ");
				curEvent = '䧔';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䇧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.xobject.PdfImageXObject getThumbnailImage()> ");
				curEvent = '䇧';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getThumbnailImage();
				curEvent = null;

			} else if (nextCall.equals('㷮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: void <init>(com.itextpdf.kernel.pdf.PdfObject)> ");
				curEvent = '㷮';
				com.itextpdf.kernel.pdf.PdfArray ret;
				com.itextpdf.kernel.pdf.PdfObject arg0 = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1052905506_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-1052905506_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㧲';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-419521716_i1_LOOPVAR__1'()> ");
				curEvent = '㷲';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: java.lang.String[] getPageLabels()> ");
				curEvent = '㷵';
				java.lang.String[] ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageLabels();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1380518653_i2_LOOPVAR__0'()> ");
				curEvent = '䧵';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㗶';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.get(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1586739129_i4_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 1586739129_i4_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㗻';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfResources: com.itextpdf.kernel.pdf.PdfDictionary getResource(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '䗻';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfResources cls = (com.itextpdf.kernel.pdf.PdfResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getResource(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfName: boolean equals(java.lang.Object)> ");
				curEvent = '䧻';
				boolean ret;
				java.lang.Object arg0 = (java.lang.Object) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfName cls = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.equals(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i5_LOOPVAR__1'()> ");
				curEvent = '㧿';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-2074001042_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-2074001042_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䈀';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfResources: void <init>()> ");
				curEvent = '䘁';
				com.itextpdf.kernel.pdf.PdfResources ret;
				ret = new com.itextpdf.kernel.pdf.PdfResources();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘅')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfOutline: java.lang.Object <com.itextpdf.kernel.pdf.PdfOutline: java.util.List getAllChildren()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䘅';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1335348288_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1335348288_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䈆';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasXrefStm()> ");
				curEvent = '㸉';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasXrefStm();
				curEvent = null;

			} else if (nextCall.equals('䨊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䨊';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfStream newContentStreamBefore()> ");
				curEvent = '㨋';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.newContentStreamBefore();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 399924090_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 399924090_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䈋';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈌')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfObject makeIndirect(com.itextpdf.kernel.pdf.PdfDocument)> ");
				curEvent = '䈌';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfDocument arg0 = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.makeIndirect(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘌')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfTextArray: void <init>()> ");
				curEvent = '䘌';
				new com.itextpdf.kernel.pdf.PdfTextArray();
				curEvent = null;

			} else if (nextCall.equals('㨍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i5_LOOPVAR__1()> ");
				curEvent = '㨍';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()> ");
				curEvent = '䈍';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getLastPage()> ");
				curEvent = '㨒';
				com.itextpdf.kernel.pdf.PdfPage ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLastPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()> ");
				curEvent = '䈘';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfStream newContentStreamAfter()> ");
				curEvent = '㨜';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.newContentStreamAfter();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2025637630_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 2025637630_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䘧';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfStream getAsStream(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㨩';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㘪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i3_LOOPVAR__1'()> ");
				curEvent = '㘪';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: int '-940429085_i22_LOOPVAR__0'()> ");
				curEvent = '㨬';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void <init>(com.itextpdf.kernel.pdf.PdfReader,com.itextpdf.kernel.pdf.PdfWriter)> ");
				curEvent = '䘮';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfReader arg0 = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfWriter arg1 = (com.itextpdf.kernel.pdf.PdfWriter) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfDocument(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘱')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: void <init>(java.lang.String,java.lang.String)> ");
				curEvent = '䘱';
				com.itextpdf.kernel.pdf.PdfString ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.lang.String arg1 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfString(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2025637630_i1_LOOPVAR__1()> ");
				curEvent = '㸲';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䨲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()> ");
				curEvent = '䨲';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㸴';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㨺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㨺';
				com.itextpdf.kernel.pdf.PdfNumber ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsNumber(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㩀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfName: int compareTo(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㩀';
				int ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfName cls = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.compareTo(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㩃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isString()> ");
				curEvent = '㩃';
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isString();
				curEvent = null;

			} else if (nextCall.equals('㙇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfDictionary getTrailer()> ");
				curEvent = '㙇';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getTrailer();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙈')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-2038963196_i6_LOOPVAR__0'()> ");
				curEvent = '㙈';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㩈')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: long getPermissions()> ");
				curEvent = '㩈';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPermissions();
				curEvent = null;

			} else if (nextCall.equals('㙍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: int getCryptoMode()> ");
				curEvent = '㙍';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCryptoMode();
				curEvent = null;

			} else if (nextCall.equals('㙎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int getPageNumber(com.itextpdf.kernel.pdf.PdfPage)> ");
				curEvent = '㙎';
				int ret;
				com.itextpdf.kernel.pdf.PdfPage arg0 = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageNumber(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: void release()> ");
				curEvent = '䙎';
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.release();
				curEvent = null;

			} else if (nextCall.equals('㙐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 968858636_i1_LOOPVAR__1()> ");
				curEvent = '㙐';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1722087346_i1_LOOPVAR__1()> ");
				curEvent = '䉑';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfIndirectReference: int getObjNumber()> ");
				curEvent = '䙘';
				com.itextpdf.kernel.pdf.PdfIndirectReference cls = (com.itextpdf.kernel.pdf.PdfIndirectReference) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getObjNumber();
				curEvent = null;

			} else if (nextCall.equals('㙟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i4_LOOPVAR__1()> ");
				curEvent = '㙟';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䩟';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㩢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfName getTabOrder()> ");
				curEvent = '㩢';
				com.itextpdf.kernel.pdf.PdfName ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getTabOrder();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙤')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-697437535_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-697437535_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㙤';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: java.lang.Object <com.itextpdf.kernel.pdf.PdfPage: java.util.List getAnnotations()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䩭';
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				arg0.next();
				curEvent = null;

			} else if (nextCall.equals('㩰')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> ");
				curEvent = '㩰';
				int ret;
				com.itextpdf.kernel.pdf.PdfNumber cls = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.intValue();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㩲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()> ");
				curEvent = '㩲';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㹴';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䙶';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙸')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: com.itextpdf.kernel.pdf.PdfAConformanceLevel getPdfAConformanceLevel()> ");
				curEvent = '䙸';
				com.itextpdf.kernel.pdf.PdfAConformanceLevel ret;
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfAConformanceLevel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1052905506_i1_LOOPVAR__0'()> ");
				curEvent = '㙽';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-560452335_i4_LOOPVAR__1'()> ");
				curEvent = '䙿';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1586739129_i4_LOOPVAR__0()> ");
				curEvent = '䊇';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1206117909_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1206117909_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䚋';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.geom.PageSize getDefaultPageSize()> ");
				curEvent = '䊐';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDefaultPageSize();
				curEvent = null;

			} else if (nextCall.equals('㪗')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: java.util.Iterator iterator()> ");
				curEvent = '㪗';
				java.util.Iterator ret;
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚙')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㚙';
				com.itextpdf.kernel.pdf.PdfNumber ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsNumber(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊚')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䊚';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䪟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfResources getResources()> ");
				curEvent = '䪟';
				com.itextpdf.kernel.pdf.PdfResources ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getResources();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1933778162_i4_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1933778162_i4_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㪠';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getRotation()> ");
				curEvent = '䚢';
				int ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRotation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䪤')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()> ");
				curEvent = '䪤';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺥')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> ");
				curEvent = '㺥';
				int ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfPdfObjects();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1274298933_i2_LOOPVAR__0'()> ");
				curEvent = '㺪';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚯')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i6_LOOPVAR__1'()> ");
				curEvent = '㚯';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䪹')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName,boolean)> ");
				curEvent = '䪹';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				boolean arg1 = (boolean) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.get(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2854530_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 2854530_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䚻';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: void <init>(int[])> ");
				curEvent = '㺽';
				com.itextpdf.kernel.pdf.PdfArray ret;
				int[] arg0 = (int[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getPage(int)> ");
				curEvent = '䋁';
				com.itextpdf.kernel.pdf.PdfPage ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䛆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i4_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i4_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䛆';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: void <init>(double)> ");
				curEvent = '䫉';
				com.itextpdf.kernel.pdf.PdfNumber ret;
				double arg0 = (double) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfNumber(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2854530_i1_LOOPVAR__1()> ");
				curEvent = '㻍';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䛎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isNull()> ");
				curEvent = '䛎';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isNull();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㛑')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1912957314_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1912957314_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㛑';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫝')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: java.lang.Boolean getAsBool(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㫝';
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAsBool(arg0);
				curEvent = null;

			} else if (nextCall.equals('䛣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1662017370_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1662017370_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䛣';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()> ");
				curEvent = '㫦';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻨')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void initializeOutlines()> ");
				curEvent = '㻨';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.initializeOutlines();
				curEvent = null;

			} else if (nextCall.equals('䋮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.font.PdfFont getDefaultFont()> ");
				curEvent = '䋮';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDefaultFont();
				curEvent = null;

			} else if (nextCall.equals('㻰')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-14792416_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-14792416_i1_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㻰';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;
            } else  {
		        if (1 == 0) throw new IOException("This makes compiler happy");
                return false;
            }
            return true;

		} catch (Exception | java.lang.AssertionError ex) {
			/* catch all kinds of exceptions (some APIs throw exceptions, we need to make the compiler happy) */
			/* System.out.println("catched IOException: " + ex); */
			//ex.printStackTrace();
			//throw new RuntimeException("Exception | java.lang.AssertionError: " + ex);
            com.fuzz.ExpCollector.addNewCrash(ex);
                  throw new ahg.harness.exception.UnknownException("Handled a caught exception");
		}

    }

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	protected boolean subrun4(Character nextCall) throws HarnessException {
        try {
			if (nextCall.equals('䛳')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: boolean <com.itextpdf.kernel.pdf.PdfArray: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '䛳';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1505907556_i4_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1505907556_i4_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䫴';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫶')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.StampingProperties: com.itextpdf.kernel.pdf.StampingProperties useAppendMode()> ");
				curEvent = '䫶';
				com.itextpdf.kernel.pdf.StampingProperties ret;
				com.itextpdf.kernel.pdf.StampingProperties cls = (com.itextpdf.kernel.pdf.StampingProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.useAppendMode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䛺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 817036870_i2_LOOPVAR__1()> ");
				curEvent = '䛺';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫻')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfVersion getPdfVersion()> ");
				curEvent = '䫻';
				com.itextpdf.kernel.pdf.PdfVersion ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfVersion();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋼')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1985597072_i1_LOOPVAR__0()> ");
				curEvent = '䋼';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㛿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㛿';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(java.io.InputStream,com.itextpdf.kernel.pdf.ReaderProperties)> ");
				curEvent = '㜃';
				com.itextpdf.kernel.pdf.PdfReader ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.ReaderProperties arg1 = (com.itextpdf.kernel.pdf.ReaderProperties) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌃')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 823888672_i1_LOOPVAR__1()> ");
				curEvent = '䌃';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜇')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1274298933_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-1274298933_i2_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㜇';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: int '-940429085_i22_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfNumber: int '-940429085_i22_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䌉';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌍')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> ");
				curEvent = '䌍';
				int ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObjectWrapper: com.itextpdf.kernel.pdf.PdfObject getPdfObject()> ");
				curEvent = '䌎';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfObjectWrapper cls = (com.itextpdf.kernel.pdf.PdfObjectWrapper) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPdfObject();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䜎')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocumentInfo: java.lang.String getKeywords()> ");
				curEvent = '䜎';
				com.itextpdf.kernel.pdf.PdfDocumentInfo cls = (com.itextpdf.kernel.pdf.PdfDocumentInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getKeywords();
				curEvent = null;

			} else if (nextCall.equals('䜒')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䜒';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1171539394_i5_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1171539394_i5_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㼛';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䜟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: void <init>(float[])> ");
				curEvent = '䜟';
				com.itextpdf.kernel.pdf.PdfArray ret;
				float[] arg0 = (float[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜡')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.StampingProperties: com.itextpdf.kernel.pdf.StampingProperties preserveEncryption()> ");
				curEvent = '㜡';
				com.itextpdf.kernel.pdf.StampingProperties ret;
				com.itextpdf.kernel.pdf.StampingProperties cls = (com.itextpdf.kernel.pdf.StampingProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.preserveEncryption();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfObject makeIndirect(com.itextpdf.kernel.pdf.PdfDocument)> ");
				curEvent = '㜢';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfDocument arg0 = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.makeIndirect(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䜣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: boolean <com.itextpdf.kernel.pdf.PdfDictionary: java.util.Set keySet()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䜣';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfResources: com.itextpdf.kernel.pdf.colorspace.PdfShading getShading(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㜦';
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfResources cls = (com.itextpdf.kernel.pdf.PdfResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getShading(arg0);
				curEvent = null;

			} else if (nextCall.equals('㬧')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 1985597072_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 1985597072_i1_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㬧';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()> ");
				curEvent = '㼪';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䬪';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: void <init>(com.itextpdf.kernel.pdf.PdfWriter)> ");
				curEvent = '䬫';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfWriter arg0 = (com.itextpdf.kernel.pdf.PdfWriter) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfDocument(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1177218402_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1177218402_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䌲';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfCatalog getCatalog()> ");
				curEvent = '㬵';
				com.itextpdf.kernel.pdf.PdfCatalog ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCatalog();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: boolean isClosed()> ");
				curEvent = '䌵';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isClosed();
				curEvent = null;

			} else if (nextCall.equals('䜷')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-979698269_i5_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-979698269_i5_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䜷';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬹')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-1517705716_i2_LOOPVAR__0'()> ");
				curEvent = '㬹';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1479062844_i1_LOOPVAR__1'()> ");
				curEvent = '䌺';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬼')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocumentInfo: java.lang.String getSubject()> ");
				curEvent = '䬼';
				com.itextpdf.kernel.pdf.PdfDocumentInfo cls = (com.itextpdf.kernel.pdf.PdfDocumentInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSubject();
				curEvent = null;

			} else if (nextCall.equals('㜽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1933778162_i4_LOOPVAR__0'()> ");
				curEvent = '㜽';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1725199579_i3_LOOPVAR__1()> ");
				curEvent = '䌾';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬿')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: java.lang.String getEncoding()> ");
				curEvent = '䬿';
				java.lang.String ret;
				com.itextpdf.kernel.pdf.PdfString cls = (com.itextpdf.kernel.pdf.PdfString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEncoding();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: byte[] getBytes()> ");
				curEvent = '㽀';
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBytes();
				curEvent = null;

			} else if (nextCall.equals('䍅')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: int getAnnotsSize()> ");
				curEvent = '䍅';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAnnotsSize();
				curEvent = null;

			} else if (nextCall.equals('㽌')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: java.util.List getOutlines(boolean)> ");
				curEvent = '㽌';
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOutlines(arg0);
				curEvent = null;

			} else if (nextCall.equals('㽏')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.tagutils.TagStructureContext getTagStructureContext()> ");
				curEvent = '㽏';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTagStructureContext();
				curEvent = null;

			} else if (nextCall.equals('㭕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: byte[] getXmpMetadata()> ");
				curEvent = '㭕';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getXmpMetadata();
				curEvent = null;

			} else if (nextCall.equals('䍕')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䍕';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭗')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfOutputStream getOutputStream()> ");
				curEvent = '㭗';
				com.itextpdf.kernel.pdf.PdfOutputStream ret;
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOutputStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfArray getAsArray(int)> ");
				curEvent = '㭜';
				com.itextpdf.kernel.pdf.PdfArray ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsArray(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 2138592377_i2_LOOPVAR__0()> ");
				curEvent = '䭜';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: long getFileLength()> ");
				curEvent = '㽣';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileLength();
				curEvent = null;

			} else if (nextCall.equals('䍤')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1565482921_$i1_LOOPVAR__(🞮 - 1)'()> ");
				curEvent = '䍤';
				int ret = 0;
				//ret = ((🞮 - 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfAConformanceLevel: java.lang.String getPart()> ");
				curEvent = '㝫';
				com.itextpdf.kernel.pdf.PdfAConformanceLevel cls = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPart();
				curEvent = null;

			} else if (nextCall.equals('䍭')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-979698269_i5_LOOPVAR__0'()> ");
				curEvent = '䍭';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfString getAsString(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㭮';
				com.itextpdf.kernel.pdf.PdfString ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsString(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䍲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfIndirectReference: com.itextpdf.kernel.pdf.PdfObject getRefersTo()> ");
				curEvent = '䍲';
				com.itextpdf.kernel.pdf.PdfObject ret;
				com.itextpdf.kernel.pdf.PdfIndirectReference cls = (com.itextpdf.kernel.pdf.PdfIndirectReference) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRefersTo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 823888672_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 823888672_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㭴';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfViewerPreferences getViewerPreferences()> ");
				curEvent = '䝴';
				com.itextpdf.kernel.pdf.PdfViewerPreferences ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getViewerPreferences();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: byte getType()> ");
				curEvent = '㭵';
				byte ret;
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getType();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽸')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int '-2038963196_i6_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfArray: int '-2038963196_i6_LOOPVAR__0'()>.RET_(arg0 + 8)(int)> ");
				curEvent = '㽸';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 8));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭹')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1468506284_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1468506284_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㭹';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfName getAsName(com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㭺';
				com.itextpdf.kernel.pdf.PdfName ret;
				com.itextpdf.kernel.pdf.PdfName arg0 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsName(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㭾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isIndirect()> ");
				curEvent = '㭾';
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isIndirect();
				curEvent = null;

			} else if (nextCall.equals('䮁')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfStream: void flush()> ");
				curEvent = '䮁';
				com.itextpdf.kernel.pdf.PdfStream cls = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.flush();
				curEvent = null;

			} else if (nextCall.equals('㾆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()> ");
				curEvent = '㾆';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㾈')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1446985189_i23_LOOPVAR__0()> ");
				curEvent = '㾈';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎊')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.collection.PdfCollection getCollection()> ");
				curEvent = '䎊';
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCollection();
				curEvent = null;

			} else if (nextCall.equals('䎋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfString: java.lang.String getValue()> ");
				curEvent = '䎋';
				com.itextpdf.kernel.pdf.PdfString cls = (com.itextpdf.kernel.pdf.PdfString) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getValue();
				curEvent = null;

			} else if (nextCall.equals('䮋')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()> ");
				curEvent = '䮋';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDictionary: int size()> ");
				curEvent = '䎐';
				int ret;
				com.itextpdf.kernel.pdf.PdfDictionary cls = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.size();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䮐')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfName: void <init>(java.lang.String)> ");
				curEvent = '䮐';
				com.itextpdf.kernel.pdf.PdfName ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfName(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㮓')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNumber: double getValue()> ");
				curEvent = '㮓';
				com.itextpdf.kernel.pdf.PdfNumber cls = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getValue();
				curEvent = null;

			} else if (nextCall.equals('㮖')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i6_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i6_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㮖';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䮖')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isCloseStream()> ");
				curEvent = '䮖';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isCloseStream();
				curEvent = null;

			} else if (nextCall.equals('㮛')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㮛';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㾟')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfAnnotationBorder: void <init>(float,float,float,com.itextpdf.kernel.pdf.PdfDashPattern)> ");
				curEvent = '㾟';
				com.itextpdf.kernel.pdf.PdfAnnotationBorder ret;
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				float arg2 = (float) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				com.itextpdf.kernel.pdf.PdfDashPattern arg3 = (com.itextpdf.kernel.pdf.PdfDashPattern) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				ret = new com.itextpdf.kernel.pdf.PdfAnnotationBorder(arg0,arg1,arg2,arg3);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎠')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getPageSizeWithRotation()> ");
				curEvent = '䎠';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPageSizeWithRotation();
				curEvent = null;

			} else if (nextCall.equals('㞦')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 968858636_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 968858636_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㞦';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㾫')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: boolean isPageRotationInverseMatrixWritten()> ");
				curEvent = '㾫';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPageRotationInverseMatrixWritten();
				curEvent = null;

			} else if (nextCall.equals('㞬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: void <init>(java.lang.String)> ");
				curEvent = '㞬';
				com.itextpdf.kernel.pdf.PdfReader ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.itextpdf.kernel.pdf.PdfReader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㾲')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfDocument getDocument()> ");
				curEvent = '㾲';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfCatalog cls = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocument();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㞽')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㞽';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()> ");
				curEvent = '㯀';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䯀')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()> ");
				curEvent = '䯀';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯂')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean hasHybridXref()> ");
				curEvent = '㯂';
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasHybridXref();
				curEvent = null;

			} else if (nextCall.equals('㯆')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfNameTree: void <init>(com.itextpdf.kernel.pdf.PdfCatalog,com.itextpdf.kernel.pdf.PdfName)> ");
				curEvent = '㯆';
				com.itextpdf.kernel.pdf.PdfNameTree ret;
				com.itextpdf.kernel.pdf.PdfCatalog arg0 = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfName arg1 = (com.itextpdf.kernel.pdf.PdfName) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.itextpdf.kernel.pdf.PdfNameTree(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㿈')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfDocument getDocument()> ");
				curEvent = '㿈';
				com.itextpdf.kernel.pdf.PdfDocument ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocument();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfOutline: void <init>(java.lang.String,com.itextpdf.kernel.pdf.PdfDictionary,com.itextpdf.kernel.pdf.PdfOutline)> ");
				curEvent = '㟉';
				com.itextpdf.kernel.pdf.PdfOutline ret = null;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfDictionary arg1 = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.itextpdf.kernel.pdf.PdfOutline arg2 = (com.itextpdf.kernel.pdf.PdfOutline) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				//ret = new com.itextpdf.kernel.pdf.PdfOutline(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏉')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1446985189_i23_LOOPVAR_<com.itextpdf.kernel.pdf.PdfDocument: int 1446985189_i23_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䏉';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯓')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㯓';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏗')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 1468506284_i1_LOOPVAR__1()> ");
				curEvent = '䏗';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟘')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-402781014_i2_LOOPVAR__1'()> ");
				curEvent = '㟘';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟙')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i2_LOOPVAR_<com'.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i2_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㟙';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䯜')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.commons.actions.sequence.SequenceId getDocumentIdWrapper()> ");
				curEvent = '䯜';
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDocumentIdWrapper();
				curEvent = null;

			} else if (nextCall.equals('䯢')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: java.util.List getAnnotations()> ");
				curEvent = '䯢';
				java.util.List ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnnotations();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟣')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfDictionary getAsDictionary(int)> ");
				curEvent = '㟣';
				com.itextpdf.kernel.pdf.PdfDictionary ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.itextpdf.kernel.pdf.PdfArray cls = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAsDictionary(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䯥')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfReader: boolean isOpenedWithFullPermission()> ");
				curEvent = '䯥';
				boolean ret;
				com.itextpdf.kernel.pdf.PdfReader cls = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isOpenedWithFullPermission();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䯩')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getMediaBox()> ");
				curEvent = '䯩';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMediaBox();
				curEvent = null;

			} else if (nextCall.equals('㯪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getFirstPage()> ");
				curEvent = '㯪';
				com.itextpdf.kernel.pdf.PdfPage ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFirstPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟪')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.pdf.PdfStream getLastContentStream()> ");
				curEvent = '䟪';
				com.itextpdf.kernel.pdf.PdfStream ret;
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLastContentStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯬')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfReader getReader()> ");
				curEvent = '㯬';
				com.itextpdf.kernel.pdf.PdfReader ret;
				com.itextpdf.kernel.pdf.PdfDocument cls = (com.itextpdf.kernel.pdf.PdfDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getReader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟮')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.ReaderProperties: void clearEncryptionParams()> ");
				curEvent = '㟮';
				com.itextpdf.kernel.pdf.ReaderProperties cls = (com.itextpdf.kernel.pdf.ReaderProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.clearEncryptionParams();
				curEvent = null;

			} else if (nextCall.equals('㿴')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()> ");
				curEvent = '㿴';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.ReaderProperties: void <init>()> ");
				curEvent = '㟵';
				com.itextpdf.kernel.pdf.ReaderProperties ret;
				ret = new com.itextpdf.kernel.pdf.ReaderProperties();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏵')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 2001251970_i1_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 2001251970_i1_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䏵';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯷')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.StampingProperties: void <init>()> ");
				curEvent = '㯷';
				com.itextpdf.kernel.pdf.StampingProperties ret;
				ret = new com.itextpdf.kernel.pdf.StampingProperties();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏹')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfPage: byte[] getContentBytes()> ");
				curEvent = '䏹';
				com.itextpdf.kernel.pdf.PdfPage cls = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContentBytes();
				curEvent = null;

			} else if (nextCall.equals('䏺')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfObject: boolean isIndirectReference()> ");
				curEvent = '䏺';
				com.itextpdf.kernel.pdf.PdfObject cls = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isIndirectReference();
				curEvent = null;

			} else if (nextCall.equals('䏾')) {
				if (debug) System.out.println("Calling <com.itextpdf.kernel.pdf.PdfArray: int 2138592377_i2_LOOPVAR_<com.itextpdf.kernel.pdf.PdfArray: int 2138592377_i2_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䏾';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else  {
		        if (1 == 0) throw new IOException("This makes compiler happy");
                return false;
            }
            return true;

		} catch (Exception | java.lang.AssertionError ex) {
			/* catch all kinds of exceptions (some APIs throw exceptions, we need to make the compiler happy) */
			/* System.out.println("catched IOException: " + ex); */
			//ex.printStackTrace();
			//throw new RuntimeException("Exception | java.lang.AssertionError: " + ex);
            com.fuzz.ExpCollector.addNewCrash(ex);
                  throw new ahg.harness.exception.UnknownException("Handled a caught exception");
		}

    }

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	@Override
	protected void runNextCall(Character nextCall) throws HarnessException {
        boolean find = false;
        find = subrun1(nextCall);
        if (!find)
            find = subrun2(nextCall);
        if (!find)
            find = subrun3(nextCall);
        if (!find)
            find = subrun4(nextCall);
        if (!find) {
		    throw new RuntimeException("this should not happen, an unknown func letter '" + nextCall + "'");
        }

	}

	@SuppressWarnings("IdentityBinaryExpression")
	@Override
	protected Character checkCondTriggers(List<Character> conds) throws HarnessException {
		Character happenedEvent = null;

		for (Character cond : conds) {

			boolean satisfies = false;

			if (cond.equals('㰁')) {
				curEvent = '㰁';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (v_268_ == 0);
				curEvent = null;

			} else if (cond.equals('䰉')) {
				curEvent = '䰉';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()> */
				int v_38_ = (int) getVarValue(getOutVar('䒉', "ret"));
				satisfies = (v_38_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䰋')) {
				curEvent = '䰋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()> */
				int v_74_ = (int) getVarValue(getOutVar('䈍', "ret"));
				satisfies = (Not(v_74_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䀐')) {
				curEvent = '䀐';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()> */
				int v_48_ = (int) getVarValue(getOutVar('䕡', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (v_48_ <= v_190_);
				curEvent = null;

			} else if (cond.equals('㠞')) {
				curEvent = '㠞';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (Not(v_268_ == 0));
				curEvent = null;

			} else if (cond.equals('㐟')) {
				curEvent = '㐟';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: int size()> */
				int v_9_ = (int) getVarValue(getOutVar('䎐', "ret"));
				satisfies = (v_9_ == 0);
				curEvent = null;

			} else if (cond.equals('㰟')) {
				curEvent = '㰟';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1767161708_i4_LOOPVAR__0()> */
				int v_156_ = (int) getVarValue(getOutVar('䄞', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (v_190_ <= v_156_);
				curEvent = null;

			} else if (cond.equals('䀠')) {
				curEvent = '䀠';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (v_64_ == 16);
				curEvent = null;

			} else if (cond.equals('䐡')) {
				curEvent = '䐡';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 8);
				curEvent = null;

			} else if (cond.equals('㠣')) {
				curEvent = '㠣';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 4);
				curEvent = null;

			} else if (cond.equals('䀤')) {
				curEvent = '䀤';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-402781014_i2_LOOPVAR__1'()> */
				int v_127_ = (int) getVarValue(getOutVar('㟘', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_127_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䀥')) {
				curEvent = '䀥';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isStream()> */
				boolean v_85_ = (boolean) getVarValue(getOutVar('䕧', "ret"));
				satisfies = (Not(v_85_ == false));
				curEvent = null;

			} else if (cond.equals('㠦')) {
				curEvent = '㠦';
				/* <com.itextpdf.kernel.pdf.PdfName: int compareTo(com.itextpdf.kernel.pdf.PdfName)> */
				int v_16_ = (int) getVarValue(getOutVar('㩀', "ret"));
				satisfies = (Not(v_16_ == 0));
				curEvent = null;

			} else if (cond.equals('䰨')) {
				curEvent = '䰨';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1228751848_i1_LOOPVAR__1'()> */
				int v_15_ = (int) getVarValue(getOutVar('䂪', "ret"));
				satisfies = (Not(v_15_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㠫')) {
				curEvent = '㠫';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-2038963196_i6_LOOPVAR__0'()> */
				int v_66_ = (int) getVarValue(getOutVar('㙈', "ret"));
				satisfies = (Not(v_268_ <= v_66_));
				curEvent = null;

			} else if (cond.equals('㐮')) {
				curEvent = '㐮';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isStream()> */
				boolean v_85_ = (boolean) getVarValue(getOutVar('䕧', "ret"));
				satisfies = (v_85_ == false);
				curEvent = null;

			} else if (cond.equals('䐲')) {
				curEvent = '䐲';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()> */
				int v_133_ = (int) getVarValue(getOutVar('d', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_133_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㠳')) {
				curEvent = '㠳';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfObject v_95_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('㗶', "ret"));
				satisfies = (v_95_ == null);
				curEvent = null;

			} else if (cond.equals('㰼')) {
				curEvent = '㰼';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 2001251970_i1_LOOPVAR__0()> */
				int v_224_ = (int) getVarValue(getOutVar('㵅', "ret"));
				satisfies = (v_268_ <= v_224_);
				curEvent = null;

			} else if (cond.equals('䰼')) {
				curEvent = '䰼';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfObject getPdfObject(int)> */
				com.itextpdf.kernel.pdf.PdfObject v_246_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䕏', "ret"));
				satisfies = (Not(v_246_ == null));
				curEvent = null;

			} else if (cond.equals('㱁')) {
				curEvent = '㱁';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-14792416_i1_LOOPVAR__0'()> */
				int v_23_ = (int) getVarValue(getOutVar('䠎', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (Not(v_190_ <= v_23_));
				curEvent = null;

			} else if (cond.equals('䁁')) {
				curEvent = '䁁';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(v_64_ == 16));
				curEvent = null;

			} else if (cond.equals('B')) {
				curEvent = 'B';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isArray()> */
				boolean v_245_ = (boolean) getVarValue(getOutVar('㱺', "ret"));
				satisfies = (Not(v_245_ == false));
				curEvent = null;

			} else if (cond.equals('䑅')) {
				curEvent = '䑅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()> */
				int v_111_ = (int) getVarValue(getOutVar('㕧', "ret"));
				satisfies = (v_111_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('G')) {
				curEvent = 'G';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfWriter getWriter()> */
				com.itextpdf.kernel.pdf.PdfWriter v_89_ = (com.itextpdf.kernel.pdf.PdfWriter) getVarValue(getOutVar('䣓', "ret"));
				satisfies = (v_89_ == null);
				curEvent = null;

			} else if (cond.equals('㑇')) {
				curEvent = '㑇';
				/* <com.itextpdf.kernel.pdf.PdfIndirectReference: com.itextpdf.kernel.pdf.PdfObject getRefersTo()> */
				com.itextpdf.kernel.pdf.PdfObject v_270_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䍲', "ret"));
				satisfies = (Not(v_270_ == null));
				curEvent = null;

			} else if (cond.equals('䱐')) {
				curEvent = '䱐';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (v_268_ == 1);
				curEvent = null;

			} else if (cond.equals('䑕')) {
				curEvent = '䑕';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_218_ <= 2);
				curEvent = null;

			} else if (cond.equals('䡕')) {
				curEvent = '䡕';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfReader getReader()> */
				com.itextpdf.kernel.pdf.PdfReader v_167_ = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(getOutVar('㯬', "ret"));
				satisfies = (v_167_ == null);
				curEvent = null;

			} else if (cond.equals('䑝')) {
				curEvent = '䑝';
				/* <com.itextpdf.kernel.pdf.PdfArray: boolean <com.itextpdf.kernel.pdf.PdfArray: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_14_ = (boolean) getVarValue(getOutVar('䛳', "ret"));
				satisfies = (Not(v_14_ == false));
				curEvent = null;

			} else if (cond.equals('㱞')) {
				curEvent = '㱞';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 2138592377_i2_LOOPVAR__0()> */
				int v_97_ = (int) getVarValue(getOutVar('䭜', "ret"));
				satisfies = (Not(v_268_ <= v_97_));
				curEvent = null;

			} else if (cond.equals('㱢')) {
				curEvent = '㱢';
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1052905506_i1_LOOPVAR__0'()> */
				int v_154_ = (int) getVarValue(getOutVar('㙽', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (Not(v_268_ <= v_154_));
				curEvent = null;

			} else if (cond.equals('c')) {
				curEvent = 'c';
				/* <com.itextpdf.kernel.pdf.PdfDocument: java.lang.String[] getPageLabels()> */
				java.lang.String[] v_179_ = (java.lang.String[]) getVarValue(getOutVar('㷵', "ret"));
				satisfies = (Not(v_179_ == null));
				curEvent = null;

			} else if (cond.equals('䡤')) {
				curEvent = '䡤';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-2074001042_i1_LOOPVAR__0'()> */
				int v_39_ = (int) getVarValue(getOutVar('䂶', "ret"));
				satisfies = (Not(v_268_ <= v_39_));
				curEvent = null;

			} else if (cond.equals('㑲')) {
				curEvent = '㑲';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2854530_i1_LOOPVAR__1()> */
				int v_96_ = (int) getVarValue(getOutVar('㻍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_96_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䑷')) {
				curEvent = '䑷';
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1052905506_i1_LOOPVAR__0'()> */
				int v_154_ = (int) getVarValue(getOutVar('㙽', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (v_268_ <= v_154_);
				curEvent = null;

			} else if (cond.equals('㱾')) {
				curEvent = '㱾';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()> */
				int v_227_ = (int) getVarValue(getOutVar('䤵', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_227_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䱿')) {
				curEvent = '䱿';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()> */
				int v_11_ = (int) getVarValue(getOutVar('䕋', "ret"));
				satisfies = (v_11_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䂅')) {
				curEvent = '䂅';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (v_64_ == 5);
				curEvent = null;

			} else if (cond.equals('䂏')) {
				curEvent = '䂏';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()> */
				int v_118_ = (int) getVarValue(getOutVar('㔑', "ret"));
				satisfies = (v_118_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䢗')) {
				curEvent = '䢗';
				/* <com.itextpdf.kernel.pdf.PdfReader: boolean isEncrypted()> */
				boolean v_76_ = (boolean) getVarValue(getOutVar('䰰', "ret"));
				satisfies = (Not(v_76_ == false));
				curEvent = null;

			} else if (cond.equals('䲙')) {
				curEvent = '䲙';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(v_64_ == 8));
				curEvent = null;

			} else if (cond.equals('㲚')) {
				curEvent = '㲚';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(v_64_ == 4));
				curEvent = null;

			} else if (cond.equals('䢠')) {
				curEvent = '䢠';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()> */
				int v_98_ = (int) getVarValue(getOutVar('㦤', "ret"));
				satisfies = (Not(v_98_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䒤')) {
				curEvent = '䒤';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 399924090_i1_LOOPVAR__1()> */
				int v_117_ = (int) getVarValue(getOutVar('䐁', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (Not(v_190_ <= v_117_));
				curEvent = null;

			} else if (cond.equals('㲫')) {
				curEvent = '㲫';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i5_LOOPVAR__1()> */
				int v_94_ = (int) getVarValue(getOutVar('㨍', "ret"));
				satisfies = (Not(v_218_ <= v_94_));
				curEvent = null;

			} else if (cond.equals('䲬')) {
				curEvent = '䲬';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i1_LOOPVAR__1()> */
				int v_74_ = (int) getVarValue(getOutVar('䈍', "ret"));
				satisfies = (v_74_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䢯')) {
				curEvent = '䢯';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1355875391_i1_LOOPVAR__1()> */
				int v_122_ = (int) getVarValue(getOutVar('䐛', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_122_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䢴')) {
				curEvent = '䢴';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isNull()> */
				boolean v_228_ = (boolean) getVarValue(getOutVar('䛎', "ret"));
				satisfies = (Not(v_228_ == false));
				curEvent = null;

			} else if (cond.equals('䂷')) {
				curEvent = '䂷';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1479062844_i1_LOOPVAR__1'()> */
				int v_136_ = (int) getVarValue(getOutVar('䌺', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_136_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䲺')) {
				curEvent = '䲺';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfNumber v_301_ = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(getOutVar('㨺', "ret"));
				satisfies = (Not(v_301_ == null));
				curEvent = null;

			} else if (cond.equals('䓁')) {
				curEvent = '䓁';
				/* <com.itextpdf.kernel.pdf.PdfObject: byte getType()> */
				byte v_191_ = (byte) getVarValue(getOutVar('㭵', "ret"));
				satisfies = (v_191_ == 10);
				curEvent = null;

			} else if (cond.equals('㣂')) {
				curEvent = '㣂';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (true);
				curEvent = null;

			} else if (cond.equals('㳆')) {
				curEvent = '㳆';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: int size()> */
				int v_9_ = (int) getVarValue(getOutVar('䎐', "ret"));
				satisfies = (Not(v_9_ == 0));
				curEvent = null;

			} else if (cond.equals('䣇')) {
				curEvent = '䣇';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-534743232_i1_LOOPVAR__1'()> */
				int v_285_ = (int) getVarValue(getOutVar('䲟', "ret"));
				satisfies = (Not(v_285_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㳋')) {
				curEvent = '㳋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1933778162_i4_LOOPVAR__0'()> */
				int v_229_ = (int) getVarValue(getOutVar('㜽', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (v_190_ <= v_229_);
				curEvent = null;

			} else if (cond.equals('㳌')) {
				curEvent = '㳌';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1206117909_i1_LOOPVAR__1'()> */
				int v_84_ = (int) getVarValue(getOutVar('㴰', "ret"));
				satisfies = (v_84_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䓐')) {
				curEvent = '䓐';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1468506284_i1_LOOPVAR__1()> */
				int v_189_ = (int) getVarValue(getOutVar('䏗', "ret"));
				satisfies = (v_189_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㳑')) {
				curEvent = '㳑';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()> */
				int v_188_ = (int) getVarValue(getOutVar('䪤', "ret"));
				satisfies = (Not(v_188_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䓑')) {
				curEvent = '䓑';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 674329458_i6_LOOPVAR__1()> */
				int v_208_ = (int) getVarValue(getOutVar('䲩', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_208_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䳕')) {
				curEvent = '䳕';
				/* <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getCropBox()> */
				com.itextpdf.kernel.geom.Rectangle v_165_ = (com.itextpdf.kernel.geom.Rectangle) getVarValue(getOutVar('䃎', "ret"));
				satisfies = (v_165_ == null);
				curEvent = null;

			} else if (cond.equals('䓗')) {
				curEvent = '䓗';
				/* <com.itextpdf.kernel.pdf.PdfString: boolean isHexWriting()> */
				boolean v_255_ = (boolean) getVarValue(getOutVar('㣬', "ret"));
				satisfies = (Not(v_255_ == false));
				curEvent = null;

			} else if (cond.equals('㣘')) {
				curEvent = '㣘';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()> */
				int v_177_ = (int) getVarValue(getOutVar('㯀', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_177_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䳘')) {
				curEvent = '䳘';
				/* <com.itextpdf.kernel.pdf.PdfReader: com.itextpdf.kernel.pdf.PdfAConformanceLevel getPdfAConformanceLevel()> */
				com.itextpdf.kernel.pdf.PdfAConformanceLevel v_222_ = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(getOutVar('䙸', "ret"));
				satisfies = (v_222_ == null);
				curEvent = null;

			} else if (cond.equals('䣙')) {
				curEvent = '䣙';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-402781014_i2_LOOPVAR__1'()> */
				int v_127_ = (int) getVarValue(getOutVar('㟘', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_127_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䓚')) {
				curEvent = '䓚';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (Not(v_268_ == 1));
				curEvent = null;

			} else if (cond.equals('䣛')) {
				curEvent = '䣛';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 399924090_i1_LOOPVAR__1()> */
				int v_117_ = (int) getVarValue(getOutVar('䐁', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (v_190_ <= v_117_);
				curEvent = null;

			} else if (cond.equals('㳞')) {
				curEvent = '㳞';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 30312591_i1_LOOPVAR__1()> */
				int v_98_ = (int) getVarValue(getOutVar('㦤', "ret"));
				satisfies = (v_98_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䣟')) {
				curEvent = '䣟';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i5_LOOPVAR__1'()> */
				int v_153_ = (int) getVarValue(getOutVar('㧿', "ret"));
				satisfies = (Not(v_153_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㣡')) {
				curEvent = '㣡';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1586739129_i4_LOOPVAR__0()> */
				int v_171_ = (int) getVarValue(getOutVar('䊇', "ret"));
				satisfies = (Not(v_268_ <= v_171_));
				curEvent = null;

			} else if (cond.equals('䓢')) {
				curEvent = '䓢';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(v_64_ == 1));
				curEvent = null;

			} else if (cond.equals('䳢')) {
				curEvent = '䳢';
				/* <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfViewerPreferences getViewerPreferences()> */
				com.itextpdf.kernel.pdf.PdfViewerPreferences v_305_ = (com.itextpdf.kernel.pdf.PdfViewerPreferences) getVarValue(getOutVar('䝴', "ret"));
				satisfies = (Not(v_305_ == null));
				curEvent = null;

			} else if (cond.equals('䓣')) {
				curEvent = '䓣';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i5_LOOPVAR__1()> */
				int v_94_ = (int) getVarValue(getOutVar('㨍', "ret"));
				satisfies = (v_218_ <= v_94_);
				curEvent = null;

			} else if (cond.equals('㓥')) {
				curEvent = '㓥';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfArray getAsArray(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfArray v_57_ = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(getOutVar('䑋', "ret"));
				satisfies = (v_57_ == null);
				curEvent = null;

			} else if (cond.equals('㳥')) {
				curEvent = '㳥';
				/* <com.itextpdf.kernel.pdf.PdfArray: boolean isEmpty()> */
				boolean v_22_ = (boolean) getVarValue(getOutVar('㰀', "ret"));
				satisfies = (Not(v_22_ == false));
				curEvent = null;

			} else if (cond.equals('㳨')) {
				curEvent = '㳨';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 7);
				curEvent = null;

			} else if (cond.equals('䃨')) {
				curEvent = '䃨';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (Not(v_268_ == 5));
				curEvent = null;

			} else if (cond.equals('䣭')) {
				curEvent = '䣭';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2110937280_i14_LOOPVAR__1()> */
				int v_121_ = (int) getVarValue(getOutVar('䔣', "ret"));
				satisfies = (v_121_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㓮')) {
				curEvent = '㓮';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int '-940429085_i22_LOOPVAR__0'()> */
				int v_8_ = (int) getVarValue(getOutVar('㨬', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(v_64_ <= v_8_));
				curEvent = null;

			} else if (cond.equals('䳮')) {
				curEvent = '䳮';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i4_LOOPVAR__1()> */
				int v_77_ = (int) getVarValue(getOutVar('㙟', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_77_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㣷')) {
				curEvent = '㣷';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()> */
				int v_27_ = (int) getVarValue(getOutVar('㩲', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_27_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㤀')) {
				curEvent = '㤀';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1758565287_i2_LOOPVAR__0'()> */
				int v_126_ = (int) getVarValue(getOutVar('Z', "ret"));
				satisfies = (Not(v_268_ <= v_126_));
				curEvent = null;

			} else if (cond.equals('䤄')) {
				curEvent = '䤄';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 727368913_i1_LOOPVAR__1()> */
				int v_120_ = (int) getVarValue(getOutVar('䗓', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_120_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䄅')) {
				curEvent = '䄅';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-2038963196_i6_LOOPVAR__0'()> */
				int v_66_ = (int) getVarValue(getOutVar('㙈', "ret"));
				satisfies = (v_268_ <= v_66_);
				curEvent = null;

			} else if (cond.equals('㤌')) {
				curEvent = '㤌';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2110937280_i14_LOOPVAR__1()> */
				int v_121_ = (int) getVarValue(getOutVar('䔣', "ret"));
				satisfies = (Not(v_121_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䴌')) {
				curEvent = '䴌';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()> */
				int v_119_ = (int) getVarValue(getOutVar('㓶', "ret"));
				satisfies = (Not(v_119_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㤏')) {
				curEvent = '㤏';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-560452335_i4_LOOPVAR__1'()> */
				int v_101_ = (int) getVarValue(getOutVar('䙿', "ret"));
				satisfies = (Not(v_268_ <= v_101_));
				curEvent = null;

			} else if (cond.equals('㔖')) {
				curEvent = '㔖';
				/* <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(int)> */
				com.itextpdf.kernel.pdf.PdfNumber v_253_ = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(getOutVar('䤾', "ret"));
				satisfies = (v_253_ == null);
				curEvent = null;

			} else if (cond.equals('䔝')) {
				curEvent = '䔝';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()> */
				int v_148_ = (int) getVarValue(getOutVar('䯀', "ret"));
				satisfies = (Not(v_148_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䄡')) {
				curEvent = '䄡';
				/* <com.itextpdf.kernel.pdf.PdfOutline: boolean <com.itextpdf.kernel.pdf.PdfOutline: java.util.List getAllChildren()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_309_ = (boolean) getVarValue(getOutVar('㔺', "ret"));
				satisfies = (Not(v_309_ == false));
				curEvent = null;

			} else if (cond.equals('䤥')) {
				curEvent = '䤥';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i4_LOOPVAR__1()> */
				int v_77_ = (int) getVarValue(getOutVar('㙟', "ret"));
				satisfies = (v_77_ == 1);
				curEvent = null;

			} else if (cond.equals('㴧')) {
				curEvent = '㴧';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i4_LOOPVAR__1()> */
				int v_77_ = (int) getVarValue(getOutVar('㙟', "ret"));
				satisfies = (Not(v_77_ == 1));
				curEvent = null;

			} else if (cond.equals('㴨')) {
				curEvent = '㴨';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1767161708_i4_LOOPVAR__0()> */
				int v_156_ = (int) getVarValue(getOutVar('䄞', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (Not(v_190_ <= v_156_));
				curEvent = null;

			} else if (cond.equals('䤨')) {
				curEvent = '䤨';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getPageNumber(com.itextpdf.kernel.pdf.PdfPage)> */
				int v_266_ = (int) getVarValue(getOutVar('㙎', "ret"));
				satisfies = (Not(v_266_ == 1));
				curEvent = null;

			} else if (cond.equals('䔪')) {
				curEvent = '䔪';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1274298933_i2_LOOPVAR__0'()> */
				int v_53_ = (int) getVarValue(getOutVar('㺪', "ret"));
				satisfies = (Not(v_268_ <= v_53_));
				curEvent = null;

			} else if (cond.equals('䴭')) {
				curEvent = '䴭';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 5);
				curEvent = null;

			} else if (cond.equals('㔰')) {
				curEvent = '㔰';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 118380049_i3_LOOPVAR__0()> */
				int v_75_ = (int) getVarValue(getOutVar('䡠', "ret"));
				satisfies = (Not(v_268_ <= v_75_));
				curEvent = null;

			} else if (cond.equals('䄵')) {
				curEvent = '䄵';
				/* <com.itextpdf.kernel.pdf.PdfDocument: boolean <com.itextpdf.kernel.pdf.PdfDocument: java.util.List listIndirectReferences()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_141_ = (boolean) getVarValue(getOutVar('䃃', "ret"));
				satisfies = (Not(v_141_ == false));
				curEvent = null;

			} else if (cond.equals('㔷')) {
				curEvent = '㔷';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2025637630_i1_LOOPVAR__1()> */
				int v_144_ = (int) getVarValue(getOutVar('㸲', "ret"));
				satisfies = (Not(v_144_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㴹')) {
				curEvent = '㴹';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i2_LOOPVAR__1'()> */
				int v_130_ = (int) getVarValue(getOutVar('䴟', "ret"));
				satisfies = (Not(v_130_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㤺')) {
				curEvent = '㤺';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()> */
				int v_113_ = (int) getVarValue(getOutVar('㖄', "ret"));
				satisfies = (Not(v_113_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䤼')) {
				curEvent = '䤼';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: boolean <com.itextpdf.kernel.pdf.PdfDictionary: java.util.Set keySet()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_87_ = (boolean) getVarValue(getOutVar('䜣', "ret"));
				satisfies = (v_87_ == false);
				curEvent = null;

			} else if (cond.equals('䔽')) {
				curEvent = '䔽';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2025637630_i1_LOOPVAR__1()> */
				int v_144_ = (int) getVarValue(getOutVar('㸲', "ret"));
				satisfies = (v_144_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㵀')) {
				curEvent = '㵀';
				/* <com.itextpdf.kernel.pdf.PdfDocument: boolean isTagged()> */
				boolean v_267_ = (boolean) getVarValue(getOutVar('䡇', "ret"));
				satisfies = (Not(v_267_ == false));
				curEvent = null;

			} else if (cond.equals('㥁')) {
				curEvent = '㥁';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfObject v_115_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䑁', "ret"));
				satisfies = (Not(v_115_ == null));
				curEvent = null;

			} else if (cond.equals('䵁')) {
				curEvent = '䵁';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_218_ <= 2));
				curEvent = null;

			} else if (cond.equals('䵅')) {
				curEvent = '䵅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1725199579_i3_LOOPVAR__1()> */
				int v_173_ = (int) getVarValue(getOutVar('䌾', "ret"));
				satisfies = (Not(v_173_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䅉')) {
				curEvent = '䅉';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()> */
				int v_28_ = (int) getVarValue(getOutVar('㫦', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_28_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䥊')) {
				curEvent = '䥊';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 29577090_i1_LOOPVAR__1()> */
				int v_209_ = (int) getVarValue(getOutVar('㠡', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_209_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㵋')) {
				curEvent = '㵋';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (v_64_ == 8);
				curEvent = null;

			} else if (cond.equals('䥋')) {
				curEvent = '䥋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1912957314_i1_LOOPVAR__1'()> */
				int v_150_ = (int) getVarValue(getOutVar('䑏', "ret"));
				satisfies = (v_150_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㵍')) {
				curEvent = '㵍';
				/* <com.itextpdf.kernel.pdf.PdfDocument: java.lang.String[] getPageLabels()> */
				java.lang.String[] v_179_ = (java.lang.String[]) getVarValue(getOutVar('㷵', "ret"));
				satisfies = (v_179_ == null);
				curEvent = null;

			} else if (cond.equals('㥐')) {
				curEvent = '㥐';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1722087346_i1_LOOPVAR__1()> */
				int v_40_ = (int) getVarValue(getOutVar('䉑', "ret"));
				satisfies = (Not(v_40_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䵑')) {
				curEvent = '䵑';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = false;// (Not(bvsmod_i(v_218_, 2) == 1));
				curEvent = null;

			} else if (cond.equals('㥚')) {
				curEvent = '㥚';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (Not(v_279_ == 0));
				curEvent = null;

			} else if (cond.equals('䅚')) {
				curEvent = '䅚';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1586739129_i4_LOOPVAR__0()> */
				int v_171_ = (int) getVarValue(getOutVar('䊇', "ret"));
				satisfies = (v_268_ <= v_171_);
				curEvent = null;

			} else if (cond.equals('㥟')) {
				curEvent = '㥟';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 2001251970_i1_LOOPVAR__0()> */
				int v_224_ = (int) getVarValue(getOutVar('㵅', "ret"));
				satisfies = (Not(v_268_ <= v_224_));
				curEvent = null;

			} else if (cond.equals('䅡')) {
				curEvent = '䅡';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (And(v_279_ == 6, v_279_ == 3));
				curEvent = null;

			} else if (cond.equals('䵢')) {
				curEvent = '䵢';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfNumber v_301_ = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(getOutVar('㨺', "ret"));
				satisfies = (v_301_ == null);
				curEvent = null;

			} else if (cond.equals('㵣')) {
				curEvent = '㵣';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 2138592377_i2_LOOPVAR__0()> */
				int v_97_ = (int) getVarValue(getOutVar('䭜', "ret"));
				satisfies = (v_268_ <= v_97_);
				curEvent = null;

			} else if (cond.equals('䵤')) {
				curEvent = '䵤';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-73473062_i1_LOOPVAR__9'()> */
				int v_38_ = (int) getVarValue(getOutVar('䒉', "ret"));
				satisfies = (Not(v_38_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䕪')) {
				curEvent = '䕪';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()> */
				int v_1_ = (int) getVarValue(getOutVar('㑽', "ret"));
				satisfies = (v_1_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㥬')) {
				curEvent = '㥬';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int '-940429085_i22_LOOPVAR__0'()> */
				int v_8_ = (int) getVarValue(getOutVar('㨬', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (v_64_ <= v_8_);
				curEvent = null;

			} else if (cond.equals('䥬')) {
				curEvent = '䥬';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(v_64_ == 5));
				curEvent = null;

			} else if (cond.equals('䵯')) {
				curEvent = '䵯';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 29577090_i1_LOOPVAR__1()> */
				int v_209_ = (int) getVarValue(getOutVar('㠡', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_209_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㕱')) {
				curEvent = '㕱';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isNull()> */
				boolean v_228_ = (boolean) getVarValue(getOutVar('䛎', "ret"));
				satisfies = (v_228_ == false);
				curEvent = null;

			} else if (cond.equals('䥱')) {
				curEvent = '䥱';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 968858636_i1_LOOPVAR__1()> */
				int v_7_ = (int) getVarValue(getOutVar('㙐', "ret"));
				satisfies = (Not(v_7_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䵳')) {
				curEvent = '䵳';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1488019270_i3_LOOPVAR__1'()> */
				int v_113_ = (int) getVarValue(getOutVar('㖄', "ret"));
				satisfies = (v_113_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㕶')) {
				curEvent = '㕶';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfIndirectReference getIndirectReference()> */
				com.itextpdf.kernel.pdf.PdfIndirectReference v_283_ = (com.itextpdf.kernel.pdf.PdfIndirectReference) getVarValue(getOutVar('䕦', "ret"));
				satisfies = (Not(v_283_ == null));
				curEvent = null;

			} else if (cond.equals('䵶')) {
				curEvent = '䵶';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (v_268_ <= 0);
				curEvent = null;

			} else if (cond.equals('䕺')) {
				curEvent = '䕺';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = false;
				curEvent = null;

			} else if (cond.equals('䕼')) {
				curEvent = '䕼';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_218_ == 1));
				curEvent = null;

			} else if (cond.equals('㵿')) {
				curEvent = '㵿';
				/* <com.itextpdf.kernel.pdf.PdfIndirectReference: com.itextpdf.kernel.pdf.PdfObject getRefersTo()> */
				com.itextpdf.kernel.pdf.PdfObject v_270_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䍲', "ret"));
				satisfies = (v_270_ == null);
				curEvent = null;

			} else if (cond.equals('䶃')) {
				curEvent = '䶃';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1933778162_i4_LOOPVAR__0'()> */
				int v_229_ = (int) getVarValue(getOutVar('㜽', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (Not(v_190_ <= v_229_));
				curEvent = null;

			} else if (cond.equals('䖋')) {
				curEvent = '䖋';
				/* <com.itextpdf.kernel.pdf.PdfReader: boolean isEncrypted()> */
				boolean v_76_ = (boolean) getVarValue(getOutVar('䰰', "ret"));
				satisfies = (v_76_ == false);
				curEvent = null;

			} else if (cond.equals('㖍')) {
				curEvent = '㖍';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfString getAsString(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfString v_132_ = (com.itextpdf.kernel.pdf.PdfString) getVarValue(getOutVar('㭮', "ret"));
				satisfies = (Not(v_132_ == null));
				curEvent = null;

			} else if (cond.equals('㖏')) {
				curEvent = '㖏';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 118380049_i3_LOOPVAR__0()> */
				int v_75_ = (int) getVarValue(getOutVar('䡠', "ret"));
				satisfies = (v_268_ <= v_75_);
				curEvent = null;

			} else if (cond.equals('㶏')) {
				curEvent = '㶏';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfDictionary getAsDictionary(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfDictionary v_54_ = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(getOutVar('䤶', "ret"));
				satisfies = (v_54_ == null);
				curEvent = null;

			} else if (cond.equals('㦑')) {
				curEvent = '㦑';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (Not((v_279_ == 0) || (v_279_ == 1) || (v_279_ == 2) || (v_279_ == 3) || (v_279_ == 4) || (v_279_ == 5) || (v_279_ == 6) || (v_279_ == 7)) || (v_279_ == 8) || (v_279_ == 9));
				curEvent = null;

			} else if (cond.equals('㶔')) {
				curEvent = '㶔';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1335348288_i1_LOOPVAR__1'()> */
				int v_200_ = (int) getVarValue(getOutVar('㵢', "ret"));
				satisfies = (v_200_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㦕')) {
				curEvent = '㦕';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfCatalog getCatalog()> */
				com.itextpdf.kernel.pdf.PdfCatalog v_212_ = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(getOutVar('㬵', "ret"));
				satisfies = (v_212_ == null);
				curEvent = null;

			} else if (cond.equals('㦜')) {
				curEvent = '㦜';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1171539394_i5_LOOPVAR__1()> */
				int v_213_ = (int) getVarValue(getOutVar('䧆', "ret"));
				satisfies = (Not(v_213_ <= (4294967294L) + v_218_));
				curEvent = null;

			} else if (cond.equals('䆞')) {
				curEvent = '䆞';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getPageNumber(com.itextpdf.kernel.pdf.PdfPage)> */
				int v_266_ = (int) getVarValue(getOutVar('㙎', "ret"));
				satisfies = (v_266_ == 1);
				curEvent = null;

			} else if (cond.equals('䦟')) {
				curEvent = '䦟';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1228751848_i1_LOOPVAR__1'()> */
				int v_15_ = (int) getVarValue(getOutVar('䂪', "ret"));
				satisfies = (v_15_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䶠')) {
				curEvent = '䶠';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfObject v_115_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䑁', "ret"));
				satisfies = (false);
				curEvent = null;

			} else if (cond.equals('㶤')) {
				curEvent = '㶤';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 817036870_i2_LOOPVAR__1()> */
				int v_196_ = (int) getVarValue(getOutVar('䛺', "ret"));
				satisfies = (Not(v_196_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䆤')) {
				curEvent = '䆤';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 578185616_i1_LOOPVAR__1()> */
				int v_133_ = (int) getVarValue(getOutVar('d', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_133_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䖦')) {
				curEvent = '䖦';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1912957314_i1_LOOPVAR__1'()> */
				int v_150_ = (int) getVarValue(getOutVar('䑏', "ret"));
				satisfies = (Not(v_150_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䖧')) {
				curEvent = '䖧';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-116211972_i1_LOOPVAR__1'()> */
				int v_11_ = (int) getVarValue(getOutVar('䕋', "ret"));
				satisfies = (Not(v_11_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㶱')) {
				curEvent = '㶱';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084890898_i1_LOOPVAR__1'()> */
				int v_48_ = (int) getVarValue(getOutVar('䕡', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (Not(v_48_ <= v_190_));
				curEvent = null;

			} else if (cond.equals('䖱')) {
				curEvent = '䖱';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName,boolean)> */
				com.itextpdf.kernel.pdf.PdfObject v_4_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䪹', "ret"));
				satisfies = (v_4_ == null);
				curEvent = null;

			} else if (cond.equals('䦱')) {
				curEvent = '䦱';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i5_LOOPVAR__1'()> */
				int v_153_ = (int) getVarValue(getOutVar('㧿', "ret"));
				satisfies = (v_153_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䦴')) {
				curEvent = '䦴';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1745158872_i1_LOOPVAR__1()> */
				int v_227_ = (int) getVarValue(getOutVar('䤵', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_227_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䆺')) {
				curEvent = '䆺';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfObject v_115_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䑁', "ret"));
				satisfies = (true);
				curEvent = null;

			} else if (cond.equals('䧀')) {
				curEvent = '䧀';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (v_64_ == 1);
				curEvent = null;

			} else if (cond.equals('䇆')) {
				curEvent = '䇆';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1171539394_i5_LOOPVAR__1()> */
				int v_213_ = (int) getVarValue(getOutVar('䧆', "ret"));
				satisfies = (v_213_ <= 4294967294L + v_218_);
				curEvent = null;

			} else if (cond.equals('㗈')) {
				curEvent = '㗈';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1828933688_i2_LOOPVAR__1'()> */
				int v_119_ = (int) getVarValue(getOutVar('㓶', "ret"));
				satisfies = (v_119_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㧉')) {
				curEvent = '㧉';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()> */
				int v_51_ = (int) getVarValue(getOutVar('䨲', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_51_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㷊')) {
				curEvent = '㷊';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()> */
				int v_214_ = (int) getVarValue(getOutVar('䮋', "ret"));
				satisfies = (v_214_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䧊')) {
				curEvent = '䧊';
				/* <com.itextpdf.kernel.pdf.PdfObject: byte getType()> */
				byte v_191_ = (byte) getVarValue(getOutVar('㭵', "ret"));
				satisfies = (Not(v_191_ == 0));
				curEvent = null;

			} else if (cond.equals('䗏')) {
				curEvent = '䗏';
				/* <com.itextpdf.kernel.pdf.PdfString: java.lang.String getEncoding()> */
				java.lang.String v_234_ = (java.lang.String) getVarValue(getOutVar('䬿', "ret"));
				satisfies = (Not(v_234_ == null));
				curEvent = null;

			} else if (cond.equals('䇑')) {
				curEvent = '䇑';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1081523889_i4_LOOPVAR__1()> */
				int v_19_ = (int) getVarValue(getOutVar('㖂', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_19_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䇖')) {
				curEvent = '䇖';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-697437535_i1_LOOPVAR__0'()> */
				int v_219_ = (int) getVarValue(getOutVar('㕉', "ret"));
				satisfies = (v_268_ <= v_219_);
				curEvent = null;

			} else if (cond.equals('㗙')) {
				curEvent = '㗙';
				/* <com.itextpdf.kernel.pdf.PdfOutline: java.util.List getAllChildren()> */
				java.util.List v_26_ = (java.util.List) getVarValue(getOutVar('㕒', "ret"));
				satisfies = (Not(v_26_ == null));
				curEvent = null;

			} else if (cond.equals('㗛')) {
				curEvent = '㗛';
				/* <com.itextpdf.kernel.pdf.PdfStream: boolean containsKey(com.itextpdf.kernel.pdf.PdfName)> */
				boolean v_68_ = (boolean) getVarValue(getOutVar('䣂', "ret"));
				satisfies = (v_68_ == false);
				curEvent = null;

			} else if (cond.equals('䇝')) {
				curEvent = '䇝';
				/* <com.itextpdf.kernel.pdf.PdfDocument: boolean isTagged()> */
				boolean v_267_ = (boolean) getVarValue(getOutVar('䡇', "ret"));
				satisfies = (v_267_ == false);
				curEvent = null;

			} else if (cond.equals('䧢')) {
				curEvent = '䧢';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()> */
				int v_194_ = (int) getVarValue(getOutVar('㿴', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_194_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䗦')) {
				curEvent = '䗦';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfIndirectReference getIndirectReference()> */
				com.itextpdf.kernel.pdf.PdfIndirectReference v_283_ = (com.itextpdf.kernel.pdf.PdfIndirectReference) getVarValue(getOutVar('䕦', "ret"));
				satisfies = (v_283_ == null);
				curEvent = null;

			} else if (cond.equals('䗩')) {
				curEvent = '䗩';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 727368913_i1_LOOPVAR__1()> */
				int v_120_ = (int) getVarValue(getOutVar('䗓', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_120_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䗪')) {
				curEvent = '䗪';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfReader getReader()> */
				com.itextpdf.kernel.pdf.PdfReader v_167_ = (com.itextpdf.kernel.pdf.PdfReader) getVarValue(getOutVar('㯬', "ret"));
				satisfies = (Not(v_167_ == null));
				curEvent = null;

			} else if (cond.equals('䇮')) {
				curEvent = '䇮';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1985597072_i1_LOOPVAR__0()> */
				int v_135_ = (int) getVarValue(getOutVar('䋼', "ret"));
				satisfies = (Not(v_268_ <= v_135_));
				curEvent = null;

			} else if (cond.equals('䇰')) {
				curEvent = '䇰';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1725199579_i3_LOOPVAR__1()> */
				int v_173_ = (int) getVarValue(getOutVar('䌾', "ret"));
				satisfies = (v_173_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䇷')) {
				curEvent = '䇷';
				/* <com.itextpdf.kernel.pdf.PdfOutline: boolean <com.itextpdf.kernel.pdf.PdfOutline: java.util.List getAllChildren()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_309_ = (boolean) getVarValue(getOutVar('㔺', "ret"));
				satisfies = (v_309_ == false);
				curEvent = null;

			} else if (cond.equals('䧺')) {
				curEvent = '䧺';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()> */
				int v_30_ = (int) getVarValue(getOutVar('㑄', "ret"));
				satisfies = (Not(v_30_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㷽')) {
				curEvent = '㷽';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfObject v_95_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('㗶', "ret"));
				satisfies = (Not(v_95_ == null));
				curEvent = null;

			} else if (cond.equals('㘂')) {
				curEvent = '㘂';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 0);
				curEvent = null;

			} else if (cond.equals('䈅')) {
				curEvent = '䈅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1468506284_i1_LOOPVAR__1()> */
				int v_189_ = (int) getVarValue(getOutVar('䏗', "ret"));
				satisfies = (Not(v_189_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䨋')) {
				curEvent = '䨋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1446985189_i23_LOOPVAR__0()> */
				int v_29_ = (int) getVarValue(getOutVar('㾈', "ret"));
				satisfies = (v_218_ <= v_29_);
				curEvent = null;

			} else if (cond.equals('䨎')) {
				curEvent = '䨎';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()> */
				int v_140_ = (int) getVarValue(getOutVar('䈘', "ret"));
				satisfies = (Not(v_140_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䈖')) {
				curEvent = '䈖';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1662017370_i1_LOOPVAR__1()> */
				int v_90_ = (int) getVarValue(getOutVar('䁻', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_90_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㸗')) {
				curEvent = '㸗';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-14792416_i1_LOOPVAR__0'()> */
				int v_23_ = (int) getVarValue(getOutVar('䠎', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (v_190_ <= v_23_);
				curEvent = null;

			} else if (cond.equals('㘚')) {
				curEvent = '㘚';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR__1'()> */
				int v_125_ = (int) getVarValue(getOutVar('䓠', "ret"));
				satisfies = (Not(v_125_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㘟')) {
				curEvent = '㘟';
				/* <com.itextpdf.kernel.pdf.PdfObject: com.itextpdf.kernel.pdf.PdfIndirectReference getIndirectReference()> */
				com.itextpdf.kernel.pdf.PdfIndirectReference v_41_ = (com.itextpdf.kernel.pdf.PdfIndirectReference) getVarValue(getOutVar('㢵', "ret"));
				satisfies = (v_41_ == null);
				curEvent = null;

			} else if (cond.equals('㸤')) {
				curEvent = '㸤';
				/* <com.itextpdf.kernel.pdf.PdfStream: boolean containsKey(com.itextpdf.kernel.pdf.PdfName)> */
				boolean v_68_ = (boolean) getVarValue(getOutVar('䣂', "ret"));
				satisfies = (Not(v_68_ == false));
				curEvent = null;

			} else if (cond.equals('䈤')) {
				curEvent = '䈤';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()> */
				int v_172_ = (int) getVarValue(getOutVar('㼪', "ret"));
				satisfies = (Not(v_172_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㨦')) {
				curEvent = '㨦';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1274298933_i2_LOOPVAR__0'()> */
				int v_53_ = (int) getVarValue(getOutVar('㺪', "ret"));
				satisfies = (v_268_ <= v_53_);
				curEvent = null;

			} else if (cond.equals('䨩')) {
				curEvent = '䨩';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (Not((v_268_ & 4) == 0));
				curEvent = null;

			} else if (cond.equals('㨪')) {
				curEvent = '㨪';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1903791510_i1_LOOPVAR__1()> */
				int v_188_ = (int) getVarValue(getOutVar('䪤', "ret"));
				satisfies = (v_188_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䘫')) {
				curEvent = '䘫';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 823888672_i1_LOOPVAR__1()> */
				int v_147_ = (int) getVarValue(getOutVar('䌃', "ret"));
				satisfies = (v_218_ <= v_147_);
				curEvent = null;

			} else if (cond.equals('㘼')) {
				curEvent = '㘼';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 683853127_i2_LOOPVAR__1()> */
				int v_30_ = (int) getVarValue(getOutVar('㑄', "ret"));
				satisfies = (v_30_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㨼')) {
				curEvent = '㨼';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (v_64_ == 2);
				curEvent = null;

			} else if (cond.equals('㘽')) {
				curEvent = '㘽';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1591245780_i5_LOOPVAR__0()> */
				int v_232_ = (int) getVarValue(getOutVar('䧔', "ret"));
				satisfies = (Not(v_268_ <= v_232_));
				curEvent = null;

			} else if (cond.equals('㸽')) {
				curEvent = '㸽';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfString getAsString(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfString v_132_ = (com.itextpdf.kernel.pdf.PdfString) getVarValue(getOutVar('㭮', "ret"));
				satisfies = (v_132_ == null);
				curEvent = null;

			} else if (cond.equals('㩂')) {
				curEvent = '㩂';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isName()> */
				boolean v_236_ = (boolean) getVarValue(getOutVar('㔐', "ret"));
				satisfies = (v_236_ == false);
				curEvent = null;

			} else if (cond.equals('䙃')) {
				curEvent = '䙃';
				/* <com.itextpdf.kernel.pdf.PdfName: boolean equals(java.lang.Object)> */
				boolean v_17_ = (boolean) getVarValue(getOutVar('䧻', "ret"));
				satisfies = (v_17_ == false);
				curEvent = null;

			} else if (cond.equals('㹄')) {
				curEvent = '㹄';
				/* <com.itextpdf.kernel.pdf.PdfArray: boolean isEmpty()> */
				boolean v_22_ = (boolean) getVarValue(getOutVar('㰀', "ret"));
				satisfies = (v_22_ == false);
				curEvent = null;

			} else if (cond.equals('㹇')) {
				curEvent = '㹇';
				/* <com.itextpdf.kernel.pdf.PdfName: boolean equals(java.lang.Object)> */
				boolean v_17_ = (boolean) getVarValue(getOutVar('䧻', "ret"));
				satisfies = (Not(v_17_ == false));
				curEvent = null;

			} else if (cond.equals('䙋')) {
				curEvent = '䙋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-800408307_i1_LOOPVAR__1'()> */
				int v_140_ = (int) getVarValue(getOutVar('䈘', "ret"));
				satisfies = (v_140_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䉍')) {
				curEvent = '䉍';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1670733914_i1_LOOPVAR__1()> */
				int v_1_ = (int) getVarValue(getOutVar('㑽', "ret"));
				satisfies = (Not(v_1_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㩐')) {
				curEvent = '㩐';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 1);
				curEvent = null;

			} else if (cond.equals('䩐')) {
				curEvent = '䩐';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = ((v_268_ & 256) == 0);
				curEvent = null;

			} else if (cond.equals('㹓')) {
				curEvent = '㹓';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 9);
				curEvent = null;

			} else if (cond.equals('㹖')) {
				curEvent = '㹖';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1966201540_i1_LOOPVAR__1()> */
				int v_249_ = (int) getVarValue(getOutVar('㒨', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_249_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䉜')) {
				curEvent = '䉜';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 433677018_i1_LOOPVAR__1()> */
				int v_118_ = (int) getVarValue(getOutVar('㔑', "ret"));
				satisfies = (Not(v_118_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䙝')) {
				curEvent = '䙝';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-979698269_i5_LOOPVAR__0'()> */
				int v_243_ = (int) getVarValue(getOutVar('䍭', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (Not(v_190_ <= v_243_));
				curEvent = null;

			} else if (cond.equals('䉦')) {
				curEvent = '䉦';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-402781014_i3_LOOPVAR__0'()> */
				int v_277_ = (int) getVarValue(getOutVar('㣚', "ret"));
				satisfies = (v_268_ <= v_277_);
				curEvent = null;

			} else if (cond.equals('㙩')) {
				curEvent = '㙩';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfWriter getWriter()> */
				com.itextpdf.kernel.pdf.PdfWriter v_89_ = (com.itextpdf.kernel.pdf.PdfWriter) getVarValue(getOutVar('䣓', "ret"));
				satisfies = (Not(v_89_ == null));
				curEvent = null;

			} else if (cond.equals('䩯')) {
				curEvent = '䩯';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1722087346_i1_LOOPVAR__1()> */
				int v_40_ = (int) getVarValue(getOutVar('䉑', "ret"));
				satisfies = (v_40_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䉵')) {
				curEvent = '䉵';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: boolean <com.itextpdf.kernel.pdf.PdfDictionary: java.util.Set keySet()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_87_ = (boolean) getVarValue(getOutVar('䜣', "ret"));
				satisfies = (Not(v_87_ == false));
				curEvent = null;

			} else if (cond.equals('㙶')) {
				curEvent = '㙶';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1355875391_i1_LOOPVAR__1()> */
				int v_122_ = (int) getVarValue(getOutVar('䐛', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_122_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㹸')) {
				curEvent = '㹸';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1505907556_i4_LOOPVAR__1()> */
				int v_158_ = (int) getVarValue(getOutVar('䆩', "ret"));
				satisfies = (Not(v_158_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㚄')) {
				curEvent = '㚄';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i6_LOOPVAR__1'()> */
				int v_168_ = (int) getVarValue(getOutVar('㚯', "ret"));
				satisfies = (v_168_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㪐')) {
				curEvent = '㪐';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-389532594_i1_LOOPVAR__1'()> */
				int v_148_ = (int) getVarValue(getOutVar('䯀', "ret"));
				satisfies = (v_148_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㪑')) {
				curEvent = '㪑';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-912029676_i1_LOOPVAR__1'()> */
				int v_125_ = (int) getVarValue(getOutVar('䓠', "ret"));
				satisfies = (v_125_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䚒')) {
				curEvent = '䚒';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (Not((v_268_ & 256) == 0));
				curEvent = null;

			} else if (cond.equals('䪓')) {
				curEvent = '䪓';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1758565287_i2_LOOPVAR__0'()> */
				int v_126_ = (int) getVarValue(getOutVar('Z', "ret"));
				satisfies = (v_268_ <= v_126_);
				curEvent = null;

			} else if (cond.equals('㺕')) {
				curEvent = '㺕';
				/* <com.itextpdf.kernel.pdf.PdfString: boolean isHexWriting()> */
				boolean v_255_ = (boolean) getVarValue(getOutVar('㣬', "ret"));
				satisfies = (v_255_ == false);
				curEvent = null;

			} else if (cond.equals('䚖')) {
				curEvent = '䚖';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (16 <= v_64_);
				curEvent = null;

			} else if (cond.equals('㪘')) {
				curEvent = '㪘';
				/* <com.itextpdf.kernel.pdf.PdfName: int compareTo(com.itextpdf.kernel.pdf.PdfName)> */
				int v_16_ = (int) getVarValue(getOutVar('㩀', "ret"));
				satisfies = (v_16_ == 0);
				curEvent = null;

			} else if (cond.equals('䊙')) {
				curEvent = '䊙';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = ((v_268_ & 4) == 0);
				curEvent = null;

			} else if (cond.equals('㪝')) {
				curEvent = '㪝';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1662017370_i1_LOOPVAR__1()> */
				int v_90_ = (int) getVarValue(getOutVar('䁻', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_90_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䊠')) {
				curEvent = '䊠';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-402781014_i3_LOOPVAR__0'()> */
				int v_277_ = (int) getVarValue(getOutVar('㣚', "ret"));
				satisfies = (Not(v_268_ <= v_277_));
				curEvent = null;

			} else if (cond.equals('䚡')) {
				curEvent = '䚡';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1985597072_i1_LOOPVAR__0()> */
				int v_135_ = (int) getVarValue(getOutVar('䋼', "ret"));
				satisfies = (v_268_ <= v_135_);
				curEvent = null;

			} else if (cond.equals('䪣')) {
				curEvent = '䪣';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (v_279_ == 2);
				curEvent = null;

			} else if (cond.equals('䚥')) {
				curEvent = '䚥';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1380518653_i2_LOOPVAR__0'()> */
				int v_21_ = (int) getVarValue(getOutVar('䧵', "ret"));
				satisfies = (v_268_ <= v_21_);
				curEvent = null;

			} else if (cond.equals('䪭')) {
				curEvent = '䪭';
				/* <com.itextpdf.kernel.pdf.PdfDocument: boolean <com.itextpdf.kernel.pdf.PdfDocument: java.util.List listIndirectReferences()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_141_ = (boolean) getVarValue(getOutVar('䃃', "ret"));
				satisfies = (v_141_ == false);
				curEvent = null;

			} else if (cond.equals('㺰')) {
				curEvent = '㺰';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 806833108_i1_LOOPVAR__1()> */
				int v_194_ = (int) getVarValue(getOutVar('㿴', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_194_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㪲')) {
				curEvent = '㪲';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 968858636_i1_LOOPVAR__1()> */
				int v_7_ = (int) getVarValue(getOutVar('㙐', "ret"));
				satisfies = (v_7_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㺲')) {
				curEvent = '㺲';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1591245780_i5_LOOPVAR__0()> */
				int v_232_ = (int) getVarValue(getOutVar('䧔', "ret"));
				satisfies = (v_268_ <= v_232_);
				curEvent = null;

			} else if (cond.equals('䪺')) {
				curEvent = '䪺';
				/* <com.itextpdf.kernel.pdf.PdfArray: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(int)> */
				com.itextpdf.kernel.pdf.PdfNumber v_253_ = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(getOutVar('䤾', "ret"));
				satisfies = (Not(v_253_ == null));
				curEvent = null;

			} else if (cond.equals('㻅')) {
				curEvent = '㻅';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1177218402_i1_LOOPVAR__1()> */
				int v_225_ = (int) getVarValue(getOutVar('㴵', "ret"));
				satisfies = (v_225_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䋆')) {
				curEvent = '䋆';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 485418599_i3_LOOPVAR__1()> */
				int v_51_ = (int) getVarValue(getOutVar('䨲', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_51_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䛉')) {
				curEvent = '䛉';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isNumber()> */
				boolean v_242_ = (boolean) getVarValue(getOutVar('䁫', "ret"));
				satisfies = (Not(v_242_ == false));
				curEvent = null;

			} else if (cond.equals('㛊')) {
				curEvent = '㛊';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(16 <= v_64_));
				curEvent = null;

			} else if (cond.equals('㛐')) {
				curEvent = '㛐';
				/* <com.itextpdf.kernel.pdf.PdfObject: com.itextpdf.kernel.pdf.PdfIndirectReference getIndirectReference()> */
				com.itextpdf.kernel.pdf.PdfIndirectReference v_41_ = (com.itextpdf.kernel.pdf.PdfIndirectReference) getVarValue(getOutVar('㢵', "ret"));
				satisfies = (Not(v_41_ == null));
				curEvent = null;

			} else if (cond.equals('䛑')) {
				curEvent = '䛑';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()> */
				int v_86_ = (int) getVarValue(getOutVar('㳚', "ret"));
				satisfies = (Not(v_86_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㫔')) {
				curEvent = '㫔';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i3_LOOPVAR__1'()> */
				int v_43_ = (int) getVarValue(getOutVar('㘪', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_43_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㫕')) {
				curEvent = '㫕';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()> */
				int v_100_ = (int) getVarValue(getOutVar('㾆', "ret"));
				satisfies = (Not(v_100_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䛘')) {
				curEvent = '䛘';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isArray()> */
				boolean v_245_ = (boolean) getVarValue(getOutVar('㱺', "ret"));
				satisfies = (v_245_ == false);
				curEvent = null;

			} else if (cond.equals('㻚')) {
				curEvent = '㻚';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 776405939_i4_LOOPVAR__1()> */
				int v_77_ = (int) getVarValue(getOutVar('㙟', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_77_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㻢')) {
				curEvent = '㻢';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()> */
				int v_88_ = (int) getVarValue(getOutVar('㦆', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_88_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䋢')) {
				curEvent = '䋢';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i2_LOOPVAR__1'()> */
				int v_130_ = (int) getVarValue(getOutVar('䴟', "ret"));
				satisfies = (v_130_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㛦')) {
				curEvent = '㛦';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 817036870_i2_LOOPVAR__1()> */
				int v_196_ = (int) getVarValue(getOutVar('䛺', "ret"));
				satisfies = (v_196_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㫮')) {
				curEvent = '㫮';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1380518653_i2_LOOPVAR__0'()> */
				int v_21_ = (int) getVarValue(getOutVar('䧵', "ret"));
				satisfies = (Not(v_268_ <= v_21_));
				curEvent = null;

			} else if (cond.equals('㻮')) {
				curEvent = '㻮';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-979698269_i5_LOOPVAR__0'()> */
				int v_243_ = (int) getVarValue(getOutVar('䍭', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPdfObjects()> */
				int v_190_ = (int) getVarValue(getOutVar('㺥', "ret"));
				satisfies = (v_190_ <= v_243_);
				curEvent = null;

			} else if (cond.equals('㫰')) {
				curEvent = '㫰';
				/* <com.itextpdf.kernel.pdf.PdfArray: boolean <com.itextpdf.kernel.pdf.PdfArray: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_14_ = (boolean) getVarValue(getOutVar('䛳', "ret"));
				satisfies = (v_14_ == false);
				curEvent = null;

			} else if (cond.equals('㛱')) {
				curEvent = '㛱';
				/* <com.itextpdf.kernel.pdf.PdfPage: boolean <com.itextpdf.kernel.pdf.PdfPage: java.util.List getAnnotations()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_35_ = (boolean) getVarValue(getOutVar('㠑', "ret"));
				satisfies = (v_35_ == false);
				curEvent = null;

			} else if (cond.equals('㛷')) {
				curEvent = '㛷';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1966201540_i1_LOOPVAR__1()> */
				int v_249_ = (int) getVarValue(getOutVar('㒨', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_249_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䛸')) {
				curEvent = '䛸';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()> */
				int v_180_ = (int) getVarValue(getOutVar('䕵', "ret"));
				satisfies = (Not(v_180_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䌈')) {
				curEvent = '䌈';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1345368027_i1_LOOPVAR__1()> */
				int v_172_ = (int) getVarValue(getOutVar('㼪', "ret"));
				satisfies = (v_172_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㼉')) {
				curEvent = '㼉';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()> */
				int v_42_ = (int) getVarValue(getOutVar('㐞', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_42_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㜋')) {
				curEvent = '㜋';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName,boolean)> */
				com.itextpdf.kernel.pdf.PdfObject v_4_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䪹', "ret"));
				satisfies = (Not(v_4_ == null));
				curEvent = null;

			} else if (cond.equals('㼋')) {
				curEvent = '㼋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 674329458_i6_LOOPVAR__1()> */
				int v_208_ = (int) getVarValue(getOutVar('䲩', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_208_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㼌')) {
				curEvent = '㼌';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1218999437_i1_LOOPVAR__1()> */
				int v_100_ = (int) getVarValue(getOutVar('㾆', "ret"));
				satisfies = (v_100_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㬎')) {
				curEvent = '㬎';
				/* <com.itextpdf.kernel.pdf.PdfNull: byte getType()> */
				byte v_279_ = (byte) getVarValue(getOutVar('䂻', "ret"));
				satisfies = (And(v_279_ == 3, v_279_ == 6));
				curEvent = null;

			} else if (cond.equals('䜔')) {
				curEvent = '䜔';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1153689355_i1_LOOPVAR__1()> */
				int v_88_ = (int) getVarValue(getOutVar('㦆', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_88_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䬕')) {
				curEvent = '䬕';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getPage(int)> */
				com.itextpdf.kernel.pdf.PdfPage v_108_ = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(getOutVar('䋁', "ret"));
				satisfies = (Not(v_108_ == null));
				curEvent = null;

			} else if (cond.equals('㬖')) {
				curEvent = '㬖';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (v_268_ == 5);
				curEvent = null;

			} else if (cond.equals('䜘')) {
				curEvent = '䜘';
				/* <com.itextpdf.kernel.pdf.PdfReader: boolean isOpenedWithFullPermission()> */
				boolean v_112_ = (boolean) getVarValue(getOutVar('䯥', "ret"));
				satisfies = (Not(v_112_ == false));
				curEvent = null;

			} else if (cond.equals('䬨')) {
				curEvent = '䬨';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isDictionary()> */
				boolean v_258_ = (boolean) getVarValue(getOutVar('㐁', "ret"));
				satisfies = (v_258_ == false);
				curEvent = null;

			} else if (cond.equals('䌪')) {
				curEvent = '䌪';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfDictionary getAsDictionary(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfDictionary v_54_ = (com.itextpdf.kernel.pdf.PdfDictionary) getVarValue(getOutVar('䤶', "ret"));
				satisfies = (Not(v_54_ == null));
				curEvent = null;

			} else if (cond.equals('䜱')) {
				curEvent = '䜱';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-816953936_i1_LOOPVAR__1'()> */
				int v_27_ = (int) getVarValue(getOutVar('㩲', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_27_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㬶')) {
				curEvent = '㬶';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()> */
				int v_197_ = (int) getVarValue(getOutVar('䀦', "ret"));
				satisfies = (v_197_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䌹')) {
				curEvent = '䌹';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1206117909_i1_LOOPVAR__1'()> */
				int v_84_ = (int) getVarValue(getOutVar('㴰', "ret"));
				satisfies = (Not(v_84_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㬻')) {
				curEvent = '㬻';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_218_ == 1);
				curEvent = null;

			} else if (cond.equals('䜿')) {
				curEvent = '䜿';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfNumber v_233_ = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(getOutVar('㚙', "ret"));
				satisfies = (v_233_ == null);
				curEvent = null;

			} else if (cond.equals('㭀')) {
				curEvent = '㭀';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-419521716_i1_LOOPVAR__1'()> */
				int v_33_ = (int) getVarValue(getOutVar('㷲', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_33_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㭂')) {
				curEvent = '㭂';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-636616096_i6_LOOPVAR__1'()> */
				int v_168_ = (int) getVarValue(getOutVar('㚯', "ret"));
				satisfies = (Not(v_168_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䍆')) {
				curEvent = '䍆';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfObject getPdfObject(int)> */
				com.itextpdf.kernel.pdf.PdfObject v_246_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䕏', "ret"));
				satisfies = (v_246_ == null);
				curEvent = null;

			} else if (cond.equals('䝐')) {
				curEvent = '䝐';
				/* <com.itextpdf.kernel.pdf.PdfReader: boolean isOpenedWithFullPermission()> */
				boolean v_112_ = (boolean) getVarValue(getOutVar('䯥', "ret"));
				satisfies = (v_112_ == false);
				curEvent = null;

			} else if (cond.equals('㽔')) {
				curEvent = '㽔';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-710858242_i3_LOOPVAR__1'()> */
				int v_43_ = (int) getVarValue(getOutVar('㘪', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_43_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䝕')) {
				curEvent = '䝕';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-560452335_i4_LOOPVAR__1'()> */
				int v_101_ = (int) getVarValue(getOutVar('䙿', "ret"));
				satisfies = (v_268_ <= v_101_);
				curEvent = null;

			} else if (cond.equals('䭠')) {
				curEvent = '䭠';
				/* <com.itextpdf.kernel.pdf.PdfObject: byte getType()> */
				byte v_191_ = (byte) getVarValue(getOutVar('㭵', "ret"));
				satisfies = (Not(v_191_ == 3 || v_191_ == 10));
				curEvent = null;

			} else if (cond.equals('䝢')) {
				curEvent = '䝢';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 817036870_i3_LOOPVAR__0()> */
				int v_265_ = (int) getVarValue(getOutVar('㑍', "ret"));
				satisfies = (Not(v_268_ <= v_265_));
				curEvent = null;

			} else if (cond.equals('㝧')) {
				curEvent = '㝧';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1517705716_i2_LOOPVAR__0'()> */
				int v_20_ = (int) getVarValue(getOutVar('㬹', "ret"));
				satisfies = (v_268_ <= v_20_);
				curEvent = null;

			} else if (cond.equals('㽮')) {
				curEvent = '㽮';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfCatalog getCatalog()> */
				com.itextpdf.kernel.pdf.PdfCatalog v_212_ = (com.itextpdf.kernel.pdf.PdfCatalog) getVarValue(getOutVar('㬵', "ret"));
				satisfies = (Not(v_212_ == null));
				curEvent = null;

			} else if (cond.equals('䍮')) {
				curEvent = '䍮';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 817036870_i3_LOOPVAR__0()> */
				int v_265_ = (int) getVarValue(getOutVar('㑍', "ret"));
				satisfies = (v_268_ <= v_265_);
				curEvent = null;

			} else if (cond.equals('㝰')) {
				curEvent = '㝰';
				/* <com.itextpdf.kernel.pdf.PdfString: java.lang.String getEncoding()> */
				java.lang.String v_234_ = (java.lang.String) getVarValue(getOutVar('䬿', "ret"));
				satisfies = (v_234_ == null);
				curEvent = null;

			} else if (cond.equals('䍰')) {
				curEvent = '䍰';
				/* <com.itextpdf.kernel.pdf.PdfOutline: java.util.List getAllChildren()> */
				java.util.List v_26_ = (java.util.List) getVarValue(getOutVar('㕒', "ret"));
				satisfies = (v_26_ == null);
				curEvent = null;

			} else if (cond.equals('䭵')) {
				curEvent = '䭵';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1505907556_i4_LOOPVAR__1()> */
				int v_158_ = (int) getVarValue(getOutVar('䆩', "ret"));
				satisfies = (v_158_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㞇')) {
				curEvent = '㞇';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfStream getAsStream(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfStream v_82_ = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(getOutVar('㕝', "ret"));
				satisfies = (v_82_ == null);
				curEvent = null;

			} else if (cond.equals('䮉')) {
				curEvent = '䮉';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 823888672_i1_LOOPVAR__1()> */
				int v_147_ = (int) getVarValue(getOutVar('䌃', "ret"));
				satisfies = (Not(v_218_ <= v_147_));
				curEvent = null;

			} else if (cond.equals('䞐')) {
				curEvent = '䞐';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfStream getAsStream(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfStream v_82_ = (com.itextpdf.kernel.pdf.PdfStream) getVarValue(getOutVar('㕝', "ret"));
				satisfies = (Not(v_82_ == null));
				curEvent = null;

			} else if (cond.equals('㞖')) {
				curEvent = '㞖';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfNumber getAsNumber(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfNumber v_233_ = (com.itextpdf.kernel.pdf.PdfNumber) getVarValue(getOutVar('㚙', "ret"));
				satisfies = (Not(v_233_ == null));
				curEvent = null;

			} else if (cond.equals('䞘')) {
				curEvent = '䞘';
				/* <com.itextpdf.kernel.pdf.PdfReader: com.itextpdf.kernel.pdf.PdfAConformanceLevel getPdfAConformanceLevel()> */
				com.itextpdf.kernel.pdf.PdfAConformanceLevel v_222_ = (com.itextpdf.kernel.pdf.PdfAConformanceLevel) getVarValue(getOutVar('䙸', "ret"));
				satisfies = (Not(v_222_ == null));
				curEvent = null;

			} else if (cond.equals('㞙')) {
				curEvent = '㞙';
				/* <com.itextpdf.kernel.pdf.PdfPage: com.itextpdf.kernel.geom.Rectangle getCropBox()> */
				com.itextpdf.kernel.geom.Rectangle v_165_ = (com.itextpdf.kernel.geom.Rectangle) getVarValue(getOutVar('䃎', "ret"));
				satisfies = (Not(v_165_ == null));
				curEvent = null;

			} else if (cond.equals('䮚')) {
				curEvent = '䮚';
				/* <com.itextpdf.kernel.pdf.PdfStream: com.itextpdf.kernel.pdf.PdfObject get(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfObject v_115_ = (com.itextpdf.kernel.pdf.PdfObject) getVarValue(getOutVar('䑁', "ret"));
				satisfies = (v_115_ == null);
				curEvent = null;

			} else if (cond.equals('㾠')) {
				curEvent = '㾠';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1950555074_i2_LOOPVAR__1()> */
				int v_111_ = (int) getVarValue(getOutVar('㕧', "ret"));
				satisfies = (Not(v_111_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㾡')) {
				curEvent = '㾡';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (Not(v_268_ <= 0));
				curEvent = null;

			} else if (cond.equals('䎣')) {
				curEvent = '䎣';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				satisfies = (false);
				curEvent = null;

			} else if (cond.equals('䮣')) {
				curEvent = '䮣';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (Not(v_64_ == 2));
				curEvent = null;

			} else if (cond.equals('㮥')) {
				curEvent = '㮥';
				/* <com.itextpdf.kernel.pdf.PdfNumber: int intValue()> */
				int v_64_ = (int) getVarValue(getOutVar('㩰', "ret"));
				satisfies = (v_64_ == 4);
				curEvent = null;

			} else if (cond.equals('㾦')) {
				curEvent = '㾦';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1066553795_i1_LOOPVAR__1'()> */
				int v_42_ = (int) getVarValue(getOutVar('㐞', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_42_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䎦')) {
				curEvent = '䎦';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1335348288_i1_LOOPVAR__1'()> */
				int v_200_ = (int) getVarValue(getOutVar('㵢', "ret"));
				satisfies = (Not(v_200_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㾨')) {
				curEvent = '㾨';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1479062844_i1_LOOPVAR__1'()> */
				int v_136_ = (int) getVarValue(getOutVar('䌺', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_136_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㮬')) {
				curEvent = '㮬';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1754235817_i1_LOOPVAR__0()> */
				int v_12_ = (int) getVarValue(getOutVar('㕫', "ret"));
				satisfies = (v_268_ <= v_12_);
				curEvent = null;

			} else if (cond.equals('㮯')) {
				curEvent = '㮯';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2036937134_i4_LOOPVAR__1()> */
				int v_214_ = (int) getVarValue(getOutVar('䮋', "ret"));
				satisfies = (Not(v_214_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䮱')) {
				curEvent = '䮱';
				/* <com.itextpdf.kernel.pdf.PdfObject: byte getType()> */
				byte v_191_ = (byte) getVarValue(getOutVar('㭵', "ret"));
				satisfies = (Not(v_191_ == 4));
				curEvent = null;

			} else if (cond.equals('㮳')) {
				curEvent = '㮳';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int 1754235817_i1_LOOPVAR__0()> */
				int v_12_ = (int) getVarValue(getOutVar('㕫', "ret"));
				satisfies = (Not(v_268_ <= v_12_));
				curEvent = null;

			} else if (cond.equals('䎳')) {
				curEvent = '䎳';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-419521716_i1_LOOPVAR__1'()> */
				int v_33_ = (int) getVarValue(getOutVar('㷲', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_33_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㮴')) {
				curEvent = '㮴';
				/* <com.itextpdf.kernel.pdf.PdfObject: byte getType()> */
				byte v_191_ = (byte) getVarValue(getOutVar('㭵', "ret"));
				satisfies = (v_191_ == 3);
				curEvent = null;

			} else if (cond.equals('䯁')) {
				curEvent = '䯁';
				/* <com.itextpdf.kernel.pdf.PdfDocument: com.itextpdf.kernel.pdf.PdfPage getPage(int)> */
				com.itextpdf.kernel.pdf.PdfPage v_108_ = (com.itextpdf.kernel.pdf.PdfPage) getVarValue(getOutVar('䋁', "ret"));
				satisfies = (v_108_ == null);
				curEvent = null;

			} else if (cond.equals('䟇')) {
				curEvent = '䟇';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1263776857_i1_LOOPVAR__1'()> */
				int v_86_ = (int) getVarValue(getOutVar('㳚', "ret"));
				satisfies = (v_86_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㿋')) {
				curEvent = '㿋';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-534743232_i1_LOOPVAR__1'()> */
				int v_285_ = (int) getVarValue(getOutVar('䲟', "ret"));
				satisfies = (v_285_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㟍')) {
				curEvent = '㟍';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 488975075_i2_LOOPVAR__1()> */
				int v_177_ = (int) getVarValue(getOutVar('㯀', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_177_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䟎')) {
				curEvent = '䟎';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1446985189_i23_LOOPVAR__0()> */
				int v_29_ = (int) getVarValue(getOutVar('㾈', "ret"));
				satisfies = (Not(v_218_ <= v_29_));
				curEvent = null;

			} else if (cond.equals('䟓')) {
				curEvent = '䟓';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1081523889_i4_LOOPVAR__1()> */
				int v_19_ = (int) getVarValue(getOutVar('㖂', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_19_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䟔')) {
				curEvent = '䟔';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1478422470_i1_LOOPVAR__1'()> */
				int v_28_ = (int) getVarValue(getOutVar('㫦', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (Not(v_28_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('䯔')) {
				curEvent = '䯔';
				/* <com.itextpdf.kernel.pdf.PdfObject: byte getType()> */
				byte v_191_ = (byte) getVarValue(getOutVar('㭵', "ret"));
				satisfies = (v_191_ == 0);
				curEvent = null;

			} else if (cond.equals('䏖')) {
				curEvent = '䏖';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isNumber()> */
				boolean v_242_ = (boolean) getVarValue(getOutVar('䁫', "ret"));
				satisfies = (v_242_ == false);
				curEvent = null;

			} else if (cond.equals('㿠')) {
				curEvent = '㿠';
				/* <com.itextpdf.kernel.pdf.PdfCatalog: com.itextpdf.kernel.pdf.PdfViewerPreferences getViewerPreferences()> */
				com.itextpdf.kernel.pdf.PdfViewerPreferences v_305_ = (com.itextpdf.kernel.pdf.PdfViewerPreferences) getVarValue(getOutVar('䝴', "ret"));
				satisfies = (v_305_ == null);
				curEvent = null;

			} else if (cond.equals('䏢')) {
				curEvent = '䏢';
				/* <com.itextpdf.kernel.pdf.PdfDictionary: com.itextpdf.kernel.pdf.PdfArray getAsArray(com.itextpdf.kernel.pdf.PdfName)> */
				com.itextpdf.kernel.pdf.PdfArray v_57_ = (com.itextpdf.kernel.pdf.PdfArray) getVarValue(getOutVar('䑋', "ret"));
				satisfies = (Not(v_57_ == null));
				curEvent = null;

			} else if (cond.equals('䏩')) {
				curEvent = '䏩';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isName()> */
				boolean v_236_ = (boolean) getVarValue(getOutVar('㔐', "ret"));
				satisfies = (Not(v_236_ == false));
				curEvent = null;

			} else if (cond.equals('㯭')) {
				curEvent = '㯭';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 1177218402_i1_LOOPVAR__1()> */
				int v_225_ = (int) getVarValue(getOutVar('㴵', "ret"));
				satisfies = (Not(v_225_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㟰')) {
				curEvent = '㟰';
				/* <com.itextpdf.kernel.pdf.PdfPage: boolean <com.itextpdf.kernel.pdf.PdfPage: java.util.List getAnnotations()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_35_ = (boolean) getVarValue(getOutVar('㠑', "ret"));
				satisfies = (Not(v_35_ == false));
				curEvent = null;

			} else if (cond.equals('㯱')) {
				curEvent = '㯱';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 2854530_i1_LOOPVAR__1()> */
				int v_96_ = (int) getVarValue(getOutVar('㻍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				satisfies = (v_96_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('㿱')) {
				curEvent = '㿱';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-2074001042_i1_LOOPVAR__0'()> */
				int v_39_ = (int) getVarValue(getOutVar('䂶', "ret"));
				satisfies = (v_268_ <= v_39_);
				curEvent = null;

			} else if (cond.equals('䟱')) {
				curEvent = '䟱';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-697437535_i1_LOOPVAR__0'()> */
				int v_219_ = (int) getVarValue(getOutVar('㕉', "ret"));
				satisfies = (Not(v_268_ <= v_219_));
				curEvent = null;

			} else if (cond.equals('㯲')) {
				curEvent = '㯲';
				/* <com.itextpdf.kernel.pdf.PdfObject: boolean isDictionary()> */
				boolean v_258_ = (boolean) getVarValue(getOutVar('㐁', "ret"));
				satisfies = (Not(v_258_ == false));
				curEvent = null;

			} else if (cond.equals('㟳')) {
				curEvent = '㟳';
				/* <com.itextpdf.kernel.pdf.PdfArray: int size()> */
				int v_268_ = (int) getVarValue(getOutVar('䁌', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfArray: int '-1517705716_i2_LOOPVAR__0'()> */
				int v_20_ = (int) getVarValue(getOutVar('㬹', "ret"));
				satisfies = (Not(v_268_ <= v_20_));
				curEvent = null;

			} else if (cond.equals('䟳')) {
				curEvent = '䟳';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int '-1084404319_i1_LOOPVAR__1'()> */
				int v_180_ = (int) getVarValue(getOutVar('䕵', "ret"));
				satisfies = (v_180_ <= v_218_);
				curEvent = null;

			} else if (cond.equals('䏻')) {
				curEvent = '䏻';
				/* <com.itextpdf.kernel.pdf.PdfDocument: int getNumberOfPages()> */
				int v_218_ = (int) getVarValue(getOutVar('䌍', "ret"));
				/* <com.itextpdf.kernel.pdf.PdfDocument: int 931002325_i1_LOOPVAR__1()> */
				int v_197_ = (int) getVarValue(getOutVar('䀦', "ret"));
				satisfies = (Not(v_197_ <= v_218_));
				curEvent = null;

			} else if (cond.equals('㿽')) {
				curEvent = '㿽';
				/* <com.itextpdf.kernel.pdf.PdfObject: byte getType()> */
				byte v_191_ = (byte) getVarValue(getOutVar('㭵', "ret"));
				satisfies = (v_191_ == 4);
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
