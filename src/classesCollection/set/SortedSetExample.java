package classesCollection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        // Add elements
        set.add(0);
        set.add(50);
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);

        System.out.println("SortedSet: " + set);

        // Add duplicate element
        set.add(20);
        System.out.println("After adding duplicate 20: " + set);

        // Check if an element exists
        System.out.println("Contains 10? " + set.contains(10));
        System.out.println("Contains 50? " + set.contains(50));

        // Remove an element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // First and Last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // HeadSet (elements less than 30)
        System.out.println("HeadSet (<30): " + set.headSet(30));

        // TailSet (elements greater than or equal to 30)
        System.out.println("TailSet (>=30): " + set.tailSet(30));

        // Size
        System.out.println("Size: " + set.size());

        // Check if empty
        System.out.println("Is SortedSet empty? " + set.isEmpty());

        // Iterate through SortedSet
        System.out.println("Elements:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}

