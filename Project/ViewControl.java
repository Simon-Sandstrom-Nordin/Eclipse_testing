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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewControl extends JFrame implements ActionListener {

	private Square[][] board = new Square[8][8];
	private JTextField mess = new JTextField("Aschente! Turn 1, white to move, to cancel move: reclick chosen piece");
	private int choice_counter = 0;	// for technical reasons we need to keep track of if we're choosing a piece or a destination for a piece
	private int turn_counter = 1;
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
	    
	    // Icon icon = new ImageIcon("C:/Users/manip/eclipse-workspace/Eclipse_testing/src/Eclipse_testing/nomi2.png");
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
        // this.setSize(600, 600);
        // setLayout(new GridLayout(8, 8));
        JPanel buttonPanel = new JPanel(new GridLayout(8, 8));
        
        int buttonSize = 75; // Set the size you want
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
                buttonPanel.add(board[i][j]);
            }
        }

        
    	JPanel messagePanel = new JPanel(new BorderLayout());
    	messagePanel.add(mess, BorderLayout.CENTER);
        this.add(messagePanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
	
	// helper function to mark valid destination tiles
	private void mark(int x_init, int y_init) {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				if (isValidMove(board[x_init][y_init].piece, x_init, y_init, board[x][y].piece, x, y)) {
	        		board[x][y].setBackground(Color.red);
				}
			}
		}
		board[x_init][y_init].setBackground(Color.orange);
	}
	
	private void unMark() {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
	        	board[x][y].setBackground(null);
			}
		}
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
	            	if (choice_counter == 0) {
	            		//System.out.println(board[i][j].piece);
	            		//System.out.println(board[i][j].piece == null);
	            		//System.out.println(board[i][j].piece == "");
	            		
	            		// Divide into two cases, depending on whether it's white or black's turn to move
	                	if (turn_counter % 2 == 0) {	// black to move
		            		if (blackPiecesList.contains(board[i][j].piece)) {
			            		list_i[0] = i;
			            		list_i[1] = j;
			            		board[i][j].setBackground(Color.orange);
			            		mark(i, j);
			            		choice_counter++;
		            		}
	                	} else if (turn_counter % 2 == 1) // white to move
		            		if (whitePiecesList.contains(board[i][j].piece)) {
			            		list_i[0] = i;
			            		list_i[1] = j;
			            		board[i][j].setBackground(Color.orange);
			            		mark(i, j);
			            		choice_counter++;
		            		}
	                	} else {
	            		list_e[0] = i;
	            		list_e[1] = j;
	            		
	            		// cancel move if you click on the same piece
	            		if (list_i[0] == list_e[0] && list_i[1] == list_e[1]) {
	                    	unMark();
	            			choice_counter++;
	            			choice_counter = choice_counter % 2;
	            		}
	            		if (isValidMove(board[list_i[0]][list_i[1]].piece, list_i[0], list_i[1], board[list_e[0]][list_e[1]].piece, list_e[0], list_e[1])) {
		            	this.move(list_i[0],  list_i[1], list_e[0], list_e[1]);
		            	unMark();
	            		choice_counter++;
	                	turn_counter += 1;
	                	if (turn_counter % 2 == 0) {
		                    mess.setText("Turn: " + Integer.toString(turn_counter) + ", black to move, to cancel move: reclick chosen piece");
	                	} else {
	                		mess.setText("Turn: " + Integer.toString(turn_counter) + ", white to move, to cancel move: reclick chosen piece");
	                	}
	            		}
	            	}

	            	//System.out.println(i);
	            	//System.out.println(j);
	            	// board[i][j].move(i, j); // Call move method from Boardgame
	            }
	        }
		}
	choice_counter = choice_counter % 2;
	}

	// It's not code repetition - it's code apartheid
	private boolean isValidMove(String piece_initial, int x_i, int y_i, String piece_end, int x_e, int y_e) {
				
		
	    if (blackPiecesList.contains(piece_initial)) {
	    	if (blackPiecesList.contains(piece_end)) {
	    		return false;	// friendly fire
	    	}
	    	if (piece_initial == "black_king") {
	    		if (Math.abs(x_i-x_e) > 1) {
	    			return false;
	    		} else if (Math.abs(y_i-y_e) > 1) {
	    			return false;
	    		} else {
	    			return true;
	    		}
	    	}
	    	if (piece_initial == "black_knight") {
	    		if ((Math.abs(x_i-x_e) == 1 || Math.abs(x_i-x_e) == 2) && (Math.abs(y_i-y_e) == 1 || Math.abs(y_i-y_e) == 2) && (Math.abs(x_i-x_e) != Math.abs(y_i-y_e)))  {
	    			return true;
	    		} else {
	    			return false;
	    		}
	    	}
	    	if (piece_initial == "black_rook") {
	    		if (Math.abs(x_i-x_e) == 0 || Math.abs(y_i-y_e) == 0) {	// zero in some direction
	    			if (Math.abs(y_i-y_e) == 0) {	// move in x-direction, horizontal move
	    				if (x_e - x_i > 0) {	// move in positive x direction
		    				for (int x = x_i+1; x < x_e; x++) {
		    					if (board[x][y_e].piece != null) {
		    						return false;	// there's a piece in the way
		    					}
		    				}
	    				} else if (x_e - x_i < 0) {	// move in negative x direction
	    					for (int x = x_i-1; x > x_e; x--) {
	    						if (board[x][y_e].piece != null) {
	    							return false;	// there's a piece in the way
	    						}
	    					}
	    				}
	    			} else { // move in y-direction, horizontal move
	    				if (y_e - y_i > 0) {	// move in positive y direction
	    					for (int y = y_i+1; y < y_e; y++) {
	    						if (board[x_e][y].piece != null) {
	    							return false;	// there's a piece in the way
	    						}
	    					}
	    				} else if (y_e - y_i < 0) {	// move in negative direction
		    				for (int y = y_i-1; y > y_e; y--) {
		    					if (board[x_e][y].piece != null) {
			    					return false;	// there's a piece in the way
			    				}
		    				}
	    				}
	    			}
	    		} else {	// move that is not strictly either vertical or horizontal
	    			return false;
	    		}
	    	}
	    	
	    	if (piece_initial == "black_bishop") {
	    		if (Math.abs(x_e - x_i) == Math.abs(y_e-y_i)) {	// need to be equidistant in x and y, i.e. diagonal move
	    			if (x_e-x_i > 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i + 1; x < x_e; x++, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i > 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i - 1; x < x_e; x++, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i - 1; x > x_e; x--, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i + 1; x > x_e; x--, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			}
	    		} else {	// move that is not diagonal
	    			return false;
	    		}
	    		
	    	}
	    	
	    	if (piece_initial == "black_queen") {
	    		if (Math.abs(x_e - x_i) == Math.abs(y_e-y_i)) {	// need to be equidistant in x and y, i.e. diagonal move
	    			if (x_e-x_i > 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i + 1; x < x_e; x++, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i > 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i - 1; x < x_e; x++, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i - 1; x > x_e; x--, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i + 1; x > x_e; x--, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			}
	    		} else if (Math.abs(x_i-x_e) == 0 || Math.abs(y_i-y_e) == 0) {	// zero in some direction
		    			if (Math.abs(y_i-y_e) == 0) {	// move in x-direction, horizontal move
		    				if (x_e - x_i > 0) {	// move in positive x direction
			    				for (int x = x_i+1; x < x_e; x++) {
			    					if (board[x][y_e].piece != null) {
			    						return false;	// there's a piece in the way
			    					}
			    				}
		    				} else if (x_e - x_i < 0) {	// move in negative x direction
		    					for (int x = x_i-1; x > x_e; x--) {
		    						if (board[x][y_e].piece != null) {
		    							return false;	// there's a piece in the way
		    						}
		    					}
		    				}
		    			} else { // move in y-direction, horizontal move
		    				if (y_e - y_i > 0) {	// move in positive y direction
		    					for (int y = y_i+1; y < y_e; y++) {
		    						if (board[x_e][y].piece != null) {
		    							return false;	// there's a piece in the way
		    						}
		    					}
		    				} else if (y_e - y_i < 0) {	// move in negative direction
			    				for (int y = y_i-1; y > y_e; y--) {
			    					if (board[x_e][y].piece != null) {
				    					return false;	// there's a piece in the way
				    				}
			    				}
		    				}
		    			}
		    		} else {	// move that is not strictly either vertical or horizontal
		    			return false;
		    		}
	    		}
	    		
	    		if (piece_initial == "black_pawn") {
	    			// System.out.print(y_e);
	    			// System.out.print(y_i);
	    			// System.out.print(x_e);
	    			// System.out.print(x_i);
	    			// illegal moves
	    			if (x_e == x_i || Math.abs(y_e - y_i) > 1 || x_i > x_e || (Math.abs(y_e - y_i) == 1 && whitePiecesList.contains(piece_end) == false) || x_e - x_i > 2) {
	    				return false;
	    			}
	    			
	    			// diagonal 1 step capture
	    			else if (whitePiecesList.contains(piece_end)) {
	    				if (x_e - x_i != 1 || Math.abs(y_e - y_i) != 1) {
	    					return false;
	    				}
	    			}
	    			// initial 2 step
	    			else if (x_e - x_i == 2 && (Math.abs(y_e - y_i) != 0 || x_i != 1  || board[x_e-1][y_e].piece != null)) {
	    				return false;
	    			}
	    			// normal 1 step
	    			else if (x_e - x_i == 1 && Math.abs(y_e - y_i) != 0) {
    					return false;
    				}

	    			
	    			// promotion <- not required for lower grades, maybe later
	    			// en passant <- not required :D
	    		
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
	    		} else {
	    			return true;
	    		}
	    	}
	    	if (piece_initial == "white_knight") {
	    		if ((Math.abs(x_i-x_e) == 1 || Math.abs(x_i-x_e) == 2) && (Math.abs(y_i-y_e) == 1 || Math.abs(y_i-y_e) == 2) && (Math.abs(x_i-x_e) != Math.abs(y_i-y_e)))  {
	    			return true;
	    		} else {
	    			return false;
	    		}
	    	}
	    	if (piece_initial == "white_rook") {
	    		if (Math.abs(x_i-x_e) == 0 || Math.abs(y_i-y_e) == 0) {	// zero in some direction
	    			if (Math.abs(y_i-y_e) == 0) {	// move in x-direction, horizontal move
	    				if (x_e - x_i > 0) {	// move in positive x direction
		    				for (int x = x_i + 1; x < x_e; x++) {
		    					if (board[x][y_e].piece != null) {
		    						return false;	// there's a piece in the way
		    					}
		    				}
	    				} else if (x_e - x_i < 0) {	// move in negative x direction
	    					for (int x = x_i - 1; x > x_e; x--) {
	    						if (board[x][y_e].piece != null) {
	    							return false;	// there's a piece in the way
	    						}
	    					}
	    				}
	    			} else { // move in y-direction, horizontal move
	    				if (y_e - y_i > 0) {	// move in positive y direction
	    					for (int y = y_i+1; y < y_e; y++) {
	    						if (board[x_e][y].piece != null) {
	    							return false;	// there's a piece in the way
	    						}
	    					}
	    				} else if (y_e - y_i < 0) {	// move in negative direction
		    				for (int y = y_i-1; y > y_e; y--) {
		    					if (board[x_e][y].piece != null) {
			    					return false;	// there's a piece in the way
			    				}
		    				}
	    				}
	    			}
	    		} else {	// move that is not strictly either vertical or horizontal
	    			return false;
	    		}
	    	}
	    	
	    	if (piece_initial == "white_bishop") {
	    		if (Math.abs(x_e - x_i) == Math.abs(y_e-y_i)) {	// need to be equidistant in x and y, i.e. diagonal move
	    			if (x_e-x_i > 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i + 1; x < x_e; x++, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i > 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i - 1; x < x_e; x++, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i - 1; x > x_e; x--, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i + 1; x > x_e; x--, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			}
	    		} else {	// move that is not diagonal
	    			return false;
	    		}
	    	}
	    	
	    	if (piece_initial == "white_queen") {
	    		if (Math.abs(x_e - x_i) == Math.abs(y_e-y_i)) {	// need to be equidistant in x and y, i.e. diagonal move
	    			if (x_e-x_i > 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i + 1; x < x_e; x++, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i > 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i + 1, y = y_i - 1; x < x_e; x++, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i < 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i - 1; x > x_e; x--, y--) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			} else if (x_e-x_i < 0 && y_e - y_i > 0) {	// move along positive x and y diagonal
		    			for (int x = x_i - 1, y = y_i + 1; x > x_e; x--, y++) {
		    				if (board[x][y].piece != null) {
		    					return false;	// there's a piece in the way
		    				}
		    			}
	    			}
	    		} else if (Math.abs(x_i-x_e) == 0 || Math.abs(y_i-y_e) == 0) {	// zero in some direction
		    			if (Math.abs(y_i-y_e) == 0) {	// move in x-direction, horizontal move
		    				if (x_e - x_i > 0) {	// move in positive x direction
			    				for (int x = x_i+1; x < x_e; x++) {
			    					if (board[x][y_e].piece != null) {
			    						return false;	// there's a piece in the way
			    					}
			    				}
		    				} else if (x_e - x_i < 0) {	// move in negative x direction
		    					for (int x = x_i-1; x > x_e; x--) {
		    						if (board[x][y_e].piece != null) {
		    							return false;	// there's a piece in the way
		    						}
		    					}
		    				}
		    			} else { // move in y-direction, horizontal move
		    				if (y_e - y_i > 0) {	// move in positive y direction
		    					for (int y = y_i+1; y < y_e; y++) {
		    						if (board[x_e][y].piece != null) {
		    							return false;	// there's a piece in the way
		    						}
		    					}
		    				} else if (y_e - y_i < 0) {	// move in negative direction
			    				for (int y = y_i-1; y > y_e; y--) {
			    					if (board[x_e][y].piece != null) {
				    					return false;	// there's a piece in the way
				    				}
			    				}
		    				}
		    			}
		    		} else {	// move that is not strictly either vertical or horizontal
		    			return false;
		    		}
	    	}
    		if (piece_initial == "white_pawn") {
    			// System.out.print(y_e);
    			// System.out.print(y_i);
    			// System.out.print(x_e);
    			// System.out.print(x_i);
    			// illegal moves
    			if (x_e == x_i || Math.abs(y_e - y_i) > 1 || x_i < x_e || (Math.abs(y_e - y_i) == 1 && blackPiecesList.contains(piece_end) == false) || x_i - x_e > 2) {
    				return false;
    			}
    			
    			// diagonal 1 step capture
    			else if (blackPiecesList.contains(piece_end)) {
    				if (x_i - x_e != 1 || Math.abs(y_e - y_i) != 1) {
    					return false;
    				}
    			}
    			// initial 2 step
    			else if (x_i - x_e == 2 && (Math.abs(y_e - y_i) != 0 || x_i != 6 || board[x_e+1][y_e].piece != null)) {
    				return false;
    			}
    			// normal 1 step
    			else if (x_i - x_e == 1 && Math.abs(y_e - y_i) != 0) {
					return false;
				}

    			
    			// promotion <- not required for lower grades, maybe later
    			// en passant <- not required :D
    		
    		}
	    		
	    }
	    return true;
	}

}
