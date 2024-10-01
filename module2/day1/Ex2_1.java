// package module2.day1;
import java.util.Scanner;
/**
* This class provides a method to check if a number is prime.
*/
public class Ex2_1 {
    /**
    * Checks if the given number is prime.
    *
    * @param num the number to check
    * @return true if the number is prime, false otherwise
    */
    public static boolean isPrime(int num){
  
        if (num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
    /**
     * The main method that prompts the user to enter a number and checks if it is prime.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = scanner.nextInt();
        boolean result = isPrime(input);
        if (result == true)
            System.out.println(input + " is a prime number.");
        else
            System.out.println(input + " is not a prime number.");
    }
}
