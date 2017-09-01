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
class HuffmanLeaf extends HuffmanTree {

    public char value; // La letra se asigna a una hoja.

    public HuffmanLeaf(int freq, char value) {
        super(freq);
        this.value = value;
    }
}
