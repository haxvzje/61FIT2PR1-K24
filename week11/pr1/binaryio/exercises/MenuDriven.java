package week11.pr1.binaryio.exercises;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        // Declaration
        Scanner sc = new Scanner(System.in);
        int n = 0;

        // Process & Output
        while (n != 5) {
            // Display Menu
            System.out.println("[1] Add item \n" +
                    "[2] Item list \n" +
                    "[3] Edit an item \n" +
                    "[4] Remove an item \n" +
                    "[5] Quit \n" +
                    "Choose an option: ");
            // Ask for option
            n = sc.nextInt();

            // Process option
            switch (n) {
                case 1:
                    System.out.println("\nAdding a new item...\n");
                    break;
                case 2:
                    System.out.println("\nListing all items...\n");
                    break;
                case 5:
                    System.out.print("\nGoodbye!");
                    break;
                default:
                    System.out.println("\nOption doesn't exist!\n");
                    break;
            }
        }
    }
}
