/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrisgame;

import tetrisgame.Controller.View.TetrisJFrame;

/**
 *
 * @author User
 */
public class TetrisGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TetrisJFrame tetris = new TetrisJFrame();
        tetris.setVisible(true);
        tetris.setLocationRelativeTo(null);
    }
    
}
