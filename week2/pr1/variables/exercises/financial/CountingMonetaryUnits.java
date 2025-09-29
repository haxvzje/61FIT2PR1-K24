package week2.pr1.variables.exercises.financial;

import java.util.Scanner;

public class CountingMonetaryUnits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of money (in dollar): ");

        double amount = sc.nextDouble();

        int cents = (int) (amount * 100);

        int dollars = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        System.out.printf("%.2f has %d dollars, %d quaters, %d dimes, %d nickles, %d cents.", amount, dollars, quarters, dimes, nickels, cents);

    }
}