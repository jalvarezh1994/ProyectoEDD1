/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4Bicoloreable;

import TDAs.Nodo;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class NodoBicoloreable extends Nodo {

    private int color;

    public NodoBicoloreable(int indice) {
        this.indice = indice;
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
