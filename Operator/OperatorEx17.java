package Operator;
//자바의 정석 예제 코드
public class OperatorEx17 {
    public static void main(String[] args) {
        double pi=3.141592;
        double shportPo = (int)(pi * 1000 +0.5) / 1000.0; // 반올림 
        // 연산 순번  
        // 1 : pi * 1000 
        // 2:+0.5 
        // 3: / 1000.0 
        // 4: (int)
        // 1000.0 으로 나누지 않고 1000으로 나누었으면 실수부분이 사라지고 3이 된다.

        System.out.println(shportPo);

        double pie=3.141592;
        double shportPie = Math.round(pie * 1000) / 1000.0; 

        System.out.println(shportPie);



    }
}
