/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author Diego
 */
class TDA_ArrayStack {

    private Object[] element;
    private int size;
    private int last;

    public TDA_ArrayStack(int size) {
        element = new Object[size];
        this.size = size;
        last = -1;

    }

    public void clear(int size) {
        element = new Object[size];
        this.size = size;
    }

    public Object top() {
        if (!isEmpty()) {
            return element[last];
        }
        return null;
    }

    public Object pop() {

        if (!isEmpty()) {
            Object aux = element[last];
            element[last] = null;
            last--;

            return aux;
        }
        return null;
    }

    public boolean push(Object ob) {
        if (last + 1 < size) {
            element[last + 1] = ob;
            last++;
            return true;
        }
        return false;

    }

    public boolean isEmpty() {
        if (last == -1) {
            return true;
        }

        return false;
    }

    public void print() {
        for (int i = last; i >= 0; i--) {
            System.out.println(i + ":" + element[i]);
        }
    }
}
