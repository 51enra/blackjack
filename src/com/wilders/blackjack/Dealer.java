package com.wilders.blackjack;

import java.util.List;

public class Dealer extends Gamer {

	public int logic(List<Card> deck) {
		// if the total is 17 or more, he must stop.
		if (this.getTotalValue() >= 17)
			return getTotalValue();

		// if the total is 16 or under, he must take a new card.
		if (this.getTotalValue() < 16) {
			Card newCard = deck.remove(0);
			newCard.setVisibility(true);
			// if the dealer has an ace, and counting it as 11 would bring the total to 17
			// or more (but not over 21),
			// the dealer must count the ace as 11 and stop.
			if (newCard.isAce() && ((this.getTotalValue() + newCard.getValue()) > 21))
				newCard.setValue(1);
			this.getHand().add(newCard);
		}

		return getTotalValue();
	}

	public Dealer() {
		// super(); --> Check if needed
		// TODO Auto-generated constructor stub
	}

}
