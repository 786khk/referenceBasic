package Operator_연산자;
//자바의 정석 예제 코드
public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        
        long c = a*b;
        System.out.println("a는 "+ a + " b는 " + b + " c는 " + c);
        // a는 1000000 b는 2000000 c는 -1454759936 c가 음수로 나오는데 이건 오버플로우가 발생했기때문이다.
    }
}
