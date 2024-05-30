import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Exception{
    public static void main(String[] args) {
        
        //1.Compile Time Error

        //i) Syntax Error
        print("Hello");

        //ii) Missing Semilcolon
        System.out.println("Hello")

        //iii) Pre-defined variables
        int a= 5;
        int a= 30;

        //2.Runtime Error

        //i) Arithmetic Exception
        int a= 10;
        int b= 0;
        int c= a/b;
        System.out.println(c);

        //ii) NullPointer Exception
        String a = null;
        System.out.println(a.length());

        //iii) ArrayIndexOutOfBoundsException
        int[] a={5,7,3,5};
        System.out.println(a[6]);

        //iv) ArrayStore Exception
        Number[] bigint = new BigInteger[5];
        bigint[0] = Double.valueOf(75842.6545);

        //v) Unsupported Operation
        Integer[] m={4,5,6,7,8};
        List<Integer> l = Arrays.asList(m);
        l.add(new Integer(0));

    }
}

// 1. Compile Time Error
// a) Missing Semicolon
// b) Mismatch braces
// c) File name mismatch
// d) Syntax Error
// e) Case Mismatch
// f) Pre-defined Variables
// g) Type Mismatch

// 2. Runtime Error 
// a) Arithmetic Exception
// b) NullPointer Exception
// c) Date Exception
// d) ArrayIndexOutOfBoundsException
// e) ArrayStore Exception
// f) Unsupported Operation
// g) SQL
// h) Tomcat
// i) File Handling 
// j) Async Buffer
// k) Logical Error

