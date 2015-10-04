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
public class King extends ChessPieces{
    
     public King(String colour){
        
        this.pieceColour = colour;
        
        this.imgPath = colour + "King.png";
       // System.out.println(imgPath);
        
    }
    
}
