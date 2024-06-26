public class LargestSmallest {
    public static void main(String[] args) {
        int[] numbers = {63, 55, 27, 82, 38, -15, 24, 10, 12};
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
    }
}
