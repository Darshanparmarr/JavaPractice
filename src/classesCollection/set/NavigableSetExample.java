package classesCollection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>();

        // Add elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(50);

        System.out.println("NavigableSet: " + set);

        // Contains
        System.out.println("Contains 20? " + set.contains(20));

        // Navigation methods
        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Lower than 30: " + set.lower(30));
        System.out.println("Floor of 30: " + set.floor(25));
        System.out.println("Ceiling of 25: " + set.ceiling(25));

        // First and Last
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Descending order
        System.out.println("Descending Set: " + set.descendingSet());

        // Remove first and last elements
        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());

        System.out.println("Set after polling: " + set);

        // Iterate
        System.out.println("Elements:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}

