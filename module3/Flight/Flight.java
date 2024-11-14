package module3.Flight;

public class Flight implements Bookable {
    private String flight_number;
    private String destination;
    private Aircraft aircraft;
    private int booked_seats;
    private FlightStatus status;

    public Flight(String flight_number, String destination, Aircraft aircraft) {
        this.flight_number = flight_number;
        this.destination = destination;
        this.aircraft = aircraft;
        this.booked_seats = 0;
        this.status = FlightStatus.ON_TIME;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
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

    public int getBooked_seats() {
        return booked_seats;
    }

    public void setBooked_seats(int booked_seats) {
        this.booked_seats = booked_seats;
    }

    // Bookable interface methods
    @Override
    public int getCurrentBookings() {
        return booked_seats;
    }

    @Override
    public int getBookingsLeft() {
        return getCapacity() - booked_seats;
    }

    @Override
    public boolean makeBooking() {
        if (booked_seats < getCapacity()) {
            booked_seats++;
            return true;
        } else {
            System.out.println("No bookings left for this flight.");
            return false;
        }
    }
}
