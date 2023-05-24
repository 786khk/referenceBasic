package objectOriented;

public class TvTest {
    public static void main() {
        Tv t; // 참조변수 t선언, 메모리에 자리마련. 아직 인스턴스가 생성되지않았음 
        t = new Tv(); // Tv클래스의 인스턴스가 메모리 빈공간에 생성. 메모리에 올라가고 주소가 생성됨. 
        // 이 때 맴버변수(color, power, channel)는 각자료형에 해당하는 기본값으로 초기화된후 객체 주소값이 참조변수 t에 저장. Tv인스턴스 접근가능
        t.channel=7; //참조변수 t에 저장된 주소에 있는 인스턴스에 저장
        t.channelDown();//Tv인스턴스 channelDown()호출
        System.out.printf("현재 채널은 %d 입니다.",t.channel); //channel에 저장된 값 출력
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