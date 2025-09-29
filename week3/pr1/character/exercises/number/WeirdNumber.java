package week3.pr1.character.exercises.number;

import java.util.Scanner;

public class WeirdNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        if (number % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (number >=2 && number <= 5) System.out.println("Not Weird");
            if (number >=6 && number <= 20) System.out.println("Weird");
            else System.out.println("Not Weird");
        }

    }
}
