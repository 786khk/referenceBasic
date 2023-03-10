package collectionFramework;

import java.io.Serializable;
import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(10);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        ArrayList list2 = new ArrayList<>(list.subList(1, 4));
        print(list, list2);
        //list1 : [5, 4, 3, 2, 1, 0]
        // list2 : [4, 3, 2]

        Collections.sort(list);
        Collections.sort(list2);
        print(list,list2);
        //list1 : [0, 1, 2, 3, 4, 5]    
        // list2 : [2, 3, 4]
        System.out.println("list.containsAll(list2) : "+ list.containsAll(list2)); //TRUE

        list2.add("X");
        list2.add("X");
        list2.add(3, "Y");
        
        print(list,list2);
        //list1 : [0, 1, 2, 3, 4, 5]    
        //list2 : [2, 3, 4, Y, X, X]    

        System.out.println("list.retainAll(list2): "+list.retainAll(list2)); //true
        print(list,list2);
        // list1 : [2, 3, 4]
        // list2 : [2, 3, 4, Y, X, X]

        for(int i=list2.size()-1;i>=0;i--){
            if(list.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list,list2);
        /**
         * list1 : [2, 3, 4]
            list2 : [2, 3, 4, Y, X, X]
         */

    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
