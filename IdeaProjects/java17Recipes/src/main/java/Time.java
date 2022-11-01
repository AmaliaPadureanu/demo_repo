import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Time {
    public static void currentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        LocalDateTime ldt = time.atDate(LocalDate.of(2021, Month.NOVEMBER, 12));
        System.out.println("Local Date Time object:" + ldt);

        LocalTime pastTime = LocalTime.of(1, 10);
        System.out.println("Comparing times: " + time.compareTo(pastTime));

        int hour = time.getHour();
        System.out.println("Hour: " + hour);

        System.out.println("Is local time after pastTime? " + time.isAfter(pastTime));

        LocalTime minusHrs = time.minusHours(5);
        System.out.println("Time minus 5 hours: " + minusHrs);

        LocalTime plusMins = time.plusMinutes(30);
        System.out.println("Time plus 30 mins: " + plusMins);
    }

    public static void main(String[] args) {
        currentTime();
    }
}
