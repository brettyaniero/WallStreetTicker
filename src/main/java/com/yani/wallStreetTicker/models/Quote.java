package models;

public class Quote {
	private float askPrice;
	private int askSize;
	private float bidPrice;
	private int bidSize;
	private float lastTradePrice;
	private float lastExtendedHoursTradePrice;
	private float previousClose;
	private float adjustedPreviousClose;
	private String previousCloseDate;
	private String symbol;
	private boolean tradingHalted;
	private String updatedAt;
	
	public float getAskPrice() {
		return askPrice;
	}
	
	public void setAskPrice(float askPrice) {
		this.askPrice = askPrice;
	}
	
	public int getAskSize() {
		return askSize;
	}
	
	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}
	
	public float getBidPrice() {
		return bidPrice;
	}
	
	public void setBidPrice(float bidPrice) {
		this.bidPrice = bidPrice;
	}
	
	public int getBidSize() {
		return bidSize;
	}
	
	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}
	
	public float getLastTradePrice() {
		return lastTradePrice;
	}
	
	public void setLastTradePrice(float lastTradePrice) {
		this.lastTradePrice = lastTradePrice;
	}
	
	public float getLastExtendedHoursTradePrice() {
		return lastExtendedHoursTradePrice;
	}
	
	public void setLastExtendedHoursTradePrice(float lastExtendedHoursTradePrice) {
		this.lastExtendedHoursTradePrice = lastExtendedHoursTradePrice;
	}
	
	public float getPreviousClose() {
		return previousClose;
	}
	
	public void setPreviousClose(float previousClose) {
		this.previousClose = previousClose;
	}
	
	public float getAdjustedPreviousClose() {
		return adjustedPreviousClose;
	}
	
	public void setAdjustedPreviousClose(float adjustedPreviousClose) {
		this.adjustedPreviousClose = adjustedPreviousClose;
	}
	
	public String getPreviousCloseDate() {
		return previousCloseDate;
	}
	
	public void setPreviousCloseDate(String previousCloseDate) {
		this.previousCloseDate = previousCloseDate;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public boolean getTradingHalted() {
		return tradingHalted;
	}
	
	public void setTradingHalted(boolean tradingHalted) {
		this.tradingHalted = tradingHalted;
	}
	
	public String getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
}
