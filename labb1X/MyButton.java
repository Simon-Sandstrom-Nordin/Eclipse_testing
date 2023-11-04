package Eclipse_testing.labb1X;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton{
    Color color1;
    Color color2;
    String text1;
    String text2;
    int state = 1;
    
    public MyButton (Color color1, Color color2, String text1, String text2) {
        this.color1 = color1;
        this.color2 = color2;
        this.text1 = text1;
        this.text2 = text2;
        this.setText(text1);
        this.setBackground(color1);
    }

    public void toggleState() {
        if(this.state == 1) {
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
