/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessBoard;

import ChessPieces.ChessPieceLabel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Kevin
 */
public class Square extends JPanel{
    
    Border blackline;
    public boolean state;
    ChessPieceLabel label;
     ImageIcon icon;
     
    public Square(String image) {
            blackline = BorderFactory.createLineBorder(Color.YELLOW);
            setBorder(blackline);
            state = true;
            setColour();
            label = null;
            
    }
    
    public void setState(boolean b) {
        this.state = b;
        setColour();
    }
    
    public void setColour(){
        if(state == true){
            setOpaque(true);
            setBackground(Color.BLACK);
        }else{
            setOpaque(true);
            setBackground(Color.WHITE);
        }
    }
    
    public void addPiece(String image){
     //  icon = new ImageIcon(image);
            label = new ChessPieceLabel(image);
            this.add(label);
//        System.out.println(label.getIcon().toString());
    }
  
    public String getPiece(){
        String type = null;
       type = label.getPath();
       System.out.println(type);
       return type;
    }
    
}
