package classesCollection.list;

import java.util.Vector;

public class VectorLegacyExample {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        // Legacy methods
        v.addElement("Apple");
        v.addElement("Banana");
        v.addElement("Orange");

        System.out.println("Vector: " + v);

        // Insert element
        v.insertElementAt("Mango", 1);
        System.out.println("After insert: " + v);

        // First and last element
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());

        // Get element
        System.out.println("Element at index 2: " + v.elementAt(2));

        // Remove element
        v.removeElement("Banana");
        System.out.println("After removeElement: " + v);

        // Remove by index
        v.removeElementAt(1);
        System.out.println("After removeElementAt: " + v);

        // Capacity and size
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        // Remove all elements
        v.removeAllElements();
        System.out.println("Is Empty? " + v.isEmpty());
    }
}

