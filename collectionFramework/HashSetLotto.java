package collectionFramework;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();
        Comparator
        Comparable
        for(int i=0;set.size()<6;i++){
            int num = (int)(Math.random()*45)+1; // 실행할때마다 다름
            // set.add(num);
            set.add(new Integer(num));
        }

        List list = new LinkedList<>(set);

        Collections.sort(list);
        System.out.println(list);
    }
}
