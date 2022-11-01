public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        int i = 0;
        int j = number.length() - 1;

        if (number.charAt(i) == '-') {
            return false;
        }

        while (i < j) {
            if (number.charAt(i) == number.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123214));
    }
}

