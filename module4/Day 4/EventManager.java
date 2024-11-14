import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class EventManager {
   public static void main(String[] var0) {
      try {
         Class.forName("org.postgresql.Driver");
         String var1 = "jdbc:postgresql://localhost:5432/event_manager";
         String var2 = "postgres";
         String var3 = "admin";

         String query = "SELECT * FROM event";

         String answer = userOps();

       
         if (answer.equals("e"))
            System.exit(0);
         else if (answer.equals("a") || answer.equals("b")) {
            System.out.println("You selected: " + answer);
         } 
         else {
            System.out.println("Invalid option. Please try again.");
            System.exit(0);
         }
      
         try {
            Connection connection = DriverManager.getConnection(var1, var2, var3);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<Event> eventList = new ArrayList<>();

            while (resultSet.next()) {
               int id = resultSet.getInt("event_id");
               String name = resultSet.getString("event_name");
               String description = resultSet.getString("description"); 
               String location = resultSet.getString("event_location"); 
               Timestamp startDate = resultSet.getTimestamp("start_time");
               Timestamp endDate = resultSet.getTimestamp("end_time");
               int capacity = resultSet.getInt("capacity");

               eventList.add(new Event(id, name, description, location, startDate, endDate, capacity));
            // System.out.printf("Event ID: %d\nEvent Name: %s\nDescription: %s\nLocation: %s\nStart Time: %s\nEnd Time: %s\nCapacity: %d\n\n", id, name, description, location, startDate, endDate, capacity);
               //System.out.println("Event: " + resultSet.getString("name") + " Date: " + resultSet.getString("date"));
            }
            for(Event event : eventList) {
               event.print();
            }

         } catch (SQLException e) {
            System.out.println("Query error: " + e.getMessage());
         }

         DriverManager.getConnection(var1, var2, var3);
         System.out.println("Connected successfully!");
      } catch (ClassNotFoundException var5) {
         System.out.println("PostgreSQL JDBC driver not found: " + String.valueOf(var5));
      } catch (SQLException var6) {
         System.out.println("Connection error: " + var6.getMessage());
      }
   }

   public static String userOps() {
      System.out.println("options menu:");
      System.out.println("(a) See the list of all events, (b) Buy a ticket (e) to exit.");
      System.out.println("Select an option: ");
      Scanner scanner = new Scanner(System.in);
      return scanner.nextLine();
   }
}