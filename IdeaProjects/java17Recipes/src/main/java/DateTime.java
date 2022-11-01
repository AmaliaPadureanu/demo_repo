import java.time.*;

public class DateTime {
    public static void newDate() {
        LocalDate date = LocalDate.now();
        System.out.println("Current Data: " + date);
    }

    public static void newSpecificData() {
        LocalDate ldate = LocalDate.of(2021, Month.NOVEMBER, 12);
        System.out.println("Date from specified date: " + ldate);
    }

    public static void obtainYearMonth() {
        YearMonth yearMo = YearMonth.now();
        System.out.println("Current Year and Month: " + yearMo);

        YearMonth specifiedData = YearMonth.of(2021, Month.NOVEMBER);
        System.out.println("Specified Year-Month: " + specifiedData);
    }

    public static void obtainMonthDay() {
        MonthDay monthDay = MonthDay.now();
        System.out.println("Current month and day: " + monthDay);

        MonthDay specifiedData = MonthDay.of(Month.NOVEMBER, 12);
        System.out.println("Specified Month-Day:" + specifiedData);
    }

    public static void main(String[] args) {
        newDate();
        newSpecificData();
        obtainYearMonth();
        obtainMonthDay();
    }


}
