/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import TDAs.Arista;
import TDAs.Grafo;
import TDAs.Nodo;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class GrafoKruskal implements Grafo {

    private ArrayList<Nodo> nodos = new ArrayList();
    private ArrayList<Arista> aristas = new ArrayList();

    public GrafoKruskal() {
    }

    @Override
    public boolean agregarNodo() {
        nodos.add(new Nodo(nodos.size()));
        return true;
    }

    @Override
    public boolean agregarArista(int nodoInicial, int nodoFinal) {
        if (nodos.size() > 1 && nodoInicial != nodoFinal
                && nodoInicial >= 0 && nodoInicial < nodos.size()
                && nodoFinal >= 0 && nodoFinal < nodos.size()) {
            nodos.get(nodoInicial).agregarAdyacente(nodoFinal);
            nodos.get(nodoFinal).agregarAdyacente(nodoInicial);
            //aristas.add(new Arista(nodos.get(nodoInicial), nodos.get(nodoFinal), peso));
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
        nodos.clear();
        aristas.clear();
    }

    @Override
    public void imprimirGrafo() {
        for (int i = 0; i < nodos.size(); i++) {
            System.out.println("" + nodos.get(i).getIndice()
                    + ": Adyacentes: " + nodos.get(i).getAdyacentes());
        }
    }
}
