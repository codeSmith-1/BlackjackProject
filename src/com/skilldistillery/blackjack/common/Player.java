package com.skilldistillery.blackjack.common;

import java.util.List;

public class Player {
	
	private int purse;

	protected Hand hand;
	
	Player(){
		hand = new BlackjackHand();
	}
	
	public void hit(Dealer dealer) {
		Card c = dealer.getDeck().dealCard();
		this.hand.addCard(c);
	}
	
	public void displayHand() {
		// test without toString()
		System.out.println(hand.toString());
	}

	protected Hand getHand() {
		return hand;
	}

	protected int getPurse() {
		return purse;
	}

	protected void setPurse(int purse) {
		this.purse = purse;
	}
}
