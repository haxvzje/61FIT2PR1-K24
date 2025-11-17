package week10.pr1.textio.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RemoveBlanks {
    public static void main(String[] args) {
        // Declaration file
        File fileInput = new File("input.txt");
        File fileOutput = new File("output.txt");
        String currentLine;

        try {
            // Create output file
            fileOutput.createNewFile();

            // Declaration process object
            Scanner sc = new Scanner(fileInput);
            FileWriter fileWriter = new FileWriter(fileOutput);

            // Process & Output
            while (sc.hasNextLine()) {
                currentLine = sc.nextLine();
                if (currentLine == "") continue;
                fileWriter.append(currentLine + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            // Handling exception
            System.out.println(e);
        }

    }
}
