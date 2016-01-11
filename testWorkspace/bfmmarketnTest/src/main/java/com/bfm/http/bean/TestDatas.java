package com.bfm.http.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;  
import javax.xml.bind.annotation.XmlAccessorType;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlElementWrapper;  
import javax.xml.bind.annotation.XmlRootElement;  
import javax.xml.bind.annotation.XmlType;  

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "datas")  
@XmlType  
public class TestDatas {
	@XmlElementWrapper(name = "loginHttpVOs")  
	@XmlElement(name = "loginHttpVO")
	private List<LoginHttpVO> login;
	
	@XmlElementWrapper(name = "bondInstrHttpVOs")  
	@XmlElement(name = "bondInstrHttpVO")
	private List<BondInstrHttpVO> bondInstr;

	/**
	 * @return the login
	 */
	public List<LoginHttpVO> getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(List<LoginHttpVO> login) {
		this.login = login;
	}

	/**
	 * @return the bondInstr
	 */
	public List<BondInstrHttpVO> getBondInstr() {
		return bondInstr;
	}

	/**
	 * @param bondInstr the bondInstr to set
	 */
	public void setBondInstr(List<BondInstrHttpVO> bondInstr) {
		this.bondInstr = bondInstr;
	}  
}
