/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_gerardodiaz12141095;

/**
 *
 * @author gerar
 */
public class Cancion {
    
    private String cancion;

    public Cancion() {
    }

    public Cancion(String cancion) {
        this.cancion = cancion;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return  cancion;
    }
    
    
    
}
