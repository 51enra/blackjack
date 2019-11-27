package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Player extends Gamer {

	private boolean askNewCard() {
		Scanner s = new Scanner(System.in);
		System.out.println("Möchtest Du noch eine Karte? (J/N):");
		char x = s.next().charAt(0);

		if ((x == 'j') || (x == 'J'))
			return true;
		else
			return false;
	}

	private void setAceValue(List<Card> aceCards) {
		Scanner s = new Scanner(System.in);
		String sInput;
		char x;

		// ein oder zwei Karten?
		if (aceCards.size() == 1) {
			// aktuelle Karte betrachten
			// ermittle den aktuellen GetTotalValue (Ass wird mit 11 berechnet)
			if (this.getTotalValue() > 21) {
				// Ass auf Value 1 ohne Nachfrage
				aceCards.get(0).setValue(1);
			} else {
				if (this.getTotalValue() < 21) {
					// Beide Varianten möglich
					System.out.println("Möchtest du dass Ass mit 1 berechnen? (J/N):");
					x = s.next().charAt(0);

					if ((x == 'j') || (x == 'J'))
						aceCards.get(0).setValue(1);

				}
			}

		} else {
			// Zwei Asse beim ersten Zug
			System.out.println("Du hast zwei Asse gezogen. Möchtest du beide mit 1 berechnen? (J/N):");
			x = s.next().charAt(0);
			if ((x == 'j') || (x == 'J')) {
//				aceCards.get(0).setValue(1);
//				aceCards.get(1).setValue(1);
			} else {
				// Standard: ein Ass 11 ein Ass 1
//				aceCards.get(0).setValue(1);
			}

		}

		return;
	}

	public int logic(List<Card> deck) {

		List<Card> hand = this.getHand();
		List<Card> aceCards = new ArrayList<Card>();

		// Draw initial two cards for the player
		// Draw first card:
		hand.add(deck.remove(0));
		hand.get(0).setVisibility(true);
		if (hand.get(0).isAce())
			aceCards.add(hand.get(0));
		// Draw second card:
		hand.add(deck.remove(0));
		hand.get(1).setVisibility(true);
		if (hand.get(1).isAce())
			aceCards.add(hand.get(1));

		// Show cards and ask for ace value if applicable
		this.showHand();
		if (aceCards != null)
			this.setAceValue(aceCards);
		aceCards.removeAll(aceCards);

		// Draw further cards if player wants it
		while (this.getTotalValue() < 21) {
			if (askNewCard()) {
				int last = hand.size();
				hand.add(deck.remove(0));
				hand.get(last).setVisibility(true);
				if (hand.get(last).isAce()) this.setAceValue(Collections.singletonList(hand.get(last)));
                this.showHand();				
			}
		}
		return this.getTotalValue();
	}

	public Player() {
		// super(); --> Check if needed
		// TODO Auto-generated constructor stub
	}

}
