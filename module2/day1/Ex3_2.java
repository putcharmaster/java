// package module2.day1;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex3_2 {
    // Method to print the list of names without []
    public static void printArray(ArrayList<String> list) {
        System.out.print("The names are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", "); // Add comma and space between names
            }
        }
        System.out.println(); // Move to the next line after printing all names
    }
    /* public static void printArray(ArrayList<String> list){
        System.out.println("The names are" + list);
    } */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many names would you like to store?");
        int num = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> lst = new ArrayList<>();
        for(int i = 0; i < num; i++){
            System.out.println("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            lst.add(name);
        }
        printArray(lst);
       
    }
}
