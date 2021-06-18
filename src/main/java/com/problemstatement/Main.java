package com.problemstatement;

import java.util.Scanner;

/**
 * ****************************************************************************
 * Purpose: Class is Main class to perform the Main string arguments of the
 * project
 *
 * @author ZameerAhamad Ron<zameerraone96@gmail.com>
 * @version 1.4
 * @since 17-06-2020
 * ****************************************************************************
 */

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Players[] players = new Players[4]; // UC-2 for creating Number of players.
		Card[] deck = DeckofCards.getDeckOfCards(); // Creating the size of Deck.

		System.out.println("Un-shuffled Cards.");
		DeckofCards.showCards(deck);
		Card[] shuffledCards = DeckofCards.shuffleCards(deck); // Shuffling of Cards.
		System.out.println("Shuffled Cards.");
		DeckofCards.showCards(shuffledCards);

		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter Player Name: ");
			players[i] = new Players(input.nextLine());
		}

		Players[] playersWithCards = DeckofCards.dealCards(players, shuffledCards);

		System.out.println("---------------------------------------------");

		for (Players player : playersWithCards) {
			System.out.println(player.getName());
			player.showPlayerCards(); // Showcasing of Cards each player has.
		}
		
	}
}
