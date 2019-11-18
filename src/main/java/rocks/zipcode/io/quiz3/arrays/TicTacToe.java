package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;


/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String [0][0];
    }

    public String[] getRow(Integer value) {
        return board[value];
        }

        public String[] getColumn(Integer value) {
        return new String[] {board[0][value], board[1][value], board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return isArrayHomogenous(row);
        }

        public Boolean isArrayHomogenous(String[] array) {
            boolean homogenous = true;
            for(int i = 1; i < array.length; i++) {
                if(!array[i].equals(array[i-1])) {
                    homogenous = false;
                }
            }
            return homogenous;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return isArrayHomogenous(column);
    }

    public Boolean isDiag1Homogenous(){
        String[] diag1 = {board[0][0], board[1][1], board[2][2]};
        return isArrayHomogenous(diag1);
    }

    public Boolean isDiag2Homogenous(){
        String[] diag2 = {board[2][0], board[1][1], board[0][2]};
        return isArrayHomogenous(diag2);
    }

    public String getWinner() {
        String winner = "no winner";
        for(int i =0; i < board.length; i++) {
            if(isRowHomogenous(i)) {
                 winner = board[i][0];
            }
        }
        for (int i = 0; i <board.length; i++) {
            if(isColumnHomogeneous(i)) {
                winner = board[0][i];
            }
        }
        if(isDiag1Homogenous()) {
            winner = board[0][0];
        }
        if(isDiag2Homogenous()) {
            winner = board[0][2];
        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
