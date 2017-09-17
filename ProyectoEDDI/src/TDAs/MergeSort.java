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
public class MergeSort {
    
    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int[] a =  {0,2,5,-1,-2,-2,25};
        int[] b = merge.mergesort(a , 0 , a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }

    public int[] mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
           return merge(A, izq, m, der);
        }
        return null;
    }

    public int[] merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; //array auxiliar
        for (i = izq; i <= der; i++) //copia ambas mitades en el array auxiliar
        {
            B[i] = A[i];
        }

        i = izq;
        j = m + 1;
        k = izq;
        while (i <= m && j <= der) //copia el siguiente elemento más grande
        {
            if (B[i] <= B[j]) {
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
