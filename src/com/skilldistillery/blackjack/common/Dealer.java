package com.skilldistillery.blackjack.common;

import java.util.ArrayList;

public class Dealer extends Player {

	private ArrayList<Card> cards = hand.cards;
	private Deck deck;

	Dealer() {
		super();
		deck = new Deck();
	}

	public void initalDeal(Player player1) {
		deck.shuffleDeck();
		for (int i = 0; i < 2; i++) {
			deck.dealCard(this.hand);
			deck.dealCard(player1.getHand());
		}
	}
	public void showDealerHand() {
		System.out.println("Dealer's hand " + cards + " " + this.hand.getHandValue());
	}
	
	public void showDealerOneCard() {
		System.out.println("Dealer is showing " + cards.get(0));
	}
	
	public void dealerTurn() {
		Card c = deck.dealCard();
		cards.add(c);
		System.out.println("Dealer draws the " + c);
	}
	
	
	public void playerHit(Player player1) {
		Card c = deck.dealCard();
		player1.hand.addCard(c);
	}

	protected Deck getDeck() {
		return deck;
	}

	protected void printDeck() {
		deck.printDeck();
	}

	public int deckSize() {
		return deck.checkDeckSize();
	}

	public void getNewDeck() {
		deck = new Deck();
	}


}
