package day2;
import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favorite dishes:");
        String input = scanner.nextLine();

        System.out.print("chocolate cake: ");
            if (input.contains("chocolate cake"))
                System.out.println("found");
            else
                System.out.println("not found");
        System.out.print("barbecue: ");
        if ( input.contains("barbecue"))
            System.out.println("found");
        else
            System.out.println("not found");
        scanner.close();
    }
}
