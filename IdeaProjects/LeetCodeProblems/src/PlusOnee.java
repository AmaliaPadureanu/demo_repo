public class PlusOnee {
    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        if (i >= 0) {
            digits[i]++;
        } else {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0};
        int[] result = plusOne(nums);

        for(int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
    }
}
