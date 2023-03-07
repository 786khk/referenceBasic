package collectionFramework;

import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

        Collections.sort(list);
        Collections.sort(list2);
        print(list,list2);
        System.out.println("list.containsAll(list2) : "+ list.containsAll(list2));

        list2.add("X");
        list2.add("X");
        list2.add(3, "Y");
        
        print(list,list2);

        System.out.println("list.retainAll(list2): "+list.retainAll(list2));
        print(list,list2);

        for(int i=0;i>list2.size();i++){
            if(list.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list,list2);

    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
