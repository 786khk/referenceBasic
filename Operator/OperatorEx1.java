package Operator;
//자바의 정석 - 연산자
public class OperatorEx1 {
    public static void main(String[] args) {
        int i=5;
        i++; // i+1과 같은 의미, i를 읽어 온 후 증가시킨다.
        System.out.println("i++ : " +i);
        i=5;
        ++i; // 메모리에 올려져있는 i를 1증가시킨 후 읽어온다.
        System.out.println("++i : "+ i);
    }
}
