package QUESTIONS;

public class Q17ReverseStringRecursion {
    static String reverse(String str) {
        if (str.isEmpty()) { // Base case
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0); // Recursive call
    }

    public static void main(String[] args) {
        String text = "Java";
        System.out.println("Reversed: " + reverse(text));
    }
}
