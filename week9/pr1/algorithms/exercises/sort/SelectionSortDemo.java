package week9.pr1.algorithms.exercises.sort;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        // Declaration
        int[] arrayA = {64, 25, 12, 22, 11};

        // Input & Process
        System.out.println("A: " + Arrays.toString(arrayA));
        int[] arrayB = selectionSort(arrayA);
        System.out.println("B: " + Arrays.toString(arrayB));
    }
    public static int[] selectionSort(int[] A) {
        // Declaration
        int n = A.length;
        int[] B = new int[n];

        // Process
        for (int i = 0; i < n; i++) {
            int p = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[p]) {
                    p = j;
                }
            }
            B[i] = A[p];
            A[p] = A[i];
        }
        return B;
    }
}
