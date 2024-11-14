

import java.sql.DriverManager;
import java.sql.SQLException;

public class EventManager {

    public static void main(String[] var0) {
        try {
           Class.forName("org.postgresql.Driver");
           String var1 = "jdbc:postgresql://localhost:5432/event_manager";
           String var2 = "postgres";
           String var3 = "admin";
           DriverManager.getConnection(var1, var2, var3);
           System.out.println("Connected successfully!");
        } catch (ClassNotFoundException var5) {
           System.out.println("PostgreSQL JDBC driver not found: " + String.valueOf(var5));
        } catch (SQLException var6) {
           System.out.println("Connection error: " + var6.getMessage());
        }
  
     }
    
}