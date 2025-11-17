package week11.pr1.binaryio.exercises;

import java.io.*;
import java.util.Arrays;

public class LoadObject {
    public static void main(String[] args) {
        try {
            // Declaration
            File file = new File("data.bin");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Process
            // Read object from stream
            String[] stringArray = (String[]) ois.readObject();
            // Close stream
            ois.close();
            // Display the string array
            System.out.println(Arrays.toString(stringArray));
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        }
    }
}
