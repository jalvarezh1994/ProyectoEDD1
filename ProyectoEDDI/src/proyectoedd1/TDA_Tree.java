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

    TDA_ArrayListInts indiceHijos = new TDA_ArrayListInts(10000);
    TDA_ArrayListInt indicePadres = new TDA_ArrayListInt(10000);
    TDA_ArrayListEmpleados arbolPadres = new TDA_ArrayListEmpleados(10000);

    public void addNode(Empleado empleado, int padre) {
        arbolPadres.insert(empleado, arbolPadres.getSize());
        indicePadres.insert(padre, indicePadres.getSize());
        if (padre >= -1) {
            int pos=arbolPadres.getSize()-1;
            indiceHijos.insert(padre, pos, indiceHijos.getjSize(pos));
        }
    }

    public void printTree() {
        for (int i = 0; i < arbolPadres.getSize(); i++) {
            System.out.println("" + i + arbolPadres.get(i));
        }
    }

    public void printTreeFormat() {

    }

    @Override
    public String toString() {
        return "TDA_ArrayTree{" + "indicePadres=" + indicePadres + ", arbol=" + arbolPadres + '}';
    }

}
