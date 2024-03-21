package ExceptionWithoutHandle;

public class CheckedException {
    // Checked Exception happen in the compile time.
    public static void main(String args[]) {
        System.out.println("Hello World!"); // This will not be compile because
                                            // exception is checked in compile time
//        Class<?> cls = Class.forName("com.example.MyClass");
//        System.out.println("Class found: " + cls.getName());
    }
}
