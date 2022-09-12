package com.skilldistillery.blackjack.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(s, r));
			}
		}
		return deck;
	}

	public void dealCard(Hand hand) {
		Card c = dealCard();
		hand.addCard(c);
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	public void printDeck() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}

}
