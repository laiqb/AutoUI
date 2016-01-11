package com.bfm.request.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.ClientProtocolException;
import com.bfm.dict.Dict;
import com.bfm.http.bean.LoginHttpVO;
import com.bfm.util.Result;
import com.bfm.util.SendRequest;
/*
 * 	登陆Http服务请求
 */
public class LoginService {
	public static Result login(LoginHttpVO login) throws ClientProtocolException, IOException {
		Map<String,String> parameters = new HashMap<String,String>();
		parameters.put("password", login.getPassword());
		parameters.put("loginName", login.getLoginName());
		parameters.put("opCode", login.getOpCode());
		parameters.put("resCode", login.getResCode());
		parameters.put("forcedLoginFlag",login.getForceLoginFlag());
		Result rs = SendRequest.sendPost(Dict.url+Dict.loginService, null, parameters,"utf-8");
		return rs;
	}
}
