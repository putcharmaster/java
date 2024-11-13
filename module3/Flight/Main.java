package module3.Flight;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Boeing737 plane1 = new Boeing737();
        Airbus320 plane2 = new Airbus320();
        Airbus380 plane3 = new Airbus380();

        Scanner scanner = new Scanner(System.in);
        Map<String, Flight> flights = new HashMap<>();

        System.out.print("Would you like to add a flight? (y/n): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("y")){
            while(choice.equalsIgnoreCase("y")){
                System.out.println(">>> New Flight <<<");
                System.out.print("Enter flight number: ");
                String flight_number = scanner.nextLine();
                System.out.print("Enter destination: ");
                String destination = scanner.nextLine();

                Aircraft aircraft;
                System.out.println("Enter aircraft model (airbus320, airbus380, boeing737): ");
                String aircraftModel = scanner.nextLine().toLowerCase();

                switch (aircraftModel) {
                    case "airbus320":
                        aircraft = plane2;
                        break;
                    case "airbus380":
                        aircraft = plane3;
                        break;
                    case "boeing737":
                        aircraft = plane1;
                        break;
                    default:
                        System.out.println("Invalid aircraft model.");
                        continue;
                }

                Flight flight = new Flight(flight_number, destination, aircraft);
                flights.put(flight_number, flight);
                System.out.println("Flight created. Would you like to add another flight (y/n)? ");
                choice = scanner.nextLine();
            } 
        }

        while (true) {
            System.out.print("Would you like to (a) book a seat, (b) see available seats or (e) exit the program? ");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("e"))
                System.exit(0);

            System.out.print("Enter the flight number: ");
            String flight_number = scanner.nextLine();
            Flight flight = flights.get(flight_number);

            if (flight == null) {
                System.out.println("Flight not found.");
                continue;
            }

            if (answer.equals("a")) {
                if (flight.makeBooking()) {
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("No seats available on this flight.");
                }
            } else if (answer.equals("b")) {
                System.out.printf("Available seats on flight %s to %s: %d%n", flight.getFlight_number(), flight.getDestination(), flight.getBookingsLeft());
            } else {
                System.out.println("Invalid option. Please choose 'a' or 'b'.");
            }
        }
    }
}


// package module3.Flight;
// import java.util.Scanner;
// import java.util.Map;
// import java.util.HashMap;


// public class Main {
//     public static void main(String[] args) {
//         Boeing737 plane1 = new Boeing737();
//         Airbus320 plane2 = new Airbus320();
//         Airbus380 plane3 = new Airbus380();


//         Scanner scanner = new Scanner(System.in);
//         Map<String, Flight> flights = new HashMap<>();

//         System.out.print("Would you like to add a flight? (y/n)");
//         String choice = scanner.nextLine();

//         do {
//             System.out.println(">>> New Flight <<<");
//             System.out.print("Enter flight number: ");
//             String flight_number = scanner.nextLine();
//             System.out.print("Enter destination: ");
//             String destination = scanner.nextLine();
//             // System.out.print("Enter flight capacity: ");
//             // int capacity = scanner.nextInt();
//             Aircraft aircraft;



//             scanner.nextLine();
//             System.out.println("Enter aircraft model: ");
//             String aircraftModel = scanner.nextLine().toLowerCase();

         
//             switch (aircraftModel) {
//                 case "airbus320":
//                     aircraft = plane2;
//                     break;
//                 case "airbus380":
//                     aircraft = plane3;
//                     break;
//                 case "boeing737":
//                     aircraft = plane1;
//                     break;
//                 default:
//                     System.out.println("Invalid aircraft model.");
//                     continue;
//             }

//             Flight flight = new Flight(flight_number, destination, aircraft);
//             flights.put(flight_number, flight);
//             System.out.println("Flight created.\n Would like to add another flight (y/n) ");
//             choice = scanner.nextLine();
//         }while(choice.contains("y"));
       

        


//         while (true) {

             
//             System.out.println("Would you like to (a) book a seat or (b) see the amount of available seats? ");
//             String answer = scanner.nextLine().toLowerCase();
//             if (answer.equals("a") || answer.equals("c"))
//             {
//                 System.out.print("Enter the flight number: ");
//                 String flight_number = scanner.nextLine();
//                 Flight flight = flights.get(flight_number);

//                 if (answer.contains("a")) {

//                     if (flight.bookable()) {
//                         System.out.println("Seat booked!  Would you like to book another flight (y/n)?");
            
//                     }
//                     else
//                         System.out.println("The flight is fully booked.");
//             }
 


//             } else if (answer.contains("b")) {
//                 // Add logic to see the amount of available seats
//                 System.out.printf("Available seats on flight %s to %s: %d\n", flight.getFlightNumber(), flight.getDestination(),
//                         flight.availableSeats());

//             } else {
//                 System.out.println("Invalid option. Please choose either 'a' or 'b'.");
//             }
//         }
//     }

// }
