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

    int grupo;
    boolean respuesta;

    public AristaKruskal() {
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

}
