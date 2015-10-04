/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameExecution;

import ChessBoard.ChessBoard;
import javax.swing.JFrame;

/**
 *
 * @author Kevin
 */
public class JavaChess extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame();
            ChessBoard panel = new ChessBoard();
        //ImageLabel label = new ImageLabel(new ImageIcon("BlackKing.jpg"));
        //label.setLocation(29, 37);
        //panel.add(label);

            frame.setSize(600,600);
            frame.add(panel);
   
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
