import java.util.Scanner;

    public class TicTacToe2D {
        // 3x3 ka board
        static char[][] board = new char[3][3];

        // Board initialize anf fill each place with empty
        public static void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = ' ';
                }
            }
        }

        // Printing the board
        public static void printBoard() {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        // To check whether the cell in which we are going to input is empty or not
        public static boolean isValidMove(int row, int col) {
            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                return board[row][col] == ' ';
            }
            return false;
        }

        // To play your move
        public static void makeMove(int row, int col, char player) {
            board[row][col] = player;
        }

        // To check whether either of the player has won or not
        public static boolean checkWin(char player) {
            // Row check
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                    return true;
                }
            }

            // Column check
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                    return true;
                }
            }

            // Diagonal check
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return true;
            }
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return true;
            }

            return false;
        }

        // Checking for Draw ( If all the cells  are full and no one has won )
        public static boolean isDraw() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        return false; // if space is left
                    }
                }
            }
            return true; // if no space is left => means draw condition
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            initializeBoard();

            char currentPlayer = 'X'; // I am starting with player X
            boolean gameEnded = false;  // Using a flag  , as GameEnded and initially keeping it false !

            System.out.println("Welcome to Tic Tac Toe!");
            printBoard();

            while (!gameEnded) {
                System.out.println("Player " + currentPlayer + " ka turn hai.");

                int row, col;

                while (true) {
                    System.out.print("Row (0,1,2) enter karo: ");
                    row = sc.nextInt();
                    System.out.print("Column (0,1,2) enter karo: ");
                    col = sc.nextInt();

                    if (isValidMove(row, col)) {
                        break; // sahi move hai
                    } else {
                        System.out.println("Invalid move! Try again.");
                    }
                }

                makeMove(row, col, currentPlayer);
                printBoard();

                // Win check
                if (checkWin(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins! 🎉");
                    gameEnded = true;
                }
                // Draw check
                else if (isDraw()) {
                    System.out.println("Game draw ho gaya!");
                    gameEnded = true;
                }
                // Next turn
                else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }
        }
    }


