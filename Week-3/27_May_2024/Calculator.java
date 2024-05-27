import java.util.Scanner;
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nAddition = " + add(num1, num2));
        System.out.println("Subtraction = " + subtract(num1, num2));
        System.out.println("Multiplication = " + multiply(num1, num2));
        System.out.println("Division = " + divide(num1, num2));
    }
}
