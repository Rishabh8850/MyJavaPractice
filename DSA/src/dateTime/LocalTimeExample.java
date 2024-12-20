package dateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : "+localTime);
        LocalTime localTime1 = LocalTime.of(07,30);
        System.out.println("localTime1 : "+localTime1);
        LocalTime localTime2 = LocalTime.of(07,30, 30);
        System.out.println("localTime2 : "+localTime2);
        LocalTime localTime3 = LocalTime.of(07,30, 30, 2987644);
        System.out.println("localTime3 : "+localTime3);

        /* Get values from local Time
         */
        System.out.println("getHour : "+localTime.getHour());
        System.out.println("getMinute : "+localTime.getMinute());
        System.out.println(("Chrono Hour : "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY)));
        System.out.println("toSecondOfDay : "+localTime.toSecondOfDay());

        /* Modify Local Time
         */
        System.out.println("minusHours : "+localTime.minusHours(2));
        System.out.println("Chrono.Hour : "+localTime.minus(2,ChronoUnit.HOURS));
        System.out.println("Midnight : "+ localTime.with(LocalTime.MIDNIGHT));
        System.out.println("Hour of the Day : "+localTime.with(ChronoField.CLOCK_HOUR_OF_DAY,22));
        System.out.println("withHour : "+localTime.withHour(15));
        System.out.println("plusMinutes : "+localTime.plusMinutes(30));
    }
}
