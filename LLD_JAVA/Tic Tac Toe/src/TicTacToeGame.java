
// Class to represent the Tic-Tac-Toe game

import java.util.Scanner;

class TicTacToeGame {
    private TicTacToeBoard board;
    private Player currentPlayer;

    public TicTacToeGame() {
        board = new TicTacToeBoard();
        currentPlayer = Player.X;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        do {
            board.displayBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board.makeMove(row, col, currentPlayer)) {
                if (board.checkWin(currentPlayer)) {
                    board.displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } else if (board.isBoardFull()) {
                    board.displayBoard();
                    System.out.println("The game is a tie!");
                    break;
                }

                currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
            } else {
                System.out.println("Invalid move. Try again.");
            }

        } while (true);

        scanner.close();
    }
}