/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6Dijkstra;

import TDAs.GrafoDirigidoMatriz;

/**
 *
 * @author jorge
 */
public class GrafoDijkstra extends GrafoDirigidoMatriz {

    int INF = (int) Double.POSITIVE_INFINITY;

    public GrafoDijkstra(int nodosMaximos) {
        super(nodosMaximos);
    }

    public boolean dijkstra(int vertice) {
        if (vertice >= 0 && vertice < size) {
            boolean[] seleccionado = new boolean[size];
            Vertice[] solucion = new Vertice[size];
            for (int i = 0; i < size; i++) {
                solucion[i] = new Vertice(adyacencia[vertice][i], vertice);
            }
            solucion[vertice].setPesoAcumulado(0);
            boolean salir;
            do {
                salir = true;
                int menor = INF;
                int posMenor = 0;
                for (int i = 0; i < size; i++) {
                    if (seleccionado[i] == false) {
                        if (solucion[i].getPesoAcumulado() < menor) {
                            menor = solucion[i].getPesoAcumulado();
                            posMenor = i;
                        }
                    }
                }
                //Souts de debug
                //System.out.println(posMenor);
                //System.out.println(menor);
                seleccionado[posMenor] = true;
                for (int i = 0; i < size; i++) {
                    if (seleccionado[i] == false) {
                        if (adyacencia[posMenor][i] + menor < solucion[i].getPesoAcumulado()
                                && adyacencia[posMenor][i] != INF) {
                            solucion[i].setProcedencia(posMenor);
                            solucion[i].setPesoAcumulado(menor + adyacencia[posMenor][i]);
                        }
                    }
                }
                for (int i = 0; i < size; i++) {
                    if (seleccionado[i] == false) {
                        salir = false;
                        break;
                    }
                }
            } while (salir == false);
            for (int i = 0; i < size; i++) {
                System.out.println("" + i + " " + solucion[i] + "\t");
            }
            return true;
        } else {
            return false;
        }
    }
}
