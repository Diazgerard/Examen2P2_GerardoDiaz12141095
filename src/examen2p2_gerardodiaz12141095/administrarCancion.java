/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_gerardodiaz12141095;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author gerar
 */
public class administrarCancion extends Thread{
    static Random r = new Random();
    
    private JProgressBar progBar;
    private int numero;
    private boolean avanzar;
    private boolean vive;

    public administrarCancion(JProgressBar progBar, int numero) {
        this.progBar = progBar;
        this.numero = numero;
        avanzar = true;
        vive = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
                progBar.setValue(r.nextInt(100));
                //activar y modificar propiedad stringPainted para que esto funciones
                //progBar.setString(Integer.toString(progBar.getValue()) + " Minutos");

            }
            int num = this.numero;
            try {
                Thread.sleep(65);
                
            } catch (InterruptedException ex) {
            }
        }

    }
    
}
