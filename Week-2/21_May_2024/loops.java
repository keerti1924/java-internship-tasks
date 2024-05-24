public class loops{
    public static void main(String[] args){
        //Loops

        //1. For Loop
        System.out.println("\n1. For Loop");
        for(int i=1; i<=10; i++){
            System.out.println("First Loop = " + i);
            for(int j=10; j<=15; j++){
                System.out.println("Second Loop = " + j);
            }
        }

        //2. While Loop
        System.out.println("\n2. While Loop");
        float a=0;
        while(a<=100){
            System.out.println(a);
            a+=5;
        }

        //3. Do-While Loop
        System.out.println("\n3. Do-While Loop");
        int b=0;
        do{
            System.out.print(" " + b);
            b++;
        }while(b<=15);
    }
}