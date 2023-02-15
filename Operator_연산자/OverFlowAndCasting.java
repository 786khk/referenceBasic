package Operator_연산자;

import javax.sound.sampled.SourceDataLine;

public class OverFlowAndCasting {
    public static void main(String[] args) {
        int i1 = Integer.MAX_VALUE;
        int i2 = i1+1;
        System.out.println("정수 OverFlow : " + i2 ); //표현할 수 있는 수를 넘어서 오버플로우발생 i2은 쓰레기 값이 할당됨
        
        long l1 = i1+1;
        System.out.printf("long타입에 할당 : %d%n",l1);

        long l2 = (long)(i1 + 1);
        System.out.printf("캐스팅 된 값 : %d%n", l2 ); // 성공할 거같지만 형변환 전 ()안의 더하기 연산먼저 실행해 버려서 쓰레기값할당

        long l3 = (long)i1+1;
        System.out.printf("형변환 적용 계산 : %d%n",l3); // 형변환이 먼저 실행 된 후 더하기 연산 진행 

        int i3 = 1000000 * 1000000/1000000;
        int i4 = 1000000 / 1000000 * 10000000;
        
        System.out.printf("i3 :%d, i4:%d%n",i3,i4);
    }
    
}
