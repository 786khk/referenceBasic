package objectOriented;


class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power =!power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}

}

class VCR{
    boolean power;
    int counter

    void power() {power =!power;}
    void play() {/* */}
    void rew() {/* */}
    void stop() {/* */}
    void ff() {/* */}
}
public class TVCR extends Tv{
    VCR v = new VCR();
    void play() {v.play();}
    void stop() {v.stop();}
    void rew() {v.rew();}
    void ff() {v.ff();} //VCR클래스가 변경되어도 현재 클래스의 메서드에 새로 변경된 내용으로 적용
}
