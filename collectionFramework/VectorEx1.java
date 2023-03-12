package collectionFramework;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5); //1. capcity가 5인 인스턴스를 생성한다.
        v.add("1");
        v.add("2");
        v.add("3"); // 객체 저장
        print(v);
        /**
            Vector : [1, 2, 3]
            Vector.size : 3
            Vector.capacity : 5
         */

        v.trimToSize();//빈공간 없애기
        System.out.println("+++++ After trimToSize()+++++ ");
        print(v);
        /*
            Vector : [1, 2, 3]
            Vector.size : 3
            Vector.capacity : 3
         */

        v.ensureCapacity(6);
        
        // v.add("1");
        // v.add("2");
        // v.add("3");
        // v.add("1");
        // v.add("2");
        // v.add("3");v.add("1");
        // v.add("2");
        // v.add("3"); // 지정한 크기를 넘어도 아무일 없음
        /** 주석을 풀고 추가됐을 때 
         +++++ After ensureCapacity()+++++
            Vector : [1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3]
            Vector.size : 12
            Vector.capacity : 12
          
         */
        System.out.println("+++++ After ensureCapacity(6)+++++ ");
        print(v);
        /**
           +++++ After ensureCapacity()+++++
            Vector : [1, 2, 3]
            Vector.size : 3
            Vector.capacity : 6
         */

        // v.setSize(7);
        // v.add("1");
        // v.add("2");
        // v.add("3");
        // v.add("1");
        // v.add("2");
        // v.add("3");v.add("1");
        // v.add("2");
        // v.add("3");
        /**
         Vector : [1, 2, 3, null, null, null, null, 1, 2, 3, 1, 2, 3, 1, 2, 3]
        Vector.size : 16
        Vector.capacity : 24
         */
        System.out.println("+++++ After setSize(7)+++++ ");
        print(v);
        /**
         Vector : [1, 2, 3, null, null, null, null]
        Vector.size : 7
        Vector.capacity : 12

         */
        
        v.clear();
        System.out.println("+++++ After clear()+++++");
        print(v);

    }

    static void print(Vector v){
        System.out.println("Vector : " + v);
        System.out.println("Vector.hashCode() : " + v.hashCode() );
        System.out.println("Vector.size : " + v.size());
        System.out.println("Vector.capacity : " + v.capacity());

    }
}
