package Eclipse_testing.labb1.uppgifter1_2_3;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame() {
        setTitle("Simon SN & Love N");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        getContentPane().setBackground(Color.orange);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
