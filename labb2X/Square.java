package Eclipse_testing.labb2X;

import javax.swing.JButton;

public class Square extends JButton {
	
	int number = 0;
	int x;
	int y;
	
	public Square(int x, int y) {
	    this.x = x;
	    this.y = y;
	    this.setText(Integer.toString(number));
	}
	
    public void changeNumber(int number) {
        this.number = number;
        updateText();
    }

    private void updateText() {
        this.setText(Integer.toString(number));
    }
}
