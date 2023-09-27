package Eclipse_testing.Project;

import javax.swing.Icon;
import javax.swing.JButton;

public class Square extends JButton {
	
	String piece = null;	// per default
	
	public Square(String piece, Icon icon) {
	    this.piece = piece;
	    this.setIcon(icon);
	}
	
}
