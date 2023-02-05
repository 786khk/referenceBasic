package VariableAndDataType;

public class Float {
    public static void main(String[] args) {
        // float f1 = 3.14; //타입이 맞지 않음, 즉 리터럴리 없다는 뜻.
        float f2 = 3.14f;

        double d1 = 3.14;
        double d2 = 3.14e2;
        System.out.println(d2);

        double d3 = 3.14e-2;
        System.out.println(d3);

        System.out.println("---같은 숫자 출력결과 비교!---");
        float f3 = 0.1234567890123456789f;
        double d4 = 0.1234567890123456789;
        System.out.println(f3);
        System.out.println(d4);

    }
}
