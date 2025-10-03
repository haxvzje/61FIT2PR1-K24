package week4.pr1.arrays.exercises.sort;

import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents, studentsScore, tempScore;
        int[] score = new int[100];
        String studentsName, tempName;
        String[] students = new String[100];
        boolean failKey = false;

        System.out.print("Number of students: ");
        numOfStudents = sc.nextInt();

        if (numOfStudents == 0) {
            System.out.println("\nError: No students to sort.");
            return;
        }

        for (int i = 1; i <= numOfStudents; i++) {
            System.out.printf("\nStudent %d: ", i);
            studentsName = sc.next();
            System.out.printf("\nStudent %d'score: ", i);
            studentsScore = sc.nextInt();
            students[i] = studentsName;
            score[i] = studentsScore;

            if (studentsScore < 0 || studentsScore > 100) failKey = true;
        }

        if (failKey) {
            System.out.println("\nInvalid score: The score cannot be negative or exceed 100.");
            return;
        }

        // Short Students by Score
        for (int i = 1; i <= numOfStudents-1; i++) {
            for (int j = i + 1; j <= numOfStudents; j++) {
                if (score[i] < score[j]) {
                    // switch score
                    tempScore = score[i];
                    score[i] = score[j];
                    score[j] = tempScore;

                    // switch name
                    tempName = students[i];
                    students[i] = students[j];
                    students[j] = tempName;
                }
            }
        }

        // Output
        System.out.print("\nList of students: ");

        for (int i = 1; i <= numOfStudents; i++) {
            System.out.print(students[i] + '(' + score[i] + ')');
            if (i+1 <= numOfStudents) System.out.print(", ");
        }

        System.out.print('.');

    }
}