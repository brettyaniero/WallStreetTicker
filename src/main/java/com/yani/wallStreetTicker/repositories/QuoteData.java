package repositories;

import java.util.ArrayList;
import java.util.Observable;

import services.QuoteService;
import models.Quote;

public class QuoteData extends Observable {
	private ArrayList<Quote> quotes;
	private ArrayList<String> stockTickers;
	private QuoteService quoteService;
	
	// This list should be initialized from a file on program startup 
	public QuoteData() {
		quotes = new ArrayList<Quote>();
		stockTickers = new ArrayList<String>();
		quoteService = new QuoteService();
	}
	
	public void refreshData() {
		quotes = quoteService.getQuotes(stockTickers);
		setChanged();
		notifyObservers();
	}

	public ArrayList<Quote> getQuotes() {
		return quotes;
	}
	
	public void addTicker(String ticker) {
		if (!stockTickers.contains(ticker))
			stockTickers.add(ticker);	
	}
	
	public void removeTicker(String ticker) {
		stockTickers.remove(ticker);
	}

	public ArrayList<String> getStockTickers() {
		return stockTickers;	
	}
}
