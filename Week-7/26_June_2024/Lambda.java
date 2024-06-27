import java.util.ArrayList;
import java.util.List;

public class Lambda{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Keerti");
        names.add("Ajay");
        names.add("Shubham");

        // Using lambda expression to iterate through the list
        names.forEach(name -> System.out.println(name));
    }
}