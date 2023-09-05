package objectOriented;

public class Tv3 {

    static class Tv3_ {
        String color;
        boolean power;
        int chanel;

        void power() {
            power = !power;
        }

        void chanelDown() {
            --chanel;
        }

        void chanelUp() {
            ++chanel;
        }
    }

    public static void main() {
        Tv3_ t1 = new Tv3_();
        Tv3_ t2 = new Tv3_();
        System.out.println("t1의 chanel 값은 " + t1.chanel + "입니다.");
        System.out.println("t2의 chanel 값은 " + t2.chanel + "입니다.");
        t2 = t1;
        t1.chanel = 7;
        System.out.println("-----------t1의 chanel 값을 7로 변경!!!!------------");

        System.out.println("t1의 chanel 값은 " + t1.chanel + "입니다.");
        System.out.println("t2의 chanel 값은 " + t2.chanel + "입니다.");
    }
}
