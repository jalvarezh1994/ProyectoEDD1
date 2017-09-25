/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7Kruskal;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class MergeSort {

    public static ArrayList<AristaKruskal> ordenar(AristaKruskal[] a) {
        MergeSort merge = new MergeSort();
        AristaKruskal[] b = merge.mergesort(a, 0, a.length - 1);
        ArrayList<AristaKruskal> arr=new ArrayList();
        for (int i = 0; i < b.length; i++) {
            arr.add(b[i]);
        }
        return arr;
    }

    public AristaKruskal[] mergesort(AristaKruskal[] A, int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            return merge(A, izq, m, der);
        }
        return null;
    }

    public AristaKruskal[] merge(AristaKruskal A[], int izq, int m, int der) {
        int i, j, k;
        AristaKruskal[] B = new AristaKruskal[A.length]; //array auxiliar
        for (i = izq; i <= der; i++) //copia ambas mitades en el array auxiliar
        {
            B[i] = A[i];
        }

        i = izq;
        j = m + 1;
        k = izq;
        while (i <= m && j <= der) //copia el siguiente elemento más grande
        {
            if (B[i].getPeso() <= B[j].getPeso()) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= m) //copia los elementos que quedan de la
        {
            A[k++] = B[i++]; //primera mitad (si los hay)
        }

        return A;
    }
}
