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
import javax.swing.JTextField;

public class ViewControl extends JFrame implements ActionListener {

	// private JFrame frame = new JFrame("Simon SN");
	private Boardgame game;
	private int size;
	private Square[][] board;        // Square är subklass till JButton
	private JTextField mess = new JTextField();  // JLabel funkar också
	
	public ViewControl (Boardgame game, int n){  // OK med fler parametrar om ni vill!
		this.game = game;
	    this.size = n;
	    this.board = new Square[n][n];
	    
	    this.setTitle("Simon SN");
	    // for (int i = 0; i < n; i++) {
	    //    for (int j = 0; j < n; j++) {
	    //        board[i][j] = new Square(i, j);
	    //        board[i][j].addActionListener(this); // Add ActionListener
	    //        add(board[i][j]);
	    //    }
	    //}
	    
	    add(mess); // Add message field
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
        // Icon icon = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/nomi2.png");
        // JLabel label = new JLabel(icon);
        
        // this.add(label);

        // frame.getContentPane().setBackground(Color.black);
        this.setSize(600, 600);
        setLayout(new GridLayout(n, n));
        int buttonSize = 50; // Set the size you want
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = new Square(i, j);
                board[i][j].setPreferredSize(new Dimension(buttonSize, buttonSize)); // Set preferred size
                board[i][j].addActionListener(this); // Add ActionListener
                add(board[i][j]);
            }
        }


        
        //button1.setSize(100 , 80);
        //button1.setLocation(80 , 180);
        //label.add(button1);
        //button2.setSize(100 , 80);
        //button2.setLocation(360 , 180);
        //label.add(button2);
        //frame.pack();

        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
