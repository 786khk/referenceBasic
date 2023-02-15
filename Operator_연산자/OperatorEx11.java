package Operator_연산자;
//자바의 정석 예제 코드
public class OperatorEx11 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char zero = '0';
        char two = '2';
        
        System.out.printf("'%c' - '%c' = %d%n", b, a, b-a); // %d * %d에서 오버플로우가 발생
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two-zero);
        System.out.printf("'%c' =%d%n", a, (int)a);
        System.out.printf("'%c' =%d%n", b, (int) b);
        System.out.printf("'%c' =%d%n", zero, (int) zero);
        System.out.printf("'%c' =%d%n", two, (int)two);
    }
}
