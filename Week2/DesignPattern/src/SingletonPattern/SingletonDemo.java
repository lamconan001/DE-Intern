package SingletonPattern;

public class SingletonDemo{
    public static void main(String[] args) {
        // Accessing the single instance of DatabaseConnectionManager
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        // Using the connection manager to handle database connections...
    }
}