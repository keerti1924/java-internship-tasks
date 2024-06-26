@FunctionalInterface  // Single method exists

interface A{
    int calc(int a, int b);
}

public class interface2 {
    public static void main(String[] args) {
        A add = (int a, int b) -> a+b;
        A sub = (int a, int b) -> a-b;

        // {
        //     public int add(int a, int b){
        //         return a+b;
        //     }
        // };

        int res = add.calc(12,34);
        System.out.println("Addition = " +res);
        int res1 = sub.calc(42,34);
        System.out.println("Subtract = " +res1);
    }
}
