import java.util.Scanner;
public class Power {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter base: ");
       
        int base = input.nextInt();
       
        System.out.print("Enter exponent: ");
       
        int exponent = input.nextInt();
       
        long result = 1;
       
        while (exponent != 0) {
       
        result *= base;
       
        --exponent;
       
        }
       
        System.out.println("Result: " + result);
       
        input.close();
       
    }
    
}
