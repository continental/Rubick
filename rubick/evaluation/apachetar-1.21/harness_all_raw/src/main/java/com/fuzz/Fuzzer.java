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

			if (nextCall.equals('㘄')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[],int,int)> ");
				curEvent = '㘄';
				int ret;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				int arg2 = (int) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.read(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠐')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.lang.String getName()> ");
				curEvent = '㠐';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getName();
				curEvent = null;

			} else if (nextCall.equals('㜑')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isLink()> ");
				curEvent = '㜑';
				boolean ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isLink();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䎓')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int getRecordSize()> ");
				curEvent = '䎓';
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getRecordSize();
				curEvent = null;

			} else if (nextCall.equals('䞖')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getDataOffset()> ");
				curEvent = '䞖';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataOffset();
				curEvent = null;

			} else if (nextCall.equals('㞗')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)> ");
				curEvent = '㞗';
				boolean ret;
				org.apache.commons.compress.archivers.ArchiveEntry arg0 = (org.apache.commons.compress.archivers.ArchiveEntry) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.canReadEntryData(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㲞')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.Date getLastModifiedDate()> ");
				curEvent = '㲞';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLastModifiedDate();
				curEvent = null;

			} else if (nextCall.equals('䆞')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isStreamContiguous()> ");
				curEvent = '䆞';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isStreamContiguous();
				curEvent = null;

			} else if (nextCall.equals('㰡')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getOrderedSparseHeaders()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㰡';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖢')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.Map getExtraPaxHeaders()> ");
				curEvent = '䖢';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getExtraPaxHeaders();
				curEvent = null;

			} else if (nextCall.equals('䖦')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getOrderedSparseHeaders()> ");
				curEvent = '䖦';
				java.util.List ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getOrderedSparseHeaders();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䪦')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.lang.Object <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getOrderedSparseHeaders()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䪦';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㪧')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: void <init>(java.io.File,java.lang.String)> ");
				curEvent = '㪧';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry ret;
				java.io.File arg0 = (java.io.File) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.lang.String arg1 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬹')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.lang.Object <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getSparseHeaders()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㬹';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫂')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getSparseHeaders()> ");
				curEvent = '㫂';
				java.util.List ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSparseHeaders();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䇃')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[])> ");
				curEvent = '䇃';
				int ret;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.read(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥃')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: void <init>(java.io.InputStream)> ");
				curEvent = '䥃';
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽋')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.Date getModTime()> ");
				curEvent = '㽋';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getModTime();
				curEvent = null;

			} else if (nextCall.equals('㽐')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int 1521985949_$i6_LOOPVAR__((int)-1)()> ");
				curEvent = '㽐';
				int ret;
				ret = (((int)-1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䃑')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isPaxGNU1XSparse()> ");
				curEvent = '䃑';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPaxGNU1XSparse();
				curEvent = null;

			} else if (nextCall.equals('䣕')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.ArchiveEntry getNextEntry()> ");
				curEvent = '䣕';
				org.apache.commons.compress.archivers.ArchiveEntry ret;
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNextEntry();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㿛')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getSize()> ");
				curEvent = '㿛';
				long ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSize();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏛')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.lang.String getLinkName()> ");
				curEvent = '䏛';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLinkName();
				curEvent = null;

			} else if (nextCall.equals('㛜')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int 958272236_$i19_LOOPVAR_<org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[])>.RET_((int)(((long)((int)(((long)arg0) + 0L))) cmp 🞮))(int)> ");
				curEvent = '㛜';
				int ret;
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = (int)(((long)((int)(((long)arg0) + 0L))));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻜')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: org.apache.commons.compress.archivers.tar.TarArchiveEntry[] getDirectoryEntries()> ");
				curEvent = '㻜';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDirectoryEntries();
				curEvent = null;

			} else if (nextCall.equals('䭝')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> ");
				curEvent = '䭝';
				int ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥟')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: void <init>(java.lang.String)> ");
				curEvent = '䥟';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳠')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getSparseHeaders()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '㳠';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥠')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: void close()> ");
				curEvent = '䥠';
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䅢')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isDirectory()> ");
				curEvent = '䅢';
				boolean ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isDirectory();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙤')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isSymbolicLink()> ");
				curEvent = '㙤';
				boolean ret;
				org.apache.commons.compress.archivers.tar.TarArchiveEntry cls = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isSymbolicLink();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('n')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveStructSparse: long getNumbytes()> ");
				curEvent = 'n';
				org.apache.commons.compress.archivers.tar.TarArchiveStructSparse cls = (org.apache.commons.compress.archivers.tar.TarArchiveStructSparse) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getNumbytes();
				curEvent = null;

			} else if (nextCall.equals('䑶')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveEntry: void <init>(java.lang.String,byte)> ");
				curEvent = '䑶';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				byte arg1 = (byte) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷸')) {
				if (debug) System.out.println("Calling <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry()> ");
				curEvent = '㷸';
				org.apache.commons.compress.archivers.tar.TarArchiveEntry ret;
				org.apache.commons.compress.archivers.tar.TarArchiveInputStream cls = (org.apache.commons.compress.archivers.tar.TarArchiveInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNextTarEntry();
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

			if (cond.equals('㦁')) {
				curEvent = '㦁';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[])> */
				int v_26_ = (int) getVarValue(getOutVar('䇃', "ret"));
				satisfies = (v_26_ <= 0);
				curEvent = null;

			} else if (cond.equals('䈁')) {
				curEvent = '䈁';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isLink()> */
				boolean v_24_ = (boolean) getVarValue(getOutVar('㜑', "ret"));
				satisfies = (v_24_ == false);
				curEvent = null;

			} else if (cond.equals('㬊')) {
				curEvent = '㬊';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getSize()> */
				long v_11_ = (long) getVarValue(getOutVar('㿛', "ret"));
				satisfies = (Not(v_11_ <= 16384));
				curEvent = null;

			} else if (cond.equals('㾋')) {
				curEvent = '㾋';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getOrderedSparseHeaders()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_15_ = (boolean) getVarValue(getOutVar('㰡', "ret"));
				satisfies = (Not(v_15_ == false));
				curEvent = null;

			} else if (cond.equals('䨏')) {
				curEvent = '䨏';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isSymbolicLink()> */
				boolean v_27_ = (boolean) getVarValue(getOutVar('㙤', "ret"));
				satisfies = (v_27_ == false);
				curEvent = null;

			} else if (cond.equals('㲕')) {
				curEvent = '㲕';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> */
				int v_13_ = (int) getVarValue(getOutVar('䭝', "ret"));
				satisfies = (Not(And(Extract(0, 0, v_13_) == 0,
        Extract(3, 3, v_13_) == 0,
        Extract(6, 6, v_13_) == 0)));
				curEvent = null;

			} else if (cond.equals('䶕')) {
				curEvent = '䶕';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[],int,int)> */
				int v_23_ = (int) getVarValue(getOutVar('㘄', "ret"));
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int 1521985949_$i6_LOOPVAR__((int)-1)()> */
				int v_7_ = (int) getVarValue(getOutVar('㽐', "ret"));
				satisfies = (v_23_ == v_7_);
				curEvent = null;

			} else if (cond.equals('䄘')) {
				curEvent = '䄘';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[],int,int)> */
				int v_23_ = (int) getVarValue(getOutVar('㘄', "ret"));
				satisfies = (v_23_ <= 0);
				curEvent = null;

			} else if (cond.equals('䮛')) {
				curEvent = '䮛';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)> */
				boolean v_10_ = (boolean) getVarValue(getOutVar('㞗', "ret"));
				satisfies = (Not(v_10_ == false));
				curEvent = null;

			} else if (cond.equals('㢩')) {
				curEvent = '㢩';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isDirectory()> */
				boolean v_4_ = (boolean) getVarValue(getOutVar('䅢', "ret"));
				satisfies = (v_4_ == false);
				curEvent = null;

			} else if (cond.equals('䴫')) {
				curEvent = '䴫';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)> */
				boolean v_10_ = (boolean) getVarValue(getOutVar('㞗', "ret"));
				satisfies = (v_10_ == false);
				curEvent = null;

			} else if (cond.equals('䆬')) {
				curEvent = '䆬';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[],int,int)> */
				int v_23_ = (int) getVarValue(getOutVar('㘄', "ret"));
				satisfies = (Not(v_23_ <= 0));
				curEvent = null;

			} else if (cond.equals('䊭')) {
				curEvent = '䊭';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[],int,int)> */
				int v_23_ = (int) getVarValue(getOutVar('㘄', "ret"));
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int 1521985949_$i6_LOOPVAR__((int)-1)()> */
				int v_7_ = (int) getVarValue(getOutVar('㽐', "ret"));
				satisfies = (Not(v_23_ == v_7_));
				curEvent = null;

			} else if (cond.equals('䰮')) {
				curEvent = '䰮';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: long getSize()> */
				long v_11_ = (long) getVarValue(getOutVar('㿛', "ret"));
				satisfies = (v_11_ <= 16384);
				curEvent = null;

			} else if (cond.equals('㦯')) {
				curEvent = '㦯';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isDirectory()> */
				boolean v_4_ = (boolean) getVarValue(getOutVar('䅢', "ret"));
				satisfies = (Not(v_4_ == false));
				curEvent = null;

			} else if (cond.equals('㴲')) {
				curEvent = '㴲';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isSymbolicLink()> */
				boolean v_27_ = (boolean) getVarValue(getOutVar('㙤', "ret"));
				satisfies = (Not(v_27_ == false));
				curEvent = null;

			} else if (cond.equals('䶹')) {
				curEvent = '䶹';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> */
				int v_13_ = (int) getVarValue(getOutVar('䭝', "ret"));
				satisfies = (v_13_ == 0);
				curEvent = null;

			} else if (cond.equals('㮻')) {
				curEvent = '㮻';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: int read(byte[])> */
				int v_26_ = (int) getVarValue(getOutVar('䇃', "ret"));
				satisfies = (Not(v_26_ <= 0));
				curEvent = null;

			} else if (cond.equals('䮻')) {
				curEvent = '䮻';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> */
				int v_13_ = (int) getVarValue(getOutVar('䭝', "ret"));
				satisfies = (And(Extract(0, 0, v_13_) == 0,
    Extract(3, 3, v_13_) == 0,
    Extract(6, 6, v_13_) == 0));
				curEvent = null;

			} else if (cond.equals('䢽')) {
				curEvent = '䢽';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry()> */
				org.apache.commons.compress.archivers.tar.TarArchiveEntry v_9_ = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(getOutVar('㷸', "ret"));
				satisfies = (v_9_ == null);
				curEvent = null;

			} else if (cond.equals('䩁')) {
				curEvent = '䩁';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.ArchiveEntry getNextEntry()> */
				org.apache.commons.compress.archivers.ArchiveEntry v_17_ = (org.apache.commons.compress.archivers.ArchiveEntry) getVarValue(getOutVar('䣕', "ret"));
				satisfies = (Not(v_17_ == null));
				curEvent = null;

			} else if (cond.equals('䣃')) {
				curEvent = '䣃';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry()> */
				org.apache.commons.compress.archivers.tar.TarArchiveEntry v_9_ = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) getVarValue(getOutVar('㷸', "ret"));
				satisfies = (Not(v_9_ == null));
				curEvent = null;

			} else if (cond.equals('㳉')) {
				curEvent = '㳉';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getSparseHeaders()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_32_ = (boolean) getVarValue(getOutVar('㳠', "ret"));
				satisfies = (v_32_ == false);
				curEvent = null;

			} else if (cond.equals('㓏')) {
				curEvent = '㓏';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveInputStream: org.apache.commons.compress.archivers.ArchiveEntry getNextEntry()> */
				org.apache.commons.compress.archivers.ArchiveEntry v_17_ = (org.apache.commons.compress.archivers.ArchiveEntry) getVarValue(getOutVar('䣕', "ret"));
				satisfies = (v_17_ == null);
				curEvent = null;

			} else if (cond.equals('㧒')) {
				curEvent = '㧒';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getOrderedSparseHeaders()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_15_ = (boolean) getVarValue(getOutVar('㰡', "ret"));
				satisfies = (v_15_ == false);
				curEvent = null;

			} else if (cond.equals('䣵')) {
				curEvent = '䣵';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean isLink()> */
				boolean v_24_ = (boolean) getVarValue(getOutVar('㜑', "ret"));
				satisfies = (Not(v_24_ == false));
				curEvent = null;

			} else if (cond.equals('䃻')) {
				curEvent = '䃻';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: int getMode()> */
				int v_13_ = (int) getVarValue(getOutVar('䭝', "ret"));
				satisfies = (Not(v_13_ == 0));
				curEvent = null;

			} else if (cond.equals('㵿')) {
				curEvent = '㵿';
				/* <org.apache.commons.compress.archivers.tar.TarArchiveEntry: boolean <org.apache.commons.compress.archivers.tar.TarArchiveEntry: java.util.List getSparseHeaders()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_32_ = (boolean) getVarValue(getOutVar('㳠', "ret"));
				satisfies = (Not(v_32_ == false));
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
		//		t.printStackTrace();
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
