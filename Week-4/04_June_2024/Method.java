
class Students {
    static String name;
    public static void show(Students Students){ 
        System.out.println("Hii, " + Students.name);
    }
}

public class Method {
    public static void main(String[] args) {
        System.out.println("Static Method");
        Students s1 = new Students();
        s1.name="Keerti";
        s1.show(s1);
        Students s2 = new Students();
        s2.name="Ajay";
        s2.show(s2);
    }
}
