package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Gamer {

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
		System.out.print("Deine Hand: ");
		for (Card card : this.getHand()) {
			System.out.print(card.getColor() + " " + card.getType() + " | ");
		}
		System.out.println();
		System.out.println("Gesamtwert (verloren wenn >21): " + this.getVisibleValue());
	}
	
	private int getVisibleValue() {
		// To be done
		return 0;
	}
	
	abstract int logic(List<Card> deck);

}
