package objectOriented;

public class TvTest2 {
    public static void main() {
        Tv t1 = new Tv(); 
        Tv t2 = new Tv();
        System.out.printf("t1의 channel의 값은 %s 입니다.%n",t1.channel);
        System.out.printf("t2의 channel의 값은 %s 입니다.%n",t2.channel);
        t1.channel = 7;
        System.out.printf("t1의 channel의 값을 %d 로 변경했습니다.%n",t1.channel);
        System.out.printf("t1의 channel의 값은 %s 입니다.%n",t1.channel);
        System.out.printf("t2의 channel의 값은 %s 입니다.%n",t2.channel);

        /*
         * t1의 channel의 값은 0 입니다.
            t2의 channel의 값은 0 입니다.
            t1의 channel의 값을 7 로 변경했습니다.
            t1의 channel의 값은 7 입니다.
            t2의 channel의 값은 0 입니다.
         */
    }
}
class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power =!power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}

}