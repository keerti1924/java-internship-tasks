class Add{
    int a;
    int b;
    public void add(){
        int c = a+b;
        System.out.println("Addition = " + c);
    }
}

class Subtract{
    static int a;
    static int b;
    public static void sub(){
        int c = a-b;
        System.out.println("Subtraction = " + c);
    }
}

public class Methods {
    public static void main(String[] args) throws ClassNotFoundException{

        // Class a1 = Class.forName("Add");
        // System.out.println(a1);

        Add a1 = new Add();
        a1.a =25;
        a1.b =55;
        a1.add();

        Subtract s1 = new Subtract();
        s1.a =85;
        s1.b =55;
        s1.sub();

    }
}
