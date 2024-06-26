public class ArraySum {
    public static void main(String[] args) {
        int[] array = {51, 52, 63, 34, 15};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        System.out.println("Sum of all elements in the array = " + sum);
    }
}
