import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        System.out.print("\nEnter Your Roll No. : ");
        Scanner roll = new Scanner(System.in);
        int num = roll.nextInt();
        System.out.println("Your Roll No. is " + num);

        System.out.print("\nEnter Your Name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your name is " + name + ".");

        int a = 234_000_000;
        System.out.println(a);

        System.out.print("\nAdd two float numbers.");
        System.out.print("\nEnter first float number : ");
        Scanner af1 = new Scanner(System.in);
        float f1 = af1.nextFloat();

        System.out.print("Enter second float number : ");
        Scanner af2 = new Scanner(System.in);
        float f2 = af2.nextFloat();

        System.out.println("\nAddition = " + (f1+f2)); 

    }
}
