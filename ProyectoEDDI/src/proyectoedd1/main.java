/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import Ejercicio1.ArbolEmpleados;
import Ejercicio1.Empleado;
import Ejercicio4.GrafoBicoloreable;
import Ejercicio4.NodoBicoloreable;
import Ejercicio8.GrafoKruskal;

/**
 *
 * @author jorge
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrafoKruskal grafo = new GrafoKruskal();
        grafo.agregarNodo();
        grafo.agregarNodo();
        grafo.agregarNodo();
        grafo.agregarNodo();
        grafo.agregarArista(0, 1, 3);
        grafo.agregarArista(1, 2, 2);
        grafo.agregarArista(2, 3, 2);
        grafo.agregarArista(3, 0, 7);
        grafo.agregarArista(0, 2, 6);
        grafo.ordenarAristas();
        grafo.arbolMinimo();
        grafo.imprimirGrafo();
        
        
    }

//        System.out.println("Ejemplo de grafo bicoloreable");
//        GrafoBicoloreable grafoBicoloreable = new GrafoBicoloreable();
//        grafoBicoloreable.agregarNodo();
//        grafoBicoloreable.agregarNodo();
//        grafoBicoloreable.agregarNodo();
//        grafoBicoloreable.agregarNodo();
//
//        grafoBicoloreable.agregarArista(0, 1);
//        grafoBicoloreable.agregarArista(1, 2);
//        grafoBicoloreable.agregarArista(2, 3);
//        grafoBicoloreable.agregarArista(3, 0);
//        grafoBicoloreable.agregarArista(0,2);
//        System.out.println(grafoBicoloreable.bicoloreable());
//        grafoBicoloreable.imprimirGrafo();
//
//        System.out.println("Ejemplo de grafo no bicoloreable");
//        GrafoBicoloreable grafoNoBicolor = new GrafoBicoloreable();
//        grafoNoBicolor.agregarNodo();
//        grafoNoBicolor.agregarNodo();
//        grafoNoBicolor.agregarNodo();
//
//        grafoNoBicolor.agregarArista(0, 1);
//        grafoNoBicolor.agregarArista(1, 2);
//        grafoNoBicolor.agregarArista(2, 0);
//
//        System.out.println(grafoNoBicolor.bicoloreable());
//        grafoNoBicolor.imprimirGrafo();    
//    
//        ArbolEmpleados a = new ArbolEmpleados(new Empleado("Jorge"), 100);
//        a.agregarNodo(new Empleado("Alex"), 1);
//        a.agregarNodo(new Empleado("Rodner"), 2);
//        a.agregarNodo(new Empleado("Luis"), 1);
//        a.agregarNodo(new Empleado("Víctor"), 2);
//        a.agregarNodo(new Empleado("Victoria"), 5);
//        a.getNodo(3).setPuntaje(7);
//        a.getNodo(6).setPuntaje(10);
//        a.getNodo(4).setPuntaje(6);
//        a.calcularRendimiento(1);
//        a.imprimirRecursivo(0, 0);
}
