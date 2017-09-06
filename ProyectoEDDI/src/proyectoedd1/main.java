/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import TDAs.GrafoNoDirigido;
import TDAs.Nodo;

/**
 *
 * @author jorge
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrafoNoDirigido grafo=new GrafoNoDirigido();
        grafo.agregarNodo();
        grafo.agregarNodo();
        grafo.agregarNodo();
        grafo.agregarNodo();
        grafo.agregarArista(0, 1);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2,3);
        grafo.agregarArista(3, 0);
        System.out.println(grafo.bicoloreable());
        grafo.imprimirGrafo();
        
    }
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
