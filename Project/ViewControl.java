package Eclipse_testing.Project;

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

	private JFrame frame = new JFrame();
	private Square[][] board = new Square[8][8];
	
	public ViewControl (){    
	    this.setTitle("the Retarded Intelligent Chess Board (RICB) by Simon SN");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
        
	    Icon icon = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/nomi2.png");
	    // Icons
	    Icon white_king = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/white_king.png");
	    Icon white_queen = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/white_queen.png");
	    Icon white_rook = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/white_rook.png");
	    Icon white_bishop = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/white_bishop.png");
	    Icon white_knight = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/white_knight.png");
	    Icon white_pawn = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/white_pawn.png");
	    Icon black_king = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/black_king.png");
	    Icon black_queen = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/black_queen.png");
	    Icon black_rook = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/black_rook.png");
	    Icon black_bishop = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/black_bishop.png");
	    Icon black_knight = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/black_knight.png");
	    Icon black_pawn = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/Project/chessPieces/black_pawn.png");
	    
	    // JLabel label = new JLabel(icon);
        
        // this.add(label);

        // frame.getContentPane().setBackground(Color.black);
        this.setSize(600, 600);
        setLayout(new GridLayout(8, 8));
        int buttonSize = 50; // Set the size you want
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
            	// System.out.println(Integer.toString(i) + ":" + Integer.toString(j));
            	if (i == 0) {
            		if (j == 0 || j == 7) {board[i][j] = new Square(null, black_rook);}
            		if (j == 1 || j == 6) {board[i][j] = new Square(null, black_knight);}
            		if (j == 2 || j == 5) {board[i][j] = new Square(null, black_bishop);}	
            		if (j == 3) {board[i][j] = new Square(null, black_queen);}
            		if (j == 4) {board[i][j] = new Square(null, black_king);}
            	}
            	if (i == 1) {board[i][j] = new Square(null, black_pawn);}
            	if (i == 2 || i == 3 || i == 4 || i == 5) {board[i][j] = new Square(null, null);}
            	if (i == 6) {board[i][j] = new Square(null, white_pawn);}
            	if (i == 7) {
            		if (j == 0 || j == 7) {board[i][j] = new Square(null, white_rook);}
            		if (j == 1 || j == 6) {board[i][j] = new Square(null, white_knight);}
            		if (j == 2 || j == 5) {board[i][j] = new Square(null, white_bishop);}	
            		if (j == 3) {board[i][j] = new Square(null, white_queen);}
            		if (j == 4) {board[i][j] = new Square(null, white_king);}
            	}
            	
                board[i][j].setPreferredSize(new Dimension(buttonSize, buttonSize)); // Set preferred size
                board[i][j].addActionListener(this); // Add ActionListener
                add(board[i][j]);
            }
        }

        this.setVisible(true);
        // this.setLocationRelativeTo(null);
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// not yet
	}
	
}
