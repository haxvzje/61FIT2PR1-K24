package week11.pr1.binaryio.exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObject {
    public static void main(String[] args) {
        // Variable Declaration
        String[] stringArray = {"hello", "world", "kek"};

        try {
            // File & Stream Object Declaration
            File file = new File("data.bin");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Write object
            oos.writeObject(stringArray);
            // Close stream
            oos.close();
        } catch (IOException e) {
            // Handling exception
            e.printStackTrace();
        }
    }
}
