package day2;

import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like promotional items (yes/no)?");
        String answer = scanner.nextLine();

        boolean a = answer.equals("yes");
        if (a){
        System.out.println("Enter a category: (sweets or something else)");
        String cat = scanner.nextLine();
        
        boolean sweet = cat.equals("sweets");
        if (sweet)
            System.out.println("Gummy fruit for 200 coins");
        else
            System.out.println("Lingonberry juice for 140 coins");    
        }
        else
            System.out.println("\u001B[1mLet us know if you change your mind");
        scanner.close();
    }
}
