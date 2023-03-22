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
		vars.put("constant-0", 0);


	}

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	@Override
	protected void runNextCall(Character nextCall) throws HarnessException {
		try {

			if (nextCall.equals('䩁')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: void close()> ");
				curEvent = '䩁';
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('㤃')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int getRecordSize()> ");
				curEvent = '㤃';
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getRecordSize();
				curEvent = null;

			} else if (nextCall.equals('䚅')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.Date getModTime()> ");
				curEvent = '䚅';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getModTime();
				curEvent = null;

			} else if (nextCall.equals('㾈')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.Map getExtraPaxHeaders()> ");
				curEvent = '㾈';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getExtraPaxHeaders();
				curEvent = null;

			} else if (nextCall.equals('㛙')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.lang.String getName()> ");
				curEvent = '㛙';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getName();
				curEvent = null;

			} else if (nextCall.equals('䤛')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isDirectory()> ");
				curEvent = '䤛';
				boolean ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isDirectory();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲛')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getSparseHeaders()> ");
				curEvent = '䲛';
				java.util.List ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSparseHeaders();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䱛')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: org.apache.commons.compress.archivers.tar.TarArchiveEntry[] getDirectoryEntries()> ");
				curEvent = '䱛';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDirectoryEntries();
				curEvent = null;

			} else if (nextCall.equals('㰜')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry()> ");
				curEvent = '㰜';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry ret;
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNextTarEntry();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩞')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.Date getLastModifiedDate()> ");
				curEvent = '䩞';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLastModifiedDate();
				curEvent = null;

			} else if (nextCall.equals('㓢')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getDataOffset()> ");
				curEvent = '㓢';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataOffset();
				curEvent = null;

			} else if (nextCall.equals('㶧')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> ");
				curEvent = '㶧';
				int ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㒨')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isStreamContiguous()> ");
				curEvent = '㒨';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isStreamContiguous();
				curEvent = null;

			} else if (nextCall.equals('㱨')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isLink()> ");
				curEvent = '㱨';
				boolean ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isLink();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䣰')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getOrderedSparseHeaders()> ");
				curEvent = '䣰';
				java.util.List ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOrderedSparseHeaders();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐵')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isPaxGNU1XSparse()> ");
				curEvent = '㐵';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPaxGNU1XSparse();
				curEvent = null;

			} else if (nextCall.equals('㠵')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.lang.String getLinkName()> ");
				curEvent = '㠵';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLinkName();
				curEvent = null;

			} else if (nextCall.equals('䜵')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)> ");
				curEvent = '䜵';
				boolean ret;
				org.apache.commons.compress.archivers.ArchiveEntry arg0 = (org.apache.commons.compress.archivers.ArchiveEntry) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.canReadEntryData(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝵')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isSymbolicLink()> ");
				curEvent = '㝵';
				boolean ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isSymbolicLink();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㟵')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getSize()> ");
				curEvent = '㟵';
				long ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSize();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷽')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: void <init>(java.io.InputStream)> ");
				curEvent = '㷽';
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁽')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.ArchiveEntry getNextEntry()> ");
				curEvent = '䁽';
				org.apache.commons.compress.archivers.ArchiveEntry ret;
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNextEntry();
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

			if (cond.equals('E')) {
				curEvent = 'E';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> */
				int v_12_ = (int) getVarValue(getOutVar('㶧', "ret"));
				satisfies = (v_12_ == 0);
				curEvent = null;

			} else if (cond.equals('㱈')) {
				curEvent = '㱈';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isDirectory()> */
				boolean v_13_ = (boolean) getVarValue(getOutVar('䤛', "ret"));
				satisfies = (v_13_ == false);
				curEvent = null;

			} else if (cond.equals('O')) {
				curEvent = 'O';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getSize()> */
				long v_31_ = (long) getVarValue(getOutVar('㟵', "ret"));
				satisfies = (v_31_ <= 16384);
				curEvent = null;

			} else if (cond.equals('䖖')) {
				curEvent = '䖖';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.ArchiveEntry getNextEntry()> */
				org.apache.commons.compress.archivers.ArchiveEntry v_7_ = (org.apache.commons.compress.archivers.ArchiveEntry) getVarValue(getOutVar('䁽', "ret"));
				satisfies = (v_7_ == null);
				curEvent = null;

			} else if (cond.equals('䭖')) {
				curEvent = '䭖';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> */
				int v_12_ = (int) getVarValue(getOutVar('㶧', "ret"));
				satisfies = (Not(v_12_ == 0));
				curEvent = null;

			} else if (cond.equals('㔘')) {
				curEvent = '㔘';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getSize()> */
				long v_31_ = (long) getVarValue(getOutVar('㟵', "ret"));
				satisfies = (Not(v_31_ <= 16384));
				curEvent = null;

			} else if (cond.equals('㸘')) {
				curEvent = '㸘';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)> */
				boolean v_6_ = (boolean) getVarValue(getOutVar('䜵', "ret"));
				satisfies = (v_6_ == false);
				curEvent = null;

			} else if (cond.equals('䊙')) {
				curEvent = '䊙';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry()> */
				org.apache.commons.compress.archivers.tar.TarArchiveEntry v_28_ = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(getOutVar('㰜', "ret"));
				satisfies = (Not(v_28_ == null));
				curEvent = null;

			} else if (cond.equals('䑝')) {
				curEvent = '䑝';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isDirectory()> */
				boolean v_13_ = (boolean) getVarValue(getOutVar('䤛', "ret"));
				satisfies = (Not(v_13_ == false));
				curEvent = null;

			} else if (cond.equals('㬟')) {
				curEvent = '㬟';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isSymbolicLink()> */
				boolean v_8_ = (boolean) getVarValue(getOutVar('㝵', "ret"));
				satisfies = (Not(v_8_ == false));
				curEvent = null;

			} else if (cond.equals('䱩')) {
				curEvent = '䱩';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isSymbolicLink()> */
				boolean v_8_ = (boolean) getVarValue(getOutVar('㝵', "ret"));
				satisfies = (v_8_ == false);
				curEvent = null;

			} else if (cond.equals('䎰')) {
				curEvent = '䎰';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isLink()> */
				boolean v_19_ = (boolean) getVarValue(getOutVar('㱨', "ret"));
				satisfies = (Not(v_19_ == false));
				curEvent = null;

			} else if (cond.equals('㗱')) {
				curEvent = '㗱';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry()> */
				org.apache.commons.compress.archivers.tar.TarArchiveEntry v_28_ = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(getOutVar('㰜', "ret"));
				satisfies = (v_28_ == null);
				curEvent = null;

			} else if (cond.equals('䗵')) {
				curEvent = '䗵';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)> */
				boolean v_6_ = (boolean) getVarValue(getOutVar('䜵', "ret"));
				satisfies = (Not(v_6_ == false));
				curEvent = null;

			} else if (cond.equals('䮶')) {
				curEvent = '䮶';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.ArchiveEntry getNextEntry()> */
				org.apache.commons.compress.archivers.ArchiveEntry v_7_ = (org.apache.commons.compress.archivers.ArchiveEntry) getVarValue(getOutVar('䁽', "ret"));
				satisfies = (Not(v_7_ == null));
				curEvent = null;

			} else if (cond.equals('㓹')) {
				curEvent = '㓹';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isLink()> */
				boolean v_19_ = (boolean) getVarValue(getOutVar('㱨', "ret"));
				satisfies = (v_19_ == false);
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
				//t.printStackTrace();
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
