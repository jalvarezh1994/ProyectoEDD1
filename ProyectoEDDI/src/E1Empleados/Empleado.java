/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1Empleados;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Empleado {

    //int padre;
    private String nombre;
    private float puntaje = -1;
    private ArrayList<Integer> hijos = new ArrayList();

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Integer> hijos) {
        this.hijos = hijos;
    }

    public void agregarHijo(int hijo) {
        hijos.add(hijo);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", puntaje=" + puntaje + '}';
    }

}
