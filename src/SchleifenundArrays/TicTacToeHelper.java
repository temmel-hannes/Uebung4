package SchleifenundArrays;

import org.jetbrains.annotations.NotNull;

public class TicTacToeHelper {
    public static void main(String[] args) {

        char [][] board = generateEmptyBoard(3);

        board[0][0]='X';
        board[0][1]='X';
        board[0][2]='O';
        board[1][0]='X';
        board[1][2]='O';
        board[2][0]='O';
        board[2][2]='X';

        printBoard(board);

        System.out.println(validateBoard(board,3));
    }

    public static char[][] generateEmptyBoard(int size){
        char[][] board = new char[size][size];

        for (int i = 0; size>i;i++){
            for (int j = 0; size>j;j++){
                board[i][j] = ' ';
            }
        }
        return board;
    }
    public static boolean validateBoard(char[][] board, int size){
        if (size == board.length){
            if (size == board[0].length){
                return true;
            }
            else return false;
        }
        else return false;
    }

    public static void printBoard(char[] @NotNull [] board) {

        for (int i = 0; i<board.length;i++) {

            for (int j = 0; j<board[i].length;j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }
}
