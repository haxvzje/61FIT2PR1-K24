package week4.pr1.arrays.exercises.geometry;

import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {

        // Declaration
        int inputLines;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        inputLines = sc.nextInt();

        if (inputLines == 1) {
            System.out.println("1");
            return;
        }

        if (inputLines < 1 || inputLines > 15) {
            System.out.println("Invalid number of lines: Should be an integer from 1 to 15.");
            return;
        }


    }
}
