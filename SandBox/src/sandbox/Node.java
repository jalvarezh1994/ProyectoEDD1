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
public class Node {

    //Simbol:Nodo de caracteres
    //Pos:su posicion en el arreglo
    //father: el padre 
    //left y right hijos
    private char simbol;
    private int pos;
    private int father;
    private int right;
    private int left;
   
    public Node(char info) {
        simbol = info;
        this.father = -1;
        this.right = -1;
        this.left = -1;
        this.pos = -1;
    }
    
    
    

    public char getSimbol() {
        return simbol;
    }

    public void setSimbol(char simbol) {
        this.simbol = simbol;
    }

    public int getFather() {
        return father;
    }

    public void setFather(int father) {
        this.father = father;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (this.simbol != other.simbol) {
            return false;
        }
        if (this.father != other.father) {
            return false;
        }
        if (this.right != other.right) {
            return false;
        }
        if (this.left != other.left) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Node{" + "\nsimbol=" + simbol + "\npos=" + pos + "\nfather=" + father + "\nright=" + right + "\nleft=" + left + "}\n";
    }
    
}
