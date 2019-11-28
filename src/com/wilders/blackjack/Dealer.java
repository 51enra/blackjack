package com.wilders.blackjack;

import java.util.List;

public class Dealer extends Gamer {

	public Dealer() {
		// super(); --> Check if needed
		// TODO Auto-generated constructor stub
	}

	int draw(List<Card> deck, boolean firstDraw) {
		Card newCard1, newCard2;
		if (firstDraw) {

			// 1.Karte
			newCard1 = deck.remove(0);
			newCard1.setVisibility(false);

			// 2.Karte
			newCard2 = deck.remove(0);
			newCard2.setVisibility(true);

			// Wert prüfen
			if (newCard1.isAce() && newCard2.isAce()) {
				// zwei Asse --> 2. auf Value=1 setzen
				newCard2.setValue(1);
			}
			// Karten auf die Hand nehmen
			this.getHand().add(newCard1);
			this.getHand().add(newCard2);
			this.showHand(true);
			this.showHandValue(true);
		} else {
			if (this.getTotalValue() > 17) {

				// if the total is 16 or under, he must take a new card.
				while (this.getTotalValue() < 16) {
					Card newCard = deck.remove(0);
					newCard.setVisibility(true);
					// if the dealer has an ace, and counting it as 11 would bring the total to 17
					// or more (but not over 21),
					// the dealer must count the ace as 11 and stop.
					if (newCard.isAce() && ((this.getTotalValue() + newCard.getValue()) > 21))
						newCard.setValue(1);
					this.getHand().add(newCard);

				}
			}
			this.showHand(false);
			this.showHandValue(false);
		}

		return this.getTotalValue();
	}

	void showHand(boolean firstDraw) {
		System.out.print("Dealer: ");

		for (int i = 0; i < this.getHand().size(); i++) {
			if (i == 0 && firstDraw) {
				// Anzeige mit versteckter Karte
				System.out.print("? ");

			} else {
				// Anzeige mit offenen Karten
				System.out.print(this.getHand().get(i).getColor() + this.getHand().get(i).getType());
			}
			if (i == (this.getHand().size() - 1)) {
				// letzte Zeile
				System.out.println("");
			} else {
				System.out.print(", ");

			}
		}

	}

	void showHandValue(boolean firstDraw) {
		if (firstDraw) {
			System.out.println("Dealer Value (sichtbar): " + this.getVisibleValue());
		} else {
			System.out.println("Dealer Value: " + this.getTotalValue());
		}

	}

}
