package classesCollection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(null);

        System.out.println("LinkedHashSet : "+ set);

//        Add Duplicate Element
        set.add(20);
        System.out.println("After adding duplicate 20 : "+ set);

//        Check if an element exists
        System.out.println("Contains 10 ? "+ set.contains(10));
        System.out.println("Contains 50 ? "+ set.contains(50));

//      Remove an Element
        set.remove(20);
        System.out.println("After removing 20 : "+ set);

//        Size of LinkedHashSet
        System.out.println("Size : "+set.size());

//        Check if Empty
        System.out.println("Is LinkedHashSet empty ? "+set.isEmpty());

//        Add another element
        set.add(40);
        System.out.println("Final LinkedHashSet : "+ set);

//        Iterate through LinkedHashSet
        System.out.println("Element : ");
        for (Integer num : set){
            System.out.println(num);
        }

    }
}
