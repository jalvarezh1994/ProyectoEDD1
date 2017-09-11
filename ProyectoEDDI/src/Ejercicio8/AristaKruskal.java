/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import TDAs.Arista;

/**
 *
 * @author jorge
 */
public class AristaKruskal extends Arista {

    private int grupo = (int) Double.POSITIVE_INFINITY;
    private boolean respuesta;

    public AristaKruskal() {
    }

    public AristaKruskal(int nodo1, int nodo2) {
        super(nodo1, nodo2);
    }

    public AristaKruskal(int nodo1, int nodo2, int peso) {
        super(nodo1, nodo2, peso);
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return super.toString() + " AristaKruskal{" + "grupo=" + grupo + ", respuesta=" + respuesta + '}';
    }

}
