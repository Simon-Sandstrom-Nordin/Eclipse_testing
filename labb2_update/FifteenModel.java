package Eclipse_testing.labb2_update;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FifteenModel implements Boardgame{

	private String[][] board = new String[4][4];;
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
    				board[i][j] = "";
    			} else {
    			board[i][j] = Integer.toString(numberList.get(4 * i + j));
    			}
    		}
    	}
		clearX = 3; clearY = 3;
	}
	
	@Override
	public Boolean move(int x, int y) {
		if (isValidMove(x, y)) {
			board[clearX][clearY] = board[x][y];
			board[x][y] = "";
			clearX = x;
			clearY = y;
			message = "Move performed.";
			return true;
		} else {
			message = "Move invalid. Please choose adjacent tile.";
			return false;
		}
	}
	
	// helper method for above
    private boolean isValidMove(int x, int y) {
        return (Math.abs(x - clearX) == 1 && y == clearY) || (Math.abs(y - clearY) == 1 && x == clearX);
    }

	@Override
	public String getStatus(int x, int y) {
		return board[x][y];
	}

	@Override
	public String getMessage() {
		return message;
	}
	
}
