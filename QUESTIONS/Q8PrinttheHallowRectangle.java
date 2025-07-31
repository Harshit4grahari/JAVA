package QUESTIONS;

public class Q8PrinttheHallowRectangle {

    public static void main(String[] args) {
        int n = 4; // number of rows
        int m = 5; // number of columns

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= m; j++) {
                // Print '*' for border cells, otherwise space
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
