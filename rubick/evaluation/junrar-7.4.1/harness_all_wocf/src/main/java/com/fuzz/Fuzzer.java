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

			if (nextCall.equals('䐀')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isProtected()> ");
				curEvent = '䐀';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isProtected();
				curEvent = null;

			} else if (nextCall.equals('䡀')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.volume.Volume getVolume()> ");
				curEvent = '䡀';
				com.github.junrar.volume.Volume ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getVolume();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㷀')) {
				if (debug) System.out.println("Calling <com.github.junrar.unpack.decode.Decode: void <init>()> ");
				curEvent = '㷀';
				com.github.junrar.unpack.decode.Decode ret;
				ret = new com.github.junrar.unpack.decode.Decode();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㤂')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isPasswordProtected()> ");
				curEvent = '㤂';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isPasswordProtected();
				curEvent = null;

			} else if (nextCall.equals('㣃')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isEncrypted()> ");
				curEvent = '㣃';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('䟃')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.rarfile.MainHeader getMainHeader()> ");
				curEvent = '䟃';
				com.github.junrar.rarfile.MainHeader ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getMainHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䦅')) {
				if (debug) System.out.println("Calling <com.github.junrar.unpack.vm.BitInput: void <init>()> ");
				curEvent = '䦅';
				com.github.junrar.unpack.vm.BitInput ret;
				ret = new com.github.junrar.unpack.vm.BitInput();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䜆')) {
				if (debug) System.out.println("Calling <com.github.junrar.unpack.decode.AudioVariables: void <init>()> ");
				curEvent = '䜆';
				com.github.junrar.unpack.decode.AudioVariables ret;
				ret = new com.github.junrar.unpack.decode.AudioVariables();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㕈')) {
				if (debug) System.out.println("Calling <com.github.junrar.io.SeekableReadOnlyByteChannel: long getPosition()> ");
				curEvent = '㕈';
				com.github.junrar.io.SeekableReadOnlyByteChannel cls = (com.github.junrar.io.SeekableReadOnlyByteChannel) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPosition();
				curEvent = null;

			} else if (nextCall.equals('㸈')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: boolean isDirectory()> ");
				curEvent = '㸈';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isDirectory();
				curEvent = null;

			} else if (nextCall.equals('䘉')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isFirstVolume()> ");
				curEvent = '䘉';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isFirstVolume();
				curEvent = null;

			} else if (nextCall.equals('䃊')) {
				if (debug) System.out.println("Calling <com.github.junrar.unpack.vm.VMPreparedOperand: void <init>()> ");
				curEvent = '䃊';
				com.github.junrar.unpack.vm.VMPreparedOperand ret;
				ret = new com.github.junrar.unpack.vm.VMPreparedOperand();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㙍')) {
				if (debug) System.out.println("Calling <com.github.junrar.exception.RarException: void <init>()> ");
				curEvent = '㙍';
				com.github.junrar.exception.RarException ret;
				ret = new com.github.junrar.exception.RarException();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㣐')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isLocked()> ");
				curEvent = '㣐';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isLocked();
				curEvent = null;

			} else if (nextCall.equals('㺑')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.rarfile.FileHeader nextFileHeader()> ");
				curEvent = '㺑';
				com.github.junrar.rarfile.FileHeader ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.nextFileHeader();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㹕')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.lang.String getPassword()> ");
				curEvent = '㹕';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPassword();
				curEvent = null;

			} else if (nextCall.equals('䌕')) {
				if (debug) System.out.println("Calling <com.github.junrar.unpack.vm.VMPreparedProgram: void <init>()> ");
				curEvent = '䌕';
				com.github.junrar.unpack.vm.VMPreparedProgram ret;
				ret = new com.github.junrar.unpack.vm.VMPreparedProgram();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䛗')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isSolid()> ");
				curEvent = '䛗';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isSolid();
				curEvent = null;

			} else if (nextCall.equals('㔙')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isEncrypted()> ");
				curEvent = '㔙';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('䙚')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: com.github.junrar.Archive getArchive()> ");
				curEvent = '䙚';
				com.github.junrar.Archive ret;
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getArchive();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㐛')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isOldFormat()> ");
				curEvent = '㐛';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isOldFormat();
				curEvent = null;

			} else if (nextCall.equals('䍜')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void <init>(java.io.InputStream)> ");
				curEvent = '䍜';
				com.github.junrar.Archive ret;
				java.io.InputStream arg0 = (java.io.InputStream) getVarValue(pickInVar(nextCall, "arg0"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "arg0") + ") => " + arg0);
				ret = new com.github.junrar.Archive(arg0);
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㳝')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.UnrarCallback getUnrarCallback()> ");
				curEvent = '㳝';
				com.github.junrar.UnrarCallback ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getUnrarCallback();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㮞')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: long getLength()> ");
				curEvent = '㮞';
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getLength();
				curEvent = null;

			} else if (nextCall.equals('㩤')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isNewNumbering()> ");
				curEvent = '㩤';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isNewNumbering();
				curEvent = null;

			} else if (nextCall.equals('㘥')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: void print()> ");
				curEvent = '㘥';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.print();
				curEvent = null;

			} else if (nextCall.equals('䓩')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.util.List getFileHeaders()> ");
				curEvent = '䓩';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileHeaders();
				curEvent = null;

			} else if (nextCall.equals('㨩')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean hasArchCmt()> ");
				curEvent = '㨩';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.hasArchCmt();
				curEvent = null;

			} else if (nextCall.equals('䶯')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: short getHighPosAv()> ");
				curEvent = '䶯';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHighPosAv();
				curEvent = null;

			} else if (nextCall.equals('㴰')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: byte getEncryptVersion()> ");
				curEvent = '㴰';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getEncryptVersion();
				curEvent = null;

			} else if (nextCall.equals('㘲')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.BaseBlock: void <init>()> ");
				curEvent = '㘲';
				com.github.junrar.rarfile.BaseBlock ret;
				ret = new com.github.junrar.rarfile.BaseBlock();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('䔵')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isAV()> ");
				curEvent = '䔵';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isAV();
				curEvent = null;

			} else if (nextCall.equals('㹵')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.FileHeader: java.lang.String getFileNameString()> ");
				curEvent = '㹵';
				com.github.junrar.rarfile.FileHeader cls = (com.github.junrar.rarfile.FileHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getFileNameString();
				curEvent = null;

			} else if (nextCall.equals('㐶')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: boolean isEncrypted()> ");
				curEvent = '㐶';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isEncrypted();
				curEvent = null;

			} else if (nextCall.equals('㯶')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.volume.VolumeManager getVolumeManager()> ");
				curEvent = '㯶';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getVolumeManager();
				curEvent = null;

			} else if (nextCall.equals('䴷')) {
				if (debug) System.out.println("Calling <com.github.junrar.volume.Volume: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> ");
				curEvent = '䴷';
				com.github.junrar.io.SeekableReadOnlyByteChannel ret;
				com.github.junrar.volume.Volume cls = (com.github.junrar.volume.Volume) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getChannel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㾷')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: java.util.List getHeaders()> ");
				curEvent = '㾷';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getHeaders();
				curEvent = null;

			} else if (nextCall.equals('䃹')) {
				if (debug) System.out.println("Calling <com.github.junrar.exception.BadRarArchiveException: void <init>()> ");
				curEvent = '䃹';
				//new com.github.junrar.exception.BadRarArchiveException();
				curEvent = null;

			} else if (nextCall.equals('䌹')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: boolean isMultiVolume()> ");
				curEvent = '䌹';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.isMultiVolume();
				curEvent = null;

			} else if (nextCall.equals('㚺')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: com.github.junrar.io.SeekableReadOnlyByteChannel getChannel()> ");
				curEvent = '㚺';
				com.github.junrar.io.SeekableReadOnlyByteChannel ret;
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				ret = cls.getChannel();
				vars.put(getOutVar(nextCall, "ret"), ret);
				if (debug) System.out.println(nextCall + ": vars.put(" + getOutVar(nextCall, "ret") + ", " + ret + ");");
				curEvent = null;

			} else if (nextCall.equals('㚻')) {
				if (debug) System.out.println("Calling <com.github.junrar.rarfile.MainHeader: int getPosAv()> ");
				curEvent = '㚻';
				com.github.junrar.rarfile.MainHeader cls = (com.github.junrar.rarfile.MainHeader) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.getPosAv();
				curEvent = null;

			} else if (nextCall.equals('㺽')) {
				if (debug) System.out.println("Calling <com.github.junrar.Archive: void close()> ");
				curEvent = '㺽';
				com.github.junrar.Archive cls = (com.github.junrar.Archive) getVarValue(pickInVar(nextCall, "cls"));
				if (debug) System.out.println(nextCall + ": getVarValue(" + pickInVar(nextCall, "cls") + ") => " + cls);
				cls.close();
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
	t.printStackTrace(); throw new RuntimeException("catched throwable " + t + " during the execution");
}
*/
