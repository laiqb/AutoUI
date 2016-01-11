package com.bfm.test.bondinstr;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.bfm.db.bean.TsysUser;
import com.bfm.db.bean.TsysUserHome;
import com.bfm.dict.Dict;
import com.bfm.http.bean.BondInstrHttpVO;
import com.bfm.http.bean.LoginHttpVO;
import com.bfm.http.bean.TestDatas;
import com.bfm.request.bondInstruction.BondbdsInstrService;
import com.bfm.request.login.LoginService;
import com.bfm.request.logout.LogOutService;
import com.bfm.test.assertResult.AssertBondInstr;
import com.bfm.util.Result;
import com.bfm.util.StringUtil;
import com.bfm.util.XmlUtil;

public class TC_BondInstr_Success {
	private static final Log log = LogFactory.getLog(TC_BondInstr_Success.class);
	private String userTD = "TD_BondInstr_user.xml";
	private String bondInstrTD = "TD_BondInstr_1.xml";
	private String testData = "datas.xml";
	private static String userId = null; 
	private String cookie = null;
	private LoginHttpVO login = null;
	private BondInstrHttpVO bondInstr = null;
	
	@BeforeTest
	public void setUp(){
		//确认用户在数据库中存在，且该用户是未登陆的
		log.info("TC_BondInstr_Success case setup");
		String testDatapath = this.getClass().getResource("").getPath().toString();
//		login = (LoginHttpVO)XmlUtil.xmlTobean(testDatapath + userTD, Dict.loginVOPath);
//		bondInstr = (BondInstrHttpVO)XmlUtil.xmlTobean(testDatapath + bondInstrTD, Dict.bondInstrVOPath);
		login = ((TestDatas)XmlUtil.xmlTobean(testDatapath + testData, Dict.httpVOPath)).getLogin().get(0);
		bondInstr = ((TestDatas)XmlUtil.xmlTobean(testDatapath + testData, Dict.httpVOPath)).getBondInstr().get(0);
		userId = login.getLoginName();
		TsysUser tsysUser = (new TsysUserHome()).findById(userId);
		
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
	public void bondInstrSuccess() throws Exception{
		log.info(this.getClass().getName() + " case is testing");
		String daily_instruction_no = null;
		Result rs = LoginService.login(login);
		cookie = rs.getCookie();
		Assert.assertTrue(Dict.HTTP_RE_OK == rs.getStatusCode());
		//检测登陆后，用户登陆标志位是否有更新；
		Assert.assertEquals("1", (new TsysUserHome()).findById(userId).getLockStatus());
		//债券指令发起
		Result rs2 = BondbdsInstrService.service(cookie, bondInstr);
		
		Assert.assertTrue(Dict.HTTP_RE_OK == rs2.getStatusCode());
		daily_instruction_no = StringUtil.getDailyInstructionNo(rs2.getHttpEntity());
		System.out.println(daily_instruction_no);
		Assert.assertTrue(AssertBondInstr.assertBondInstr(bondInstr,daily_instruction_no));
		log.info(this.getClass().getName() + " case is tested");
	}
	
	@AfterTest
	public void tearDown() throws ClientProtocolException, IOException{
		log.info(this.getClass().getName() + " case is over");
		LogOutService.logOut(cookie);
	}
}
