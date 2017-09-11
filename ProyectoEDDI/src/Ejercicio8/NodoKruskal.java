/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import TDAs.Nodo;

/**
 *
 * @author jorge
 */
public class NodoKruskal extends Nodo {

    private boolean respuesta = false;
    private int grupo = (int) Double.POSITIVE_INFINITY;

    public NodoKruskal() {
    }

    public NodoKruskal(int indice) {
        super(indice);
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

}
