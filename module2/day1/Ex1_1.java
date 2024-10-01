// package module2.day1;
import java.util.Scanner;

/**
 * get the area value
 */

public class Ex1_1 {
    /**
     * 
     * @param n1 is the width
     * @param n2 is the height
     * @return is multiple of n1 and n2
     */
    public  static int result(int n1, int n2) {
    return n1 * n2;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rectangle width:");
        int width = scanner.nextInt();

        System.out.println(("Rectangle height:"));
        int height = scanner.nextInt();

        int r = result(width, height);
        System.out.printf("The area of the rectangle is %d.\n", r);

        scanner.close();

    }
}
