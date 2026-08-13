package JAVA_DSA.recursion.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 1;
        boolean[][] board = new boolean[n][n];
        nQueensConquest(board, 0);
    }

    public static void nQueensConquest(boolean[][] board, int r){
        if (r == board.length) {
            display(board);
            System.out.println();
        }

        for (int i = 0; i < board.length; i++) {
            if (canQueenReign(board, r, i)) {
                board[r][i] = true;
                nQueensConquest(board, r + 1);
                board[r][i] = false;
            }
        }
    }

    static void display(boolean[][] board){
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (!element) {
                    System.out.print(" X ");
                }
                else {
                    System.out.print(" Q ");
                }
            }
            System.out.println();
        }
    }

    static boolean canQueenReign(boolean[][] board , int r , int c) {
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++){
            if (board[r-i][c-i]) {
                return false;
            }
        }
        int maxRight = Math.min(r, board.length - c - 1);
        for (int i = 1; i <= maxRight; i++){
            if (board[r-i][c+i]) {
                return false;
            }
        }
        return true;
    }
}
