package com.bfm.request.bondInstruction;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.ClientProtocolException;
import com.bfm.dict.Dict;
import com.bfm.http.bean.BondInstrHttpVO;
import com.bfm.util.DefaultHeaders;
import com.bfm.util.Result;
import com.bfm.util.SendRequest;
/*
 * 债券指令发起接口
 */
public class BondbdsInstrService{

	public static Result service(String cookie, Object obj) throws ClientProtocolException, IOException {
		Map<String,String> parameters  = setParameters((BondInstrHttpVO)obj);
		Result rs = SendRequest.sendPost(Dict.url+Dict.bondbsdInstrService, DefaultHeaders.getDefaultHeaders(cookie), parameters,"utf-8");
		return rs;
	}
	
	private static Map<String, String> setParameters(BondInstrHttpVO instr){
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("jsonType",instr.getJsonType());
		headers.put("stockCode",instr.getStockCode());
		headers.put("tradeType",instr.getTradeType());  
		headers.put("priceLimitType",instr.getPriceLimitType()); 
		headers.put("dealSplit",instr.getDealSplit());  
		headers.put("fundNo",instr.getFundNo()); 
		headers.put("combiNo",instr.getCombiNo()); 
		headers.put("investType",instr.getInvestType()); 
		headers.put("entrustDirection",instr.getEntrustDirection()); 
		headers.put("settleSpeed",instr.getSettleSpeed()); 
		headers.put("beginDate",instr.getBeginDate());  
		headers.put("dealDate",instr.getDealDate()); 
		headers.put("resCode",instr.getResCode()); 
		headers.put("opCode",instr.getOpCode()); 
		headers.put("effectRange",instr.getEffectRange()); 
		headers.put("stockName",instr.getStockName());  
		headers.put("price",instr.getPrice().toString()); 
		headers.put("profitRatio",instr.getProfitRatio()); 
		headers.put("optionFirstMatureYield",instr.getOptionFirstMatureYield()); 
		headers.put("totalPrice",instr.getTotalPrice()); 
		headers.put("amount",instr.getAmount()); 
		headers.put("netBalance",instr.getNetBalance()); 
		headers.put("interestTotal",instr.getInterestTotal()); 
		headers.put("totalBalance",instr.getTotalBalance());
		headers.put("rivalName",instr.getRivalName());  
		headers.put("settleType",instr.getSettleType()); 
		headers.put("rivalNo",instr.getRivalNo());
		headers.put("summary",instr.getSummary()); 
		headers.put("gyj",instr.getGyj()); 
		headers.put("yieldMaturity",instr.getYieldMaturity()); 
		headers.put("priceDeviateDegree",instr.getPriceDeviateDegree()); 
		headers.put("maturityDeviateDegree",instr.getMaturityDeviateDegree()); 
		headers.put("interest",instr.getInterest()); 
		headers.put("payInterestType",instr.getPayInterestType()); 
		headers.put("interestType",instr.getInterestType()); 
		headers.put("payInteval",instr.getPayInteval()); 
		headers.put("availableDays",instr.getAvailableDays()); 
		headers.put("yearRate",instr.getYearRate()); 
		headers.put("basicRate",instr.getBasicRate());  
		headers.put("basicRateType",instr.getBasicRateType()); 
		headers.put("bondAppraise",instr.getBondAppraise()); 
		headers.put("maturity",instr.getMaturity()); 
		headers.put("maturityAdjust",instr.getMaturityAdjust()); 
		headers.put("convexity",instr.getConvexity());  
		headers.put("optionType",instr.getOptionType()); 
		headers.put("bondAllEnableAmount",instr.getBondAllEnableAmount()); 
		headers.put("t0EnableAmount",instr.getT0EnableAmount()); 
		headers.put("t1EnableAmount",instr.getT1EnableAmount()); 
		headers.put("stockType",instr.getStockType());  
		headers.put("mainAppraise",instr.getMainAppraise()); 
		headers.put("bookMarket",instr.getBookMarket()); 
		headers.put("existLimit",instr.getExistLimit()); 
		headers.put("nextPayDate",instr.getNextPayDate()); 
		headers.put("intervalDays",instr.getIntervalDays()); 
		headers.put("sysDate",instr.getSysDate()); 
		headers.put("marketNo",instr.getMarketNo()); 
		headers.put("interCode",instr.getInterCode());  
		headers.put("businClass",instr.getBusinClass());
		headers.put("tempInstructionNo",instr.getTempInstructionNo()); 
		headers.put("virtualBusinNo",instr.getVirtualBusinNo()); 
		return headers;
	}
}
