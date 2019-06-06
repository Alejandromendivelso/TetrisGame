/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrisgame.Controller;

import javax.swing.Timer;
import tetrisgame.Controller.View.JTablero;

/**
 *
 * @author User
 */
public class TableroControlador {
    private JTablero tetrisTablero;
    private int tableroAncho;
    private int tableroAlto;
    private Timer timer;
    private boolean caidaTerminada = false;
    //private Figura piezaActual;
    
    private int actualX = 0;
    private int actualY = 0;
    
    public TableroControlador(int tableroAncho, int tableroAlto, JTablero JTablero){
        this.tableroAlto = tableroAlto;
        this.tableroAncho = tableroAncho;
        this.tetrisTablero = tetrisTablero;
        timer = new Timer(400, tetrisTablero);
    }
    
    public void Accion(){
        if(caidaTerminada){
            caidaTerminada = false;
            
        } else {
            
        }
    }
    private boolean Mover(/*Figura-j newPieza*/ int nuevoX, int nuevoY){
        for (int i = 0; i < 4; i++) {
            int x = nuevoX + (i);
            int y = nuevoY - (i);
            if(x <0 || x>= tableroAncho || y < 0 || y>= tableroAlto)
                return false;
        }    
        //piezaActual = nuevaPieza;
        actualX = nuevoX;
        actualY = nuevoY;
        //tetrisTablero.rapaint();
        return true;
    }
    
}
