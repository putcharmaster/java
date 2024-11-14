import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Event {
    private int id;
    private String name;
    private String description; 
    private String location; 
    private Timestamp startDate;
    private Timestamp endDate;
    private int capacity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void print() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println();
        //System.out.printf("Event ID: %d\nEvent Name: %s\nDescription: %s\nLocation: %s\nStart Time: %s\nEnd Time: %s\nCapacity: %d\n\n", id, name, description, location, calendar.getTime(), endDate, capacity);
        //System.out.printf("Event ID: %d\nEvent Name: %s\nDescription: %s\nLocation: %s\nStart Time: %s\nEnd Time: %s\nCapacity: %d\n\n", id, name, description, location, startDate, endDate, capacity);
    }

    public Event(int id, String name, String description, String location, Timestamp startDate, Timestamp endDate, int capacity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.capacity = capacity;
    }
}
