package day3;
import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a sentence");
        String s_input = scanner.nextLine();
        if (input % 2 == 0)
            s_input = s_input.toLowerCase();
        else
            s_input = s_input.toUpperCase();
        System.out.println(s_input);
    }
}
