package week3.pr1.character.exercises.number;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        if (number < 0) {
            System.out.println("Negative Number");
            return;
        }

        if (number % 2 == 0) System.out.println("Positive Even Number");
        else System.out.println("Positive Odd Number");
    }
}
