package QUESTIONS;

import java.util.Scanner;

//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings
public class Q13CumulativelengthofGivenArray {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        String[] arr = new String[n];
        int totalLength = 0;

        // Input strings and calculate total length
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            totalLength += arr[i].length();
        }

        System.out.println("Cumulative length of all strings: " + totalLength);

        sc.close();
    }
}
