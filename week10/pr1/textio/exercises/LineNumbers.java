package week10.pr1.textio.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) {
        // Declaration file
        File fileInput = new File("marry.txt");
        File fileOutput = new File("marry2.txt");
        String currentLine;
        int i = 1;

        try {
            // Create output file
            fileOutput.createNewFile();

            // Declaration process object
            Scanner sc = new Scanner(fileInput);
            FileWriter fileWriter = new FileWriter(fileOutput);

            // Process & Output
            while (sc.hasNextLine()) {
                currentLine = sc.nextLine();
                fileWriter.append(i + ". " + currentLine + "\n");
                i++;
            }
            fileWriter.close();
        } catch (IOException e) {
            // Handling exception
            System.out.println(e);
        }

    }
}
