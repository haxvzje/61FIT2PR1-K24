package week4.pr1.arrays.exercises.number;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {

        boolean check, isContainZero;
        int newElement, index;

        int[] input = new int[10];
        isContainZero = false;
        index = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        for (int i = 1; i <= 9; i++) {
            check = true;
            newElement = sc.nextInt();

            for (int j = 1; j <= 9; j++) {
                if (newElement == input[j]) {
                    if (newElement == 0 && !isContainZero) {
                        isContainZero = true;
                        break;
                    }
                    check = false;
                    break;
                }
            }

            if (check) {
                index++;
                input[index] = newElement;
            }
        }

        System.out.println("The number of distinct numbers is " + index);
        System.out.print("The distinct numbers are: ");

        for (int i = 1; i <= index; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
