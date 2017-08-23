/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

/**
 *
 * @author Diego
 */
public class TDA_ArrayListInt {

    private int size;
    private int[] list;

    public TDA_ArrayListInt(int size) {
        list = new int[size];
        this.size = 0;
    }

    public boolean insert(int ob, int p) {
        if (p - 1 < list.length && p - 1 >= 0) {
            list[p - 1] = ob;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int get(int p) {
        if (p - 1 < size && p - 1 > 0) {
            return list[p - 1];
        } else {
            return -1;
        }
    }

    public void eraser(int p) {
        if (p - 1 < size && p - 1 >= 0) {
            list[p - 1] = -1;
            for (int i = p; i < size; i++) {
                if (i != size) {
                    list[i - 1] = list[i];
                    list[i] = -1;
                }
            }
            size--;
        }
    }

    public int find(int object) {
        for (int i = 0; i < size; i++) {
            if (object == list[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    public int nextTo(int p) {
        if (p + 1 < size || p + 1 > 0) {
            return -1;
        } else {
            return list[p + 2];
        }
    }

    public int backTo(int p) {
        if (p - 2 > size || p - 2 < 0) {
            return -1;
        } else {
            return list[p - 2];
        }
    }

    public void clear(int size) {
        list = new int[size];
        size = this.size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(i+1+ " " + list[i]);
        }
    }
}
