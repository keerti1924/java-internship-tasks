// 4. Create a class name Calculator which will add, subtract, multiply and divide.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
    
        System.out.println("\nAddition = " + (a+b));

        System.out.println("Subtraction = " + (a- b));

        System.out.println("Multiplication = " + (a*b));
    
        if(b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        }else{
            System.out.println("Division = " + (a/b));
        }
       
    }
}
