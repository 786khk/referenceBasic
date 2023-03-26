package format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormaterEx2 {
    public static void main() {
        Date today = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        /*
         결과 :
            2023-03-26
            23년 3월 26일 일요일
            2023-03-26 14:33:31.642
            2023-03-26 02:33:31 오후
         */

    }   
}
