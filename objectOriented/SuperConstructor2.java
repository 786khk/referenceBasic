package objectOriented;

class SuperPointer2{
    int x=10,y=20;
    SuperPointer2(int x, int y){ // 호출: 3 , Object 호출 : 4
        // super(); //실행되면 컴파일러가 Object의 생성자 호출하는 구문 추가
        this.x = x;
        this.y = y;
    }
   
    String getLocation(){
        return "x: " +x+", y: " +y;
    }
}

class Point3D2 extends SuperPointer2{
  
    int z = 30;

    Point3D2(int x, int y, int z){ // 호출: 2
        super(x,y); // 조상클래스 생성자 SuperPointer() 호출
        // this.x = x;
        // this.y = y;
        this.z = z;
    }

    Point3D2(){
        this(100,200,300); // 호출: 1
    }


}
public class SuperConstructor2{
    public static void main() {
        
        Point3D2 p3d = new Point3D2();
        System.out.println("p3d.x : " + p3d.x);
        System.out.println("p3d.y : " + p3d.y);
        System.out.println("p3d.z : " + p3d.z);
        
        /* 
        p3d.x100
        p3d.y200
        p3d.z300
        */
    }
}