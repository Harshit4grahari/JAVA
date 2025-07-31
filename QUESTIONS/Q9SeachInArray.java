package QUESTIONS;

import java.util.Scanner;

public class Q9SeachInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array as input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Take array elements as input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take the number to search for
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        // Search for the number
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Number found at index: " + i);
                found = true;
                break; // stop at first occurrence
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        sc.close();
    }
}

