package Eclipse_testing.labb3;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.*;

class Gameboard extends JPanel implements ActionListener {

    private Icon[] icons = {new ImageIcon("C:\\Users\\manip\\eclipse-workspace\\Eclipse_testing\\src\\Eclipse_testing\\labb3\\rock.gif"), 
    new ImageIcon("C:\\Users\\manip\\eclipse-workspace\\Eclipse_testing\\src\\Eclipse_testing\\labb3\\paper.gif"),
	new ImageIcon("C:\\Users\\manip\\eclipse-workspace\\Eclipse_testing\\src\\Eclipse_testing\\labb3\\scissors.gif")};
    
    private JButton[] buttons = new JButton[3];
    private JButton lastPlayed; // remembers last chosen button/gesture
    private String[] texts = {"STEN", "PASE", "SAX"};
    protected JLabel upperMess;

	protected JLabel lowerMess;

	private JLabel scorelabel;
    int score;
    int counter; // To count ONE ... TWO  and on THREE you play
    Color bgcolor;
    HashMap<JButton,String> map = new HashMap<JButton,String>();
    HashMap<String,JButton> mapInverse = new HashMap<String,JButton>();

    // Constructor that builds the board, used for computers board
    Gameboard(String name) {
    	setLayout(new GridLayout(5,1));

    	// Upper JPanel holds players name and last gesture played
    	JPanel upper = new JPanel();
    	upper.setLayout(new GridLayout(2,1));
    	upperMess = new JLabel("RPS", JLabel.CENTER);
    	upper.add(new JLabel(name, JLabel.CENTER)); 
    	upper.add(upperMess);
    	add(upper);

    	// Lower JPanel has messages about the game and score
    	JPanel lower = new JPanel();
    	lower.setLayout(new GridLayout(2,1));
    	lowerMess = new JLabel("win/lose/draw", JLabel.CENTER);
    	scorelabel = new JLabel("Score: " + Integer.toString(score), JLabel.CENTER);
    	lower.add(lowerMess);
    	lower.add(scorelabel);

    	for (int i = 0; i<3; i++){
    	    buttons[i] = new JButton(texts[i], icons[i]);
    	    buttons[i].setIcon(icons[i]);
    	    buttons[i].setActionCommand(texts[i]);
    	    // buttons[i].addActionListener(listener);
    	    buttons[i].addActionListener(this);
    	    add(buttons[i]);
    		// Store each button in a map with its text as key. 
            // Enables us to retrieve the button from a textvalue. 
    		map.put(buttons[i], texts[i]);
    		// Stores each text in a map with it's button as a key
    		mapInverse.put(texts[i], buttons[i]);
    	}

    	add(lower); // added after buttons
    	bgcolor = buttons[0].getBackground();
    	lastPlayed = buttons[0]; // arbitrary value at start
    }

    // reset yellow color
    void resetColor() {
    	lastPlayed.setBackground(bgcolor);
    }

    void setUpper(String r) {
    	upperMess.setText(r);
    }

    void setLower(String r) {
    	lowerMess.setText(r);
    }


    // use JButton as parameter
    void markPlayed(JButton b) {
        if (b != null) {
            if (lastPlayed != null) {
                resetColor(); // Reset the color of the previously played button
            }
            lastPlayed = b; 
            lastPlayed.setBackground(Color.yellow);
        }
    }

    // add one point and display new score
    void wins() {
    	score++;
    	scorelabel.setText("Score: " + score);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	// will be overwritten
    }

}
