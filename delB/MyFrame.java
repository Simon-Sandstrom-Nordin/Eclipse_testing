package Eclipse_testing.delB;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    static JFrame frame = new JFrame("Simon SN");
    static MyButton button1 = new MyButton("State 1", "State 2", Color.blue, Color.red);
    static MyButton button2 = new MyButton("State A", "State B", Color.green, Color.magenta);


    public static void main(String []args) {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        Icon icon = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/nomi2.png");
        JLabel label = new JLabel(icon);
        
        frame.add(label);

        // frame.getContentPane().setBackground(Color.black);
        frame.setSize(600, 600);
        button1.setSize(100 , 80);
        button1.setLocation(80 , 180);
        button1.addActionListener(button1);
        label.add(button1);
        button2.setSize(100 , 80);
        button2.setLocation(360 , 180);
        button2.addActionListener(button2);
        label.add(button2);
        //frame.pack();

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
