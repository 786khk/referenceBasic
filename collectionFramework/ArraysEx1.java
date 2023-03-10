package collectionFramework;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2 = {{11,12,23},{21,22,23}};

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2 = " + Arrays.deepToString(arr2));
    
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr,3);
        int[] arr5 = Arrays.copyOf(arr,7);
        int[] arr6 = Arrays.copyOfRange(arr,2,4);
        int[] arr7 = Arrays.copyOfRange(arr,0,7);


        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));
        System.out.println("arr7 = " + Arrays.toString(arr7));

        int[] arr8 = new int[5];
        Arrays.fill(arr8,9);
        System.out.println("arr8 = " + Arrays.toString(arr8));
        Arrays.setAll(arr8, i-> (int)( Math.random()*6)+1);

        /*
         * public static void setAll(int[] array, IntUnaryOperator generator) {
            Objects.requireNonNull(generator);
            for (int i = 0; i < array.length; i++)
                array[i] = generator.applyAsInt(i);
            }
         * 
         * IntUnaryOperator : 인덱스로 원하는 값을 생성하는 함수, 파라미터로 받는 타입도 함수로 받음
         */
        System.out.println("arr8 = " + Arrays.toString(arr8));

        for(int i : arr8){
            char[] g = new char[i];
            Arrays.fill(g, '*');
            System.out.println(new String(g) + i);
        }

        String[][] s1 = new String[][]{{"aaa","bbb"},{"ccc","ddd"}};
        String[][] s2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(s1, s2));
        System.out.println(Arrays.deepEquals(s1, s2));

        char[] c1 = {'A','D','C','B'};

        System.out.println("c1 = " + Arrays.toString(c1));
        System.out.println("index of B = " + Arrays.binarySearch(c1, 'B') ); // -2 => 정렬전이라 결과가 잘못됨
        System.out.println("======After sort() ======");
        Arrays.sort(c1);

        System.out.println("c1 = " + Arrays.toString(c1));
        System.out.println("index of B = " + Arrays.binarySearch(c1, 'B'));
        /**
            arr = [0, 1, 2, 3, 4]
            arr2 = [[11, 12, 23], [21, 22, 23]]
            arr3 = [0, 1, 2, 3, 4]
            arr4 = [0, 1, 2]
            arr5 = [0, 1, 2, 3, 4, 0, 0]
            arr6 = [2, 3]
            arr7 = [0, 1, 2, 3, 4, 0, 0]
            arr8 = [9, 9, 9, 9, 9]
            arr8 = [1, 4, 5, 5, 2]
            *1
            ****4
            *****5
            *****5
            **2
            false
            false
            c1 = [A, D, C, B]
            index of B = -2
            ======After sort() ======
            c1 = [A, B, C, D]
            index of B = 1
         */
    }
}
