package week3.pr1.character.exercises.algebra;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        double a, b, c, r1, r2, discriminant;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c:  \n");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a==0 && b == 0 && c == 0) {
            System.out.println("The equation has infinity roots");
            return;
        }

        discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            r1 = (-b + Math.sqrt(discriminant)) / (2*a);
            r2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            r1 = (-b)/(2*a);
            System.out.printf("The equation has one root " + r1);
        } else System.out.println("The equation has no real roots");
    }
}
