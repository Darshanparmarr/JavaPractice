package classesCollection.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(null);

        System.out.println("HashSet : "+ set);

//        Add Duplicate Elemet
        set.add(20);
        System.out.println("After adding duplicate 20 : "+ set);

//        Check if an element exists
        System.out.println("Contains 10 ? "+ set.contains(10));
        System.out.println("Contains 50 ? "+ set.contains(50));

//      Remove an Element
        set.remove(null);
        System.out.println("After removing 20 : "+ set);

//        Size of HashSet
        System.out.println("Size : "+set.size());

//        Check if Empty
        System.out.println("Is HashSet empty ? "+set.isEmpty());

//        Add another element
        set.add(40);
        System.out.println("Final HashSet : "+ set);

//        Iterate through HashSet
        System.out.println("Element : ");
        for (Integer num : set){
            System.out.println(num);
        }

    }
}
