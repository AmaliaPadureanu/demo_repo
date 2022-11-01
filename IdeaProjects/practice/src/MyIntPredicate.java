interface IntPredicate {
    boolean test (int n);
}

public class MyIntPredicate {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n/i; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

class MethodRefDemo {
    static boolean numTest (IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main (String[] args)
    {
        boolean result;

        result = numTest(MyIntPredicate::isPrime, 17);
        if (result) System.out.println("17 is prime");

        result = numTest(MyIntPredicate::isEven, 12);
        if (result) System.out.println("12 is even");

        result = numTest(MyIntPredicate::isPositive, 11);
        if (result) System.out.println("11 is positive");
    }
}

class MyIntNum {
    private int v;
    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

class MethodRefDemo2 {
    public  static void main (String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;
        result = ip.test(3);
        if (result) System.out.println("3 is a factor of " + myNum.getNum());

        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}