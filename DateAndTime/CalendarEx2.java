package DateAndTime;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"","일", "월", "화", "수", "목", "금", "토"};
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2020, 7,11);// date1.set(2020,Calendat.July,11)와 같이 할수 있음
        System.out.println("date1: " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "임,");
        System.out.println("오늘은" + toString(date2) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "임");
        long diff = (date1.getTimeInMillis() - date2.getTimeInMillis())/1000;
        System.out.println("date1과 date2의 차는"+diff+"초가 지났다.");
        System.out.println("일수로 계산하자면 " + diff/(24*60*60));
    }

    static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일"; 
    }
}
