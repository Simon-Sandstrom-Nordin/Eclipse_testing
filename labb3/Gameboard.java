package Eclipse_testing.labb3;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Gameboard extends JPanel implements ActionListener {

    private Icon[] icons = {new ImageIcon("C:\\Users\\manip\\eclipse-workspace\\Eclipse_testing\\src\\Eclipse_testing\\labb3\\rock.gif"), 
    new ImageIcon("C:\\Users\\manip\\eclipse-workspace\\Eclipse_testing\\src\\Eclipse_testing\\labb3\\paper.gif"),
	new ImageIcon("C:\\Users\\manip\\eclipse-workspace\\Eclipse_testing\\src\\Eclipse_testing\\labb3\\scissors.gif")};
    

    private JButton[] buttons = new JButton[3];
    private JButton lastPlayed; // remembers last chosen button/gesture
    private String[] texts = {"STEN", "PASE", "SAX"};
    private JLabel upperMess, lowerMess, scorelabel;
    private int score;
    private int counter; // To count ONE ... TWO  and on THREE you play
    private Color bgcolor;
    private HashMap<JButton,String> map = new HashMap<JButton,String>();


    // Constructor that builds the board, used for computers board
    Gameboard(String name, ActionListener listener) {
    	setLayout(new GridLayout(5,1));

    	// Upper JPanel holds players name and last gesture played
    	JPanel upper = new JPanel();
    	upper.setLayout(new GridLayout(2,1));
    	upper.add(new JLabel(name, JLabel.CENTER)); 
    	upperMess = new JLabel("RPS", JLabel.CENTER);
    	upper.add(upperMess);
    	add(upper);

    	// Lower JPanel has messages about the game and score
    	JPanel lower = new JPanel();
    	lower.setLayout(new GridLayout(2,1));
    	lowerMess = new JLabel("win/lose/draw", JLabel.CENTER);
    	scorelabel = new JLabel("Score: 0", JLabel.CENTER);
    	lower.add(lowerMess); lower.add(scorelabel);

    	for (int i = 0; i<3; i++){
    	    buttons[i] = new JButton(texts[i], icons[i]);
    	    buttons[i].setIcon(icons[i]);
    	    buttons[i].setActionCommand(texts[i]);
    	    buttons[i].addActionListener(listener);
    	    add(buttons[i]);
    		// Store each button in a map with its text as key. 
            // Enables us to retrieve the button from a textvalue. 
    		map.put(buttons[i], texts[i]);
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


    // or use JButton as parameter
    void markPlayed(JButton b) {
    	lastPlayed = b; 
    	lastPlayed.setBackground(Color.yellow);
    }

    // add one point and display new score
    void wins() {
    	score++;
    	scorelabel.setText("Score: " + score);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// JButton pressedButton = 
		if (counter < 2) {
			counter += 1;
		} else {
			String userMove = map.get(e.getSource());
			
			counter = 0;
		}
	}

}
