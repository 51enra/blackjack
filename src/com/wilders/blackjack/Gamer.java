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

	
	void showHand() {

		// oberste Zeile
//		System.out.print("        ");
		for (int i = 0; i < this.getHand().size(); i++) {
			System.out.print("----- ");
		}
		System.out.println("");

		// 2.Zeile
//		System.out.print("        ");
		for (int i = 0; i < this.getHand().size(); i++) {

			if (!this.getHand().get(i).isVisibility()) {

				// Anzeige mit versteckter Karte
				System.out.print("| * | ");

			} else {
				// Anzeige mit offenen Karten
				System.out.print("| " + this.getHand().get(i).getColor() + " | ");
			}

		}
		System.out.println("");

		// 3. Zeile
//		System.out.print("        ");
		for (int i = 0; i < this.getHand().size(); i++) {

			if (!this.getHand().get(i).isVisibility()) {
				// Anzeige mit versteckter Karte
				System.out.print("| * | ");
			} else {
				// Anzeige mit offenen Karten
				if (this.getHand().get(i).getType().equals("10"))
					System.out.print("|" + this.getHand().get(i).getType() + " | ");
				else
					System.out.print("| " + this.getHand().get(i).getType() + " | ");
			}
		}
		System.out.println("");

		// UNTERSTE Zeile
//		System.out.print("        ");
		for (int i = 0; i < this.getHand().size(); i++) {
			System.out.print("----- ");
		}
		System.out.println();
	}

	void showHandValue() {
			if (this.getVisibleValue() != this.getTotalValue()) {
				System.out.println("Gesamtwert (sichtbar): " + this.getVisibleValue());
			} else {
				System.out.println("Gesamtwert (verloren wenn >21): " + this.getTotalValue());
			}
	}

}
