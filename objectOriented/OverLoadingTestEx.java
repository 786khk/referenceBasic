package objectOriented;

public class OverLoadingTestEx {
    public void main(){
        MyMath3 mm = new MyMath3();
        System.out.printf("int add(%d,%d) 결과 => : %d%n",3,3,mm.add(3,3) );
        System.out.printf("long add(%s,%d) 결과 => : %d%n","3l",3,mm.add(3l,3) );
        System.out.printf("long add(%d,%s) 결과 => : %d%n",3,"3l",mm.add(3,3l) );
        System.out.printf("long add(%s,%s) 결과 => : %d%n","3l","3l",mm.add(3l,3l) );
        int a[] = {100,200,300};
        System.out.println("int add(int[]) 결과 => : "+mm.add(a) );
    }
    
    
}
class MyMath3{ //add 메서드들 즐비 됨 
    // 이름이 같아야하지만 매개변수, 리턴 타입은 중복되면 안된다.
    //반환 타입은 오버로딩을 구현하는데 영향은1도 없음 즉 리터럴이 없어도됨
    // 하지만 오버로딩은 런타임시 효율 떨어짐
    // 대부분 오버로딩이 되어있는 메서드들은 같은 기능을 한다.
    int add(int a, int b){
        int result = a+b;
        return result;
    }
    long add(int a, long b){
        long result = a+b;
        return result;
    }
    long add(long a, int b){
        long result = a+b;
        return result;
    }
    long add(long a, long b){
        long result = a+b;
        return result;
    }
    int add(int a[]){
        System.out.println("int add(int[] a)");
        int result = 0;
        for(int i=0; i<a.length; i++){
            result += a[i];
        }
        return result;
    }
    
}