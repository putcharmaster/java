package TOYSTORE;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ToyStore {
    public static void main(String[] args) {
        
        Map<String, Article> inventory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String choice = "";
        while(!choice.equals("e")){

            System.out.println("Press (a) to add toy, (b) to add book, (p) to print the list and (e) to exit ");
            choice = scanner.nextLine();

            switch (choice) {
                case "t":
                System.out.print("Toy name: ");
                String toyName = scanner.nextLine();
    
                System.out.print("Toy type (" + ToyType.getToyTypes() + "): ");
                String toyType = scanner.nextLine();
    
                System.out.print("Toy price: ");
                double toyPrice = scanner.nextDouble();
                scanner.nextLine();
    
                Toy toy = new Toy(toyName, toyType, toyPrice);
                inventory.put(toy.getId(), toy);
                System.out.println("Toy created");
                    
                    break;
                case "b":
                System.out.print("Book name: ");
                String bookName = scanner.nextLine();
    
                System.out.print("Book type (" + ToyType.getToyTypes() + "): ");
                String bookType = scanner.nextLine();
    
                System.out.print("Book price: ");
                double bookrice = scanner.nextDouble();
                scanner.nextLine();
    
                Book book = new Book(bookPrice, bookTitle, bookAuthor);
                inventory.put(book.getId(), book);
                System.out.println("Book created");
                
                break;
                case "p":
                
                break;
            
                default:
                    break;
            }



            System.out.print("Toy name: ");
            String toyName = scanner.nextLine();

            System.out.print("Toy type (" + ToyType.getToyTypes() + "): ");
            String toyType = scanner.nextLine();

            System.out.print("Toy price: ");
            double toyPrice = scanner.nextDouble();
            scanner.nextLine();

            Toy toy = new Toy(toyName, toyType, toyPrice);
            inventory.put(toy.getId(), toy);
            System.out.println("Toy created");


            
        }
        scanner.close();
    }
}
