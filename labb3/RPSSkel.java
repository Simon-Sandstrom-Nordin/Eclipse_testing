package Eclipse_testing.labb3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.*;

class RPSSkel extends JFrame {
    Gameboard myboard, computersboard;
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    JButton closebutton;
    private Map<String, String> beats = new HashMap<>();

    RPSSkel() {
    	try {
    		socket = new Socket("localhost", 4713);
	        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        
	    	beats.put("STEN", "SAX");   // Rock crushes Scissors
	    	beats.put("SAX", "PASE");   // Scissors cuts Paper
	    	beats.put("PASE", "STEN");  // Paper covers Rock
	    	
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	closebutton = new JButton("Close");
	    	computersboard = new Gameboard("Computer") {
	   		 @Override
	   		    public void actionPerformed(ActionEvent e) {
	   			 // Do nothing. User can't push computer's game's buttons
	   		 }
	    	};
	    	myboard = new Gameboard("Simon") {
	    		
	    	    @Override
	    	    public void actionPerformed(ActionEvent e) {
	    	        JButton pressedButton = (JButton) e.getSource();
	    	        if (this.counter < 2) {
	    	        	this.counter++;
	    	        	if (counter == 1) {
	    	        		lowerMess.setText("win/lose/draw");
	    	                computersboard.lowerMess.setText("win/lose/draw");
	    	                upperMess.setText("RPS");
	    	                computersboard.upperMess.setText("RPS");
	    	                resetColor();
	    	                computersboard.resetColor();
	    	        	}
	    	            // Update the countdown message
	    	            String countdownMessage = (counter == 1) ? "Ett ..." : "Två ...";
	    	            computersboard.setLower(countdownMessage);
	    	            setLower(countdownMessage);
	    	        } else {
	    	            
	    	            	markPlayed(pressedButton);
	    	                out.println("user");
	    	                try {
								String computerHello = in.readLine();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
	    	                
	    	                String userMove = map.get(e.getSource());
	    	                out.println(userMove);
	
	    	                String computerMove = null;
							try {
								computerMove = in.readLine();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
	    	                computersboard.markPlayed(computersboard.mapInverse.get(computerMove));
	    	                System.out.println("My move is " + userMove);
	    	                System.out.println("Computer move is " + computerMove);
	    	                upperMess.setText(userMove);
	    	                computersboard.upperMess.setText(computerMove);
	    	                
	    	                // game logic:
	    	                if (computerMove.equals(userMove)) {
	    	                	System.out.println("Draw");
	        	                setLower("Draw");
	        	                computersboard.setLower("Draw");
	    	                } else if (beats.get(userMove).equals(computerMove)) {
	    	                	System.out.println("User win");
	    	                	wins();
	    	                	setLower("Win");
	    	                	computersboard.setLower("Lose");  
	    	                } else {
	    	                	System.out.println("User loss");
	    	                	computersboard.wins();
	    	                	computersboard.setLower("Win");
	    	                	setLower("Lose");
	    	                }
	
	    	                // Reset counter and update UI for next round
	    	                counter = 0;
	    	        }         
	    	    }
	    	};
	    	
    	} catch(IOException ex) {
    		System.err.println(ex);
    		myboard.setLower("Connection error");
    		computersboard.setLower("Connection error");
    	    // Reset counter for the next try
    	    myboard.counter = 0;
    	}
    	
    	JPanel boards = new JPanel();
    	boards.setLayout(new GridLayout(1,2));
    	boards.add(myboard);
    	boards.add(computersboard);
    	add(boards, BorderLayout.CENTER);
    	add(closebutton, BorderLayout.SOUTH);
    	closebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Close the socket and streams
                    if (socket != null && !socket.isClosed()) {
                        socket.close();
                    }
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                } catch (IOException ex) {
                    System.err.println("Error while closing: " + ex);
                } finally {
                    // Exit the application
                    System.exit(0);
                }
            }
        });
    	setSize(350, 650);
    	setVisible(true);
    	
    }

}
