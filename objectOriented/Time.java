package objectOriented;


public class Time {
   private int  hour;
   private int  minute;
   private float  second;

   public int getHour() {return this.hour;}
   public int getMinute() {return this.minute;}
   public float getSecond() {return this.second;}

   public void setHour(int h) {
       if(h<0 || h>23) return ;
       hour = h;
   }
   public void setMinute(int m) {
        if(m<0 || m>59) return ;
        minute = m;
    }

    public void setSecond(float s) {
        if(s<0.0f || s>59.99f) return ; 
        second = s;

    }
}
