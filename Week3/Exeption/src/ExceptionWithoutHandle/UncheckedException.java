package ExceptionWithoutHandle;


public class UncheckedException {
    public static void main(String[] args) {
        System.out.println("Hello World"); // This will be compile because
                                            // exception is not checked
        int[] arr =  new int[5];
        System.out.println(arr[5]);
        System.out.println("Hi"); // This will not be compiled
                                // because exception is checked
    }
}
