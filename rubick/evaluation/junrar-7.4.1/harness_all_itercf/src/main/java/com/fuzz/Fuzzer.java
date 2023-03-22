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
		vars.put("constant-java.io.OutputStream.nullOutputStream()", java.io.OutputStream.nullOutputStream());


	}

	@SuppressWarnings({"IdentityBinaryExpression","ArrayToString"})
	@Override
	protected void runNextCall(Character nextCall) throws HarnessException {
		try {

			if (nextCall.equals('䀂')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: byte getEncryptVersion()> ");
				curEvent = '䀂';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getEncryptVersion();
				curEvent = null;

			} else if (nextCall.equals('䖂')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isLocked()> ");
				curEvent = '䖂';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isLocked();
				curEvent = null;

			} else if (nextCall.equals('䄅')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isEncrypted()> ");
				curEvent = '䄅';
				boolean ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEncrypted();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䴆')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: short getHighPosAv()> ");
				curEvent = '䴆';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHighPosAv();
				curEvent = null;

			} else if (nextCall.equals('䜋')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: void print()> ");
				curEvent = '䜋';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('㞌')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isNewNumbering()> ");
				curEvent = '㞌';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isNewNumbering();
				curEvent = null;

			} else if (nextCall.equals('䆌')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getDataSize()> ");
				curEvent = '䆌';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataSize();
				curEvent = null;

			} else if (nextCall.equals('㪍')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.lang.String getFileNameString()> ");
				curEvent = '㪍';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileNameString();
				curEvent = null;

			} else if (nextCall.equals('㬑')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.lang.String getFileNameW()> ");
				curEvent = '㬑';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileNameW();
				curEvent = null;

			} else if (nextCall.equals('㢒')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean hasEncryptVersion()> ");
				curEvent = '㢒';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasEncryptVersion();
				curEvent = null;

			} else if (nextCall.equals('䴠')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isPasswordProtected()> ");
				curEvent = '䴠';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPasswordProtected();
				curEvent = null;

			} else if (nextCall.equals('㚡')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getArcTime()> ");
				curEvent = '㚡';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getArcTime();
				curEvent = null;

			} else if (nextCall.equals('䒡')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isAV()> ");
				curEvent = '䒡';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isAV();
				curEvent = null;

			} else if (nextCall.equals('㖥')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.rarfile.MainHeader getMainHeader()> ");
				curEvent = '㖥';
				com.github.junrar.rarfile.MainHeader ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMainHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㼧')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.lang.String getPassword()> ");
				curEvent = '㼧';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPassword();
				curEvent = null;

			} else if (nextCall.equals('㰨')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getCTime()> ");
				curEvent = '㰨';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCTime();
				curEvent = null;

			} else if (nextCall.equals('㲨')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getATime()> ");
				curEvent = '㲨';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getATime();
				curEvent = null;

			} else if (nextCall.equals('䞯')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.rarfile.FileHeader nextFileHeader()> ");
				curEvent = '䞯';
				com.github.junrar.rarfile.FileHeader ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.nextFileHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㶵')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isDirectory()> ");
				curEvent = '㶵';
				boolean ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isDirectory();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㠶')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getMTime()> ");
				curEvent = '㠶';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMTime();
				curEvent = null;

			} else if (nextCall.equals('䨸')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void <init>(java.io.InputStream)> ");
				curEvent = '䨸';
				com.github.junrar.Archive ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.Archive(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬺')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> ");
				curEvent = '䬺';
				com.github.junrar.io.SeekableReadOnlyByteChannel ret;
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getChannel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸼')) {
				if (debug) System.out.println("Calling <com.github.junrar.io.SeekableReadOnlyByteChannel: long getPosition()> ");
				curEvent = '㸼';
				com.github.junrar.io.SeekableReadOnlyByteChannel cls = (com.github.junrar.io.SeekableReadOnlyByteChannel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPosition();
				curEvent = null;

			} else if (nextCall.equals('䮼')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: void <init>()> ");
				curEvent = '䮼';
				com.github.junrar.rarfile.BaseBlock ret;
				ret = new com.github.junrar.rarfile.BaseBlock();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㡆')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.util.List getFileHeaders()> ");
				curEvent = '㡆';
				java.util.List ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFileHeaders();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗆')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean hasArchCmt()> ");
				curEvent = '䗆';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasArchCmt();
				curEvent = null;

			} else if (nextCall.equals('䑉')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.volume.Volume getVolume()> ");
				curEvent = '䑉';
				com.github.junrar.volume.Volume ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getVolume();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑌')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isEncrypted()> ");
				curEvent = '㑌';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('䣏')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.volume.VolumeManager getVolumeManager()> ");
				curEvent = '䣏';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getVolumeManager();
				curEvent = null;

			} else if (nextCall.equals('㻐')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getPackSize()> ");
				curEvent = '㻐';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPackSize();
				curEvent = null;

			} else if (nextCall.equals('䃑')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isOldFormat()> ");
				curEvent = '䃑';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOldFormat();
				curEvent = null;

			} else if (nextCall.equals('㝘')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.io.InputStream getInputStream(com.github.junrar.rarfile.FileHeader)> ");
				curEvent = '㝘';
				com.github.junrar.rarfile.FileHeader arg0 = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getInputStream(arg0);
				curEvent = null;

			} else if (nextCall.equals('㟘')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void close()> ");
				curEvent = '㟘';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䱙')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.util.List getHeaders()> ");
				curEvent = '䱙';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeaders();
				curEvent = null;

			} else if (nextCall.equals('䧚')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void extractFile(com.github.junrar.rarfile.FileHeader,java.io.OutputStream)> ");
				curEvent = '䧚';
				com.github.junrar.rarfile.FileHeader arg0 = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.io.OutputStream arg1 = (java.io.OutputStream) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.extractFile(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㥝')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: long getLength()> ");
				curEvent = '㥝';
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLength();
				curEvent = null;

			} else if (nextCall.equals('䵝')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: com.github.junrar.rarfile.UnrarHeadertype getHeaderType()> ");
				curEvent = '䵝';
				com.github.junrar.rarfile.UnrarHeadertype ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getHeaderType();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㑦')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isSolid()> ");
				curEvent = '㑦';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSolid();
				curEvent = null;

			} else if (nextCall.equals('䥩')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: int getPosAv()> ");
				curEvent = '䥩';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPosAv();
				curEvent = null;

			} else if (nextCall.equals('䁫')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isFirstVolume()> ");
				curEvent = '䁫';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isFirstVolume();
				curEvent = null;

			} else if (nextCall.equals('䡫')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isSubBlock()> ");
				curEvent = '䡫';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSubBlock();
				curEvent = null;

			} else if (nextCall.equals('䅯')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.UnrarCallback getUnrarCallback()> ");
				curEvent = '䅯';
				com.github.junrar.UnrarCallback ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getUnrarCallback();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㫷')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> ");
				curEvent = '㫷';
				com.github.junrar.io.SeekableReadOnlyByteChannel ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getChannel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㻸')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isEncrypted()> ");
				curEvent = '㻸';
				boolean ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEncrypted();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯹')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: com.github.junrar.Archive getArchive()> ");
				curEvent = '㯹';
				com.github.junrar.Archive ret;
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getArchive();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㥺')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getFullUnpackSize()> ");
				curEvent = '㥺';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFullUnpackSize();
				curEvent = null;

			} else if (nextCall.equals('䡽')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isProtected()> ");
				curEvent = '䡽';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isProtected();
				curEvent = null;

			} else if (nextCall.equals('䑾')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: void print()> ");
				curEvent = '䑾';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('㭾')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isMultiVolume()> ");
				curEvent = '㭾';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isMultiVolume();
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

			if (cond.equals('㰂')) {
				curEvent = '㰂';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.FileHeader nextFileHeader()> */
				com.github.junrar.rarfile.FileHeader v_25_ = (com.github.junrar.rarfile.FileHeader) getVarValue(getOutVar('䞯', "ret"));
				satisfies = (Not(v_25_ == null));
				curEvent = null;

			} else if (cond.equals('䰊')) {
				curEvent = '䰊';
				/* <com.github.junrar.Archive: com.github.junrar.volume.Volume getVolume()> */
				com.github.junrar.volume.Volume v_121_ = (com.github.junrar.volume.Volume) getVarValue(getOutVar('䑉', "ret"));
				satisfies = (v_121_ == null);
				curEvent = null;

			} else if (cond.equals('䖔')) {
				curEvent = '䖔';
				/* <com.github.junrar.Archive: com.github.junrar.volume.Volume getVolume()> */
				com.github.junrar.volume.Volume v_121_ = (com.github.junrar.volume.Volume) getVarValue(getOutVar('䑉', "ret"));
				satisfies = (Not(v_121_ == null));
				curEvent = null;

			} else if (cond.equals('䘗')) {
				curEvent = '䘗';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.FileHeader nextFileHeader()> */
				com.github.junrar.rarfile.FileHeader v_25_ = (com.github.junrar.rarfile.FileHeader) getVarValue(getOutVar('䞯', "ret"));
				satisfies = (v_25_ == null);
				curEvent = null;

			} else if (cond.equals('䴝')) {
				curEvent = '䴝';
				/* <com.github.junrar.Archive: boolean isEncrypted()> */
				boolean v_70_ = (boolean) getVarValue(getOutVar('䄅', "ret"));
				satisfies = (Not(v_70_ == false));
				curEvent = null;

			} else if (cond.equals('㞪')) {
				curEvent = '㞪';
				/* <com.github.junrar.rarfile.FileHeader: boolean isDirectory()> */
				boolean v_41_ = (boolean) getVarValue(getOutVar('㶵', "ret"));
				satisfies = (Not(v_41_ == false));
				curEvent = null;

			} else if (cond.equals('䪸')) {
				curEvent = '䪸';
				/* <com.github.junrar.rarfile.FileHeader: boolean isEncrypted()> */
				boolean v_16_ = (boolean) getVarValue(getOutVar('㻸', "ret"));
				satisfies = (Not(v_16_ == false));
				curEvent = null;

			} else if (cond.equals('䚿')) {
				curEvent = '䚿';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.MainHeader getMainHeader()> */
				com.github.junrar.rarfile.MainHeader v_107_ = (com.github.junrar.rarfile.MainHeader) getVarValue(getOutVar('㖥', "ret"));
				satisfies = (v_107_ == null);
				curEvent = null;

			} else if (cond.equals('㥅')) {
				curEvent = '㥅';
				/* <com.github.junrar.Archive: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> */
				com.github.junrar.io.SeekableReadOnlyByteChannel v_73_ = (com.github.junrar.io.SeekableReadOnlyByteChannel) getVarValue(getOutVar('㫷', "ret"));
				satisfies = (v_73_ == null);
				curEvent = null;

			} else if (cond.equals('䧗')) {
				curEvent = '䧗';
				/* <com.github.junrar.rarfile.FileHeader: boolean isDirectory()> */
				boolean v_41_ = (boolean) getVarValue(getOutVar('㶵', "ret"));
				satisfies = (v_41_ == false);
				curEvent = null;

			} else if (cond.equals('䭥')) {
				curEvent = '䭥';
				/* <com.github.junrar.Archive: boolean isEncrypted()> */
				boolean v_70_ = (boolean) getVarValue(getOutVar('䄅', "ret"));
				satisfies = (v_70_ == false);
				curEvent = null;

			} else if (cond.equals('㝭')) {
				curEvent = '㝭';
				/* <com.github.junrar.Archive: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> */
				com.github.junrar.io.SeekableReadOnlyByteChannel v_73_ = (com.github.junrar.io.SeekableReadOnlyByteChannel) getVarValue(getOutVar('㫷', "ret"));
				satisfies = (Not(v_73_ == null));
				curEvent = null;

			} else if (cond.equals('㻯')) {
				curEvent = '㻯';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.MainHeader getMainHeader()> */
				com.github.junrar.rarfile.MainHeader v_107_ = (com.github.junrar.rarfile.MainHeader) getVarValue(getOutVar('㖥', "ret"));
				satisfies = (Not(v_107_ == null));
				curEvent = null;

			} else if (cond.equals('䟵')) {
				curEvent = '䟵';
				/* <com.github.junrar.rarfile.FileHeader: boolean isEncrypted()> */
				boolean v_16_ = (boolean) getVarValue(getOutVar('㻸', "ret"));
				satisfies = (v_16_ == false);
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
