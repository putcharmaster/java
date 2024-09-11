import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.print("Client name:\n>>>");
        String name = myScanner.nextLine();
       
        System.out.print("Number of package tours bought:\n>>>");
        int numberPackage = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Destination offered:\n>>>");
        String destination = myScanner.nextLine();
   
        System.out.print("Hello, "+name+"\n" + //
                        "You have traveled with us "+numberPackage+" times already! Do you want to again?\r\n" + //
                        "Our travel agency is having a sale. Trips to "+destination+" are 50% off!");
    }
}
