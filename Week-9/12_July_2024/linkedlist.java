import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

public class linkedlist {
    public static void main(String[] args) {

        //inititate linkedlist
        LinkedList<String> linkedlist1 = new LinkedList<>();

        System.out.println("\nBefore adding nodes in Linked List = " + linkedlist1);

        //nodes
        linkedlist1.add("Rose");
        linkedlist1.add("Lotus");
        linkedlist1.add("Sunflower");
        linkedlist1.add("Marigold");
        linkedlist1.add("Jasmine");

        System.out.println("\nAfter adding node in Linked List = " + linkedlist1);


        System.out.println("\n--------Using Iterator--------");

        Iterator<String> iterator1 = (Iterator<String>) linkedlist1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next() + " ");
        }


        System.out.println("\n--------Using List Iterator--------");
        
        ListIterator<String> iterator2 = (ListIterator<String>) linkedlist1.listIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next() + " ");
        }


        System.out.println("\n--------In Reverse Order--------");
    
        while(iterator2.hasPrevious()){
            System.out.println(iterator2.previous() + " ");
        }

        //add first element
        System.out.println("\n----Add first element----");
        linkedlist1.addFirst("Poppy");
        System.out.println("Poppy add in the first element = " + linkedlist1);

        //add last element
        System.out.println("\n----Add last element----");
        linkedlist1.addLast("Hibiscus");
        System.out.println("Hibiscus add in the last element = " + linkedlist1);

        //sorting
        System.out.println("\n----Sorting elements in ascending order----");
        Collections.sort(linkedlist1);
        System.out.println(linkedlist1);


        //Comparator
        System.out.println("\n----Sorting elements in descending order----");
        Collections.sort(linkedlist1, new Comparator<String>() {
            @Override
            public int compare(String n1, String n2){
                return n2.compareTo(n1);
            }
        });
        System.out.println(linkedlist1);


        //Duplicate element
        System.out.println("\n----Add Duplicate Elements----");
        linkedlist1.add("Marigold");
        linkedlist1.add("Jasmine");
        System.out.println(linkedlist1);


        //Remove last element
        System.out.println("\n----Remove Last Elements----");
        linkedlist1.removeLast();
        System.out.println(linkedlist1);

        //Remove elements
        System.out.println("\n----Remove Single(Duplicate)Elements----");
        linkedlist1.removeAll(Collections.singleton("Marigold"));
        System.out.println(linkedlist1);

        //Remove first element
        System.out.println("\n----Remove First Elements----");
        linkedlist1.remove();
        System.out.println(linkedlist1);

        //Clear linked list
        System.out.println("\n----Clear linked list----");
        linkedlist1.clear();
        System.out.println(linkedlist1);

    }
}
