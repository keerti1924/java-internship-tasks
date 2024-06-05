class student{
    static String name;
    static int age;
    public void show(){
        System.out.println("Hello "+ name + "! Your age is " +age);
    }
}

public class Static{
    public static void main(String[] args) {
        int age = 24;
        String name = "Keerti";
        student a1 = new student();
        a1.name="Ajay";
        student a2 = new student();
        a2.name="Keerti";
        a1.show();
    }
}