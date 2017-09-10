/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

/**
 *
 * @author jorge
 */
public class Arista {

    int nodo1;
    int nodo2;
    int peso;

    public Arista() {
    }

    public Arista(int nodo1, int nodo2, int peso) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.peso = peso;
    }
    
    public Arista(int nodo1, int nodo2) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getNodo1() {
        return nodo1;
    }

    public void setNodo1(int nodo1) {
        this.nodo1 = nodo1;
    }

    public int getNodo2() {
        return nodo2;
    }

    public void setNodo2(int nodo2) {
        this.nodo2 = nodo2;
    }

    @Override
    public String toString() {
        return "Arista{" + "nodo1=" + nodo1 + ", nodo2=" + nodo2 + ", peso=" + peso + '}';
    }

}
