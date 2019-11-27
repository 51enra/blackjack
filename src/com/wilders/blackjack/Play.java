package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Play {
	
	private static List<Card> initDeck() {
		List<Card> deck = new ArrayList<>();
		// mit Karten füllen und mischen

		for (int i = 2; i <= 10; i++) {
			deck.add(new Card("diamond", Integer.toString(i), i, false));
			deck.add(new Card("heart", Integer.toString(i), i, false));
			deck.add(new Card("spade", Integer.toString(i), i, false));
			deck.add(new Card("cross", Integer.toString(i), i, false));
			
		}
		deck.add(new Card("diamond", "J", 10, false));
		deck.add(new Card("diamond", "Q", 10, false));
		deck.add(new Card("diamond", "K", 10, false));
		deck.add(new Card("diamond", "Ace", 11, false));
				
		deck.add(new Card("heart", "J", 10, false));
		deck.add(new Card("heart", "Q", 10, false));
		deck.add(new Card("heart", "K", 10, false));
		deck.add(new Card("heart", "Ace", 11, false));
		
		deck.add(new Card("spade", "J", 10, false));
		deck.add(new Card("spade", "Q", 10, false));
		deck.add(new Card("spade", "K", 10, false));
		deck.add(new Card("spade", "Ace", 11, false));
						
		deck.add(new Card("cross", "J", 10, false));
		deck.add(new Card("cross", "Q", 10, false));
		deck.add(new Card("cross", "K", 10, false));
		deck.add(new Card("cross", "Ace", 11, false));

		//mix
		Collections.shuffle(deck);
				
		return deck;
	}

	private static int askAceValue() {
		// to be done
		return 1;
	}

	private static boolean askContinue() {
		// to be done
		return false;
	}

	public static void main(String[] args) {

		Player player = new Player();
		Dealer dealer = new Dealer();

		do {
			List deck = initDeck();
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
