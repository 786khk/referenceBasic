package objectOriented;

public class SuperTestEx {
    public static void main() {
        Child c = new Child();
        c.m();
    }
}

class Parent{
    int x=19;

}
class Child extends Parent{ 
    void m(){
        System.out.println("x= " + x);
        System.out.println("this.x= " + this.x);
        System.out.println("super.x= " + super.x);
    }
}