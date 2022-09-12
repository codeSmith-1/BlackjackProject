package com.skilldistillery.blackjack.common;

import java.util.List;

public class Player {

	protected Hand hand;

	Player() {
		hand = new BlackjackHand();
	}

	public void hit(Dealer dealer) {
		Card c = dealer.getDeck().dealCard();
		this.hand.addCard(c);
	}

	public void displayHand(String name) {
		System.out.println(name + " hand " + hand.cards + " " + this.hand.getHandValue());
	}

	protected Hand getHand() {
		return hand;
	}

}
