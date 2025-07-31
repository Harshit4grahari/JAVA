package QUESTIONS;

import java.util.Scanner;
//using if else 

public class Q4GreetingButtonOption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Fixed typo: System.in
        int button = sc.nextInt(); // Correct variable name

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }
    }
}
//Using 