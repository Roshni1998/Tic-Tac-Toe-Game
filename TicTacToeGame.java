package com.bridgelabz.tictactoe;

import java.util.Scanner;
/*
 * @roshni
 * Solving the Tic-Tac-Toe Problem
 */

public class TicTacToeGame {
	
	Scanner op = new Scanner(System.in);
	public char player = op.next().charAt(0);
	public char computer = ' ';

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		System.out.println("Select X or O as your marker");
		TicTacToeGame game = new TicTacToeGame();
		game.createTheBoard();
		game.chooseMarker();
		game.showBoard();
	}

	/* UC 1 */
	// Creating board
	char board[] = new char[10];

	public void createTheBoard() {
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
			System.out.println(board[i]);
		}
	}
	
	/* UC 2 */
	// Provide player a choice to choose his marker
	public void chooseMarker() {
		// System.out.println("Select X or O as your marker");
		if (player == 'X') {
			computer = 'O';
			System.out.println("Player1 Choice : " + player);
			System.out.println("Computer Choice : " + computer);

		}
		else if (player == 'O') {
			computer = 'X';
			System.out.println("Player1 Choice : " + player);
			System.out.println("Computer Choice : " + computer);

		} else {
			System.out.println("Please Enter valid Choice! ");
		}
	}
	
	/* UC 3
	*Showing the board to the player
	*/
	public void showBoard() {
		System.out.println(" |---|---|---|");
		System.out.println(" | " + board[1] + " | " + board[2] + " | " + board[3] + " | ");
		System.out.println(" |---|---|---|");
		System.out.println(" | " + board[4] + " | " + board[5] + " | " + board[6] + " | ");
		System.out.println(" |---|---|---|");
		System.out.println(" | " + board[7] + " | " + board[8] + " | " + board[9] + " | ");
		System.out.println(" |---|---|---|");
	}
}

