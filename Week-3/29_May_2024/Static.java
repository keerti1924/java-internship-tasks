import java.io.*; 

public class Static{
    static int num = 59;
    static String str = "Static Keyword";

    //Static Method
    static void display(){
        System.out.println("Static Number = " + num);
        System.out.println("Static String = " + str);
    }

    //Non-Static Method
    void nonstatic(){
        display();
    }

    //Main Method
    public static void main(String[] args) {
        Static sc = new Static();

        // Call Non-static Method
        System.out.println("\n1. Non-Static Method");
        sc.nonstatic();

        // Call Static Method
        System.out.println("\n2. Static Method");
        display();
    }

}
