package week2.pr1.variables.exercises.geometry;

import java.util.Scanner;

public class DistanceOfTwoPoints {
    public static void main(String[] args) {

//        Enter x1 and y1:
//        Enter x2 and y2:
//        The distance between two points is: 8.764131445842194


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 and y1:");

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter x2 and y2:");

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double stFormula = (x2 - x1);
        double ndFormula = (y2 - y1);
        double result = Math.pow((stFormula*stFormula + ndFormula*ndFormula), 0.5);

        System.out.println("The distance between two points is: " + result);

    }
}