package Eclipse_testing;

import javax.swing.*;

import java.awt.Color;
import java.util.Objects;

public class MyButtonA extends JButton {

    String text1 = "State 1";
    String text2 = "State 2";
    Color color1 = Color.blue;
    Color color2 = Color.red;
    String currentText = text1;
    
    public MyButtonA(String text1, String text2, Color initialColor, Color excitedColor) {
        this.text1 = text1;
        this.text2 = text2;
        this.color1 = initialColor;
        this.color2 = excitedColor;
        this.currentText = text1;
        this.setText(currentText);
        this.setBackground(initialColor);
    }
    

	public void main(String []args) {
    	this.setBackground(Color.blue);
    	this.setText(currentText);
    }
    
    public void toggleState() {
        if (Objects.equals(currentText, text1)) {
        	this.setBackground(this.color2);
            this.setText(this.text2);
            this.currentText = text2;
        } else {
        	this.setBackground(this.color1);
            this.setText(this.text1);
            this.currentText = text1;
        }
    }

}
