package week4.pr1.arrays.exercises.matrix;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        // Declaration
        Scanner sc = new Scanner(System.in);
        int rows;
        int[] result;
        int[][] numbersArray;

        // Input
        System.out.println("Enter the number of rows in the matrix: ");
        rows = sc.nextInt();
        numbersArray = new int[rows][rows];
        System.out.println("Enter the matrix row by row: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                numbersArray[i][j] = sc.nextInt();
            }
        }

        // Process & Output
        result = findLargestBlock(numbersArray);
        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d", result[0], result[1], result[2]);
    }

    public static int[] findLargestBlock(int[][] m) {
        int n = m.length;
        int[][] dp = new int[n][n];
        int maxSize = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < n; i++) {
            dp[i][0] = m[i][0];
            if (dp[i][0] == 1 && maxSize == 0) {
                maxSize = 1;
                maxRow = i;
                maxCol = 0;
            }
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = m[0][j];
            if (dp[0][j] == 1 && maxSize == 0) {
                maxSize = 1;
                maxRow = 0;
                maxCol = j;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (m[i][j] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    if (dp[i][j] > maxSize) {
                        maxSize = dp[i][j];
                        maxRow = i - maxSize + 1;
                        maxCol = j - maxSize + 1;
                    }
                }
            }
        }

        return new int[]{maxRow, maxCol, maxSize};
    }
}
