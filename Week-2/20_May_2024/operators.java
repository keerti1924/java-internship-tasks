//Operators

public class operators{
    public static void main(String[] args){
        int a=189, b=20;
        // 1. Arithmetic Operators(+,-,*,/,%)
        System.out.println("\n 1. Arithmetic Operators \n");
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
        System.out.println("Remainder = " + (a%b));
        

        // 2. Assignment Operators(++,--,+=,-=,*=,/=,%=)
        int y=20;
        int z=y;
        System.out.println("\n 2. Assignment Operators \n");
        System.out.println("Value of y = " + y);
        System.out.println("Value of z = " + z);
        System.out.println("Increment of y = " + (++y));
        System.out.println("Decrement of z = " + (--z));
        System.out.println("Value of y = " + y);
        System.out.println("Value of z = " + z);
        System.out.println("y+=9 : " + (y+=1));
        System.out.println("y-=5 : " + (y-=1));
        System.out.println("y*=5 : " +( y*=5));
        System.out.println("y/=4 : " + (y/=4));
        System.out.println("y%=9 : " + (y%=9));

        // 3. Relational/Comparison Operators(>,<,>=,<=,==,!=, ===)
        System.out.println("\n 3. Relational Operators \n");
        System.out.println("a is greater than b = " + (a>b));
        System.out.println("a is less than b = " + (a<b));
        System.out.println("a is greater and equal to b = " + (a>=b));
        System.out.println("a is less and equal to b = " + (a<=b));
        System.out.println("a is equal to b = " + (a==b));
        System.out.println("a is not equal to b = " + (a!=b));

        // 4. Logical Operators(&&,||,!)
        int marks = 78, age=17;
        String nationality="Indian";
        System.out.println("\n 3. Logical Operators \n");
        System.out.println("\na) AND Operator");

        if(marks>=30 && marks <=100){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        if(age>=18 && nationality=="Indian"){
            System.out.println("You are eligible for vote.");
        }else{
            System.out.println("You are not eligible for vote.");
        }

        System.out.println("\nb) OR Operator");

        if(age>=18 || nationality=="Indian"){
            System.out.println("You can Vote");
        }else{
            System.out.println("You can't Vote");
        }

        System.out.println("\nb) NOT Operator");

        System.out.println(!(marks==age));

        // 5. Bitwise Operators(&,|,^,<<,>>)
        int m=10,n=12;
        System.out.println("\n 5. Bitwise Operators \n");
        System.out.println("a) AND Operator");
        System.out.println("m & n = " + (m & n));
        System.out.println("b) OR Operator");
        System.out.println("m | n = " + (m | n));
        System.out.println("c) XOR Operator");
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("d) Left Shift Operator");
        System.out.println("(2 << 10) = " + (10 << 2));
        System.out.println("e) Right Shift Operator");
        System.out.println("(10 >> 2) = " + (10 >> 2));
        
    }
}
