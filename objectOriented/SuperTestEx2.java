package objectOriented;

public class SuperTestEx2 {
    public void main() {
        ChildSuper c = new ChildSuper();
        c.m();
    }
}

class ParentSuper{
    int x = 10;

}
class ChildSuper extends ParentSuper{ 
    int x = 2;
    
    void m(){
        System.out.println("x= " + x);
        System.out.println("this.x= " + this.x);
        System.out.println("super.x= " + super.x);
    }
}