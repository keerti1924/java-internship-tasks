import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number :: ");
        int n2 = input.nextInt();
        System.out.print("Enter third number :: ");
        int n3 = input.nextInt();

        int sum = n1 + n2 + n3;

        // Correcting the print statement
        System.out.println("Addition of three numbers " + n1 + ", " + n2 + " and " + n3 + " = " + sum);
    }
}
