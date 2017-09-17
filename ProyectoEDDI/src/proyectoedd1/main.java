/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import TDAs.ArbolBinario;
import java.util.ArrayList;

import Ejercicio1.ArbolEmpleados;
import Ejercicio1.Empleado;
import Ejercicio4.GrafoBicoloreable;
import Ejercicio4.NodoBicoloreable;
import Ejercicio5.GrafoFloyd;
import Ejercicio6.GrafoDijkstra;

import Ejercicio7.GrafoKruskal;
import Ejercicio8.GrafoPrim;
import TDAs.GrafoDirigidoMatriz;
import javax.swing.JFrame;

/**
 *
 * @author jorge
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal p=new Principal();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//        GrafoPrim gr = new GrafoPrim(20);
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarArista(0, 1, 6);
//        gr.agregarArista(0, 2, 1);
//        gr.agregarArista(0, 3, 5);
//        gr.agregarArista(1, 2, 5);
//        gr.agregarArista(2, 3, 5);
//        gr.agregarArista(1, 4, 3);
//        gr.agregarArista(2, 4, 6);
//        gr.agregarArista(2, 5, 4);
//        gr.agregarArista(3, 5, 2);
//        gr.agregarArista(4, 5, 6);
//        gr.prim();
//    
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
//        grafoBicoloreable.agregarArista(0, 2);
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
//        GrafoFloyd gr = new GrafoFloyd(20);
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarArista(0, 1, 7);
//        gr.agregarArista(0, 2, 3);
//        gr.agregarArista(1, 2, 1);
//        gr.agregarArista(1, 3, 6);
//        gr.agregarArista(2, 4, 8);
//        gr.agregarArista(3, 2, 3);
//        gr.agregarArista(4, 3, 2);
//        gr.agregarArista(3, 5, 2);
//        gr.agregarArista(4, 5, 8);
//        gr.imprimirGrafo();
//        gr.floyd();
//    
//        GrafoDijkstra gr = new GrafoDijkstra(20);
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarNodo();
//        gr.agregarArista(0, 1, 7);
//        gr.agregarArista(0, 2, 3);
//        gr.agregarArista(1, 2, 1);
//        gr.agregarArista(1, 3, 6);
//        gr.agregarArista(2, 4, 8);
//        gr.agregarArista(3, 2, 3);
//        gr.agregarArista(4, 3, 2);
//        gr.agregarArista(3, 5, 2);
//        gr.agregarArista(4, 5, 8);
//        gr.imprimirGrafo();
//        gr.dijkstra(0);
//
//        GrafoKruskal grafo = new GrafoKruskal();
//        grafo.agregarNodo();
//        grafo.agregarNodo();
//        grafo.agregarNodo();
//        grafo.agregarNodo();
//        grafo.agregarArista(0, 1, 3);
//        grafo.agregarArista(1, 2, 2);
//        grafo.agregarArista(2, 3, 2);
//        grafo.agregarArista(3, 0, 7);
//        grafo.agregarArista(0, 2, 6);
//        grafo.arbolMinimo();
//        grafo.imprimirGrafo();
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
