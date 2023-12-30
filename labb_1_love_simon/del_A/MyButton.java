package Eclipse_testing.labb_1_love_simon.del_A;

import javax.swing.*;

import java.awt.Color;
import java.util.Objects;

public class MyButton extends JButton {

    String text1 = "State 1";
    String text2 = "State 2";
    Color color1 = Color.blue;
    Color color2 = Color.red;
    int state = 1;
    
    public MyButton(String text1, String text2, Color initialColor, Color excitedColor) {
        this.text1 = text1;
        this.text2 = text2;
        this.color1 = initialColor;
        this.color2 = excitedColor;
        this.setText(text1);
        this.setBackground(initialColor);
    }
    
    public void toggleState() {
        if (this.state == 1) {
            this.setBackground(color2);
            this.setText(text2);
            this.state = 2;
        }
        else {
            this.setBackground(color1);
            this.setText(text1);
            this.state = 1;
        }
    }

}
