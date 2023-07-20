package com.fuzz;

//import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.lang.StackTraceElement;

public class ExpCollector {

	//public static HashMap<int, StackTraceElement[]> crashes = null;
	public static HashSet<Integer> crashSigs = null;

	public static int computeStackTraceHashNaive(StackTraceElement[] trace) {
		return Arrays.hashCode(trace);
	}

//	public static int computeStackTraceHashAnother(StackTraceElement[] trace) {
//	  List<Object> components = new ArrayList<>();
//
//	  for (StackTraceElement el : trace) {
//	    if (includeElement(el)) { // decide whether we're including this element
//	      components.add(el.getClassName());
//	      components.add(el.getMethodName());
//	    }
//	  }
//
//	  return components.hashCode();
//	}

	public static String[] quickSkips = {
		"XXXXXXXXX",
	};

	public static byte[] rawData = null;
	public static long cfNO = 0;
	public static long dfNO = 0;

	public static void setCFNO(long _cfNO) {
		cfNO = _cfNO;
	}

	public static byte[] recordAndPrepareInputs(long _cfNO, long _dfNO, com.code_intelligence.jazzer.api.FuzzedDataProvider data) {
		rawData = data.consumeRemainingAsBytes();
		cfNO = _cfNO;
		dfNO = _dfNO;

		return rawData;
	}

	public static void addNewCrash(Throwable t) {
		if (crashSigs == null) {
			crashSigs = new HashSet<>();
		}

		StackTraceElement[] trace = t.getStackTrace();
		int hash = computeStackTraceHashNaive(trace);

		String crashBrief = t.toString();
		for(int i = 0; i <= quickSkips.length - 1; i++) {
			if (crashBrief.startsWith(quickSkips[i])) {
				// if starts with quick skip strings, not see it as a crash
				return;
			}
		}

		if (! crashSigs.contains(hash)) {
			// if it is a new crash
			// 1. add to crashSigs
			crashSigs.add(hash);

			// 2. dump to a file (append)
			String detail = String.valueOf(System.currentTimeMillis()/1000) + " CRASH " + String.valueOf(hash) + " " + crashBrief + "\n";
			int levels = trace.length;
			if (levels > 20) {
				levels = 20;
			}
			for (int i = 0; i < levels; i++) {
				detail = detail + trace[i].toString() + "\n";
			}
			detail = detail + "SPLITLINE-SPLITLINE \n";

			try {
				Files.write(Paths.get("./caught_throwables.txt"), detail.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);

				String reproFile = "./repro_exp_" + String.valueOf(hash);
				byte[] cdfBs = new byte[] { (byte)dfNO, (byte)(dfNO >>> 8), (byte)(dfNO >>> 16), (byte)(dfNO >>> 24), (byte)cfNO, (byte)(cfNO >>> 8), (byte)(cfNO >>> 16), (byte)(cfNO >>> 24), };
				Files.write(Paths.get(reproFile), rawData, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
				Files.write(Paths.get(reproFile), cdfBs, StandardOpenOption.APPEND);

			} catch (Throwable newt) {
				newt.printStackTrace();
				throw new RuntimeException("catched throwable " + newt + " when record new crash");
			}
		}
	}

	public static byte[] recordAndPrepareInputsNotRubick(com.code_intelligence.jazzer.api.FuzzedDataProvider data) {
		rawData = data.consumeRemainingAsBytes();
		return rawData;
	}

	public static void addNewCrashNotRubick(Throwable t) {
		if (crashSigs == null) {
			crashSigs = new HashSet<>();
		}

		StackTraceElement[] trace = t.getStackTrace();
		int hash = computeStackTraceHashNaive(trace);

		String crashBrief = t.toString();
		for(int i = 0; i <= quickSkips.length - 1; i++) {
			if (crashBrief.startsWith(quickSkips[i])) {
				// if starts with quick skip strings, not see it as a crash
				return;
			}
		}

		if (! crashSigs.contains(hash)) {
			// if it is a new crash
			// 1. add to crashSigs
			crashSigs.add(hash);

			// 2. dump to a file (append)
			String detail = String.valueOf(System.currentTimeMillis()/1000) + " CRASH " + String.valueOf(hash) + " " + crashBrief + "\n";
			int levels = trace.length;
			if (levels > 20) {
				levels = 20;
			}
			for (int i = 0; i < levels; i++) {
				detail = detail + trace[i].toString() + "\n";
			}
			detail = detail + "SPLITLINE-SPLITLINE \n";

			try {
				Files.write(Paths.get("./caught_throwables.txt"), detail.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);

				String reproFile = "./repro_exp_" + String.valueOf(hash);
				Files.write(Paths.get(reproFile), rawData, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);

			} catch (Throwable newt) {
				newt.printStackTrace();
				throw new RuntimeException("catched throwable " + newt + " when record new crash");
			}
		}
	}

}