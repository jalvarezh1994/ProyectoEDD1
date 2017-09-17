/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import TDAs.GrafoDirigidoMatriz;

/**
 *
 * @author jorge
 */
public class GrafoPrim extends GrafoDirigidoMatriz {

    public GrafoPrim(int nodosMaximos) {
        super(nodosMaximos);
    }

    @Override
    public boolean agregarArista(int nodoInicial, int nodoFinal, int peso) {
        if (nodoInicial < size && nodoFinal < size) {
            adyacencia[nodoInicial][nodoFinal] = peso;
            adyacencia[nodoFinal][nodoInicial] = peso;
            return true;
        } else {
            return false;
        }
    }

    public void prim() {
        boolean[] solucion = new boolean[size];//Un arreglo que indica si el nodo pertenece al conjunto de solucion
        int[] salida = new int[size];//Un arreglo que guarda los nodos de salida
        int[] peso = new int[size];//El arreglo que guarda el peso
        peso = adyacencia[0];
        int nodoActual = 0;
        int contador = 0;
        do {
            int menor = INF;
            int posMenor = 0;
            for (int i = 0; i < size; i++) {
                if (peso[i] < menor && solucion[i] == false) {
                    menor = peso[i];
                    posMenor = i;
                }
            }
            nodoActual = posMenor;
            solucion[nodoActual] = true;
            for (int i = 0; i < size; i++) {
                if (adyacencia[nodoActual][i] < peso[i] && solucion[i] == false) {
                    peso[i] = adyacencia[nodoActual][i];
                    salida[i] = nodoActual;
                }
            }
            contador++;
        } while (contador < size);
        for (int i = 0; i < size; i++) {
            System.out.print("" + peso[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print("" + i + "\t");
        }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print("" + salida[i] + "\t");
        }
    }

}
