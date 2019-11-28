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

	public int getVisibleValue() {
		int visibleValue = 0;
		for (Card card : hand) {
			if (card.isVisibility()) {
				visibleValue = visibleValue + card.getValue();
			}
		}

		return visibleValue;
	}

	abstract int draw(List<Card> deck, boolean firstDraw);

	void showHand(boolean firstDraw) {
		if (this instanceof Dealer) {
			System.out.print("Dealer: ");

			for (int i = 0; i < this.getHand().size(); i++) {
				if (i == 0 && firstDraw) {
					// Anzeige mit versteckter Karte
					System.out.print("| ? |");

				} else {
					// Anzeige mit offenen Karten
					System.out.print(this.getHand().get(i).getColor() + " " + this.getHand().get(i).getType());
				}
				if (i == (this.getHand().size() - 1)) {
					// letzte Zeile
					System.out.println(" |");
				} else {
					System.out.print("| ");

				}
			}
		} else {
			System.out.print("Deine Hand: ");
			for (Card card : this.getHand()) {
				System.out.print(card.getColor() + " " + card.getType() + " | ");
			}
			System.out.println();
		}

	}

	 void showHandValue(boolean firstDraw) {
		if (this instanceof Dealer) {
			if (firstDraw) {
				System.out.println("Dealer Value (sichtbar): " + this.getVisibleValue());
			} else {
				System.out.println("Dealer Value: " + this.getTotalValue());
			}
		}
		else {
			System.out.println("Gesamtwert (verloren wenn >21): " + this.getTotalValue());
		}
	}

}
