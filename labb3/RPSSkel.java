package Eclipse_testing.labb3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.*;

class RPSSkel extends JFrame implements ActionListener {
    Gameboard myboard, computersboard;
    int counter; // To count ONE ... TWO  and on THREE you play
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    JButton closebutton;

    RPSSkel(Client clientObj) {
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	closebutton = new JButton("Close");
    	myboard = new Gameboard("Myself", this); // Must be changed
    	computersboard = new Gameboard("Computer", this);
    	JPanel boards = new JPanel();
    	boards.setLayout(new GridLayout(1,2));
    	boards.add(myboard);
    	boards.add(computersboard);
    	add(boards, BorderLayout.CENTER);
    	add(closebutton, BorderLayout.SOUTH);
    	setSize(350, 650);
    	setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
