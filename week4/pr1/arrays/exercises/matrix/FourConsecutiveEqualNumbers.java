package week4.pr1.arrays.exercises.matrix;

import java.util.Scanner;

public class FourConsecutiveEqualNumbers {
    public static void main(String[] args) {

        // Declaration
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        int[][] numbersArray;


        // Input process
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter values into the matrix: ");
        numbersArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbersArray[i][j] = sc.nextInt();
            }
        }

        // Process and Output
        System.out.println(isConsecutiveFour(numbersArray));

    }

    public static boolean isConsecutiveFour(int[][] values) {
        // Get rows & columns from the matrix
        int rows = values.length;
        int columns = values[0].length;
        int count;

        // Checking from horizontally side
        count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns-1; j++) {
                if (values[i][j] == values[i][j+1]) count+=1;
                else count = 0;
                if (count == 3) return true;
            }
        }

        // Checking from vertically side
        count = 0;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows - 1; i++) {
                if (values[i][j] == values[i+1][j]) count+=1;
                else count = 0;
                if (count == 3) return true;
            }
        }

        // Checking from diagonally side
        // top-left to bottom-right
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < columns - 3; j++) {
                count = 0;
                for (int k = 0; k < 3; k++) {
                    if (values[i + k][j + k] == values[i + k + 1][j + k + 1]) count++;
                    else count = 0;
                    if (count == 3) return true;
                }
            }
        }

        // top-right to bottom-left
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 3; j < columns; j++) {
                count = 0;
                for (int k = 0; k < 3; k++) {
                    if (values[i + k][j - k] == values[i + k + 1][j - k - 1]) count++;
                    else count = 0;
                    if (count == 3) return true;
                }
            }
        }

        // Return result
        return false;
    }
}