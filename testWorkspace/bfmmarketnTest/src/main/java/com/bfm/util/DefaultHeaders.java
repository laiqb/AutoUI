package com.bfm.util;

import java.util.HashMap;
import java.util.Map;

import com.bfm.dict.Dict;

/*
 * 封装headers其中包括cookies
 */
public class DefaultHeaders {

	public static Map<String,String> getDefaultHeaders(String cookie){
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("Referer", Dict.url);
		headers.put("Host", Dict.host);
		headers.put("Cookie",cookie);
		return headers;
	}
}
