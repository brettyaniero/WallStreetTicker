package util;

import java.util.TimerTask;
import repositories.QuoteData;

public class MarketTimer extends TimerTask {
	QuoteData subject;

	public MarketTimer(QuoteData subject) {
		this.subject = subject;
	}

	public void run() {
		subject.refreshData();
		System.out.println("reached");
	}
}
