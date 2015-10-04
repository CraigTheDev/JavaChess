/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessPieces;

import static ChessPieces.ChessPieces.imgPath;

/**
 *
 * @author Kevin
 */
public class Knight extends ChessPieces{
    
     public Knight(String colour){
        
        this.pieceColour = colour;
        
        this.imgPath = colour + "Knight.png";
        //System.out.println(imgPath);
        
    }
}
