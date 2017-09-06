/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Nodo {

    private int color;
    private int indice;
    private ArrayList<Integer> adyacentes = new ArrayList();

    public Nodo(int indice) {
        this.indice = indice;
    }

    public boolean agregarAdyacente(int adyacente) {
        adyacentes.add(adyacente);
        return true;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public ArrayList<Integer> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ArrayList<Integer> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String imprimirColor() {
        if (this.color == 1) {
            return "Blanco";
        } else if (this.color == -1) {
            return "Negro";
        } else {
            return "No visitado";
        }
    }
}
