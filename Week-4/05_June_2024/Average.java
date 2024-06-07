
public class Average {
    public static void main(String[] args) {


        int[] array = {65, 50, 85, 80, 45};
       
        int sum = 0;
       
        for (int num : array) {
       
        sum += num;
       
        }
       
        double average = (double) sum / array.length;
       
        System.out.println("Average of numbers in the array = " + average);
       
        }
}
