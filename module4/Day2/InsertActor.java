import java.sql.*;

public class InsertActor {
    public static void main(String[] args) {
        try {
            // Load the driver explicitly
            Class.forName("org.postgresql.Driver");
            
            String url = "jdbc:postgresql://localhost:5432/dvdrental";
            String user = "postgres";
            String password = "admin";
            
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
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

 