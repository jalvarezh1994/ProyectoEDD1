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

    int indice;
    ArrayList<Integer> adyacentes = new ArrayList();

    public Nodo() {

    }

    public Nodo(int indice) {
        this.indice = indice;
    }

}
