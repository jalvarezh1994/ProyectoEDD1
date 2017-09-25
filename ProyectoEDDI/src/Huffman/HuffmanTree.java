/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huffman;

/**
 *
 * @author Ilich (D'R)
 */
abstract class HuffmanTree implements Comparable<HuffmanTree> {

    public int frequency;

    public HuffmanTree(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanTree tree) {
        return frequency - tree.frequency;
    }
}
