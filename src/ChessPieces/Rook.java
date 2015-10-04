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
public class Rook extends ChessPieces{
    
     public Rook(String colour){
        
        this.pieceColour = colour;
        
        this.imgPath = colour + "Rook.png";
        //System.out.println(imgPath);
        
    }
    
}
