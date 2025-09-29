package week3.pr1.character.exercises.calendar;

import java.util.Scanner;

public class DaysOfAMonth {

    public static void main(String[] args) {

        //        Enter a year:
        //        Enter a month:
        //        Jan 2001 has 31 days

        int year;
        String month;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        System.out.println("Enter a month: ");
        month = sc.next();
        month = month.substring(0, 1).toUpperCase() + month.substring(1);

        switch (month) {
            case "Feb":
                if (year % 4 == 0) {
                    System.out.printf("%s %d has 29 days", month, year);
                } else System.out.printf("%s %d has 28 days", month, year);
                return;
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.printf("%s %d has 31 days", month, year);
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.printf("%s %d has 30 days", month, year);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
