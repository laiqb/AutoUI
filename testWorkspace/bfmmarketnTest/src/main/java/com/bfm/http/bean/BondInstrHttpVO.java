package com.bfm.http.bean;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * 债券指令发起
 */
@SuppressWarnings("restriction")
@XmlRootElement
public class BondInstrHttpVO {
	private String jsonType;
	private String stockCode;
	private String tradeType;
	private String priceLimitType;
	private String dealSplit;
	private String fundNo;
	private String combiNo;
	private String investType;
	private String entrustDirection;
	private String settleSpeed;
	private String beginDate;
	private String dealDate;
	private String resCode;
	private String opCode;
	private String effectRange;
	private String stockName;
	private String price;
	private String profitRatio;
	private String optionFirstMatureYield;
	private String totalPrice;
	private String amount;
	private String netBalance;
	private String interestTotal;
	private String totalBalance;
	private String rivalName;
	private String settleType;
	private String rivalNo;
	private String summary;
	private String gyj;
	private String yieldMaturity;
	private String priceDeviateDegree;
	private String maturityDeviateDegree;
	private String interest;
	private String payInterestType;
	private String interestType;
	private String payInteval;
	private String availableDays;
	private String yearRate;
	private String basicRate;
	private String basicRateType;
	private String bondAppraise;
	private String maturity;
	private String maturityAdjust;
	private String convexity;
	private String optionType;
	private String bondAllEnableAmount;
	private String t0EnableAmount;
	private String t1EnableAmount;
	private String stockType;
	private String mainAppraise;
	private String bookMarket;
	private String existLimit;
	private String nextPayDate;
	private String intervalDays;
	private String sysDate;
	private String marketNo;
	private String interCode;
	private String businClass;
	private String tempInstructionNo;
	private String virtualBusinNo;
	/**
	 * @return the jsonType
	 */
	public String getJsonType() {
		return jsonType;
	}
	/**
	 * @param jsonType the jsonType to set
	 */
	public void setJsonType(String jsonType) {
		this.jsonType = jsonType;
	}
	/**
	 * @return the stockCode
	 */
	public String getStockCode() {
		return stockCode;
	}
	/**
	 * @param stockCode the stockCode to set
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return tradeType;
	}
	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	/**
	 * @return the priceLimitType
	 */
	public String getPriceLimitType() {
		return priceLimitType;
	}
	/**
	 * @param priceLimitType the priceLimitType to set
	 */
	public void setPriceLimitType(String priceLimitType) {
		this.priceLimitType = priceLimitType;
	}
	/**
	 * @return the dealSplit
	 */
	public String getDealSplit() {
		return dealSplit;
	}
	/**
	 * @param dealSplit the dealSplit to set
	 */
	public void setDealSplit(String dealSplit) {
		this.dealSplit = dealSplit;
	}
	/**
	 * @return the fundNo
	 */
	public String getFundNo() {
		return fundNo;
	}
	/**
	 * @param fundNo the fundNo to set
	 */
	public void setFundNo(String fundNo) {
		this.fundNo = fundNo;
	}
	/**
	 * @return the combiNo
	 */
	public String getCombiNo() {
		return combiNo;
	}
	/**
	 * @param combiNo the combiNo to set
	 */
	public void setCombiNo(String combiNo) {
		this.combiNo = combiNo;
	}
	/**
	 * @return the investType
	 */
	public String getInvestType() {
		return investType;
	}
	/**
	 * @param investType the investType to set
	 */
	public void setInvestType(String investType) {
		this.investType = investType;
	}
	/**
	 * @return the entrustDirection
	 */
	public String getEntrustDirection() {
		return entrustDirection;
	}
	/**
	 * @param entrustDirection the entrustDirection to set
	 */
	public void setEntrustDirection(String entrustDirection) {
		this.entrustDirection = entrustDirection;
	}
	/**
	 * @return the settleSpeed
	 */
	public String getSettleSpeed() {
		return settleSpeed;
	}
	/**
	 * @param settleSpeed the settleSpeed to set
	 */
	public void setSettleSpeed(String settleSpeed) {
		this.settleSpeed = settleSpeed;
	}
	/**
	 * @return the beginDate
	 */
	public String getBeginDate() {
		return beginDate;
	}
	/**
	 * @param beginDate the beginDate to set
	 */
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	/**
	 * @return the dealDate
	 */
	public String getDealDate() {
		return dealDate;
	}
	/**
	 * @param dealDate the dealDate to set
	 */
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
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
	 * @return the effectRange
	 */
	public String getEffectRange() {
		return effectRange;
	}
	/**
	 * @param effectRange the effectRange to set
	 */
	public void setEffectRange(String effectRange) {
		this.effectRange = effectRange;
	}
	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}
	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the profitRatio
	 */
	public String getProfitRatio() {
		return profitRatio;
	}
	/**
	 * @param profitRatio the profitRatio to set
	 */
	public void setProfitRatio(String profitRatio) {
		this.profitRatio = profitRatio;
	}
	/**
	 * @return the optionFirstMatureYield
	 */
	public String getOptionFirstMatureYield() {
		return optionFirstMatureYield;
	}
	/**
	 * @param optionFirstMatureYield the optionFirstMatureYield to set
	 */
	public void setOptionFirstMatureYield(String optionFirstMatureYield) {
		this.optionFirstMatureYield = optionFirstMatureYield;
	}
	/**
	 * @return the totalPrice
	 */
	public String getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the netBalance
	 */
	public String getNetBalance() {
		return netBalance;
	}
	/**
	 * @param netBalance the netBalance to set
	 */
	public void setNetBalance(String netBalance) {
		this.netBalance = netBalance;
	}
	/**
	 * @return the interestTotal
	 */
	public String getInterestTotal() {
		return interestTotal;
	}
	/**
	 * @param interestTotal the interestTotal to set
	 */
	public void setInterestTotal(String interestTotal) {
		this.interestTotal = interestTotal;
	}
	/**
	 * @return the totalBalance
	 */
	public String getTotalBalance() {
		return totalBalance;
	}
	/**
	 * @param totalBalance the totalBalance to set
	 */
	public void setTotalBalance(String totalBalance) {
		this.totalBalance = totalBalance;
	}
	/**
	 * @return the rivalName
	 */
	public String getRivalName() {
		return rivalName;
	}
	/**
	 * @param rivalName the rivalName to set
	 */
	public void setRivalName(String rivalName) {
		this.rivalName = rivalName;
	}
	/**
	 * @return the settleType
	 */
	public String getSettleType() {
		return settleType;
	}
	/**
	 * @param settleType the settleType to set
	 */
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}
	/**
	 * @return the rivalNo
	 */
	public String getRivalNo() {
		return rivalNo;
	}
	/**
	 * @param rivalNo the rivalNo to set
	 */
	public void setRivalNo(String rivalNo) {
		this.rivalNo = rivalNo;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * @return the gyj
	 */
	public String getGyj() {
		return gyj;
	}
	/**
	 * @param gyj the gyj to set
	 */
	public void setGyj(String gyj) {
		this.gyj = gyj;
	}
	/**
	 * @return the yieldMaturity
	 */
	public String getYieldMaturity() {
		return yieldMaturity;
	}
	/**
	 * @param yieldMaturity the yieldMaturity to set
	 */
	public void setYieldMaturity(String yieldMaturity) {
		this.yieldMaturity = yieldMaturity;
	}
	/**
	 * @return the priceDeviateDegree
	 */
	public String getPriceDeviateDegree() {
		return priceDeviateDegree;
	}
	/**
	 * @param priceDeviateDegree the priceDeviateDegree to set
	 */
	public void setPriceDeviateDegree(String priceDeviateDegree) {
		this.priceDeviateDegree = priceDeviateDegree;
	}
	/**
	 * @return the maturityDeviateDegree
	 */
	public String getMaturityDeviateDegree() {
		return maturityDeviateDegree;
	}
	/**
	 * @param maturityDeviateDegree the maturityDeviateDegree to set
	 */
	public void setMaturityDeviateDegree(String maturityDeviateDegree) {
		this.maturityDeviateDegree = maturityDeviateDegree;
	}
	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}
	/**
	 * @return the payInterestType
	 */
	public String getPayInterestType() {
		return payInterestType;
	}
	/**
	 * @param payInterestType the payInterestType to set
	 */
	public void setPayInterestType(String payInterestType) {
		this.payInterestType = payInterestType;
	}
	/**
	 * @return the interestType
	 */
	public String getInterestType() {
		return interestType;
	}
	/**
	 * @param interestType the interestType to set
	 */
	public void setInterestType(String interestType) {
		this.interestType = interestType;
	}
	/**
	 * @return the payInteval
	 */
	public String getPayInteval() {
		return payInteval;
	}
	/**
	 * @param payInteval the payInteval to set
	 */
	public void setPayInteval(String payInteval) {
		this.payInteval = payInteval;
	}
	/**
	 * @return the availableDays
	 */
	public String getAvailableDays() {
		return availableDays;
	}
	/**
	 * @param availableDays the availableDays to set
	 */
	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}
	/**
	 * @return the yearRate
	 */
	public String getYearRate() {
		return yearRate;
	}
	/**
	 * @param yearRate the yearRate to set
	 */
	public void setYearRate(String yearRate) {
		this.yearRate = yearRate;
	}
	/**
	 * @return the basicRate
	 */
	public String getBasicRate() {
		return basicRate;
	}
	/**
	 * @param basicRate the basicRate to set
	 */
	public void setBasicRate(String basicRate) {
		this.basicRate = basicRate;
	}
	/**
	 * @return the basicRateType
	 */
	public String getBasicRateType() {
		return basicRateType;
	}
	/**
	 * @param basicRateType the basicRateType to set
	 */
	public void setBasicRateType(String basicRateType) {
		this.basicRateType = basicRateType;
	}
	/**
	 * @return the bondAppraise
	 */
	public String getBondAppraise() {
		return bondAppraise;
	}
	/**
	 * @param bondAppraise the bondAppraise to set
	 */
	public void setBondAppraise(String bondAppraise) {
		this.bondAppraise = bondAppraise;
	}
	/**
	 * @return the maturity
	 */
	public String getMaturity() {
		return maturity;
	}
	/**
	 * @param maturity the maturity to set
	 */
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}
	/**
	 * @return the maturityAdjust
	 */
	public String getMaturityAdjust() {
		return maturityAdjust;
	}
	/**
	 * @param maturityAdjust the maturityAdjust to set
	 */
	public void setMaturityAdjust(String maturityAdjust) {
		this.maturityAdjust = maturityAdjust;
	}
	/**
	 * @return the convexity
	 */
	public String getConvexity() {
		return convexity;
	}
	/**
	 * @param convexity the convexity to set
	 */
	public void setConvexity(String convexity) {
		this.convexity = convexity;
	}
	/**
	 * @return the optionType
	 */
	public String getOptionType() {
		return optionType;
	}
	/**
	 * @param optionType the optionType to set
	 */
	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}
	/**
	 * @return the bondAllEnableAmount
	 */
	public String getBondAllEnableAmount() {
		return bondAllEnableAmount;
	}
	/**
	 * @param bondAllEnableAmount the bondAllEnableAmount to set
	 */
	public void setBondAllEnableAmount(String bondAllEnableAmount) {
		this.bondAllEnableAmount = bondAllEnableAmount;
	}
	/**
	 * @return the t0EnableAmount
	 */
	public String getT0EnableAmount() {
		return t0EnableAmount;
	}
	/**
	 * @param t0EnableAmount the t0EnableAmount to set
	 */
	public void setT0EnableAmount(String t0EnableAmount) {
		this.t0EnableAmount = t0EnableAmount;
	}
	public String getT1EnableAmount() {
		return t1EnableAmount;
	}
	public void setT1EnableAmount(String t1EnableAmount) {
		this.t1EnableAmount = t1EnableAmount;
	}
	/**
	 * @return the stockType
	 */
	public String getStockType() {
		return stockType;
	}
	/**
	 * @param stockType the stockType to set
	 */
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}
	/**
	 * @return the mainAppraise
	 */
	public String getMainAppraise() {
		return mainAppraise;
	}
	/**
	 * @param mainAppraise the mainAppraise to set
	 */
	public void setMainAppraise(String mainAppraise) {
		this.mainAppraise = mainAppraise;
	}
	/**
	 * @return the bookMarket
	 */
	public String getBookMarket() {
		return bookMarket;
	}
	/**
	 * @param bookMarket the bookMarket to set
	 */
	public void setBookMarket(String bookMarket) {
		this.bookMarket = bookMarket;
	}
	/**
	 * @return the existLimit
	 */
	public String getExistLimit() {
		return existLimit;
	}
	/**
	 * @param existLimit the existLimit to set
	 */
	public void setExistLimit(String existLimit) {
		this.existLimit = existLimit;
	}
	/**
	 * @return the nextPayDate
	 */
	public String getNextPayDate() {
		return nextPayDate;
	}
	/**
	 * @param nextPayDate the nextPayDate to set
	 */
	public void setNextPayDate(String nextPayDate) {
		this.nextPayDate = nextPayDate;
	}
	/**
	 * @return the intervalDays
	 */
	public String getIntervalDays() {
		return intervalDays;
	}
	/**
	 * @param intervalDays the intervalDays to set
	 */
	public void setIntervalDays(String intervalDays) {
		this.intervalDays = intervalDays;
	}
	/**
	 * @return the sysDate
	 */
	public String getSysDate() {
		return sysDate;
	}
	/**
	 * @param sysDate the sysDate to set
	 */
	public void setSysDate(String sysDate) {
		this.sysDate = sysDate;
	}
	/**
	 * @return the marketNo
	 */
	public String getMarketNo() {
		return marketNo;
	}
	/**
	 * @param marketNo the marketNo to set
	 */
	public void setMarketNo(String marketNo) {
		this.marketNo = marketNo;
	}
	/**
	 * @return the interCode
	 */
	public String getInterCode() {
		return interCode;
	}
	/**
	 * @param interCode the interCode to set
	 */
	public void setInterCode(String interCode) {
		this.interCode = interCode;
	}
	/**
	 * @return the businClass
	 */
	public String getBusinClass() {
		return businClass;
	}
	/**
	 * @param businClass the businClass to set
	 */
	public void setBusinClass(String businClass) {
		this.businClass = businClass;
	}
	/**
	 * @return the tempInstructionNo
	 */
	public String getTempInstructionNo() {
		return tempInstructionNo;
	}
	/**
	 * @param tempInstructionNo the tempInstructionNo to set
	 */
	public void setTempInstructionNo(String tempInstructionNo) {
		this.tempInstructionNo = tempInstructionNo;
	}
	/**
	 * @return the virtualBusinNo
	 */
	public String getVirtualBusinNo() {
		return virtualBusinNo;
	}
	/**
	 * @param virtualBusinNo the virtualBusinNo to set
	 */
	public void setVirtualBusinNo(String virtualBusinNo) {
		this.virtualBusinNo = virtualBusinNo;
	}
}
