# Calendar와 Date

- Calendar는 추상클래스 이기때문에 객체를 직접생성할 수 없다. -> 완전이 구현된 클래스의 인스턴스를 얻어야 한다.

```java

Calendar calendar = new Calendar(); // X

Calendar calrendar = Calendar.getInstance();

```


### Date와 Calendar간의 변환

```java

//1. Calendar를 Date로 변환
Calendar cal = Calendar.getInstance();
Date d = new Date(cal.getTimeInMillis());//Date(long dateTime);

//2. Date를 Calendar로 변환
Date d = new Date();
Calendar  cal = Calendar.getInstance();
cal.setTime(d);

```

### getInstance()
- static 메서드 (메서드 내 코드에서 인스턴스 변수를 사용하거나 인스턴스 메서드를 호출하지않기때문, static이 아니면 인스턴스 생성 후 호출해야 함)
- 시스템의 국가와 지역설정을 확인해 국가에 맞는 시간정보를 반환한다.
- 기본적으로 현재 시스템 날짜, 시간을 가지고 있음
- Calendar.get() 으로 얻어오는 값의 범위가 Month 는 0~11 이다.

```java
        System.out.println("현재 연도" + today.get(Calendar.YEAR));
        System.out.println("월 0~11(0 : 1월)" + today.get(Calendar.MONTH));//11월
        System.out.println("주 이해의 몇째 주" + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("주 이달의 몇째 주" + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("주 이달의 몇일 DAY_OF_MONTH" + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("올 해의 몇일 "  + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 일요일 : 1) " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("요일 일~토 (0:일요일)" + today.get(Calendar.DAY_OF_WEEK));

        //Calendar.YEAR같은변수는  Calendar객체에 선언된 스테틱변수
        public final static int YEAR = 1;

```

해당예제는 [DataAndTime/CalendarEx1](https://github.com/786khk/referenceBasic/edit/main/DataAndTime/CalendarEx1.java)에서 확인할 수 있음 


### 날짜간의 차이
- 두 날짜를 최소단위인 초단위로 변경한 다음 그 차이를 구한다.
- getTimeInMillis()는 1/1000 단위로 값을 반환하기 때문에 초단위로 나누어야하고... 라고 서적에 정리되어있지만 이 부분은 사람마다 다르다.

```java

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

        System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY)+"시" + time1.get(Calendar.MINUTE)+"분" + time1.get(Calendar.SECOND)+"초");
        System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + "시" + time2.get(Calendar.MINUTE) + "분"
                + time2.get(Calendar.SECOND) + "초");

        long diff = Math.abs(time2.getTimeInMillis()-time1.getTimeInMillis()) / 1000;

```
- time1과 time2의 차이가 절댓값은 동일하지만 양수일수도, 음수일 수 있다. 그렇기때문에 Math.abs로 구한다면 양수인지 음수이지를 고려하지않아도될듯..


##### ❓그럼 타임스탬스를 구할 때 어떤 기준으로 구해야 하는가?
✔ 구한다면 서버시간을 먼저 세팅 한 후 구할 수 있다. JAVA의 시간 관련 클래스들은 시스템의 날짜와 시간을 반환한다.
이 때 만약 서비스 지역이 한국이 아닌 해외라면 해외에 잇는 서버의 시간을 구해온다.
실제로 서버 시간을 바꿔서 예제를 출력해 봤다.

![image](https://user-images.githubusercontent.com/78067072/227421741-6b9afb09-65b2-475d-9e01-8527eb2eed23.png)

현재 시스탬 시간은 UTC로 영웅시간을 기준으로 시간차를 타임존으로 정의한다. 

실험을 위해 일부러 시간차가 큰 지역으로 설정했다.
 ![image](https://user-images.githubusercontent.com/78067072/227422363-0f28d3fd-2c69-40b4-85f9-63eb9c18b812.png)


 ```java
        TimeZone t = Calendar.getInstance().getTimeZone();
        System.out.println("timeZone : "+ t);
        //timeZone : sun.util.calendar.ZoneInfo[id="Pacific/Honolulu",offset=-36000000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]
        System.out.println("국가 : "+t.getDisplayName()); // 하와이 알류샨 표준시
        System.out.println("UTC 시간차 : "+t.getOffset(Calendar.getInstance().getTimeInMillis())/(60*60));//UTC 시간차 : -10000  
 ```

 서버 리전의 시간을 고려해 서비스 되는 지역의 시간을 계산해야한다. 
 같이 동시에 작업을 해도 한곳은 새벽, 한곳은 저녁시간으로 작업이 된다고 생각한다.


 


```java



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


        //결과

        /**
            2023년3월23일
            =====1일 후 =====
            2023년3월24일
            =====6개월 전====
            2022년9월24일
            ===== 31일 후(roll)=====
            2022년9월25일
            ===== 31일 후(add)=====
            2022년10월26일
         */


````
#### add()와 roll()의 차이
-add는 지정한 값만큼 증가 또는 감소할 수 있어 특정날짜릴 기준으로 일정기간을 알 수 있다.
- roll 또한 add와 같이 기준되는날짜에서 일정기간을 알 수 있지만, 지정한 필드의 값을 증가 또는 감소할 수 있다.하지만 파라미터로 지정된 항목(DATE, MONTH, YEAR 등) 에만 영향을 준다.