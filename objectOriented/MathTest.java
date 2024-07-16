package objectOriented;

public class MathTest {
    public void main() {
        MathTest_ mm = new MathTest_();
        long result1= mm.add(2L, 2L);
        long result2 = mm.subtract(2L, 2L);
        long result3 = mm.multiply(2L, 2L);
        double result4 = mm.divide(2L, 2L); // 매개변수는 long이지만 반환 타입은 double
    }
}

class MathTest_{
    long add(long a, long b){
        long result = a+b;
        return result;
    }

    long subtract(long a, long b) {return a-b;}
    long multiply(long a, long b) {return a*b;}
    double divide(long a, long b) {return a/b;} 
}
