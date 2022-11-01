public class StripClassExample {
    public static void main(String[] args)
    {
        String nameString = "  Ciao Sara!   ";
        System.out.println( nameString.strip() );
        System.out.println( nameString.stripLeading() );
        System.out.println( nameString.stripTrailing() );

        String nameS = "luciano";
        String repeatStr = nameS.repeat(3);
        System.out.println(repeatStr);

        String one = "1";
        String two = "2";
        int result = Integer.valueOf(one) + Integer.valueOf(two);
        System.out.println(result);

        int result2 = Integer.parseInt(one) + Integer.parseInt(two);
        System.out.println(result2);

        String str = "Break down into chars";
        System.out.println(str);
        for (char chr : str.toCharArray()){
            System.out.println(chr);
        }

        for (int x = 0; x <= str.length()-1; x++){
            System.out.println(str.charAt(x));
        }
    }
}

