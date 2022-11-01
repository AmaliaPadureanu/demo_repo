import java.util.Arrays;
import java.util.function.Function;

public class Main2 {
    static Function<String, String> newText = (testText) -> {
        String tempStr = "";
        for (String part : testText.split(" ")) {
            tempStr += new StringBuilder(part).reverse().toString() + " ";
        }
        return tempStr;
    };

    public static void main(String[] args) {
        System.out.println(newText.apply("Hello world"));
    }

};
