package day4;
import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        int result = 0;


        for(int i = input; i > 0; i--)
            result = (i == input) ? (input*1) : (result*i);
        System.out.printf("The factorial of %d is %d", input, result);
    }
}
