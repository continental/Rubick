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

			if (nextCall.equals('䢀')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: void extractAll(java.lang.String)> ");
				curEvent = '䢀';
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.extractAll(arg0);
				curEvent = null;

			} else if (nextCall.equals('㢁')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: net.lingala.zip4j.model.FileHeader getFileHeader(java.lang.String)> ");
				curEvent = '㢁';
				net.lingala.zip4j.model.FileHeader ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFileHeader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬂')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: byte[] getExtraField()> ");
				curEvent = '䬂';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getExtraField();
				curEvent = null;

			} else if (nextCall.equals('䦅')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ExtraDataRecord: int getSizeOfData()> ");
				curEvent = '䦅';
				net.lingala.zip4j.model.ExtraDataRecord cls = (net.lingala.zip4j.model.ExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSizeOfData();
				curEvent = null;

			} else if (nextCall.equals('㒆')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-294974691_$i2_LOOPVAR__((int)-1)'()> ");
				curEvent = '㒆';
				int ret;
				ret = (((int)-1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲇')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: net.lingala.zip4j.model.enums.AesKeyStrength getAesKeyStrength()> ");
				curEvent = '䲇';
				net.lingala.zip4j.model.enums.AesKeyStrength ret;
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAesKeyStrength();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䶇')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䶇';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆈')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> ");
				curEvent = '䆈';
				net.lingala.zip4j.model.enums.CompressionMethod ret;
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCompressionMethod();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚉')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.EncryptionMethod getEncryptionMethod()> ");
				curEvent = '㚉';
				net.lingala.zip4j.model.enums.EncryptionMethod ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getEncryptionMethod();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䆍')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ExtraDataRecord: byte[] getData()> ");
				curEvent = '䆍';
				net.lingala.zip4j.model.ExtraDataRecord cls = (net.lingala.zip4j.model.ExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getData();
				curEvent = null;

			} else if (nextCall.equals('䜐')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: java.lang.String getVendorID()> ");
				curEvent = '䜐';
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getVendorID();
				curEvent = null;

			} else if (nextCall.equals('㞓')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> ");
				curEvent = '㞓';
				net.lingala.zip4j.model.enums.CompressionMethod ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getCompressionMethod();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㘕')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: void close()> ");
				curEvent = '㘕';
				net.lingala.zip4j.io.inputstream.ZipInputStream cls = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䘗')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters buildAsyncParameters()> ");
				curEvent = '䘗';
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.buildAsyncParameters();
				curEvent = null;

			} else if (nextCall.equals('䄚')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.AESExtraDataRecord getAesExtraDataRecord()> ");
				curEvent = '䄚';
				net.lingala.zip4j.model.AESExtraDataRecord ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAesExtraDataRecord();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬜')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: void close()> ");
				curEvent = '㬜';
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䪝')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: int getSize()> ");
				curEvent = '䪝';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSize();
				curEvent = null;

			} else if (nextCall.equals('䒭')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ExtraDataRecord: long getHeader()> ");
				curEvent = '䒭';
				net.lingala.zip4j.model.ExtraDataRecord cls = (net.lingala.zip4j.model.ExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeader();
				curEvent = null;

			} else if (nextCall.equals('㖺')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.enums.EncryptionMethod: java.lang.String toString()> ");
				curEvent = '㖺';
				net.lingala.zip4j.model.enums.EncryptionMethod cls = (net.lingala.zip4j.model.enums.EncryptionMethod) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.toString();
				curEvent = null;

			} else if (nextCall.equals('䘽')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean isDirectory()> ");
				curEvent = '䘽';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isDirectory();
				curEvent = null;

			} else if (nextCall.equals('㥁')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: void extractFile(java.lang.String,java.lang.String,java.lang.String)> ");
				curEvent = '㥁';
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.lang.String arg1 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				java.lang.String arg2 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.extractFile(arg0,arg1,arg2);
				curEvent = null;

			} else if (nextCall.equals('䉂')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.FileHeader: java.lang.String getFileName()> ");
				curEvent = '䉂';
				net.lingala.zip4j.model.FileHeader cls = (net.lingala.zip4j.model.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileName();
				curEvent = null;

			} else if (nextCall.equals('㳃')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: long getOffsetStartOfData()> ");
				curEvent = '㳃';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOffsetStartOfData();
				curEvent = null;

			} else if (nextCall.equals('䕃')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: int getDiskNumberStart()> ");
				curEvent = '䕃';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDiskNumberStart();
				curEvent = null;

			} else if (nextCall.equals('䛆')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ZipModel: boolean isSplitArchive()> ");
				curEvent = '䛆';
				boolean ret;
				net.lingala.zip4j.model.ZipModel cls = (net.lingala.zip4j.model.ZipModel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isSplitArchive();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻇')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: long getUncompressedSize()> ");
				curEvent = '㻇';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUncompressedSize();
				curEvent = null;

			} else if (nextCall.equals('H')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: long getOffsetLocalHeader()> ");
				curEvent = 'H';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getOffsetLocalHeader();
				curEvent = null;

			} else if (nextCall.equals('㓋')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: void readZipInfo()> ");
				curEvent = '㓋';
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.readZipInfo();
				curEvent = null;

			} else if (nextCall.equals('㕌')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: void <init>(java.lang.String)> ");
				curEvent = '㕌';
				net.lingala.zip4j.ZipFile ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new net.lingala.zip4j.ZipFile(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㝍')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()> ");
				curEvent = '㝍';
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

			} else if (nextCall.equals('㵐')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: void <init>(java.io.InputStream)> ");
				curEvent = '㵐';
				net.lingala.zip4j.io.inputstream.ZipInputStream ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new net.lingala.zip4j.io.inputstream.ZipInputStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㽓')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: void <init>(java.io.InputStream,char[])> ");
				curEvent = '㽓';
				net.lingala.zip4j.io.inputstream.ZipInputStream ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				char[] arg1 = (char[]) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new net.lingala.zip4j.io.inputstream.ZipInputStream(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥔')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: net.lingala.zip4j.model.Zip4jConfig buildConfig()> ");
				curEvent = '㥔';
				net.lingala.zip4j.model.Zip4jConfig ret = null;
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//ret = cls.buildConfig();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䉛')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-64883029_$i2_LOOPVAR__((int)-1)'()> ");
				curEvent = '䉛';
				int ret;
				ret = (((int)-1));
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('e')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean isEncrypted()> ");
				curEvent = 'e';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('䅧')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: net.lingala.zip4j.model.LocalFileHeader getNextEntry()> ");
				curEvent = '䅧';
				net.lingala.zip4j.model.LocalFileHeader ret;
				net.lingala.zip4j.io.inputstream.ZipInputStream cls = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getNextEntry();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䍧')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.exception.ZipException: void <init>(java.lang.String)> ");
				curEvent = '䍧';
				net.lingala.zip4j.exception.ZipException ret;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new net.lingala.zip4j.exception.ZipException(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧨')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: java.lang.String getFileName()> ");
				curEvent = '䧨';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileName();
				curEvent = null;

			} else if (nextCall.equals('㵪')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: java.lang.Object <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '㵪';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁭')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> ");
				curEvent = '䁭';
				int ret;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				net.lingala.zip4j.io.inputstream.ZipInputStream cls = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.read(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕮')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.ZipParameters: void <init>()> ");
				curEvent = '䕮';
				net.lingala.zip4j.model.ZipParameters ret;
				ret = new net.lingala.zip4j.model.ZipParameters();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䥮')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: void <init>(java.io.File)> ");
				curEvent = '䥮';
				net.lingala.zip4j.ZipFile ret;
				java.io.File arg0 = (java.io.File) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new net.lingala.zip4j.ZipFile(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䧮')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: long getLastModifiedTimeEpoch()> ");
				curEvent = '䧮';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLastModifiedTimeEpoch();
				curEvent = null;

			} else if (nextCall.equals('㽱')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: boolean isFileNameUTF8Encoded()> ");
				curEvent = '㽱';
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isFileNameUTF8Encoded();
				curEvent = null;

			} else if (nextCall.equals('㭵')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: int getDataSize()> ");
				curEvent = '㭵';
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataSize();
				curEvent = null;

			} else if (nextCall.equals('㗷')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: long getUncompressedSize()> ");
				curEvent = '㗷';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUncompressedSize();
				curEvent = null;

			} else if (nextCall.equals('䏺')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.AESExtraDataRecord: net.lingala.zip4j.model.enums.AesVersion getAesVersion()> ");
				curEvent = '䏺';
				net.lingala.zip4j.model.enums.AesVersion ret;
				net.lingala.zip4j.model.AESExtraDataRecord cls = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getAesVersion();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㩻')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.ZipFile: net.lingala.zip4j.io.inputstream.ZipInputStream getInputStream(net.lingala.zip4j.model.FileHeader)> ");
				curEvent = '㩻';
				net.lingala.zip4j.io.inputstream.ZipInputStream ret;
				net.lingala.zip4j.model.FileHeader arg0 = (net.lingala.zip4j.model.FileHeader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				net.lingala.zip4j.ZipFile cls = (net.lingala.zip4j.ZipFile) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getInputStream(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳻')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.Zip64ExtendedInfo: long getCompressedSize()> ");
				curEvent = '䳻';
				net.lingala.zip4j.model.Zip64ExtendedInfo cls = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCompressedSize();
				curEvent = null;

			} else if (nextCall.equals('㗼')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.Zip64ExtendedInfo getZip64ExtendedInfo()> ");
				curEvent = '㗼';
				net.lingala.zip4j.model.Zip64ExtendedInfo ret;
				net.lingala.zip4j.model.LocalFileHeader cls = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getZip64ExtendedInfo();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㗽')) {
				if (debug) System.out.println("Calling <net.lingala.zip4j.model.enums.CompressionMethod: int getCode()> ");
				curEvent = '㗽';
				net.lingala.zip4j.model.enums.CompressionMethod cls = (net.lingala.zip4j.model.enums.CompressionMethod) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCode();
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

			if (cond.equals('䄀')) {
				curEvent = '䄀';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: net.lingala.zip4j.model.LocalFileHeader getNextEntry()> */
				net.lingala.zip4j.model.LocalFileHeader v_36_ = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(getOutVar('䅧', "ret"));
				satisfies = (Not(v_36_ == null));
				curEvent = null;

			} else if (cond.equals('㮃')) {
				curEvent = '㮃';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-64883029_$i2_LOOPVAR__((int)-1)'()> */
				int v_31_ = (int) getVarValue(getOutVar('䉛', "ret"));
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> */
				int v_14_ = (int) getVarValue(getOutVar('䁭', "ret"));
				satisfies = (Not(v_14_ == v_31_));
				curEvent = null;

			} else if (cond.equals('䶎')) {
				curEvent = '䶎';
				/* <net.lingala.zip4j.model.ZipModel: boolean isSplitArchive()> */
				boolean v_44_ = (boolean) getVarValue(getOutVar('䛆', "ret"));
				satisfies = (Not(v_44_ == false));
				curEvent = null;

			} else if (cond.equals('㮑')) {
				curEvent = '㮑';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-64883029_$i2_LOOPVAR__((int)-1)'()> */
				int v_31_ = (int) getVarValue(getOutVar('䉛', "ret"));
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> */
				int v_14_ = (int) getVarValue(getOutVar('䁭', "ret"));
				satisfies = (v_14_ == v_31_);
				curEvent = null;

			} else if (cond.equals('䊗')) {
				curEvent = '䊗';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> */
				net.lingala.zip4j.model.enums.CompressionMethod v_34_ = (net.lingala.zip4j.model.enums.CompressionMethod) getVarValue(getOutVar('㞓', "ret"));
				satisfies = (Not(v_34_ == null));
				curEvent = null;

			} else if (cond.equals('䴘')) {
				curEvent = '䴘';
				/* <net.lingala.zip4j.ZipFile: net.lingala.zip4j.io.inputstream.ZipInputStream getInputStream(net.lingala.zip4j.model.FileHeader)> */
				net.lingala.zip4j.io.inputstream.ZipInputStream v_21_ = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(getOutVar('㩻', "ret"));
				satisfies = (Not(v_21_ == null));
				curEvent = null;

			} else if (cond.equals('䴤')) {
				curEvent = '䴤';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.AESExtraDataRecord getAesExtraDataRecord()> */
				net.lingala.zip4j.model.AESExtraDataRecord v_24_ = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(getOutVar('䄚', "ret"));
				satisfies = (Not(v_24_ == null));
				curEvent = null;

			} else if (cond.equals('㾩')) {
				curEvent = '㾩';
				/* <net.lingala.zip4j.model.LocalFileHeader: boolean <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_41_ = (boolean) getVarValue(getOutVar('䶇', "ret"));
				satisfies = (v_41_ == false);
				curEvent = null;

			} else if (cond.equals('䈲')) {
				curEvent = '䈲';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: net.lingala.zip4j.model.LocalFileHeader getNextEntry()> */
				net.lingala.zip4j.model.LocalFileHeader v_36_ = (net.lingala.zip4j.model.LocalFileHeader) getVarValue(getOutVar('䅧', "ret"));
				satisfies = (v_36_ == null);
				curEvent = null;

			} else if (cond.equals('䘴')) {
				curEvent = '䘴';
				/* <net.lingala.zip4j.model.ZipModel: boolean isSplitArchive()> */
				boolean v_44_ = (boolean) getVarValue(getOutVar('䛆', "ret"));
				satisfies = (v_44_ == false);
				curEvent = null;

			} else if (cond.equals('䪸')) {
				curEvent = '䪸';
				/* <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()> */
				java.util.List v_46_ = (java.util.List) getVarValue(getOutVar('㝍', "ret"));
				satisfies = (v_46_ == null);
				curEvent = null;

			} else if (cond.equals('䵀')) {
				curEvent = '䵀';
				/* <net.lingala.zip4j.model.LocalFileHeader: boolean <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_41_ = (boolean) getVarValue(getOutVar('䶇', "ret"));
				satisfies = (Not(v_41_ == false));
				curEvent = null;

			} else if (cond.equals('㹅')) {
				curEvent = '㹅';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-294974691_$i2_LOOPVAR__((int)-1)'()> */
				int v_50_ = (int) getVarValue(getOutVar('㒆', "ret"));
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> */
				int v_14_ = (int) getVarValue(getOutVar('䁭', "ret"));
				satisfies = (v_14_ == v_50_);
				curEvent = null;

			} else if (cond.equals('㻆')) {
				curEvent = '㻆';
				/* <net.lingala.zip4j.model.LocalFileHeader: java.util.List getExtraDataRecords()> */
				java.util.List v_46_ = (java.util.List) getVarValue(getOutVar('㝍', "ret"));
				satisfies = (Not(v_46_ == null));
				curEvent = null;

			} else if (cond.equals('䕉')) {
				curEvent = '䕉';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.AESExtraDataRecord getAesExtraDataRecord()> */
				net.lingala.zip4j.model.AESExtraDataRecord v_24_ = (net.lingala.zip4j.model.AESExtraDataRecord) getVarValue(getOutVar('䄚', "ret"));
				satisfies = (v_24_ == null);
				curEvent = null;

			} else if (cond.equals('䡎')) {
				curEvent = '䡎';
				/* <net.lingala.zip4j.ZipFile: net.lingala.zip4j.io.inputstream.ZipInputStream getInputStream(net.lingala.zip4j.model.FileHeader)> */
				net.lingala.zip4j.io.inputstream.ZipInputStream v_21_ = (net.lingala.zip4j.io.inputstream.ZipInputStream) getVarValue(getOutVar('㩻', "ret"));
				satisfies = (v_21_ == null);
				curEvent = null;

			} else if (cond.equals('㯐')) {
				curEvent = '㯐';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.Zip64ExtendedInfo getZip64ExtendedInfo()> */
				net.lingala.zip4j.model.Zip64ExtendedInfo v_27_ = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(getOutVar('㗼', "ret"));
				satisfies = (Not(v_27_ == null));
				curEvent = null;

			} else if (cond.equals('㷜')) {
				curEvent = '㷜';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.Zip64ExtendedInfo getZip64ExtendedInfo()> */
				net.lingala.zip4j.model.Zip64ExtendedInfo v_27_ = (net.lingala.zip4j.model.Zip64ExtendedInfo) getVarValue(getOutVar('㗼', "ret"));
				satisfies = (v_27_ == null);
				curEvent = null;

			} else if (cond.equals('䧥')) {
				curEvent = '䧥';
				/* <net.lingala.zip4j.ZipFile: net.lingala.zip4j.model.FileHeader getFileHeader(java.lang.String)> */
				net.lingala.zip4j.model.FileHeader v_11_ = (net.lingala.zip4j.model.FileHeader) getVarValue(getOutVar('㢁', "ret"));
				satisfies = (Not(v_11_ == null));
				curEvent = null;

			} else if (cond.equals('䃦')) {
				curEvent = '䃦';
				/* <net.lingala.zip4j.model.LocalFileHeader: net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()> */
				net.lingala.zip4j.model.enums.CompressionMethod v_34_ = (net.lingala.zip4j.model.enums.CompressionMethod) getVarValue(getOutVar('㞓', "ret"));
				satisfies = (v_34_ == null);
				curEvent = null;

			} else if (cond.equals('㳨')) {
				curEvent = '㳨';
				/* <net.lingala.zip4j.ZipFile: net.lingala.zip4j.model.FileHeader getFileHeader(java.lang.String)> */
				net.lingala.zip4j.model.FileHeader v_11_ = (net.lingala.zip4j.model.FileHeader) getVarValue(getOutVar('㢁', "ret"));
				satisfies = (v_11_ == null);
				curEvent = null;

			} else if (cond.equals('㷶')) {
				curEvent = '㷶';
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int '-294974691_$i2_LOOPVAR__((int)-1)'()> */
				int v_50_ = (int) getVarValue(getOutVar('㒆', "ret"));
				/* <net.lingala.zip4j.io.inputstream.ZipInputStream: int read(byte[])> */
				int v_14_ = (int) getVarValue(getOutVar('䁭', "ret"));
				satisfies = (Not(v_14_ == v_50_));
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
