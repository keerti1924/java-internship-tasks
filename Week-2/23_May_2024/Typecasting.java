import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // float num = input.nextInt(); // Error because float>int
        // int num = input.nextFloat(); // Error because int<float
        // System.out.println(num);

        int num = (int)(776.8907f);
        System.out.println("\nCoverting integer into float : "+ num);


        int a = 257;
        byte by = (byte)(a); //257 % 256 = 1
        System.out.println("\nCoverting integer(257) into byte : "+ by);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int m = (x * y) / z;

        System.out.println("\nAutomatically promoting byte to integer to perform the functions : " + m);


        int number = 'a';
        System.out.println("\nAutomatic type conversion (ASCII value of a) : " + number + "\n");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println("\nResult = " + result);

    }
}


