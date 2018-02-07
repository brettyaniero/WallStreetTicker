package services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;

import util.StockURLBuilder;
import util.URLBuilder;
import util.ResponseParser;
import util.QuoteResponseParser;
import models.Quote;

public class QuoteService {
	public ArrayList<Quote> getQuotes(ArrayList<String> stockTickers) {
		try {
			// This should be moved to a configuration file later 
			URLBuilder builder = new StockURLBuilder("https://api.robinhood.com/quotes/");
			URL url = new URL(builder.build(stockTickers));
			InputStream is = url.openStream();
			JsonReader rdr = Json.createReader(is);
	          	JsonObject obj = rdr.readObject();
			ResponseParser responseParser = new QuoteResponseParser();
			ArrayList<Quote> quotes = responseParser.parseResponse(obj);

			return quotes;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
