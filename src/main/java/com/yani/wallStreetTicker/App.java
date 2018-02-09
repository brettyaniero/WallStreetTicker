package com.yani.wallStreetTicker;

import java.util.ArrayList;
import java.util.Timer;

import models.Quote;
import services.QuoteService;
import repositories.QuoteData;
import util.MarketTimer;
import util.QuoteFileWriter;

public class App 
{
    public static void main( String[] args )
    {
	    QuoteService qs = new QuoteService();
	    ArrayList<String> tickers = new ArrayList<String>();
	    // QuoteData data = new QuoteData();
	    // data.addTicker("F");
	    // Timer timer = new Timer();
	    // timer.schedule(new MarketTimer(data), 0, 5000);
	    QuoteFileWriter writer = new QuoteFileWriter("example.txt");
	    writer.create();
    }
}
