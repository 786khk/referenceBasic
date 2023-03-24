package DateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneEx {
    public static void main(String[] args) {
        
        TimeZone t = Calendar.getInstance().getTimeZone();
        System.out.println("timeZone : "+ t);
        System.out.println("국가 : "+t.getDisplayName());
        System.out.println("UTC 시간차 : "+t.getOffset(Calendar.getInstance().getTimeInMillis())/(60*60));
    }
}
