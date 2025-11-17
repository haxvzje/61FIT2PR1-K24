package week10.pr1.textio.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
    public static void main(String[] args) {
        // Declaration
        File file = new File("hello.txt");
        String fileContent = "Hello, World!";

        try {
            // Create file
            file.createNewFile();
            // Write content in to file
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(fileContent);
            printWriter.close();

            // Read file & Print
            Scanner sc = new Scanner(file);
            System.out.println(sc.nextLine());
        } catch (IOException e) {
            // Handling exception
            System.out.println(e);
        }
    }
}
