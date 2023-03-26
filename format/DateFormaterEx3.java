package format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormaterEx3 {
    public static void main() {
        DateFormat df1 =new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        Date today = new Date();

        try {
            Date d = df1.parse("2023년 3월 26일");
            System.out.println(df2.format(d));
        } catch (Exception e) {
            // TODO: handle exception
        }
        /**
         * 결과 : 
         2023/03/26
         */

    }   
}
