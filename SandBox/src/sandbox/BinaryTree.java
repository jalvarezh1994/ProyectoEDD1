/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Diego
 */
public class BinaryTree {

    //Mapa del arbol
    //indice de la raiz en el arbol
    final int NULL = -1;
    int sizeTree;
    Node[] tree;
    int indexRoot;
    ArrayList travel;

    public BinaryTree(int numElements) {
        if (numElements < 0) {
            System.out.println("No puede ser Negativo");
        } else {

            this.tree = new Node[numElements];
            this.indexRoot = NULL;
            this.travel = null;
        }
    }

    public Node father(Node node) {
        if (node.getFather() == indexRoot) {
            return null;
        } else {
            return tree[node.getFather()];
        }
    }

    public boolean isTreeEmpty() {
        return (NULL == indexRoot);
    }

    public Node sonLeft(Node node) {
        if (!isTreeEmpty()) {
            if (node.getLeft() != NULL) {
                return tree[node.getLeft()];
            }
        }
        return null;
    }

    public Node sonRight(Node node) {
        if (!isTreeEmpty()) {
            if (node.getRight() != NULL) {
                return tree[node.getRight()];
            }
        }
        return null;
    }

    public Node root() {
        if (!isTreeEmpty()) {
            return tree[indexRoot];
        }
        return null;
    }

    public boolean addNode(char element, int father) {
        if (!isTreeEmpty()) {
            Node n_node = new Node(element);
            Node node_add = tree[father];

            if (node_add.getLeft() == NULL) {
                tree[sizeTree] = n_node;
                n_node.setPos(sizeTree);
                n_node.setFather(father);
                node_add.setLeft(sizeTree);
                sizeTree++;
                return true;
            } else if (node_add.getRight() == NULL) {
                tree[sizeTree] = n_node;
                n_node.setPos(sizeTree);
                n_node.setFather(father);
                node_add.setRight(sizeTree);
                sizeTree++;
                return true;
            }
            return false;
        } else {
            Node n_node = new Node(element);
            tree[sizeTree] = n_node;
            n_node.setPos(sizeTree);
            indexRoot = n_node.getPos();
            sizeTree++;
        }

        return false;
    }

    public boolean addNode(Node nodo, int father) {
        if (!isTreeEmpty()) {
            Node n_node = nodo;
            Node node_add = tree[father];

            if (node_add.getLeft() == NULL) {
                tree[sizeTree] = n_node;
                n_node.setPos(sizeTree);
                n_node.setFather(father);
                node_add.setLeft(sizeTree);
                sizeTree++;
                return true;
            } else if (node_add.getRight() == NULL) {
                tree[sizeTree] = n_node;
                n_node.setPos(sizeTree);
                n_node.setFather(father);
                node_add.setRight(sizeTree);
                sizeTree++;
                return true;
            }
            return false;
        } else {
            Node n_node = nodo;
            tree[sizeTree] = n_node;
            n_node.setPos(sizeTree);
            indexRoot = n_node.getPos();
            sizeTree++;
        }

        return false;
    }

    public void imprimir() {
        for (int i = 0; i < sizeTree; i++) {
            System.out.println(tree[i]);
        }
    }

    public ArrayList recorridoPostorden(int posicion) {
        if (posicion == indexRoot) {
            travel = new ArrayList();
        }
        if (NULL != posicion) {
            Node nodo = tree[posicion];
            recorridoPostorden(nodo.getLeft());
            recorridoPostorden(nodo.getRight());
            travel.add(nodo.getSimbol());
        }
        return travel;
    }

    public void imprimirRecursivo(int posicion , int nivel) {
        for (int i = 0; i < sizeTree; i++) {
            if(tree[i].getFather() == posicion){
                for (int j = 0; j < nivel; j++) {
                    System.out.print("--");
                }
                System.out.println(tree[i].getSimbol());
                imprimirRecursivo(i, nivel+1);
            }
        }
    }

    public void creacionArbolExpresion(String expresion) {
        TDA_ArrayStack pNodo = new TDA_ArrayStack(expresion.length());
        expresion = convertirInfijaPostfija(expresion);
        int father = 0;
        int cont = 0;
        for (int i = expresion.length() - 1; i >= 0; i--) {

            if (expresion.charAt(i) == '*' || expresion.charAt(i) == '/' || expresion.charAt(i) == '^'
                    || expresion.charAt(i) == '-' || expresion.charAt(i) == '+') {
                if (isTreeEmpty()) {
                    pNodo.push(new Node(expresion.charAt(i)));
                    this.addNode((Node) pNodo.top(), father);

                } else {
                    father = ((Node) pNodo.top()).getPos();
                    Node n_node = new Node(expresion.charAt(i));
                    this.addNode(n_node, father);
                    pNodo.push(n_node);
                }

            } else {
                // System.out.println("Estado pila @@@@@");
                // pNodo.print();
                father = ((Node) pNodo.top()).getPos();
                //pNodo.push(new Node(expresion.charAt(i)));
                this.addNode(new Node(expresion.charAt(i)), father);
                if (((Node) pNodo.top()).getLeft() != NULL && ((Node) pNodo.top()).getRight() != NULL) {
                    pNodo.pop();
                }

            }

        }

    }

    public String convertirInfijaPostfija(String expresion) {
        TDA_ArrayStack pExpresiones = new TDA_ArrayStack(expresion.length());
        String expPostfija = "";
        Operador actual;
        Operador pActual;
        for (int i = 0; i < expresion.length(); i++) {
            //  System.out.println(pExpresiones.push(expresion.charAt(i)));
            if (expresion.charAt(i) != ' ' && expresion.charAt(i) != '(') {
                if (expresion.charAt(i) == '*' || expresion.charAt(i) == '/' || expresion.charAt(i) == '^'
                        || expresion.charAt(i) == '-' || expresion.charAt(i) == '+' || expresion.charAt(i) == ')') {

                    if (pExpresiones.isEmpty()) {

                        pExpresiones.push(expresion.charAt(i));
                        System.out.println("Pop pila");
                        System.out.println(expresion.charAt(i));
                        //System.out.println(pExpresiones.pop());

                    } else if (expresion.charAt(i) == ')') {
                        while (!pExpresiones.isEmpty()) {
                            expPostfija += (char) pExpresiones.pop();
                        }

                    } else {

                        actual = new Operador(expresion.charAt(i));
                        pActual = new Operador((char) pExpresiones.top());
                        if (actual.valor > pActual.valor) {
                            pExpresiones.push(expresion.charAt(i));

                        } else if (actual.valor < pActual.valor) {
                            while (!pExpresiones.isEmpty()) {
                                expPostfija += (char) pExpresiones.pop();

                            }
                            pExpresiones.push(expresion.charAt(i));

                        } else if (actual.valor == pActual.valor) {
                            expPostfija += (char) pExpresiones.pop();
                            pExpresiones.push(expresion.charAt(i));

                        }
                    }
                } else {
                    if (i != expresion.length() - 1) {
                        expPostfija += expresion.charAt(i);
                    } else {
                        expPostfija += expresion.charAt(i);
                        while (!pExpresiones.isEmpty()) {
                            expPostfija += (char) pExpresiones.pop();
                        }

                    }
                    //System.out.println(expPostfija);
                }
            }

        }
        return expPostfija;
    }

    private class Operador {

        int valor = 0;
        char simbol;

        public Operador(char simbol) {
            this.simbol = simbol;
            if (simbol == '^') {
                valor = 3;
            } else if (simbol == '/' || simbol == '*') {
                valor = 2;
            } else if (simbol == '+' || simbol == '-') {
                valor = 1;
            }

        }

    }
}
//    public boolean crea0(char info, Node posicion) {
//        Node nodo = new Node(info);
//        if (isTreeEmpty()) {
//            tree[0] = nodo;
//            indexRoot = 0;
//                
//        } else {
//            
//        }
//
//        for (int i = 0; i < 10; i++) {
//
//        }
//    }

