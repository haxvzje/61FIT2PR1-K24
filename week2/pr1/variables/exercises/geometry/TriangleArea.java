package week2.pr1.variables.exercises.geometry;

import java.util.Scanner;

public class TriangleArea {

    public static double calVector(double x1, double y1, double x2, double y2) {
        double vX = x2 - x1;
        double vY = y2 - y1;

        return Math.pow(vX*vX + vY*vY, 0.5);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three points for a triangle:");

        double x1 = sc.nextDouble(); //A
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble(); //B
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble(); //C
        double y3 = sc.nextDouble();

        double ab = calVector(x1, y1, x2, y2);
        double bc = calVector(x2, y2, x3, y3);
        double ca = calVector(x3, y3, x1, y1);

        double s = (ab + bc + ca)/2;
        double result = Math.pow(s*(s-ab)*(s-bc)*(s-ca), 0.5);

        System.out.printf("The area of the triangle is %.1f", result);

    }
}