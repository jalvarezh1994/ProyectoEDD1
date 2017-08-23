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
public class Empleado {

    int padre;
    String nombre;

    public Empleado() {
    }

    public Empleado(int padre, String nombre) {
        this.padre = padre;
        this.nombre = nombre;
    }

    public int getPadre() {
        return padre;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "padre=" + padre + ", nombre=" + nombre + '}';
    }

}
