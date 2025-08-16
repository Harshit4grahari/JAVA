/*What is Sudoku?
Sudoku is a 9×9 grid puzzle divided into 9 subgrids (3×3 each).
Rules:
>Each row must contain numbers 1–9 without repetition.

>Each column must contain numbers 1–9 without repetition.

>Each 3×3 subgrid must contain numbers 1–9 without repetition. */

package PROJECTS;

public class SudokuSolver {

    // Function to print the Sudoku board
    static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((r + 1) % 3 == 0) {
                System.out.print("");
            }
        }
    }

    // Function to check if placing a number is valid
    static boolean isValid(int[][] board, int row, int col, int num) {
        // Row check
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Column check
        for (int x = 0; x < 9; x++) {
            if (board[x][col] == num) {
                return false;
            }
        }

        // 3×3 subgrid check
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    // Main backtracking function
    static boolean solveSudoku(int[][] board, int n) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // No empty space left → puzzle solved
        if (isEmpty) {
            return true;
        }

        // Try numbers 1–9
        for (int num = 1; num <= n; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num; // Place number

                if (solveSudoku(board, n)) {
                    return true; // Continue solving
                } else {
                    board[row][col] = 0; // Backtrack
                }
            }
        }
        return false; // No valid number found
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int N = board.length;

        if (solveSudoku(board, N)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}

/*How it Works
1.Find the first empty cell (marked as 0 in our board).
2.Try placing numbers 1–9.
3.For each number:
>Check if it’s valid in the current row, column, and 3×3 subgrid.
>If valid, place it and move to the next empty cell.
4.If no number works, backtrack. */

/*Time Complexity
1.Worst case: 
𝑂(9^m) where m = number of empty cells.
2.Sudoku boards usually have 20–30 empty cells, so backtracking works efficiently in practice. */