package com.bfm.test.login;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.bfm.db.bean.TsysUser;
import com.bfm.db.bean.TsysUserHome;
import com.bfm.dict.Dict;
import com.bfm.http.bean.LoginHttpVO;
import com.bfm.request.login.LoginService;
import com.bfm.util.*;

/*
 * 用户登陆失败，用户名正确，密码错误；
 */
public class TC_Login_Failed {
	private static final Log log = LogFactory.getLog(TC_Login_Failed.class);
	private String userId = "admin";
	
	@BeforeTest
	public void setUp(){
		//确认admin在数据库中存在，且该用户是未登陆的
		log.info("LoginFailedTest case setup");
		TsysUserHome tsysUserDao = null;
		TsysUser tsysUser = null;
		tsysUserDao =  new TsysUserHome();
		tsysUser = tsysUserDao.findById(userId);
		
		if(tsysUser == null){
			log.error(userId + " 是不存在的");
			Assert.fail(this.getClass().getName() + " 执行失败");
		}
	}

	@Test
	public void loginFailTest() throws Exception{
		log.info("LoginFailedTest case is testing");
		String testDatapath =  this.getClass().getResource("").getPath().toString() + "TD_Login_Faild.xml";
		LoginHttpVO login = (LoginHttpVO)XmlUtil.xmlTobean(testDatapath, Dict.loginVOPath);
		Result rs = LoginService.login(login);
		Assert.assertTrue(rs.getHeaders().toString().contains("errorNo=BIZ1605"));
		Assert.assertTrue(Dict.HTTP_RE_REDIRECT == rs.getStatusCode());
		log.info("LoginFailedTest case is tested");
	}
	
	@AfterTest
	public void tearDown(){
		log.info("LoginFailedTest cas tearDown");
	}
}
