package format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormaterEx4 {
    public static void main() {
        String pattern = "yyyy/MM/dd";
        DateFormat df1 =new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);
        Date input = null;
        System.out.printf("날짜를 %s 의 형태로 입력해 주세요, 예:2023/03/09 %n", pattern );

        while(s.hasNextLine()){
            try {  
                input = df1.parse(s.nextLine());
                break;
            } catch (Exception e) {
                System.out.printf("날짜를 %s 의 형태로 다시 입력해 주세요, 예:2023/03/09 %n", pattern );

                // TODO: handle exception
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(input);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()/(60*60*1000));

        System.out.println("입력하신 날짜는 현재와" + day + "시간 차이가 있다.");

        System.out.println();
        /**
         * 결과 : 
         2023/03/26
         */

    }   
}
