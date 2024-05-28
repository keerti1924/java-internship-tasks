import java.util.Scanner;
public class UserInput{
    public static void main(String[] args) {

        // 1. Integer Datatype
        System.out.print("\n1. Integer Datatype");
        Scanner a = new Scanner(System.in);
        System.out.print("\nEnter your age : ");
        int age = a.nextInt();
        System.out.println("Your age = " + age);

        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }

        System.out.print("\nEnter a Number for print a table : ");
        int number = a.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(number + " X " + i + " = " + (number*i));
        }

        // 2. String Datatype
        System.out.print("\n2. String Datatype");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your username : ");
        String name = sc.nextLine();

        System.out.print("Enter your password : ");
        String pass = sc.nextLine();

        // OR(||) Operator
        // if(name.equals("Keerti") || name.equals("")){
        //     if(pass.equals("admin")){
        //         System.out.println("\nAuthorized User.");
        //     }
        // }else{
        //     System.out.println("\nYou are not authorized user.");
        // }

        // AND(&&) Operator
        if(name.equals("Keerti") && pass.equals("admin")){ 
            System.out.println("\nAuthorized User.");
        }else{
            System.out.println("\nYou are not authorized user.");
        }

        // 3. Boolean Datatype
        System.out.print("\n3. Boolean Datatype");
        Scanner b = new Scanner(System.in);
        System.out.println("\nDo you have a laptop?");
        boolean laptop = b.nextBoolean();
        if(laptop){ 
            System.out.println("\nYou have a laptop");
        }else{
            System.out.println("\nYou don't have a laptop");
        }

        // 4. Byte Datatype
        System.out.print("\n4. Byte Datatype");
        Scanner by = new Scanner(System.in);
        System.out.print("\nEnter your age : ");
        byte ag = by.nextByte();
        System.out.println("\nYour age = " + ag);


        // 5. Long Datatype
        System.out.print("\n5. Long Datatype");
        Scanner l = new Scanner(System.in);
        System.out.print("\nEnter your Phone Number : ");
        long phone = l.nextLong();
        System.out.println("Your Phone No. = " + phone);


        // 6. Float Datatype
        System.out.print("\n6. Float Datatype");
        Scanner f = new Scanner(System.in);
        System.out.print("\nEnter your Height : ");
        float height = f.nextFloat();
        System.out.println("Your Height = " + height);

        // 6. Short Datatype
        System.out.print("\n6. Short Datatype");
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter any number : ");
        Short num = s.nextShort();
        System.out.println("Your Number = " + num);

    }
}