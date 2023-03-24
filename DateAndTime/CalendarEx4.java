package DateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        // date.set(2023,03,24);
        System.out.println("현재 : " + toString(date));
        System.out.println("=====1일 후 =====");
        date.add(Calendar.DATE,1);
        System.out.println(toString(date));
       
        System.out.println("=====6개월 전====");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("===== 31일 후(roll)=====");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));
        
        System.out.println("===== 31일 후(add)=====");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));

    }

    static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일"; 
    }
}
