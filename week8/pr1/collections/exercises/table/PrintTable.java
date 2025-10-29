package week8.pr1.collections.exercises.table;

import java.sql.SQLOutput;

public class PrintTable {
    public static void main(String[] args) {

        // Declaration
        int[][] table = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        // Process & Output
        System.out.println("+-----------+");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                // alo
                System.out.print(table[i][j]);
                System.out.print(" | ");
            }
            System.out.println("\n+-----------+");
        }
    }
}