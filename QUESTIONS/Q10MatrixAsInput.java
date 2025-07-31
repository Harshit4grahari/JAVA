package QUESTIONS;
//Take a matrix as input from user.Search for a given number x and print the indices at which it occurs

import java.util.Scanner;

public class Q10MatrixAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers = new int[rows][col];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt(); // ✅ semicolon added
            }
        }

        int x = sc.nextInt();
        for (int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                //compare with x
                if(numbers[i][j] == x){
                    System.out.println("x found at location (" + i + " , " + j + ") ");
                }
            }
        }
    }
}

