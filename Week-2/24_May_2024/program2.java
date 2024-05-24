// 2. WAP to convert Integer numbers and Binary numbers in java.
import java.util.Scanner;
public class programs{
    public static void main(String[] args) {

        System.out.println("\n2. WAP to convert Integer numbers and Binary numbers in java.");

        System.out.print("\nEnter the number to convert it into Binary : ");
        
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("Binary Value of "+ num + " = " + Integer.toBinaryString(num));

    }
}
 

 


