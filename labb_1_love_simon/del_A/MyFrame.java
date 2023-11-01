package Eclipse_testing.labb_1_love_simon.del_A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    static MyButton button1 = new MyButton("State 1", "State 2", Color.blue, Color.red);
    static MyButton button2 = new MyButton("State A", "State B", Color.green, Color.magenta);

    
    public MyFrame() {
        setTitle("Simon SN & Love N");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLayout(new GridLayout(0, 2));
        add(button1);
        add(button2);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.toggleState();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.toggleState();
            }
        });
    }

	@Override
	public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
	
}
