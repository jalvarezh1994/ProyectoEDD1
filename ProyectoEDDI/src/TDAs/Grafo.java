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
public interface Grafo {

    public boolean agregarNodo();

    public boolean agregarArista(int nodoInicial, int nodoFinal);

    public boolean borrarNodo(int posicion);

    public boolean borrarArista(int posInicial, int posFinal);

    //public int recorridoEnProfundidad(int posicion,int padre);

    public void borrarGrafo();
    
    public void imprimirGrafo();

}
