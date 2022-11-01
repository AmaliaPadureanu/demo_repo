import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParseDT {
    public static void parseDateTime() {
        LocalDate ld = LocalDate.parse("2019-12-28");
        LocalDateTime ldt = LocalDateTime.parse("2019-12-28T08:44:00");
        System.out.println("Parsed date: " + ld);
        System.out.println("Parsed date-time " + ldt);
        LocalDate ld2 = LocalDate.parse("2019-12-28", DateTimeFormatter.ISO_DATE);
        System.out.println("Different parser: " + ld2);
        String input = "12/28/2019";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate ld3 = LocalDate.parse(input, formatter);
            System.out.println("Custom parsed date: " + ld3);
        } catch (DateTimeParseException ex) {
            System.out.println("Not parsable: " + ex);
        }

    }
    public static void main(String[] args) {
        parseDateTime();
    }
}
