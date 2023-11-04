package Eclipse_testing.labTwo_tinkerFolder2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FifteenModel implements Boardgame{

	private int[][] board = new int[4][4];;
	private int clearX, clearY;
	private String message;
	
	public FifteenModel() {
		Integer[] numbers = new Integer[15];
        for (int i = 1; i <= 15; i++) {
            numbers[i-1] = i;
        }
        List<Integer> numberList = Arrays.asList(numbers);
        Collections.shuffle(numberList);
        for (int i = 0; i < 4; i++) {
    		for (int j = 0; j < 4; j++) {
    			if (i == j && i == 3) {
    				board[i][j] = 0;
    			} else {
    			board[i][j] = numberList.get(4 * i + j);
    			}
    		}
    	}
		clearX = 3; clearY = 3;
	}
	
	@Override
	public Boolean move(int x, int y) {
		if (isValidMove(x, y)) {
			board[clearX][clearY] = board[x][y];
			board[x][y] = 0;
			clearX = x;
			clearY = y;
			message = "Move performed.";
			return true;
		} else {
			message = "Move invalid. Plz choose adjacent tile.";
			return false;
		}
	}
	
	// helper method for above
    private boolean isValidMove(int x, int y) {
        return (Math.abs(x - clearX) == 1 && y == clearY) || (Math.abs(y - clearY) == 1 && x == clearX);
    }

	@Override
	public String getStatus(int x, int y) {
		return Integer.toString(board[x][y]);
	}

	@Override
	public String getMessage() {
		return message;
	}
	
}
