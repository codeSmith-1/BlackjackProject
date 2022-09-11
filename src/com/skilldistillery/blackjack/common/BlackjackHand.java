package com.skilldistillery.blackjack.common;

import java.util.ArrayList;

public class BlackjackHand extends Hand {
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
	
	public boolean isBlackjack(int value) {
		if(this.handValue == bj) {
			return true;	
		}
		return false;
	}
	
	
}
