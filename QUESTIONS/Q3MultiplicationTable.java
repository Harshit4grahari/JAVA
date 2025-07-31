package QUESTIONS;

import java.util.Scanner;

public class Q3MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Printing the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}
