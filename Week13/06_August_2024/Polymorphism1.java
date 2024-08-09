class MathOperations {
    // Method overloading - same method name, different parameters (Compile-time Polymorphism)
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

public class Polymorphism1 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of 2 and 3: " + math.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));
        System.out.println("Sum of 1, 2, and 3: " + math.add(1, 2, 3));
    }
}
