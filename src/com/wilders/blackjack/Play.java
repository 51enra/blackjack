package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Play {

	private static List<Card> initDeck() {
		List<Card> deck = new ArrayList<>();
		// mit Karten füllen und mischen
		return deck;
	}

	private static int askAceValue() {
		// to be done
		return 1;
	}

	private static int playerLogic(Gamer player) {
		// To be done
		return 0;
	}

	private static int dealerLogic(Gamer dealer) {
		// To be done
		return 0;
	}

	private static boolean askContinue() {
		// to be done
		return false;
	}

	public static void main(String[] args) {

		Gamer player = new Gamer();
		Gamer dealer = new Gamer();

		do {
			List deck = initDeck();
			int playerValue = playerLogic(player);
			if (playerValue > 21) {
				// to be done
			} else {
				int dealerValue = dealerLogic(dealer);
				if (dealerValue > 21) {
					// to be done; "Dealer hat verloren"
				} else {
					if (playerValue >= dealerValue) {
                        // to be done - player wins
					} else {
						// to be done - dealer wins
					}
				}
			}

		} while (askContinue()); // to be done
	}
}
