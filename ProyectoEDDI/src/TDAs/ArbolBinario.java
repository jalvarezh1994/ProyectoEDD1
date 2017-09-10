/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class ArbolBinario {

    private final int NULL = -1;
    private int tamArbol;
    private Nodo[] arbol;
    private int raiz;
    private ArrayList travel;

    public Nodo[] getArbol() {
        return arbol;
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

    public ArbolBinario(int numElementos) {
        try {
            this.arbol = new Nodo[numElementos];
            this.raiz = NULL;
            this.travel = null;
        } catch (Exception e) {
            System.out.println("No puede ser negativo");
            this.arbol = new Nodo[100];
            this.raiz = NULL;
            this.travel = null;
        }
    }

    public Nodo father(Nodo nodo) {
        if (nodo.getFather() == raiz) {
            return null;
        } else {
            return arbol[nodo.getFather()];
        }
    }

    public boolean estaVacio() {
        return (NULL == raiz);
    }

    public Nodo nodoRaiz() {
        if (!estaVacio()) {
            return arbol[raiz];
        }
        return null;
    }

    public boolean agregarNodo(Nodo nodo, int father) {
        if (!estaVacio()) {
            Nodo n_node = nodo;
            Nodo node_add = arbol[father];

            if (node_add.getRight() == NULL) {
                arbol[tamArbol] = n_node;
                n_node.setPos(tamArbol);
                n_node.setFather(father);
                node_add.setRight(tamArbol);
                tamArbol++;
                return true;

            } else if (node_add.getLeft() == NULL) {
                arbol[tamArbol] = n_node;
                n_node.setPos(tamArbol);
                n_node.setFather(father);
                node_add.setLeft(tamArbol);
                tamArbol++;
                return true;

            }

            return false;
        } else {
            Nodo n_node = nodo;
            arbol[tamArbol] = n_node;
            n_node.setPos(tamArbol);
            raiz = n_node.getPos();
            tamArbol++;
        }

        return false;
    }

    private boolean esOperador(char expresion) {
        if (expresion == '*' || expresion == '/' || expresion == '^'
                || expresion == '-' || expresion == '+' || expresion == ')') {
            return true;
        }
        return false;
    }

    private boolean esOperador(String expresion) {
        if (expresion.equals("*") || expresion.equals("/") || expresion.equals("^")
                || expresion.equals("-") || expresion.equals("+") || expresion.equals(")")) {
            return true;
        }
        return false;
    }

    public ArrayList convertirInfija_Postfija(String expresion) {
        PilaArreglos pila_exp = new PilaArreglos(expresion.length());
        ArrayList<String> exp = new ArrayList<>();
        Operador actual;
        Operador pActual;
        String aux = "";
        for (int i = 0; i < expresion.length(); i++) {

            if (expresion.charAt(i) != ' ' && expresion.charAt(i) != '(') {
                if (esOperador(expresion.charAt(i))) {

                    if (pila_exp.isEmpty()) {
                        pila_exp.push(expresion.charAt(i));
                    } else if (expresion.charAt(i) == ')') {
                        while (!pila_exp.isEmpty()) {
                            exp.add(pila_exp.pop().toString());
                        }
                    } else {
                        actual = new Operador(expresion.charAt(i));
                        pActual = new Operador((char) pila_exp.top());
                        if (actual.valor > pActual.valor) {
                            pila_exp.push(expresion.charAt(i));

                            //Si es de menor saca todo lo de la pila    
                        } else if (actual.valor < pActual.valor) {
                            while (!pila_exp.isEmpty()) {
                                exp.add(pila_exp.pop().toString());
                                //expPostfija += (char) pila_exp.pop();

                            }
                            pila_exp.push(expresion.charAt(i));
                            //Si son de igual los cambia ,Saca el que esta encima y lo cambia por el que esta abajo    
                        } else if (actual.valor == pActual.valor) {

                            exp.add(pila_exp.pop().toString());
                            //expPostfija += (char) pila_exp.pop();
                            pila_exp.push(expresion.charAt(i));

                        }
                    }

                } else {
                    aux += expresion.charAt(i);

                    if (i + 1 == expresion.length()) {
                        exp.add(aux);
                        aux = "";
                    } else if (esOperador(expresion.charAt(i + 1)) && expresion.charAt(i + 1) != '(') {
                        exp.add(aux);
                        aux = "";
                    }
                }
            }
        }
        while (!pila_exp.isEmpty()) {
            exp.add(pila_exp.pop().toString());
        }
        return exp;
    }

    public void crearArbolExpresiones(ArrayList<String> exp) {
        PilaArreglos pilaNodo = new PilaArreglos(exp.size());
        ArrayList<String> nodos = exp;
        int padre = 0;
        int cont = 0;
        for (int i = nodos.size() - 1; i >= 0; i--) {

            if (esOperador(nodos.get(i))) {
                if (estaVacio()) {
                    pilaNodo.push(new Nodo(nodos.get(i)));
                    this.agregarNodo((Nodo) pilaNodo.top(), padre);
                } else {
                    padre = ((Nodo) pilaNodo.top()).getPos();
                    Nodo n_nodo = new Nodo(nodos.get(i));
                    this.agregarNodo(n_nodo, padre);
                    pilaNodo.push(n_nodo);
                }

            } else {
                padre = ((Nodo) pilaNodo.top()).getPos();
                this.agregarNodo(new Nodo(nodos.get(i)), padre);
                if (((Nodo) pilaNodo.top()).getLeft() != NULL && ((Nodo) pilaNodo.top()).getRight() != NULL) {
                    pilaNodo.pop();
                }

            }
        }
    }

    public void imprimirRecursivo(int posicion, int nivel) {
        for (int i = 0; i < tamArbol; i++) {
            if (arbol[i].getFather() == posicion) {
                for (int j = 0; j < nivel; j++) {
                    System.out.print("--");
                }
                System.out.println(arbol[i].getElemento());
                imprimirRecursivo(i, nivel + 1);
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamArbol; i++) {
            System.out.println(arbol[i]);
        }
    }

    public ArrayList postOrden(int posicion) {

        if (posicion == raiz) {
            travel = new ArrayList();
        }
        if (NULL != posicion) {
            Nodo nodo = arbol[posicion];
            postOrden(nodo.getLeft());
            postOrden(nodo.getRight());
            evaluar(nodo);
            travel.add(nodo.getElemento());
        }
        return travel;
    }

    public void evaluar(Nodo nodo) {
        double resultado = 0;
        if (nodo.getLeft() != NULL && nodo.getRight() != NULL) {
           // System.out.println("Que tienen");
            //System.out.println(arbol[nodo.getLeft()].getElemento().toString() + " " + arbol[nodo.getRight()].getElemento().toString());
            double operador1 = Double.parseDouble(arbol[nodo.getLeft()].getElemento().toString());
            double operador2 = Double.parseDouble(arbol[nodo.getRight()].getElemento().toString());
           // System.out.println(operador1 + "  " + operador2);
            switch (nodo.getElemento().toString()) {
                case "-":
                    resultado = operador1 - operador2;
                    break;
                case "+":
                    resultado = operador1 + operador2;
                    break;
                case "/":
                    resultado = operador1 / operador2;
                    break;
                case "*":
                    resultado = operador1 * operador2;
                    break;
                case "^":
                    resultado = (int) Math.pow(operador1, operador2);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println(resultado);
            nodo.setElemento(Double.toString(resultado));
        }

    }

}
