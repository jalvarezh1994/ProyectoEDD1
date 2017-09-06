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
public class GrafoNoDirigido implements Grafo {

    ArrayList<Nodo> nodos = new ArrayList();

    @Override
    public boolean agregarNodo() {
        nodos.add(new Nodo(nodos.size()));
        return true;
    }

    @Override
    public boolean agregarArista(int nodoInicial, int nodoFinal) {
        if (nodos.size() > 1) {
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

    @Override
    public int recorridoEnProfundidad(int nodo,int padre) {
        int acum=0;
        nodos.get(0).setColor("blanco");
        if (nodos.get(padre).getColor().compareTo("Blanco")==0) {
            
        }
        for (int i = 0; i < nodos.get(nodo).getAdyacentes().size(); i++) {
        }
        return acum;
    }

    @Override
    public void borrarGrafo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void imprimirGrafo() {
        for (int i = 0; i < nodos.size(); i++) {
            System.out.println(nodos.get(i).getColor() + nodos.get(i).getIndice()
                    + ": Adyacentes: " + nodos.get(i).getAdyacentes());
        }
    }

}
