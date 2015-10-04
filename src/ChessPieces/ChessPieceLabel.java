/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessPieces;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Kevin
 */
public class ChessPieceLabel extends JLabel{
    String imgPath;
    ImageIcon icon;
    
    public ChessPieceLabel(String path){
        this(new ImageIcon(path));
        this.imgPath = path;
    }
    
    public ChessPieceLabel(ImageIcon i){
        setIcon(i);
          // setMargin(new Insets(0,0,0,0));
        setIconTextGap(0);
    // setBorderPainted(false);
        setBorder(null);
        setText(null);
        setSize(i.getImage().getWidth(null), i.getImage().getHeight(null));
    }

    public String getPath() {
        return imgPath;

    }
           
}
