package classesCollection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueMethodsExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
//        Queue<String> queue = new LinkedBlockingQueue<>();

        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println(queue);

        queue.offer("Rohan");
        System.out.println(queue);

//        Access Method
        System.out.println("Head using element() : "+queue.element());
        System.out.println("Head using peel() : "+queue.peek());

//        Traversing Method
        System.out.println("\n Queue Element : ");
        Iterator<String> itr = queue.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        Removal Methods
        System.out.println("\nRemoved using remove() : "+queue.remove());
        System.out.println("\nRemoved using poll() : "+queue.poll());

        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

//        Utility Methods
        System.out.println("\nContains 'Jai' ? "+queue.contains("Jai"));
        System.out.println("Queue size : "+ queue.size());
        System.out.println("Is queue empty ? " + queue.isEmpty());

        queue.clear();

        System.out.println("After clear(), is queue empty ? "+queue.isEmpty());

    }

}
