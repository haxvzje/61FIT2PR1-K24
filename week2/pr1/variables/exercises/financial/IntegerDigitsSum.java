package week2.pr1.variables.exercises.financial;

import java.util.Scanner;

public class IntegerDigitsSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = sc.nextInt();
        int result = 0;

        while (number > 10) {
            result += number % 10;
            number /= 10;
        }
        result += number;

        System.out.printf("The sum of the digits is %d", result);

    }
}