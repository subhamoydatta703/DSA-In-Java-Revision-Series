package revision.backtracking;

public class NQueens_Revision {

    static boolean isSafe(char board[][], int row, int col) {
        // upward

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;

            }
        }

        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }

    static void solve(char[][] board, int row) {
        if(board.length==row){
            printBoard(board);
            return;
        }

        for(int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                solve(board, row+1);

                board[row][col]='.';
            }

        }
    }

    public static void main(String[] args) {
        int n = 6;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);

    }
}
