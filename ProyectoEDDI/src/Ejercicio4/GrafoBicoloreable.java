/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import Ejercicio4.NodoBicoloreable;
import TDAs.Grafo;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class GrafoBicoloreable implements Grafo {

    protected ArrayList<NodoBicoloreable> nodos = new ArrayList();

    @Override
    public boolean agregarNodo() {
        nodos.add(new NodoBicoloreable(nodos.size()));
        return true;
    }

    @Override
    public boolean agregarArista(int nodoInicial, int nodoFinal) {
        if (nodos.size() > 1 && nodoInicial != nodoFinal
                && nodoInicial >= 0 && nodoInicial < nodos.size()
                && nodoFinal >= 0 && nodoFinal < nodos.size()) {
            nodos.get(nodoInicial).agregarAdyacente(nodoFinal);
            nodos.get(nodoFinal).agregarAdyacente(nodoInicial);
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

    //Para hacer el recorrido se debe iniciar desde el nodo 0, con padre 0
    //recorridoEnProfundidad(0,0);
    public int recorridoEnProfundidad(int nodoActual, int padre) {
        int acum = 0;
        NodoBicoloreable father = nodos.get(padre);
        NodoBicoloreable node = nodos.get(nodoActual);
        if (node.getColor() == 0 || (nodoActual == padre)) {
            //if (node.getColor() == 0 || (nodoActual == 0 && padre == 0)) {
            node.setColor(father.getColor() * -1);
            for (int i = 0; i < node.getAdyacentes().size(); i++) {
                acum += recorridoEnProfundidad(node.getAdyacentes().get(i), nodoActual);
            }
            return acum;
        } else {
            if (node.getColor() == father.getColor()) {
                acum++;
                //Cada vez que encuentra un vértice ya visitado y
                //su color no es el que debería, aumenta este contador
                return acum;
            } else {
                return acum;
            }
        }
    }

    @Override
    public void borrarGrafo() {
        nodos.clear();
    }

    //
    public boolean bicoloreable() {
        nodos.get(0).setColor(1);
        int x = recorridoEnProfundidad(0, 0);
        if (x > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void imprimirGrafo() {
        for (int i = 0; i < nodos.size(); i++) {
            System.out.println(nodos.get(i).imprimirColor() + " " + nodos.get(i).getIndice()
                    + ": Adyacentes: " + nodos.get(i).getAdyacentes());
        }
    }

}
