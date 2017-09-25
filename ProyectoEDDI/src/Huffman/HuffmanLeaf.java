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
public class HuffmanLeaf extends HuffmanTree implements Serializable {

    public final char value;

    public HuffmanLeaf(int freq, char value) {
        super(freq);
        this.value = value;
    }
}
