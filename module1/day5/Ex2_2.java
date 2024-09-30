package day5;
import java.util.Scanner;


public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int input1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int input2 = scanner.nextInt();
        int sum = input1 + input2;

        int abs = (sum < 0) ? Math.abs(sum) : sum;
        System.out.printf("The positive sum of %d and %d is %d",input1,input2,abs);
    }
}
