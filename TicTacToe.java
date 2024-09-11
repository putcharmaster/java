import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name Player 1? ");
        String p1 = scanner.nextLine();

        System.out.print("What is your name Player 2? ");
        String p2 = scanner.nextLine();
        System.out.println("\n");

        System.out.println(p1 +" will be X and "+ p2 + " will be O");
        System.out.println("\n");

        //init_board
        char    b1 = '1';
        char    b2 = '2';
        char    b3 = '3';
        char    b4 = '4';
        char    b5 = '5';
        char    b6 = '6';
        char    b7 = '7';
        char    b8 = '8';
        char    b9 = '9';

        
        System.out.println(" " + b1 + " | " + b2 + " | " + b3 + " ");
        System.out.println(" " + b4 + " | " + b5 + " | " + b6 + " ");
        System.out.println(" " + b7 + " | " + b8 + " | " + b9 + " ");

        System.out.println();

        System.out.print(p1 + " choose your move : ");
        String input = scanner.nextLine();
        
        switch (input) {
            case "1":
                b1 = 'X';
                break;
            case "2":
                b2 = 'X';
                break;
            case "3":
                b3 = 'X';
                break;            
            case "4":
                b4 = 'X';
                break;            
            case "5":
                b5 = 'X';
                break;            
            case "6":
                b6 = 'X';
                break;            
            case "7":
                b7 = 'X';
                break;            
            case "8":
                b8 = 'X';
                break;            
            case "9":
                b9 = 'X';
                break;    
        
            default:
                break;
        }

          
        System.out.println(" " + b1 + " | " + b2 + " | " + b3 + " ");
        System.out.println(" " + b4 + " | " + b5 + " | " + b6 + " ");
        System.out.println(" " + b7 + " | " + b8 + " | " + b9 + " ");

        scanner.close();
    }
}
