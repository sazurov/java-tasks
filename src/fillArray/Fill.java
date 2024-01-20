package fillArray;

import java.text.DecimalFormat;
import java.util.Arrays;

class Solution {
    private int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void fillArray (int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            int rnd = random(1 , 50);
            arr[i] = rnd;
        }
    }

    public void fillArrayWithEvenNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rnd;
            do {
                rnd = random(0, 20);
            } while (rnd % 2 != 0);
            arr[i] = rnd;
        }
    }

    public int findAbsoluteNum(int[] arr, boolean isMax) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (isMax) {
                if (arr[i] > temp) {
                    temp = arr[i];
                }
            } else {
                if (arr[i] < temp) {
                    temp = arr[i];
                }
            }
        }
        return temp;
    }

    public float findAvg(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Array!");
        }
        int sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        return (float) sum / arr.length;
    }
}

public class Fill {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] EvenNumsArr = new int[10];
        Solution solution = new Solution();

        solution.fillArray(array);
        solution.fillArrayWithEvenNums(EvenNumsArr);

        int max = solution.findAbsoluteNum(array, true);
        int min = solution.findAbsoluteNum(array, false);
        float average = solution.findAvg(array);
        String avgRes = new DecimalFormat("#0.00").format(average);

        System.out.printf("\nМаксимальное значение: %d \nМинимальное значение: %d \nСреднее значение: %s", max, min, avgRes);
        System.out.printf("\n" + Arrays.toString(EvenNumsArr));
    }
}
