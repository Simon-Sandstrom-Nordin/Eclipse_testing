package Eclipse_testing.labb3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.*;

class RPSSkel extends JFrame implements ActionListener {
    Gameboard myboard, computersboard;
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    JButton closebutton;

    RPSSkel() {
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	closebutton = new JButton("Close");
    	myboard = new Gameboard("Myself", this); // Must be changed
    	computersboard = new Gameboard("Computer", this) {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//
    		}
    	};
    	JPanel boards = new JPanel();
    	boards.setLayout(new GridLayout(1,2));
    	boards.add(myboard);
    	boards.add(computersboard);
    	add(boards, BorderLayout.CENTER);
    	add(closebutton, BorderLayout.SOUTH);
    	setSize(350, 650);
    	setVisible(true);
		Client clientObj = new Client();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
