package Eclipse_testing.labb3;

import javax.swing.*;

public class IconExample {
    public static void main(String[] args) {
        // Load the icon from a file
        ImageIcon icon = new ImageIcon("C:\\Users\\manip\\eclipse-workspace\\Eclipse_testing\\src\\Eclipse_testing\\labb3\\paper.gif");

        // Create a JLabel to display the icon
        JLabel label = new JLabel(icon);

        // Create a JFrame to hold the label
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
