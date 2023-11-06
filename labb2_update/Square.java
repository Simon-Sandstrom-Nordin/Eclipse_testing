package Eclipse_testing.labb2_update;

import javax.swing.JButton;

public class Square extends JButton {
	
	String text = "0";
	int x;
	int y;
	
	public Square(int x, int y) {
	    this.x = x;
	    this.y = y;
	    this.setText(text);
	}
	
    public void changeText(String newText) {
        this.text = newText;
        updateText();
    }

    private void updateText() {
        this.setText(text);
    }
}
