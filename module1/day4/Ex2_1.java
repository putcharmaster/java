package day4;
import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10");
        int input = scanner.nextInt();
        boolean within_range = input >= 1 && input <= 10;

        for(int i = 1; i < 11; i++)
        {
            int res = input * i;
            System.out.println(input+" x "+i+" = "+res);
        }
        scanner.close();
    }
}
