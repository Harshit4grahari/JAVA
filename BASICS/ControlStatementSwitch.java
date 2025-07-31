package BASICS;

import java.util.Scanner;

public class ControlStatementSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();  // Corrected: use nextInt() instead of nextLine()

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;  // Added break to prevent fall-through
            default:
                System.out.println("Invalid button");
        }

        sc.close();  // Good practice: close the Scanner
    }
}
