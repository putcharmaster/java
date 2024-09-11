package day3;
import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word starting with A :");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        while (!input.startsWith("a")){
            System.out.println("Incorrect!");
            System.out.println("Enter a word starting with A");
            input = scanner.nextLine();
            input = input.toLowerCase();
        }
        System.out.println("Correct!");
        scanner.close();;
    }
}
