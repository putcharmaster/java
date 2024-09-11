package day2;
import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        int ticket_price = 15;
        int student_ticket_price = 10;

        System.out.print("How many tickets do you need ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Do you have student discount (y/n)? ");
        String answer = scanner.nextLine();
        if (answer.equals("y"))
            System.out.println("Total tickets price: "+student_ticket_price*amount+" euros");
        else
            System.out.println("Total tickets price: "+ticket_price*amount+" euros");
        scanner.close();
    }
   
}
