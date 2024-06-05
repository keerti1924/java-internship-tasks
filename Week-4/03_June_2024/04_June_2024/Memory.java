class student{
    int age = 24;
    String name = "Keerti";
    public void display(){
        System.out.println("Hello "+ name +", Your age is "+ age);
    }
}

class stu{
    int age = 24;
    String name = "Keerti";
    public void display(){
        System.out.println("Hello "+ name +", Your age is "+ age);
    }
}

public class Memory{
    public static void main(String[] args) {
        int age = 24;
        String name = "Keerti";
        System.out.println("Hello "+ name +", Your age is "+ age);
        student a = new student();
        a.display();
    }
}