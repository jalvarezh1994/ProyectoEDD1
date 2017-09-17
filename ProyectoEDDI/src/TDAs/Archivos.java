/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import E1Empleados.ArbolEmpleados;
import E1Empleados.Empleado;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Diego
 */
public class Archivos {

    ArrayList<EmpleadoAux> empleados = new ArrayList<>();
    ArbolEmpleados arbol;

    public ArrayList<EmpleadoAux> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<EmpleadoAux> empleados) {
        this.empleados = empleados;
    }

    public ArbolEmpleados getArbol() {
        return arbol;
    }

    public void setArbol(ArbolEmpleados arbol) {
        this.arbol = arbol;
    }
    
    
    
    public class EmpleadoAux {

        int raiz;
        int hijo;
        float nota;
        String nombre;

        public EmpleadoAux(int raiz, int hijo, float nota, String nombre) {
            this.raiz = raiz;
            this.hijo = hijo;
            this.nota = nota;
            this.nombre = nombre;

        }

        public int getRaiz() {
            return raiz;
        }

        public void setRaiz(int raiz) {
            this.raiz = raiz;
        }

        public int getHijo() {
            return hijo;
        }

        public void setHijo(int hijo) {
            this.hijo = hijo;
        }

        public float getNota() {
            return nota;
        }

        public void setNota(int nota) {
            this.nota = nota;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "[" + raiz + "," + hijo + "," + nota + "," + nombre + "]";
        }

    }

    public static void main(String[] args) {
        Archivos arch = new Archivos();
        File archivo = new File("C:\\Users\\Diego\\Desktop\\Periodo\\Empleados.txt");
//        arch.leerEmpleados(archivo);
//        arch.crearArbol();
//        arch.arbol.imprimirRecursivo(0, 0);
        arch.setArbol(new ArbolEmpleados(new Empleado("Juan"), 7));
        arch.arbol.agregarNodo(new Empleado("Samir"), 1);
        arch.arbol.agregarNodo(new Empleado("Samir2"), 1);
        arch.arbol.agregarNodo(new Empleado("Samir3"), 2);
        arch.arbol.agregarNodo(new Empleado("Samir6"), 2);
        arch.arbol.agregarNodo(new Empleado("Sami4"), 1);
        arch.guardarEmpleados("C:\\Users\\Diego\\Desktop\\Periodo\\Empleados.txt");
    }

    public void crearArbol() {

        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = new Empleado(empleados.get(i).getNombre());
            emp.setPuntaje(empleados.get(i).getNota());
            if (empleados.get(i).getRaiz() == 0) {
                arbol = new ArbolEmpleados(emp, empleados.size()+1);

                break;
            }
        }
        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = new Empleado(empleados.get(i).getNombre());
            emp.setPuntaje(empleados.get(i).getNota());
            if (empleados.get(i).getRaiz() != 0) {
                System.out.println(empleados.get(i).getRaiz());
                arbol.agregarNodo(emp, empleados.get(i).getRaiz());
            }
        }

    }

    public void leerEmpleados(File archivo) {
        ArrayList<EmpleadoAux> empleados = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;

        try {
            
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            StringTokenizer token;
            String[] parametros = new String[4];
            int cont = 0;
            while ((linea = br.readLine()) != null) {
                token = new StringTokenizer(linea, ",");
                while (token.hasMoreTokens()) {
                    parametros[cont] = token.nextToken();
                    System.out.println(parametros[cont]);
                    cont++;
                }
                empleados.add(new EmpleadoAux(Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]), Float.parseFloat(parametros[2]), parametros[3]));
                cont = 0;
            }

            System.out.println(empleados);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.empleados = empleados;
    }
    
    public void guardarEmpleados(String path){
         FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            for (int i = 1; i < arbol.getEmpleados().length; i++) {
                pw.println(arbol.getPadres()[i]+","+arbol.getEmpleados()[i].getPuntaje()+","+arbol.getEmpleados()[i].getHijos()+","+arbol.getEmpleados()[i].getNombre());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    
}
