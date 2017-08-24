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
        //Esto hace que el programa sea menos eficiente se debe cambiar luego.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                list[i][j]=-2;
            }
        }
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
    
    public int getHijo(int i,int j){
        if (i<this.iSize&&i>=0&&
                j<this.jSize[i]&&j>=0) {
            return list[i][j];
        }else{
            return -2;//-2 Indica que algo salió mal
        }
    }
}
