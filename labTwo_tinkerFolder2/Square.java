package Eclipse_testing.labTwo_tinkerFolder2;

import javax.swing.JButton;

public class Square extends JButton {
	
	int number = 0;	// per default
	int x;	// x index
	int y;	// y index
	
	public Square(int x, int y) {
	    this.x = x;
	    this.y = y;
	    this.setText(Integer.toString(number));
	}
	
    public void changeNumber(int number) {
        this.number = number;
        updateText(); // Add this line to update the text when the number changes
    }

    private void updateText() {
        this.setText(Integer.toString(number));
    }
}
