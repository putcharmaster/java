package day2;
import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Price of product 1:");
        int one = scanner.nextInt();
        System.out.println("Price of product 2:");
        int two = scanner.nextInt();
        System.out.println("Price of product 3:");
        int three = scanner.nextInt();

        if (one > two)
        {
            if (one > three)
                System.out.println("Promotion! Total for three items: "+ one);
            else
                System.err.println("Promotion! Total for three items: " + three);
        }
        else 
        {
            if (two > three)
                System.out.println("Promotion! Total for three items: "+ two);            
            else
                System.out.println("Promotion! Total for three items: "+ three);
        }
        scanner.close();
    }
}
