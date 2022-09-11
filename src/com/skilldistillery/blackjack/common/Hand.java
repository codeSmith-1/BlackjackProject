package com.skilldistillery.blackjack.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected ArrayList<Card> cards;

	Hand() {
		cards = new ArrayList<Card>();
	}

	public abstract int getHandValue();

	public void addCard(Card card) {
		cards.add(card);
	}

	public void clearHand() {
		for (int i = 0; i < cards.size() + 1; i++) {
			cards.remove(0);
		}
	}

	@Override
	public String toString() {
		return "" + cards;
	}

}
