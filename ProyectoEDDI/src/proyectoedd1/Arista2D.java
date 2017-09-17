/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import java.awt.Color;

/**
 *
 * @author jorge
 */
public class Arista2D {

    private int posNodo1,posNodo2;
    private Nodo2D nodo1, nodo2;
    private Color color;

    public Arista2D(Nodo2D nodo1, Nodo2D nodo2, Color color) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.color = color;
    }

    public Nodo2D getNodo1() {
        return nodo1;
    }

    public void setNodo1(Nodo2D nodo1) {
        this.nodo1 = nodo1;
    }

    public Nodo2D getNodo2() {
        return nodo2;
    }

    public void setNodo2(Nodo2D nodo2) {
        this.nodo2 = nodo2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arista2D{" + "nodo1=" + nodo1 + ", nodo2=" + nodo2 + ", color=" + color + '}';
    }

}
