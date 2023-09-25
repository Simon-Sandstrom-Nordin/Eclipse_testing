package Eclipse_testing.labTwo;

public interface Boardgame {
	
	public Boolean move(int x, int y);
	public String getStatus(int x, int y);
	public String getMessage();
	
}
