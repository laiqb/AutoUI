package com.bfm.request.logout;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

import com.bfm.dict.Dict;
import com.bfm.util.DefaultHeaders;
import com.bfm.util.Result;
import com.bfm.util.SendRequest;

public class LogOutService {
	public static Result logOut(String cookie) throws ClientProtocolException, IOException {
		Map<String,String> headers = DefaultHeaders.getDefaultHeaders(cookie);
		Map<String,String> parameters = new HashMap<String,String>();
		parameters.put("opCode", "bizSignOut");
		parameters.put("resCode", "bizSign");
		Result rs = SendRequest.sendGet(Dict.url+Dict.logoutService, headers, parameters,"utf-8");
		return rs;
	}
}
