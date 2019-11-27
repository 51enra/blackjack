package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player extends Gamer {
    
	
	private boolean askNewCard() {
		// To Do: Abfrage, ob der Player eine weitere Karte ziehen möchte
		return false;
	}
	
	public int logic(List<Card> deck) {

		List<Card> hand = this.getHand();
        List<Card> aceCards = new ArrayList<Card>();
		// Draw initial two cards for the player
        // Draw first card:
		hand.add(deck.remove(0));
        hand.get(0).setVisibility(true);
        if (hand.get(0).isAce()) aceCards.add(hand.get(0));
		// Draw second card:
        hand.add(deck.remove(0));
		hand.get(1).setVisibility(true);
        if (hand.get(1).isAce()) aceCards.add(hand.get(1));
		// Show cards and ask for ace value if applicable
        this.showHand();
        if (aceCards != null) this.setAceValue(aceCards);
        aceCards.removeAll(aceCards);
        // Draw further cards if player wants
		while (this.getTotalValue() < 21) {
			if (askNewCard()) {
				hand.add(deck.remove(0));
				
			}
		}
		return 0;
	}

	public Player() {
		// super(); --> Check if needed
		// TODO Auto-generated constructor stub
	}

	
	
}
