package com.skilldistillery.blackjack.common;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dealer extends Player {

	private ArrayList<Card> cards = hand.cards;
	private Deck deck = new Deck();

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
		return "Dealer's hand " + cards;
	}

	public void showAllDealerCards() {
		for (Card card : cards) {
			System.out.println(card);
		}
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

}
