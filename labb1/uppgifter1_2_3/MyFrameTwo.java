package Eclipse_testing.labb1.uppgifter1_2_3;
import javax.swing.*;

import Eclipse_testing.labb_1_love_simon.del_A.MyButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameTwo extends JFrame{

	public MyFrameTwo() {
	       setTitle("Simon SN & Love N");
	       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	       setSize(500, 400);
	       setLayout(new GridLayout(0, 2));
	       getContentPane().setBackground(Color.orange);
	}
	
}
