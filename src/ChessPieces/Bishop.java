/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessPieces;

/**
 *
 * @author Kevin
 */
public class Bishop extends ChessPieces{
    
     public Bishop(String colour){
        
        this.pieceColour = colour;
        
        this.imgPath = colour + "Bishop.png";
       // System.out.println(imgPath);
        
    }
    
}
