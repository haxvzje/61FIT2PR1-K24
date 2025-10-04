package week4.pr1.arrays.exercises.pyramid;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumbersPyramid(sc.nextInt());
    }

    public static void printNumbersPyramid(int rows) {
        int displayNumber = 1;

        if (rows < 3 || rows > 10) {
            System.out.println("Invalid number of rows: Should be an integer from 3 to 10.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                if (j != rows - i - 1) System.out.printf("%4s", " ");
                else System.out.printf("%4d", displayNumber);
            }

            for (int j = 1; j < i+1; j++) {
                displayNumber *= 2;
                System.out.printf("%4d", displayNumber);
            }

            for (int j = 1; j < i+1; j++) {
                displayNumber /= 2;
                System.out.printf("%4d", displayNumber);
            }

            System.out.println();
        }
    }
}
