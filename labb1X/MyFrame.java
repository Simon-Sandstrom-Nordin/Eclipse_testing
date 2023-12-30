package Eclipse_testing.labb1X;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Eclipse_testing.labb1X.MyButton;


public class MyFrame extends JFrame implements ActionListener{
	MyButton[] buttonArray;
    
    public MyFrame(int numberOfButtons, String[] buttonText) {
    	buttonArray = new MyButton[numberOfButtons];
    	
    	for (int b = 0; b < numberOfButtons; b++) {
    		buttonArray[b] = new MyButton(Color.black, Color.white, buttonText[2*b], buttonText[2*b+1]);
    	}
    	
        setTitle("Labb1 X; Simon & Love");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        for (MyButton button : buttonArray) {
        	button.addActionListener(this); 
        	add(button);
        }
        
        setLayout(new GridLayout(0, numberOfButtons));
        setSize(1000, 400);

        setLocationRelativeTo(null);

        setVisible(true);
    }


    	
   	public static void main(String[] args) {
   	    if (args.length < 2 || (args.length - 1) % 2 != 0) {
   	        System.out.println("Usage: java Eclipse_testing.labb1X.MyFrame <numButtons> <text1> <text2> ...");
   	        return;
   	    }

   	    int numberOfButtons = Integer.parseInt(args[0]);
   	    String[] buttonText = new String[args.length - 1];

   	    for (int i = 1; i < args.length; i++) {
   	        buttonText[i - 1] = args[i];
   	    }

   	    MyFrame frame = new MyFrame(numberOfButtons, buttonText);
   	}

	@Override
	public void actionPerformed(ActionEvent e) {
        MyButton button = (MyButton)e.getSource();
        
        for (MyButton buttonInArray : buttonArray) {
        	if (buttonInArray != button) {
        		buttonInArray.toggleState();
        	}
        	
        }
	}
}
