package ExcpetionWithHandle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchHandle {
    // if in try block, exception happen, then try block will be terminated and
    // catch block will be executed. Finally block will be executed no matter what.
    // Finally block is often used to close file, close database, ...
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");
            int a = 10 / 0;
            System.out.println("A nice day!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Hi");


        // If in try block, exception is not happen, then catch block will not be executed
        Connection conn = null;
        try {

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "username", "password");

            System.out.println("Creating statement...");
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name FROM employees";
            stmt.executeQuery(sql);

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }


}
