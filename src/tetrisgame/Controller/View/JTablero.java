/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrisgame.Controller.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JPanel;
import tetrisgame.Controller.TableroControlador;

/**
 *
 * @author User
 */
public class JTablero extends JPanel implements ActionListener{
    private final int TABLERO_ALTO = 12;
    private final int TABLERO_ANCHO = 24;

    private JLabel barraEstado;
    private TableroControlador controlador;
    
    public JTablero(TetrisJFrame padre) {
        setFocusable(true);
        barraEstado = padre.getbarraEstado();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
