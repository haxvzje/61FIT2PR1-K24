package week3.pr1.character.exercises.geometry;

import java.util.Scanner;

public class PointInATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

        if (x > intersectx || y > intersecty) {
            System.out.println("The point (" + x + ", " + y + ") is not in the triangle");
        } else System.out.println("The point (" + x + ", " + y + ") is in the triangle");
    }
}
