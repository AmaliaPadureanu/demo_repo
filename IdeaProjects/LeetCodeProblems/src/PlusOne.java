public class PlusOne {
    public static int[] plusOne(int[] digits) {

        if(digits.length == 1 && digits[0] == 9) {
            int[] newDigits = {1, 0};

        }


        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        } else {
            for(int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9 && digits.length > 1) {
                    digits[i] = 0;
                } else  {

                }
            }
        }

        for(int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 9};
        plusOne(arr);
    }
}
