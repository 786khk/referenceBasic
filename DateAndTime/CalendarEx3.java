package DateAndTime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600,60,1};
        final String[] TIME_UNIT_NAME = { "시","분", "초" };
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        
        time1.set(Calendar.HOUR_OF_DAY,10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND,30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY)+"시" + time1.get(Calendar.MINUTE)+"분"+time1.get(Calendar.SECOND)+"초");
        System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + "시" + time2.get(Calendar.MINUTE) + "분"
                + time2.get(Calendar.SECOND) + "초");

        long diff = Math.abs(time2.getTimeInMillis()-time1.getTimeInMillis()) / 1000;
    
        System.out.println("time1과 time2의 차이는 " + diff+" 초 입니다.");

        String tmp="";
        for(int i=0; i<TIME_UNIT.length;i++){
            tmp += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i];
            diff %= TIME_UNIT[i];
        }

        System.out.println("시분초로 하면"+ tmp + "입니다.");
    }




    static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일"; 
    }
}
