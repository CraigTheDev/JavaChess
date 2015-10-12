/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessBoard;

import ChessPieces.*;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kevin
 */
public final class ChessBoard extends JPanel{
    
    
    private final Square[][] grid;
    JLabel label;
    ChessPieces tCP;  
    String img1;
    boolean clicked;
     String i;
      //int y = 0,x= 0;
      
    public ChessBoard() throws IOException{
          grid = new Square[8][8];
        setLayout(new GridLayout(8,8));
         for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid.length; y++){
                grid[y][x] = new Square();
                add(grid[y][x]);
                
                if ((x + y) % 2 == 0){
                    grid[y][x].setState(true);
                }else{
                    grid[y][x].setState(false);
                }
                 grid[y][x].addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e)
                    {
                        try {
                             Square sq1 = (Square) e.getSource();
                            if(clicked == false){
                            //TestImageSquare sq1 = (TestImageSquare) e.getSource();
                            i = sq1.getPieces();
                            sq1.setPieces("BlankSpace.png"); 
                            System.out.println(i);
                            clicked = true;
                            }else if(clicked == true){
                 //               TestImageSquare sq2 = (TestImageSquare) e.getSource();
                                sq1.setPieces(i);
                                repaint();
                                clicked = false;
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(ChessBoard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            }
        } 
         intiPieces();
       
        
    }
    
    //Initilises the pieces onto the board at start up
    public void intiPieces() throws IOException{
         tCP = new Rook("Black");
         grid[0][0].setPieces(tCP.getImagePath());
         tCP = new Knight("Black");
         grid[1][0].setPieces(tCP.getImagePath());
         tCP = new Bishop("Black");
         grid[2][0].setPieces(tCP.getImagePath());
         tCP = new King("Black");
         grid[3][0].setPieces(tCP.getImagePath());
         tCP = new Queen("Black");
         grid[4][0].setPieces(tCP.getImagePath());
         tCP = new Bishop("Black");
         grid[5][0].setPieces(tCP.getImagePath());
         tCP = new Knight("Black");
         grid[6][0].setPieces(tCP.getImagePath());
         tCP = new Rook("Black");
         grid[7][0].setPieces(tCP.getImagePath());
         
         for(int i = 0; i < 8; i++){
            tCP = new Pawn("Black");
            grid[i][1].setPieces(tCP.getImagePath());
         }
         
         tCP = new Rook("White");
         grid[0][7].setPieces(tCP.getImagePath());
         tCP = new Knight("White");
         grid[1][7].setPieces(tCP.getImagePath());
         tCP = new Bishop("White");
         grid[2][7].setPieces(tCP.getImagePath());
         tCP = new King("White");
         grid[3][7].setPieces(tCP.getImagePath());
         tCP = new Queen("White");
         grid[4][7].setPieces(tCP.getImagePath());
         tCP = new Bishop("White");
         grid[5][7].setPieces(tCP.getImagePath());
         tCP = new Knight("White");
         grid[6][7].setPieces(tCP.getImagePath());
         tCP = new Rook("White");
         grid[7][7].setPieces(tCP.getImagePath());
         
         for(int i = 0; i < 8; i++){
             tCP = new Pawn("White");
         grid[i][6].setPieces(tCP.getImagePath());
         }
    }
    
}
