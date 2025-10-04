package week4.pr1.arrays.exercises.number;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        // Declaration
        Scanner sc = new Scanner(System.in);
        long number, digits;

        // Input
        System.out.println("Enter an integer: ");
        number = sc.nextLong();

        // Handle negative numbers
        if (number < 0) {
            number = number * -1;
        }

        // Check if number is less than 10b
        if (number >= 10000000000L) {
            System.out.println("Number is too large! Must be less than 10 billion.");
            sc.close();
            return;
        }

        // Count digits
        if (number >= 1000000000) {
            digits = 10;
        } else if (number >= 100000000) {
            digits = 9;
        } else if (number >= 10000000) {
            digits = 8;
        } else if (number >= 1000000) {
            digits = 7;
        } else if (number >= 100000) {
            digits = 6;
        } else if (number >= 10000) {
            digits = 5;
        } else if (number >= 1000) {
            digits = 4;
        } else if (number >= 100) {
            digits = 3;
        } else if (number >= 10) {
            digits = 2;
        } else {
            digits = 1;
        }

        // Output
        System.out.println("The number has " + digits + " digits");
    }
}
