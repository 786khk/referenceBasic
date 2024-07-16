package objectOriented;

class SuperPointer{
    int x,y;
    SuperPointer(int x, int y){
        this.x = x;
        this.y = y;
    }
    SuperPointer(){
        this(1,1);
    }
    String getLocation(){
        return "x: " +x+", y: " +y;
    }
}

class Point3D extends SuperPointer{
    int z;

    Point3D(int x, int y, int z){
        super(x,y); // 조상클래스 생성자 SuperPointer() 호출
        // this.x = x;
        // this.y = y;
        this.z = z;
    }

    // Point3D(int x, int y, int z){
    //     super(); // 조상클래스 생성자 SuperPointer() 호출
    //     this.x = x;
    //     this.y = y;
    //     this.z = z;
    // }

    String getLocation(){
        return "x: " +x+", y: " +y+", z: "+z;
    }
}
public class SuperConstructor{
    public static void main() {
        
        Point3D p3d = new Point3D(1,2,3);
        p3d.getLocation();
    }
}