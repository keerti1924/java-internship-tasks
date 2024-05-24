public class conditions{
    public static void main(String[] args) {
        // Conditions
        int age=21, marks=75;

        // if else Statement
        System.out.println("\n1. if else Statement");

        if(age>=18){
            System.out.println("You are eligible for vote.");
        }else{
            System.out.println("You are not eligible for vote.");
        }


        if(marks>=75 && marks<=100)
        {
            System.out.println("Distinction");
        }
        else if(marks>=60 && marks<75)
        {
            System.out.println("First Division");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.println("Second Division");
        }
        else if(marks>=40 && marks<50)
        {
            System.out.println("Pass");
        }
        else if(marks>=0 && marks<40)
        {
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Marks");
        }

        // Ternary Operator
        System.out.println("\n2. Ternary Operator");
        System.out.println((marks>=40)?"Passed":"Failed");

        // switch Statement
        System.out.println("\n3. switch Statement");

        int day = 8;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid Day");
        }

    }
}
