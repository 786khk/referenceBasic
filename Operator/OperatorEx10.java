package Operator;
//자바의 정석 예제 코드
public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;
        int result1 = a*a/a;
        int result2 = a/a*a;
        
        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // %d * %d에서 오버플로우가 발생
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }
}
