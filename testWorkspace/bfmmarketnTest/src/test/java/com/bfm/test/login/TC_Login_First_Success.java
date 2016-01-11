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
import com.bfm.util.*;
/*
 * 用户首次登陆，登陆成功案例
 */
public class TC_Login_First_Success {
	private static final Log log = LogFactory.getLog(TC_Login_First_Success.class);
	private static String userId = null; 
	private String cookie = null;
	private LoginHttpVO login = null;
	
	@BeforeTest
	public void setUp(){
		//确认admin在数据库中存在，且该用户是未登陆的
		log.info("LoginFailedTest case setup");
		String testDatapath = this.getClass().getResource("").getPath().toString() + "TD_Login_First_Success.xml";
		login = (LoginHttpVO)XmlUtil.xmlTobean(testDatapath, Dict.loginVOPath);
		userId = login.getLoginName();
		TsysUserHome tsysUserDao = null;
		TsysUser tsysUser = null;
		tsysUserDao =  new TsysUserHome();
		tsysUser = tsysUserDao.findById(userId);
		
		if(tsysUser == null){
			log.error(userId + " 是不存在的");
			Assert.fail(this.getClass().getName() + " 执行失败");
		}
		else if("1".equals(tsysUser.getLockStatus())){
			log.error(userId + " 是正在被使用");
			Assert.fail(this.getClass().getName() + " 执行失败");
		}
	}
	
	@Test
	public void loginSuccessTest() throws Exception{
		log.info(this.getClass().getName() + " case is testing");
		Result rs = LoginService.login(login);
		cookie = rs.getCookie();
		Assert.assertTrue(Dict.HTTP_RE_OK == rs.getStatusCode());
		//检测登陆后，用户登陆标志位是否有更新；
		Assert.assertEquals("1", (new TsysUserHome()).findById(userId).getLockStatus());
		log.info(this.getClass().getName() + " case is tested");
	}
	
	@AfterTest
	public void tearDown() throws ClientProtocolException, IOException{
		log.info(this.getClass().getName() + " case is over");
		LogOutService.logOut(cookie);
	}
}
