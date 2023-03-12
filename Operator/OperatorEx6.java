package Operator;
//자바의 정석 예제 코드
public class OperatorEx6 {
    public static void main(String[] args) {
     byte a = 10;
     byte b = 20;
     byte c = a+b;// Type mismatch: cannot convert from int to byte 
     //연산시 기본형인 int로 형변환돼 연산된다. int + int 로 계산됨
     System.out.println(c);
        
    }
}
