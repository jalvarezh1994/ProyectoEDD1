/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Empleado {

    //int padre;
    private String nombre;
    private float puntaje = -1;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", puntaje=" + puntaje + '}';
    }

}
