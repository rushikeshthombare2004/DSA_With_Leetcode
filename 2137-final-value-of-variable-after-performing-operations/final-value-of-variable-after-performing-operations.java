class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int res = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].contains("++")) {
                res++;
            } else {
                res--;
            }
        }

        return res;
    }
}