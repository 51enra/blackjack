package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Play {

	private static List<Card> initDeck() {
		List<Card> deck = new ArrayList<>();
		// mit Karten füllen und mischen
		return deck;
	}

	private static boolean askContinue() {
		Scanner s = new Scanner(System.in);

		char x = s.next().charAt(0);

		if ((x == 'j') || (x == 'J'))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Player player = new Player();
		Dealer dealer = new Dealer();

		do {
			List deck = initDeck();
			player.cleanHand();
			dealer.cleanHand();
			int playerValue = player.logic(deck);
			if (playerValue > 21) {
				// to be done
			} else {
				int dealerValue = dealer.logic(deck);
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
