package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player extends Gamer {

	public int logic(List<Card> deck) {
		// To be done
		List<Card> hand = new ArrayList<>();
		hand.add(deck.remove(0));

		return 0;
	}

	public Player() {
		// super(); --> Check if needed
		// TODO Auto-generated constructor stub
	}

	
	
}
