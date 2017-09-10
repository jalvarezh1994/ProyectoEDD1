/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

/**
 *
 * @author Diego
 */
public class PilaArreglos extends Pila {

    private Object[] element;
    private int size;
    private int last;

    public PilaArreglos(int size) {
        element = new Object[size];
        this.size = size;
        last = -1;

    }

    @Override
    public void clear(int size) {
        element = new Object[size];
        this.size = size;
    }

    @Override
    public Object top() {
        if (!isEmpty()) {
            return element[last];
        }
        return null;
    }

    @Override
    public Object pop() {

        if (!isEmpty()) {
            Object aux = element[last];
            element[last] = null;
            last--;

            return aux;
        }
        return null;
    }

    @Override
    public boolean push(Object ob) {
        if (last + 1 < size) {
            element[last + 1] = ob;
            last++;
            return true;
        }
        return false;

    }

    @Override
    public boolean isEmpty() {
        if (last == -1) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String elemenString = "";
        for (int i = size; i >= 0; i--) {
            elemenString += "|" + element[i] + "|";
        }
        return elemenString;
    }

}
