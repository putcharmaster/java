// package module2.day1;
import java.util.Scanner;

public class Ex1_2 {
    /**
     * 
     * @param i increments until 10
     * @param n is the user input
     * @return multiply n and i
     */
    public static int mult(int i, int n){
        return i * n;
    }

    /**
     *  The main method that prompts the user to enter a number and prints the result of mult
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            int m = mult(i, n);
            System.out.printf("%d x %d = %d\n", n, i, m);
        }

    }
    
}
