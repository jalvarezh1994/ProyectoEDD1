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
        if (nodos.size() == 1) {
            nodos.get(0).setColor(1);
        }
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

    //Para hacer el recorrido se debe iniciar desde el nodo 0, con padre 0
    //recorridoEnProfundidad(0,0);
    public int recorridoEnProfundidad(int nodoActual, int padre) {
        int acum = 0;
        Nodo father = nodos.get(padre);
        Nodo node = nodos.get(nodoActual);
        if (node.getColor() == 0 || (nodoActual == 0 && padre == 0)) {
            node.setColor(father.getColor() * -1);
        } else {
            if (node.getColor() == father.getColor()) {
                acum++;
                //Cada vez que encuentra un vértice ya visitado y su color no es el que debería aumenta este contador
                return acum;
            } else {
                return acum;
            }
        }
        for (int i = 0; i < node.getAdyacentes().size(); i++) {
            acum += recorridoEnProfundidad(node.getAdyacentes().get(i), nodoActual);
        }
        return acum;
    }

    @Override
    public void borrarGrafo() {
        nodos.clear();
    }
    
    //
    public boolean bicoloreable(){
        int x=recorridoEnProfundidad(0, 0);
        if (x>0) {
            return false;
        }else{
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
