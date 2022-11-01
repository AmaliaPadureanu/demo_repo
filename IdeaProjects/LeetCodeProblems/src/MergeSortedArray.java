public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for(int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                if (j == m && nums1[j - 1] < nums2[i]) {
                    nums1[m] = nums2[i];
                    m++;
                    break;
                }

                if (j > 0 && nums1[j - 1] > nums2[i]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                } else {
                    nums1[j] = nums2[i];
                    m++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] s = {1, 2, 3, 0, 0, 0}; // 1, 2, 2, 3, 5, 6
        int[] t = {2, 5, 6};
        int a = 3;
        int b = 3;


        MergeSortedArray.merge(s, a, t, b);

        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

    }
}
