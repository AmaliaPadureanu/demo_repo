public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        char[] chars = s.toCharArray();

        while (i < s.length() - 1) {
            if (chars[i] == 'I') {
                if (chars[i + 1] == 'V') {
                    sum += 4;
                    i++;
                } else if (chars[i + 1] == 'X') {
                    sum += 9;
                    i++;
                } else {
                    sum += 1;
                }
            } else if (chars[i] == 'V') {
                sum += 5;
            } else if (chars[i] == 'X') {
                if (chars[i + 1] == 'L') {
                    sum += 40;
                    i++;
                } else if (chars[i + 1] == 'C') {
                    sum += 90;
                    i++;
                } else {
                    sum += 10;
                }
            } else if (chars[i] == 'L') {
                sum += 50;
            } else if (chars[i] == 'C') {
                if (chars[i + 1] == 'D') {
                    sum += 400;
                    i++;
                } else if (chars[i + 1] == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += 100;
                }
            } else if (chars[i] == 'D') {
                sum += 500;
            } else if (chars[i] == 'M') {
                sum += 1000;
            }
            i++;
        }

        if (i == chars.length - 1) {
            if (chars[i] == 'I') {
                sum += 1;
            } else if (chars[i] == 'V') {
                sum += 5;
            } else if (chars[i] == 'X') {
                sum += 10;
            } else if (chars[i] == 'L') {
                sum += 50;
            } else if (chars[i] == 'C') {
                sum += 100;
            } else if (chars[i] == 'D') {
                sum += 500;
            } else if (chars[i] == 'M') {
                sum += 1000;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCDLXXVI"));
    }
}
