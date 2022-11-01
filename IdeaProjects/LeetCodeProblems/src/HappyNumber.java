import java.util.ArrayList;

public class HappyNumber {
    public static boolean isHappy(int n) {
        ArrayList<Integer> arrofSum = new ArrayList<Integer>();

        while (true) {
            int sum  = 0;
            while (n > 0) {
                int digit = n % 10;
                n = n / 10;
                sum += digit * digit;
            }
            n = sum;

            if(sum == 1) {
                return true;
            } else if(arrofSum.contains(sum)) {
                return false;
            } else {
                arrofSum.add(sum);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
