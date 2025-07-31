package BASICS;
import java.util.Scanner;

public class ControlStatementIf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = sc.nextLine();  // Correctly read full name

            System.out.println("Write your age:");
            int age = sc.nextInt();  // Read age
            //nextInt() for integer input
            //nestFloat() for float input

            if (age >= 18) {
                System.out.println("Major");
                System.out.println("Name: " + name);
            } else {
                System.out.println("Minor");
            }
        }
    }
}
