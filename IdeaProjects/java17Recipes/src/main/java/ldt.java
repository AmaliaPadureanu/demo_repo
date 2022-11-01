import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class ldt {
    public static void obtainDatesWithTime(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local date and time: " + ldt);

        LocalDateTime ldt2 = LocalDateTime.of(2021, Month.NOVEMBER, 11, 12, 00);
        System.out.println("Specified date and time:" + ldt2);

        Month month = ldt.getMonth();
        int monthValue = ldt.getMonthValue();
        System.out.println("Month: " + month);
        System.out.println("Month value: " + monthValue);

        int day = ldt.getDayOfMonth();
        DayOfWeek dayWeek = ldt.getDayOfWeek();
        int dayOfYr = ldt.getDayOfYear();

        System.out.println("Day: " + day);
        System.out.println("Day of week: " + dayWeek);
        System.out.println("Day of year: " + dayOfYr);

        int year = ldt.getYear();
        System.out.println("Date: " + monthValue + "/" + day + "/" + year);

        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();

        System.out.println("Current time: " + hour + ":" + minute + ":" + second);

        LocalDateTime currMinusMonths = ldt.minusMonths(12);
        LocalDateTime currMinusHours = ldt.minusHours(10);
        LocalDateTime currPlusDays = ldt.plusDays(30);

        System.out.println("Current data and time minus 12 months: " + currMinusMonths);
        System.out.println("Current date and time minus 10 hours: " + currMinusHours);
        System.out.println("Current date and time plus 30 days:" + currPlusDays);
    }


}
