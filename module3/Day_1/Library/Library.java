package module3.Library;
import java.time.LocalDate;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Book name:");
        String title = scanner.nextLine();
        System.out.println("Book author:");
        String author = scanner.nextLine();
        System.out.println("Book ISBN:");
        String isbn = scanner.nextLine();

        Book newBook = new Book(title, author, isbn);
        System.out.println("The \"" + newBook.getTitle() + "\" was added.");
        System.out.println("*********************************************");
        System.out.println("Book information:");
        newBook.print();
        System.out.println("*********************************************");
        System.out.print("Enter the customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the customer birth day: ");
        int day = scanner.nextInt();

        System.out.print("Enter the customer birth month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the customer birth year: ");
        int year = scanner.nextInt();

        LocalDate birthdate = LocalDate.of(year, month, day);
        Customer customer1 = new Customer(customerName, birthdate);

        // Step 4: Link customer to the book
        newBook.setLastCustomer(customer1);
        System.out.println("Book updated with customer information.");
        scanner.close();
    }
}
