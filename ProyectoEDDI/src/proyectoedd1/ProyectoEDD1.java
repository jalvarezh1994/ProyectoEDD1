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
public class ProyectoEDD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Menú+\n"
//                + "1. Cálculo de evaluación por desempeño.\n"
//                + "2. Resolución de expresiones matemáticas.\n"
//                + "3. Compresión de archivos de texto.\n"
//                + "4. Determinar si un grafo es bi-coloreable.\n"
//                + "5. Menor costo los orígenes/todos los destinos.\n"
//                + "6. Menor costo un orígen/todos los destinos.\n"
//                + "7. Árboles de expansión mínima.\n"
//                + "8. Menú principal/ventana central.\n");
//        System.out.print("Ingrese ");
//        int opc=0;
//        switch (opc) {
//            case 1:
//                
//                break;
//            default:
//                throw new AssertionError();
//        }

        TDA_ArrayListInt probando = new TDA_ArrayListInt(10);
        probando.insert(10, 1);
        probando.insert(11, 2);
        probando.insert(2, 3);
        probando.insert(23, 4);

        probando.printList();

        System.out.println("");

        System.out.println(probando.nextTo(0));
    }

    static void ejercicio1() {

    }
}
