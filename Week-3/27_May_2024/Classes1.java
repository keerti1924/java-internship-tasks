class math{
    public int add(int a, int b) {
        return a+b;
    }
    public int mul(int a, int b) {
        return a*b;
    }
}
public class Classes1{
    public static void main(String[] args) {
        math a1=new math();

        int z=a1.add(10,20);
        System.out.println("Addition = " + z);

        int c=a1.mul(40,65);
        System.out.println("Multiply = " + c);
    }
}

// methods ,classes (Continue)
// void , static