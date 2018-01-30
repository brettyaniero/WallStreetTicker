package repositories;

import java.util.ArrayList;
import java.util.Observable;

public class QuoteData extends Observable {
	private ArrayList<String> stockTickers;
	
	// This list should be initialized from a file on program startup 
	public QuoteData(ArrayList<String> stockTickers) {
		this.stockTickers = stockTickers;
	}
	
	public void refreshData() {
		notifyObservers();
	}
	
	public void addTicker(String ticker) {
		if (!stockTickers.contains(ticker))
			stockTickers.add(ticker);	
	}
	
	public void removeTicker(String ticker) {
		stockTickers.remove(ticker);
	}
}
