import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Try { // Renamed the class to "Try"
    public static void main(String[] args){
       String url = "jdbc:postgresql://localhost:5432/dvdrental";
       String user = "postgres";
       String password = "admin";

       try {
           Connection myConnection = DriverManager.getConnection(url, user, password);
           System.out.println("Connected to the PostgreSQL server successfully.");
       } catch (SQLException e) {
           System.out.println("Connection to the PostgreSQL server failed: " + e.getMessage());    
       }
    }
}
