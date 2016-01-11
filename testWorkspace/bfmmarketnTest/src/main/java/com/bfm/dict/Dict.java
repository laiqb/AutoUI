package com.bfm.dict;

//系统中基本的参数
public class Dict {
	
	//HTTP 返回报文 正常状态
	public final static int HTTP_RE_OK = 200;
	
	//HTTP 返回报文 重定位状态
	public final static int HTTP_RE_REDIRECT = 302;
	
	public final static String host = "192.168.54.66:7001";
	public final static String url = "http://192.168.54.66:7001/bfmcpv20";
	
	//登陆接口地址
	public final static String loginService = "/bizframe.framework._signIn.service";
	//注销接口地址
	public final static String logoutService = "/bizframe.framework._signOut.service";
	//债券指令发起接口地址
	public final static String bondbsdInstrService = "/bfm.bondbiz.bondbsd.BondbsdInstr.service";
	
	//http bean 对应的路径
	public final static String httpVOPath = "com.bfm.http.bean.TestDatas";
	//登陆接口请求类
	public final static String loginVOPath = "com.bfm.http.bean.LoginHttpVO";
	//债券指令发起接口请求类
	public final static String bondInstrVOPath = "com.bfm.http.bean.BondInstrHttpVO";
	
	
}
