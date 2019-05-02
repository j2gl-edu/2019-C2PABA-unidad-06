package edu.advanced.unit6.sort;

public class QuickSort {

    private static boolean DEBUG_ENABLED = true;
    private int array[];

    private void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        int length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        log("lowerIndex   = " + lowerIndex);
        log("higherIndex  = " + higherIndex);
        log("pivot        = " + pivot + "");
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                log("Array Before = " + convertToString(array));
                exchangeNumbers(i, j);
                log("Array After  = " + convertToString(array));
                i++;
                j--;
                // log("Moving i = " + i + ", j = " + j);
            }
        }

        log("i = " + i + ", j = " + j);

        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void log(String s) {
        if (DEBUG_ENABLED) {
            System.out.println(s);
        }
    }

    private static String convertToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public static void main(String a[]) {
        QuickSort sorter = new QuickSort();
        //int[] input = {3, 7, 5, 8, 2};
        int[] input = {3, 7, 8, 5, 2, 1, 9, 5, 4};
        //int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };

        System.out.println(convertToString(input));
        sorter.sort(input);
        System.out.println(convertToString(input));
    }
}
