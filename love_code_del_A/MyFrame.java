package Eclipse_testing.love_code_del_A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    MyButton button1 = new MyButton(Color.black, Color.white, "svart", "vit");
    MyButton button2 = new MyButton(Color.red, Color.blue, "röd", "blå");
    public MyFrame() {
        setTitle("love");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLayout(new GridLayout(0, 2));
        add(button1);
        add(button2);
        setVisible(true);
        button1.addActionListener(this);
        button2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        MyButton button = (MyButton)e.getSource();
        button.ToggleState();
    }
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}