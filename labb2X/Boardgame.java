package Eclipse_testing.labb2X;

public interface Boardgame {
	
	public Boolean move(int x, int y);
	public String getStatus(int x, int y);
	public String getMessage();
	
}
