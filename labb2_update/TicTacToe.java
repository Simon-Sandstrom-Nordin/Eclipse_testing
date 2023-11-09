package Eclipse_testing.labb2_update;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TicTacToe implements Boardgame {
	private int[][] board = new int[3][3];
	private String message;
	private int turn_counter = 0;
	private int move_counter = 0;	// to assist with moving pieces
	private int previous_x = 0;
	private int previous_y = 0;	// for move phase

	@Override
	public Boolean move(int x, int y) {
		if (turn_counter < 6) {	// place phase
			if (board[x][y] == 0) {
				if (turn_counter % 2 == 0) {
					board[x][y] = 1;	// player 1, outputs later as X
					turn_counter += 1;
					message = "Player 2's turn";
					return true;
				} else {
					board[x][y] = 2;	// player 2, outputs later as O
					turn_counter += 1;
					message = "Player 1's turn";
					return true;
				}
				
			} else {
				message = "Please select empty tile";
				return false;
			}
		} else {	// move phase
			if (turn_counter % 2 == 0) {
				if (move_counter % 2 == 0) {	// remove before replacing
					if (board[x][y] == 1) {
							previous_x = x;
							previous_y = y;
							message = "Player 1's turn, please select new location";
							move_counter += 1;
							return true;
						} else {
							message = "Please select your own piece to be moved";
							return false;
						}
					} else {
						if (board[x][y] == 0) {
							board[previous_x][previous_y] = 0;
							board[x][y] = 1;
							message = "Player 2's turn";
							move_counter = 0;
							turn_counter += 1;
							return true;
						} else {
							message = "Please select an empty destination tile";
							return false;
						}
					}
			} else {
				if (move_counter % 2 == 0) {	// remove before replacing
					if (board[x][y] == 2) {
							previous_x = x;
							previous_y = y;
							message = "Player 2's turn, please select new location";
							move_counter += 1;
							return true;
						} else {
							message = "Please select your own piece to be moved";
							return false;
						}
					} else {
						if (board[x][y] == 0) {
							board[previous_x][previous_y] = 0;
							board[x][y] = 2;
							message = "Player 1's turn";
							move_counter = 0;
							turn_counter -= 1;	// bounds the turn counter to a maximum of 7
							return true;
						} else {
							message = "Please select an empty destination tile";
							return false;
						}
					}
			}
		}
	}

	@Override
	public String getStatus(int x, int y) {
		if (board[x][y] == 0) {
			return "";
		} else if (board[x][y] == 1) {
			return "X";
		} else {
			return "O";
		}

	}

	@Override
	public String getMessage() {
		return message;
	}

}
