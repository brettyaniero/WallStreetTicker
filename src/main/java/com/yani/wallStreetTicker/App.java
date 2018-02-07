package com.yani.wallStreetTicker;

import java.util.ArrayList;
import java.util.Timer;

import models.Quote;
import services.QuoteService;
import repositories.QuoteData;
import util.MarketTimer;

public class App 
{
    public static void main( String[] args )
    {
	    QuoteService qs = new QuoteService();
	    ArrayList<String> tickers = new ArrayList<String>();
	    QuoteData data = new QuoteData();
	    data.addTicker("F");
	    Timer timer = new Timer();
	    timer.schedule(new MarketTimer(data), 0, 5000);
    }
}
