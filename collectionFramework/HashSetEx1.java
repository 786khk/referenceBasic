package collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object obj = new Object();
        
        Set test = new HashSet<String>();
        String[] t = {"d","d","d","b"};
        // test.add("d");
        // test.add("d");
        // test.add("d");
        // test.add("d");
       
        System.out.println(t[0]);
        System.out.println("test.getClass() " + t);

        for(int i =0; i<t.length; i++){
            System.out.println("test[i] = " + t[i]);
            System.out.println("test[i].hahCode() " + System.identityHashCode(t[i]));
            System.out.println("test[i].getClass() " + t[i].getClass());
        }


        Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
        Set set = new HashSet();
        for(int i =0; i< objArr.length;i++){
            set.add(objArr[i]);
        } 
        System.out.println(set);
    }
}
