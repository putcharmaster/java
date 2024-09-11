package day2;
import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:  ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        if (first > second)
            System.out.println("The first number is greater.");
        else if (first == second)
            System.out.println("The numbers are equal.");
        else
            System.out.println("The second number is greater.");
        scanner.close();
    }
}
