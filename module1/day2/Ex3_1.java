package day2;
import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an animal classification (Domestic / Wild / Marine)");
        String animal = scanner.nextLine();
    
        animal = animal.toLowerCase();
        switch (animal){
            case "domestic":
                System.out.println("Cat, Dog");
                break;
            case "wild":
                System.out.println("Lion, Tiger");
                break;
            case "marine":
                System.out.println("Dolphin, Shark");
                break;
            default:
                System.out.println("Unknown classification");
                break;
        }
        scanner.close();
    }
}
