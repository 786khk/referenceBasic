package Annoation;

import java.util.Arrays;

class MyArrayList<T>{
    T[] arr;
    //@Retention(RetentionPolicy.RUNTIME)는 런타임시 호출될 때 적용되도록 설정한다.
    //어노테이션은 컴파일시 제거가된다. 하지만 @Retention(RetentionPolicy.RUNTIME)을 붙이면 런타임에도 적용되도록하는 어노테이션
    @SafeVarargs // 생성자, 메서드에만 적용할 수 있다.
    @SuppressWarnings("varargs")
    public MyArrayList(T... arr) {
        this.arr = arr;
    }
    
    // @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T> MyArrayList<T> asList(T... a){
        return new MyArrayList<>(a);
        // return new ArrayList<T>(a);//ArrayList(E[] arr) 를 호출 , 경고발생
    }
    public String toString(){
        return Arrays.toString(arr);
    }
}
public class AnnotationEx4 {
    // @SuppressWarnings("unchecked")

    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1","2","3");

        System.out.println(list);
    }
}
