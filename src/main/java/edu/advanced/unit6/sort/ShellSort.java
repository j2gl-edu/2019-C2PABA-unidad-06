package edu.advanced.unit6.sort;

import java.util.Random;

public class ShellSort {

	public static void main(String[] args) {
		System.out.println("Shell Sort");

		int n = 20;
		Random random = new Random();
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(1000);
		}
		
		System.out.println("Arreglo Original: " + displayArray(numbers));
		shell(numbers);
		System.out.println("Arreglo Ordenado: " + displayArray(numbers));
	}

	private static int[] shell(int A[]) {
		int salto, aux, i;
		boolean cambios;
		for (salto = A.length / 2; salto != 0; salto /= 2) {
			cambios = true;
			while (cambios) { // Mientras se intercambie algún elemento
				cambios = false;
				for (i = salto; i < A.length; i++) {// se da una pasada
					if (A[i - salto] > A[i]) { // y si están desordenados
						aux = A[i]; // se reordenan
						A[i] = A[i - salto];
						A[i - salto] = aux;
						cambios = true; // y se marca como cambio.
					}
				}
			}
		}
		return A;
	}

	private static String displayArray(int[] numbers) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < numbers.length - 1; i++) {
			stringBuilder.append(numbers[i] + ", ");
		}
		stringBuilder.append(numbers[numbers.length - 1]);
		return stringBuilder.toString();
	}

}
