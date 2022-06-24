/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_gerardodiaz12141095;

import javax.swing.JProgressBar;

/**
 *
 * @author gerar
 */
public class administrarCancion extends Thread{
    
    private JProgressBar progBar;
    private int numero;
    private boolean avanzar;
    private boolean vive;

    public administrarCancion(int numero, JProgressBar progBar) {
        this.progBar = progBar;
        this.numero = numero;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setValue(progBar.getValue() + 1);
                //activar y modificar propiedad stringPainted para que esto funciones
                progBar.setString(Integer.toString(progBar.getValue()) + " Minutos");

            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }
    
}
