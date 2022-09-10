package com.skilldistillery.blackjack.common;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();
	}
	
	private void run() {
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean playing = true;
		
		
		Player joe = new Player();
		Dealer dealer = new Dealer();
		
// 		player1.hit(dealer);
		
		dealer.initalDeal(joe);
		System.out.println(joe.getHand());
		
		System.out.println(dealer.showDealerHand());
//		System.out.println(dealer.getHand());
		
		
		while(playing) {
			
			menu();
			int userInput = sc.nextInt();
			switch (userInput) {
			case 1 : {
				
				break;
			}
			case 2 : {
				
				dealer.dealerTurn();
				System.out.println(dealer.getHand());
				break;
			}
			case 3 : {
				playing = false;
				break;
			}
			case 4 : {
				
			}
			default:
				sc.nextLine();
				System.err.println("Not a valid number.");
			}
			
			
			
			
			
			
		}
		
		
		
		// createdeck
		// shuffle
		// deal cards to each hand
		// show cards
		// check for blackjack
		// if no blackjack > 
		// ask player hit/stand?
		// if stand
		// if hand has ace ensure hand is <= 21;
		// dealer reveal
			// dealer logic to determine hand >= 17 && <= 21;
			// while hand != blackjack
		// 
	}
	
	private void printHandValue(List<Card> hand, int handValue) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Hand value: " + handValue);
	}
	
	// players turn
	// dealers turn
	// results
	// play again?
		// modify playing in while loop
	
	private void menu() {
		System.out.println("1 - hit");
		System.out.println("2 - stand");
		System.out.println("3 - quit");
	}
	
	private void findWinner() {
		// hit on 16
	}
}
