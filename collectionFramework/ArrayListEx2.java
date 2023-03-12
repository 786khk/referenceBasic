package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int limit = 10;
        String source = "0123456789abcdefghijklmnopqrstuvwxyz!@#$%()";
        int length = source.length();

        List list = new ArrayList<>(length/limit +10);// 살짝 여유있게 크기지정

        for(int i=0; i<length; i+=limit){
            if(i+limit <length){
                list.add(source.substring(i, i+limit));
            }else{
                list.add(source.substring(i));
            }
        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        /**
            0123456789
            abcdefghij
            klmnopqrst
            uvwxyz!@#$
            %()
        */
    }
}
