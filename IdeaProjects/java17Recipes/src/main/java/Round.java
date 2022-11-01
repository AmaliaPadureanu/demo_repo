public class Round {
    public static int roundFloatToInt(float myFloat){
        return Math.round(myFloat);
    }
    public static long roundDoubleToLong(double myDouble){
        return Math.round(myDouble);
    }

    public static void main(String[] args){
        Float floatValue =  7.82f;
        Double doubleValue = 9.9d;
        System.out.println(roundFloatToInt(floatValue));
        System.out.println(roundDoubleToLong(doubleValue));
    }
}
