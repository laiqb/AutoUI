package com.bfm.test.login;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.*;
import com.bfm.db.bean.TsysUser;
import com.bfm.db.bean.TsysUserHome;
import com.bfm.dict.Dict;
import com.bfm.http.bean.LoginHttpVO;
import com.bfm.request.login.LoginService;
import com.bfm.request.logout.LogOutService;
import com.bfm.util.Result;
import com.bfm.util.XmlUtil;

public class TC_Login_Second_Success {
	private static final Log log = LogFactory.getLog(TC_Login_First_Success.class);
	private static String userId = null; 
	private String cookie = null;
	private LoginHttpVO login = null;
	
	@BeforeTest
	public void setUp(){
		//admin用户登陆
		log.info("LoginFailedTest case setup");
		String testDatapath = this.getClass().getResource("").getPath().toString() + "TD_Login_First_Success.xml";
		login = (LoginHttpVO)XmlUtil.xmlTobean(testDatapath, Dict.loginVOPath);
		userId = login.getLoginName();
		TsysUserHome tsysUserDao = null;
		TsysUser tsysUser = null;
		tsysUserDao =  new TsysUserHome();
		tsysUser = tsysUserDao.findById(userId);
		
		if(tsysUser == null){
			log.error(userId + " 不存在");
			Assert.fail(this.getClass().getName() + " 用户不存在");
		}
		else if("1".equals(tsysUser.getLockStatus())){
			log.error(userId + " 已登录");
			Assert.fail(this.getClass().getName() + " 正在使用该用户");
		}
	}
	
	@Test
	public void loginSecondSuccessTest() throws Exception{
		log.info(this.getClass().getName() + " case is testing");
		//登陆
		log.info("登陆");
		Result rs1 = LoginService.login(login);
		cookie = rs1.getCookie();
		Assert.assertTrue(Dict.HTTP_RE_OK == rs1.getStatusCode());
		//验证
		Assert.assertEquals("1", (new TsysUserHome()).findById(userId).getLockStatus());
		//验证
		Result rs2 = LoginService.login(login);
		Assert.assertTrue(Dict.HTTP_RE_REDIRECT == rs2.getStatusCode());
		Assert.assertTrue(rs2.getHeaders().toString().contains("errorNo=BIZ1692"));
		Assert.assertEquals("1", (new TsysUserHome()).findById(userId).getLockStatus());
		log.info(this.getClass().getName() + " case is tested");
	}
	
	@AfterTest
	public void tearDown() throws ClientProtocolException, IOException{
		LogOutService.logOut(cookie);
	}
}
