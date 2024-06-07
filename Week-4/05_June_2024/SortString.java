import java.util.Arrays;
public class SortString {
    public static void main(String[] args) {

        String[] strings = {"Orange", "Apple", "Banana", "Grapes"};
       
        Arrays.sort(strings);
       
        System.out.print("Sorted Strings : ");
       
        for (String s : strings) {
       
            System.out.print(s + " ");
       
        }
       
        }
}
