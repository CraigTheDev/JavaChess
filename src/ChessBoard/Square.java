/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessBoard;

import ChessPieces.ChessPieceLabel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Kevin
 */
public final class Square extends JPanel{
    
    Border blackline, border1, border2;
    public boolean state;
    ChessPieceLabel label;
     ImageIcon icon;
     Graphics g;
     public boolean tState;
     
    public Square() {
          
//           blackline = BorderFactory.createLineBorder(Color.WHITE);
//           setBorder(blackline);
        border1 = BorderFactory.createLineBorder(Color.RED);
        border2 = BorderFactory.createLineBorder(Color.yellow);
            state = true;
            tState = true;
            setColour();
            label = null;
            
    }
    
    public void setState(boolean b) {
        this.state = b;
        setColour();
    }
    
    public void setTState(){
        tState = !tState;
    changeBorderColour();
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
        String type;
       type = label.getPath();
       System.out.println(type);
       return type;
    }

    void changeBorderColour() {
        
        if(tState){
          setBorder(border1);
        }else{
            
            setBorder(border2);
        }
              
    }
    
}
