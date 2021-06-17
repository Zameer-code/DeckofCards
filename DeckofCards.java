package com.problemstatement;
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
		
		
			private static String[] deck = new String[52];
			private static String[] suits = new String[] {"Spades", "Hearts", "Diamonds", "Clubs"};
			private static  String[] ranks = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
			 
			 
		/**
		 * Creating a deck of cards		
		 */
			
	private String[] createDeck() {
		
	
		for (int i = 0; i < deck.length; i++) { //for loop to check the deck length
			 deck[i] = suits[i / 13] ;
			deck [i] = ranks[i % 13];	
			return deck;
		}
		return null;
	}
		public static void main(String[] args) { // main method to run programme
			DeckofCards s = new DeckofCards();
			s.createDeck();
		}
			
}
		



