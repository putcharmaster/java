package day3;
import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random_number = (int)(Math.random() * 101);
    //    System.out.println(random_number);

        System.out.println("Guess the number (1-100): ");
        int input = scanner.nextInt();
        while (random_number != input)
        {
            if (input > random_number)
                System.out.println("Too high. Try again. ");
            else
                System.out.println("Too low. Try again. ");
            System.out.println("Guess the number (1-100): ");
            input = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed the number!");
        scanner.close();

    }
}
