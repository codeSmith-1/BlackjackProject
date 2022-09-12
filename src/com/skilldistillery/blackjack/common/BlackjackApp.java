package com.skilldistillery.blackjack.common;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BlackjackApp {
	Player player1 = new Player();
	Dealer dealer = new Dealer();

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();
	}

	private void run() {
		dealer.initalDeal(player1);
		dealer.showDealerOneCard();
		player1.displayHand("Player1");
		playingBlackjack();
	}

	private void playingBlackjack() {
		if (checkForBlackjack()) return;
		if (playerOptions()) return;
		if (dealerTurn()) return;
		evaluateWinner();
		return;
	}

	private void playerTurn() {
		dealer.playerHit(player1);
		player1.displayHand("Player1");
	}

	private boolean checkForBlackjack() {
		if (dealer.hand.getHandValue() == 21 && player1.hand.getHandValue() == 21) {
			System.out.println("Dealer and Player1 have Blackjack!");
			dealer.displayHand("Dealer");
			return true;
		}

		if (dealer.hand.getHandValue() == 21) {
			System.out.println("Dealer has Blackjack!");
			dealer.displayHand("Dealer");
			System.out.println("Dealer wins!");
			return true;
		}

		if (player1.hand.getHandValue() == 21) {
			System.out.println("Player1 has Blackjack! Player1 wins!");
			dealer.displayHand("Dealer");
			return true;
		}
		return false;
	}
	
	private boolean playerOptions() {
		while (true) {
			System.out.println("1 - Hit");
			System.out.println("2 - Stand");
			int userMove = sc.nextInt();
			do {
				if (userMove != 1 && userMove != 2) {
					System.out.println("Choose 1 or 2.");
					break;
				}
			} while (userMove != 1 && userMove != 2);
			if (userMove == 2) {
				System.out.println("Player1 stands.");
				break;
			} else if (userMove == 1) {
				playerTurn();
				if (player1.hand.getHandValue() > 21) {
					System.out.println("Player1 busted!");
					dealer.displayHand("Dealer");
					return true;
				}
			} else {
				continue;
			}
		}
		return false;
	}

	private boolean dealerTurn() {
		while (dealer.hand.getHandValue() < 17 || dealer.hand.getHandValue() < player1.hand.getHandValue()) {
			System.out.println("Dealer's turn.");
			dealer.dealerTurn();
			
			if (dealer.hand.getHandValue() > 21) {
				dealer.displayHand("Dealer");
				System.out.println("Dealer busted. You win!");
				return true;
			}
		}
		return false;
	}

	
	private void evaluateWinner() {
		if (dealer.hand.getHandValue() == player1.hand.getHandValue()) {
			System.out.println("Tie.");
			dealer.displayHand("Dealer");

		} else if (dealer.hand.getHandValue() > player1.hand.getHandValue()) {
			dealer.displayHand("Dealer");
			System.out.println("Dealer wins " + dealer.hand.getHandValue() + " points to " + player1.hand.getHandValue()
					+ " points.");
			
		} else {
			dealer.showDealerHand();
			System.out.println("You win, " + +player1.hand.getHandValue() + " points to " + dealer.hand.getHandValue()
					+ " points.");
		}
	}

}
