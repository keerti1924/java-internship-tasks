class Students{
    static String name;
    int id;
    String email;

    // System.out.println(Students.name);
    public void display(){
        System.out.println(name +" "+ id +" "+ email);
    }
}


public class Classes{
    public static void main(String[] args) {
        Students s1 = new Students(); // Datatype var = new Class
        Students s2 = new Students();
        Students s3 = new Students();
        Students s4 = new Students();
        Students s5 = new Students();

        s1.name="Keerti";
        s1.id=1234;
        s1.email="keerti@gmail.com";

        s2.name="Ajay";
        s2.id=1543;
        s2.email="ajay@gmail.com";

        s3.name="Prinshi";
        s3.id=1546;
        s3.email="prinshi@gmail.com";

        s4.name="Ankit";
        s4.id=1586;
        s4.email="ankit@gmail.com";

        // s1.name="Peter";
        // s1.id=1956;
        // s1.email="peter@gmail.com";

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        // s1.display();

    }
}