package Operator;

public class TypeCastingIncrementalOperation {
    public static void main(String[] args) {
        byte b1=10;
        b1 += 1; // 복합연산, 별도의 형변환 없으므로 대입가능
        System.out.println(b1);

        byte b2 = ++b1; //b1을 1증가해 할당, 별도 형변환 없음
        System.out.println(b2);
        // byte b3 = (b2 + 1); //Type mismatch: cannot convert from int to byte
        byte b3 = (byte)(b2+1); //b2의 값이 자동으로 int로 형변환하므로 (byte)라는 명시적 형변환이 필요
        System.out.println(b3);
    }
}
