package week2.pr1.variables.exercises.geometry;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {

//        Enter speed and acceleration:
//        The minimum runway length of this airplane is 514.286

        Scanner sc = new Scanner(System.in);
        double speed, acceleration;
        String result;

        System.out.print("Enter speed and acceleration: ");
        speed = sc.nextDouble();
        acceleration = sc.nextDouble();

        result = String.format("%.3f", Math.pow(speed,2)/(2*acceleration));

        System.out.println("\nThe minimum runway length of this airplane is " + result);

    }
}