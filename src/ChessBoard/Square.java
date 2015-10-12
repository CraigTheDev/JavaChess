/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessBoard;

import ChessPieces.ChessPieceLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
     ImageIcon icon;
     Graphics g;
     public boolean tState;
     Image chessImage;
     String imagePath;
     
    public Square() {
          
//           blackline = BorderFactory.createLineBorder(Color.WHITE);
//           setBorder(blackline);
        border1 = BorderFactory.createLineBorder(Color.RED);
        border2 = BorderFactory.createLineBorder(Color.yellow);
            state = true;
            tState = true;
            setColour();
           
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
    
    public void setPieces(String image) throws IOException{
     //  icon = new ImageIcon(image);
        this.imagePath = image;
            chessImage = ImageIO.read(new File(image));
            
    }
  
    public String getPieces(){
        return imagePath;
    }

    void changeBorderColour() {
        
        if(tState){
          setBorder(border1);
        }else{
            
            setBorder(border2);
        }
    }
       @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(chessImage, 0, 0, 50, 50, null); // see javadoc for more info on the parameters            
    }
    
}
