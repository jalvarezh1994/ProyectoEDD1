/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Nodo {

<<<<<<< HEAD

    private Object elemento;
    private int pos;
    private int father;
    private int right;
    private int left;

    protected int indice;
    protected ArrayList<Integer> adyacentes = new ArrayList();

=======
    protected int indice;
    protected ArrayList<Integer> adyacentes = new ArrayList();
>>>>>>> 725a0695538e46976b02a3dc66ffdf9a589bd377

    public Nodo() {
    }

    public Nodo(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public ArrayList<Integer> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ArrayList<Integer> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public boolean agregarAdyacente(int adyacente) {
        adyacentes.add(adyacente);
        return true;
    }

    

}
