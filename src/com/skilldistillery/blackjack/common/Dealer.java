package com.skilldistillery.blackjack.common;

import java.util.ArrayList;

public class Dealer extends Player {

	private Deck deck = new Deck();
//	private Hand hand;

	private ArrayList<Card> cards = hand.cards;

	Dealer() {
		super();
	}

	public void initalDeal(Player player1) {
		deck.shuffleDeck();
		for (int i = 0; i < 2; i++) {
			deck.dealCard(this.hand);
			deck.dealCard(player1.hand);
		}
	}

	protected Deck getDeck() {
		return deck;
	}

	// create new deck 12
	public void getNewDeck() {
		deck = new Deck();
	}

	public String showDealerHand() {
		return "Dealer's hand " + cards.get(1);
	}

	public void dealerTurn() {
		while (this.hand.getHandValue() < 17) {
			Card c = deck.dealCard();
			cards.add(c);
			System.out.println(c);
	}
		

	}
}
