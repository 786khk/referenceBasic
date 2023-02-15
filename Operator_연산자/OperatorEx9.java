package Operator_연산자;
//자바의 정석 예제 코드
public class OperatorEx9 {
    public static void main(String[] args) {
        int a = 1_000_000 * 1_000_000;
        long b = 1_000_000* 1_000_000l;
        
        System.out.println("a= "+ a); // 오버플로우가 발생
        System.out.println("b= "+b);
    }
}
