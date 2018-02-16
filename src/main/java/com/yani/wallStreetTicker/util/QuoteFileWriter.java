package util;

import java.util.ArrayList;

import models.Quote;

public class QuoteFileWriter extends FileWriter {
	private ArrayList<String> tickers;

	public QuoteFileWriter(String fileName, ArrayList<String> tickers) {
		super(fileName);
		this.tickers = tickers;
	}

	public int read() {
		return 0;
	}	

	public int write() {
		return 0;
	}
}
