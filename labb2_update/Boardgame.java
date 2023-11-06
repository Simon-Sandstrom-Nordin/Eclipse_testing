package Eclipse_testing.labb2_update;

public interface Boardgame {
	
	public Boolean move(int x, int y);
	public String getStatus(int x, int y);
	public String getMessage();
	
}
