/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

/**
 *
 * @author jorge
 */
public class TDA_ArrayListInts {

    private int iSize;
    private int[] jSize;
    private int[][] list;

    public TDA_ArrayListInts(int size) {
        list = new int[size][size];
        this.iSize = size;
    }

    public void insert(int ob, int i, int j) {
        list[i][j] = ob;
        iSize++;
        jSize[i]++;
    }
    
    public int getiSize(){
        return iSize;
    }
    
    public int getjSize(int i){
        return jSize[i];
    }
}
