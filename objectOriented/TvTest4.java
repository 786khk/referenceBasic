package objectOriented;

class TvTest4_{
    String color;
    boolean power;
    int channel;

    void power(){ power = !power;}
    void channelUp(){ ++channel; }
    void channelDown(){ --channel;}
}
public class TvTest4 {
    TvTest4_[] tvArr =  new TvTest4_[3]; // 길이가 3인 Tv객체 배열 생성
    /** 
     * 아래 방법도 가능
     *  TvTest4_[] tvArr = {new TvTest4_(),new TvTest4_(),new TvTest4_};
     */
      
    public void main(){

        for(int i = 0; i<tvArr.length; i++){
            tvArr[i]= new TvTest4_();
            tvArr[i].channel = i+10;
        }
    
        for(int i = 0; i<tvArr.length; i++){
         tvArr[i].channelUp();
         System.out.printf("tvArr[%d].channel=%d%n",i);
        }
    }
}
