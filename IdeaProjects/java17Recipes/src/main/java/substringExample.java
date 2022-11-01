public class substringExample {

    public static void subStr() {
        String originalString = "This is the original string";
        System.out.println(originalString.substring(0, originalString.length()));
        System.out.println(originalString.substring(5, 20));
        System.out.println(originalString.substring(12));

    }

    public static void main (String[] args){
       /* String one = "one";
        String two = "two";
        String var1 = "one";
        String var2 = "Two";
        String pieceone = "o";
        String piecetwo = "ne";

        if (one.equals(var1)){
            System.out.println ("String one equals var1 using equals");
        }

        if (one.equals(two)){
            System.out.println ("String one equals two using equals");
        }

        if (two.equals(var2)){
            System.out.println ("String two equals var2 using equals");
        }

        if (one == var1){
            System.out.println ("String one equals var1 using ==");
        }

        if (two.equalsIgnoreCase(var2)){
            System.out.println ("String two equals var2 using equalsIgnoreCase");
        }
        String piecedTogether = pieceone + piecetwo;

        if (one.equals(piecedTogether)){
            System.out.println("The strings contain the same value using equals");
        }

        if (one == piecedTogether) {
            System.out.println("The string contain the same value using == ");
        }

        if (one.compareTo(var1) == 0){
            System.out.println("One is equal to var1 using compareTo()");
        }
        if (one.compareToIgnoreCase(var1) == 0){
            System.out.println("One is equal to var1 using compareToIgnoreCase()");
        }*/

        String myString = " This is a String that contains whitespace.   ";
        System.out.println(myString);
        System.out.println(myString.trim());

        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("Luciano Manelli".isBlank());
    }


}
