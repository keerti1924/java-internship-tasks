class fruits{

    String name="Keerti";
    private int age =24;
    private int salary =10000;


    public void mango(){
        System.out.println(age);
        System.out.println(salary);
    }
    public void apple(){
        System.out.println("Apple Class");
    }
}

public class inter {

    public static void main(String[] args) {
        fruits a = new fruits();
        System.out.println(a.name);
    }
}