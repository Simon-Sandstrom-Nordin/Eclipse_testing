package Eclipse_testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameA extends JFrame implements ActionListener {

    static JFrame frame = new JFrame("Simon SN");
    static MyButtonA button1 = new MyButtonA("State 1", "State 2", Color.blue, Color.red);
    static MyButtonA button2 = new MyButtonA("State A", "State B", Color.green, Color.magenta);


    public static void main(String []args) {
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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        Icon icon = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/nomi2.png");
        JLabel label = new JLabel(icon);
        
        frame.add(label);

        // frame.getContentPane().setBackground(Color.black);
        frame.setSize(600, 600);
        button1.setSize(100 , 80);
        button1.setLocation(80 , 180);
        label.add(button1);
        button2.setSize(100 , 80);
        button2.setLocation(360 , 180);
        label.add(button2);
        //frame.pack();

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            // e.getSource().toggleState();
        }
}
