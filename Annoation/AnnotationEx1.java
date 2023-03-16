package Annoation;

public class AnnotationEx1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();
        /*
        c.parentmethod();를 실행하면 부모 메서드를 찾을 수 없다는 예외.


        Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        The method parentmethod() of type Child must override or implement a supertype method

        at Annoation.Child.parentmethod(AnnotationEx1.java:22)
        at Annoation.AnnotationEx1.main(AnnotationEx1.java:6)
         */
    }
}

class Child extends Parent{

    @Override // 
    void parentMethod() {
        // TODO Auto-generated method stub
        super.parentMethod();
    }

    
}
class Parent{
    void parentMethod(){
        System.out.println("부모 메서드");
    }
}