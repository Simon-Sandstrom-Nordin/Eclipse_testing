package Eclipse_testing.Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewControl extends JFrame implements ActionListener {

	private Square[][] board = new Square[8][8];
	private int counter = 0;
	private int[] list_i = {0,0};
    private int[] list_e = {0,0};
    private String[] black_pieces = {"black_rook", "black_knight", "black_bishop", "black_queen", "black_king", "black_pawn"};
	private String[] white_pieces = {"white_rook", "white_knight", "white_bishop", "white_queen", "white_king", "white_pawn"};
    private List<String> blackPiecesList = Arrays.asList(black_pieces);
    private List<String> whitePiecesList = Arrays.asList(white_pieces);
	
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
            		if (j == 0 || j == 7) {board[i][j] = new Square("black_rook", black_rook);}
            		if (j == 1 || j == 6) {board[i][j] = new Square("black_knight", black_knight);}
            		if (j == 2 || j == 5) {board[i][j] = new Square("black_bishop", black_bishop);}	
            		if (j == 3) {board[i][j] = new Square("black_queen", black_queen);}
            		if (j == 4) {board[i][j] = new Square("black_king", black_king);}
            	}
            	if (i == 1) {board[i][j] = new Square("black_pawn", black_pawn);}
            	if (i == 2 || i == 3 || i == 4 || i == 5) {board[i][j] = new Square(null, null);}
            	if (i == 6) {board[i][j] = new Square("white_pawn", white_pawn);}
            	if (i == 7) {
            		if (j == 0 || j == 7) {board[i][j] = new Square("white_rook", white_rook);}
            		if (j == 1 || j == 6) {board[i][j] = new Square("white_knight", white_knight);}
            		if (j == 2 || j == 5) {board[i][j] = new Square("white_bishop", white_bishop);}	
            		if (j == 3) {board[i][j] = new Square("white_queen", white_queen);}
            		if (j == 4) {board[i][j] = new Square("white_king", white_king);}
            	}
            	
                board[i][j].setPreferredSize(new Dimension(buttonSize, buttonSize)); // Set preferred size
                board[i][j].addActionListener(this); // Add ActionListener
                add(board[i][j]);
            }
        }

        this.setVisible(true);
        // this.setLocationRelativeTo(null);
        
        // user does (dance? haha) moves?
        
        // move e2 to e4
        // this.move(1, 4, 3, 4);
        
        // game loop
        //Boolean gameInProgress = true;
        //while (gameInProgress) {
        //	int[] list_i = {1,3};
        //	int[] list_e = {3,4};
        //	this.move(list_i[0],  list_i[1], list_e[0], list_e[1]);
        //}
        
	}
	
	private void move(int x_init, int y_init, int x_end, int y_end) {
		board[x_end][y_end].changePiece(board[x_init][y_init].piece, board[x_init][y_init].icon);
		// System.out.println(board[x_init][y_init].piece);
		board[x_init][y_init].changePiece(null, null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    for (int i = 0; i < 8; i++) {	// check board for source of click
	        for (int j = 0; j < 8; j++) {
	            if (e.getSource() == board[i][j]) {
	            	if (counter == 0) {
	            		//System.out.println(board[i][j].piece);
	            		//System.out.println(board[i][j].piece == null);
	            		//System.out.println(board[i][j].piece == "");
	            		if (board[i][j].piece == null) {
	            		} else {
	            		list_i[0] = i;
	            		list_i[1] = j;
	            		board[i][j].setBackground(Color.orange);
	            		counter++;
	            		}
	            	} else if (counter == 1) {
	            		list_e[0] = i;
	            		list_e[1] = j;
	            		if (isValidMove(board[list_i[0]][list_i[1]].piece, list_i[0], list_i[1], board[list_e[0]][list_e[1]].piece, list_e[0], list_e[1])) {
		            	this.move(list_i[0],  list_i[1], list_e[0], list_e[1]);
	            		board[list_i[0]][list_i[1]].setBackground(null);
	            		counter++;
	            		}
	            	}
	            	//System.out.println(i);
	            	//System.out.println(j);
	            	// board[i][j].move(i, j); // Call move method from Boardgame
	            }
	        }
	    }
		counter = counter % 2;
	}

	private boolean isValidMove(String piece_initial, int x_i, int y_i, String piece_end, int x_e, int y_e) {
		// It's not code repetition - it's code apartheid
	    if (blackPiecesList.contains(piece_initial)) {
	    	if (blackPiecesList.contains(piece_end)) {
	    		return false;	// friendly fire
	    	}
	    	if (piece_initial == "black_king") {
	    		if (Math.abs(x_i-x_e) > 1) {
	    			return false;
	    		} else if (Math.abs(y_i-y_e) > 1) {
	    			return false;
	    		} else if (Math.abs(x_i-x_e) == 1 && Math.abs(y_i-y_e) == 1) {
	    			return true;
	    		}
	    	}
	    	

	    	} else {
	    	if (whitePiecesList.contains(piece_end)) {
	    		return false;	// friendly fire
	    	}
	    	if (piece_initial == "white_king") {
	    		if (Math.abs(x_i-x_e) > 1) {
	    			return false;
	    		} else if (Math.abs(y_i-y_e) > 1) {
	    			return false;
	    		} else if (Math.abs(x_i-x_e) == 1 && Math.abs(y_i-y_e) == 1) {
	    			return true;
	    		}
	    	}
	    }
	    
	    return true;
	}

}
