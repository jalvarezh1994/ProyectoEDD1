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
public class TDA_ArrayListEmpleados {
     private int size;
    private Empleado[] list;

    
    public boolean insert(Empleado ob, int p) {
        if (p - 1 < size && p - 1 > 0) {
            list[p - 1] = ob;
            size++;
            return true;
        } else {
            return false;
        }
    }

    
    public Empleado get(int p) {
        if (p - 1 < size && p - 1 > 0) {
            return list[p - 1];
        } else {
            return null;
        }
    }

    
    public void eraser(int p) {
        if (p - 1 < size && p - 1 > 0) {
            list[p - 1] = null;
            for (int i = p; i < size; i++) {
                if (i != size) {
                    list[i - 1] = list[i];
                    list[i] = null;
                }
            }
            size--;
        }
    }

    
    public int find(Empleado Empleado) {
        for (int i = 0; i < size; i++) {
            if (Empleado.equals(list[i]) ) {
                return i + 1;
            }
        }
        return -1;
    }

    
    public Empleado nextTo(int p) {
        if (p + 2 > size || p + 2 < 0) {
            return null;
        } else {
            return list[p + 2];
        }
    }

    
    public Empleado backTo(int p) {
        if (p - 2 > size || p - 2 < 0) {
            return null;
        } else {
            return list[p - 2];
        }
    }

    
    public void clear(int size) {
        list = new Empleado[size];
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
            System.out.println(i+" "+list[i]);
        }
    }

}
