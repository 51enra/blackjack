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
		int totalValule = 0;
		for (Card card : hand) {
			totalValule = totalValule + card.getValue();
		}

		return totalValule;
	}

	public void cleanHand() {
		this.getHand().clear();
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
		int visibleValue = 0;
		for (Card card : hand) {
			if (card.isVisibility()) {
				visibleValue = visibleValue + card.getValue();
			}
		}

		return visibleValue;
	}

	abstract int initialDraw(List<Card> deck);
	
	abstract int draw(List<Card> deck);

}
