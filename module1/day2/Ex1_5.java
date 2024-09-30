package day2;
import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your GPA:");
        double gpa = scanner.nextDouble();
       
        boolean valid_age = age >= 18 && age <= 25;
        boolean valid_gpa = gpa >= 3.0;

        if (valid_age && valid_gpa)
            System.out.println("Congratulations! You're eligible for admission.");
        else if  (valid_age || valid_gpa)
            System.out.println("You don't meet all the requirements.");
        else
            System.out.println("Sorry, you're not eligible for admission.");
        scanner.close();
    }

}
