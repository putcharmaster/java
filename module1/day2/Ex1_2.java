package day2;
import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your exam score:");
        int score = scanner.nextInt();
        if (score >= 50)
            System.out.println("You passed the exam!");
        else
            System.out.println("You failed the exam.");
        scanner.close();
    }
}
