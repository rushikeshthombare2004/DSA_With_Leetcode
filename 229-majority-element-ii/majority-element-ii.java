class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (res.contains(arr[i])) continue;

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 3) {
                res.add(arr[i]);
            }
        }

        return res;
    }
}