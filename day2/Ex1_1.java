package day2;
import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
      //  System.out.println(age);
        if (age >= 18)
            System.out.println("Welcome to the club!");
       scanner.close();
    }
}

