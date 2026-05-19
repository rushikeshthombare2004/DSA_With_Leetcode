import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] arr) {

        int n = arr.length;

        String[] res = new String[n];

        int[][] temp = new int[n][2];

        for (int i = 0; i < n; i++) {
            temp[i][0] = arr[i];
            temp[i][1] = i;
        }

        Arrays.sort(temp, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {

            int index = temp[i][1];

            if (i == 0) {
                res[index] = "Gold Medal";
            } 
            else if (i == 1) {
                res[index] = "Silver Medal";
            } 
            else if (i == 2) {
                res[index] = "Bronze Medal";
            } 
            else {
                res[index] = String.valueOf(i + 1);
            }
        }

        return res;
    }
}