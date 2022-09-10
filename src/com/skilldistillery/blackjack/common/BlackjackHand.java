package com.skilldistillery.blackjack.common;

import java.util.ArrayList;

public class BlackjackHand extends Hand {
// Hand hand = new BlackjackHand();
	private int bj = 21;
	private int handValue;
	
	
	BlackjackHand() {		
	}
	
	public int getHandValue() {
		handValue = 0;
		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;
	}
	
	public boolean isBlackjack() {
		if(handValue == bj) {
			return true;	
		}
		return false;
	}

	public boolean isBust() {
		if(getHandValue() > bj) {
			return true;
		}
		return false;
	}

	
	
}
