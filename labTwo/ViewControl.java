package Eclipse_testing.labTwo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

class ViewControl extends JFrame implements ActionListener {

	private Boardgame game;
	private int size;
	private Square[][] board;        // Square är subklass till JButton
	private JTextField mess = new JTextField();  // JLabel funkar också
	
	public ViewControl (Boardgame game, int n){  // OK med fler parametrar om ni vill!
		this.game = game;
	    this.size = n;
	    this.board = new Square[n][n];
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            board[i][j] = new Square(i, j);
	            board[i][j].addActionListener(this); // Add ActionListener
	            add(board[i][j]);
	        }
	    }
	    
	    add(mess); // Add message field
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    for (int i = 0; i < size; i++) {	// check board for source of click
	        for (int j = 0; j < size; j++) {
	            if (e.getSource() == board[i][j]) {
	                game.move(i, j); // Call move method from Boardgame
	                // updateView(); // Update the view after the move
	            }
	        }
	    }
		
	}
	
	// private void updateView() {	// update button texts
	// }
	
}
