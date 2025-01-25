package practice;
// package Day2;
import java.sql.*;

public class InsertActor {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/dvdrental";
        String user = "postgres";
        String password = "admin";
        String query = "INSERT INTO actor (first_name, last_name) VALUES (?, ?)";

        try {
            // Load PostgreSQL JDBC driver explicitly
            Class.forName("org.postgresql.Driver");
            
            // Establish the database connection
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(query)) {

                // Set parameters for the prepared statement
                pstmt.setString(1, "John");
                pstmt.setString(2, "Doe");

                // Execute the update and print the result
                int affectedRows = pstmt.executeUpdate();
                System.out.println("Inserted " + affectedRows + " rows.");

            } catch (SQLException e) {
                System.out.println("SQL Error: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
    }
}


// // package Day2;
// import java.sql.*;
 
// public class InsertActor {

//     public static void main(String[] args) {

//         String url = "jdbc:postgresql://localhost:5432/dvdrental";

//         String user = "postgres";

//         String password = "admin";
 
//         String query = "INSERT INTO actor (first_name, last_name) VALUES (?, ?)";
 
//         try (Connection conn = DriverManager.getConnection(url, user, password);

//              PreparedStatement pstmt = conn.prepareStatement(query)) {
 
//             pstmt.setString(1, "John");

//             pstmt.setString(2, "Doe");

//             int affectedRows = pstmt.executeUpdate();

//             System.out.println("Inserted " + affectedRows + " rows.");

//         } catch (SQLException e) {

//             System.out.println(e.getMessage());

//         }

//     }

// }

 