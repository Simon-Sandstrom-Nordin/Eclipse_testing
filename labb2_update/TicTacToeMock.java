package Eclipse_testing.labb2_update;

public class TicTacToeMock implements Boardgame {

	@Override
	public Boolean move(int x, int y) {
		return true;
	}

	@Override
	public String getStatus(int x, int y) {
		return "";
	}

	@Override
	public String getMessage() {
		return "Message";
	}

}
