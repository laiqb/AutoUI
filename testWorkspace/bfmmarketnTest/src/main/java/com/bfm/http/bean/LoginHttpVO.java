package com.bfm.http.bean;


import javax.xml.bind.annotation.XmlRootElement;  
/*
 * 该类用于封装请求报文中的参数
 * 1.请求报字段与请求测试xml字段必须对应上
 */
@SuppressWarnings("restriction")
@XmlRootElement
public class LoginHttpVO {
	private String loginName;
	private String password;
	private String opCode;
	private String resCode;
	private String forceLoginFlag;
	
	public LoginHttpVO(String loginName, String password, String opCode,
			String resCode, String forceLoginFlag) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.opCode = opCode;
		this.resCode = resCode;
		this.forceLoginFlag = forceLoginFlag;
	}
	
	
	public LoginHttpVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the userName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the opCode
	 */
	public String getOpCode() {
		return opCode;
	}
	/**
	 * @param opCode the opCode to set
	 */
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}
	/**
	 * @return the resCode
	 */
	public String getResCode() {
		return resCode;
	}
	/**
	 * @param resCode the resCode to set
	 */
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	/**
	 * @return the forceLoginFlag
	 */
	public String getForceLoginFlag() {
		return forceLoginFlag;
	}
	/**
	 * @param forceLoginFlag the forceLoginFlag to set
	 */
	public void setForceLoginFlag(String forceLoginFlag) {
		this.forceLoginFlag = forceLoginFlag;
	}
}
