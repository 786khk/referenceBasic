
# java.time

- 1.8 부터 Date와 Calendar의 단점을 보완해 추가됨

|||
|---|---|
|java.time| 날짜와 시간을 아루는데 필요한 핵심 클래스들 제공|
|java.time.chrono| 표준 ISO이 아닌 달력시스템을 위한 클래스들 제공|
|java.time.format| 날짜와 시간을 파싱하고 형식화하기 위한 클래스 제공|
|java.time.temporal| 날짜와 시간의 필드(field)와 단위(unit)을 위한 클래스들을 제공|
|java.time.zone|  시간대(time-zone)와 관련된 클래스들을 제공|

- 위 java.time패키지에 속한 클래스들도 String 과 같이 불변
- 날짜와 시간을 변경하는 대신 새로운 객체를 생성해 리턴
- 멀티스레드 환경에서 안전적(Calendar클래스는 바뀔 수 있으므로 멀티쓰레드환경에서는 잘돗될 가능성이있음)

```
LocalDate + LocalTime = LocalDateTime
날짜 + 시간 = 날짜와 시간

LocalDateTime + 시간대 = ZoneDateTime

```

## Period 와 Duration

Period(두 날짜간의 차이를 표현)
Duration(시간아치를 표현)

## 객체 생성 now(), of()

```java

LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.now();
ZoneDateTime zoneDateTime = ZoneDateTime.of(dateTime,ZoneId.of("Asia/Seoul"));

```
## Temporal과 TemporalAmount

- 위 코드에 명시된 객체 등 알짜와 시간을 표현하기 위한 클래스들은 모두 Temporal, TemporalAccessor, TemporalAdjuster 인터페이스를 구현했다.
-Period와 Duration은 TemporalAmount인터페이스를 구현한다.

Temporal, TemporalAdjuster, TemporalAccessor를 구현한 클래스

- LocalDate, LocalTime, LocalDateTime, ZoneDateTime, Instant 등

![image](https://user-images.githubusercontent.com/78067072/227815154-214a4d3b-1961-4b0f-8e91-00db1132cb97.png)

![image](https://user-images.githubusercontent.com/78067072/227815176-55ef6f4a-5bf8-49d0-9f52-4de75f8ab867.png)

![image](https://user-images.githubusercontent.com/78067072/227815188-04e7e000-ccbd-4e15-b1da-0cc6f6276dc4.png)

![image](https://user-images.githubusercontent.com/78067072/227815211-b18ad212-23c5-48b0-92e5-6f6531b22eb3.png)

TemporalAmount를 구현한 클래스
- Period, Duration