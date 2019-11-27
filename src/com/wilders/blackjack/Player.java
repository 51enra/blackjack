package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player extends Gamer {


	private int askAceValue() {
		// to be done
		return 1;
	}
	
	public int logic(List<Card> deck) {
		// Draw two cards for the player and show them
		List<Card> hand = this.getHand();
		hand.add(deck.remove(0));
		hand.get(0).setVisibility(true);
		hand.add(deck.remove(0));
		hand.get(1).setVisibility(true);
		this.showHand();
		while ()
		return 0;
	}

	public Player() {
		// super(); --> Check if needed
		// TODO Auto-generated constructor stub
	}

	
	
}
