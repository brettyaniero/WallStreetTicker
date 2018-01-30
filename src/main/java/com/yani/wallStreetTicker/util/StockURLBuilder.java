package util;

import java.util.ArrayList;

public class StockURLBuilder implements URLBuilder {
	private String baseURL;
	
	public StockURLBuilder(String baseURL) {
		this.baseURL = baseURL;
	}
	
	@Override
	public String build(ArrayList<String> stockTickers) {
		baseURL = baseURL + "?symbols=";
		
		for (int i = 0; i < stockTickers.size() - 1; i++) {
			baseURL = baseURL + stockTickers.get(i) + ",";
		}
		
		// The last entry in the string should not have a comma after it
		baseURL = baseURL + stockTickers.get(stockTickers.size() - 1);
		
		return baseURL;
	}
}
