package day5;
import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("give number 1: ");
        int n1 = scanner.nextInt();

        System.out.print("give number 2: ");
        int n2 = scanner.nextInt();

        System.out.print("give number 3: ");
        int n3 = scanner.nextInt();

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        System.out.printf("The maximum value is %d", max);
        
    }
}
