import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        System.out.println("Empty Array List" + arr1);

        arr1.add(10);
        arr1.add(30);
        arr1.add(20);
        arr1.add(50);

        System.out.println("Traverse of Array List" + arr1);

        for(int i=0; i<= arr1.size()-1; i++){
            System.out.println("\nIndex " + i + " Value = " +arr1.get(i));
        }


        System.out.println("\n--------Using Iterator--------");

        Iterator<Integer> itr = arr1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }


        System.out.println("\n--------Using List Iterator--------");
        
        ListIterator<Integer> litr = arr1.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next() + " ");
        }


        System.out.println("\n--------In Reverse Order--------");
    
        while(litr.hasPrevious()){
            System.out.println(litr.previous() + " ");
        }
        
        @SuppressWarnings("unchecked")
        ArrayList<Integer> clone1 = (ArrayList<Integer>) arr1.clone();
        System.out.println("Original Array List = " + arr1);  
        System.out.println("Cloned Array List = " + clone1);  

    }
    
}