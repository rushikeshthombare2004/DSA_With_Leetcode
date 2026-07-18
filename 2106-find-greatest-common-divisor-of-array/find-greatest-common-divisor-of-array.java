import java.util.Arrays;

class Solution {
    public int findGCD(int[] arr) {
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        return min;
    }
}