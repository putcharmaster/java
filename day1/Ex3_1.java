import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
      
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the cost of one night at the hotel: \n>>>");
        int nightcost = myScanner.nextInt();
        System.out.print("Enter the number of days of the trip: \n>>>");
        int numberOfDays = myScanner.nextInt();

        int total = nightcost * numberOfDays;
        System.out.print("Price of the trip: " + total);

        myScanner.close();
    }    
}
