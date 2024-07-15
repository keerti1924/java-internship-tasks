import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class stackc {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("\nBefore adding elements = " + st);

        //Add Elements
        st.push("Mango");
        st.push(568);
        st.push(-89.5);
        st.push("Keerti");
        st.push(true);
        st.push(2024);


        System.out.println("\nAfter adding elements = " + st);

        System.out.println("\n------ Using Iterator ------");
        Iterator iterator = st.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n--------Using List Iterator--------");
        
        ListIterator iterator2 = (ListIterator) st.listIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next() + " ");
        }

        System.out.println("\n------ Elements Removing ------");
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
