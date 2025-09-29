package week3.pr1.character.exercises.education;

import java.util.Scanner;

public class StudentMajor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two characters: \n");
        String input = sc.next().toLowerCase();
        char majors = input.charAt(0);
        char level = input.charAt(1);

        String majorsResult, levelResult;
//        M: Mathematics
//        C: Computer Science
//        I: Information Technology

        if (majors == 'm') {
            majorsResult = "Mathematics";
        }
        else if (majors == 'c') {
            majorsResult = "Computer Science";
        }
        else if (majors == 'i') {
            majorsResult = "Information Technology";
        }
        else {
            System.out.println("Invalid input");
            return;
        }

        // Level diff
        //        1, 2, 3, 4 - freshman, sophomore, junior, or senior
        if (level == '1') {
            levelResult = "Freshman";
        }
        else if (level == '2') {
            levelResult = "Sophomore";
        }
        else if (level == '3') {
            levelResult = "Junior";
        }
        else if (level == '4') {
            levelResult = "Senior";
        }
        else {
            System.out.println("Invalid input");
            return;
        }

        System.out.printf("%s %s", majorsResult, levelResult);
    }
}
