import javax.annotation.processing.SupportedSourceVersion;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int nrOfEl = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                for(int k = i; k < nums.length-1; k++) {
                    int temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                }
                nums[nums.length - 1] = 0;
            } else {
                nrOfEl += 1;
            }
        }

        return nrOfEl;
    }

    public static void swapEl(int[] arr, int treshold) {
        for(int k = 1; k < treshold; k++) {
            int temp = arr[k];
            arr[k] = arr[k - 1];
            arr[k - 1] = temp;
        }

        arr[treshold] = 0;

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }


    public static void main(String[] args) {
        int[] a = {2, 1, 2, 2, 3, 2,  1, 2, 5, 2, 2, 4, 2};
        int remove = 2;
        removeElement(a, remove);
    }
}
