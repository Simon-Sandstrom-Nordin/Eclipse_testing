package Eclipse_testing.love_code_del_C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyButton extends JButton{
    Color color1 = Color.BLACK;
    Color color2 = Color.WHITE;
    String text1 = "1";
    String text2 = "2";
    Ear ear = new Ear(this);
    int state = 0;
    public MyButton (Color color1, Color color2, String text1, String text2) {
        this.color1 = color1;
        this.color2 = color2;
        this.text1 = text1;
        this.text2 = text2;
        this.setText(text1);
        this.setBackground(color1);
    }

    public void ToggleState() {
        if(this.state == 0) {
            this.setBackground(color2);
            this.setText(text2);
            this.state = 1;
        }
        else {
            this.setBackground(color1);
            this.setText(text1);
            this.state = 0;
        }
    }
}
