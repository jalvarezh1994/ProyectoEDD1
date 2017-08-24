/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class TDA_Tree {

    private int NODOS=100;
    
    private TDA_ArrayListInts indiceHijos = new TDA_ArrayListInts(NODOS);
    private TDA_ArrayListInt indicePadres = new TDA_ArrayListInt(NODOS);
    private TDA_ArrayListEmpleados arbolPadres = new TDA_ArrayListEmpleados(NODOS);

    public void addNode(Empleado empleado, int padre) {//Si padre = -1 quiere decir que es el nodo raíz
        arbolPadres.insert(empleado, arbolPadres.getSize());
        indicePadres.insert(padre, indicePadres.getSize());
        if (padre >= -1) {
            int pos=arbolPadres.getSize();
            indiceHijos.insert(padre, pos, indiceHijos.getjSize(pos));
        }
        System.out.println(arbolPadres.get(arbolPadres.getSize()));
    }

    public void printTree() {
        for (int i = 0; i < arbolPadres.getSize(); i++) {
            System.out.println("" + i + arbolPadres.get(i));
        }
    }

    public void printTreeFormat(int nodo,int nivel) {
        if (indiceHijos.getjSize(nodo)>0) {
            System.out.println(arbolPadres.get(nodo));
        } else {
            System.out.println(arbolPadres.get(nodo));
            for (int i = 0; i < nivel; i++) {
                System.out.print("--");
            }
            for (int i = 0; i < indiceHijos.getjSize(nodo); i++) {
                printTreeFormat(indiceHijos.getHijo(nodo, i), nivel+1);
            }
        }
    }

    @Override
    public String toString() {
        return "TDA_ArrayTree{" + "indicePadres=" + indicePadres + ", arbol=" + arbolPadres + '}';
    }

}
