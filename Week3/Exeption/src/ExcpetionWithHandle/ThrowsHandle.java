package ExcpetionWithHandle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsHandle {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

// throws is used to method and it give method always return an exception
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = null;

        reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        if (reader != null) {
            reader.close();
        }
    }
    // When override, method in subclass cannot throws checked exception if its
    // parent class don't throws exception. However, method in subclass can throws
    // checked exception if its exception equal or is the subclass of its parent's exception.
}


