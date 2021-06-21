package workshop.tictactoe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TicTacToeGame {

        /* |---|---|---|
           | 1 | 2 | 3 |
           |-----------|
           | 4 | 5 | 6 |
           |-----------|
           | 7 | 8 | 9 |
           |---|---|---|*/

    static String[] board = new String[9];
    static String turn;

    private String[] createBoard(){
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
        return board;
    }

    private void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    private String playGame(){
        String winner = null;

        while (winner == null) {
            int numInput = getPlayerInput();

            if (numInput == -1){
                continue;
            }

            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
            }

        }
        return winner;
    }

    private int getPlayerInput(){
        Scanner in = new Scanner(System.in);
        int numInput = -1;
        try {
            numInput = in.nextInt();
            if (!(numInput > 0 && numInput <= 9)) {
                System.out.println("Invalid input; re-enter slot number:");
                numInput = -1;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input; re-enter slot number:");
        }

        return numInput;
    }

    private String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0: line = board[0] + board[1] + board[2]; break;
                case 1: line = board[3] + board[4] + board[5]; break;
                case 2: line = board[6] + board[7] + board[8]; break;
                case 3: line = board[0] + board[3] + board[6]; break;
                case 4: line = board[1] + board[4] + board[7]; break;
                case 5: line = board[2] + board[5] + board[8]; break;
                case 6: line = board[0] + board[4] + board[8]; break;
                case 7: line = board[2] + board[4] + board[6]; break;
            }

            if (line.equals("XXX")) { //For X winner
                return "X";
            } else if (line.equals("OOO")) { // For O winner
                return "O";
            }
        }

        if (checkDraw()){
            return "draw";
        }
        System.out.println(turn + "'s turn; enter a slot " +
                "number to place " + turn + " in:");

        return null;
    }

    private boolean checkDraw(){
        return IntStream.range(0, 9).noneMatch(i ->
                Arrays.asList(board).contains(String.valueOf(i + 1)));
    }

    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        board = ticTacToeGame.createBoard();
        turn = "X";

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        ticTacToeGame.printBoard();

        System.out.println("X will play first. Enter a slot number to place X in:");
        String winner = ticTacToeGame.playGame();

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw!\nThanks for playing.");
        }
        else {
            System.out.println("Congratulations! " + winner + "'s have won!");
            System.out.println("Thanks for playing.");
            System.out.println("Don't forget to follow @folksdevtv");
        }
    }
}
