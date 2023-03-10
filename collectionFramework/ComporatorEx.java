package collectionFramework;

import java.util.Arrays;
import java.util.Comparator;

public class ComporatorEx {
    public static void main(String[] args) {
        
        String[] sArr = {"cat", "Dog", "lion","tiger"};
        // String[] sArr = {"Cat", "dog", "lion","Tiger"};
    
        Arrays.sort(sArr);
        System.out.println("sArr" + Arrays.toString(sArr));

        System.out.println("======After String.CASE_INSENSITIVE_ORDER========");
        Arrays.sort(sArr,String.CASE_INSENSITIVE_ORDER);
        System.out.println("sArr" + Arrays.toString(sArr));

        Arrays.sort(sArr, new Descending());
        System.out.println("=====new Descending() ====");
        System.out.println("sArr" + Arrays.toString(sArr));
    
    
    }
    
}

class Descending implements Comparator{
    public int compare(Object o1, Object o2){
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) *-1;
        }
        
        return -1;
    }
}
