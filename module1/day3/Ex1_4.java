package day3;
import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = -1;

        System.out.println("Enter any number: ");
        int input = scanner.nextInt();

        while (input != -1)
        {
            if (input > max)
                max = input;
            System.out.println("Enter any number: ");
            input = scanner.nextInt();
            if (input == -1)
                continue;
        }
        System.out.println("The greatest number was "+max);
    }
}
