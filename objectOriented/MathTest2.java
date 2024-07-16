package objectOriented;

public class MathTest2 {
  
    public void main() {
        System.out.println("static 메서드 add" + MathTest_2.add(100l,200l) );
        System.out.println("static 메서드 subtract" + MathTest_2.subtract(100l,200l) );
        System.out.println("static 메서드 multiply" + MathTest_2.multiply(100l,200l) );
        System.out.println("static 메서드 divide" + MathTest_2.divide(100d,200d) );
        MathTest_2 mm = new MathTest_2();
        mm.a = 100l;
        mm.b = 200l;
        long result1= mm.add(2L, 2L);
        long result2 = mm.subtract(2L, 2L);
        long result3 = mm.multiply(2L, 2L);
        double result4 = mm.divide(2L, 2L); // 매개변수는 long이지만 반환 타입은 double
        System.out.println("인스턴스 메서드 add" + mm.add(100l,200l) );
        System.out.println("인스턴스 메서드 subtract" + mm.subtract(100l,200l) );
        System.out.println("인스턴스 메서드 multiply" + mm.multiply(100l,200l) );
        System.out.println("인스턴스 메서드 divide" + mm.divide(100d,200d) );
    }
}

class MathTest_2{
    long a,b;
    long add(){
        long result = a+b;
        return result;
    }

    // 인스턴스메서드는 매개변수없어도 충분하기 때문에 별도 매개변수 필요 ㄴㄴ
    long subtract() {return a-b;}
    long multiply() {return a*b;}
    double divide() {return a/b;} 
    
    static long add(long a, long b){
        long result = a+b;
        return result;
    }

    static long subtract(long a, long b) {return a-b;}
    static long multiply(long a, long b) {return a*b;}
    static double divide(double a, double b) {return a/b;} 
}
