/*Place 4 queens on a 4x4 chessboard so that no two queens threaten each other. */

package QUESTIONS;

public class Q18NQueens {
    
    static final int N = 4;

    // Print the chessboard
    static void printBoard(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if placing a queen is safe
    static boolean isSafe(int board[][], int row, int col) {
        // Check this column on upper side
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Solve using backtracking
    static boolean solveNQueens(int board[][], int row) {
        if (row == N) {
            printBoard(board); // Found a solution
            return true; // For all solutions, remove this return
        }

        boolean res = false;
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen

                res = solveNQueens(board, row + 1) || res; // Recurse

                board[row][col] = 0; // Backtrack
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int board[][] = new int[N][N];
        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists");
        }
    }
}

/*How Backtracking Works Here
1.Try placing a queen in the first row.
2.Move to the next row, try each column.
3.If placing leads to a conflict → remove the queen (backtrack) and try the next column.
4.Continue until all queens are placed safely.
5.Worst Case: O(N!)
(We try each possibility in the worst case) */

/*What is Backtracking?
Backtracking is a problem-solving technique where we try to build a solution step by step and backtrack (undo the last step) if we realize it doesn’t lead to a valid solution.
It’s often called "trial and error with pruning". */
