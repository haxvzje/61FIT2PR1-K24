package week4.pr1.arrays.exercises.number;

import java.util.Scanner;

public class FourConsecutiveEqualNumbers {
    public static void main(String[] args) {

        // Declaration
        int rows, columns;
        Scanner sc = new Scanner(System.in);
        int[][] numbersArray = new int[100][100];


        // Input
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbersArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values into the matrix: \n" + isConsecutiveFour(numbersArray));

    }

    public static boolean isConsecutiveFour(int[][] values) {
        boolean check = false;

        int rows = values.length;
        int columns = values[0].length;
        int count = 0;

        // Check 4-same-char by rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Check ngang
                if (values[i][j] == values[i][j+1]) count++;
                else count = 0;
                if (count >= 4) return true;

                //Check xien phai

            }
        }


        return false;
    }
}
