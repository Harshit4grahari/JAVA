package QUESTIONS;

import java.util.Scanner;

public class Q5PrintSumofFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Corrected input line

        int sum = 0;
        for (int i = 1; i <= n; i++) { // Start from 1 to n
            sum = sum + i; // Add i instead of 1
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
