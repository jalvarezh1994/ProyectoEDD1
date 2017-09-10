/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author jorge
 */
public class ArbolEmpleados {

    private int nodosMaximos;
    private int size = 2;
    private int[] padres;
    private int[][] hijos;
    private Empleado[] empleados;

    //El nodo raíz se encuentra en la posición 1
    public ArbolEmpleados(Empleado raiz, int nodosMaximos) {
        this.nodosMaximos = nodosMaximos;
        padres = new int[nodosMaximos];
        hijos = new int[nodosMaximos][nodosMaximos];
        empleados = new Empleado[nodosMaximos];
        empleados[1] = raiz;
        padres[1] = 0;
    }

    public boolean agregarNodo(Empleado objeto, int padre) {
        if (padre > 0) {
            padres[size] = padre;
            empleados[size] = objeto;
            size++;
            //Hace falta agregar el nodo al padre
            return true;
        } else {
            return false;
        }
    }

    public void imprimirArbol() {
        for (int i = 1; i < size; i++) {
            System.out.print(padres[i] + " ");
            System.out.println((Empleado) empleados[i]);
        }
    }

    //Se puede imprimir cualquier sub-árbol.
    //Para imprimir todo el árbol usar: imprimirRecursivo(0,0);
    public void imprimirRecursivo(int padre, int nivel) {
        for (int i = 1; i < size; i++) {
            if (padres[i] == padre) {
                for (int j = 0; j < nivel; j++) {
                    System.out.print("--");
                }
                System.out.println(empleados[i]);
                imprimirRecursivo(i, nivel + 1);
            }
        }
    }

    //Hace falta usar los hijos en lugar de recorrer todo el arreglo    
    //Una función recursiva que calcula y asigna el rendimiento de cada empleado
    //Para calcular el rendimiento de todos los empleados usar: calcularRendimiento(1);
    public float calcularRendimiento(int padre) {
        if (empleados[padre].getPuntaje() != -1) {
            return empleados[padre].getPuntaje();
        } else {
            float acumulador = 0;
            int contador = 0;
            for (int i = 1; i < size; i++) {
                if (padres[i] == padre) {
                    acumulador += calcularRendimiento(i);
                    contador++;
                }
            }
            empleados[padre].setPuntaje(acumulador / contador);
            return empleados[padre].getPuntaje();
        }
    }

    public Empleado getNodo(int pos) {
        return empleados[pos];
    }

    @Override
    public String toString() {
        return "TDA_Arbol{" + "padres=" + padres + ", empleados=" + empleados + '}';
    }

}
