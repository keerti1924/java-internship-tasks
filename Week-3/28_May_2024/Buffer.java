public class Buffer {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("INDIA");
        StringBuffer b = new StringBuffer("Keerti");
        System.out.println("Capacity = " + a.capacity());
        System.out.println("\n Append Method");
        a.append(" is my country.");
        System.out.println(a);
        a.append(" I live in India.");
        System.out.println(a);

        a.deleteCharAt(3);
        System.out.println("\nRemove 3rd index = "+a);
        b.append(" Vishwkarma");
        System.out.println(b);
    }
}
