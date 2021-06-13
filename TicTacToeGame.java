package com.bridgelabz.tictactoe;

import java.util.Scanner;
/*
 * @roshni
 * Solving the Tic-Tac-Toe Problem
 */

public class TicTacToeGame {

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		char[] board = TicTacToeGame.createTheBoard();
		Scanner userInput = new Scanner(System.in);
		char player = chooseMarker(userInput);
		char computer = (player == 'X') ? 'O' : 'X';
		showBoard(board);
		System.out.println("Player Marker : " + player);
		System.out.println("Computer's Marker : " + computer);
		playerChoice(board, player);
	}

	/* UC 1 */
	// Creating board
	public static char[] createTheBoard() {
		char board[] = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = '_';
		}
		return board;
	}

	/* UC 2 */
	// Provide player a choice to choose his marker
	private static char chooseMarker(Scanner userInput) {
		System.out.println("Select X or O as your marker");
		return userInput.next().toUpperCase().charAt(0);
	}

	/*
	 * UC 3 Showing the board to the player
	 */
	public static void showBoard(char[] board) {
		System.out.println(" |---|---|---|");
		System.out.println(" | " + board[1] + " | " + board[2] + " | " + board[3] + " | ");
		System.out.println(" |---|---|---|");
		System.out.println(" | " + board[4] + " | " + board[5] + " | " + board[6] + " | ");
		System.out.println(" |---|---|---|");
		System.out.println(" | " + board[7] + " | " + board[8] + " | " + board[9] + " | ");
		System.out.println(" |---|---|---|");
	}

	/*
	 * UC 4 Ability for user to make a move to a desired location
	 */

	public static void playerChoice(char[] board, char player) {
		System.out.println("Please make your choice between 1 to 9");
		Scanner ch = new Scanner(System.in);
		int choice = ch.nextInt();
		if (board[choice] == '_') {
			board[choice] = player;
			showBoard(board);
		} else {
			System.out.println("Someone has already made a move here!!");
		}
	}

}
