import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class LineTerminators {
    public static void main(String[] args) {
        /*String nameString = "Luciano \nManelli \nTaranto";
        Stream<String> stringStream = nameString.lines();
        stringStream.forEach(System.out::println);

        String str = "This String will change case.";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String one = "Hello";
        String two = "Java17";

        String result = one.concat(" ".concat(two));
        System.out.println(result);

        String result2 = one + " " + two;
        System.out.println(result2);

        StringBuffer buffer = new StringBuffer();
        buffer.append(one).append(" ").append(two);
        String result3 = buffer.toString();
        System.out.println(result3);

        String str = "I love Java 8!  It is my favorite language.  Java 8 is the " + "8th version of this great programming language.";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        System.out.println("Original: " + str);
        System.out.println(matcher.matches());
        System.out.println("Replacement: " + matcher.replaceAll("17"));*/

        double temperature = 37.1;
        String temperatureString = "The current temperature is %.1f degrees Celsius.";
        System.out.println(String.format(temperatureString, temperature));
        temperature = 38.4;
        System.out.println(String.format(temperatureString, temperature));
    }

}
