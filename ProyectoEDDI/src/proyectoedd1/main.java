/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

/**
 *
 * @author jorge
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolEmpleados a = new ArbolEmpleados(new Empleado("Jorge"), 100);
        a.agregarNodo(new Empleado("Alex"), 1);
        a.agregarNodo(new Empleado("Rodner"), 2);
        a.agregarNodo(new Empleado("Luis"), 1);
        a.agregarNodo(new Empleado("Víctor"), 2);
        a.agregarNodo(new Empleado("Victoria"), 5);
        a.getNodo(3).setPuntaje(7);
        a.getNodo(6).setPuntaje(10);
        a.getNodo(4).setPuntaje(6);
        a.calcularRendimiento(1);
        a.imprimirRecursivo(0, 0);
    }

}
