import java.beans.PropertyEditorSupport;

public class LambdaArgumentDemo {
    interface StringFunc {
        String func (String str);
    }

    static String changeStr (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main (String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println ("Here is input starting: " + inStr);

        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() -1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        outStr = changeStr((str) -> {
            String result = "";
            char ch;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);
        System.out.println("The string in reversed case: " + outStr);


    }


}
