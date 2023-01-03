package VariableAndDataType;

public class TypeCasting{
    public static void main(String[] args) {
        int i1 = 1234;
        long l1 = i1;
        byte b1 = (byte) l1;
        System.out.println("정수에서 정수 형변환 : int = " +i1+"\t"+ "long = "+l1 +"\t" +"bytes = " +b1);
        System.out.println("여러 변수를 출력할 때 '+'를 쓰는데 이 연산자는 '나열'을 의미한다.");

        double d1 = i1;
        byte b2 = (byte)d1;
        System.out.println("실수 > 정수 형변환 : 실수(double) d1(정수(i1)>실수(d1)) = "+ d1 + "\t 정수(byte) b2 =" +b2 );

        double d2 = 0.12345678901234567890;
        float f1 = (float)d2;
        System.out.println("실수 > 실수 형변환 : d2 = "+d2 + "\t f1 = "+f1);
        
        byte b3 = 67;
        char c1 = (char)b3;
        float f2 = c1;
        System.out.println("정수 > 문자 형변환 : c1 = "+c1 +"\n 문자 > 실수 형변환 : f2= "+f2 );

        boolean b = false;
        // int i2 = (int)b;
        // can not cast from boolean to int  

    }
}