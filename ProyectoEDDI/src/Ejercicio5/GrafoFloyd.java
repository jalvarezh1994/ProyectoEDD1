/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import TDAs.GrafoDirigidoMatriz;

/**
 *
 * @author jorge
 */
public class GrafoFloyd extends GrafoDirigidoMatriz {

    public GrafoFloyd(int nodosMaximos) {
        super(nodosMaximos);
    }

    public void floyd() {
        int[][] temporal = new int[size][size];
        temporal = adyacencia;
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (temporal[i][j] > temporal[i][k] + temporal[k][j]
                            && temporal[i][k] != INF && temporal[k][j] != INF) {
                        temporal[i][j] = temporal[i][k] + temporal[k][j];
                    }
                }
            }
        }
        System.out.println("");
        System.out.print("\t");
        for (int i = 0; i < this.size; i++) {
            System.out.print("" + i + "\t");
        }
        System.out.println("");
        for (int i = 0; i < this.size; i++) {
            System.out.print("" + i + "\t");
            for (int j = 0; j < this.size; j++) {
                if (temporal[i][j] == INF) {
                    System.out.print("Inf\t");
                } else {
                    System.out.print(temporal[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
}
