package edu.advanced.unit6.sort;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Selection Sort");

        int menor, indice, n, i, j;
        n = 20;
        int A[] = new int[n];

        System.out.print("Arreglo Original: ");
        for (i = 0; i < n; i++) {
            A[i] = (int) Math.round(Math.random() * 1000);
            System.out.print(A[i] + ", ");
        }

        for (i = 0; i < n; i++) {
            menor = A[i];
            indice = i;

            for (j = i + 1; j < n; j++) {
                if (menor > A[j]) {
                    menor = A[j];
                    indice = j;
                }
            }

            A[indice] = A[i];
            A[i] = menor;

        }

        System.out.println();
        System.out.print("Arreglo Ordenado: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println();

    }

}
