package week3.pr1.character.exercises.geometry;

import java.util.Scanner;

public class PointInACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Enter a point with two coordinates: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        boolean withinCircle =
                (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        System.out.println("Point (" + x + ", "+ y + ") is " +
                ((withinCircle) ? "in " : "not in ") + "the circle");
    }
}
