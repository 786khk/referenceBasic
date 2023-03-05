package Operator;

public class Substitution {
    public static void main(String[] args) {
        int j = 0;

        for(int i=1;i<10;i++){
            j+=i;

            System.out.printf("j에 더해진 i값 : %d%n",i);
        }
        System.out.printf("최종 j의 값 : %d",j);

        int i1 = 10;
        i1+= 20;
        System.out.println(i1);
        i1 -=10;
        System.out.println(i1);
        i1 *=10;
        System.out.println(i1);
        i1 /= 10;
        System.out.println(i1);
        i1 %= 2;
        System.out.println(i1);
    }
}
