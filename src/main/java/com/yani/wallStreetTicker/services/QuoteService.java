package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import util.StockURLBuilder;
import util.URLBuilder;

public class QuoteService {
	public void read(ArrayList<String> stockTickers) {
		try {
			// This should be moved to a configuration file later 
			URLBuilder builder = new StockURLBuilder("https://api.robinhood.com/quotes/");
			URL url = new URL(builder.build(stockTickers));
			URLConnection con = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
