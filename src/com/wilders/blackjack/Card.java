package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {

	private String color; // diamond, heart, spade, cross
	private String type; // 2..10, J, Q, K, Ace

	private int value; // 1...11
	private boolean visibility;

	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	private void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public boolean isAce() {
		return this.getType().equals("Ace");
	}

	private Card(String color, String type, int value, boolean visibility) {
		super();
		this.color = color;
		this.type = type;
		this.value = value;
		this.visibility = visibility;
	}

	public static List<Card> initDeck() {

		List<Card> deck = new ArrayList<>();
		// mit Karten füllen und mischen
		// diamond "\u2666"
		// heart "\u2665"
		// spade "\u2660"
		// cross "\u2663"
		for (int i = 2; i <= 10; i++) {
			deck.add(new Card("\u2666", Integer.toString(i), i, false));
			deck.add(new Card("\u2665", Integer.toString(i), i, false));
			deck.add(new Card("\u2660", Integer.toString(i), i, false));
			deck.add(new Card("\u2663", Integer.toString(i), i, false));
			
		}
		deck.add(new Card("\u2666", "J", 10, false));
		deck.add(new Card("\u2666", "Q", 10, false));
		deck.add(new Card("\u2666", "K", 10, false));
		deck.add(new Card("\u2666", "Ace", 11, false));
				
		deck.add(new Card("\u2665", "J", 10, false));
		deck.add(new Card("\u2665", "Q", 10, false));
		deck.add(new Card("\u2665", "K", 10, false));
		deck.add(new Card("\u2665", "Ace", 11, false));
		
		deck.add(new Card("\u2660", "J", 10, false));
		deck.add(new Card("\u2660", "Q", 10, false));
		deck.add(new Card("\u2660", "K", 10, false));
		deck.add(new Card("\u2660", "Ace", 11, false));
						
		deck.add(new Card("\u2663", "J", 10, false));
		deck.add(new Card("\u2663", "Q", 10, false));
		deck.add(new Card("\u2663", "K", 10, false));
		deck.add(new Card("\u2663", "Ace", 11, false));

		//mix
		Collections.shuffle(deck);
				
		return deck;

	}

}
