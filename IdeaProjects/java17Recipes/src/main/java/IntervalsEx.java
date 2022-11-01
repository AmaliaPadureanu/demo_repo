import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class IntervalsEx {
    public static void intervals() {
        LocalDate anniversary = LocalDate.of(2015, Month.NOVEMBER, 11);
        LocalDate today = LocalDate.now();
        Period period = Period.between(anniversary, today);
        System.out.println("Number of days difference: " + period.getDays());
        System.out.println("Number of months difference: " + period.getMonths());
        System.out.println("Number of years difference: " + period.getYears());
    }

    public static void compareDatesCalendar() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2010, 0, 1, 12, 0, 0);
        Date date1 = cal2.getTime();
        System.out.println(date1);
        System.out.println(cal1.getTime());
        long mill = Math.abs(cal1.getTimeInMillis() - date1.getTime());
        long hours = TimeUnit.MILLISECONDS.toHours(mill);
        Long days = TimeUnit.HOURS.toDays(hours);
        String diff = String.format("%d hour(s) %d min(s)", hours, TimeUnit.MILLISECONDS.toMinutes(mill) - TimeUnit.HOURS.toMinutes(hours));
        System.out.println(diff);
        diff = String.format("%d days", days);
        System.out.println(diff);
        int weeks = days.intValue()/7;
        diff = String.format("%d weeks", weeks);
        System.out.println(diff);
    }

    public static void main(String[] args) {
        compareDatesCalendar();
    }
}
