package QUESTIONS;

import java.util.Scanner;

public class Q2InputVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for radius
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        // Calculating area and circumference
        double area = Math.PI * radius * radius; // Using Math.PI for more accuracy
        double circumference = 2 * Math.PI * radius;

        // Displaying the result
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        sc.close(); // Corrected the Scanner closing
    }
}
