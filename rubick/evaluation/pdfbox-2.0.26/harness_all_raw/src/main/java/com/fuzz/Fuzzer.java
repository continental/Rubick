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
	protected boolean subrun1(Character nextCall) throws HarnessException {
		try {

			if (nextCall.equals('㰀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationLink: void <init>()> ");
				curEvent = '㰀';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: void <init>()> ");
				curEvent = '㐁';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()> ");
				curEvent = '䰁';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰋')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR__0()> ");
				curEvent = '䰋';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠏')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentInformation getDocumentInformation()> ");
				curEvent = '㠏';
				org.apache.pdfbox.pdmodel.PDDocumentInformation ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentInformation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠐')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: java.lang.Object <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getXObjectNames()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㠐';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐒')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport: java.io.InputStream getContent()> ");
				curEvent = '㐒';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContent();
				curEvent = null;

			} else if (nextCall.equals('䐕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDBorderStyleDictionary: float getWidth()> ");
				curEvent = '䐕';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getWidth();
				curEvent = null;

			} else if (nextCall.equals('䀘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.PDPage findDestinationPage(org.apache.pdfbox.pdmodel.PDDocument)> ");
				curEvent = '䀘';
				org.apache.pdfbox.pdmodel.PDPage ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.findDestinationPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.lang.String getLanguage()> ");
				curEvent = '䰘';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLanguage();
				curEvent = null;

			} else if (nextCall.equals('䠞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner zoom(float)> ");
				curEvent = '䠞';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner ret;
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.zoom(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰥')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()> ");
				curEvent = '䰥';
				java.util.List ret;
				java.util.Iterator itr;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnnotations();
				vars.put(getOutVar(nextCall, "ret"), ret);
				itr = ret.iterator();
				vars.put(getOutVar(nextCall, "itr"), itr);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "itr") + ", " + itr + ");");
				curEvent = null;

			} else if (nextCall.equals('䐪')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: boolean <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getAllPages()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䐪';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰫')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getFontNames()> ");
				curEvent = '㰫';
				java.lang.Iterable ret;
				org.apache.pdfbox.pdmodel.PDResources cls = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFontNames();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript: void <init>(java.lang.String)> ");
				curEvent = '㠱';
				org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐲')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: void put(org.apache.pdfbox.cos.COSName,org.apache.pdfbox.pdmodel.font.PDFont)> ");
				curEvent = '㐲';
				org.apache.pdfbox.cos.COSName arg0 = (org.apache.pdfbox.cos.COSName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.font.PDFont arg1 = (org.apache.pdfbox.pdmodel.font.PDFont) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.pdfbox.pdmodel.PDResources cls = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.put(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㐴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox: void check()> ");
				curEvent = '㐴';
				org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox cls = (org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.check();
				curEvent = null;

			} else if (nextCall.equals('㠴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: boolean <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: java.util.List getFields()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㠴';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䐵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '䐵';
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm cls = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('㐸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: float getVersion()> ");
				curEvent = '㐸';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getVersion();
				curEvent = null;

			} else if (nextCall.equals('㠸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.PDResources getResources()> ");
				curEvent = '㠸';
				org.apache.pdfbox.pdmodel.PDResources ret;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getResources();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream,org.apache.pdfbox.io.MemoryUsageSetting)> ");
				curEvent = '㐺';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.io.MemoryUsageSetting arg1 = (org.apache.pdfbox.io.MemoryUsageSetting) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐻')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationRubberStamp: void <init>()> ");
				curEvent = '㐻';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䐾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: org.apache.pdfbox.pdmodel.common.PDRectangle getRectangle()> ");
				curEvent = '䐾';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRectangle();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('C')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDMetadata: void <init>(org.apache.pdfbox.pdmodel.PDDocument)> ");
				curEvent = 'C';
				org.apache.pdfbox.pdmodel.common.PDMetadata ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.common.PDMetadata(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑃')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument)> ");
				curEvent = '㑃';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䱆')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: java.lang.Object <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: java.util.List getChildren()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䱆';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䡍')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: java.lang.Object <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getFontNames()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䡍';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡗')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary: void <init>()> ");
				curEvent = '䡗';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile: void <init>(org.apache.pdfbox.pdmodel.PDDocument,java.io.InputStream,org.apache.pdfbox.cos.COSName)> ");
				curEvent = '䡛';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.io.InputStream arg1 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.pdfbox.cos.COSName arg2 = (org.apache.pdfbox.cos.COSName) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				ret = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationWidget: void <init>()> ");
				curEvent = '䁞';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: byte[] getContents(java.io.InputStream)> ");
				curEvent = '䁣';
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContents(arg0);
				curEvent = null;

			} else if (nextCall.equals('g')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.cos.COSDocument getDocument()> ");
				curEvent = 'g';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDocument();
				curEvent = null;

			} else if (nextCall.equals('䡭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo: void <init>()> ");
				curEvent = '䡭';
				org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䑴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDStream: org.apache.pdfbox.cos.COSStream getCOSObject()> ");
				curEvent = '䑴';
				org.apache.pdfbox.pdmodel.common.PDStream cls = (org.apache.pdfbox.pdmodel.common.PDStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('㡵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.function.PDFunctionType2: void <init>(org.apache.pdfbox.cos.COSBase)> ");
				curEvent = '㡵';
				org.apache.pdfbox.pdmodel.common.function.PDFunctionType2 ret;
				org.apache.pdfbox.cos.COSBase arg0 = (org.apache.pdfbox.cos.COSBase) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType2(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䑶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: org.apache.pdfbox.pdmodel.interactive.form.PDField getField(java.lang.String)> ");
				curEvent = '䑶';
				org.apache.pdfbox.pdmodel.interactive.form.PDField ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm cls = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getField(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: void openNode()> ");
				curEvent = '䡶';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.openNode();
				curEvent = null;

			} else if (nextCall.equals('㡷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: java.lang.String getFilter()> ");
				curEvent = '㡷';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFilter();
				curEvent = null;

			} else if (nextCall.equals('x')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDTextField: java.util.List getWidgets()> ");
				curEvent = 'x';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('z')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: java.io.InputStream getContents()> ");
				curEvent = 'z';
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContents();
				curEvent = null;

			} else if (nextCall.equals('㑺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void curveTo(float,float,float,float,float,float)> ");
				curEvent = '㑺';
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				float arg2 = (float) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				float arg3 = (float) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				float arg4 = (float) getVarValue(pickInVar(nextCall, "arg4"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg4") + ") => " + arg4);
				float arg5 = (float) getVarValue(pickInVar(nextCall, "arg5"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg5") + ") => " + arg5);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.curveTo(arg0,arg1,arg2,arg3,arg4,arg5);
				curEvent = null;

			} else if (nextCall.equals('䱼')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination: void <init>()> ");
				curEvent = '䱼';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䑽')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-2122759264_i6_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-2122759264_i6_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䑽';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 1705811803_i2_LOOPVAR_<org.apache.pdfbox.pdmodel.PDDocument: int 1705811803_i2_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㲀';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: org.apache.pdfbox.cos.COSArray getCOSArray()> ");
				curEvent = '㒁';
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSArray();
				curEvent = null;

			} else if (nextCall.equals('㢆')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: void <init>()> ");
				curEvent = '㢆';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				ret = new org.apache.pdfbox.pdmodel.common.PDRectangle();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲆')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: boolean isPrinted()> ");
				curEvent = '㲆';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPrinted();
				curEvent = null;

			} else if (nextCall.equals('䒌')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getXObjectNames()> ");
				curEvent = '䒌';
				java.lang.Iterable ret;
				org.apache.pdfbox.pdmodel.PDResources cls = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getXObjectNames();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: java.lang.String getAnnotationName()> ");
				curEvent = '㲎';
				java.lang.String ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAnnotationName();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-552918901_i7_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-552918901_i7_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䂎';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒒')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: float getLowerLeftY()> ");
				curEvent = '㒒';
				float ret;
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLowerLeftY();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: void append(org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem)> ");
				curEvent = '䲕';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem arg0 = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.append(arg0);
				curEvent = null;

			} else if (nextCall.equals('㒚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: org.apache.pdfbox.pdmodel.encryption.PDCryptFilterDictionary getDefaultCryptFilterDictionary()> ");
				curEvent = '㒚';
				org.apache.pdfbox.pdmodel.encryption.PDCryptFilterDictionary ret;
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDefaultCryptFilterDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceCharacteristicsDictionary: org.apache.pdfbox.pdmodel.graphics.color.PDColor getBorderColour()> ");
				curEvent = '䂚';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorderColour();
				curEvent = null;

			} else if (nextCall.equals('䲛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: void <init>()> ");
				curEvent = '䲛';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()> ");
				curEvent = '㢜';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile: void <init>(org.apache.pdfbox.pdmodel.PDDocument,java.io.InputStream)> ");
				curEvent = '䂜';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.io.InputStream arg1 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions: void <init>()> ");
				curEvent = '䲞';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒧')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: void <init>(float,float,float,float)> ");
				curEvent = '㒧';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				float arg2 = (float) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				float arg3 = (float) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				ret = new org.apache.pdfbox.pdmodel.common.PDRectangle(arg0,arg1,arg2,arg3);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline getDocumentOutline()> ");
				curEvent = '㒩';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentOutline();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䢱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: void <init>(org.apache.pdfbox.pdmodel.PDDocument)> ");
				curEvent = '䢱';
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒲')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '䒲';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䲷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '䲷';
				org.apache.pdfbox.cos.COSDictionary ret;
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCOSObject();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-2122759264_i6_LOOPVAR__1'()> ");
				curEvent = '䲸';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢹')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㢹';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('㲽')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner yAxis(float)> ");
				curEvent = '㲽';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner ret;
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.yAxis(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㲾';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䃀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getKeywords()> ");
				curEvent = '䃀';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getKeywords();
				curEvent = null;

			} else if (nextCall.equals('䳀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: boolean isHidden()> ");
				curEvent = '䳀';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isHidden();
				curEvent = null;

			} else if (nextCall.equals('䳄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField: java.util.List getWidgets()> ");
				curEvent = '䳄';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䳅')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentNameDictionary: void <init>(org.apache.pdfbox.pdmodel.PDDocumentCatalog)> ");
				curEvent = '䳅';
				org.apache.pdfbox.pdmodel.PDDocumentNameDictionary ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog arg0 = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.PDDocumentNameDictionary(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: float getWidth()> ");
				curEvent = '䣉';
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getWidth();
				curEvent = null;

			} else if (nextCall.equals('㣊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getArtBox()> ");
				curEvent = '㣊';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getArtBox();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓓')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void fill()> ");
				curEvent = '㓓';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.fill();
				curEvent = null;

			} else if (nextCall.equals('䳓')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDTextField: void <init>(org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm)> ");
				curEvent = '䳓';
				org.apache.pdfbox.pdmodel.interactive.form.PDTextField ret;
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm arg0 = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃔')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: java.lang.String getSignerName()> ");
				curEvent = '䃔';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSignerName();
				curEvent = null;

			} else if (nextCall.equals('䃕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument,org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceStream)> ");
				curEvent = '䃕';
				org.apache.pdfbox.pdmodel.PDPageContentStream ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream arg1 = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.pdfbox.pdmodel.PDPageContentStream(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDFormContentStream: void close()> ");
				curEvent = '㳘';
				org.apache.pdfbox.pdmodel.PDFormContentStream cls = (org.apache.pdfbox.pdmodel.PDFormContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䃙')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean isOwnerPermission()> ");
				curEvent = '䃙';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOwnerPermission();
				curEvent = null;

			} else if (nextCall.equals('䓚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.PageLayout getPageLayout()> ");
				curEvent = '䓚';
				org.apache.pdfbox.pdmodel.PageLayout ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageLayout();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣝')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDField: java.lang.String getPartialName()> ");
				curEvent = '㣝';
				org.apache.pdfbox.pdmodel.interactive.form.PDField cls = (org.apache.pdfbox.pdmodel.interactive.form.PDField) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPartialName();
				curEvent = null;

			} else if (nextCall.equals('㣟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationMarkup: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㣟';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㓣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationSquareCircle: void <init>(java.lang.String)> ");
				curEvent = '㓣';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓥')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void shadingFill(org.apache.pdfbox.pdmodel.graphics.shading.PDShading)> ");
				curEvent = '䓥';
				org.apache.pdfbox.pdmodel.graphics.shading.PDShading arg0 = (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.shadingFill(arg0);
				curEvent = null;

			} else if (nextCall.equals('䃦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void clip()> ");
				curEvent = '䃦';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.clip();
				curEvent = null;

			} else if (nextCall.equals('䣧')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractForAccessibility()> ");
				curEvent = '䣧';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canExtractForAccessibility();
				curEvent = null;

			} else if (nextCall.equals('㓨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo: void <init>(org.apache.pdfbox.cos.COSDictionary)> ");
				curEvent = '㓨';
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo ret;
				org.apache.pdfbox.cos.COSDictionary arg0 = (org.apache.pdfbox.cos.COSDictionary) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.lang.Object <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.List getKids()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䳨';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㓩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination: org.apache.pdfbox.cos.COSArray getCOSObject()> ");
				curEvent = '㓩';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䳩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm(org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup)> ");
				curEvent = '䳩';
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm ret;
				org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup arg0 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAcroForm(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getProducer()> ");
				curEvent = '㣬';
				java.lang.String ret;
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getProducer();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void <init>()> ");
				curEvent = '䃭';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				ret = new org.apache.pdfbox.pdmodel.PDDocument();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: void <init>(float,float)> ");
				curEvent = '䓰';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.pdfbox.pdmodel.common.PDRectangle(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void restoreGraphicsState()> ");
				curEvent = '䳱';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.restoreGraphicsState();
				curEvent = null;

			} else if (nextCall.equals('㳴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: java.lang.String getFile()> ");
				curEvent = '㳴';
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFile();
				curEvent = null;

			} else if (nextCall.equals('䳴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTitle()> ");
				curEvent = '䳴';
				java.lang.String ret;
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getTitle();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationTextMarkup: void <init>(java.lang.String)> ");
				curEvent = '䃵';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceEntry getNormalAppearance()> ");
				curEvent = '䳵';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNormalAppearance();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃹')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: boolean isEncrypted()> ");
				curEvent = '䃹';
				boolean ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEncrypted();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream,java.lang.String)> ");
				curEvent = '䃺';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.lang.String arg1 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0,arg1);
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
			if (nextCall.equals('㔁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㔁';
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䴃')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: void <init>()> ");
				curEvent = '䴃';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 1705811803_i2_LOOPVAR__0()> ");
				curEvent = '㴈';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument,org.apache.pdfbox.pdmodel.PDPage)> ");
				curEvent = '䤉';
				org.apache.pdfbox.pdmodel.PDPageContentStream ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPage arg1 = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.pdfbox.pdmodel.PDPageContentStream(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: java.lang.Object <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: java.util.List getFields()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㔊';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㴊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 2094912986_i2_LOOPVAR__0()> ");
				curEvent = '㴊';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤍')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: org.apache.pdfbox.cos.COSArray getBorder()> ");
				curEvent = '䤍';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBorder();
				curEvent = null;

			} else if (nextCall.equals('䴍')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void saveGraphicsState()> ");
				curEvent = '䴍';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.saveGraphicsState();
				curEvent = null;

			} else if (nextCall.equals('㤎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: java.lang.String getContents()> ");
				curEvent = '㤎';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContents();
				curEvent = null;

			} else if (nextCall.equals('㴎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void closePath()> ");
				curEvent = '㴎';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.closePath();
				curEvent = null;

			} else if (nextCall.equals('㤕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPageTree getPages()> ");
				curEvent = '㤕';
				org.apache.pdfbox.pdmodel.PDPageTree ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: boolean hasSecurityHandler()> ");
				curEvent = '䤘';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasSecurityHandler();
				curEvent = null;

			} else if (nextCall.equals('䤚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.cos.COSDictionary getEFDictionary()> ");
				curEvent = '䤚';
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getEFDictionary();
				curEvent = null;

			} else if (nextCall.equals('䴝')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties signerName(java.lang.String)> ");
				curEvent = '䴝';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.signerName(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䔟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField: org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature getSignature()> ");
				curEvent = '䔟';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature ret;
				org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField cls = (org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSignature();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴢')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: java.util.Map getImages()> ");
				curEvent = '㴢';
				java.util.Map ret = null;
				org.apache.pdfbox.pdmodel.PDResources cls = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.getImages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䄦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: boolean <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '䄦';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport saveIncrementalForExternalSigning(java.io.OutputStream)> ");
				curEvent = '㤭';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport ret;
				java.io.OutputStream arg0 = (java.io.OutputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.saveIncrementalForExternalSigning(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void showTextWithPositioning(java.lang.Object[])> ");
				curEvent = '䤰';
				java.lang.Object[] arg0 = (java.lang.Object[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.showTextWithPositioning(arg0);
				curEvent = null;

			} else if (nextCall.equals('䔵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void lineTo(float,float)> ");
				curEvent = '䔵';
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.lineTo(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('䔶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean isReadOnly()> ");
				curEvent = '䔶';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isReadOnly();
				curEvent = null;

			} else if (nextCall.equals('㔸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo: org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination getDestination()> ");
				curEvent = '㔸';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination ret;
				org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo cls = (org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDestination();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䄸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem getFirstChild()> ");
				curEvent = '䄸';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFirstChild();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴽')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: org.apache.pdfbox.pdmodel.graphics.color.PDColor getColor()> ");
				curEvent = '㴽';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getColor();
				curEvent = null;

			} else if (nextCall.equals('䔾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDFormContentStream: void drawForm(org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject)> ");
				curEvent = '䔾';
				org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject arg0 = (org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDFormContentStream cls = (org.apache.pdfbox.pdmodel.PDFormContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawForm(arg0);
				curEvent = null;

			} else if (nextCall.equals('㴿')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionURI: java.lang.String getURI()> ");
				curEvent = '㴿';
				org.apache.pdfbox.pdmodel.interactive.action.PDActionURI cls = (org.apache.pdfbox.pdmodel.interactive.action.PDActionURI) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getURI();
				curEvent = null;

			} else if (nextCall.equals('䅂')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination findNamedDestinationPage(org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination)> ");
				curEvent = '䅂';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination arg0 = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.findNamedDestinationPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void stroke()> ");
				curEvent = '䅈';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.stroke();
				curEvent = null;

			} else if (nextCall.equals('䵊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: org.apache.pdfbox.pdmodel.graphics.PDXObject getXObject(org.apache.pdfbox.cos.COSName)> ");
				curEvent = '䵊';
				org.apache.pdfbox.cos.COSName arg0 = (org.apache.pdfbox.cos.COSName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDResources cls = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getXObject(arg0);
				curEvent = null;

			} else if (nextCall.equals('䅑')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination getDestination()> ");
				curEvent = '䅑';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDestination();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-552918901_i7_LOOPVAR__0'()> ");
				curEvent = '䥕';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕗')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void newLine()> ");
				curEvent = '㕗';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.newLine();
				curEvent = null;

			} else if (nextCall.equals('㥛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: void <init>(org.apache.pdfbox.pdmodel.common.PDRectangle)> ");
				curEvent = '㥛';
				org.apache.pdfbox.pdmodel.PDPage ret;
				org.apache.pdfbox.pdmodel.common.PDRectangle arg0 = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.PDPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDMetadata getMetadata()> ");
				curEvent = '㥦';
				org.apache.pdfbox.pdmodel.common.PDMetadata ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMetadata();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i16_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i16_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䕦';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentCatalog getDocumentCatalog()> ");
				curEvent = '䕩';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentCatalog();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥫')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot getStructureTreeRoot()> ");
				curEvent = '䥫';
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getStructureTreeRoot();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅯')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.COSArrayList: java.util.Iterator iterator()> ");
				curEvent = '䅯';
				java.util.Iterator ret;
				org.apache.pdfbox.pdmodel.common.COSArrayList cls = (org.apache.pdfbox.pdmodel.common.COSArrayList) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕳')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDBorderStyleDictionary: void <init>()> ");
				curEvent = '䕳';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-1267076115_i2_LOOPVAR__0'()> ");
				curEvent = '䅵';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䕷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: java.io.InputStream getVisibleSignature()> ");
				curEvent = '䕷';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getVisibleSignature();
				curEvent = null;

			} else if (nextCall.equals('㕹')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary getAppearance()> ");
				curEvent = '㕹';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAppearance();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void decrypt(java.lang.String)> ");
				curEvent = '䥺';
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.decrypt(arg0);
				curEvent = null;

			} else if (nextCall.equals('䅻')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.interactive.action.PDAction getAction()> ");
				curEvent = '䅻';
				org.apache.pdfbox.pdmodel.interactive.action.PDAction ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAction();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䵻')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '䵻';
				org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions cls = (org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䕽')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void drawLine(float,float,float,float)> ");
				curEvent = '䕽';
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				float arg2 = (float) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				float arg3 = (float) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawLine(arg0,arg1,arg2,arg3);
				curEvent = null;

			} else if (nextCall.equals('㦀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void drawImage(org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject,float,float,float,float)> ");
				curEvent = '㦀';
				org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject arg0 = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				float arg2 = (float) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				float arg3 = (float) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				float arg4 = (float) getVarValue(pickInVar(nextCall, "arg4"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg4") + ") => " + arg4);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawImage(arg0,arg1,arg2,arg3,arg4);
				curEvent = null;

			} else if (nextCall.equals('㦄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDBorderStyleDictionary: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㦄';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䦆')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem getFirstChild()> ");
				curEvent = '䦆';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䖍')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceEntry: org.apache.pdfbox.cos.COSBase getCOSObject()> ");
				curEvent = '䖍';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('㦔')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.SecurityProvider: java.security.Provider getProvider()> ");
				curEvent = '㦔';
				org.apache.pdfbox.pdmodel.encryption.SecurityProvider.getProvider();
				curEvent = null;

			} else if (nextCall.equals('䖘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canFillInForm()> ");
				curEvent = '䖘';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canFillInForm();
				curEvent = null;

			} else if (nextCall.equals('㦙')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: boolean <org.apache.pdfbox.pdmodel.PDDocument: java.util.List getSignatureDictionaries()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㦙';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䦚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: int getOpenCount()> ");
				curEvent = '䦚';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOpenCount();
				curEvent = null;

			} else if (nextCall.equals('㶜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> ");
				curEvent = '㶜';
				int ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNumberOfPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: boolean <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getXObjectNames()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䆞';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㖟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner: void <init>(java.lang.String,java.io.InputStream,int)> ");
				curEvent = '㖟';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.io.InputStream arg1 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				ret = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㦟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: boolean isOutsideOneInterval(double)> ");
				curEvent = '㦟';
				boolean ret = true;
				double arg0 = (double) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.isOutsideOneInterval(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: java.lang.String getSignatureReason()> ");
				curEvent = '䦟';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSignatureReason();
				curEvent = null;

			} else if (nextCall.equals('㦠')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationWidget: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceCharacteristicsDictionary getAppearanceCharacteristics()> ");
				curEvent = '㦠';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAppearanceCharacteristics();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: boolean <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㶦';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 129569825_i9_LOOPVAR_<org.apache.pdfbox.pdmodel.PDDocument: int 129569825_i9_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䆬';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䶮')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getAllPages()> ");
				curEvent = '䶮';
				java.util.List ret = null;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.getAllPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDPageLabels getPageLabels()> ");
				curEvent = '㶵';
				org.apache.pdfbox.pdmodel.common.PDPageLabels ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageLabels();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int indexOf(org.apache.pdfbox.pdmodel.PDPage)> ");
				curEvent = '䆸';
				int ret;
				org.apache.pdfbox.pdmodel.PDPage arg0 = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.indexOf(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䶸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: boolean hasChildren()> ");
				curEvent = '䶸';
				boolean ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.hasChildren();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㖼')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDPageContentStream$AppendMode,boolean,boolean)> ");
				curEvent = '㖼';
				org.apache.pdfbox.pdmodel.PDPageContentStream ret = null;
				//org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//org.apache.pdfbox.pdmodel.PDPage arg1 = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "arg1"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				//org.apache.pdfbox.pdmodel.PDPageContentStream$AppendMode arg2 = (org.apache.pdfbox.pdmodel.PDPageContentStream$AppendMode) getVarValue(pickInVar(nextCall, "arg2"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				//boolean arg3 = (boolean) getVarValue(pickInVar(nextCall, "arg3"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				//boolean arg4 = (boolean) getVarValue(pickInVar(nextCall, "arg4"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg4") + ") => " + arg4);
				//ret = new org.apache.pdfbox.pdmodel.PDPageContentStream(arg0,arg1,arg2,arg3,arg4);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦿')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileDos()> ");
				curEvent = '䦿';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile ret;
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEmbeddedFileDos();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDPageLabels: void <init>(org.apache.pdfbox.pdmodel.PDDocument)> ");
				curEvent = '㷀';
				org.apache.pdfbox.pdmodel.common.PDPageLabels ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.common.PDPageLabels(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void endText()> ");
				curEvent = '䗀';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.endText();
				curEvent = null;

			} else if (nextCall.equals('䗂')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getCropBox()> ");
				curEvent = '䗂';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCropBox();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧂')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: java.awt.image.BufferedImage convertToImage()> ");
				curEvent = '䧂';
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.convertToImage();
				curEvent = null;

			} else if (nextCall.equals('䇄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR_<org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䇄';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䇅')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: org.apache.pdfbox.pdmodel.PDPage get(int)> ");
				curEvent = '䇅';
				org.apache.pdfbox.pdmodel.PDPage ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.get(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: void <init>()> ");
				curEvent = '㗊';
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification ret;
				ret = new org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceEntry getDownAppearance()> ");
				curEvent = '㧊';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDownAppearance();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧋')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.PDEncryption getEncryption()> ");
				curEvent = '䧋';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEncryption();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧌')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode: void <init>()> ");
				curEvent = '䧌';
				org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode ret;
				ret = new org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗐')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceEntry: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceStream getAppearanceStream()> ");
				curEvent = '䗐';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAppearanceStream();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗔')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void beginText()> ");
				curEvent = '㗔';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.beginText();
				curEvent = null;

			} else if (nextCall.equals('㗞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canModify()> ");
				curEvent = '㗞';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canModify();
				curEvent = null;

			} else if (nextCall.equals('㧟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 1729577450_i5_LOOPVAR_<org.apache.pdfbox.pdmodel.PDDocument: int 1729577450_i5_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㧟';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗡')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canAssembleDocument()> ");
				curEvent = '䗡';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canAssembleDocument();
				curEvent = null;

			} else if (nextCall.equals('䧥')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: org.apache.pdfbox.pdmodel.font.PDFont getFont(org.apache.pdfbox.cos.COSName)> ");
				curEvent = '䧥';
				org.apache.pdfbox.cos.COSName arg0 = (org.apache.pdfbox.cos.COSName) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDResources cls = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFont(arg0);
				curEvent = null;

			} else if (nextCall.equals('㷧')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: boolean isNodeOpen()> ");
				curEvent = '㷧';
				boolean ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isNodeOpen();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.PageMode getPageMode()> ");
				curEvent = '䧨';
				org.apache.pdfbox.pdmodel.PageMode ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageMode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㗩';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䇩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: float getUpperRightX()> ");
				curEvent = '䇩';
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUpperRightX();
				curEvent = null;

			} else if (nextCall.equals('㗪')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDAction: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㗪';
				org.apache.pdfbox.pdmodel.interactive.action.PDAction cls = (org.apache.pdfbox.pdmodel.interactive.action.PDAction) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('㷬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: java.lang.Object <org.apache.pdfbox.pdmodel.PDDocument: java.util.List getSignatureDictionaries()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㷬';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䧭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: boolean <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.List getKids()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䧭';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䗱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: java.lang.Object <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䗱';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧲')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()> ");
				curEvent = '㧲';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPage importPage(org.apache.pdfbox.pdmodel.PDPage)> ");
				curEvent = '㗴';
				org.apache.pdfbox.pdmodel.PDPage ret;
				org.apache.pdfbox.pdmodel.PDPage arg0 = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.importPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int getCount()> ");
				curEvent = '䗴';
				int ret;
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCount();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㧵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.lang.String getName()> ");
				curEvent = '㧵';
				java.lang.String ret;
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getName();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceCharacteristicsDictionary: org.apache.pdfbox.pdmodel.graphics.color.PDColor getBackground()> ");
				curEvent = '䗵';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getBackground();
				curEvent = null;

			} else if (nextCall.equals('㧶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: java.lang.String getModifiedDate()> ");
				curEvent = '㧶';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getModifiedDate();
				curEvent = null;

			} else if (nextCall.equals('䧷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem getNextSibling()> ");
				curEvent = '䧷';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNextSibling();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㘅')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent: java.util.List getContents()> ");
				curEvent = '㘅';
				org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent cls = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContents();
				curEvent = null;

			} else if (nextCall.equals('䈇')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDMetadata: byte[] toByteArray()> ");
				curEvent = '䈇';
				org.apache.pdfbox.pdmodel.common.PDMetadata cls = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toByteArray();
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
	protected boolean subrun3(Character nextCall) throws HarnessException {
		try {

			if (nextCall.equals('㘈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.PDPageTree getPages()> ");
				curEvent = '㘈';
				org.apache.pdfbox.pdmodel.PDPageTree ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: void openNode()> ");
				curEvent = '㸊';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㘐')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void protect(org.apache.pdfbox.pdmodel.encryption.ProtectionPolicy)> ");
				curEvent = '㘐';
				org.apache.pdfbox.pdmodel.encryption.ProtectionPolicy arg0 = (org.apache.pdfbox.pdmodel.encryption.ProtectionPolicy) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.protect(arg0);
				curEvent = null;

			} else if (nextCall.equals('䨔')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: java.util.List getFields()> ");
				curEvent = '䨔';
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm cls = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFields();
				curEvent = null;

			} else if (nextCall.equals('㘛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileUnix()> ");
				curEvent = '㘛';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile ret;
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEmbeddedFileUnix();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㘡')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void close()> ");
				curEvent = '㘡';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('㘥')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: boolean isVisualSignEnabled()> ");
				curEvent = '㘥';
				boolean ret;
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isVisualSignEnabled();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䨥')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties preferredSize(int)> ");
				curEvent = '䨥';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.preferredSize(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘮')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i16_LOOPVAR__0'()> ");
				curEvent = '䘮';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘯')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void <init>(org.apache.pdfbox.cos.COSDocument)> ");
				curEvent = '䘯';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				org.apache.pdfbox.cos.COSDocument arg0 = (org.apache.pdfbox.cos.COSDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.PDDocument(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: java.util.List getChildren()> ");
				curEvent = '䘰';
				org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField cls = (org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getChildren();
				curEvent = null;

			} else if (nextCall.equals('䨴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 1729577450_i5_LOOPVAR__1()> ");
				curEvent = '䨴';
				int ret;
				ret = (1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䘶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentNameDictionary: org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode getEmbeddedFiles()> ");
				curEvent = '䘶';
				org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode ret;
				org.apache.pdfbox.pdmodel.PDDocumentNameDictionary cls = (org.apache.pdfbox.pdmodel.PDDocumentNameDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEmbeddedFiles();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䈸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canPrintDegraded()> ");
				curEvent = '䈸';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canPrintDegraded();
				curEvent = null;

			} else if (nextCall.equals('䨿')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: void <init>()> ");
				curEvent = '䨿';
				org.apache.pdfbox.pdmodel.PDResources ret;
				ret = new org.apache.pdfbox.pdmodel.PDResources();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.AccessPermission getCurrentAccessPermission()> ");
				curEvent = '䩁';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCurrentAccessPermission();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹃')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument)> ");
				curEvent = '㹃';
				org.apache.pdfbox.pdmodel.common.PDStream ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.common.PDStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙃')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceStream: void <init>(org.apache.pdfbox.cos.COSStream)> ");
				curEvent = '䙃';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream ret;
				org.apache.pdfbox.cos.COSStream arg0 = (org.apache.pdfbox.cos.COSStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: void <init>()> ");
				curEvent = '㹄';
				org.apache.pdfbox.pdmodel.PDPage ret;
				ret = new org.apache.pdfbox.pdmodel.PDPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: java.lang.String getSignerLocation()> ");
				curEvent = '䉄';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSignerLocation();
				curEvent = null;

			} else if (nextCall.equals('㩈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDPageContentStream$AppendMode,boolean)> ");
				curEvent = '㩈';
				org.apache.pdfbox.pdmodel.PDPageContentStream ret = null;
				//org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//org.apache.pdfbox.pdmodel.PDPage arg1 = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "arg1"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				//org.apache.pdfbox.pdmodel.PDPageContentStream$AppendMode arg2 = (org.apache.pdfbox.pdmodel.PDPageContentStream$AppendMode) getVarValue(pickInVar(nextCall, "arg2"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				//boolean arg3 = (boolean) getVarValue(pickInVar(nextCall, "arg3"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				//ret = new org.apache.pdfbox.pdmodel.PDPageContentStream(arg0,arg1,arg2,arg3);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩔')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: void buildSignature()> ");
				curEvent = '䩔';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.buildSignature();
				curEvent = null;

			} else if (nextCall.equals('䉕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions: void <init>()> ");
				curEvent = '䉕';
				org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙖')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot: void <init>()> ");
				curEvent = '㙖';
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot ret;
				ret = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties page(int)> ");
				curEvent = '㹘';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.page(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙢')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: void requireSingleNode(org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem)> ");
				curEvent = '䙢';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem arg0 = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.requireSingleNode(arg0);
				curEvent = null;

			} else if (nextCall.equals('㙤')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDDictionaryWrapper: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㙤';
				org.apache.pdfbox.pdmodel.common.PDDictionaryWrapper cls = (org.apache.pdfbox.pdmodel.common.PDDictionaryWrapper) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('㙧')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDField: org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions getActions()> ");
				curEvent = '㙧';
				org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions ret;
				org.apache.pdfbox.pdmodel.interactive.form.PDField cls = (org.apache.pdfbox.pdmodel.interactive.form.PDField) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getActions();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䙩')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: int[] getByteRange()> ");
				curEvent = '䙩';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getByteRange();
				curEvent = null;

			} else if (nextCall.equals('㙫')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode getParent()> ");
				curEvent = '㙫';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode ret = null;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.getParent();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDFormContentStream: void <init>(org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject)> ");
				curEvent = '㹬';
				org.apache.pdfbox.pdmodel.PDFormContentStream ret;
				org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject arg0 = (org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.PDFormContentStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions: void <init>()> ");
				curEvent = '䩬';
				org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getSubject()> ");
				curEvent = '䉭';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSubject();
				curEvent = null;

			} else if (nextCall.equals('䉰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox: java.util.List getWidgets()> ");
				curEvent = '䉰';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䙱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: java.lang.String getTitle()> ");
				curEvent = '䙱';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTitle();
				curEvent = null;

			} else if (nextCall.equals('䙲')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.Map getNames()> ");
				curEvent = '䙲';
				java.util.Map ret;
				org.apache.pdfbox.pdmodel.common.PDNameTreeNode cls = (org.apache.pdfbox.pdmodel.common.PDNameTreeNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNames();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileUnicode()> ");
				curEvent = '㹵';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile ret;
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEmbeddedFileUnicode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationLine: void <init>()> ");
				curEvent = '䉵';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void newLineAtOffset(float,float)> ");
				curEvent = '䉺';
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.newLineAtOffset(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㙼')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination: int retrievePageNumber()> ");
				curEvent = '㙼';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.retrievePageNumber();
				curEvent = null;

			} else if (nextCall.equals('㙿')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i17_LOOPVAR__0'()> ");
				curEvent = '㙿';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox: void unCheck()> ");
				curEvent = '㚀';
				org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox cls = (org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.unCheck();
				curEvent = null;

			} else if (nextCall.equals('㚉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㚉';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('䪉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void saveIncremental(java.io.OutputStream)> ");
				curEvent = '䪉';
				java.io.OutputStream arg0 = (java.io.OutputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.saveIncremental(arg0);
				curEvent = null;

			} else if (nextCall.equals('䚋')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: int getAnnotationFlags()> ");
				curEvent = '䚋';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAnnotationFlags();
				curEvent = null;

			} else if (nextCall.equals('㪒')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox: void <init>(org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm)> ");
				curEvent = '㪒';
				org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox ret;
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm arg0 = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚘')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: float getUpperRightY()> ");
				curEvent = '㚘';
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUpperRightY();
				curEvent = null;

			} else if (nextCall.equals('䪚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.lang.Object <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getAllPages()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䪚';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionURI: void <init>()> ");
				curEvent = '㺜';
				org.apache.pdfbox.pdmodel.interactive.action.PDActionURI ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDActionURI();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䪜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationLink: org.apache.pdfbox.pdmodel.interactive.action.PDAction getAction()> ");
				curEvent = '䪜';
				org.apache.pdfbox.pdmodel.interactive.action.PDAction ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAction();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪞')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()> ");
				curEvent = '㪞';
				java.util.Iterator ret;
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.iterator();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊤')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: int getPage()> ");
				curEvent = '䊤';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPage();
				curEvent = null;

			} else if (nextCall.equals('㪧')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceEntry: void <init>(org.apache.pdfbox.cos.COSBase)> ");
				curEvent = '㪧';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry ret;
				org.apache.pdfbox.cos.COSBase arg0 = (org.apache.pdfbox.cos.COSBase) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void closeAndFillAndStroke()> ");
				curEvent = '㺨';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.closeAndFillAndStroke();
				curEvent = null;

			} else if (nextCall.equals('䊬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getAuthor()> ");
				curEvent = '䊬';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAuthor();
				curEvent = null;

			} else if (nextCall.equals('㚳')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDField: java.util.List getWidgets()> ");
				curEvent = '㚳';
				org.apache.pdfbox.pdmodel.interactive.form.PDField cls = (org.apache.pdfbox.pdmodel.interactive.form.PDField) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getWidgets();
				curEvent = null;

			} else if (nextCall.equals('䊵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.File,java.lang.String)> ");
				curEvent = '䊵';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				java.io.File arg0 = (java.io.File) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.lang.String arg1 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪽')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: java.util.List getSignatureDictionaries()> ");
				curEvent = '㪽';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSignatureDictionaries();
				curEvent = null;

			} else if (nextCall.equals('㫆')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㫆';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㛉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: org.apache.pdfbox.cos.COSName getStreamFilterName()> ");
				curEvent = '㛉';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getStreamFilterName();
				curEvent = null;

			} else if (nextCall.equals('䋉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDStream: byte[] toByteArray()> ");
				curEvent = '䋉';
				org.apache.pdfbox.pdmodel.common.PDStream cls = (org.apache.pdfbox.pdmodel.common.PDStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toByteArray();
				curEvent = null;

			} else if (nextCall.equals('䫉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: java.awt.geom.GeneralPath toGeneralPath()> ");
				curEvent = '䫉';
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toGeneralPath();
				curEvent = null;

			} else if (nextCall.equals('㻐')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFile()> ");
				curEvent = '㻐';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile ret;
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEmbeddedFile();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㛓')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDField: java.lang.String getValueAsString()> ");
				curEvent = '㛓';
				org.apache.pdfbox.pdmodel.interactive.form.PDField cls = (org.apache.pdfbox.pdmodel.interactive.form.PDField) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getValueAsString();
				curEvent = null;

			} else if (nextCall.equals('䫜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-1267076115_i2_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-1267076115_i2_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䫜';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㛠')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.lang.String getSubFilter()> ");
				curEvent = '㛠';
				java.lang.String ret;
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSubFilter();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻠')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary: void <init>(org.apache.pdfbox.cos.COSDictionary)> ");
				curEvent = '㻠';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary ret;
				org.apache.pdfbox.cos.COSDictionary arg0 = (org.apache.pdfbox.cos.COSDictionary) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㛥')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void transform(org.apache.pdfbox.util.Matrix)> ");
				curEvent = '㛥';
				org.apache.pdfbox.util.Matrix arg0 = (org.apache.pdfbox.util.Matrix) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.transform(arg0);
				curEvent = null;

			} else if (nextCall.equals('䋦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i17_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i17_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䋦';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceCharacteristicsDictionary: void <init>(org.apache.pdfbox.cos.COSDictionary)> ");
				curEvent = '㫰';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary ret;
				org.apache.pdfbox.cos.COSDictionary arg0 = (org.apache.pdfbox.cos.COSDictionary) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDMetadata: java.io.InputStream exportXMPMetadata()> ");
				curEvent = '㻱';
				org.apache.pdfbox.pdmodel.common.PDMetadata cls = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.exportXMPMetadata();
				curEvent = null;

			} else if (nextCall.equals('㛳')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getOutputIntents()> ");
				curEvent = '㛳';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOutputIntents();
				curEvent = null;

			} else if (nextCall.equals('䋷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: byte[] getSignedContent(java.io.InputStream)> ");
				curEvent = '䋷';
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSignedContent(arg0);
				curEvent = null;

			} else if (nextCall.equals('㻹')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> ");
				curEvent = '㻹';
				int ret;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRotation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䫾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(byte[])> ");
				curEvent = '䫾';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner xAxis(float)> ");
				curEvent = '䬀';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner ret;
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.xAxis(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬂')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField: void <init>(org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm)> ");
				curEvent = '㬂';
				org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField ret;
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm arg0 = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬃')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void close()> ");
				curEvent = '㬃';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䜄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: byte[] getContents(byte[])> ");
				curEvent = '䜄';
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContents(arg0);
				curEvent = null;

			} else if (nextCall.equals('䬄')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.COSArrayList: java.lang.Object <org.apache.pdfbox.pdmodel.common.COSArrayList: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '䬄';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬅')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: void constructAppearances(org.apache.pdfbox.pdmodel.PDDocument)> ");
				curEvent = '䬅';
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.constructAppearances(arg0);
				curEvent = null;

			} else if (nextCall.equals('䜆')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton: void <init>(org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm)> ");
				curEvent = '䜆';
				org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton ret;
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm arg0 = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties visualSignEnabled(boolean)> ");
				curEvent = '㜈';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				boolean arg0 = (boolean) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.visualSignEnabled(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void moveTo(float,float)> ");
				curEvent = '㼈';
				float arg0 = (float) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.moveTo(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('䜈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDPageLabelRange: void <init>()> ");
				curEvent = '䜈';
				org.apache.pdfbox.pdmodel.common.PDPageLabelRange ret;
				ret = new org.apache.pdfbox.pdmodel.common.PDPageLabelRange();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼋')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR_<org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㼋';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner: void <init>(java.io.InputStream)> ");
				curEvent = '䬎';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌑')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: float getLowerLeftX()> ");
				curEvent = '䌑';
				float ret;
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getLowerLeftX();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䜗')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationMarkup: void <init>()> ");
				curEvent = '䜗';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream)> ");
				curEvent = '㼛';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationWidget: org.apache.pdfbox.pdmodel.common.PDRectangle getRectangle()> ");
				curEvent = '䌛';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㜜')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getColorSpaceNames()> ");
				curEvent = '㜜';
				org.apache.pdfbox.pdmodel.PDResources cls = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getColorSpaceNames();
				curEvent = null;

			} else if (nextCall.equals('䬝')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: void calculateLimits()> ");
				curEvent = '䬝';
				org.apache.pdfbox.pdmodel.common.PDNameTreeNode cls = (org.apache.pdfbox.pdmodel.common.PDNameTreeNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.calculateLimits();
				curEvent = null;

			} else if (nextCall.equals('㬦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDMetadata: void importXMPMetadata(byte[])> ");
				curEvent = '㬦';
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.common.PDMetadata cls = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.importXMPMetadata(arg0);
				curEvent = null;

			} else if (nextCall.equals('㬬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: boolean getNeedAppearances()> ");
				curEvent = '㬬';
				boolean ret;
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm cls = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNeedAppearances();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.cos.COSDictionary getCOSObject()> ");
				curEvent = '㜰';
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCOSObject();
				curEvent = null;

			} else if (nextCall.equals('㬺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '㬺';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼼')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getCustomMetadataValue(java.lang.String)> ");
				curEvent = '㼼';
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCustomMetadataValue(arg0);
				curEvent = null;

			} else if (nextCall.equals('㜿')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination: void <init>()> ");
				curEvent = '㜿';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceEntry getRolloverAppearance()> ");
				curEvent = '㽀';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getRolloverAppearance();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝍')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getCreator()> ");
				curEvent = '䝍';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCreator();
				curEvent = null;

			} else if (nextCall.equals('㭛')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractContent()> ");
				curEvent = '㭛';
				boolean ret;
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.canExtractContent();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties signatureReason(java.lang.String)> ");
				curEvent = '㝣';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.signatureReason(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: java.lang.Iterable children()> ");
				curEvent = '䝣';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.children();
				curEvent = null;

			} else if (nextCall.equals('㭯')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDResources: boolean <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getFontNames()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㭯';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.util.Calendar getSignDate()> ");
				curEvent = '䭱';
				java.util.Calendar ret;
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSignDate();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: void <init>()> ");
				curEvent = '䝴';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR_<org'.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䭴';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝵')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: boolean isOutside255Interval(int)> ");
				curEvent = '㝵';
				boolean ret = false;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.isOutside255Interval(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceCharacteristicsDictionary: java.lang.String getNormalCaption()> ");
				curEvent = '㽶';
				java.lang.String ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNormalCaption();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: boolean isNoZoom()> ");
				curEvent = '㽸';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isNoZoom();
				curEvent = null;

			} else if (nextCall.equals('㝻')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.PDEncryption: boolean isEncryptMetaData()> ");
				curEvent = '㝻';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption cls = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncryptMetaData();
				curEvent = null;

			} else if (nextCall.equals('㭻')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void drawForm(org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject)> ");
				curEvent = '㭻';
				org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject arg0 = (org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawForm(arg0);
				curEvent = null;

			} else if (nextCall.equals('䍾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument,org.apache.pdfbox.pdmodel.PDPage,boolean,boolean,boolean)> ");
				curEvent = '䍾';
				org.apache.pdfbox.pdmodel.PDPageContentStream ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPage arg1 = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				boolean arg2 = (boolean) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				boolean arg3 = (boolean) getVarValue(pickInVar(nextCall, "arg3"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg3") + ") => " + arg3);
				boolean arg4 = (boolean) getVarValue(pickInVar(nextCall, "arg4"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg4") + ") => " + arg4);
				ret = new org.apache.pdfbox.pdmodel.PDPageContentStream(arg0,arg1,arg2,arg3,arg4);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile: int getSize()> ");
				curEvent = '䭾';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSize();
				curEvent = null;

			} else if (nextCall.equals('䞁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: java.lang.Object <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_next(java.util.Iterator)> ");
				curEvent = '䞁';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䮏')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: byte[] getContents()> ");
				curEvent = '䮏';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getContents();
				curEvent = null;

			} else if (nextCall.equals('㞐')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getCreationDate()> ");
				curEvent = '㞐';
				java.util.Calendar ret;
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCreationDate();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎢')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationWidget: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDBorderStyleDictionary getBorderStyle()> ");
				curEvent = '䎢';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getBorderStyle();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䞦')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileMac()> ");
				curEvent = '䞦';
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile ret;
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEmbeddedFileMac();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䞧')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript: void <init>()> ");
				curEvent = '䞧';
				org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㞨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void showText(java.lang.String)> ");
				curEvent = '㞨';
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.showText(arg0);
				curEvent = null;

			} else if (nextCall.equals('䞪')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.List getKids()> ");
				curEvent = '䞪';
				java.util.List ret;
				org.apache.pdfbox.pdmodel.common.PDNameTreeNode cls = (org.apache.pdfbox.pdmodel.common.PDNameTreeNode) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getKids();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎫')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties signerLocation(java.lang.String)> ");
				curEvent = '䎫';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.signerLocation(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䮮')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: boolean isLocked()> ");
				curEvent = '䮮';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isLocked();
				curEvent = null;

			} else if (nextCall.equals('㮰')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getBBox()> ");
				curEvent = '㮰';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getBBox();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()> ");
				curEvent = '䎱';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎹')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile: byte[] toByteArray()> ");
				curEvent = '䎹';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㯀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.COSArrayList: boolean <org.apache.pdfbox.pdmodel.common.COSArrayList: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> ");
				curEvent = '㯀';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟅')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getModificationDate()> ");
				curEvent = '㟅';
				java.util.Calendar ret;
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getModificationDate();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㿈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner: org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner adjustForRotation()> ");
				curEvent = '㿈';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner ret;
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner cls = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.adjustForRotation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䯈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: java.lang.String getFileDescription()> ");
				curEvent = '䯈';
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileDescription();
				curEvent = null;

			} else if (nextCall.equals('䟋')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo getMarkInfo()> ");
				curEvent = '䟋';
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMarkInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getMediaBox()> ");
				curEvent = '㟎';
				org.apache.pdfbox.pdmodel.common.PDRectangle ret;
				org.apache.pdfbox.pdmodel.PDPage cls = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMediaBox();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 129569825_i9_LOOPVAR__0()> ");
				curEvent = '䏎';
				int ret;
				ret = (0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏒')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: boolean isNoRotate()> ");
				curEvent = '䏒';
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isNoRotate();
				curEvent = null;

			} else if (nextCall.equals('䯕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: boolean <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: java.util.List getChildren()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䯕';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䟖')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPage getPage(int)> ");
				curEvent = '䟖';
				org.apache.pdfbox.pdmodel.PDPage ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPage(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟚')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: java.lang.String getFilename()> ");
				curEvent = '䟚';
				org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification cls = (org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFilename();
				curEvent = null;

			} else if (nextCall.equals('㯡')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.common.PDRectangle: float getHeight()> ");
				curEvent = '㯡';
				org.apache.pdfbox.pdmodel.common.PDRectangle cls = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeight();
				curEvent = null;

			} else if (nextCall.equals('㯢')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void <init>(org.apache.pdfbox.pdmodel.PDDocument,org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern,java.io.OutputStream)> ");
				curEvent = '㯢';
				org.apache.pdfbox.pdmodel.PDPageContentStream ret;
				org.apache.pdfbox.pdmodel.PDDocument arg0 = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern arg1 = (org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				java.io.OutputStream arg2 = (java.io.OutputStream) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				ret = new org.apache.pdfbox.pdmodel.PDPageContentStream(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㿣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void closeAndStroke()> ");
				curEvent = '㿣';
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.closeAndStroke();
				curEvent = null;

			} else if (nextCall.equals('㯪')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageContentStream: void drawImage(org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject,float,float)> ");
				curEvent = '㯪';
				org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject arg0 = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				float arg1 = (float) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				float arg2 = (float) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				org.apache.pdfbox.pdmodel.PDPageContentStream cls = (org.apache.pdfbox.pdmodel.PDPageContentStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.drawImage(arg0,arg1,arg2);
				curEvent = null;

			} else if (nextCall.equals('䏮')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationFileAttachment: org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification getFile()> ");
				curEvent = '䏮';
				org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification ret;
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment cls = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFile();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟱')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTrapped()> ");
				curEvent = '㟱';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTrapped();
				curEvent = null;

			} else if (nextCall.equals('䯷')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int 2094912986_i2_LOOPVAR_<org.apache.pdfbox.pdmodel.PDDocument: int 2094912986_i2_LOOPVAR__0()>.RET_(arg0 + 1)(int)> ");
				curEvent = '䯷';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = ((arg0 + 1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.File)> ");
				curEvent = '䏸';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				java.io.File arg0 = (java.io.File) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䟸')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm()> ");
				curEvent = '䟸';
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAcroForm();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏽')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: boolean isNodeOpen()> ");
				curEvent = '䏽';
				boolean ret;
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isNodeOpen();
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
	@Override
	protected void runNextCall(Character nextCall) throws HarnessException {
            boolean find = false;
            find = subrun1(nextCall);
            if (!find)
                find = subrun2(nextCall);
            if (!find)
                find = subrun3(nextCall);
            if (!find)
				throw new RuntimeException("this should not happen, an unknown func letter '" + nextCall + "'");

	}

	@SuppressWarnings("IdentityBinaryExpression")
	@Override
	protected Character checkCondTriggers(List<Character> conds) throws HarnessException {
		Character happenedEvent = null;

		for (Character cond : conds) {

			boolean satisfies = false;

			if (cond.equals('䠀')) {
				curEvent = '䠀';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.PDPage findDestinationPage(org.apache.pdfbox.pdmodel.PDDocument)> */
				org.apache.pdfbox.pdmodel.PDPage v_44_ = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(getOutVar('䀘', "ret"));
				satisfies = (v_44_ == null);
				curEvent = null;

			} else if (cond.equals('䐅')) {
				curEvent = '䐅';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentCatalog getDocumentCatalog()> */
				org.apache.pdfbox.pdmodel.PDDocumentCatalog v_111_ = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(getOutVar('䕩', "ret"));
				satisfies = (Not(v_111_ == null));
				curEvent = null;

			} else if (cond.equals('䠇')) {
				curEvent = '䠇';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_62_ <= 0);
				curEvent = null;

			} else if (cond.equals('䰇')) {
				curEvent = '䰇';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination findNamedDestinationPage(org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination)> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination v_17_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination) getVarValue(getOutVar('䅂', "ret"));
				satisfies = (Not(v_17_ == null));
				curEvent = null;

			} else if (cond.equals('㐕')) {
				curEvent = '㐕';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot getStructureTreeRoot()> */
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot v_281_ = (org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot) getVarValue(getOutVar('䥫', "ret"));
				satisfies = (Not(v_281_ == null));
				curEvent = null;

			} else if (cond.equals('䀗')) {
				curEvent = '䀗';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo getMarkInfo()> */
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo v_51_ = (org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo) getVarValue(getOutVar('䟋', "ret"));
				satisfies = (v_51_ == null);
				curEvent = null;

			} else if (cond.equals('㠘')) {
				curEvent = '㠘';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: boolean <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: java.util.List getChildren()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_43_ = (UNKNOWN) getVarValue(getOutVar('䯕', "ret"));
				satisfies = false; //(Not(v_43_ == null));
				curEvent = null;

			} else if (cond.equals('䰙')) {
				curEvent = '䰙';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: org.apache.pdfbox.pdmodel.interactive.form.PDField getField(java.lang.String)> */
				org.apache.pdfbox.pdmodel.interactive.form.PDField v_70_ = (org.apache.pdfbox.pdmodel.interactive.form.PDField) getVarValue(getOutVar('䑶', "ret"));
				satisfies = (v_70_ == null);
				curEvent = null;

			} else if (cond.equals('㠜')) {
				curEvent = '㠜';
				/* <org.apache.pdfbox.pdmodel.PDPage: boolean <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_207_ = (boolean) getVarValue(getOutVar('㶦', "ret"));
				satisfies = (v_207_ == false);
				curEvent = null;

			} else if (cond.equals('㠬')) {
				curEvent = '㠬';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i16_LOOPVAR__0'()> */
				int v_94_ = (int) getVarValue(getOutVar('䘮', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_62_ <= v_94_));
				curEvent = null;

			} else if (cond.equals('䀬')) {
				curEvent = '䀬';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (v_74_ == 180);
				curEvent = null;

			} else if (cond.equals('㠮')) {
				curEvent = '㠮';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination getDestination()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination v_145_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination) getVarValue(getOutVar('䅑', "ret"));
				satisfies = (v_145_ == null);
				curEvent = null;

			} else if (cond.equals('㠲')) {
				curEvent = '㠲';
				/* <org.apache.pdfbox.pdmodel.PDDocumentNameDictionary: org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode getEmbeddedFiles()> */
				org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode v_140_ = (org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode) getVarValue(getOutVar('䘶', "ret"));
				satisfies = (v_140_ == null);
				curEvent = null;

			} else if (cond.equals('䀴')) {
				curEvent = '䀴';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: boolean <org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField: java.util.List getChildren()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_43_ = (UNKNOWN) getVarValue(getOutVar('䯕', "ret"));
				satisfies = false; //(v_43_ == null);
				curEvent = null;

			} else if (cond.equals('䰷')) {
				curEvent = '䰷';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getProducer()> */
				java.lang.String v_183_ = (java.lang.String) getVarValue(getOutVar('㣬', "ret"));
				satisfies = (v_183_ == null);
				curEvent = null;

			} else if (cond.equals('䠸')) {
				curEvent = '䠸';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()> */
				int v_144_ = (int) getVarValue(getOutVar('䰁', "ret"));
				satisfies = (v_62_ <= v_144_);
				curEvent = null;

			} else if (cond.equals('䐺')) {
				curEvent = '䐺';
				/* <org.apache.pdfbox.pdmodel.PDResources: boolean <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getXObjectNames()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_259_ = (boolean) getVarValue(getOutVar('䆞', "ret"));
				satisfies = (v_259_ == false);
				curEvent = null;

			} else if (cond.equals('䰺')) {
				curEvent = '䰺';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getArtBox()> */
				org.apache.pdfbox.pdmodel.common.PDRectangle v_168_ = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(getOutVar('㣊', "ret"));
				satisfies = (v_168_ == null);
				curEvent = null;

			} else if (cond.equals('䐻')) {
				curEvent = '䐻';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getCropBox()> */
				org.apache.pdfbox.pdmodel.common.PDRectangle v_220_ = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(getOutVar('䗂', "ret"));
				satisfies = (Not(v_220_ == null));
				curEvent = null;

			} else if (cond.equals('䀼')) {
				curEvent = '䀼';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm()> */
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm v_78_ = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(getOutVar('䟸', "ret"));
				satisfies = (v_78_ == null);
				curEvent = null;

			} else if (cond.equals('A')) {
				curEvent = 'A';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int getCount()> */
				int v_297_ = (int) getVarValue(getOutVar('䗴', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()> */
				int v_22_ = (int) getVarValue(getOutVar('㧲', "ret"));
				satisfies = (v_22_ <= v_297_);
				curEvent = null;

			} else if (cond.equals('䑈')) {
				curEvent = '䑈';
				/* <org.apache.pdfbox.pdmodel.PDDocument: boolean isEncrypted()> */
				boolean v_164_ = (boolean) getVarValue(getOutVar('䃹', "ret"));
				satisfies = (Not(v_164_ == false));
				curEvent = null;

			} else if (cond.equals('䱊')) {
				curEvent = '䱊';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getMediaBox()> */
				org.apache.pdfbox.pdmodel.common.PDRectangle v_316_ = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(getOutVar('㟎', "ret"));
				satisfies = (v_316_ == null);
				curEvent = null;

			} else if (cond.equals('㑙')) {
				curEvent = '㑙';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: boolean hasChildren()> */
				boolean v_254_ = (boolean) getVarValue(getOutVar('䶸', "ret"));
				satisfies = (Not(v_254_ == false));
				curEvent = null;

			} else if (cond.equals('䑟')) {
				curEvent = '䑟';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (2 <= v_62_);
				curEvent = null;

			} else if (cond.equals('䑤')) {
				curEvent = '䑤';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream,java.lang.String)> */
				org.apache.pdfbox.pdmodel.PDDocument v_19_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䃺', "ret"));
				satisfies = (v_19_ == null);
				curEvent = null;

			} else if (cond.equals('䁪')) {
				curEvent = '䁪';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationWidget: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDBorderStyleDictionary getBorderStyle()> */
				org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary v_306_ = (org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary) getVarValue(getOutVar('䎢', "ret"));
				satisfies = (v_306_ == null);
				curEvent = null;

			} else if (cond.equals('䱲')) {
				curEvent = '䱲';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i17_LOOPVAR__0'()> */
				int v_205_ = (int) getVarValue(getOutVar('㙿', "ret"));
				satisfies = (v_62_ <= v_205_);
				curEvent = null;

			} else if (cond.equals('䱶')) {
				curEvent = '䱶';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.PDEncryption getEncryption()> */
				org.apache.pdfbox.pdmodel.encryption.PDEncryption v_92_ = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(getOutVar('䧋', "ret"));
				satisfies = (Not(v_92_ == null));
				curEvent = null;

			} else if (cond.equals('w')) {
				curEvent = 'w';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: boolean isNodeOpen()> */
				boolean v_251_ = (boolean) getVarValue(getOutVar('㷧', "ret"));
				satisfies = (Not(v_251_ == false));
				curEvent = null;

			} else if (cond.equals('䑺')) {
				curEvent = '䑺';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(1 <= v_62_));
				curEvent = null;

			} else if (cond.equals('䑻')) {
				curEvent = '䑻';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-2122759264_i6_LOOPVAR__1'()> */
				int v_66_ = (int) getVarValue(getOutVar('䲸', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_66_ <= v_62_);
				curEvent = null;

			} else if (cond.equals('䡿')) {
				curEvent = '䡿';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getCreationDate()> */
				java.util.Calendar v_252_ = (java.util.Calendar) getVarValue(getOutVar('㞐', "ret"));
				satisfies = (v_252_ == null);
				curEvent = null;

			} else if (cond.equals('䢀')) {
				curEvent = '䢀';
				/* <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractContent()> */
				boolean v_197_ = (boolean) getVarValue(getOutVar('㭛', "ret"));
				satisfies = (v_197_ == false);
				curEvent = null;

			} else if (cond.equals('㒃')) {
				curEvent = '㒃';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getModificationDate()> */
				java.util.Calendar v_41_ = (java.util.Calendar) getVarValue(getOutVar('㟅', "ret"));
				satisfies = (Not(v_41_ == null));
				curEvent = null;

			} else if (cond.equals('䂃')) {
				curEvent = '䂃';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-552918901_i7_LOOPVAR__0'()> */
				int v_100_ = (int) getVarValue(getOutVar('䥕', "ret"));
				satisfies = (Not(v_62_ <= v_100_));
				curEvent = null;

			} else if (cond.equals('㢅')) {
				curEvent = '㢅';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (Not(v_74_ == 270));
				curEvent = null;

			} else if (cond.equals('䢅')) {
				curEvent = '䢅';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getMediaBox()> */
				org.apache.pdfbox.pdmodel.common.PDRectangle v_316_ = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(getOutVar('㟎', "ret"));
				satisfies = (Not(v_316_ == null));
				curEvent = null;

			} else if (cond.equals('㢍')) {
				curEvent = '㢍';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentInformation getDocumentInformation()> */
				org.apache.pdfbox.pdmodel.PDDocumentInformation v_217_ = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(getOutVar('㠏', "ret"));
				satisfies = (v_217_ == null);
				curEvent = null;

			} else if (cond.equals('䲓')) {
				curEvent = '䲓';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (v_74_ == 90);
				curEvent = null;

			} else if (cond.equals('䒖')) {
				curEvent = '䒖';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-1267076115_i2_LOOPVAR__0'()> */
				//UNKNOWN v_163_ = (UNKNOWN) getVarValue(getOutVar('䅵', "ret"));
				satisfies = false;//(v_62_ <= v_163_);
				curEvent = null;

			} else if (cond.equals('䲢')) {
				curEvent = '䲢';
				/* <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()> */
				java.util.List v_333_ = (java.util.List) getVarValue(getOutVar('䰥', "ret"));
				satisfies = (v_333_ == null);
				curEvent = null;

			} else if (cond.equals('㒤')) {
				curEvent = '㒤';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()> */
				int v_228_ = (int) getVarValue(getOutVar('䎱', "ret"));
				satisfies = (v_62_ <= v_228_);
				curEvent = null;

			} else if (cond.equals('䒪')) {
				curEvent = '䒪';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: boolean <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_177_ = (boolean) getVarValue(getOutVar('䄦', "ret"));
				satisfies = (v_177_ == false);
				curEvent = null;

			} else if (cond.equals('䲪')) {
				curEvent = '䲪';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.File,java.lang.String)> */
				org.apache.pdfbox.pdmodel.PDDocument v_137_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䊵', "ret"));
				satisfies = (Not(v_137_ == null));
				curEvent = null;

			} else if (cond.equals('㒯')) {
				curEvent = '㒯';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPage getPage(int)> */
				org.apache.pdfbox.pdmodel.PDPage v_240_ = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(getOutVar('䟖', "ret"));
				satisfies = (v_240_ == null);
				curEvent = null;

			} else if (cond.equals('㢳')) {
				curEvent = '㢳';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationLink: org.apache.pdfbox.pdmodel.interactive.action.PDAction getAction()> */
				org.apache.pdfbox.pdmodel.interactive.action.PDAction v_206_ = (org.apache.pdfbox.pdmodel.interactive.action.PDAction) getVarValue(getOutVar('䪜', "ret"));
				satisfies = (v_206_ == null);
				curEvent = null;

			} else if (cond.equals('䳒')) {
				curEvent = '䳒';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode getParent()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode v_204_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(getOutVar('㙫', "ret"));
				satisfies = (v_204_ == null);
				curEvent = null;

			} else if (cond.equals('䣔')) {
				curEvent = '䣔';
				/* <org.apache.pdfbox.pdmodel.PDPageContentStream: boolean isOutsideOneInterval(double)> */
				boolean v_185_ = (boolean) getVarValue(getOutVar('㦟', "ret"));
				satisfies = (v_185_ == false);
				curEvent = null;

			} else if (cond.equals('䳝')) {
				curEvent = '䳝';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (Not(v_74_ == 90));
				curEvent = null;

			} else if (cond.equals('䣟')) {
				curEvent = '䣟';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.AccessPermission getCurrentAccessPermission()> */
				org.apache.pdfbox.pdmodel.encryption.AccessPermission v_321_ = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(getOutVar('䩁', "ret"));
				satisfies = (v_321_ == null);
				curEvent = null;

			} else if (cond.equals('䓡')) {
				curEvent = '䓡';
				/* <org.apache.pdfbox.pdmodel.PDResources: java.util.Map getImages()> */
				java.util.Map v_113_ = (java.util.Map) getVarValue(getOutVar('㴢', "ret"));
				satisfies = (v_113_ == null);
				curEvent = null;

			} else if (cond.equals('䣫')) {
				curEvent = '䣫';
				/* <org.apache.pdfbox.pdmodel.PDPageContentStream: boolean isOutsideOneInterval(double)> */
				boolean v_185_ = (boolean) getVarValue(getOutVar('㦟', "ret"));
				satisfies = (Not(v_185_ == false));
				curEvent = null;

			} else if (cond.equals('䓭')) {
				curEvent = '䓭';
				/* <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.Map getNames()> */
				java.util.Map v_236_ = (java.util.Map) getVarValue(getOutVar('䙲', "ret"));
				satisfies = (Not(v_236_ == null));
				curEvent = null;

			} else if (cond.equals('䓷')) {
				curEvent = '䓷';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.lang.String getSubFilter()> */
				java.lang.String v_199_ = (java.lang.String) getVarValue(getOutVar('㛠', "ret"));
				satisfies = (Not(v_199_ == null));
				curEvent = null;

			} else if (cond.equals('㓺')) {
				curEvent = '㓺';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceCharacteristicsDictionary: java.lang.String getNormalCaption()> */
				java.lang.String v_97_ = (java.lang.String) getVarValue(getOutVar('㽶', "ret"));
				satisfies = (v_97_ == null);
				curEvent = null;

			} else if (cond.equals('䃻')) {
				curEvent = '䃻';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationWidget: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDBorderStyleDictionary getBorderStyle()> */
				org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary v_306_ = (org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary) getVarValue(getOutVar('䎢', "ret"));
				satisfies = (Not(v_306_ == null));
				curEvent = null;

			} else if (cond.equals('㓼')) {
				curEvent = '㓼';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.interactive.action.PDAction getAction()> */
				org.apache.pdfbox.pdmodel.interactive.action.PDAction v_52_ = (org.apache.pdfbox.pdmodel.interactive.action.PDAction) getVarValue(getOutVar('䅻', "ret"));
				satisfies = (Not(v_52_ == null));
				curEvent = null;

			} else if (cond.equals('䄒')) {
				curEvent = '䄒';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 129569825_i9_LOOPVAR__0()> */
				int v_89_ = (int) getVarValue(getOutVar('䏎', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_62_ <= v_89_));
				curEvent = null;

			} else if (cond.equals('㤓')) {
				curEvent = '㤓';
				/* <org.apache.pdfbox.pdmodel.PDDocumentNameDictionary: org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode getEmbeddedFiles()> */
				org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode v_140_ = (org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode) getVarValue(getOutVar('䘶', "ret"));
				satisfies = (Not(v_140_ == null));
				curEvent = null;

			} else if (cond.equals('㔜')) {
				curEvent = '㔜';
				/* <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileUnicode()> */
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile v_290_ = (org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) getVarValue(getOutVar('㹵', "ret"));
				satisfies = (Not(v_290_ == null));
				curEvent = null;

			} else if (cond.equals('䔠')) {
				curEvent = '䔠';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1729577450_i5_LOOPVAR__1()> */
				int v_186_ = (int) getVarValue(getOutVar('䨴', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_186_ <= v_62_));
				curEvent = null;

			} else if (cond.equals('䄳')) {
				curEvent = '䄳';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: org.apache.pdfbox.pdmodel.interactive.form.PDField getField(java.lang.String)> */
				org.apache.pdfbox.pdmodel.interactive.form.PDField v_70_ = (org.apache.pdfbox.pdmodel.interactive.form.PDField) getVarValue(getOutVar('䑶', "ret"));
				satisfies = (Not(v_70_ == null));
				curEvent = null;

			} else if (cond.equals('䔸')) {
				curEvent = '䔸';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDMetadata getMetadata()> */
				org.apache.pdfbox.pdmodel.common.PDMetadata v_191_ = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(getOutVar('㥦', "ret"));
				satisfies = (v_191_ == null);
				curEvent = null;

			} else if (cond.equals('㔾')) {
				curEvent = '㔾';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(2 <= v_62_));
				curEvent = null;

			} else if (cond.equals('㵄')) {
				curEvent = '㵄';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDMetadata getMetadata()> */
				org.apache.pdfbox.pdmodel.common.PDMetadata v_191_ = (org.apache.pdfbox.pdmodel.common.PDMetadata) getVarValue(getOutVar('㥦', "ret"));
				satisfies = (Not(v_191_ == null));
				curEvent = null;

			} else if (cond.equals('㕆')) {
				curEvent = '㕆';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: boolean getNeedAppearances()> */
				boolean v_79_ = (boolean) getVarValue(getOutVar('㬬', "ret"));
				satisfies = (Not(v_79_ == false));
				curEvent = null;

			} else if (cond.equals('㕌')) {
				curEvent = '㕌';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-1267076115_i2_LOOPVAR__0'()> */
				//UNKNOWN v_163_ = (UNKNOWN) getVarValue(getOutVar('䅵', "ret"));
				satisfies = false;//(Not(v_62_ <= v_163_));
				curEvent = null;

			} else if (cond.equals('䵏')) {
				curEvent = '䵏';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getCropBox()> */
				org.apache.pdfbox.pdmodel.common.PDRectangle v_220_ = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(getOutVar('䗂', "ret"));
				satisfies = (v_220_ == null);
				curEvent = null;

			} else if (cond.equals('㥘')) {
				curEvent = '㥘';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (1 <= v_62_);
				curEvent = null;

			} else if (cond.equals('㕝')) {
				curEvent = '㕝';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm(org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup)> */
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm v_227_ = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(getOutVar('䳩', "ret"));
				satisfies = (Not(v_227_ == null));
				curEvent = null;

			} else if (cond.equals('䕝')) {
				curEvent = '䕝';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem getFirstChild()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem v_30_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(getOutVar('䄸', "ret"));
				satisfies = (v_30_ == null);
				curEvent = null;

			} else if (cond.equals('㕟')) {
				curEvent = '㕟';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 2094912986_i2_LOOPVAR__0()> */
				int v_33_ = (int) getVarValue(getOutVar('㴊', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_62_ <= v_33_);
				curEvent = null;

			} else if (cond.equals('㵟')) {
				curEvent = '㵟';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_62_ <= 1);
				curEvent = null;

			} else if (cond.equals('䵢')) {
				curEvent = '䵢';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (Not(v_74_ == 0));
				curEvent = null;

			} else if (cond.equals('㵰')) {
				curEvent = '㵰';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-552918901_i7_LOOPVAR__0'()> */
				int v_100_ = (int) getVarValue(getOutVar('䥕', "ret"));
				satisfies = (v_62_ <= v_100_);
				curEvent = null;

			} else if (cond.equals('㶉')) {
				curEvent = '㶉';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_62_ <= 0));
				curEvent = null;

			} else if (cond.equals('䶎')) {
				curEvent = '䶎';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 129569825_i9_LOOPVAR__0()> */
				int v_89_ = (int) getVarValue(getOutVar('䏎', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_62_ <= v_89_);
				curEvent = null;

			} else if (cond.equals('㦒')) {
				curEvent = '㦒';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: boolean isNodeOpen()> */
				boolean v_251_ = (boolean) getVarValue(getOutVar('㷧', "ret"));
				satisfies = (v_251_ == false);
				curEvent = null;

			} else if (cond.equals('㦛')) {
				curEvent = '㦛';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getAllPages()> */
				java.util.List v_81_ = (java.util.List) getVarValue(getOutVar('䶮', "ret"));
				satisfies = (v_81_ == null);
				curEvent = null;

			} else if (cond.equals('䦢')) {
				curEvent = '䦢';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.PDEncryption getEncryption()> */
				org.apache.pdfbox.pdmodel.encryption.PDEncryption v_92_ = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) getVarValue(getOutVar('䧋', "ret"));
				satisfies = (v_92_ == null);
				curEvent = null;

			} else if (cond.equals('䶢')) {
				curEvent = '䶢';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline getDocumentOutline()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline v_241_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline) getVarValue(getOutVar('㒩', "ret"));
				satisfies = (v_241_ == null);
				curEvent = null;

			} else if (cond.equals('㦦')) {
				curEvent = '㦦';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: boolean isNodeOpen()> */
				boolean v_176_ = (boolean) getVarValue(getOutVar('䏽', "ret"));
				satisfies = (Not(v_176_ == false));
				curEvent = null;

			} else if (cond.equals('㦩')) {
				curEvent = '㦩';
				/* <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileDos()> */
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile v_108_ = (org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) getVarValue(getOutVar('䦿', "ret"));
				satisfies = (Not(v_108_ == null));
				curEvent = null;

			} else if (cond.equals('䶩')) {
				curEvent = '䶩';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1705811803_i2_LOOPVAR__0()> */
				int v_101_ = (int) getVarValue(getOutVar('㴈', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_62_ <= v_101_));
				curEvent = null;

			} else if (cond.equals('㶯')) {
				curEvent = '㶯';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.interactive.action.PDAction getAction()> */
				org.apache.pdfbox.pdmodel.interactive.action.PDAction v_52_ = (org.apache.pdfbox.pdmodel.interactive.action.PDAction) getVarValue(getOutVar('䅻', "ret"));
				satisfies = (v_52_ == null);
				curEvent = null;

			} else if (cond.equals('䦸')) {
				curEvent = '䦸';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (Not(v_74_ == 90 || v_74_ == 180 || v_74_ == 270));
				curEvent = null;

			} else if (cond.equals('䆼')) {
				curEvent = '䆼';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()> */
				int v_133_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (Not(v_133_ <= v_62_));
				curEvent = null;

			} else if (cond.equals('㗅')) {
				curEvent = '㗅';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (v_74_ == 270);
				curEvent = null;

			} else if (cond.equals('㷅')) {
				curEvent = '㷅';
				/* <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.List getKids()> */
				java.util.List v_310_ = (java.util.List) getVarValue(getOutVar('䞪', "ret"));
				satisfies = (Not(v_310_ == null));
				curEvent = null;

			} else if (cond.equals('㷇')) {
				curEvent = '㷇';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: boolean hasChildren()> */
				boolean v_254_ = (boolean) getVarValue(getOutVar('䶸', "ret"));
				satisfies = (v_254_ == false);
				curEvent = null;

			} else if (cond.equals('㗉')) {
				curEvent = '㗉';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_62_ <= 1));
				curEvent = null;

			} else if (cond.equals('㷒')) {
				curEvent = '㷒';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.util.Calendar getSignDate()> */
				java.util.Calendar v_47_ = (java.util.Calendar) getVarValue(getOutVar('䭱', "ret"));
				satisfies = (v_47_ == null);
				curEvent = null;

			} else if (cond.equals('䗘')) {
				curEvent = '䗘';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getAllPages()> */
				java.util.List v_81_ = (java.util.List) getVarValue(getOutVar('䶮', "ret"));
				satisfies = (Not(v_81_ == null));
				curEvent = null;

			} else if (cond.equals('㷟')) {
				curEvent = '㷟';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR__0()> */
				int v_123_ = (int) getVarValue(getOutVar('䰋', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_62_ <= v_123_));
				curEvent = null;

			} else if (cond.equals('㧢')) {
				curEvent = '㧢';
				/* <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.Map getNames()> */
				java.util.Map v_236_ = (java.util.Map) getVarValue(getOutVar('䙲', "ret"));
				satisfies = (v_236_ == null);
				curEvent = null;

			} else if (cond.equals('㧫')) {
				curEvent = '㧫';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination findNamedDestinationPage(org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination)> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination v_17_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination) getVarValue(getOutVar('䅂', "ret"));
				satisfies = (v_17_ == null);
				curEvent = null;

			} else if (cond.equals('㧬')) {
				curEvent = '㧬';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.PDResources getResources()> */
				org.apache.pdfbox.pdmodel.PDResources v_195_ = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(getOutVar('㠸', "ret"));
				satisfies = (Not(v_195_ == null));
				curEvent = null;

			} else if (cond.equals('䇱')) {
				curEvent = '䇱';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1672575026_i1_LOOPVAR__0()> */
				int v_123_ = (int) getVarValue(getOutVar('䰋', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_62_ <= v_123_);
				curEvent = null;

			} else if (cond.equals('㷻')) {
				curEvent = '㷻';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.AccessPermission getCurrentAccessPermission()> */
				org.apache.pdfbox.pdmodel.encryption.AccessPermission v_321_ = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(getOutVar('䩁', "ret"));
				satisfies = (Not(v_321_ == null));
				curEvent = null;

			} else if (cond.equals('䗼')) {
				curEvent = '䗼';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline getDocumentOutline()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline v_241_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline) getVarValue(getOutVar('㒩', "ret"));
				satisfies = (Not(v_241_ == null));
				curEvent = null;

			} else if (cond.equals('㨅')) {
				curEvent = '㨅';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: boolean getNeedAppearances()> */
				boolean v_79_ = (boolean) getVarValue(getOutVar('㬬', "ret"));
				satisfies = (v_79_ == false);
				curEvent = null;

			} else if (cond.equals('㸆')) {
				curEvent = '㸆';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: boolean isNodeOpen()> */
				boolean v_176_ = (boolean) getVarValue(getOutVar('䏽', "ret"));
				satisfies = (v_176_ == false);
				curEvent = null;

			} else if (cond.equals('䈆')) {
				curEvent = '䈆';
				/* <org.apache.pdfbox.pdmodel.common.COSArrayList: boolean <org.apache.pdfbox.pdmodel.common.COSArrayList: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_5_ = (boolean) getVarValue(getOutVar('㯀', "ret"));
				satisfies = (v_5_ == false);
				curEvent = null;

			} else if (cond.equals('㘉')) {
				curEvent = '㘉';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm(org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup)> */
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm v_227_ = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(getOutVar('䳩', "ret"));
				satisfies = (v_227_ == null);
				curEvent = null;

			} else if (cond.equals('㨊')) {
				curEvent = '㨊';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getProducer()> */
				java.lang.String v_183_ = (java.lang.String) getVarValue(getOutVar('㣬', "ret"));
				satisfies = (Not(v_183_ == null));
				curEvent = null;

			} else if (cond.equals('䨍')) {
				curEvent = '䨍';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: boolean isVisualSignEnabled()> */
				boolean v_286_ = (boolean) getVarValue(getOutVar('㘥', "ret"));
				satisfies = (Not(v_286_ == false));
				curEvent = null;

			} else if (cond.equals('㨑')) {
				curEvent = '㨑';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary getAppearance()> */
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary v_298_ = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary) getVarValue(getOutVar('㕹', "ret"));
				satisfies = (v_298_ == null);
				curEvent = null;

			} else if (cond.equals('䈑')) {
				curEvent = '䈑';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm()> */
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm v_78_ = (org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm) getVarValue(getOutVar('䟸', "ret"));
				satisfies = (Not(v_78_ == null));
				curEvent = null;

			} else if (cond.equals('䘒')) {
				curEvent = '䘒';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-1344464643_i16_LOOPVAR__1'()> */
				int v_133_ = (int) getVarValue(getOutVar('㢜', "ret"));
				satisfies = (v_133_ <= v_62_);
				curEvent = null;

			} else if (cond.equals('䨙')) {
				curEvent = '䨙';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream)> */
				org.apache.pdfbox.pdmodel.PDDocument v_327_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('㼛', "ret"));
				satisfies = (Not(v_327_ == null));
				curEvent = null;

			} else if (cond.equals('㸚')) {
				curEvent = '㸚';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: boolean <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getAllPages()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_10_ = (boolean) getVarValue(getOutVar('䐪', "ret"));
				satisfies = (Not(v_10_ == false));
				curEvent = null;

			} else if (cond.equals('䘡')) {
				curEvent = '䘡';
				/* <org.apache.pdfbox.pdmodel.PDResources: boolean <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getFontNames()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_210_ = (boolean) getVarValue(getOutVar('㭯', "ret"));
				satisfies = (Not(v_210_ == false));
				curEvent = null;

			} else if (cond.equals('㘮')) {
				curEvent = '㘮';
				/* <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileUnix()> */
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile v_315_ = (org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) getVarValue(getOutVar('㘛', "ret"));
				satisfies = (v_315_ == null);
				curEvent = null;

			} else if (cond.equals('㸷')) {
				curEvent = '㸷';
				/* <org.apache.pdfbox.pdmodel.PDDocument: boolean <org.apache.pdfbox.pdmodel.PDDocument: java.util.List getSignatureDictionaries()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_182_ = (UNKNOWN) getVarValue(getOutVar('㦙', "ret"));
				satisfies = false;//(v_182_ == null);
				curEvent = null;

			} else if (cond.equals('㨸')) {
				curEvent = '㨸';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.File,java.lang.String)> */
				org.apache.pdfbox.pdmodel.PDDocument v_137_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䊵', "ret"));
				satisfies = (v_137_ == null);
				curEvent = null;

			} else if (cond.equals('㘻')) {
				curEvent = '㘻';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: boolean <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.util.List getAllPages()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_10_ = (boolean) getVarValue(getOutVar('䐪', "ret"));
				satisfies = (v_10_ == false);
				curEvent = null;

			} else if (cond.equals('㸽')) {
				curEvent = '㸽';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceDictionary getAppearance()> */
				org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary v_298_ = (org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary) getVarValue(getOutVar('㕹', "ret"));
				satisfies = (Not(v_298_ == null));
				curEvent = null;

			} else if (cond.equals('䉅')) {
				curEvent = '䉅';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream)> */
				org.apache.pdfbox.pdmodel.PDDocument v_327_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('㼛', "ret"));
				satisfies = (v_327_ == null);
				curEvent = null;

			} else if (cond.equals('㙈')) {
				curEvent = '㙈';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination getDestination()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination v_145_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination) getVarValue(getOutVar('䅑', "ret"));
				satisfies = (Not(v_145_ == null));
				curEvent = null;

			} else if (cond.equals('䙈')) {
				curEvent = '䙈';
				/* <org.apache.pdfbox.pdmodel.PDResources: java.util.Map getImages()> */
				java.util.Map v_113_ = (java.util.Map) getVarValue(getOutVar('㴢', "ret"));
				satisfies = (Not(v_113_ == null));
				curEvent = null;

			} else if (cond.equals('㩊')) {
				curEvent = '㩊';
				/* <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.List getKids()> */
				java.util.List v_310_ = (java.util.List) getVarValue(getOutVar('䞪', "ret"));
				satisfies = (v_310_ == null);
				curEvent = null;

			} else if (cond.equals('䙏')) {
				curEvent = '䙏';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAppearanceCharacteristicsDictionary: java.lang.String getNormalCaption()> */
				java.lang.String v_97_ = (java.lang.String) getVarValue(getOutVar('㽶', "ret"));
				satisfies = (Not(v_97_ == null));
				curEvent = null;

			} else if (cond.equals('䉖')) {
				curEvent = '䉖';
				/* <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: boolean <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.List getKids()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_255_ = (UNKNOWN) getVarValue(getOutVar('䧭', "ret"));
				satisfies = false;//(v_255_ == null);
				curEvent = null;

			} else if (cond.equals('㙗')) {
				curEvent = '㙗';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getCreationDate()> */
				java.util.Calendar v_252_ = (java.util.Calendar) getVarValue(getOutVar('㞐', "ret"));
				satisfies = (Not(v_252_ == null));
				curEvent = null;

			} else if (cond.equals('䉞')) {
				curEvent = '䉞';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-700320057_i7_LOOPVAR__0'()> */
				int v_144_ = (int) getVarValue(getOutVar('䰁', "ret"));
				satisfies = (Not(v_62_ <= v_144_));
				curEvent = null;

			} else if (cond.equals('䉢')) {
				curEvent = '䉢';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: java.lang.String getAnnotationName()> */
				java.lang.String v_158_ = (java.lang.String) getVarValue(getOutVar('㲎', "ret"));
				satisfies = (Not(v_158_ == null));
				curEvent = null;

			} else if (cond.equals('䉫')) {
				curEvent = '䉫';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int getCount()> */
				int v_297_ = (int) getVarValue(getOutVar('䗴', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDPageTree: int 1954431931_i1_LOOPVAR__1()> */
				int v_22_ = (int) getVarValue(getOutVar('㧲', "ret"));
				satisfies = (Not(v_22_ <= v_297_));
				curEvent = null;

			} else if (cond.equals('䙮')) {
				curEvent = '䙮';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.File)> */
				org.apache.pdfbox.pdmodel.PDDocument v_171_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䏸', "ret"));
				satisfies = (Not(v_171_ == null));
				curEvent = null;

			} else if (cond.equals('㩻')) {
				curEvent = '㩻';
				/* <org.apache.pdfbox.pdmodel.PDPage: int getRotation()> */
				int v_74_ = (int) getVarValue(getOutVar('㻹', "ret"));
				satisfies = (v_74_ == 0);
				curEvent = null;

			} else if (cond.equals('㺁')) {
				curEvent = '㺁';
				/* <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()> */
				java.util.List v_333_ = (java.util.List) getVarValue(getOutVar('䰥', "ret"));
				satisfies = (Not(v_333_ == null));
				curEvent = null;

			} else if (cond.equals('䊇')) {
				curEvent = '䊇';
				/* <org.apache.pdfbox.pdmodel.PDDocument: boolean <org.apache.pdfbox.pdmodel.PDDocument: java.util.List getSignatureDictionaries()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_182_ = (UNKNOWN) getVarValue(getOutVar('㦙', "ret"));
				satisfies = false;//(Not(v_182_ == null));
				curEvent = null;

			} else if (cond.equals('䚏')) {
				curEvent = '䚏';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream,java.lang.String)> */
				org.apache.pdfbox.pdmodel.PDDocument v_19_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䃺', "ret"));
				satisfies = (Not(v_19_ == null));
				curEvent = null;

			} else if (cond.equals('㪐')) {
				curEvent = '㪐';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotation: java.lang.String getAnnotationName()> */
				java.lang.String v_158_ = (java.lang.String) getVarValue(getOutVar('㲎', "ret"));
				satisfies = (v_158_ == null);
				curEvent = null;

			} else if (cond.equals('㚕')) {
				curEvent = '㚕';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.util.Calendar getSignDate()> */
				java.util.Calendar v_47_ = (java.util.Calendar) getVarValue(getOutVar('䭱', "ret"));
				satisfies = (Not(v_47_ == null));
				curEvent = null;

			} else if (cond.equals('㚜')) {
				curEvent = '㚜';
				/* <org.apache.pdfbox.pdmodel.interactive.'annotation'.PDAnnotationLink: org.apache.pdfbox.pdmodel.interactive.action.PDAction getAction()> */
				org.apache.pdfbox.pdmodel.interactive.action.PDAction v_206_ = (org.apache.pdfbox.pdmodel.interactive.action.PDAction) getVarValue(getOutVar('䪜', "ret"));
				satisfies = (Not(v_206_ == null));
				curEvent = null;

			} else if (cond.equals('㺣')) {
				curEvent = '㺣';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: org.apache.pdfbox.pdmodel.PDPage findDestinationPage(org.apache.pdfbox.pdmodel.PDDocument)> */
				org.apache.pdfbox.pdmodel.PDPage v_44_ = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(getOutVar('䀘', "ret"));
				satisfies = (Not(v_44_ == null));
				curEvent = null;

			} else if (cond.equals('䪤')) {
				curEvent = '䪤';
				/* <org.apache.pdfbox.pdmodel.PDDocument: boolean isEncrypted()> */
				boolean v_164_ = (boolean) getVarValue(getOutVar('䃹', "ret"));
				satisfies = (v_164_ == false);
				curEvent = null;

			} else if (cond.equals('㚩')) {
				curEvent = '㚩';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i16_LOOPVAR__0'()> */
				int v_94_ = (int) getVarValue(getOutVar('䘮', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_62_ <= v_94_);
				curEvent = null;

			} else if (cond.equals('㚴')) {
				curEvent = '㚴';
				/* <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: boolean <org.apache.pdfbox.pdmodel.common.PDNameTreeNode: java.util.List getKids()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_255_ = (UNKNOWN) getVarValue(getOutVar('䧭', "ret"));
				satisfies = false;//(Not(v_255_ == null));
				curEvent = null;

			} else if (cond.equals('㚶')) {
				curEvent = '㚶';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.common.PDRectangle getArtBox()> */
				org.apache.pdfbox.pdmodel.common.PDRectangle v_168_ = (org.apache.pdfbox.pdmodel.common.PDRectangle) getVarValue(getOutVar('㣊', "ret"));
				satisfies = (Not(v_168_ == null));
				curEvent = null;

			} else if (cond.equals('㪻')) {
				curEvent = '㪻';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-840854952_i17_LOOPVAR__0'()> */
				int v_205_ = (int) getVarValue(getOutVar('㙿', "ret"));
				satisfies = (Not(v_62_ <= v_205_));
				curEvent = null;

			} else if (cond.equals('䛏')) {
				curEvent = '䛏';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: boolean isVisualSignEnabled()> */
				boolean v_286_ = (boolean) getVarValue(getOutVar('㘥', "ret"));
				satisfies = (v_286_ == false);
				curEvent = null;

			} else if (cond.equals('㛑')) {
				curEvent = '㛑';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPage getPage(int)> */
				org.apache.pdfbox.pdmodel.PDPage v_240_ = (org.apache.pdfbox.pdmodel.PDPage) getVarValue(getOutVar('䟖', "ret"));
				satisfies = (Not(v_240_ == null));
				curEvent = null;

			} else if (cond.equals('䛖')) {
				curEvent = '䛖';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentInformation getDocumentInformation()> */
				org.apache.pdfbox.pdmodel.PDDocumentInformation v_217_ = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(getOutVar('㠏', "ret"));
				satisfies = (Not(v_217_ == null));
				curEvent = null;

			} else if (cond.equals('㫛')) {
				curEvent = '㫛';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1729577450_i5_LOOPVAR__1()> */
				int v_186_ = (int) getVarValue(getOutVar('䨴', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_186_ <= v_62_);
				curEvent = null;

			} else if (cond.equals('㫟')) {
				curEvent = '㫟';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTitle()> */
				java.lang.String v_320_ = (java.lang.String) getVarValue(getOutVar('䳴', "ret"));
				satisfies = (v_320_ == null);
				curEvent = null;

			} else if (cond.equals('㛬')) {
				curEvent = '㛬';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 2094912986_i2_LOOPVAR__0()> */
				int v_33_ = (int) getVarValue(getOutVar('㴊', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_62_ <= v_33_));
				curEvent = null;

			} else if (cond.equals('䋱')) {
				curEvent = '䋱';
				/* <org.apache.pdfbox.pdmodel.PDResources: boolean <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getXObjectNames()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_259_ = (boolean) getVarValue(getOutVar('䆞', "ret"));
				satisfies = (Not(v_259_ == false));
				curEvent = null;

			} else if (cond.equals('䫻')) {
				curEvent = '䫻';
				/* <org.apache.pdfbox.pdmodel.PDPage: boolean <org.apache.pdfbox.pdmodel.PDPage: java.util.List getAnnotations()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_207_ = (boolean) getVarValue(getOutVar('㶦', "ret"));
				satisfies = (Not(v_207_ == false));
				curEvent = null;

			} else if (cond.equals('㫽')) {
				curEvent = '㫽';
				/* <org.apache.pdfbox.pdmodel.PDPage: org.apache.pdfbox.pdmodel.PDResources getResources()> */
				org.apache.pdfbox.pdmodel.PDResources v_195_ = (org.apache.pdfbox.pdmodel.PDResources) getVarValue(getOutVar('㠸', "ret"));
				satisfies = (v_195_ == null);
				curEvent = null;

			} else if (cond.equals('㬇')) {
				curEvent = '㬇';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int 1705811803_i2_LOOPVAR__0()> */
				int v_101_ = (int) getVarValue(getOutVar('㴈', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (v_62_ <= v_101_);
				curEvent = null;

			} else if (cond.equals('㬐')) {
				curEvent = '㬐';
				/* <org.apache.pdfbox.pdmodel.PDPageContentStream: boolean isOutside255Interval(int)> */
				boolean v_275_ = (boolean) getVarValue(getOutVar('㝵', "ret"));
				satisfies = (Not(v_275_ == false));
				curEvent = null;

			} else if (cond.equals('䌘')) {
				curEvent = '䌘';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField: org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature getSignature()> */
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature v_65_ = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(getOutVar('䔟', "ret"));
				satisfies = (Not(v_65_ == null));
				curEvent = null;

			} else if (cond.equals('㜚')) {
				curEvent = '㜚';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTitle()> */
				java.lang.String v_320_ = (java.lang.String) getVarValue(getOutVar('䳴', "ret"));
				satisfies = (Not(v_320_ == null));
				curEvent = null;

			} else if (cond.equals('㜲')) {
				curEvent = '㜲';
				/* <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileUnicode()> */
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile v_290_ = (org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) getVarValue(getOutVar('㹵', "ret"));
				satisfies = (v_290_ == null);
				curEvent = null;

			} else if (cond.equals('䍀')) {
				curEvent = '䍀';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentCatalog getDocumentCatalog()> */
				org.apache.pdfbox.pdmodel.PDDocumentCatalog v_111_ = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(getOutVar('䕩', "ret"));
				satisfies = (v_111_ == null);
				curEvent = null;

			} else if (cond.equals('㽆')) {
				curEvent = '㽆';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem getFirstChild()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem v_30_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(getOutVar('䄸', "ret"));
				satisfies = (Not(v_30_ == null));
				curEvent = null;

			} else if (cond.equals('䝌')) {
				curEvent = '䝌';
				/* <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.File)> */
				org.apache.pdfbox.pdmodel.PDDocument v_171_ = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(getOutVar('䏸', "ret"));
				satisfies = (v_171_ == null);
				curEvent = null;

			} else if (cond.equals('䭓')) {
				curEvent = '䭓';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.lang.String getSubFilter()> */
				java.lang.String v_199_ = (java.lang.String) getVarValue(getOutVar('㛠', "ret"));
				satisfies = (v_199_ == null);
				curEvent = null;

			} else if (cond.equals('䭔')) {
				curEvent = '䭔';
				/* <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode getParent()> */
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode v_204_ = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode) getVarValue(getOutVar('㙫', "ret"));
				satisfies = (Not(v_204_ == null));
				curEvent = null;

			} else if (cond.equals('䍖')) {
				curEvent = '䍖';
				/* <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileDos()> */
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile v_108_ = (org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) getVarValue(getOutVar('䦿', "ret"));
				satisfies = (v_108_ == null);
				curEvent = null;

			} else if (cond.equals('䝡')) {
				curEvent = '䝡';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-2028548684_i4_LOOPVAR__0'()> */
				int v_228_ = (int) getVarValue(getOutVar('䎱', "ret"));
				satisfies = (Not(v_62_ <= v_228_));
				curEvent = null;

			} else if (cond.equals('㽧')) {
				curEvent = '㽧';
				/* <org.apache.pdfbox.pdmodel.PDPageTree: boolean <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_177_ = (boolean) getVarValue(getOutVar('䄦', "ret"));
				satisfies = (Not(v_177_ == false));
				curEvent = null;

			} else if (cond.equals('䭮')) {
				curEvent = '䭮';
				/* <org.apache.pdfbox.pdmodel.common.COSArrayList: boolean <org.apache.pdfbox.pdmodel.common.COSArrayList: java.util.Iterator iterator()>_ITERATOR_hasNext(java.util.Iterator)> */
				boolean v_5_ = (boolean) getVarValue(getOutVar('㯀', "ret"));
				satisfies = (Not(v_5_ == false));
				curEvent = null;

			} else if (cond.equals('䞌')) {
				curEvent = '䞌';
				/* <org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification: org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile getEmbeddedFileUnix()> */
				org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile v_315_ = (org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) getVarValue(getOutVar('㘛', "ret"));
				satisfies = (Not(v_315_ == null));
				curEvent = null;

			} else if (cond.equals('䎔')) {
				curEvent = '䎔';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo getMarkInfo()> */
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo v_51_ = (org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo) getVarValue(getOutVar('䟋', "ret"));
				satisfies = (Not(v_51_ == null));
				curEvent = null;

			} else if (cond.equals('䎥')) {
				curEvent = '䎥';
				/* <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getModificationDate()> */
				java.util.Calendar v_41_ = (java.util.Calendar) getVarValue(getOutVar('㟅', "ret"));
				satisfies = (v_41_ == null);
				curEvent = null;

			} else if (cond.equals('㮪')) {
				curEvent = '㮪';
				/* <org.apache.pdfbox.pdmodel.PDResources: boolean <org.apache.pdfbox.pdmodel.PDResources: java.lang.Iterable getFontNames()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_210_ = (boolean) getVarValue(getOutVar('㭯', "ret"));
				satisfies = (v_210_ == false);
				curEvent = null;

			} else if (cond.equals('䎬')) {
				curEvent = '䎬';
				/* <org.apache.pdfbox.pdmodel.PDDocument: int '-2122759264_i6_LOOPVAR__1'()> */
				int v_66_ = (int) getVarValue(getOutVar('䲸', "ret"));
				/* <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> */
				int v_62_ = (int) getVarValue(getOutVar('㶜', "ret"));
				satisfies = (Not(v_66_ <= v_62_));
				curEvent = null;

			} else if (cond.equals('㞸')) {
				curEvent = '㞸';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField: org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature getSignature()> */
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature v_65_ = (org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) getVarValue(getOutVar('䔟', "ret"));
				satisfies = (v_65_ == null);
				curEvent = null;

			} else if (cond.equals('㾹')) {
				curEvent = '㾹';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: boolean <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: java.util.List getFields()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_119_ = (UNKNOWN) getVarValue(getOutVar('㠴', "ret"));
				satisfies = false;//(v_119_ == null);
				curEvent = null;

			} else if (cond.equals('䮿')) {
				curEvent = '䮿';
				/* <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: boolean <org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm: java.util.List getFields()>_ITERABLE_hasNext(java.util.Iterator)> */
				//UNKNOWN v_119_ = (UNKNOWN) getVarValue(getOutVar('㠴', "ret"));
				satisfies = false;//(Not(v_119_ == null));
				curEvent = null;

			} else if (cond.equals('䏗')) {
				curEvent = '䏗';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.lang.String getName()> */
				java.lang.String v_311_ = (java.lang.String) getVarValue(getOutVar('㧵', "ret"));
				satisfies = (Not(v_311_ == null));
				curEvent = null;

			} else if (cond.equals('㿚')) {
				curEvent = '㿚';
				/* <org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature: java.lang.String getName()> */
				java.lang.String v_311_ = (java.lang.String) getVarValue(getOutVar('㧵', "ret"));
				satisfies = (v_311_ == null);
				curEvent = null;

			} else if (cond.equals('㿫')) {
				curEvent = '㿫';
				/* <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot getStructureTreeRoot()> */
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot v_281_ = (org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot) getVarValue(getOutVar('䥫', "ret"));
				satisfies = (v_281_ == null);
				curEvent = null;

			} else if (cond.equals('㟰')) {
				curEvent = '㟰';
				/* <org.apache.pdfbox.pdmodel.PDPageContentStream: boolean isOutside255Interval(int)> */
				boolean v_275_ = (boolean) getVarValue(getOutVar('㝵', "ret"));
				satisfies = (v_275_ == false);
				curEvent = null;

			} else if (cond.equals('㯻')) {
				curEvent = '㯻';
				/* <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractContent()> */
				boolean v_197_ = (boolean) getVarValue(getOutVar('㭛', "ret"));
				satisfies = (Not(v_197_ == false));
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

		} catch (Throwable t) {
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
