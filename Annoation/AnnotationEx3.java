package Annoation;

import java.util.ArrayList;

public class AnnotationEx3 {
    @SuppressWarnings({"deprecation", "unchecked"})
    // @SuppressWarnings("deprecation")// 이 메서드 내 deprecation에 대한 경고가 안나타나도록 한다.
    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.old = 10;
        System.out.println(n.getOld());

        // @SuppressWarnings("unchecked") // 아래 new ArrayList()를 할 때  타입을 지정하지 않아 경고가 뜨는데 unchecked라는경고를 억제해 준다.
        ArrayList<NewClass> list = new ArrayList();// 타입지정안함
        list.add(n);
        System.out.println();
    }
}

class NewClass {
    int newFeild;
    int getNewFeild(){return newFeild;}
    @Deprecated
    int old;
    @Deprecated
    int getOld(){return old;}
}