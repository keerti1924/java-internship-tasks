
public class programs{
    public static void main(String[] args) {

        //1. Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.

        int length=5;
        int breadth=7;
        int area=length*breadth;
        int rperimeter=2*(length+breadth);
        System.out.println("\nArea of rectangle = "+ area);
        System.out.println("Perimeter of rectangle = "+ rperimeter);
    
        //2. Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.

        int side1=2;
        int side2=3;
        int side3=5;
        int tperimeter=side1+side2+side3;
        System.out.println("\nPerimeter of triangle = "+ tperimeter);

        //3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.

        System.out.println("\nResult = "+ (((2345+8)/3)%5)*5);

        //4. If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.

        int english = 78;
        int math = 45;
        int computer = 62;
        int total_marks = english+math+computer;
        System.out.println("\nTotal Marks = "+ total_marks +"/300");
        System.out.println("Percentage = "+ (total_marks*100)/300 +"%");

        //5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.

        // i)  first program by using a third variable

        int a=6;
        int b=8;
        System.out.println("\nBefore Swap Using Third variable");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap Using Third variable");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // ii) second program without using any third variable

        int x=9;
        int y=15;
        System.out.println("\nBefore Swap without Using Third variable");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap without Using Third variable");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //6. Write a program to convert Fahrenheit into Celsius.

        int Celsius=82;
        int Fahrenheit=(Celsius*9/5) + 32;
        System.out.println("\nTemperature in Fahrenheit = " + Fahrenheit);

        int f=82;
        int c=(f-32)*5/9;
        System.out.println("Temperature in Celsius = " + c);

        //7. Write a program to calculate the sum of the digits of a 3-digit number.
        
        int sum=0, n=568;
        while(n!=0){
            sum = sum + n % 10;
            n=n/10;
        }
        System.out.println("\nSum of the digits of 568 number = "+ sum);  
    }
}
