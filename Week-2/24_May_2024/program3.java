// 3. WAP to Find Factorial of a Number in Java.
import java.util.Scanner;
public class programs{
    public static void main(String[] args) {

    System.out.println("\n3. WAP to Find Factorial of a Number in Java.");
    
    System.out.print("\nEnter a number : ");
    Scanner f= new Scanner(System.in);
    int number=f.nextInt();

    int fact=1;
    for(int i=1; i<=number; i++){
        fact=fact*i;
    }
    System.out.println("\nFactorial of " + number + " = " + fact);

    }
}

