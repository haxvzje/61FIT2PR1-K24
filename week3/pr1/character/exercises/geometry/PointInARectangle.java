package week3.pr1.character.exercises.geometry;

import java.util.Scanner;

public class PointInARectangle {
    public static void main(String[] args) {
        // Declaration
        double posX, posY, rectangleHeight, rectangleWidth;
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a point with two coordinates: ");
        posX = sc.nextDouble();
        posY = sc.nextDouble();

        // Processing & Output
        rectangleHeight = 5.0 / 2.0;
        rectangleWidth = 10.0 / 2.0;

        if (posX < 0) posX*=-1;
        if (posY < 0) posY*=-1;

        if (posX > rectangleWidth || posY > rectangleHeight) {
            System.out.println("Point (" + posX + ", " + posY + ") is not in the rectangle");
        } else System.out.println("Point (" + posX + ", " + posY + ") is in the rectangle");
    }
}
