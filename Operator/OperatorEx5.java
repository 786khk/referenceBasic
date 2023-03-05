package Operator;
//자바의 정석 예제 코드
public class OperatorEx5 {
    public static void main(String[] args) {
        int i=10;
        int j = 4;
        System.out.printf("%d + %d = %d%n" , i,j,i+j);
        System.out.printf("%d - %d = %d%n" , i,j,i-j);
        System.out.printf("%d * %d = %d%n" , i,j,i*j);
        System.out.printf("%d / %d = %d%n" , i,j,i/j);
        System.out.printf("%d / %f = %f%n", i, (float)j, i/ (float)j);
        
    }
}
