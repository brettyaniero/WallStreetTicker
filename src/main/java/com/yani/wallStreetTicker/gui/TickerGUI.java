package gui;

import java.awt.*;
import javax.swing.*;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;

import repositories.QuoteData;
import models.Quote;

import repositories.QuoteData;

public class TickerGUI implements Observer {
	QuoteData quoteData;
	ArrayList<Quote> quotes;

	public TickerGUI() {
		quotes = new ArrayList<Quote>();
		initializeDisplay();
	}

	@Override
	public void update(Observable observable, Object arg) {
		quoteData = (QuoteData) observable;
		quotes = quoteData.getQuotes();
		refreshDisplay();
	}	

	public void initializeDisplay() {
		JFrame frame = new JFrame("Wall Street Ticker");		
		JLabel label = new JLabel("Hello world");

		frame.add(label);
		frame.setLayout(new GridLayout(1, 1));

		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 

	public void refreshDisplay() {

	}
}

