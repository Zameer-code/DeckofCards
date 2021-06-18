package com.problemstatement;

/**
 * **************************************************************************** Purpose: Class is
 * to create players class for deck and cards
 *
 * @author ZameerAhamad Ron<zameerraone96@gmail.com>
 * @version 1.4
 * @since 17-06-2020 ****************************************************************************
 */

public class Players {		// UC-2 Creating of more than 2 players
			
	private String name;
    private Card[] cards = new Card[13];

    Players(String name){
        this.name = name;
    }
    void showPlayerCards(){
        System.out.println("---------------------------------------------");
        for (Card card : cards){
            //UC-5 distributing of cards in the players sequence
            System.out.printf("%s  of %s\n", card.rank, card.suit);
        }
        System.out.println("---------------------------------------------");
    }
    void receiveCard(Card card, int position){
        cards[position] = card;
    }
    String getName(){
        return name;
    }
}
