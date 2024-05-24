public class Array {
    public static void main(String[] args) {
        
        int[][] a = {{1,2,3}, {4,5,6}};
        System.out.println(a[1][2]);

        
        int[] b = {4, 5, 6, 7, 'n'};
        System.out.println("\nASCII value of the character n = " + b[4]); 

        System.out.println("Length of an Array = " + b.length);

        String[] arr = {"Ajay", "Keerti", "Prinshi", "Rohit"};
        System.out.println("\nPrint all values of array using for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + ". "+ arr[i]);
        }

        System.out.println("2nd element of Array = " + arr[1]);
        System.out.println("Length of Array = " + arr.length);


        // Declare or Initialize of Array
        int[] arr1 = new int[10];
        System.out.println("\nLength of Array = " + arr1.length);
        arr1[0] = 8;
        arr1[2] = 5;
        arr1[5] = 32;
        arr1[7] = 1887;
        arr1[9] = 56;

        System.out.println("Print all values with index no. of array using for loop");
        for (int i = 0; i < arr1.length; i++) {
        System.out.println("Index " + i + ": " + arr1[i]);
        }
    }                
}
