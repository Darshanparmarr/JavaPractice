package classesCollection.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class LearningIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            list.add(i);
        }
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            Integer n = itr.next();
            if(n%2==0){
                System.out.println(n);
            }
        }
        System.out.println(list);

    }
}
