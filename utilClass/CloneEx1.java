package utilClass;

class Point implements Cloneable{
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x: "+ x+ ", y: "+y;
    }
    public Object clone(){
        Object obj = null;
        
        try {
            obj = super.clone(); //반드시 예외처리!
        } catch (CloneNotSupportedException e) {}

        return obj;

    }
}

public class CloneEx1 {
    public static void main(String[] args) {
        Point origin = new Point(2, 3);
        Point copy = (Point)origin.clone(); //원본 복제
        System.out.println(origin.toString());
        System.out.println(copy.toString());

    }
    
}

