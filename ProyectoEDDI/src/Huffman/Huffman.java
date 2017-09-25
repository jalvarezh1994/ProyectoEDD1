package Huffman;

import java.util.PriorityQueue;

public class Huffman {

    private String text = "";

    public HuffmanTree getTree(int[] charFrequency) {
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<>();

        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                trees.offer(new HuffmanLeaf(charFrequency[i], (char) i)); // Ingreso todos los elementos en la cola de prioridad.
            }
        }

        while (trees.size() > 1) { // Encuentra los dos nodos con menor frecuencia.
            HuffmanTree first = trees.poll(); // Agarro el primer nodo del árbol.
            HuffmanTree second = trees.poll(); //  Agarro el segundo nodo del árbol.

            trees.offer(new HuffmanNode(first, second)); // Agrego ambos nodos al árbol.
        }

        return trees.poll(); // Retorna el primer elemento en la cola.
    }

    public String encode(HuffmanTree tree, String encode) {
        assert tree != null;

        String encodedText = "";

        for (char character : encode.toCharArray()) {
            encodedText += getCodes(tree, new StringBuffer(), character); // Utilizo un StringBuffer, que es un String que puede ser modificado al momento de la ejecución.
        }

        return encodedText;
    }

    public String decode(HuffmanTree tree, String encode) {
        assert tree != null;

        String decodedText = "";
        HuffmanNode node = (HuffmanNode) tree;

        for (char code : encode.toCharArray()) {
            if (code == '0') { // Cuando es igual a 0, es el lado izquierdo.
                if (node.left instanceof HuffmanLeaf) { // Si el nodo a la izquierda es una hoja...
                    decodedText += ((HuffmanLeaf) node.left).value; // Devuelve el valor almacenado en ese nodo.
                    node = (HuffmanNode) tree; // Vuelve a la raíz del árbol.
                } else {
                    node = (HuffmanNode) node.left; // Si no, sigue recorriendo el lado izquierdo.
                }
            } else if (code == '1') { // Cuando es igual a 1, es el lado derecho.
                if (node.right instanceof HuffmanLeaf) { // Si el nodo a la derecha es una hoja...
                    decodedText += ((HuffmanLeaf) node.right).value; // Devuelve el valor almacenado en ese nodo.
                    node = (HuffmanNode) tree; // Vuelve a la raíz del árbol.
                } else {
                    node = (HuffmanNode) node.right; // Si no, sigue recorriendo el lado derecho.
                }
            }
        }

        return decodedText; // Retorna el código decodificado.
    }

    public String printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;

        if (tree instanceof HuffmanLeaf) { // Si es una hoja...
            HuffmanLeaf leaf = (HuffmanLeaf) tree;

            text += leaf.value + "\t" + leaf.frequency + "\t   " + prefix + "\n"; // Imprimo el código y la frecuencia del nodo.
        } else if (tree instanceof HuffmanNode) { // Si es un nodo...
            HuffmanNode node = (HuffmanNode) tree;

            prefix.append('0'); // Agrego un 0 al final del String.
            printCodes(node.left, prefix); // Llamo la recursiva para recorrer la izquierda del árbol.
            prefix.deleteCharAt(prefix.length() - 1);

            prefix.append('1'); // Agrego un 1 al final del String.
            printCodes(node.right, prefix); // Llamo la recursiva para recorrer la derecha del árbol.
            prefix.deleteCharAt(prefix.length() - 1);
        }

        return text;
    }

    public String getCodes(HuffmanTree tree, StringBuffer prefix, char w) {
        assert tree != null;

        if (tree instanceof HuffmanLeaf) { // Si es una hoja...
            HuffmanLeaf leaf = (HuffmanLeaf) tree;

            if (leaf.value == w) { // Si la hoja es el caracter w, devuelvo el String de prefijos.
                return prefix.toString();
            }
        } else if (tree instanceof HuffmanNode) { // Si es un nodo...
            HuffmanNode node = (HuffmanNode) tree;

            prefix.append('0'); // Agrego un 0 al final del String.
            String left = getCodes(node.left, prefix, w); // Llamo la recursiva para recorrer la izquierda del árbol.
            prefix.deleteCharAt(prefix.length() - 1);

            prefix.append('1'); // Agrego un 1 al final del String.
            String right = getCodes(node.right, prefix, w); // Llamo la recursiva para recorrer la izquierda del árbol.
            prefix.deleteCharAt(prefix.length() - 1);

            if (left == null) { // Si no hay elementos a la izquierda, retorna el lado de la derecha.
                return right;
            } else { // Si no hay elementos a la derecha, retorna el lado de la izquierda.
                return left;
            }
        }

        return null; // Si no tiene nada el árbol, retorna null.
    }
}
