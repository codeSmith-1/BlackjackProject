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

	public void displayHand() {
		// test without toString()
		System.out.println(this.hand);
	}

	protected Hand getHand() {
		return hand;
	}

}
