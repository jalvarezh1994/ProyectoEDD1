/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author jorge
 */
public class Vertice {

    private int pesoAcumulado;
    private int procedencia;

    public Vertice() {
    }

    public Vertice(int pesoAcumulado, int procedencia) {
        this.pesoAcumulado = pesoAcumulado;
        this.procedencia = procedencia;
    }

    public int getPesoAcumulado() {
        return pesoAcumulado;
    }

    public void setPesoAcumulado(int pesoAcumulado) {
        this.pesoAcumulado = pesoAcumulado;
    }

    public int getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(int procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Vertice{" + "pesoAcumulado=" + pesoAcumulado + ", procedencia=" + procedencia + '}';
    }

}
