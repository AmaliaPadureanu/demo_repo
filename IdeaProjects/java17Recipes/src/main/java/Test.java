import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args){
       // ldt.obtainDatesWithTime();

       /* Date date = new Date();
        System.out.println("Using java.util.Date(): " + date);
        System.out.println("Getting time from java.util.Date(): " + date.getTime());


        Calendar gCal = Calendar.getInstance();
        int month = gCal.get(Calendar.MONTH) + 1;
        int day = gCal.get(Calendar.DATE);
        int yr = gCal.get(Calendar.YEAR);
        String dateStr = month + "/" + day + "/" + yr;
        System.out.println(dateStr);

        int dayOfWeek = gCal.get(Calendar.DAY_OF_WEEK);

        int hour = gCal.get(Calendar.HOUR);
        int min = gCal.get(Calendar.MINUTE);
        int sec = gCal.get(Calendar.SECOND);
        System.out.println(hour + ":" + min + ":" + sec);

        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] days = symbols.getWeekdays();
        System.out.println(days[dayOfWeek]);

        int dayOfYear = gCal.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
        System.out.println("Days left in " + yr + ":" + (365-dayOfYear));
        int week = gCal.get(Calendar.WEEK_OF_YEAR);
        System.out.println(week);
        */

       // InstantEx.instants();

        Runnable oldRunnable = new Runnable() {
            @Override
            public void run() {
                int x = 5 * 3;
                System.out.println("The variable using the old way equals: " + x);
            }
        };

        Runnable lambdaRunnable = () -> {
            int x = 5 * 3;
            System.out.println("The variable using the lambda equals: " + x);
        };

        oldRunnable.run();
        lambdaRunnable.run();
    }
}
