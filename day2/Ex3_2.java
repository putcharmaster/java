package day2;
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a food:");
        String food = scanner.nextLine();

        food = food.toLowerCase();
        switch(food)
        {
            case "apple", "banana", "cherry":
                System.out.println("Fruit");
                break;
            case "carrot", "spinach", "potato":
                System.out.println("Vegetable");
                break;
            case "chicken", "beef", "pork":
                System.out.println("Meat");
                break;
            default:
                System.out.println("Unknown classification");
                break;
        }
        scanner.close();
    }
}
