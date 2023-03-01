package DateAndTime;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        
        Calendar today = Calendar.getInstance();
        System.out.println("현재 연도" + today.get(Calendar.YEAR));
        System.out.println("월 0~11(0 : 1월)" + today.get(Calendar.MONTH));
        System.out.println("주 이해의 몇째 주" + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("주 이달의 몇째 주" + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("주 이달의 몇일 DAY_OF_MONTH" + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("올 해의 몇일 "  + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일" + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("요일 일~토 (0:일요일)" + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("오전/ 오후 (0:오전, 1:오후)" + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11) (0:1시)" + today.get(Calendar.HOUR));
        System.out.println("오늘 중 시간 (0~23)" + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분 (0~59)" + today.get(Calendar.MINUTE));
        System.out.println("초 (0~59)" + today.get(Calendar.SECOND));
        System.out.println("**1000분의 1초를 기간으로 표시** , 밀리 초 (1000분의 1초(0~999))" + today.get(Calendar.MILLISECOND));
        System.out.println("타임존" + today.get(Calendar.ZONE_OFFSET));
        System.out.println("이달의 마지막 날" + today.getActualMaximum(Calendar.DATE));
        
    }
}
