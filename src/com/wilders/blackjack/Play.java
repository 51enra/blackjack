package com.wilders.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Play {
	
	

	private static boolean askContinue() {
		Scanner s = new Scanner(System.in);
		System.out.println("Möchtest Du noch einmal spielen? (J/N):");
		char x = s.next().charAt(0);
		s.close();
		
		if ((x == 'j') || (x == 'J'))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {

		Player player = new Player();
		Dealer dealer = new Dealer();

		do {
			List deck = Card.initDeck();
			player.cleanHand();
			dealer.cleanHand();
			int playerValue = player.logic(deck);
			if (playerValue > 21) {
				System.out.println("Der Dealer hat gewonnen!");
			} else {
				int dealerValue = dealer.logic(deck);
				if (dealerValue > 21) {
					System.out.println("Du hast gewonnen!");
				} else {
					if (playerValue >= dealerValue) {
						System.out.println("Du hast gewonnen!");
					} else {
						System.out.println("Der Dealer hat gewonnen!");
					}
				}
			}

		} while (askContinue()); 
	}
}
