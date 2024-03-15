// Java Program to Read and Write Binary Files 
import java.io.*;
import java.lang.*;
// Drver Class 
public class Main{
    // Main Function
    public static void main(String[] args)
    {
        try {
            // Writing to binary file
            FileOutputStream outputStream = new FileOutputStream("data.bin");
            String text = " Hello, World!";
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            outputStream.close();

            // Writing to a text file
            FileWriter fileWriter = new FileWriter("data.txt");
            fileWriter.write("It is a nice day!");
            fileWriter.close();


            // Reading from a binary file
            FileInputStream inputStream = new FileInputStream("data.bin");
            int dataBinary;
            while ((dataBinary = inputStream.read()) != -1) {
                System.out.print((char) dataBinary);
            }
            inputStream.close();

            // Reading from a text file
            FileReader fileReader = new FileReader("data.txt");
            int dataText;
            while ((dataText = fileReader.read()) != -1) {
                System.out.print((char) dataText);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
