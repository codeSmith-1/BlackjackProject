package com.skilldistillery.blackjack.common;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Dealing {

	public static void main(String[] args) {
		Dealing d = new Dealing();
		d.run();
	}

	
	private void run() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		
		List<Card> hand = new ArrayList<>();
		Card c = deck.dealCard();
		Card b
		
		// deal 2 cards to each player and the dealer, display them
		// ask if they want to hit or stay
		
		
		int handValue = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = deck.dealCard();
			handValue += c.getValue();
			hand.add(c);
	}
//	private void run() {
//		Deck deck = new Deck();
//
//		Scanner kb = new Scanner(System.in);
//
//		System.out.println("How many cards do you want?");
//
//		boolean playing = true;
//
//		while (playing) {
//
//			deck.shuffleDeck();
//
//			try {
//				int numCards = kb.nextInt();
//				if (numCards > 52) {
//					throw new InputMismatchException();
//				}
//
//				List<Card> hand = new ArrayList<>(numCards);
//				int handValue = 0;
//				for (int i = 0; i < numCards; i++) {
//					Card c = deck.dealCard();
//					handValue += c.getValue();
//					hand.add(c);
//				}
//
//				printHandValue(hand, handValue);
//
//			} catch (InputMismatchException e) {
//				System.err.println("Must enter a number between 1 - 52");
//			
//		
//	}
//		}
//	}
		

	private void printHandValue(List<Card> hand, int handValue) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Hand value: " + handValue);
	}
	
}
