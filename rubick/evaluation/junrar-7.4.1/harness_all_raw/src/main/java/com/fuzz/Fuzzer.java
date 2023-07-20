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

			if (nextCall.equals('㨄')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BlockHeader: void <init>(com.github.junrar.rarfile.BlockHeader)> ");
				curEvent = '㨄';
				com.github.junrar.rarfile.BlockHeader ret;
				com.github.junrar.rarfile.BlockHeader arg0 = (com.github.junrar.rarfile.BlockHeader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.rarfile.BlockHeader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㬅')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getFullPackSize()> ");
				curEvent = '㬅';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFullPackSize();
				curEvent = null;

			} else if (nextCall.equals('㐆')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isAV()> ");
				curEvent = '㐆';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isAV();
				curEvent = null;

			} else if (nextCall.equals('㰈')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.lang.String getFileNameW()> ");
				curEvent = '㰈';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileNameW();
				curEvent = null;

			} else if (nextCall.equals('䰉')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isSolid()> ");
				curEvent = '䰉';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSolid();
				curEvent = null;

			} else if (nextCall.equals('䬌')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.UnrarHeadertype: boolean equals(byte)> ");
				curEvent = '䬌';
				boolean ret;
				byte arg0 = (byte) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.rarfile.UnrarHeadertype cls = (com.github.junrar.rarfile.UnrarHeadertype) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.equals(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰍')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.SubBlockHeaderType: short getSubblocktype()> ");
				curEvent = '㰍';
				com.github.junrar.rarfile.SubBlockHeaderType cls = (com.github.junrar.rarfile.SubBlockHeaderType) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getSubblocktype();
				curEvent = null;

			} else if (nextCall.equals('䨑')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.HostSystem: void <init>(java.lang.String,int,byte)> ");
				curEvent = '䨑';
				com.github.junrar.rarfile.HostSystem ret = null;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				byte arg2 = (byte) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				//ret = new com.github.junrar.rarfile.HostSystem(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㰖')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: int getPosAv()> ");
				curEvent = '㰖';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPosAv();
				curEvent = null;

			} else if (nextCall.equals('㼗')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isUnicode()> ");
				curEvent = '㼗';
				boolean ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isUnicode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㘜')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.lang.String getFileNameString()> ");
				curEvent = '㘜';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileNameString();
				curEvent = null;

			} else if (nextCall.equals('㠢')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MarkHeader: boolean isValid()> ");
				curEvent = '㠢';
				com.github.junrar.rarfile.MarkHeader cls = (com.github.junrar.rarfile.MarkHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isValid();
				curEvent = null;

			} else if (nextCall.equals('䀢')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: com.github.junrar.rarfile.UnrarHeadertype getHeaderType()> ");
				curEvent = '䀢';
				com.github.junrar.rarfile.UnrarHeadertype ret;
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getHeaderType();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤢')) {
				if (debug) System.out.println("Calling <com.github.junrar.io.Raw: long readIntLittleEndianAsLong(byte[],int)> ");
				curEvent = '㤢';
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.github.junrar.io.Raw.readIntLittleEndianAsLong(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㴢')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isFirstVolume()> ");
				curEvent = '㴢';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isFirstVolume();
				curEvent = null;

			} else if (nextCall.equals('䴢')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getDateDos(int)> ");
				curEvent = '䴢';
				int arg0 = (int) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.getDateDos(arg0);
				curEvent = null;

			} else if (nextCall.equals('䈣')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: boolean isSubBlock()> ");
				curEvent = '䈣';
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSubBlock();
				curEvent = null;

			} else if (nextCall.equals('㨦')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BlockHeader: void print()> ");
				curEvent = '㨦';
				com.github.junrar.rarfile.BlockHeader cls = (com.github.junrar.rarfile.BlockHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('㘨')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isDirectory()> ");
				curEvent = '㘨';
				boolean ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isDirectory();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䰨')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getArcTime()> ");
				curEvent = '䰨';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getArcTime();
				curEvent = null;

			} else if (nextCall.equals('㔨')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isLocked()> ");
				curEvent = '㔨';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isLocked();
				curEvent = null;

			} else if (nextCall.equals('䄩')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.util.List getFileHeaders()> ");
				curEvent = '䄩';
				java.util.List ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFileHeaders();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸪')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getMTime()> ");
				curEvent = '㸪';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getMTime();
				curEvent = null;

			} else if (nextCall.equals('䤯')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: boolean hasVolumeNumber()> ");
				curEvent = '䤯';
				boolean ret;
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.hasVolumeNumber();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬳')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.util.List getHeaders()> ");
				curEvent = '䬳';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeaders();
				curEvent = null;

			} else if (nextCall.equals('䠵')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.lang.String getPassword()> ");
				curEvent = '䠵';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPassword();
				curEvent = null;

			} else if (nextCall.equals('䔶')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.volume.Volume getVolume()> ");
				curEvent = '䔶';
				com.github.junrar.volume.Volume ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getVolume();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䬸')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: void <init>()> ");
				curEvent = '䬸';
				com.github.junrar.rarfile.BaseBlock ret;
				ret = new com.github.junrar.rarfile.BaseBlock();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㸹')) {
				if (debug) System.out.println("Calling <com.github.junrar.LocalFolderExtractor: java.io.File makeFile(java.io.File,java.lang.String)> ");
				curEvent = '㸹';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㼹')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: short getHighPosAv()> ");
				curEvent = '㼹';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHighPosAv();
				curEvent = null;

			} else if (nextCall.equals('䰽')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive$isEncrypted__1: java.util.function.Predicate bootstrap$()> ");
				curEvent = '䰽';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䔽')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isSplitBefore()> ");
				curEvent = '䔽';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSplitBefore();
				curEvent = null;

			} else if (nextCall.equals('䤾')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: void print()> ");
				curEvent = '䤾';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('㕀')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: short getHeadCRC()> ");
				curEvent = '㕀';
				short ret;
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getHeadCRC();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䅁')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isOldFormat()> ");
				curEvent = '䅁';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOldFormat();
				curEvent = null;

			} else if (nextCall.equals('㑃')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.SubBlockHeader: void <init>(com.github.junrar.rarfile.SubBlockHeader)> ");
				curEvent = '㑃';
				com.github.junrar.rarfile.SubBlockHeader ret;
				com.github.junrar.rarfile.SubBlockHeader arg0 = (com.github.junrar.rarfile.SubBlockHeader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.rarfile.SubBlockHeader(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝅')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.volume.VolumeManager getVolumeManager()> ");
				curEvent = '䝅';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getVolumeManager();
				curEvent = null;

			} else if (nextCall.equals('䭉')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.lang.String getFileName()> ");
				curEvent = '䭉';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileName();
				curEvent = null;

			} else if (nextCall.equals('㵊')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isEncrypted()> ");
				curEvent = '㵊';
				boolean ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEncrypted();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('K')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isSplitAfter()> ");
				curEvent = 'K';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSplitAfter();
				curEvent = null;

			} else if (nextCall.equals('䝋')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BlockHeader: long getDataSize()> ");
				curEvent = '䝋';
				com.github.junrar.rarfile.BlockHeader cls = (com.github.junrar.rarfile.BlockHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataSize();
				curEvent = null;

			} else if (nextCall.equals('䵋')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: short getFlags()> ");
				curEvent = '䵋';
				short ret;
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getFlags();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㱍')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: com.github.junrar.rarfile.UnrarHeadertype getHeaderType()> ");
				curEvent = '㱍';
				com.github.junrar.rarfile.UnrarHeadertype ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getHeaderType();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩎')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void <init>(java.io.InputStream)> ");
				curEvent = '䩎';
				com.github.junrar.Archive ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.Archive(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩏')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.lang.Object <com.github.junrar.Archive: java.util.List getFileHeaders()>_ITERABLE_next(java.util.Iterator)> ");
				curEvent = '䩏';
				java.lang.Object ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.next();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䁐')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileNameDecoder: int getChar(byte[],int)> ");
				curEvent = '䁐';
				int ret;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = com.github.junrar.rarfile.FileNameDecoder.getChar(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䡓')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.NewSubHeaderType: void <init>(byte[])> ");
				curEvent = '䡓';
				com.github.junrar.rarfile.NewSubHeaderType ret = null;
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//ret = new com.github.junrar.rarfile.NewSubHeaderType(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䩓')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isSolid()> ");
				curEvent = '䩓';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSolid();
				curEvent = null;

			} else if (nextCall.equals('䕕')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileNameDecoder: java.lang.String decode(byte[],int)> ");
				curEvent = '䕕';
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.github.junrar.rarfile.FileNameDecoder.decode(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('䱖')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void extractFile(com.github.junrar.rarfile.FileHeader,java.io.OutputStream)> ");
				curEvent = '䱖';
				com.github.junrar.rarfile.FileHeader arg0 = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				java.io.OutputStream arg1 = (java.io.OutputStream) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.extractFile(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㥗')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isEncrypted()> ");
				curEvent = '㥗';
				boolean ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isEncrypted();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䕗')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: boolean hasEncryptVersion()> ");
				curEvent = '䕗';
				boolean ret;
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.hasEncryptVersion();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䝘')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.HostSystem: com.github.junrar.rarfile.HostSystem findHostSystem(byte)> ");
				curEvent = '䝘';
				com.github.junrar.rarfile.HostSystem ret;
				byte arg0 = (byte) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = com.github.junrar.rarfile.HostSystem.findHostSystem(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䭝')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: byte getUnpVersion()> ");
				curEvent = '䭝';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUnpVersion();
				curEvent = null;

			} else if (nextCall.equals('㭠')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean hasArchCmt()> ");
				curEvent = '㭠';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasArchCmt();
				curEvent = null;

			} else if (nextCall.equals('㝥')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: void print()> ");
				curEvent = '㝥';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('䕥')) {
				if (debug) System.out.println("Calling <com.github.junrar.exception.MainHeaderNullException: void <init>()> ");
				curEvent = '䕥';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䕫')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.InputStreamVolume: void <init>(com.github.junrar.Archive,java.io.InputStream,int)> ");
				curEvent = '䕫';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䅬')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.RARVersion: void <init>(java.lang.String,int)> ");
				curEvent = '䅬';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䁮')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.InputStreamVolume: long getLength()> ");
				curEvent = '䁮';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䩮')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean hasEncryptVersion()> ");
				curEvent = '䩮';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasEncryptVersion();
				curEvent = null;

			} else if (nextCall.equals('䭷')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void <init>(java.io.File,com.github.junrar.UnrarCallback)> ");
				curEvent = '䭷';
				com.github.junrar.Archive ret;
				java.io.File arg0 = (java.io.File) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.UnrarCallback arg1 = (com.github.junrar.UnrarCallback) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				ret = new com.github.junrar.Archive(arg0,arg1);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䱸')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: void print()> ");
				curEvent = '䱸';
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('㝾')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.io.InputStream getInputStream(com.github.junrar.rarfile.FileHeader)> ");
				curEvent = '㝾';
				com.github.junrar.rarfile.FileHeader arg0 = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getInputStream(arg0);
				curEvent = null;

			} else if (nextCall.equals('䎁')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void <init>(com.github.junrar.VolumeManager)> ");
				curEvent = '䎁';
				com.github.junrar.Archive ret = null;
				//com.github.junrar.VolumeManager arg0 = (com.github.junrar.VolumeManager) getVarValue(pickInVar(nextCall, "arg0"));
				//if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				//ret = new com.github.junrar.Archive(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㢆')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean hasSalt()> ");
				curEvent = '㢆';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasSalt();
				curEvent = null;

			} else if (nextCall.equals('㾇')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isEncrypted()> ");
				curEvent = '㾇';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('㞈')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.rarfile.MainHeader getMainHeader()> ");
				curEvent = '㞈';
				com.github.junrar.rarfile.MainHeader ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMainHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䲑')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isLargeBlock()> ");
				curEvent = '䲑';
				boolean ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isLargeBlock();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㞓')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.NewSubHeaderType: boolean byteEquals(byte[])> ");
				curEvent = '㞓';
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.rarfile.NewSubHeaderType cls = (com.github.junrar.rarfile.NewSubHeaderType) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.byteEquals(arg0);
				curEvent = null;

			} else if (nextCall.equals('䢖')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getPackSize()> ");
				curEvent = '䢖';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPackSize();
				curEvent = null;

			} else if (nextCall.equals('䖘')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getDataSize()> ");
				curEvent = '䖘';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getDataSize();
				curEvent = null;

			} else if (nextCall.equals('䎚')) {
				if (debug) System.out.println("Calling <com.github.junrar.unpack.ComprDataIO: void <init>(com.github.junrar.Archive)> ");
				curEvent = '䎚';
				com.github.junrar.unpack.ComprDataIO ret;
				com.github.junrar.Archive arg0 = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.unpack.ComprDataIO(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚜')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isFileHeader()> ");
				curEvent = '㚜';
				boolean ret;
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.isFileHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䖟')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.UnrarCallback getUnrarCallback()> ");
				curEvent = '䖟';
				com.github.junrar.UnrarCallback ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getUnrarCallback();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚡')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isProtected()> ");
				curEvent = '䚡';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isProtected();
				curEvent = null;

			} else if (nextCall.equals('㢢')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void close()> ");
				curEvent = '㢢';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
				curEvent = null;

			} else if (nextCall.equals('䖩')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> ");
				curEvent = '䖩';
				com.github.junrar.io.SeekableReadOnlyByteChannel ret;
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getChannel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚫')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.UnrarHeadertype: byte getHeaderByte()> ");
				curEvent = '㚫';
				com.github.junrar.rarfile.UnrarHeadertype cls = (com.github.junrar.rarfile.UnrarHeadertype) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeaderByte();
				curEvent = null;

			} else if (nextCall.equals('㪭')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isNewNumbering()> ");
				curEvent = '㪭';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isNewNumbering();
				curEvent = null;

			} else if (nextCall.equals('㮮')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.SubBlockHeader: com.github.junrar.rarfile.SubBlockHeaderType getSubType()> ");
				curEvent = '㮮';
				com.github.junrar.rarfile.SubBlockHeaderType ret;
				com.github.junrar.rarfile.SubBlockHeader cls = (com.github.junrar.rarfile.SubBlockHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getSubType();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䂱')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getCTime()> ");
				curEvent = '䂱';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getCTime();
				curEvent = null;

			} else if (nextCall.equals('䪷')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean <com.github.junrar.Archive: java.util.List getFileHeaders()>_ITERABLE_hasNext(java.util.Iterator)> ");
				curEvent = '䪷';
				boolean ret;
				java.util.Iterator arg0 = (java.util.Iterator) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = arg0.hasNext();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㾸')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.SubBlockHeaderType: boolean equals(short)> ");
				curEvent = '㾸';
				boolean ret;
				short arg0 = (short) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.rarfile.SubBlockHeaderType cls = (com.github.junrar.rarfile.SubBlockHeaderType) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.equals(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䚾')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: long getLength()> ");
				curEvent = '䚾';
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLength();
				curEvent = null;

			} else if (nextCall.equals('㣆')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getUnpSize()> ");
				curEvent = '㣆';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUnpSize();
				curEvent = null;

			} else if (nextCall.equals('䗇')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BlockHeader: long getPackSize()> ");
				curEvent = '䗇';
				com.github.junrar.rarfile.BlockHeader cls = (com.github.junrar.rarfile.BlockHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPackSize();
				curEvent = null;

			} else if (nextCall.equals('㫈')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.rarfile.FileHeader nextFileHeader()> ");
				curEvent = '㫈';
				com.github.junrar.rarfile.FileHeader ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.nextFileHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㓊')) {
				if (debug) System.out.println("Calling <com.github.junrar.io.Raw: short readShortLittleEndian(byte[],int)> ");
				curEvent = '㓊';
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.github.junrar.io.Raw.readShortLittleEndian(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('㫊')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.UnrarHeadertype: void <init>(java.lang.String,int,byte)> ");
				curEvent = '㫊';
				com.github.junrar.rarfile.UnrarHeadertype ret = null;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				byte arg2 = (byte) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				//ret = new com.github.junrar.rarfile.UnrarHeadertype(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋎')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void <init>(com.github.junrar.volume.VolumeManager,com.github.junrar.UnrarCallback,java.lang.String)> ");
				curEvent = '䋎';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䫏')) {
				if (debug) System.out.println("Calling <com.github.junrar.io.SeekableReadOnlyByteChannel: long getPosition()> ");
				curEvent = '䫏';
				com.github.junrar.io.SeekableReadOnlyByteChannel cls = (com.github.junrar.io.SeekableReadOnlyByteChannel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPosition();
				curEvent = null;

			} else if (nextCall.equals('㧐')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: short getHeaderSize(boolean)> ");
				curEvent = '㧐';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䇐')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isSubBlock()> ");
				curEvent = '䇐';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSubBlock();
				curEvent = null;

			} else if (nextCall.equals('䧑')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.util.Date getATime()> ");
				curEvent = '䧑';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getATime();
				curEvent = null;

			} else if (nextCall.equals('䛕')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: byte getEncryptVersion()> ");
				curEvent = '䛕';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getEncryptVersion();
				curEvent = null;

			} else if (nextCall.equals('䇕')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.SubBlockHeaderType: void <init>(java.lang.String,int,short)> ");
				curEvent = '䇕';
				com.github.junrar.rarfile.SubBlockHeaderType ret = null;
				java.lang.String arg0 = (java.lang.String) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				short arg2 = (short) getVarValue(pickInVar(nextCall, "arg2"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg2") + ") => " + arg2);
				//ret = new com.github.junrar.rarfile.SubBlockHeaderType(arg0,arg1,arg2);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䏛')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: byte getUnpMethod()> ");
				curEvent = '䏛';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getUnpMethod();
				curEvent = null;

			} else if (nextCall.equals('㯠')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.InputStreamVolume: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> ");
				curEvent = '㯠';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('䏠')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> ");
				curEvent = '䏠';
				com.github.junrar.io.SeekableReadOnlyByteChannel ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getChannel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㯡')) {
				if (debug) System.out.println("Calling <com.github.junrar.UnrarCallback: void volumeProgressChanged(long,long)> ");
				curEvent = '㯡';
				long arg0 = (long) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				long arg1 = (long) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.github.junrar.UnrarCallback cls = (com.github.junrar.UnrarCallback) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.volumeProgressChanged(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('䃢')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: com.github.junrar.Archive getArchive()> ");
				curEvent = '䃢';
				com.github.junrar.Archive ret;
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getArchive();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䳢')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: short getHeaderPaddingSize()> ");
				curEvent = '䳢';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㿣')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.HostSystem: boolean equals(byte)> ");
				curEvent = '㿣';
				boolean ret;
				byte arg0 = (byte) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.rarfile.HostSystem cls = (com.github.junrar.rarfile.HostSystem) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.equals(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䋧')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: long getFullUnpackSize()> ");
				curEvent = '䋧';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFullUnpackSize();
				curEvent = null;

			} else if (nextCall.equals('䏫')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.SubBlockHeader: void print()> ");
				curEvent = '䏫';
				com.github.junrar.rarfile.SubBlockHeader cls = (com.github.junrar.rarfile.SubBlockHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('㛭')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.SubBlockHeader: byte getLevel()> ");
				curEvent = '㛭';
				com.github.junrar.rarfile.SubBlockHeader cls = (com.github.junrar.rarfile.SubBlockHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLevel();
				curEvent = null;

			} else if (nextCall.equals('㳭')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void readHeaders(long)> ");
				curEvent = '㳭';
				long arg0 = (long) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				//cls.readHeaders(arg0);
				curEvent = null;

			} else if (nextCall.equals('䣱')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: long getPositionInFile()> ");
				curEvent = '䣱';
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPositionInFile();
				curEvent = null;

			} else if (nextCall.equals('䳶')) {
				if (debug) System.out.println("Calling <com.github.junrar.exception.RarException: void <init>(java.lang.Throwable)> ");
				curEvent = '䳶';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㣷')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isPasswordProtected()> ");
				curEvent = '㣷';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPasswordProtected();
				curEvent = null;

			} else if (nextCall.equals('㳷')) {
				if (debug) System.out.println("Calling <com.github.junrar.exception.RarException: void <init>()> ");
				curEvent = '㳷';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㳸')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void <init>(java.io.File)> ");
				curEvent = '㳸';
				com.github.junrar.Archive ret;
				java.io.File arg0 = (java.io.File) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.Archive(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䓸')) {
				if (debug) System.out.println("Calling <com.github.junrar.io.Raw: int readIntLittleEndian(byte[],int)> ");
				curEvent = '䓸';
				byte[] arg0 = (byte[]) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				int arg1 = (int) getVarValue(pickInVar(nextCall, "arg1"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg1") + ") => " + arg1);
				com.github.junrar.io.Raw.readIntLittleEndian(arg0,arg1);
				curEvent = null;

			} else if (nextCall.equals('䣹')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: boolean hasArchiveDataCRC()> ");
				curEvent = '䣹';
				boolean ret;
				com.github.junrar.rarfile.BaseBlock cls = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.hasArchiveDataCRC();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䗻')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.InputStreamVolume: int getPosition()> ");
				curEvent = '䗻';
				//new java.io.IOException();
				curEvent = null;

			} else if (nextCall.equals('㧾')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isMultiVolume()> ");
				curEvent = '㧾';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isMultiVolume();
				curEvent = null;

			} else if (nextCall.equals('䏾')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: void <init>(com.github.junrar.rarfile.BaseBlock)> ");
				curEvent = '䏾';
				com.github.junrar.rarfile.BaseBlock ret;
				com.github.junrar.rarfile.BaseBlock arg0 = (com.github.junrar.rarfile.BaseBlock) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.rarfile.BaseBlock(arg0);
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

			if (cond.equals('㔂')) {
				curEvent = '㔂';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.FileHeader nextFileHeader()> */
				com.github.junrar.rarfile.FileHeader v_100_ = (com.github.junrar.rarfile.FileHeader) getVarValue(getOutVar('㫈', "ret"));
				satisfies = (v_100_ == null);
				curEvent = null;

			} else if (cond.equals('䌅')) {
				curEvent = '䌅';
				/* <com.github.junrar.rarfile.FileHeader: boolean isEncrypted()> */
				boolean v_24_ = (boolean) getVarValue(getOutVar('㥗', "ret"));
				satisfies = (v_24_ == false);
				curEvent = null;

			} else if (cond.equals('䔉')) {
				curEvent = '䔉';
				/* <com.github.junrar.rarfile.BaseBlock: boolean hasArchiveDataCRC()> */
				boolean v_89_ = (boolean) getVarValue(getOutVar('䣹', "ret"));
				satisfies = (Not(v_89_ == false));
				curEvent = null;

			} else if (cond.equals('㬕')) {
				curEvent = '㬕';
				/* <com.github.junrar.rarfile.HostSystem: boolean equals(byte)> */
				boolean v_92_ = (boolean) getVarValue(getOutVar('㿣', "ret"));
				satisfies = (Not(v_92_ == false));
				curEvent = null;

			} else if (cond.equals('㐚')) {
				curEvent = '㐚';
				/* <com.github.junrar.Archive: boolean isEncrypted()> */
				boolean v_12_ = (boolean) getVarValue(getOutVar('㵊', "ret"));
				satisfies = (v_12_ == false);
				curEvent = null;

			} else if (cond.equals('㤜')) {
				curEvent = '㤜';
				/* <com.github.junrar.rarfile.UnrarHeadertype: boolean equals(byte)> */
				boolean v_8_ = (boolean) getVarValue(getOutVar('䬌', "ret"));
				satisfies = (v_8_ == false);
				curEvent = null;

			} else if (cond.equals('䬞')) {
				curEvent = '䬞';
				/* <com.github.junrar.rarfile.FileNameDecoder: int getChar(byte[],int)> */
				int v_78_ = (int) getVarValue(getOutVar('䁐', "ret"));
				satisfies = (2 + v_78_ <= 0);
				curEvent = null;

			} else if (cond.equals('㨮')) {
				curEvent = '㨮';
				/* <com.github.junrar.Archive: com.github.junrar.volume.Volume getVolume()> */
				com.github.junrar.volume.Volume v_114_ = (com.github.junrar.volume.Volume) getVarValue(getOutVar('䔶', "ret"));
				satisfies = (v_114_ == null);
				curEvent = null;

			} else if (cond.equals('䴯')) {
				curEvent = '䴯';
				/* <com.github.junrar.Archive: boolean <com.github.junrar.Archive: java.util.List getFileHeaders()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_142_ = (boolean) getVarValue(getOutVar('䪷', "ret"));
				satisfies = (Not(v_142_ == false));
				curEvent = null;

			} else if (cond.equals('䰷')) {
				curEvent = '䰷';
				/* <com.github.junrar.rarfile.BaseBlock: short getFlags()> */
				short v_44_ = (short) getVarValue(getOutVar('䵋', "ret"));
				satisfies = (v_44_ == 6689);
				curEvent = null;

			} else if (cond.equals('䠸')) {
				curEvent = '䠸';
				/* <com.github.junrar.Archive: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> */
				com.github.junrar.io.SeekableReadOnlyByteChannel v_32_ = (com.github.junrar.io.SeekableReadOnlyByteChannel) getVarValue(getOutVar('䏠', "ret"));
				satisfies = (Not(v_32_ == null));
				curEvent = null;

			} else if (cond.equals('䴼')) {
				curEvent = '䴼';
				/* <com.github.junrar.rarfile.BaseBlock: boolean hasEncryptVersion()> */
				boolean v_33_ = (boolean) getVarValue(getOutVar('䕗', "ret"));
				satisfies = (v_33_ == false);
				curEvent = null;

			} else if (cond.equals('䜽')) {
				curEvent = '䜽';
				/* <com.github.junrar.Archive: boolean <com.github.junrar.Archive: java.util.List getFileHeaders()>_ITERABLE_hasNext(java.util.Iterator)> */
				boolean v_142_ = (boolean) getVarValue(getOutVar('䪷', "ret"));
				satisfies = (v_142_ == false);
				curEvent = null;

			} else if (cond.equals('㑂')) {
				curEvent = '㑂';
				/* <com.github.junrar.rarfile.FileNameDecoder: int getChar(byte[],int)> */
				int v_78_ = (int) getVarValue(getOutVar('䁐', "ret"));
				satisfies = (Not(2 + Extract(6, 0, v_78_) <= 0));
				curEvent = null;

			} else if (cond.equals('䉎')) {
				curEvent = '䉎';
				/* <com.github.junrar.rarfile.FileHeader: boolean isFileHeader()> */
				boolean v_130_ = (boolean) getVarValue(getOutVar('㚜', "ret"));
				satisfies = (Not(v_130_ == false));
				curEvent = null;

			} else if (cond.equals('㡒')) {
				curEvent = '㡒';
				/* <com.github.junrar.rarfile.FileNameDecoder: int getChar(byte[],int)> */
				int v_78_ = (int) getVarValue(getOutVar('䁐', "ret"));
				satisfies = (Not(Extract(7, 7, v_78_) == 0));
				curEvent = null;

			} else if (cond.equals('䉛')) {
				curEvent = '䉛';
				/* <com.github.junrar.rarfile.FileNameDecoder: int getChar(byte[],int)> */
				int v_78_ = (int) getVarValue(getOutVar('䁐', "ret"));
				satisfies = (2 + Extract(6, 0, v_78_) <= 0);
				curEvent = null;

			} else if (cond.equals('䥛')) {
				curEvent = '䥛';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.MainHeader getMainHeader()> */
				com.github.junrar.rarfile.MainHeader v_0_ = (com.github.junrar.rarfile.MainHeader) getVarValue(getOutVar('㞈', "ret"));
				satisfies = (v_0_ == null);
				curEvent = null;

			} else if (cond.equals('䥠')) {
				curEvent = '䥠';
				/* <com.github.junrar.rarfile.BaseBlock: boolean hasVolumeNumber()> */
				boolean v_108_ = (boolean) getVarValue(getOutVar('䤯', "ret"));
				satisfies = (v_108_ == false);
				curEvent = null;

			} else if (cond.equals('䉨')) {
				curEvent = '䉨';
				/* <com.github.junrar.rarfile.BaseBlock: boolean hasVolumeNumber()> */
				boolean v_108_ = (boolean) getVarValue(getOutVar('䤯', "ret"));
				satisfies = (Not(v_108_ == false));
				curEvent = null;

			} else if (cond.equals('㝩')) {
				curEvent = '㝩';
				/* <com.github.junrar.Archive: com.github.junrar.volume.Volume getVolume()> */
				com.github.junrar.volume.Volume v_114_ = (com.github.junrar.volume.Volume) getVarValue(getOutVar('䔶', "ret"));
				satisfies = (Not(v_114_ == null));
				curEvent = null;

			} else if (cond.equals('㑲')) {
				curEvent = '㑲';
				/* <com.github.junrar.rarfile.FileHeader: boolean isDirectory()> */
				boolean v_53_ = (boolean) getVarValue(getOutVar('㘨', "ret"));
				satisfies = (v_53_ == false);
				curEvent = null;

			} else if (cond.equals('䑾')) {
				curEvent = '䑾';
				/* <com.github.junrar.rarfile.FileHeader: boolean isUnicode()> */
				boolean v_123_ = (boolean) getVarValue(getOutVar('㼗', "ret"));
				satisfies = (Not(v_123_ == false));
				curEvent = null;

			} else if (cond.equals('㺌')) {
				curEvent = '㺌';
				/* <com.github.junrar.rarfile.HostSystem: boolean equals(byte)> */
				boolean v_92_ = (boolean) getVarValue(getOutVar('㿣', "ret"));
				satisfies = (v_92_ == false);
				curEvent = null;

			} else if (cond.equals('䞍')) {
				curEvent = '䞍';
				/* <com.github.junrar.rarfile.BaseBlock: short getHeadCRC()> */
				short v_103_ = (short) getVarValue(getOutVar('㕀', "ret"));
				satisfies = (Not(v_103_ == 24914));
				curEvent = null;

			} else if (cond.equals('㚔')) {
				curEvent = '㚔';
				/* <com.github.junrar.rarfile.FileNameDecoder: int getChar(byte[],int)> */
				int v_78_ = (int) getVarValue(getOutVar('䁐', "ret"));
				satisfies = (Not(2 + v_78_ <= 0));
				curEvent = null;

			} else if (cond.equals('㺖')) {
				curEvent = '㺖';
				/* <com.github.junrar.rarfile.FileHeader: boolean isLargeBlock()> */
				boolean v_68_ = (boolean) getVarValue(getOutVar('䲑', "ret"));
				satisfies = (Not(v_68_ == false));
				curEvent = null;

			} else if (cond.equals('㪗')) {
				curEvent = '㪗';
				/* <com.github.junrar.rarfile.SubBlockHeaderType: boolean equals(short)> */
				boolean v_96_ = (boolean) getVarValue(getOutVar('㾸', "ret"));
				satisfies = (v_96_ == false);
				curEvent = null;

			} else if (cond.equals('㶜')) {
				curEvent = '㶜';
				/* <com.github.junrar.rarfile.FileHeader: boolean isFileHeader()> */
				boolean v_130_ = (boolean) getVarValue(getOutVar('㚜', "ret"));
				satisfies = (v_130_ == false);
				curEvent = null;

			} else if (cond.equals('㾢')) {
				curEvent = '㾢';
				/* <com.github.junrar.rarfile.FileHeader: boolean isLargeBlock()> */
				boolean v_68_ = (boolean) getVarValue(getOutVar('䲑', "ret"));
				satisfies = (v_68_ == false);
				curEvent = null;

			} else if (cond.equals('䂣')) {
				curEvent = '䂣';
				/* <com.github.junrar.rarfile.BaseBlock: short getFlags()> */
				short v_44_ = (short) getVarValue(getOutVar('䵋', "ret"));
				satisfies = (Not(v_44_ == 6689));
				curEvent = null;

			} else if (cond.equals('䆣')) {
				curEvent = '䆣';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.MainHeader getMainHeader()> */
				com.github.junrar.rarfile.MainHeader v_0_ = (com.github.junrar.rarfile.MainHeader) getVarValue(getOutVar('㞈', "ret"));
				satisfies = (Not(v_0_ == null));
				curEvent = null;

			} else if (cond.equals('㲦')) {
				curEvent = '㲦';
				/* <com.github.junrar.rarfile.FileHeader: boolean isEncrypted()> */
				boolean v_24_ = (boolean) getVarValue(getOutVar('㥗', "ret"));
				satisfies = (Not(v_24_ == false));
				curEvent = null;

			} else if (cond.equals('㢩')) {
				curEvent = '㢩';
				/* <com.github.junrar.Archive: com.github.junrar.rarfile.FileHeader nextFileHeader()> */
				com.github.junrar.rarfile.FileHeader v_100_ = (com.github.junrar.rarfile.FileHeader) getVarValue(getOutVar('㫈', "ret"));
				satisfies = (Not(v_100_ == null));
				curEvent = null;

			} else if (cond.equals('䦳')) {
				curEvent = '䦳';
				/* <com.github.junrar.rarfile.FileHeader: boolean isDirectory()> */
				boolean v_53_ = (boolean) getVarValue(getOutVar('㘨', "ret"));
				satisfies = (Not(v_53_ == false));
				curEvent = null;

			} else if (cond.equals('䒶')) {
				curEvent = '䒶';
				/* <com.github.junrar.rarfile.BaseBlock: boolean hasArchiveDataCRC()> */
				boolean v_89_ = (boolean) getVarValue(getOutVar('䣹', "ret"));
				satisfies = (v_89_ == false);
				curEvent = null;

			} else if (cond.equals('䆶')) {
				curEvent = '䆶';
				/* <com.github.junrar.Archive: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> */
				com.github.junrar.io.SeekableReadOnlyByteChannel v_32_ = (com.github.junrar.io.SeekableReadOnlyByteChannel) getVarValue(getOutVar('䏠', "ret"));
				satisfies = (v_32_ == null);
				curEvent = null;

			} else if (cond.equals('㾹')) {
				curEvent = '㾹';
				/* <com.github.junrar.Archive: boolean isEncrypted()> */
				boolean v_12_ = (boolean) getVarValue(getOutVar('㵊', "ret"));
				satisfies = (Not(v_12_ == false));
				curEvent = null;

			} else if (cond.equals('䧂')) {
				curEvent = '䧂';
				/* <com.github.junrar.rarfile.FileHeader: boolean isUnicode()> */
				boolean v_123_ = (boolean) getVarValue(getOutVar('㼗', "ret"));
				satisfies = (v_123_ == false);
				curEvent = null;

			} else if (cond.equals('䟌')) {
				curEvent = '䟌';
				/* <com.github.junrar.rarfile.FileNameDecoder: int getChar(byte[],int)> */
				int v_78_ = (int) getVarValue(getOutVar('䁐', "ret"));
				satisfies = (Extract(7, 7, v_78_) == 0);
				curEvent = null;

			} else if (cond.equals('䇍')) {
				curEvent = '䇍';
				/* <com.github.junrar.rarfile.UnrarHeadertype: boolean equals(byte)> */
				boolean v_8_ = (boolean) getVarValue(getOutVar('䬌', "ret"));
				satisfies = (Not(v_8_ == false));
				curEvent = null;

			} else if (cond.equals('㷓')) {
				curEvent = '㷓';
				/* <com.github.junrar.rarfile.BaseBlock: short getHeadCRC()> */
				short v_103_ = (short) getVarValue(getOutVar('㕀', "ret"));
				satisfies = (v_103_ == 24914);
				curEvent = null;

			} else if (cond.equals('䛞')) {
				curEvent = '䛞';
				/* <com.github.junrar.rarfile.BaseBlock: boolean hasEncryptVersion()> */
				boolean v_33_ = (boolean) getVarValue(getOutVar('䕗', "ret"));
				satisfies = (Not(v_33_ == false));
				curEvent = null;

			} else if (cond.equals('䇷')) {
				curEvent = '䇷';
				/* <com.github.junrar.rarfile.SubBlockHeaderType: boolean equals(short)> */
				boolean v_96_ = (boolean) getVarValue(getOutVar('㾸', "ret"));
				satisfies = (Not(v_96_ == false));
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
