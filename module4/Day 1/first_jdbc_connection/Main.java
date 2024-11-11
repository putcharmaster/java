import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/dvdrental";

        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "admin");
        
        // Try-with-resources statement to ensure that resources are closed
        try (Connection conn = DriverManager.getConnection(url, props)) {
            System.out.println("Connected to the PostgreSQL servers successfully.");

            // Example query
            String query = "SELECT title, description FROM film LIMIT 10;";

            // Try-with-resources statement to ensure that resources are closed
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {
                    String title = rs.getString("title");
                    String description = rs.getString("description");
                    System.out.println(title + " - " + description);
                }
            } catch (SQLException e) {
                System.out.println("Query execution failed: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Connection to the PostgreSQL server failed: " + e.getMessage());
        }
    }
}