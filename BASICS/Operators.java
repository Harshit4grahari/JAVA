package BASICS;

public class Operators {
    public static void main(String[] args) {
        int a = 18;
        int b;

        // Unary Operators
        System.out.println("Unary Operators:");
        b = a++;  // b = 18, a = 19
        System.out.println("After b = a++");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = ++a;  // a = 20, b = 20
        System.out.println("After b = ++a");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        if (a > 15 && b > 15) {
            System.out.println("Both conditions are true using AND (&&)");
        }

        if (a > 25 || b > 15) {
            System.out.println("At least one condition is true using OR (||)");
        }

        boolean isJavaFun = true;
        if (!isJavaFun == false) {
            System.out.println("NOT (!) operator used: Java is fun!");
        }

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

        int andResult = a & b;
        System.out.println("a & b = " + andResult + " (" + Integer.toBinaryString(andResult) + ")");

        int orResult = a | b;
        System.out.println("a | b = " + orResult + " (" + Integer.toBinaryString(orResult) + ")");

        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult + " (" + Integer.toBinaryString(xorResult) + ")");

        int notResult = ~a;
        System.out.println("~a = " + notResult + " (" + Integer.toBinaryString(notResult) + ")");

        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + " (" + Integer.toBinaryString(leftShift) + ")");

        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " (" + Integer.toBinaryString(rightShift) + ")");

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = 10;
        System.out.println("Initial x = " + x);

        x += 5;
        System.out.println("x += 5 = " + x);

        x -= 2;
        System.out.println("x -= 2 = " + x);

        x *= 3;
        System.out.println("x *= 3 = " + x);

        x /= 4;
        System.out.println("x /= 4 = " + x);

        x %= 3;
        System.out.println("x %= 3 = " + x);

        x &= 2;
        System.out.println("x &= 2 = " + x);

        x |= 4;
        System.out.println("x |= 4 = " + x);

        x ^= 1;
        System.out.println("x ^= 1 = " + x);

        x <<= 1;
        System.out.println("x <<= 1 = " + x);

        x >>= 2;
        System.out.println("x >>= 2 = " + x);
    }
}
