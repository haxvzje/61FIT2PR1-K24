package week3.pr1.character.exercises.calendar;

import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        //        Enter a year:
        //        Enter a month:
        //        Jan 2001 has 31 days

        int intMonth, intYear;
        String strMonth;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month as integer:");
        intMonth = sc.nextInt();
        System.out.println("Enter the year as integer: ");
        intYear = sc.nextInt();

        switch (intMonth) {
            case 1:
                strMonth = "January";
                break;
            case 2:
                strMonth = "February";
                break;
            case 3:
                strMonth = "March";
                break;
            case 4:
                strMonth = "April";
                break;
            case 5:
                strMonth = "May";
                break;
            case 6:
                strMonth = "June";
                break;
            case 7:
                strMonth = "July";
                break;
            case 8:
                strMonth = "August";
                break;
            case 9:
                strMonth = "September";
                break;
            case 10:
                strMonth = "October";
                break;
            case 11:
                strMonth = "November";
                break;
            case 12:
                strMonth = "December";
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        switch (strMonth) {
            case "February":
                if (intYear % 4 == 0) {
                    System.out.printf("%s %d had 29 days", strMonth, intYear);
                } else System.out.printf("%s %d had 28 days", strMonth, intYear);
                return;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.printf("%s %d had 31 days", strMonth, intYear);
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.printf("%s %d had 30 days", strMonth, intYear);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

