package Eclipse_testing.labb2_update;
// for testing the ViewControl class

public class Main {

	public static void main(String[] args) {
		FifteenModel fifteenGame = new  FifteenModel();
		ViewControl VCObject = new ViewControl(fifteenGame, 4);
		// ViewControl VCObject = new ViewControl(null, 4);
		// TicTacToe ticTacToeGame = new  TicTacToe();
		// ViewControl VCObject = new ViewControl(ticTacToeGame, 3);
		
	}

}
