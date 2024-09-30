import java.util.Scanner;

public class TicTacToeStep4 {
    
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

        //Print board
        System.out.println();
        System.out.println(" " + board1 + " | " + board2 + " | " + board3 + " ");
        System.out.println(" " + board4 + " | " + board5 + " | " + board6 + " ");
        System.out.println(" " + board7 + " | " + board8 + " | " + board9 + " ");
        System.out.println();

        int counter = 1;
        boolean playerWon = false;
        while (counter <= 9) {

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
                    default:
                            invalidMove = true;
                }

                if (invalidMove) {
                    System.out.println("Invalid move.");
                } else {
                    //Print board
                    System.out.println();
                    System.out.println(" " + board1 + " | " + board2 + " | " + board3 + " ");
                    System.out.println(" " + board4 + " | " + board5 + " | " + board6 + " ");
                    System.out.println(" " + board7 + " | " + board8 + " | " + board9 + " ");
                    System.out.println();

                    //Check if the player won
                    if ((board1 == board2 && board2 == board3) ||
                        (board4 == board5 && board5 == board6) ||
                        (board7 == board8 && board8 == board9) ||
                        (board1 == board4 && board4 == board7) ||
                        (board2 == board5 && board5 == board8) ||
                        (board3 == board6 && board6 == board9) ||
                        (board1 == board5 && board5 == board9) ||
                        (board3 == board5 && board5 == board7)) {
                            if (playerSymbol == 'X')
                                System.out.println(player1 + " won!");
                            else
                                System.out.println(player2 + " won!");
                            playerWon = true;
                        }
                }
            }

            if (playerWon)
                break;
            else
                counter++;
        }

        if (!playerWon)
            System.out.println("The game was a tie!");
        
        scanner.close();
    }
}
