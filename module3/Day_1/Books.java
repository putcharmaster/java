package module3.Day_1;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book name:");
        String title = scanner.nextLine();
        System.out.println("Book author:");
        String author = scanner.nextLine();
        System.out.println("Book ISBN");
        String ISBN = scanner.nextLine();
        System.out.println("The book was added.");
    }
    
}
