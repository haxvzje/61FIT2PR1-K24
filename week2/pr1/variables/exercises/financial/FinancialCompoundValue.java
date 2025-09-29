package week2.pr1.variables.exercises.financial;

import java.util.Scanner;

public class FinancialCompoundValue  {

    public static void main(String[] args) {

        final double rate = 0.00417;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        int amount = sc.nextInt();

        // 1000000 * (1 + 0.00417) = 1004170
        double result = amount * (1 + rate);
        result = (amount + result) * (1 + rate);
        result = (amount + result) * (1 + rate);
        result = (amount + result) * (1 + rate);
        result = (amount + result) * (1 + rate);
        result = (amount + result) * (1 + rate);

        System.out.printf("After the sixth month, the account value is $%.2f", result);

    }
}