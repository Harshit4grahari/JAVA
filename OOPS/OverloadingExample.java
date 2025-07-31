package OOPS;

class Calculator {
    // Overloaded methods (same name, different parameters)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));          // 8
        System.out.println(calc.add(5.5, 3.2));       // 8.7
        System.out.println(calc.add(1, 2, 3));        // 6
    }
}

