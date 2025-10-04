package week4.pr1.arrays.exercises.geometry;

import java.util.Scanner;

public class DisplayPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        int n;
        n = sc.nextInt();
        if (n < 1 || n > 9) {
            System.out.println("Invalid number of rows: Should be an integer from 1 to 9.");
            return;
        }

        // Print all four patterns
        System.out.println("Pattern A");
        printPatternA(n);

        System.out.println("Pattern B");
        printPatternB(n);

        System.out.println("Pattern C");
        printPatternC(n);

        System.out.println("Pattern D");
        printPatternD(n);

        sc.close();
    }

    // PatternA
    public static void printPatternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // PatternB
    public static void printPatternB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // PatternC
    public static void printPatternC(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers from i down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // PatternD
    public static void printPatternD(int n) {
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
