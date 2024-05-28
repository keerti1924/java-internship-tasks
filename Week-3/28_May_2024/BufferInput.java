import java.io.*;
public class BufferInput {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your Name : ");
        
        String name = a.readLine();
        System.out.println("Your Name : " + name);
       
        System.out.print("\nEnter Your Age : ");
        int age = Integer.parseInt(a.readLine());
        System.out.println("Age multipied by 2 : " + (2*age));
    }
}
