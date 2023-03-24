package DateAndTime;

import java.util.Calendar;

public class CalendarEx5 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Usage : java CalendarEx5 2023 3");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int STRAT_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        start.set(year, month -1, 1);
        end.set(year, month, 1);

        end.add(Calendar.DATE,-1);

        STRAT_DAY_OF_WEEK = start.get(Calendar.DAY_OF_WEEK);
        END_DAY = end.get(Calendar.DATE);
        System.out.println("    " + args[0]+"년"+ args[1]+"월");
        System.out.println(" S  M  T  W  T  F  S ");

        for(int i=1; i<STRAT_DAY_OF_WEEK; i++){
            System.out.print("   ");// 3칸

        }
        for(int i=1, n=STRAT_DAY_OF_WEEK; i<=END_DAY; i++, n++){
            System.out.print((i<10)?"  "+i : " "+i); // 참: 두칸 거짓 : 한 칸
            if(n%7==0) System.out.println();
        }
    }
}
