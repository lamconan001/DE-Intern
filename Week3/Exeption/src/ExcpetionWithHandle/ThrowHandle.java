package ExcpetionWithHandle;


import java.util.Scanner;

public class ThrowHandle {
    // throw is used to throw a concrete exception.
    // Normally, throw is used in user-define exception
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age");
            }
            else {
                System.out.println("Welcome!");
            }
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }


    }
}
