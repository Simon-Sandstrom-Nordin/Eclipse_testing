package Eclipse_testing.labb_1_love_simon.del_B;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{
    MyButton button1 = new MyButton(Color.black, Color.white, "svart", "vit");
    MyButton button2 = new MyButton(Color.red, Color.blue, "röd", "blå");
    public MyFrame() {
        setTitle("Simon SN & Love N");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLayout(new GridLayout(0, 2));
        button1.addActionListener(button1);
        add(button1);
        button2.addActionListener(button2);
        add(button2);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
