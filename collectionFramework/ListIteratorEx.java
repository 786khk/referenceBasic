package collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        ListIterator iterator = list.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println();
        
    }
}
