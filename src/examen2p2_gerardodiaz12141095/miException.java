/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_gerardodiaz12141095;

import java.awt.Color;

/**
 *
 * @author gerar
 */
public class miException extends Exception{
    
    private Color color;

    public miException() {
        super();
    }

    public miException(Color color, String message) {
        super(message);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color=" + color + super.getMessage();
    }
    
}
