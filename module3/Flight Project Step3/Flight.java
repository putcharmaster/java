import module3.Flight.Bookable;

/**
 * Class used to represent a Flight within the system
 */
public class Flight implements Bookable{
    private String flightNumber;
    private String destination;
    private Aircraft aircraft;
    private int bookedSeats;
    private FlightStatus status;
   
    /**
     * Flight constructor
     * @param flightNumber  //The flight number
     * @param destination   //The destination of the flight
     * @param aircraft      //The aircraft assigned to the flight
     */
    public Flight(String flightNumber, String destination, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.aircraft = aircraft;
        this.bookedSeats = 0;
        this.status = FlightStatus.ON_TIME;
    }

    //Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return aircraft.getCapacity();
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setStatus(String status) {
        this.status = FlightStatus.valueOf(status);
    }

    //Other methods

    /**
     * Procedure to print the amount of available seats within the flight
     */
    public void printAvailableSeats() {
        int availableSeats = getCapacity() - bookedSeats;
        System.out.println("Available seats on flight " + flightNumber + " to " + destination + " (" + status + "): " + availableSeats);
    }

    /**
     * Function to allow booking a seat within the flight
     * @return true if it was possible to book a seat of false if it was not possible because the flight was already full
     */
    public boolean bookSeat() {
        int availableSeats = getCapacity() - bookedSeats;
        if (availableSeats > 0) {
            bookedSeats++;
            return true;
        } else {
            return false;
        }
    }
}