package Operator_연산자;
//자바의 정석 예제 코드
public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1 +1; // 컴파일 에러, 1은 int형이고 기본형으로 형변환을 한 후 연산해야하기때문에 에러
        
        char c3 = 'a'+1; 
        
        
        // System.out.println("c2 = "+ c2);
        System.out.println("c3 = "+c3);
    }
}
