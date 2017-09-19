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

    private int posNodo1, posNodo2;
    private Nodo2D nodo1, nodo2;
    private Color color;
    private String texto = "";
    private int peso;

    public Arista2D(Nodo2D nodo1, Nodo2D nodo2, Color color, int peso) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.color = color;
        this.peso = peso;
        texto = "" + peso;
    }

    public Arista2D(Nodo2D nodo1, Nodo2D nodo2, Color color) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.color = color;
        posNodo1 = nodo1.getPos();
        posNodo2 = nodo2.getPos();
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

    public int getPosNodo1() {
        return posNodo1;
    }

    public void setPosNodo1(int posNodo1) {
        this.posNodo1 = posNodo1;
    }

    public int getPosNodo2() {
        return posNodo2;
    }

    public void setPosNodo2(int posNodo2) {
        this.posNodo2 = posNodo2;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean contieneNodo(int n) {
        if (nodo1.getPos() == n || nodo2.getPos() == n) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "[" + nodo1.getPos() + "," + nodo2.getPos() + ":" + peso + "]";
    }

}
