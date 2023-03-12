package Operator;
//자바의 정석 예제 코드
public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';
        int i = c1+1; 
        c3 = (char) (c1+1); // 결과가 int, c3에 담기위해 char형 형변환 필요
        c2++;
        c2++;
        
        
        System.out.println("i = "+i); // %d * %d에서 오버플로우가 발생
        System.out.println("c2 = "+ c2);
        System.out.println("c3 = "+c3);
    }
}
