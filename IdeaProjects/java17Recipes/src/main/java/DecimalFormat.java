import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormat {
    public static void formatDouble(double myDouble) {
        NumberFormat numberFormatter = new java.text.DecimalFormat("##.000");
        String result = numberFormatter.format(myDouble);
        System.out.println(result);
    }

    public static void main (String[] args) {
        formatDouble(Double.valueOf("345.9372"));

        NumberFormat numForm = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String result1 = numForm.format(1000);
        System.out.println(result1);
    }
}
