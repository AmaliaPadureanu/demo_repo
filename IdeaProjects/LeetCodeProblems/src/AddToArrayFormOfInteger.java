import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> finalNum = new ArrayList<>();
        List<Integer> toAdd = new ArrayList<>();

        while (k != 0) {
            int a = k % 10;
            toAdd.add(0, a);
            k = k / 10;
        }

        int arrOne = num.length - 1;
        int arrTwo = toAdd.size() - 1;
        int plus = 0;

        while (arrOne >= 0 && arrTwo >= 0) {
            int result = num[arrOne] + toAdd.get(arrTwo) + plus;
            arrOne--;
            arrTwo--;

            if (result > 9) {
                result = result%10;
                plus = 1;
            } else {
                plus = 0;
            }

            finalNum.add(0, result);
        }

        if(arrOne == -1) {
            while (arrTwo >= 0) {
                int result = toAdd.get(arrTwo) + plus;

                if (result > 9) {
                    result = result%10;
                    plus = 1;
                } else {
                    plus = 0;
                }
                finalNum.add(0, result);
                arrTwo--;

            }
        } else if (arrTwo == -1) {
            while (arrOne >= 0) {
                int result = num[arrOne] + plus;

                if (result > 9) {
                    result = result%10;
                    plus = 1;
                } else {
                    plus = 0;
                }
                finalNum.add(0, result);
                arrOne--;
            }
        }

        if(plus == 1) {
            finalNum.add(0, plus);
        }

        return finalNum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 9};
        int nr = 99;
        System.out.print(addToArrayForm(arr, nr));

    }
}
