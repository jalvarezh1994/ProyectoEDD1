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
class HuffmanNode extends HuffmanTree {

    public HuffmanTree left; // Sub-árbol izquierdo.
    public HuffmanTree right; // Sub-árbol derecho.

    public HuffmanNode(HuffmanTree left, HuffmanTree right) {
        super(left.frequency + right.frequency);
        this.left = left;
        this.right = right;
    }
}
