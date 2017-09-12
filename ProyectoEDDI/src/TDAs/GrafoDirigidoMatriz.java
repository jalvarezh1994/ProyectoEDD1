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
public class GrafoDirigidoMatriz implements Grafo {

    protected int[][] adyacencia;
    protected int size = 0;
    protected int nodosMaximos;
    protected int INF = (int) Double.POSITIVE_INFINITY;

    public GrafoDirigidoMatriz(int nodosMaximos) {
        this.nodosMaximos = nodosMaximos;
        adyacencia = new int[nodosMaximos][nodosMaximos];
        for (int i = 0; i < nodosMaximos; i++) {
            for (int j = 0; j < nodosMaximos; j++) {
                adyacencia[i][j] = INF;
            }
        }
    }

    @Override
    public boolean agregarNodo() {
        size++;
        return true;
    }

    @Override
    public boolean agregarArista(int nodoInicial, int nodoFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarArista(int nodoInicial, int nodoFinal, int peso) {
        if (nodoInicial < size && nodoFinal < size) {
            adyacencia[nodoInicial][nodoFinal] = peso;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean borrarNodo(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarArista(int posInicial, int posFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarGrafo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirGrafo() {
        System.out.print("\t");
        for (int i = 0; i < this.size; i++) {
            System.out.print("" + i + "\t");
        }
        System.out.println("");
        for (int i = 0; i < this.size; i++) {
            System.out.print("" + i + "\t");
            for (int j = 0; j < this.size; j++) {
                if (adyacencia[i][j] == INF) {
                    System.out.print("Inf\t");
                } else {
                    System.out.print(adyacencia[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }

}
