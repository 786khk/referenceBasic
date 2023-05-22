package Operator;
//자바의 정석 예제 코드
public class OperatorEx21 {
    public static void main() {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;
        System.out.printf("10.0 == 10.0f %b%n", 10.0==10.0f);
        System.out.printf("10.0f == %f%n", 10.0f);
        System.out.printf("10.0 == %f%n", 10.0);
        System.out.printf("0.1==0.1f  %b%n", 0.1==0.1f);
        System.out.printf("0.1f==  %f%n", 0.1f);
        System.out.printf("0.1==  %f%n",0.1);
        System.out.printf("f =%f%n",f);
        System.out.printf("f =%19.17f%n",f);
        System.out.printf("d =%19.17f%n", d);
        System.out.printf("d2 =%19.17f%n", d2);
        System.out.printf("d==f %b%n", d==f);
        System.out.printf("d==d2 %b%n", d==d2);
        System.out.printf("d2==f %b%n",d2==f);
        System.out.printf("(float) d==f %b%n",(float)d==f);


        /**
         * 
            10.0 == 10.0f true
            0.1==0.1f  false
            f =0.10000000149011612
            d =0.10000000000000000
            d2 =0.10000000149011612
            d==f false
            d==d2 false
            d2==f true
            (float) d==f true
         */
    }
}