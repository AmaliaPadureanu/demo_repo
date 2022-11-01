public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null) {
            return "";
        }

        if (strs.length == 1) {
            String singleVal = strs[0];
            return singleVal;
        }

        String A = strs[0];
        String B = strs[1];
        String result = "";
        String resultTemp = "";
        int min = 0;

        if (A.compareTo(B) < 0) {
            min = A.length();
        } else if (A.compareTo(B) > 0) {
            min = B.length();
        } else {
            min = A.length();
        }

        for (int i = 0; i < min; i++ ) {
            if (A.charAt(i) == B.charAt(i)) {
                result += A.charAt(i);
            } else break;
        }

       for (int i = 2; i < strs.length; i++) {
           if (strs[i].compareTo(result) < 0) {
               min = strs[i].length();
           } else if (strs[i].compareTo(result) > 0) {
               min = result.length();
           } else {
               min = result.length();
           }
            for (int j = 0; j < min; j++) {
                if (strs[i].charAt(j) == result.charAt(j)) {
                    resultTemp += strs[i].charAt(j);
                } else break;
            }
            result = resultTemp;
            resultTemp = "";
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strArr = new String[] {"flower", "flow", "fl"};
        System.out.println(longestCommonPrefix(strArr));

    }
}
