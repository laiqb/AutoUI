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

public class test {
	private static final Log log = LogFactory.getLog(test.class);
	private String datas = "datas.xml";
	private TestDatas tdata = null;

	@BeforeTest
	public void setUp(){
		//确认用户在数据库中存在，且该用户是未登陆的
		log.info("TC_BondInstr_Success case setup");
		String testDatapath = this.getClass().getResource("").getPath().toString();
		tdata = (TestDatas)XmlUtil.xmlTobean(testDatapath + datas, "com.bfm.http.bean.TestDatas");
		System.out.println(tdata);
		System.out.println("This is Org");
	}
	
	@Test
	public void bondInstrSuccess() throws Exception{
	
	}
	
	@AfterTest
	public void tearDown() throws ClientProtocolException, IOException{
		log.info(this.getClass().getName() + " case is over");
	}
}
