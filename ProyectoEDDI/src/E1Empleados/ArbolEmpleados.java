/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1Empleados;

/**
 *
 * @author jorge
 */
public class ArbolEmpleados {

    private int nodosMaximos;
    private int size = 2;
    private int[] padres;
    private Empleado[] empleados;

    //El nodo raíz se encuentra en la posición 1
    public ArbolEmpleados(Empleado raiz, int nodosMaximos) {
        this.nodosMaximos = nodosMaximos;
        padres = new int[nodosMaximos];
        empleados = new Empleado[nodosMaximos];
        empleados[1] = raiz;
        padres[1] = 0;
    }

    public boolean agregarNodo(Empleado objeto, int padre) {
        if (padre > 0) {
            padres[size] = padre;
            empleados[size] = objeto;
            empleados[padre].agregarHijo(size);
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
    public String imprimirRecursivo(int padre, int nivel) {
        String acum = "";
        for (int i = 1; i < size; i++) {
            if (padres[i] == padre) {
                for (int j = 0; j < nivel; j++) {
                    acum+="--";
                }
                
                acum+=empleados[i]+"\n"+imprimirRecursivo(i, nivel + 1);
            }
        }
        return acum;
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
            for (int i = 0; i < empleados[padre].getHijos().size(); i++) {
                acumulador += calcularRendimiento(empleados[padre].getHijos().get(i));
                contador++;
            }
            empleados[padre].setPuntaje(acumulador / contador);
            return empleados[padre].getPuntaje();
        }
    }
    
    

    public Empleado getNodo(int pos) {
        return empleados[pos];
    }

    public int[] getPadres() {
        return padres;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }
    
    

    public void setPadres(int[] padres) {
        this.padres = padres;
    }
    
    

    @Override
    public String toString() {
        return "TDA_Arbol{" + "padres=" + padres + ", empleados=" + empleados + '}';
    }

}
