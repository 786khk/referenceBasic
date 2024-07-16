package objectOriented;

public class DrawShapeEx {
    public static void main(){
        Point[] p = { new Point(100,45),new Point(20,75), new Point(110,30)};
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(50,150),50);
        t.draw();
        c.draw();

    }   
}

class Shape{ // `형태` 
    String color = "black";
    void draw(){System.out.printf("THIS IS SHAPE [color=%s]%n",color);}
}
class Point{ // `점`
    int x,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        this(0,0);
    }
    String getXY(){
        return "THIS.X : "+ this.x + "THIS.Y : " + this.y; //
    }
}

class Circle extends Shape { // `is a` 원은 도형이다 
    Point center;// `has a`: 원은 점을 가지고 있다 
    int r;

    Circle(){
        this(new Point(0,0),100);
    }
    Circle(Point p, int r){
        this.center = p;
        this.r = r;
    } 
    void draw() { // 오버라이딩
        System.out.printf("[center = (%d,%d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape{ //`삼각형`
    //`is a` 삼각형은 도형이다. 
    Point[] p = new Point[3]; // `has a` : 삼각형은 점을 3개 가지고 있다 
    
    Triangle(Point[] p ){
        this.p = p;
    }
    void draw() { // 오버라이딩
        System.out.printf("[center = (%s,%s), color=%s]%n", p[0].getXY(), p[1].getXY(), color);
    }
}
