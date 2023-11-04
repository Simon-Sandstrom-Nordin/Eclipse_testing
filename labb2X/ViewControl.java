package Eclipse_testing.labb2X;

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
	int buttonSize = 80;
	
	public ViewControl (Boardgame game, int n){
		this.game = game;
	    this.size = n;
	    this.board = new Square[n][n];
	    
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());

        
        JPanel buttonPanel = new JPanel(new GridLayout(n, n));
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = new Square(i, j);
                board[i][j].changeNumber(Integer.parseInt(game.getStatus(i, j)));
                board[i][j].setPreferredSize(new Dimension(buttonSize, buttonSize));
                board[i][j].addActionListener(this);
                buttonPanel.add(board[i][j]);
            }
        }

    	JPanel messagePanel = new JPanel(new BorderLayout());
    	messagePanel.add(mess, BorderLayout.CENTER);
        
        this.add(buttonPanel, BorderLayout.NORTH);
        this.add(messagePanel, BorderLayout.SOUTH);
    	
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
	 }
	

	
	private void update() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                board[i][j].changeNumber(Integer.parseInt(game.getStatus(i, j)));
            }
        }
        this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            if (e.getSource() == board[i][j]) {
	            	game.move(i, j);
	                mess.setText(game.getMessage());
	            }
	        }
	    }
        this.update();
	}
	
}
