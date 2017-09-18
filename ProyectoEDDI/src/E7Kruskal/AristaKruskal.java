/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7Kruskal;

import TDAs.Arista;

/**
 *
 * @author jorge
 */
public class AristaKruskal extends Arista {

    private int grupo = (int) Double.POSITIVE_INFINITY;
    private boolean respuesta;
    private int pos;

    public AristaKruskal() {
    }

    public AristaKruskal(int nodo1, int nodo2) {
        super(nodo1, nodo2);
    }

    public AristaKruskal(int nodo1, int nodo2, int peso) {
        super(nodo1, nodo2, peso);
    }

    public AristaKruskal(int nodo1, int nodo2, int peso, int pos) {
        super(nodo1, nodo2, peso);
        this.pos = pos;
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

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return super.toString() + " AristaKruskal{" + "grupo=" + grupo + ", respuesta=" + respuesta + '}';
    }

}
