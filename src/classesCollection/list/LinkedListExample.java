package classesCollection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

//        Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");

//        Print the list
        System.out.println("Fruits : " + fruits);

//        Access an element
        System.out.println("Fruits fruit : " + fruits.get(0));

//        Update an Element
        fruits.set(1, "Mango");
        System.out.println("Updated List : "+ fruits);

//        Remove an Element
        fruits.remove("Orange");
        System.out.println("Remove : "+ fruits);

//        Check if an element exists
        System.out.println("Contains Apple ? "+fruits.contains("Apple"));

//        Get the size
        System.out.println("Size : "+fruits.size());

//        Loop through the list
        System.out.println("All fruits : ");
        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
