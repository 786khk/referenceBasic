package utilClass;

import java.util.Arrays;

class Cicle implements Cloneable{
    Point_ p ;
    double r;

    public Cicle(Point_ p , double r){
        this.p = p;
        this.r = r;
    }
    public String toString(){
        return "[p = "+ p + ", r = " + r +"]" ;
    }

    public Cicle shallowCopy(){
        Object obj = null;
        
        try {
            obj = super.clone(); //반드시 예외처리!
        } catch (CloneNotSupportedException e) {}

        return (Cicle)obj;

    }

    public Cicle deepCopy(){
        Object obj = null;

        try {
            obj = (Cicle)super.clone(); //반드시 예외처리!
        } catch (CloneNotSupportedException e) {}
            Cicle c = (Cicle)obj;
            c.p = new Point_(this.p.x, this.p.y);
            
            return c;
    }
}
public class CloneEx3 {
    public static void main(String[] args) {
       
        Cicle c1 = new Cicle(new Point_(2,1),2.0);
        Cicle c2 = c1.shallowCopy();
        Cicle c3 = c1.deepCopy();

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("=====c1변경 후 =====");
        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);
    }
    
}
class Point_{
    int x,y;
    public Point_(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "( "+ x+ "  ,"+y+" )";
    }
    
}

