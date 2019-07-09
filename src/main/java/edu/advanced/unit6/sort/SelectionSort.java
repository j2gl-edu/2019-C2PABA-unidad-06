package edu.advanced.unit6.sort;

public class SelectionSort {

	private static void displayArray(int[] array) {
		for (int anArray : array) {
			System.out.print(anArray + ", ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Selection Sort");

		int menor, indice, size, i, j;
		size = 5;
		int array[] = new int[size];

		for (i = 0; i < size; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
		}
		System.out.print("Arreglo Original: ");
		displayArray(array);

		for (i = 0; i < size; i++) {
			menor = array[i];
			indice = i;

			for (j = i + 1; j < size; j++) {
				if (menor > array[j]) {
					menor = array[j];
					indice = j;
				}
			}

			array[indice] = array[i];
			array[i] = menor;
		}

		System.out.println();
		System.out.print("Arreglo Ordenado: ");
		displayArray(array);
		System.out.println();
	}

}
