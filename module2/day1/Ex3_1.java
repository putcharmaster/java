// package module2.day1;
import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Number " + (i+1) + ";");
            int input = scanner.nextInt();
            if (i == 0 || input > max)
                max = input;
            
            array[i] = input;
        }
        System.out.printf("The maximum is %d.\n", max);
    }
}
