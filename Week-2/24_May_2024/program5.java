// 5. WAP to Calculate Simple Interest in Java.
import java.util.Scanner;
public class programs{
    public static void main(String[] args) {

    System.out.println("\n5. WAP to Calculate Simple Interest in Java.");

    Scanner scan= new Scanner(System.in);

    System.out.print("Enter the Principal Value : $");
    int principal=scan.nextInt();

    System.out.print("Enter the rate of interest : ");
    int rate=scan.nextInt();

    System.out.print("Enter the value of time (in years) : ");
    int time=scan.nextInt();

    int si=(principal*rate*time)/100;
    System.out.println("\nSimple Interest = $" + si + "\n");

    }
}


