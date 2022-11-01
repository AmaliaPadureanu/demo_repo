public class CompareInt {
    public static void compareIntegers() {
        int int1 = 1;
        int int2 = 10;
        int int3 = -5;
        System.out.println(int1 == int2);
        System.out.println(int3 == int1);
        System.out.println(int1 == int1);
        System.out.println(int1 > int3);
        System.out.println(int2 < int3);
    }

    public static void main (String[] args) {
        compareIntegers();


        int int4 = 1;
        int int5 = 10;
        int int6 = -5;
        System.out.println("Compare method -> int6 and int4: " + Integer.compare(int6, int4));
        System.out.println("Compare method -> int5 and int4: " + Integer.compare(int5, int4));
    }
}
