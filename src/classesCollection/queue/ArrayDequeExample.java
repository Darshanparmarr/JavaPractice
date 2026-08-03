package classesCollection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.add("Amit");
        deque.add("Vijay");
        deque.add("Karan");
        System.out.println(deque);

//        Add element in Front
        deque.addFirst("Rahul");
        System.out.println(deque);

//        Add element in Rear
        deque.addLast("Jai");
        System.out.println(deque);

//        Access First and Last Element
        System.out.println("First Element : "+ deque.getFirst());
        System.out.println("Last Element : "+ deque.getLast());

//        Remove first element
        System.out.println("Removed First : "+deque.removeFirst());

//        Remove last element
        System.out.println("Removed Last : "+deque.removeLast());

//        Display deque after removal
        System.out.println("Deque after removal "+ deque);

    }
}
