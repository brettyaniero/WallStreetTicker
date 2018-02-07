package util;

import java.util.ArrayList;
import javax.json.JsonObject;
import javax.json.JsonArray;

import models.Quote;

public class QuoteResponseParser implements ResponseParser {
	public ArrayList<Quote> parseResponse(JsonObject jsonObject) {
		JsonArray results = jsonObject.getJsonArray("results");
		ArrayList<Quote> quotes = new ArrayList<Quote>();
		
		for (JsonObject result : results.getValuesAs(JsonObject.class)) {
			Quote quote = new Quote();
			quote.setAskPrice(Float.parseFloat(result.getString("ask_price")));
			quote.setAskSize(result.getInt("ask_size"));
			quote.setBidPrice(Float.parseFloat(result.getString("bid_price")));
			quote.setBidSize(result.getInt("bid_size"));
			quote.setLastTradePrice(Float.parseFloat(result.getString("last_trade_price")));
			quote.setLastExtendedHoursTradePrice(Float.parseFloat(result.getString("last_extended_hours_trade_price")));
			quote.setPreviousClose(Float.parseFloat(result.getString("previous_close")));
			quote.setAdjustedPreviousClose(Float.parseFloat(result.getString("adjusted_previous_close")));
			quote.setPreviousCloseDate(result.getString("previous_close_date"));
			quote.setSymbol(result.getString("symbol"));
			quote.setTradingHalted(result.getBoolean("trading_halted"));
			quote.setUpdatedAt(result.getString("updated_at"));
			quotes.add(quote);
		}
		
		return quotes;
	}	
}
