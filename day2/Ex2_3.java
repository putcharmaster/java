package day2;
import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Amount:");
        double amount = scanner.nextDouble();
        System.out.println("Current time (hour)");
        int time = scanner.nextInt();

        if (amount < 0 )
            amount = -amount;
        if (time >= 0 && time <= 24)
        {
        boolean pro = time >= 20 && time <= 22;
        if (pro)
            System.out.println("Promotion! Total to pay: " + amount/2);
        else{
            if (time <= 8 || time >= 22)
                System.out.println("The store is closed!");
            else
            System.out.println("Total to pay: "+ amount);
        }
    }
        else
            System.out.println("give valid hour 0/24");
        scanner.close();
    }
}
