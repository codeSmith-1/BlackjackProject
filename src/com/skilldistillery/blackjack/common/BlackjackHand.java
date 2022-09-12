package com.skilldistillery.blackjack.common;

public class BlackjackHand extends Hand {
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


}
