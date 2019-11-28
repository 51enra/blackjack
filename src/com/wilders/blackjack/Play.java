package com.wilders.blackjack;

import java.util.List;
import java.util.Scanner;

public class Play {

	private static boolean askContinue() {
		Scanner s = new Scanner(System.in);
		System.out.println("Möchtest Du noch einmal spielen? (J/N):");
		char x = s.next().charAt(0);

		if ((x == 'j') || (x == 'J')) {
			System.out.println();
			System.out.println();
			System.out.println();
			return true;
		} else {
			System.out.println("Auf Wiedersehen!!!!");
			return false;
		}

	}

	public static void main(String[] args) {

		Player player = new Player();
		Dealer dealer = new Dealer();

		do {
			List<Card> deck = Card.initDeck();
			player.cleanHand();
			dealer.cleanHand();
			int playerValue = player.draw(deck, true); // ersters Mal
			int dealerValue = dealer.draw(deck, true); // ersters Mal
			playerValue = player.draw(deck, false); // 2. + ....
			if (playerValue > 21) {
				System.out.println("Du bist über 21 - du hast verloren!");
			} else {
				player.showHand();
				dealerValue = dealer.draw(deck, false); // 2. + ....
				if (dealerValue > 21) {
					System.out.println("Geber über 21 - du hast gewonnen!");
				} else {
					if (playerValue > dealerValue) {
						System.out.println("Du hast die meisten Punkte - gewonnen!");
					} else if (playerValue == dealerValue) {
						System.out.println("Gleiche Punktzahl - unentschieden!");
					} else {
						System.out.println("Der Geber hat die meisten Punkte - du hast verloren!");
					}
				}
			}
			System.out.println();
		} while (askContinue());
	}
}
