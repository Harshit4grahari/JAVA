package DSA;

public class Array {
    public static void main(String[] args) {
        // First method: Using 'new' keyword to declare and initialize
        int[] marks = new int[3];
        marks[0] = 96; // Physics
        marks[1] = 97; // Chemistry
        marks[2] = 98; // Maths

        // Printing using direct index access
        System.out.println("Using first method:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Second method: Declaring and initializing at the same time
        int[] marksAlt = {96, 97, 98};

        // Printing using a loop
        System.out.println("Using second method (loop):");
        for (int i = 0; i < marksAlt.length; i++) {
            System.out.println(marksAlt[i]);
        }
    }
}
