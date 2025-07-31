package BASICS;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World"); // "Hello World"

        // Insert text
        sb.insert(6, "Java "); // "Hello Java World"

        // Replace a portion
        sb.replace(6, 10, "Awesome"); // "Hello Awesome World"

        // Safe delete: delete from index 13 to the end
        if (sb.length() >= 13) {
            sb.delete(13, sb.length()); // "Hello Awesome"
        }

        // Reverse the string
        sb.reverse(); // "emosewA olleH"

        // Print final result
        System.out.println(sb.toString());
    }
}
