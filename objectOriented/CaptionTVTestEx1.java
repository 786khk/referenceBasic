package objectOriented;

class Tv{
    boolean power;
    int chanel;

    void power(){ power = !power;};
    void chanelUp(){++chanel;};
    void chanelDown(){--chanel;};
}

class CaptionTv extends Tv{
    boolean captions;
    void displayCaption(String txt){
        if(captions){
            System.out.println(txt);
        }
    }

    public CaptionTv(){}
}
public class CaptionTVTestEx1 {
   public static void main(){
    CaptionTv ctv = new  CaptionTv();
    ctv.chanel = 10;
    ctv.chanelUp();
    // ctv.chanelDown();
    System.out.println(ctv.chanel);
    ctv.displayCaption("Hello");
    ctv.captions = true; // 자막기능 on

    ctv.displayCaption("Hello");
   }
}
