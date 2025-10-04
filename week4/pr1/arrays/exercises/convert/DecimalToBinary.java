package week4.pr1.arrays.exercises.convert;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Declaration & Input
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // Output
        System.out.println(decimalToBinary(input));

    }

    public static String decimalToBinary(int decimal) {

        String result = "";

        if (decimal == 0) return "0";
        if (decimal < 0 ) return "Invalid decimal: Decimal should be an integer that is positive and smaller than or equal to 2147483647.";

        while (decimal != 0) {
            result = (decimal % 2) + result;
            decimal/=2;
        }

        return result;
    }

}
