/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huffman;

import java.io.Serializable;

/**
 *
 * @author Ilich (D'R)
 */
public class HuffmanNode extends HuffmanTree implements Serializable {

    public HuffmanTree left;
    public HuffmanTree right;

    public HuffmanNode(HuffmanTree left, HuffmanTree right) {
        super(left.frequency + right.frequency);
        this.left = left;
        this.right = right;
    }
}
