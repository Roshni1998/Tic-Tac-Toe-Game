package com.bridgelabz.tictactoe;
/*
 * @roshni
 * Solving the Tic-Tac-Toe Problem
 */

public class TicTacToeGame {

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		TicTacToeGame game = new TicTacToeGame();
		game.createTheBoard();
	}

	/* UC 1 */
	// Creating board
	char board[] = new char[9];

	public void createTheBoard() {
		for (int i = 1; i < 9; i++) {
			board[i] = ' ';
			System.out.println(board[i]);
		}
	}
}
