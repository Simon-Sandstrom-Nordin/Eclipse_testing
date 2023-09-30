package Eclipse_testing.labTwo_tinkerFolder2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewControl extends JFrame implements ActionListener {

	private Boardgame game;
	private int size;
	private Square[][] board;
	private JTextField mess = new JTextField("Aschente!");
	int buttonSize = 80; // Set the size you want
	
	public ViewControl (Boardgame game, int n){
		this.game = game;
	    this.size = n;
	    this.board = new Square[n][n];
	    
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
        // Icon icon = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/nomi2.png");
        // JLabel label = new JLabel(icon);
        // this.add(label);
        // frame.getContentPane().setBackground(Color.black);
        // this.setLayout(new GridLayout(n, n));
        
        JPanel buttonPanel = new JPanel(new GridLayout(n, n));
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = new Square(i, j);
                board[i][j].changeNumber(Integer.parseInt(game.getStatus(i, j)));
                board[i][j].setPreferredSize(new Dimension(buttonSize, buttonSize)); // Set preferred size
                board[i][j].addActionListener(this); // Add ActionListener
                buttonPanel.add(board[i][j]);
            }
        }
		// add(mess);

    	JPanel messagePanel = new JPanel(new BorderLayout());
    	messagePanel.add(mess, BorderLayout.CENTER);
        
        this.add(buttonPanel, BorderLayout.NORTH);
        this.add(messagePanel, BorderLayout.SOUTH);
    	
        // this.setSize(600, 600);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
	 }
	

	
	private void update() {
		// this.getContentPane().removeAll();
		// this.revalidate();
		// this.repaint();
        // for (int i = 0; i < this.size; i++) {
        //     for (int j = 0; j < this.size; j++) {
        //         board[i][j] = new Square(i, j);
        //         board[i][j].changeNumber(Integer.parseInt(game.getStatus(i, j)));
        //         board[i][j].setPreferredSize(new Dimension(buttonSize, buttonSize)); // Set preferred size
        //         board[i][j].addActionListener(this); // Add ActionListener
        //         add(board[i][j]);
        //     }
        // }
		// add(mess);
		
        // No need to recreate the whole board, just update the numbers
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                board[i][j].changeNumber(Integer.parseInt(game.getStatus(i, j)));
            }
        }
        
        this.setVisible(true);
        // No need to force the user to have it at the center if they choose to move it
        // this.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    for (int i = 0; i < size; i++) {	// check board for source of click
	        for (int j = 0; j < size; j++) {
	            if (e.getSource() == board[i][j]) {
	            	game.move(i, j);
	                mess.setText(game.getMessage());
	            	//game.move(i, j); // Call move method from Boardgame
	                // updateView(); // Update the view after the move
	            }
	        }
	    }
        this.update();
	}
	
	
}
