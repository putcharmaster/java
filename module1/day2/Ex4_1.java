package day2;
import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Leave a travel review:");
        String rv = scanner.nextLine();
        System.out.println("Thanks for the review! It is "+rv.length()+ " characters long.");
        scanner.close();
    }    
}
