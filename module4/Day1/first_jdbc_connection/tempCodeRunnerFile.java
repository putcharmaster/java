import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Ex01 {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/dvdrental";

        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "admin");
        
        // Try-with-resources statement to ensure that resources are closed
        try (Connection conn = DriverManager.getConnection(url, props)) {
            System.out.println("Connected to the PostgreSQL server successfully.");

            // Example query
            String query = "SELECT title, description FROM film LIMIT 10;";

            Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(query);

                while (rs.next()) {
                    String title = rs.getString("title");
                    String description = rs.getString("description");
                    System.out.println(title + " - " + description);
                }
            } catch (SQLException e) {
                System.out.println("Query execution failed: " + e.getMessage());
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        System.out.println("Failed to close ResultSet: " + e.getMessage());
                    }
                }
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        System.out.println("Failed to close Statement: " + e.getMessage());
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Connection to the PostgreSQL server failed: " + e.getMessage());
        }
    }
}