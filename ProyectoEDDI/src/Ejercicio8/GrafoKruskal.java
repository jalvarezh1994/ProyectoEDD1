/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import TDAs.Arista;
import TDAs.GrafoLista;

/**
 *
 * @author jorge
 */
public class GrafoKruskal extends GrafoLista {

    private boolean solucion = false;
    private int grupo = 0;
    private final int INF = (int) Double.POSITIVE_INFINITY;

    public void ordenarAristas() {
        int contador = 0;
        int menor;
        do {
            menor = INF;
            int pos = 0;
            for (int i = contador; i < aristas.size(); i++) {
                if (aristas.get(i).getPeso() <= menor) {
                    pos = i;
                    menor = aristas.get(i).getPeso();
                }
            }
            Arista temporal = new Arista();
            temporal = aristas.get(contador);
            aristas.set(contador, aristas.get(pos));
            aristas.set(pos, temporal);
            contador++;
        } while (contador < aristas.size());
    }

    public void arbolMinimo() {
        ordenarAristas();
        for (int i = 0; i < aristas.size(); i++) {

        }
    }

}
