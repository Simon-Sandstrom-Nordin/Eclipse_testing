package Eclipse_testing.Project;

import javax.swing.Icon;
import javax.swing.JButton;

public class Square extends JButton {
	
	public String piece;
	public Icon icon;
	
	public Square(String piece, Icon icon) {
	    this.piece = piece;
	    this.icon = icon;
	    this.setIcon(icon);
	}
	
	public void changePiece(String piece, Icon icon) {
	    this.piece = piece;
	    this.icon = icon;
	    this.setIcon(icon);
	} 
}
