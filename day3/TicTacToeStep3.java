import java.util.Scanner;

public class TicTacToeStep3 {
    
    public static void main(String[] args) {

        //Get the player names
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name player 1? ");
        String player1 = scanner.nextLine();
        System.out.print("What is your name player 2? ");
        String player2 = scanner.nextLine();

        System.out.println();
        System.out.println(player1 + " will be X and " + player2 + " will be O");

        //Initialize board variables
        char board1 = '1';
        char board2 = '2';
        char board3 = '3';
        char board4 = '4';
        char board5 = '5';
        char board6 = '6';
        char board7 = '7';
        char board8 = '8';
        char board9 = '9';

        int counter = 1;
        while (counter <= 9) {

            //Print board
            System.out.println();
            System.out.println(" " + board1 + " | " + board2 + " | " + board3 + " ");
            System.out.println(" " + board4 + " | " + board5 + " | " + board6 + " ");
            System.out.println(" " + board7 + " | " + board8 + " | " + board9 + " ");
            System.out.println();

            char playerSymbol;
            boolean invalidMove = true;

            while (invalidMove) {
                if (counter % 2 == 1) {
                    //It is player1's turn
                    System.out.print(player1 + " choose your move: ");
                    playerSymbol = 'X';
                } else {
                    //It is player2's turn
                    System.out.print(player2 + " choose your move: ");
                    playerSymbol = 'O';
                }
            
                String move = scanner.nextLine();
                invalidMove = false;

                switch(move){
                    case "1":
                        if (board1 == '1')
                            board1 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "2":
                        if (board2 == '2')
                            board2 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "3":
                        if (board3 == '3')
                            board3 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "4":
                        if (board4 == '4')
                            board4 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "5":
                        if (board5 == '5')
                            board5 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "6":
                        if (board6 == '6')
                            board6 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "7":
                        if (board7 == '7')
                            board7 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "8":
                        if (board8 == '8')
                            board8 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                    case "9":
                        if (board9 == '9')
                            board9 = playerSymbol;
                        else
                            invalidMove = true;
                        break;
                }

                if (invalidMove) {
                    System.out.println("Invalid move.");
                }
            }

            counter++;
        }

        //Print board
        System.out.println();
        System.out.println(" " + board1 + " | " + board2 + " | " + board3 + " ");
        System.out.println(" " + board4 + " | " + board5 + " | " + board6 + " ");
        System.out.println(" " + board7 + " | " + board8 + " | " + board9 + " ");
        
        scanner.close();
    }
}
