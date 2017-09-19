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
    private NodoArbolBinario[] arbol;
    private int raiz;
    private ArrayList travel;

    public NodoArbolBinario[] getArbol() {
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

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario(100);
        String exp = "2*3+4/5";
        ArrayList<String> expresion = arbol.convertirInfija_Postfija(exp);

        arbol.crearArbolExpresiones(expresion);
        System.out.println(expresion);
        arbol.imprimirRecursivo(-1, 0);
        arbol.postOrden(0);
        arbol.imprimirRecursivo(-1, 0);
        //arbol.imprimirRecursivo(0, 0);

    }

    public ArbolBinario(int numElementos) {
        try {
            this.arbol = new NodoArbolBinario[numElementos];
            this.raiz = NULL;
            this.travel = null;
        } catch (Exception e) {
            System.out.println("No puede ser negativo");
            this.arbol = new NodoArbolBinario[100];
            this.raiz = NULL;
            this.travel = null;
        }
    }

    public NodoArbolBinario father(NodoArbolBinario nodo) {
        if (nodo.getFather() == raiz) {
            return null;
        } else {
            return arbol[nodo.getFather()];
        }
    }

    public boolean estaVacio() {
        return (NULL == raiz);
    }

    public NodoArbolBinario nodoRaiz() {
        if (!estaVacio()) {
            return arbol[raiz];
        }
        return null;
    }

    public boolean agregarNodoArbolBinario(NodoArbolBinario nodo, int father) {
        if (!estaVacio()) {
            NodoArbolBinario n_node = nodo;
            NodoArbolBinario node_add = arbol[father];

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
            NodoArbolBinario n_node = nodo;
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
        PilaArreglos pilaNodoArbolBinario = new PilaArreglos(exp.size());
        ArrayList<String> nodos = exp;
        int padre = 0;
        int cont = 0;
        for (int i = nodos.size() - 1; i >= 0; i--) {

            if (esOperador(nodos.get(i))) {
                if (this.estaVacio()) {
                    //System.out.println(nodos.get(i));
                    pilaNodoArbolBinario.push(new NodoArbolBinario(nodos.get(i)));
                    this.agregarNodoArbolBinario((NodoArbolBinario) pilaNodoArbolBinario.top(), padre);

                } else {
                    padre = ((NodoArbolBinario) pilaNodoArbolBinario.top()).getPos();
                    NodoArbolBinario n_nodo = new NodoArbolBinario(nodos.get(i));
                    this.agregarNodoArbolBinario(n_nodo, padre);
                    pilaNodoArbolBinario.push(n_nodo);
                }

            } else {
                padre = ((NodoArbolBinario) pilaNodoArbolBinario.top()).getPos();
                if (padre != NULL) {
                    this.agregarNodoArbolBinario(new NodoArbolBinario(nodos.get(i)), padre);
                } else {
                    this.agregarNodoArbolBinario(new NodoArbolBinario(nodos.get(i)), raiz);

                }
                //System.out.println("Pop"+pilaNodoArbolBinario.top());

                //System.out.println("Pop"+pilaNodoArbolBinario.top());
                try{
                while (((NodoArbolBinario) pilaNodoArbolBinario.top()).getLeft() != NULL && ((NodoArbolBinario) pilaNodoArbolBinario.top()).getRight() != NULL) {
                    pilaNodoArbolBinario.pop();
                }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            }
        }
        imprimir();
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
            NodoArbolBinario nodo = arbol[posicion];
            postOrden(nodo.getLeft());
            postOrden(nodo.getRight());
            evaluar(nodo);
            travel.add(nodo.getElemento());
            System.out.println(nodo);
        }
        return travel;
    }

    public void evaluar(NodoArbolBinario nodo) {
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
