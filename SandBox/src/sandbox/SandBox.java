/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;


import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class SandBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String expresion = "A+F*G+H/2^2";
        BinaryTree arbol = new BinaryTree(expresion.length());
        arbol.creacionArbolExpresion(expresion);
        //System.out.println(arbol.convertirInfijaPostfija(expresion));
       //System.out.println(arbol.recorridoPostorden(arbol.root().getPos()));
        //System.out.println("\nArbolito");
        arbol.imprimirRecursivo(-1, 0);
        
        arbol.imprimir();
    }
    
}
