// 1. WAP to Swap Two Numbers in java. 
import java.util.Scanner;
public class programs{
    public static void main(String[] args) {

    System.out.println("\n1. WAP to Swap Two Numbers in java.");
    Scanner swap= new Scanner(System.in);

    System.out.print("\nEnter value of a :");
    int a=swap.nextInt();

    System.out.print("Enter value of b :");
    int b=swap.nextInt();
    int c;
    
    System.out.println("\nBefore swap value of a = " + a);
    System.out.println("Before swap value of b = " + b);
    c=a;
    a=b;
    b=c;
    System.out.println("\nAfter swap value of a = " + a);
    System.out.println("After swap value of b = " + b);
    
    }
}

