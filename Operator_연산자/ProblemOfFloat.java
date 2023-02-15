package Operator_연산자;

import java.math.BigDecimal;

public class ProblemOfFloat {
    public static void main(String[] args) {
        float f1 = 2.0f;
        float f2 = 1.1f;
        float f3 = f1 - f2;
        double d1 =2.0;
        double d2 = 1.1;
        double d3 = d1 - d2;

        System.out.println("결과 비교 : " + (f3==d3)+", f3 :" + f3+ " , d3 :"+ d3); // 결과 비교 : false, f3 :0.9 , d3 :0.8999999999999999

        int i1 = (int) (d1 * 10);
        int i2 = (int) (d2 * 20);

        double result = (i1 - i2) / 10.0; // 0.9

        System.out.println("변환 후 처리 : " + result);

        BigDecimal bd1 = new BigDecimal("2.0");
        BigDecimal bd2 = new BigDecimal("1.1");

        System.out.println(bd1.subtract(bd2));
    }
}
