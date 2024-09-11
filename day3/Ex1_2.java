package day3;
import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String good_password = "password123";

        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        while (!password.equals(good_password)){
            System.out.println("Incorrect password. Try again");
            System.out.println("Enter the password: ");
            password = scanner.nextLine();
        }
        System.out.println("Password correct!");
    }
}
