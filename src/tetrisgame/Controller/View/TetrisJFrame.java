/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrisgame.Controller.View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Johan
 */
public class TetrisJFrame extends JFrame{

    private JLabel barraEstado;
    private JTablero tablero;
    
    public TetrisJFrame(){
        setLayout(new BorderLayout());
        barraEstado = new JLabel(" 0");
        add(barraEstado, BorderLayout.SOUTH);
        setSize(200,400);
        setTitle("Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
    
    JLabel getbarraEstado(){
        return barraEstado;
    }
}
