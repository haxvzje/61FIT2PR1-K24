package week4.pr1.arrays.exercises.isbn;

import java.util.Scanner;

public class ISBNCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = sc.nextLine();

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
            System.exit(1);
        }

        int checksum = 0;

        for (int i = 0; i < isbn.length(); i++) {
            checksum += i % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(i) + "") : Integer.parseInt(isbn.charAt(i) + "");
        }
        checksum = 10 - checksum % 10;

        System.out.println("The ISBN-13 number is " + isbn + (checksum == 10 ? 0 : checksum));
    }
}
