package classesCollection.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningListIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Linked List Elements :"+list);

        ListIterator<String> itr = list.listIterator();

        // Forward traversal
        while(itr.hasNext()){
            System.out.println("Next Index : "+itr.nextIndex());
            System.out.println("Element : "+itr.next());
        }

        // Backward traversal
        while (itr.hasPrevious()){
            System.out.println("Previous Index : " + itr.previousIndex());
            System.out.println("Element : " + itr.previous());
        }

        while(itr.hasNext()){
            String s = itr.next();

            if(s.equals("B"))
                itr.remove();

            if(s.equals("C"))
                itr.set("D");

        }

        itr.add("E");
        System.out.println(list);

    }
}
