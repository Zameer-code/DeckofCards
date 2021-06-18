package com.problemstatement;

import java.util.Random;

/**
 * **************************************************************************** Purpose: Class is
 * Workshop Deck of cards
 *
 * @author ZameerAhamad Ron<zameerraone96@gmail.com>
 * @version 1.4
 * @since 17-06-2020 ****************************************************************************
 */

public class DeckofCards {
	/**
	 * UC-1 Setting up game of deck of cards
	 */
	 private static final int SIZE = 52;
	    private static Card[] deckOfCards = new Card[SIZE];

	    	static Card[] getDeckOfCards() {

	        int count = 0;
		
			 		String[] suits =  {"Spades", "Hearts", "Diamonds", "Clubs"};
				    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
					
			for (String s : suits) {
	            for (String r : ranks) {

	                Card card = new Card(s, r);
	                deckOfCards[count] = card;
	                count++;
	            }
	        }

	        return deckOfCards;
	    }

			 
			 
			 
		/**
		 * UC-4 Shuffling of Cards using Random method		
		 */
			
	    	static Card[] shuffleCards(Card[] deckOfCards) {
	            Random rand = new Random();
	            int j;
	            for (int i = 0; i < SIZE; i++) {
	                j = rand.nextInt(SIZE);
	                Card temp = deckOfCards[i];
	                deckOfCards[i] = deckOfCards[j];
	                deckOfCards[j] = temp;
	            }
	            return deckOfCards;
	        }
	    	 static void showCards(Card[] deckOfCards) {	// UC-3 Method sequence  the players order
	    	        System.out.println("---------------------------------------------");
	    	        int count = 0;
	    	        for (Card card : deckOfCards) {
	    	            System.out.printf("%s of %s\t", card.rank, card.suit); //use print f with \t (tab character)
	    	            count++;
	    	            if (count % 4 == 0)
	    	                System.out.println();
	    	        }
	    	        System.out.println("---------------------------------------------");
	    	    }

	    	    static Players[] dealCards(Players[] players, Card[] deck) { // UC-6 Recieving the cards of Each player
	    	        int numOfCardsPerPlayer = deck.length / players.length;
	    	        for (int i = 0; i < deck.length; i++) {
	    	            int positionInHand = i % numOfCardsPerPlayer;
	    	            players[i % players.length].receiveCard(deck[i], positionInHand);
	    	        }

	    	        return players;
	    	    }
}
	
		
		


		
		



