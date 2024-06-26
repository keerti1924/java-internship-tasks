public class Average {
    public static void main(String[] args) {
        int[] array = {51, 62, 83, 34, 25};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;
        System.out.println("Average of array elements: " + average);
    }
}
