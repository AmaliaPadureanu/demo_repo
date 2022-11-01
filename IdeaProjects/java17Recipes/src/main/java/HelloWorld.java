public class HelloWorld {
    public static void main (String[] args) {
        HelloMessage hm;
        hm = new HelloMessage();
        System.out.println(hm.getMessage());
        hm.setMessage("Hello, World");
        System.out.println(hm.getMessage());

        String str = "Here is a long String...let's find a match!";

        boolean result = str.matches("Here is a long String...let's find a match!");
        System.out.println(result);

        result = str.matches("Here is a long String...");
        System.out.println(result);
        str = "true";

        result = str.matches("[Tt]rue");
        System.out.println(result);

        result = str.matches("[Tt]rue|[Ff]alse]");
        System.out.println(result);

        str = "I love Java 8!";
        result = str.matches("I love Java [0-9]!");
        System.out.println(result);

        str = "I love Java 7!";
        result = str.matches("I love Java [0-9]!");
        System.out.println(result);

        result = str.matches("I love .*[ 0-9]!");
        System.out.println(result);

        str = "I love Jython 2.5.4!";
        result = str.matches("I love .*[ 0-9]!");
        System.out.println(result);
    }
}
