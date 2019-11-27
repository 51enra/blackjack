package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {

	private List<Card> hand = new ArrayList<>();

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getTotalValue() {
		// To be done
		return 0;
	}
	
	public void cleanHand() {
		// To be done
	}
	
	public void showHand() {
		// To be done
	}
	
	private int getVisibleValue() {
		// To be done
		return 0;
	}
}
