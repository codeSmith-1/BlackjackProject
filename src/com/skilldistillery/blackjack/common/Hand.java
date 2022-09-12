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

	@Override
	public String toString() {
		return "" + cards;
	}

}
