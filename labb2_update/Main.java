package Eclipse_testing.labb2_update;
// for testing the ViewControl class

public class Main {

	public static void main(String[] args) {
		FifteenModel fifteenGame = new  FifteenModel();
		ViewControl VCObject = new ViewControl(fifteenGame, 4);
		// TicTacToeMock ticTacToeMockGame = new  TicTacToeMock();
		// ViewControl VCObject = new ViewControl(ticTacToeMockGame, 3);
		// TicTacToe ticTacToeGame = new TicTacToe();
		// ViewControl VCObject = new ViewControl(ticTacToeGame, 3);
		
	}

}
