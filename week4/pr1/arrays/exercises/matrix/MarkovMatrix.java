package week4.pr1.arrays.exercises.matrix;

import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) {
        // Declaration
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        // Input
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Output
        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        double errorNum = 0.0000000001;

        // Check for any negative number
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] <= 0) {
                    return false;
                }
            }
        }

        // Sum columns
        for (int j = 0; j < 3; j++) {
            double colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            if (Math.abs(colSum - 1) > errorNum) return false;
        }
        return true;
    }
}
