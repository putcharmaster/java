package day4;
import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int input = scanner.nextInt();

        int fibo = 0;
        System.out.printf("The Fibonacci sequence of %d terms is ", input);
        for(int i = 0; i < input; i++)
        {
            //System.out.printf("The Fibonacci sequence of %d terms is ", input);
            System.out.printf("%d ", fibo);

        }
    }
}
