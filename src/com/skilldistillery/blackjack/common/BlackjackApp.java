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
		startGame();
		System.out.println(dealer.showDealerHand());
		System.out.println("Player1's hand " + player1.getHand());
		playingBlackjack();
	}

	private boolean playingBlackjack() {
		while (true) {
			System.out.println("1 - Hit");
			System.out.println("2 - Stand");
			int userMove = sc.nextInt();
			do {
				if (userMove != 1 && userMove != 2) {
					System.out.println("Choose 1 or 2.");
				}
			} while (userMove != 1 && userMove != 2);

			if (userMove == 2) {
				// no further action - eval winner.
				System.out.println("Player1 stands.");
				break;
			} else {
				playerTurn();
				if (player1.hand.getHandValue() > 21) {
					System.out.println("Player1 busted!");
					System.out.println();
					dealer.showDealerHand();
					return false;
				}
			}
		}
		while (dealer.hand.getHandValue() <= 16) {
			System.out.println("Dealer's turn.");
			dealer.dealerTurn();
			dealer.showDealerHand();
			if (dealer.hand.getHandValue() > 21) {
				System.out.println("Dealer busted. You win!");
			}
			return true;
		}
		if (dealer.hand.getHandValue() == player1.hand.getHandValue()) {
			System.out.println("Tie.");
			return true;
		} else if (dealer.hand.getHandValue() > player1.hand.getHandValue()) {
			System.out.println("Dealer wins " + dealer.hand.getHandValue() + " points to " + player1.hand.getHandValue()
					+ " points.");
		} else {
			dealer.showAllDealerCards();
			System.out.println("You win, " + +player1.hand.getHandValue() + " points to " + dealer.hand.getHandValue()
					+ " points.");
			return true;
		}
		return true;
	}

	private void findWinner() {
		// hit on 16
	}

	private void startGame() {
		dealer.initalDeal(player1);
	}

	private void playerTurn() {
		dealer.playerHit(player1);
		System.out.println("player1s hand " + player1.getHand());
	}

}
