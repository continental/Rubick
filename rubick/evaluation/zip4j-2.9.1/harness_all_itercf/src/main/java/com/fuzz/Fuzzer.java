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

			if (nextCall.equals('㖀')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: net.lingala.zip4j.model.enums.AesKeyStrength getAesKeyStrength()> ");
				curEvent = '㖀';
				net.lingala.zip4j.model.enums.AesKeyStrength ret;
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAesKeyStrength();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㜁')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean isEncrypted()> ");
				curEvent = '㜁';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('䒂')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean isDirectory()> ");
				curEvent = '䒂';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isDirectory();
				curEvent = null;

			} else if (nextCall.equals('䤃')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: long getOffsetLocalHeader()> ");
				curEvent = '䤃';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOffsetLocalHeader();
				curEvent = null;

			} else if (nextCall.equals('㲅')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean isFileNameUTF8Encoded()> ");
				curEvent = '㲅';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isFileNameUTF8Encoded();
				curEvent = null;

			} else if (nextCall.equals('㬉')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ZipParameters: void <init>()> ");
				curEvent = '㬉';
				net.lingala.zip4j.model.ZipParameters ret;
				ret = new net.lingala.zip4j.model.ZipParameters();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䮋')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: net.lingala.zip4j.model.enums.AesVersion getAesVersion()> ");
				curEvent = '䮋';
				net.lingala.zip4j.model.enums.AesVersion ret;
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAesVersion();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䤒')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: java.lang.String getVendorID()> ");
				curEvent = '䤒';
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getVendorID();
				curEvent = null;

			} else if (nextCall.equals('䂓')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: java.lang.Object <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䂓';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䌟')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: long getCompressedSize()> ");
				curEvent = '䌟';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCompressedSize();
				curEvent = null;

			} else if (nextCall.equals('䆪')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.Zip64ExtendedInfo getZip64ExtendedInfo()> ");
				curEvent = '䆪';
				net.lingala.zip4j.model.Zip64ExtendedInfo ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getZip64ExtendedInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲪')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䲪';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䒬')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: int getDataSize()> ");
				curEvent = '䒬';
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataSize();
				curEvent = null;

			} else if (nextCall.equals('䖰')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: byte[] getExtraField()> ");
				curEvent = '䖰';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getExtraField();
				curEvent = null;

			} else if (nextCall.equals('䮷')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: int getSize()> ");
				curEvent = '䮷';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSize();
				curEvent = null;

			} else if (nextCall.equals('㴺')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> ");
				curEvent = '㴺';
				net.lingala.zip4j.model.enums.CompressionMethod ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCompressionMethod();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㔽')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: net.lingala.zip4j.model.LocalFileHeader getNextEntry()> ");
				curEvent = '㔽';
				net.lingala.zip4j.model.LocalFileHeader ret;
				net.lingala.zip4j.io.inputstream.ZipInputStream cls = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNextEntry();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䱃')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> ");
				curEvent = '䱃';
				int ret;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				net.lingala.zip4j.io.inputstream.ZipInputStream cls = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.read(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫆')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: int getDiskNumberStart()> ");
				curEvent = '㫆';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDiskNumberStart();
				curEvent = null;

			} else if (nextCall.equals('䟉')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: void <init>(java.io.InputStream)> ");
				curEvent = '䟉';
				net.lingala.zip4j.io.inputstream.ZipInputStream ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new net.lingala.zip4j.io.inputstream.ZipInputStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䇍')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> ");
				curEvent = '䇍';
				net.lingala.zip4j.model.enums.CompressionMethod ret;
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCompressionMethod();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗍')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.AESExtraDataRecord getAesExtraDataRecord()> ");
				curEvent = '䗍';
				net.lingala.zip4j.model.AESExtraDataRecord ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAesExtraDataRecord();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕎')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: long getOffsetStartOfData()> ");
				curEvent = '㕎';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOffsetStartOfData();
				curEvent = null;

			} else if (nextCall.equals('㙐')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-294974691_$i2_LOOPVAR__((int)-1)'()> ");
				curEvent = '㙐';
				int ret;
				ret = (((int)-1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡐')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: long getUncompressedSize()> ");
				curEvent = '㡐';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUncompressedSize();
				curEvent = null;

			} else if (nextCall.equals('䥐')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()> ");
				curEvent = '䥐';
				java.util.List ret;
				java.util.Iterator itr;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getExtraDataRecords();
				vars.put(getOutVar(nextCall, "ret"), ret);
				itr = ret.iterator();
				vars.put(getOutVar(nextCall, "itr"), itr);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "itr") + ", " + itr + ");");
				curEvent = null;

			} else if (nextCall.equals('㕓')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: void close()> ");
				curEvent = '㕓';
				net.lingala.zip4j.io.inputstream.ZipInputStream cls = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('㽣')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: java.lang.String getFileName()> ");
				curEvent = '㽣';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileName();
				curEvent = null;

			} else if (nextCall.equals('䑤')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ExtraDataRecord: byte[] getData()> ");
				curEvent = '䑤';
				net.lingala.zip4j.model.ExtraDataRecord cls = (net.lingala.zip4j.model.ExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getData();
				curEvent = null;

			} else if (nextCall.equals('䟪')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.enums.CompressionMethod: int getCode()> ");
				curEvent = '䟪';
				net.lingala.zip4j.model.enums.CompressionMethod cls = (net.lingala.zip4j.model.enums.CompressionMethod) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCode();
				curEvent = null;

			} else if (nextCall.equals('䍲')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ExtraDataRecord: long getHeader()> ");
				curEvent = '䍲';
				net.lingala.zip4j.model.ExtraDataRecord cls = (net.lingala.zip4j.model.ExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeader();
				curEvent = null;

			} else if (nextCall.equals('䋹')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: long getLastModifiedTimeEpoch()> ");
				curEvent = '䋹';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLastModifiedTimeEpoch();
				curEvent = null;

			} else if (nextCall.equals('䩺')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ExtraDataRecord: int getSizeOfData()> ");
				curEvent = '䩺';
				net.lingala.zip4j.model.ExtraDataRecord cls = (net.lingala.zip4j.model.ExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSizeOfData();
				curEvent = null;

			} else if (nextCall.equals('㽻')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.EncryptionMethod getEncryptionMethod()> ");
				curEvent = '㽻';
				net.lingala.zip4j.model.enums.EncryptionMethod ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEncryptionMethod();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕿')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: long getUncompressedSize()> ");
				curEvent = '䕿';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUncompressedSize();
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

			if (cond.equals('㰀')) {
				curEvent = '㰀';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: net.lingala.zip4j.model.LocalFileHeader getNextEntry()> */
				net.lingala.zip4j.model.LocalFileHeader v_39_ = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(getOutVar('㔽', "ret"));
				satisfies = (v_39_ == null);
				curEvent = null;

			} else if (cond.equals('㴈')) {
				curEvent = '㴈';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.AESExtraDataRecord getAesExtraDataRecord()> */
				net.lingala.zip4j.model.AESExtraDataRecord v_35_ = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(getOutVar('䗍', "ret"));
				satisfies = (v_35_ == null);
				curEvent = null;

			} else if (cond.equals('㘒')) {
				curEvent = '㘒';
				/* <net.lingala.zip4j.model.LocalFileHeader: boolean <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_38_ = (boolean) getVarValue(getOutVar('䲪', "ret"));
				satisfies = (v_38_ == false);
				curEvent = null;

			} else if (cond.equals('㠔')) {
				curEvent = '㠔';
				/* <net.lingala.zip4j.model.LocalFileHeader: boolean <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_38_ = (boolean) getVarValue(getOutVar('䲪', "ret"));
				satisfies = (Not(v_38_ == false));
				curEvent = null;

			} else if (cond.equals('䐗')) {
				curEvent = '䐗';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.AESExtraDataRecord getAesExtraDataRecord()> */
				net.lingala.zip4j.model.AESExtraDataRecord v_35_ = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(getOutVar('䗍', "ret"));
				satisfies = (Not(v_35_ == null));
				curEvent = null;

			} else if (cond.equals('䐚')) {
				curEvent = '䐚';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.Zip64ExtendedInfo getZip64ExtendedInfo()> */
				net.lingala.zip4j.model.Zip64ExtendedInfo v_20_ = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(getOutVar('䆪', "ret"));
				satisfies = (Not(v_20_ == null));
				curEvent = null;

			} else if (cond.equals('㪾')) {
				curEvent = '㪾';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-294974691_$i2_LOOPVAR__((int)-1)'()> */
				int v_8_ = (int) getVarValue(getOutVar('㙐', "ret"));
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> */
				int v_41_ = (int) getVarValue(getOutVar('䱃', "ret"));
				satisfies = (v_41_ == v_8_);
				curEvent = null;

			} else if (cond.equals('䍈')) {
				curEvent = '䍈';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.Zip64ExtendedInfo getZip64ExtendedInfo()> */
				net.lingala.zip4j.model.Zip64ExtendedInfo v_20_ = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(getOutVar('䆪', "ret"));
				satisfies = (v_20_ == null);
				curEvent = null;

			} else if (cond.equals('䗓')) {
				curEvent = '䗓';
				/* <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()> */
				java.util.List v_22_ = (java.util.List) getVarValue(getOutVar('䥐', "ret"));
				satisfies = (v_22_ == null);
				curEvent = null;

			} else if (cond.equals('䅖')) {
				curEvent = '䅖';
				/* <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()> */
				java.util.List v_22_ = (java.util.List) getVarValue(getOutVar('䥐', "ret"));
				satisfies = (Not(v_22_ == null));
				curEvent = null;

			} else if (cond.equals('㫘')) {
				curEvent = '㫘';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> */
				net.lingala.zip4j.model.enums.CompressionMethod v_31_ = (net.lingala.zip4j.model.enums.CompressionMethod) getVarValue(getOutVar('㴺', "ret"));
				satisfies = (v_31_ == null);
				curEvent = null;

			} else if (cond.equals('䅭')) {
				curEvent = '䅭';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-294974691_$i2_LOOPVAR__((int)-1)'()> */
				int v_8_ = (int) getVarValue(getOutVar('㙐', "ret"));
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> */
				int v_41_ = (int) getVarValue(getOutVar('䱃', "ret"));
				satisfies = (Not(v_41_ == v_8_));
				curEvent = null;

			} else if (cond.equals('㕱')) {
				curEvent = '㕱';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> */
				net.lingala.zip4j.model.enums.CompressionMethod v_31_ = (net.lingala.zip4j.model.enums.CompressionMethod) getVarValue(getOutVar('㴺', "ret"));
				satisfies = (Not(v_31_ == null));
				curEvent = null;

			} else if (cond.equals('䵶')) {
				curEvent = '䵶';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: net.lingala.zip4j.model.LocalFileHeader getNextEntry()> */
				net.lingala.zip4j.model.LocalFileHeader v_39_ = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(getOutVar('㔽', "ret"));
				satisfies = (Not(v_39_ == null));
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
