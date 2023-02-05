package VariableAndDataType;
public class Integer_{
    public static void main(String[] args) {
        byte b1 = -128;
        // byte b2 = 128; 이 부분은 타입이 맞지않아 IDE에서 빨같 밑죽이 그어짐.

        int i1 = 15;
        int i2 = 0b111;
        int i3 = 017;
        int i4 = 0xf;
        int i5 = 1_000_000_000;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        // long l1 = 10000000000; // 빨간줄, 리터럴이 없어 int형태로 표현할 수 없어 나는 에러
        
        long l2 = 10000000000L;
        System.out.println(l2);


    }
}