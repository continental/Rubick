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

			if (nextCall.equals('㫀')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDMetadata getMetadata()> ");
				curEvent = '㫀';
				org.apache.pdfbox.pdmodel.common.PDMetadata ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMetadata();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: void <init>()> ");
				curEvent = '㺁';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦁')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getAuthor()> ");
				curEvent = '䦁';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getAuthor();
				curEvent = null;

			} else if (nextCall.equals('㩂')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTitle()> ");
				curEvent = '㩂';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTitle();
				curEvent = null;

			} else if (nextCall.equals('䂂')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: int getNumberOfPages()> ");
				curEvent = '䂂';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNumberOfPages();
				curEvent = null;

			} else if (nextCall.equals('䠃')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractContent()> ");
				curEvent = '䠃';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canExtractContent();
				curEvent = null;

			} else if (nextCall.equals('䰃')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: java.util.Iterator iterator()> ");
				curEvent = '䰃';
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.iterator();
				curEvent = null;

			} else if (nextCall.equals('䡇')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean isReadOnly()> ");
				curEvent = '䡇';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isReadOnly();
				curEvent = null;

			} else if (nextCall.equals('䓇')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getCreator()> ");
				curEvent = '䓇';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCreator();
				curEvent = null;

			} else if (nextCall.equals('䒈')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getTrapped()> ");
				curEvent = '䒈';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getTrapped();
				curEvent = null;

			} else if (nextCall.equals('䯉')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: java.lang.String getLanguage()> ");
				curEvent = '䯉';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLanguage();
				curEvent = null;

			} else if (nextCall.equals('䒊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination: void <init>()> ");
				curEvent = '䒊';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㴊')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canModify()> ");
				curEvent = '㴊';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canModify();
				curEvent = null;

			} else if (nextCall.equals('㭋')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getSubject()> ");
				curEvent = '㭋';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSubject();
				curEvent = null;

			} else if (nextCall.equals('䠎')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getKeywords()> ");
				curEvent = '䠎';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getKeywords();
				curEvent = null;

			} else if (nextCall.equals('䩏')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getModificationDate()> ");
				curEvent = '䩏';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getModificationDate();
				curEvent = null;

			} else if (nextCall.equals('㜏')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.PageMode getPageMode()> ");
				curEvent = '㜏';
				org.apache.pdfbox.pdmodel.PageMode ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageMode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㺑')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void <init>()> ");
				curEvent = '㺑';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				ret = new org.apache.pdfbox.pdmodel.PDDocument();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䊑')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: void close()> ");
				curEvent = '䊑';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䶑')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocument load(java.io.InputStream)> ");
				curEvent = '䶑';
				org.apache.pdfbox.pdmodel.PDDocument ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = org.apache.pdfbox.pdmodel.PDDocument.load(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒒')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPageTree: int getCount()> ");
				curEvent = '㒒';
				org.apache.pdfbox.pdmodel.PDPageTree cls = (org.apache.pdfbox.pdmodel.PDPageTree) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCount();
				curEvent = null;

			} else if (nextCall.equals('䶒')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.util.Calendar getCreationDate()> ");
				curEvent = '䶒';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCreationDate();
				curEvent = null;

			} else if (nextCall.equals('㲔')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties: void <init>()> ");
				curEvent = '㲔';
				org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳕')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm getAcroForm()> ");
				curEvent = '䳕';
				org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAcroForm();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒖')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.SecurityProvider: java.security.Provider getProvider()> ");
				curEvent = '䒖';
				org.apache.pdfbox.pdmodel.encryption.SecurityProvider.getProvider();
				curEvent = null;

			} else if (nextCall.equals('䯝')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDPageTree getPages()> ");
				curEvent = '䯝';
				org.apache.pdfbox.pdmodel.PDPageTree ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPages();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: void <init>()> ");
				curEvent = '㔟';
				org.apache.pdfbox.pdmodel.PDDocumentInformation ret;
				ret = new org.apache.pdfbox.pdmodel.PDDocumentInformation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅟')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentCatalog getDocumentCatalog()> ");
				curEvent = '䅟';
				org.apache.pdfbox.pdmodel.PDDocumentCatalog ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentCatalog();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚠')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canFillInForm()> ");
				curEvent = '䚠';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canFillInForm();
				curEvent = null;

			} else if (nextCall.equals('㷡')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript: void <init>()> ");
				curEvent = '㷡';
				org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDPage: void <init>()> ");
				curEvent = '㠣';
				org.apache.pdfbox.pdmodel.PDPage ret;
				ret = new org.apache.pdfbox.pdmodel.PDPage();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo getMarkInfo()> ");
				curEvent = '䚣';
				org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMarkInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥣')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.PDDocumentInformation getDocumentInformation()> ");
				curEvent = '㥣';
				org.apache.pdfbox.pdmodel.PDDocumentInformation ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentInformation();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥤')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.PageLayout getPageLayout()> ");
				curEvent = '䥤';
				org.apache.pdfbox.pdmodel.PageLayout ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageLayout();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝥')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: void <init>()> ");
				curEvent = '䝥';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem ret;
				ret = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷨')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentInformation: java.lang.String getProducer()> ");
				curEvent = '㷨';
				org.apache.pdfbox.pdmodel.PDDocumentInformation cls = (org.apache.pdfbox.pdmodel.PDDocumentInformation) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getProducer();
				curEvent = null;

			} else if (nextCall.equals('㿫')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean isOwnerPermission()> ");
				curEvent = '㿫';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOwnerPermission();
				curEvent = null;

			} else if (nextCall.equals('㱬')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem: void openNode()> ");
				curEvent = '㱬';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.openNode();
				curEvent = null;

			} else if (nextCall.equals('㴭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline getDocumentOutline()> ");
				curEvent = '㴭';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getDocumentOutline();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㞭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: boolean isEncrypted()> ");
				curEvent = '㞭';
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('䎭')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canExtractForAccessibility()> ");
				curEvent = '䎭';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canExtractForAccessibility();
				curEvent = null;

			} else if (nextCall.equals('㟴')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.AccessPermission getCurrentAccessPermission()> ");
				curEvent = '㟴';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCurrentAccessPermission();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜶')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canPrintDegraded()> ");
				curEvent = '㜶';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canPrintDegraded();
				curEvent = null;

			} else if (nextCall.equals('㥹')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocumentCatalog: org.apache.pdfbox.pdmodel.common.PDPageLabels getPageLabels()> ");
				curEvent = '㥹';
				org.apache.pdfbox.pdmodel.common.PDPageLabels ret;
				org.apache.pdfbox.pdmodel.PDDocumentCatalog cls = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getPageLabels();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔺')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline: void openNode()> ");
				curEvent = '㔺';
				org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline cls = (org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.openNode();
				curEvent = null;

			} else if (nextCall.equals('䧼')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.encryption.AccessPermission: boolean canAssembleDocument()> ");
				curEvent = '䧼';
				org.apache.pdfbox.pdmodel.encryption.AccessPermission cls = (org.apache.pdfbox.pdmodel.encryption.AccessPermission) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.canAssembleDocument();
				curEvent = null;

			} else if (nextCall.equals('䀾')) {
				if (debug) System.out.println("Calling <org.apache.pdfbox.pdmodel.PDDocument: org.apache.pdfbox.pdmodel.encryption.PDEncryption getEncryption()> ");
				curEvent = '䀾';
				org.apache.pdfbox.pdmodel.encryption.PDEncryption ret;
				org.apache.pdfbox.pdmodel.PDDocument cls = (org.apache.pdfbox.pdmodel.PDDocument) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEncryption();
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
