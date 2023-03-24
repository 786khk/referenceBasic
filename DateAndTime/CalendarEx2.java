package DateAndTime;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"","일", "월", "화", "수", "목", "금", "토"};
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2020, 7,11);// date1.set(2020,Calendat.July,11)와 같이 할수 있음
        System.out.println("date1: " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "요일 이고,");
        System.out.println("오늘은" + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 임");
        // 두 시간 date1, date2의 시간차를 구하려면 getTimeMillis()(타임스탬프)로 변환해 1000을 곱한다.
        long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
        System.out.println("date1과 date2의 차는"+diff+"초가 지났다.");
        System.out.println("일수로 계산하자면 " + diff/(24*60*60));
    }

    static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일"; 
        //get(Calendar.MONTH)는 0~11임. 즉 제로베이스
    }
}
