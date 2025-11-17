package week9.pr1.algorithms.exercises.sort;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] sortedArray = {11, 12, 22, 25, 34, 64, 90};
        int k = 22;

        System.out.println("A: " + Arrays.toString(sortedArray));
        // Call binarySearch() to find position
        int position = binarySearch(sortedArray, k, 0, sortedArray.length - 1);
        System.out.println(position == -1 ? "K not found on A" : "K found on A in position " + position);
    }

    public static int binarySearch(int[] A, int k, int low, int high) {
        int mid = (low + high) / 2;

        if (high < low) return -1;

        if (A[mid] == k) return mid;
        else if (A[mid] > k) {
            return binarySearch(A, k, low, mid - 1);
        }
        else {
            return binarySearch(A, k, mid + 1, high);
        }
    }
}