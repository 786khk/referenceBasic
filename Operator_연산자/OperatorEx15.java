package Operator_연산자;
//자바의 정석 예제 코드
public class OperatorEx15 {
    public static void main(String[] args) {
        char lower = 'a';
        
        char upper = (char)(lower-32); 
        // 둘 다 형변환을 해줘야 한 뒤에 기본연산자는 int로 형변환이 되기때문에 char가 되지 않음
        //32를 뺀 후 char로 형변환
       
        System.out.println(upper);
    }
}
