package classesCollection.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // Add elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet: " + set);

        // Add duplicate element
//        set.add(20);
//        System.out.println("After adding duplicate 20: " + set);

        // Check if an element exists
//        System.out.println("Contains 10? " + set.contains(10));
//        System.out.println("Contains 50? " + set.contains(50));

        // Remove an element
//        set.remove(20);
//        System.out.println("After removing 20: " + set);

        // First and Last elements
//        System.out.println("First element: " + set.first());
//        System.out.println("Last element: " + set.last());

        // Size
//        System.out.println("Size: " + set.size());

        // Check if empty
//        System.out.println("Is TreeSet empty? " + set.isEmpty());

        // Iterate through TreeSet
//        System.out.println("Elements:");
//        for (Integer num : set) {
//            System.out.println(num);
//        }
    }
}
