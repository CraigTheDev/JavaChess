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
public class Queen extends ChessPieces{
    
     public Queen(String colour){
        
        this.pieceColour = colour;
        
        this.imgPath = colour + "Queen.png";
       // System.out.println(imgPath);
        
    }
    
}
