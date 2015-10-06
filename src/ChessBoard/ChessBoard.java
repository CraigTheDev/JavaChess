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
      //int y = 0,x= 0;
      
    public ChessBoard(){
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
                        
                        Square sq1, sq2;
                        boolean pressed = false;
                        
                        if(pressed){
                            sq1 = (Square) e.getSource();
                           if(img1 == null){
                               img1 = sq1.getPiece();
                               System.out.println(img1);
                           }
                        }else{
                            if(img1 != null){
                            sq2 = (Square) e.getSource();
                            sq2.addPiece(img1);} 
                        }
                        
                        Square sq = (Square) e.getSource();
                       sq.setTState();
                       
                    }
                });
            }
        } 
         intiPieces();
       
        
    }
    
    //Initilises the pieces onto the board at start up
    public void intiPieces(){
         tCP = new Rook("Black");
         grid[0][0].addPiece(tCP.getImagePath());
         tCP = new Knight("Black");
         grid[1][0].addPiece(tCP.getImagePath());
         tCP = new Bishop("Black");
         grid[2][0].addPiece(tCP.getImagePath());
         tCP = new King("Black");
         grid[3][0].addPiece(tCP.getImagePath());
         tCP = new Queen("Black");
         grid[4][0].addPiece(tCP.getImagePath());
         tCP = new Bishop("Black");
         grid[5][0].addPiece(tCP.getImagePath());
         tCP = new Knight("Black");
         grid[6][0].addPiece(tCP.getImagePath());
         tCP = new Rook("Black");
         grid[7][0].addPiece(tCP.getImagePath());
         
         for(int i = 0; i < 8; i++){
            tCP = new Pawn("Black");
            grid[i][1].addPiece(tCP.getImagePath());
         }
         
         tCP = new Rook("White");
         grid[0][7].addPiece(tCP.getImagePath());
         tCP = new Knight("White");
         grid[1][7].addPiece(tCP.getImagePath());
         tCP = new Bishop("White");
         grid[2][7].addPiece(tCP.getImagePath());
         tCP = new King("White");
         grid[3][7].addPiece(tCP.getImagePath());
         tCP = new Queen("White");
         grid[4][7].addPiece(tCP.getImagePath());
         tCP = new Bishop("White");
         grid[5][7].addPiece(tCP.getImagePath());
         tCP = new Knight("White");
         grid[6][7].addPiece(tCP.getImagePath());
         tCP = new Rook("White");
         grid[7][7].addPiece(tCP.getImagePath());
         
         for(int i = 0; i < 8; i++){
             tCP = new Pawn("White");
         grid[i][6].addPiece(tCP.getImagePath());
         }
    }
    
}
