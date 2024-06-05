class Get{
    String name;
    private int age;
    private String city;

    public String getName(){
        return name;
    }
}

public class Getter {
    public static void main(String[] args) {
        Get g1 = new Get();
        // g1.getName("Keerti");
        System.out.println(g1.getName());
        // g1.getName();
    }
}
