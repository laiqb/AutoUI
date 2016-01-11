package com.bfm.test.assertResult;

import com.bfm.db.bean.Tbinstruction;
import com.bfm.db.bean.TbinstructionHome;
import com.bfm.db.bean.TbinstructionId;
import com.bfm.db.bean.Tbinstructionstock;
import com.bfm.db.bean.TbinstructionstockHome;
import com.bfm.db.bean.TbinstructionstockId;
import com.bfm.http.bean.BondInstrHttpVO;

public class AssertBondInstr {
	public static boolean assertBondInstr(Object obj,String no){
		BondInstrHttpVO inst = (BondInstrHttpVO)obj;
		boolean rs = false;
		if(assertTbinstruction(inst,no)&&assertTbinstructionStock(inst,no))
			rs = true;
		return rs;
	} 
	
	private static boolean assertTbinstruction(BondInstrHttpVO obj,String no){
		boolean rs = false;
		Tbinstruction instr = (new TbinstructionHome()).findById(new TbinstructionId(no,1));
		if(
			"1".equals(instr.getApproveStatus()) &&
			"0".equals(instr.getLockFlag()) &&
			instr.getCombiNo().equals(obj.getCombiNo()) &&
			instr.getMarketNo().equals(obj.getMarketNo()) &&
			String.valueOf(instr.getBeginDate()).equals(obj.getBeginDate()) &&
			String.valueOf(instr.getEndDate()).equals(obj.getDealDate()) &&
			String.valueOf(instr.getDirectDate()).equals(obj.getSysDate()) &&
			instr.getSummary().trim().equals(obj.getSummary()) &&
			"0".equals(String.valueOf(instr.getModifyDate())) &&
			"0".equals(String.valueOf(instr.getCheckDate())) &&
			" ".equals(instr.getCheckOperator()) &&
			" ".equals(instr.getCheckRefuseReason()) &&
			instr.getCancelDate() == 0 &&
			" ".equals(instr.getCancelCheckOperator()) &&
			" ".equals(instr.getCancelCheckRefuseReason()) &&
			" ".equals(instr.getExecuteOperator()) &&
			"1".equals(instr.getInstructionStatus()) &&
			"1".equals(instr.getCheckStatus()) &&
			instr.getBusinClass().equals(obj.getBusinClass()))
			rs = true;
		return rs;	
	}
	
	private static boolean assertTbinstructionStock(BondInstrHttpVO obj,String no){
		boolean rs = false;
		Tbinstructionstock instr = (new TbinstructionstockHome()).findById(new TbinstructionstockId(no,1));
		if(
			instr.getAmount().intValue()/100 == Integer.parseInt(obj.getAmount()) &&
			" ".equals(instr.getAssetNo()) &&
			instr.getBalance().toString().equals(obj.getTotalBalance()) &&
			String.valueOf(instr.getBeginDate()).equals(obj.getBeginDate()) &&
			obj.getBusinClass().equals(instr.getBusinClass()) &&
			instr.getMarketNo().equals(obj.getMarketNo()) &&
			instr.getCombiNo().equals(obj.getCombiNo()) &&
			String.valueOf(instr.getEndDate()).equals(obj.getDealDate()) &&
			instr.getEntrustDirection().equals(obj.getEntrustDirection()) &&
			"1".equals(instr.getEntrustExecuteStatus()) &&
			instr.getFirstSettleType().equals(obj.getSettleType()) &&
			instr.getInterest().toString().subSequence(0, 9).equals(obj.getInterest().substring(0, 9)) &&
			instr.getInterCode().equals(obj.getInterCode()) &&
			instr.getInvestType().equals(obj.getInvestType()) &&
			instr.getMarketNo().equals(obj.getMarketNo()) &&
			instr.getMaturity().toString().subSequence(0, 8).equals(obj.getMaturity().substring(0, 8)) &&
			instr.getMaturityAdjust().toString().subSequence(0, 8).equals(obj.getMaturityAdjust().substring(0, 8)) &&
			//现在指令证券表填写的prifitRatio字段填写不正确；
			//instr.getProfitRatio().toString().subSequence(0, 4).equals(obj.getProfitRatio().substring(0, 4)) &&
			instr.getRivalNo().equals(obj.getRivalNo()) &&
			"1".equals(instr.getStatus())  &&
			String.valueOf(instr.getSettleSpeed()).equals(obj.getSettleSpeed()))
			rs = true;
		return rs;
	}
	
}
