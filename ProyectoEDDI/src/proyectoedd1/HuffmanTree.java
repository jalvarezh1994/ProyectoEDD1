/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

/**
 *
 * @author Ilich (D'R)
 */
abstract class HuffmanTree implements Comparable<HuffmanTree> {

    public int frequency; // Frecuencia del árbol.

    public HuffmanTree(int frequency) {
        this.frequency = frequency;
    }

    // Compara las frecuencias - Implementación de la interfaz comparable para la ordenación en la cola.
    public int compareTo(HuffmanTree tree) {
        return frequency - tree.frequency;
    }
}
