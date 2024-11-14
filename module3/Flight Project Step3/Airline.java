import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * Class to hold the project's main method.
 */
public class Airline {
    public static void main(String[] args) {

        //Create the aircrafts
        Airbus320 plane1 = new Airbus320();
        Airbus380 plane2 = new Airbus380();
        Boeing737 plane3 = new Boeing737();

        Map<String,Flight> flights = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String choice = "";
        do {
            //Request the flight information
            System.out.println(">>> New Flight <<<");
            System.out.print("Flight number: ");
            String flightNumber = scanner.nextLine();
            System.out.print("Flight destination: ");
            String flightDestination = scanner.nextLine();
            
            boolean validAircraftModel = false;
            Aircraft aircraft = null;
            while (!validAircraftModel) {
                System.out.print("Aircraft model: ");
                String aircraftModel = scanner.nextLine();
                switch (aircraftModel) {
                    case "Airbus320":
                        aircraft = plane1;
                        validAircraftModel = true;
                        break;
                    case "Airbus380":
                        aircraft = plane2;
                        validAircraftModel = true;
                        break;
                    case "Boeing737":
                        aircraft = plane3;
                        validAircraftModel = true;
                        break;
                    default:
                        System.out.println("Aircraft not found.");
                        break;
                }
            }
        
            //Create the Flight object
            Flight flight = new Flight(flightNumber, flightDestination, aircraft);
            flights.put(flightNumber, flight);
            System.out.println("Flight created. Would you like to add another flight (y/n)? ");
            choice = scanner.nextLine();   
        } while (choice.equals("y"));        
        
        //Loop to allow booking of seats and updating flights
        while (!choice.equals("e")) {
            System.out.print("Would you like to (a) book a seat, (b) see the amount of available seats, (c) update a flight or (e) exit? ");
            choice = scanner.nextLine();
            if (choice.equals("a") || choice.equals("c")) {
                //For options a and c need to ask for the flight number
                System.out.print("Enter the flight number: ");
                String flightNumber = scanner.nextLine();
                Flight flight = flights.get(flightNumber);
                if (flight == null) {
                    System.out.println("Flight not found.");
                } else {
                    if (choice.equals("a")) {
                        if (flight.bookSeat()) {
                            System.out.println("Seat booked!");
                        } else {
                            System.out.println("Sorry, flight is already full.");
                        }
                    } else {
                        System.out.print("Enter the new status " + FlightStatus.getStatusString() + ": ");
                        String newStatus = scanner.nextLine();
                        flight.setStatus(newStatus);
                        System.out.println("Flight status updated.");
                    }
                }              
            }
            
            if (choice.equals("b")) {
                for(Flight flight : flights.values()) {
                    flight.printAvailableSeats();
                }
            }
        }
        
        scanner.close();
    }
}