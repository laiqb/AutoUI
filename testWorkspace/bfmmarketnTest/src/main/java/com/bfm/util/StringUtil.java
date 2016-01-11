package com.bfm.util;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	public static String getDailyInstructionNo(String entity){
		String dailyInstructionNo = null;
		dailyInstructionNo = StringUtils.substringBetween(entity, "\"DailyInstructionNo\":\"", "\",\"ErrorNo\":\"0000\"");
		return dailyInstructionNo;
	}
}
