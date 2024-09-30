package day4;
import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        int v = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'a' ||
            input.charAt(i) == 'e' ||
            input.charAt(i) == 'i' ||
            input.charAt(i) == 'o' ||
            input.charAt(i) == 'u' )
            v++;
        }
        if (v == 0)
            System.out.println("This sentence has 0 vowel");
        else
            System.out.printf("This sentence has %d vowels%n", v);
    }
}
